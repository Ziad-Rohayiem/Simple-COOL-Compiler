// Generated from cool_syntax.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cool_syntaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cool_syntaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code start}
	 * labeled alternative in {@link cool_syntaxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(cool_syntaxParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link cool_syntaxParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(cool_syntaxParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link cool_syntaxParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(cool_syntaxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link cool_syntaxParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(cool_syntaxParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link cool_syntaxParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(cool_syntaxParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectcall}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectcall(cool_syntaxParser.ObjectcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(cool_syntaxParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(cool_syntaxParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lq}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLq(cool_syntaxParser.LqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(cool_syntaxParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(cool_syntaxParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(cool_syntaxParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(cool_syntaxParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(cool_syntaxParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(cool_syntaxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(cool_syntaxParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newobject}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewobject(cool_syntaxParser.NewobjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(cool_syntaxParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(cool_syntaxParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(cool_syntaxParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(cool_syntaxParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(cool_syntaxParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(cool_syntaxParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid(cool_syntaxParser.VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvert(cool_syntaxParser.InvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(cool_syntaxParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(cool_syntaxParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(cool_syntaxParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(cool_syntaxParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticcall}
	 * labeled alternative in {@link cool_syntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticcall(cool_syntaxParser.StaticcallContext ctx);
}