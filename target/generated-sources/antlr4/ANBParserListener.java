// Generated from ANBParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANBParser}.
 */
public interface ANBParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANBParser#anbDocument}.
	 * @param ctx the parse tree
	 */
	void enterAnbDocument(ANBParser.AnbDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#anbDocument}.
	 * @param ctx the parse tree
	 */
	void exitAnbDocument(ANBParser.AnbDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#protocolType}.
	 * @param ctx the parse tree
	 */
	void enterProtocolType(ANBParser.ProtocolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#protocolType}.
	 * @param ctx the parse tree
	 */
	void exitProtocolType(ANBParser.ProtocolTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(ANBParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(ANBParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#typeFuntions}.
	 * @param ctx the parse tree
	 */
	void enterTypeFuntions(ANBParser.TypeFuntionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#typeFuntions}.
	 * @param ctx the parse tree
	 */
	void exitTypeFuntions(ANBParser.TypeFuntionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#knowledge}.
	 * @param ctx the parse tree
	 */
	void enterKnowledge(ANBParser.KnowledgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#knowledge}.
	 * @param ctx the parse tree
	 */
	void exitKnowledge(ANBParser.KnowledgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#know}.
	 * @param ctx the parse tree
	 */
	void enterKnow(ANBParser.KnowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#know}.
	 * @param ctx the parse tree
	 */
	void exitKnow(ANBParser.KnowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(ANBParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(ANBParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ANBParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ANBParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANBParser#goals}.
	 * @param ctx the parse tree
	 */
	void enterGoals(ANBParser.GoalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANBParser#goals}.
	 * @param ctx the parse tree
	 */
	void exitGoals(ANBParser.GoalsContext ctx);
}