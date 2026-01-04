// Generated from /home/ziad/Desktop/Study/8th Semester/Compilers/PA2_120200078/cool_syntax.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cool_syntaxParser}.
 */
public interface cool_syntaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code start}
	 * labeled alternative in {@link cool_syntaxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterStart(cool_syntaxParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start}
	 * labeled alternative in {@link cool_syntaxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitStart(cool_syntaxParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link cool_syntaxParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(cool_syntaxParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link cool_syntaxParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(cool_syntaxParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link cool_syntaxParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFunction(cool_syntaxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link cool_syntaxParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFunction(cool_syntaxParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link cool_syntaxParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterVariable(cool_syntaxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link cool_syntaxParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitVariable(cool_syntaxParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link cool_syntaxParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterParameter(cool_syntaxParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link cool_syntaxParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitParameter(cool_syntaxParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectcall}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectcall(cool_syntaxParser.ObjectcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectcall}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectcall(cool_syntaxParser.ObjectcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(cool_syntaxParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(cool_syntaxParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(cool_syntaxParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(cool_syntaxParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lq}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLq(cool_syntaxParser.LqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lq}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLq(cool_syntaxParser.LqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(cool_syntaxParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(cool_syntaxParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLt(cool_syntaxParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLt(cool_syntaxParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(cool_syntaxParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(cool_syntaxParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(cool_syntaxParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(cool_syntaxParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(cool_syntaxParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(cool_syntaxParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(cool_syntaxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(cool_syntaxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(cool_syntaxParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(cool_syntaxParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newobject}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewobject(cool_syntaxParser.NewobjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newobject}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewobject(cool_syntaxParser.NewobjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(cool_syntaxParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(cool_syntaxParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterText(cool_syntaxParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitText(cool_syntaxParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(cool_syntaxParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(cool_syntaxParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase(cool_syntaxParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase(cool_syntaxParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(cool_syntaxParser.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(cool_syntaxParser.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(cool_syntaxParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(cool_syntaxParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVoid(cool_syntaxParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVoid(cool_syntaxParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invert}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvert(cool_syntaxParser.InvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvert(cool_syntaxParser.InvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(cool_syntaxParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(cool_syntaxParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEq(cool_syntaxParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEq(cool_syntaxParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(cool_syntaxParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(cool_syntaxParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(cool_syntaxParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(cool_syntaxParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticcall}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStaticcall(cool_syntaxParser.StaticcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticcall}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStaticcall(cool_syntaxParser.StaticcallContext ctx);
}