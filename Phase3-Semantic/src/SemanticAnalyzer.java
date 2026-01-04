import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

public class SemanticAnalyzer {
    private ClassTable classTable;

    public SemanticAnalyzer() {
        this.classTable = new ClassTable();
    }

    public void analyze(ParseTree tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        
        // Pass 1: Collect Classes
        ClassCollector collector = new ClassCollector(classTable);
        walker.walk(collector, tree);
        
        // Validate inheritance
        if (!classTable.validate()) {
            System.err.println("Compilation halted due to static semantic errors.");
            System.exit(1);
        }

        System.out.println("Semantic analysis phase 1 (Class Hierarchy) parsing complete.");
        // Future passes: Type Checking
    }
}

class ClassCollector extends cool_syntaxBaseListener {
    private ClassTable classTable;

    public ClassCollector(ClassTable ct) {
        this.classTable = ct;
    }

    @Override
    public void enterClassdef(cool_syntaxParser.ClassdefContext ctx) {
        String className = ctx.TYPE_IDENTIFIER(0).getText();
        String parentName = "Object";
        
        if (ctx.INHERITS() != null) {
            parentName = ctx.TYPE_IDENTIFIER(1).getText();
        }
        
        classTable.addClass(className, parentName);
    }
}
