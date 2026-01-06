import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class TypeChecker extends cool_syntaxBaseVisitor<String> {
    private ClassTable classTable;
    private SymbolTable symbolTable;
    private ParseTreeProperty<String> types;
    private String currentClass;
    private boolean hasErrors = false;

    public TypeChecker(ClassTable classTable) {
        this.classTable = classTable;
        this.symbolTable = new SymbolTable();
        this.types = new ParseTreeProperty<>();
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    private void reportError(String message) {
        System.err.println("Type Error: " + message);
        hasErrors = true;
    }

    @Override
    public String visitStart(cool_syntaxParser.StartContext ctx) {
        for (cool_syntaxParser.ClassContext classCtx : ctx.class_()) {
            visit(classCtx);
        }
        return null;
    }

    @Override
    public String visitClassdef(cool_syntaxParser.ClassdefContext ctx) {
        currentClass = ctx.TYPE_IDENTIFIER(0).getText();
        
        symbolTable.enterScope();
        symbolTable.add("self", "SELF_TYPE");
        
        // Pass 1: Register all features (attributes and method signatures)
        for (cool_syntaxParser.FeatureContext feature : ctx.feature()) {
            if (feature instanceof cool_syntaxParser.FunctionContext) {
                cool_syntaxParser.FunctionContext f = (cool_syntaxParser.FunctionContext) feature;
                String methodName = f.OBJECT_IDENTIFIER().getText();
                String returnType = f.TYPE_IDENTIFIER().getText();
                List<String> sig = new ArrayList<>();
                for (cool_syntaxParser.FormalContext formal : f.formal()) {
                    sig.add(((cool_syntaxParser.ParameterContext)formal).TYPE_IDENTIFIER().getText());
                }
                sig.add(returnType);
                classTable.getClass(currentClass).addMethod(methodName, sig);
            } else if (feature instanceof cool_syntaxParser.VariableContext) {
                cool_syntaxParser.VariableContext v = (cool_syntaxParser.VariableContext) feature;
                classTable.getClass(currentClass).addAttribute(v.OBJECT_IDENTIFIER().getText(), v.TYPE_IDENTIFIER().getText());
            }
        }

        // Pass 2: Type check method bodies
        for (cool_syntaxParser.FeatureContext feature : ctx.feature()) {
            visit(feature);
        }
        
        symbolTable.exitScope();
        return null;
    }

    @Override
    public String visitFunction(cool_syntaxParser.FunctionContext ctx) {
        String methodName = ctx.OBJECT_IDENTIFIER().getText();
        String returnType = ctx.TYPE_IDENTIFIER().getText();
        
        if (!returnType.equals("SELF_TYPE") && !classTable.isDefined(returnType)) {
            reportError("Method " + methodName + " has undefined return type " + returnType);
        }
        
        symbolTable.enterScope();
        
        List<String> paramTypes = new ArrayList<>();
        for (cool_syntaxParser.FormalContext formalCtx : ctx.formal()) {
            cool_syntaxParser.ParameterContext formal = (cool_syntaxParser.ParameterContext) formalCtx;
            String paramName = formal.OBJECT_IDENTIFIER().getText();
            String paramType = formal.TYPE_IDENTIFIER().getText();
            
            if (paramName.equals("self")) {
                reportError("Method parameter cannot be named 'self'");
            }
            
            if (!classTable.isDefined(paramType)) {
                reportError("Parameter " + paramName + " has undefined type " + paramType);
            }
            
            if (!symbolTable.add(paramName, paramType)) {
                reportError("Duplicate parameter name " + paramName + " in method " + methodName);
            }
            paramTypes.add(paramType);
        }
        
        List<String> signature = new ArrayList<>(paramTypes);
        signature.add(returnType);
        classTable.getClass(currentClass).addMethod(methodName, signature);
        
        String bodyType = visit(ctx.expr());
        
        String expectedReturn = returnType.equals("SELF_TYPE") ? currentClass : returnType;
        if (!classTable.conforms(bodyType, expectedReturn)) {
            reportError("Method " + methodName + " body type " + bodyType + 
                       " does not conform to declared return type " + returnType);
        }
        
        symbolTable.exitScope();
        return null;
    }

    @Override
    public String visitVariable(cool_syntaxParser.VariableContext ctx) {
        String attrName = ctx.OBJECT_IDENTIFIER().getText();
        String attrType = ctx.TYPE_IDENTIFIER().getText();
        
        if (attrName.equals("self")) {
            reportError("Attribute cannot be named 'self'");
        }
        
        if (!classTable.isDefined(attrType)) {
            reportError("Attribute " + attrName + " has undefined type " + attrType);
        }
        
        classTable.getClass(currentClass).addAttribute(attrName, attrType);
        symbolTable.add(attrName, attrType);
        
        if (ctx.expr() != null) {
            String initType = visit(ctx.expr());
            if (!classTable.conforms(initType, attrType)) {
                reportError("Attribute " + attrName + " initializer type " + initType + 
                           " does not conform to declared type " + attrType);
            }
        }
        
        return null;
    }

    @Override
    public String visitLet(cool_syntaxParser.LetContext ctx) {
        symbolTable.enterScope();
        
        for (cool_syntaxParser.Let_bindingContext binding : ctx.let_binding()) {
            String varName = binding.OBJECT_IDENTIFIER().getText();
            String varType = binding.TYPE_IDENTIFIER().getText();
            
            if (varName.equals("self")) {
                reportError("Cannot bind 'self' in let");
            }
            
            if (!classTable.isDefined(varType)) {
                reportError("Let variable " + varName + " has undefined type " + varType);
            }
            
            if (binding.expr() != null) {
                String initType = visit(binding.expr());
                if (!classTable.conforms(initType, varType)) {
                    reportError("Let variable " + varName + " initializer " + initType + 
                               " does not conform to " + varType);
                }
            }
            
            symbolTable.add(varName, varType);
        }
        
        String bodyType = visit(ctx.expr());
        
        symbolTable.exitScope();
        types.put(ctx, bodyType);
        return bodyType;
    }

    @Override
    public String visitAssign(cool_syntaxParser.AssignContext ctx) {
        String id = ctx.OBJECT_IDENTIFIER().getText();
        
        if (id.equals("self")) {
            reportError("Cannot assign to 'self'");
            return "Object";
        }
        
        String idType = symbolTable.lookup(id);
        if (idType == null) {
            reportError("Undefined identifier " + id);
            return "Object";
        }
        
        String exprType = visit(ctx.expr());
        
        if (!classTable.conforms(exprType, idType)) {
            reportError("Assignment type " + exprType + " does not conform to " + idType);
        }
        
        types.put(ctx, exprType);
        return exprType;
    }

    @Override
    public String visitId(cool_syntaxParser.IdContext ctx) {
        String id = ctx.OBJECT_IDENTIFIER().getText();
        String type = symbolTable.lookup(id);
        
        if (type == null) {
            reportError("Undefined identifier " + id);
            return "Object";
        }
        
        types.put(ctx, type);
        return type;
    }

    @Override
    public String visitNum(cool_syntaxParser.NumContext ctx) {
        types.put(ctx, "Int");
        return "Int";
    }

    @Override
    public String visitText(cool_syntaxParser.TextContext ctx) {
        types.put(ctx, "String");
        return "String";
    }

    @Override
    public String visitTrue(cool_syntaxParser.TrueContext ctx) {
        types.put(ctx, "Bool");
        return "Bool";
    }

    @Override
    public String visitFalse(cool_syntaxParser.FalseContext ctx) {
        types.put(ctx, "Bool");
        return "Bool";
    }

    @Override
    public String visitAdd(cool_syntaxParser.AddContext ctx) {
        return checkArithmeticOp(ctx, ctx.expr(0), ctx.expr(1), "+");
    }

    @Override
    public String visitSub(cool_syntaxParser.SubContext ctx) {
        return checkArithmeticOp(ctx, ctx.expr(0), ctx.expr(1), "-");
    }

    @Override
    public String visitMul(cool_syntaxParser.MulContext ctx) {
        return checkArithmeticOp(ctx, ctx.expr(0), ctx.expr(1), "*");
    }

    @Override
    public String visitDiv(cool_syntaxParser.DivContext ctx) {
        return checkArithmeticOp(ctx, ctx.expr(0), ctx.expr(1), "/");
    }

    private String checkArithmeticOp(cool_syntaxParser.ExprContext ctx, 
                                     cool_syntaxParser.ExprContext e1, 
                                     cool_syntaxParser.ExprContext e2, 
                                     String op) {
        String t1 = visit(e1);
        String t2 = visit(e2);
        
        if (!t1.equals("Int")) {
            reportError("Arithmetic operator " + op + " expects Int, got " + t1);
        }
        if (!t2.equals("Int")) {
            reportError("Arithmetic operator " + op + " expects Int, got " + t2);
        }
        
        types.put(ctx, "Int");
        return "Int";
    }

    @Override
    public String visitLt(cool_syntaxParser.LtContext ctx) {
        return checkComparisonOp(ctx, ctx.expr(0), ctx.expr(1), "<");
    }

    @Override
    public String visitLq(cool_syntaxParser.LqContext ctx) {
        return checkComparisonOp(ctx, ctx.expr(0), ctx.expr(1), "<=");
    }

    private String checkComparisonOp(cool_syntaxParser.ExprContext ctx,
                                      cool_syntaxParser.ExprContext e1,
                                      cool_syntaxParser.ExprContext e2,
                                      String op) {
        String t1 = visit(e1);
        String t2 = visit(e2);
        
        if (!t1.equals("Int")) {
            reportError("Comparison operator " + op + " expects Int, got " + t1);
        }
        if (!t2.equals("Int")) {
            reportError("Comparison operator " + op + " expects Int, got " + t2);
        }
        
        types.put(ctx, "Bool");
        return "Bool";
    }

    @Override
    public String visitEq(cool_syntaxParser.EqContext ctx) {
        String t1 = visit(ctx.expr(0));
        String t2 = visit(ctx.expr(1));
        
        if ((t1.equals("Int") || t1.equals("String") || t1.equals("Bool")) &&
            !t1.equals(t2)) {
            reportError("Cannot compare " + t1 + " with " + t2);
        }
        
        types.put(ctx, "Bool");
        return "Bool";
    }

    @Override
    public String visitInvert(cool_syntaxParser.InvertContext ctx) {
        String t = visit(ctx.expr());
        if (!t.equals("Int")) {
            reportError("Unary ~ expects Int, got " + t);
        }
        types.put(ctx, "Int");
        return "Int";
    }

    @Override
    public String visitNot(cool_syntaxParser.NotContext ctx) {
        String t = visit(ctx.expr());
        if (!t.equals("Bool")) {
            reportError("NOT expects Bool, got " + t);
        }
        types.put(ctx, "Bool");
        return "Bool";
    }

    @Override
    public String visitNewobject(cool_syntaxParser.NewobjectContext ctx) {
        String type = ctx.TYPE_IDENTIFIER().getText();
        
        if (!type.equals("SELF_TYPE") && !classTable.isDefined(type)) {
            reportError("'new' used with undefined type " + type);
            return "Object";
        }
        
        types.put(ctx, type);
        return type;
    }

    @Override
    public String visitVoid(cool_syntaxParser.VoidContext ctx) {
        visit(ctx.expr());
        types.put(ctx, "Bool");
        return "Bool";
    }

    @Override
    public String visitIf(cool_syntaxParser.IfContext ctx) {
        String predType = visit(ctx.expr(0));
        
        if (!predType.equals("Bool")) {
            reportError("If predicate must be Bool, got " + predType);
        }
        
        String thenType = visit(ctx.expr(1));
        String elseType = visit(ctx.expr(2));
        
        String resultType = classTable.lub(thenType, elseType);
        types.put(ctx, resultType);
        return resultType;
    }

    @Override
    public String visitWhile(cool_syntaxParser.WhileContext ctx) {
        String predType = visit(ctx.expr(0));
        
        if (!predType.equals("Bool")) {
            reportError("While predicate must be Bool, got " + predType);
        }
        
        visit(ctx.expr(1));
        types.put(ctx, "Object");
        return "Object";
    }

    @Override
    public String visitBlock(cool_syntaxParser.BlockContext ctx) {
        String lastType = "Object";
        for (cool_syntaxParser.ExprContext expr : ctx.expr()) {
            lastType = visit(expr);
        }
        types.put(ctx, lastType);
        return lastType;
    }

    @Override
    public String visitCase(cool_syntaxParser.CaseContext ctx) {
        String exprType = visit(ctx.expr(0));
        
        List<TerminalNode> ids = ctx.OBJECT_IDENTIFIER();
        List<TerminalNode> typeIds = ctx.TYPE_IDENTIFIER();
        List<cool_syntaxParser.ExprContext> exprs = ctx.expr();
        
        String resultType = null;
        Set<String> seenTypes = new HashSet<>();
        
        for (int i = 0; i < ids.size(); i++) {
            String varName = ids.get(i).getText();
            String varType = typeIds.get(i).getText();
            
            if (seenTypes.contains(varType)) {
                reportError("Duplicate branch type " + varType + " in case");
            }
            seenTypes.add(varType);
            
            if (!classTable.isDefined(varType)) {
                reportError("Case branch has undefined type " + varType);
            }
            
            symbolTable.enterScope();
            symbolTable.add(varName, varType);
            
            String branchType = visit(exprs.get(i + 1));
            
            if (resultType == null) {
                resultType = branchType;
            } else {
                resultType = classTable.lub(resultType, branchType);
            }
            
            symbolTable.exitScope();
        }
        
        types.put(ctx, resultType != null ? resultType : "Object");
        return resultType != null ? resultType : "Object";
    }

    @Override
    public String visitParexpr(cool_syntaxParser.ParexprContext ctx) {
        String type = visit(ctx.expr());
        types.put(ctx, type);
        return type;
    }

    @Override
    public String visitStaticcall(cool_syntaxParser.StaticcallContext ctx) {
        String methodName = ctx.OBJECT_IDENTIFIER().getText();
        
        ClassNode classNode = classTable.getClass(currentClass);
        List<String> signature = classTable.getMethodSignature(currentClass, methodName);
        
        if (signature == null) {
            reportError("Undefined method " + methodName);
            return "Object";
        }
        
        List<cool_syntaxParser.ExprContext> args = ctx.expr();
        if (args.size() != signature.size() - 1) {
            reportError("Method " + methodName + " expects " + (signature.size() - 1) + 
                       " arguments, got " + args.size());
        }
        
        for (int i = 0; i < Math.min(args.size(), signature.size() - 1); i++) {
            String argType = visit(args.get(i));
            if (!classTable.conforms(argType, signature.get(i))) {
                reportError("Argument " + (i + 1) + " type " + argType + 
                           " does not conform to " + signature.get(i));
            }
        }
        
        String returnType = signature.get(signature.size() - 1);
        types.put(ctx, returnType);
        return returnType;
    }

    @Override
    public String visitObjectcall(cool_syntaxParser.ObjectcallContext ctx) {
        String objType = visit(ctx.expr(0));
        String methodName = ctx.OBJECT_IDENTIFIER().getText();
        
        if (ctx.TYPE_IDENTIFIER() != null) {
            String staticType = ctx.TYPE_IDENTIFIER().getText();
            if (!classTable.conforms(objType, staticType)) {
                reportError("Static dispatch type " + staticType + 
                           " is not a parent of " + objType);
            }
            objType = staticType;
        }
        
        ClassNode classNode = classTable.getClass(objType);
        if (classNode == null) {
            reportError("Method call on undefined type " + objType);
            return "Object";
        }
        
        List<String> signature = classTable.getMethodSignature(objType, methodName);
        if (signature == null) {
            reportError("Undefined method " + methodName + " in class " + objType);
            return "Object";
        }
        
        List<cool_syntaxParser.ExprContext> args = ctx.expr();
        args = args.subList(1, args.size());
        
        if (args.size() != signature.size() - 1) {
            reportError("Method " + methodName + " expects " + (signature.size() - 1) + 
                       " arguments, got " + args.size());
        }
        
        for (int i = 0; i < Math.min(args.size(), signature.size() - 1); i++) {
            String argType = visit(args.get(i));
            if (!classTable.conforms(argType, signature.get(i))) {
                reportError("Argument " + (i + 1) + " type " + argType + 
                           " does not conform to " + signature.get(i));
            }
        }
        
        String returnType = signature.get(signature.size() - 1);
        types.put(ctx, returnType);
        return returnType;
    }
}
