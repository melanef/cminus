// Generated from /Users/lmanrique/Dropbox/compiladores/Cminus/src/antlr4/asm.g4 by ANTLR 4.2.2
package me.tomassetti.pythonast.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asmParser}.
 */
public interface asmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asmParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull asmParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull asmParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull asmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull asmParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull asmParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull asmParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(@NotNull asmParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(@NotNull asmParser.ExpressionlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull asmParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull asmParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerdirective(@NotNull asmParser.AssemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerdirective(@NotNull asmParser.AssemblerdirectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull asmParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull asmParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(@NotNull asmParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(@NotNull asmParser.OpcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull asmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull asmParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(@NotNull asmParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(@NotNull asmParser.DirectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(@NotNull asmParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(@NotNull asmParser.MultiplyingExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#dollar}.
	 * @param ctx the parse tree
	 */
	void enterDollar(@NotNull asmParser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#dollar}.
	 * @param ctx the parse tree
	 */
	void exitDollar(@NotNull asmParser.DollarContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull asmParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull asmParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#register_}.
	 * @param ctx the parse tree
	 */
	void enterRegister_(@NotNull asmParser.Register_Context ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#register_}.
	 * @param ctx the parse tree
	 */
	void exitRegister_(@NotNull asmParser.Register_Context ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull asmParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull asmParser.InstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(@NotNull asmParser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(@NotNull asmParser.LblContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull asmParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull asmParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link asmParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull asmParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull asmParser.CommentContext ctx);
}