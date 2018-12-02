// Generated from /Users/lmanrique/Dropbox/compiladores/Cminus/src/antlr4/asm.g4 by ANTLR 4.2.2
package me.tomassetti.pythonast.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link asmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface asmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link asmParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull asmParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull asmParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull asmParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionlist(@NotNull asmParser.ExpressionlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull asmParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#assemblerdirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerdirective(@NotNull asmParser.AssemblerdirectiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull asmParser.LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcode(@NotNull asmParser.OpcodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull asmParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(@NotNull asmParser.DirectiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(@NotNull asmParser.MultiplyingExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#dollar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollar(@NotNull asmParser.DollarContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull asmParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#register_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_(@NotNull asmParser.Register_Context ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(@NotNull asmParser.InstructionContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#lbl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbl(@NotNull asmParser.LblContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull asmParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link asmParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull asmParser.CommentContext ctx);
}