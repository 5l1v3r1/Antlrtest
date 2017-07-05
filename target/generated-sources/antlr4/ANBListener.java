// Generated from ANB.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANBParser}.
 */
public interface ANBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Knowlegde}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Knowlegde(@NotNull ANBParser.Anb_KnowlegdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Knowlegde}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Knowlegde(@NotNull ANBParser.Anb_KnowlegdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_know}.
	 * @param ctx the parse tree
	 */
	void enterAnb_know(@NotNull ANBParser.Anb_knowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_know}.
	 * @param ctx the parse tree
	 */
	void exitAnb_know(@NotNull ANBParser.Anb_knowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Actions}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Actions(@NotNull ANBParser.Anb_ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Actions}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Actions(@NotNull ANBParser.Anb_ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Action}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Action(@NotNull ANBParser.Anb_ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Action}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Action(@NotNull ANBParser.Anb_ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_SubAction}.
	 * @param ctx the parse tree
	 */
	void enterAnb_SubAction(@NotNull ANBParser.Anb_SubActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_SubAction}.
	 * @param ctx the parse tree
	 */
	void exitAnb_SubAction(@NotNull ANBParser.Anb_SubActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_ProtocolName}.
	 * @param ctx the parse tree
	 */
	void enterAnb_ProtocolName(@NotNull ANBParser.Anb_ProtocolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_ProtocolName}.
	 * @param ctx the parse tree
	 */
	void exitAnb_ProtocolName(@NotNull ANBParser.Anb_ProtocolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Protocol}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Protocol(@NotNull ANBParser.Anb_ProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Protocol}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Protocol(@NotNull ANBParser.Anb_ProtocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Types}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Types(@NotNull ANBParser.Anb_TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Types}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Types(@NotNull ANBParser.Anb_TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Type}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Type(@NotNull ANBParser.Anb_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Type}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Type(@NotNull ANBParser.Anb_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Goal}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Goal(@NotNull ANBParser.Anb_GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Goal}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Goal(@NotNull ANBParser.Anb_GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#anb_Goals}.
	 * @param ctx the parse tree
	 */
	void enterAnb_Goals(@NotNull ANBParser.Anb_GoalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anb_Goals}.
	 * @param ctx the parse tree
	 */
	void exitAnb_Goals(@NotNull ANBParser.Anb_GoalsContext ctx);
}