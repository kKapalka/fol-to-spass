package fol_to_spass;

// Generated from Fol.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FolParser}.
 */
public interface FolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FolParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FolParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FolParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(FolParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(FolParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FolParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FolParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void enterBin_connective(FolParser.Bin_connectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void exitBin_connective(FolParser.Bin_connectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FolParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FolParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#pred_constant}.
	 * @param ctx the parse tree
	 */
	void enterPred_constant(FolParser.Pred_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#pred_constant}.
	 * @param ctx the parse tree
	 */
	void exitPred_constant(FolParser.Pred_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#ind_constant}.
	 * @param ctx the parse tree
	 */
	void enterInd_constant(FolParser.Ind_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#ind_constant}.
	 * @param ctx the parse tree
	 */
	void exitInd_constant(FolParser.Ind_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#func_constant}.
	 * @param ctx the parse tree
	 */
	void enterFunc_constant(FolParser.Func_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#func_constant}.
	 * @param ctx the parse tree
	 */
	void exitFunc_constant(FolParser.Func_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(FolParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(FolParser.SeparatorContext ctx);
}