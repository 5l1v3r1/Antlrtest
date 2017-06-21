// Generated from ANB.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ANB_Identifier=11, ANB_COMMENT=12, WS=13, ANB_KNOW=14, ANB_KNOW_FUNCTION=15, 
		ANB_CHANNEL=16;
	public static final int
		RULE_anb_Protocol = 0, RULE_anb_ProtocolName = 1, RULE_anb_Types = 2, 
		RULE_anb_Type = 3, RULE_anb_Knowlegde = 4, RULE_anb_know = 5, RULE_anb_Actions = 6, 
		RULE_anb_Action = 7, RULE_anb_SubAction = 8, RULE_anb_Goals = 9;
	public static final String[] ruleNames = {
		"anb_Protocol", "anb_ProtocolName", "anb_Types", "anb_Type", "anb_Knowlegde", 
		"anb_know", "anb_Actions", "anb_Action", "anb_SubAction", "anb_Goals"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "':'", "'Types'", "';'", "'Knowledge'", "'Actions'", 
		"'{'", "'}'", "'|'", "'Goals'", null, null, null, null, null, "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ANB_Identifier", 
		"ANB_COMMENT", "WS", "ANB_KNOW", "ANB_KNOW_FUNCTION", "ANB_CHANNEL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ANB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Anb_ProtocolContext extends ParserRuleContext {
		public Anb_ProtocolNameContext anb_ProtocolName() {
			return getRuleContext(Anb_ProtocolNameContext.class,0);
		}
		public Anb_TypesContext anb_Types() {
			return getRuleContext(Anb_TypesContext.class,0);
		}
		public Anb_KnowlegdeContext anb_Knowlegde() {
			return getRuleContext(Anb_KnowlegdeContext.class,0);
		}
		public Anb_ActionsContext anb_Actions() {
			return getRuleContext(Anb_ActionsContext.class,0);
		}
		public Anb_ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Protocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Protocol(this);
		}
	}

	public final Anb_ProtocolContext anb_Protocol() throws RecognitionException {
		Anb_ProtocolContext _localctx = new Anb_ProtocolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_anb_Protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			anb_ProtocolName();
			setState(21);
			anb_Types();
			setState(22);
			anb_Knowlegde();
			setState(23);
			anb_Actions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_ProtocolNameContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public Anb_ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_ProtocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_ProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_ProtocolName(this);
		}
	}

	public final Anb_ProtocolNameContext anb_ProtocolName() throws RecognitionException {
		Anb_ProtocolNameContext _localctx = new Anb_ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anb_ProtocolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__0);
			setState(26);
			match(T__1);
			setState(27);
			match(ANB_Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_TypesContext extends ParserRuleContext {
		public List<Anb_TypeContext> anb_Type() {
			return getRuleContexts(Anb_TypeContext.class);
		}
		public Anb_TypeContext anb_Type(int i) {
			return getRuleContext(Anb_TypeContext.class,i);
		}
		public Anb_TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Types(this);
		}
	}

	public final Anb_TypesContext anb_Types() throws RecognitionException {
		Anb_TypesContext _localctx = new Anb_TypesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anb_Types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__2);
			setState(30);
			match(T__1);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(31);
					anb_Type();
					setState(32);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(34);
					anb_Type();
					}
					break;
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANB_Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_TypeContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public TerminalNode ANB_KNOW() { return getToken(ANBParser.ANB_KNOW, 0); }
		public Anb_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Type(this);
		}
	}

	public final Anb_TypeContext anb_Type() throws RecognitionException {
		Anb_TypeContext _localctx = new Anb_TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anb_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ANB_Identifier);
			setState(40);
			match(ANB_KNOW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_KnowlegdeContext extends ParserRuleContext {
		public List<Anb_knowContext> anb_know() {
			return getRuleContexts(Anb_knowContext.class);
		}
		public Anb_knowContext anb_know(int i) {
			return getRuleContext(Anb_knowContext.class,i);
		}
		public Anb_KnowlegdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Knowlegde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Knowlegde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Knowlegde(this);
		}
	}

	public final Anb_KnowlegdeContext anb_Knowlegde() throws RecognitionException {
		Anb_KnowlegdeContext _localctx = new Anb_KnowlegdeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anb_Knowlegde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__4);
			setState(43);
			match(T__1);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(44);
					anb_know();
					setState(45);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(47);
					anb_know();
					}
					break;
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANB_Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_knowContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public TerminalNode ANB_KNOW() { return getToken(ANBParser.ANB_KNOW, 0); }
		public Anb_knowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_know; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_know(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_know(this);
		}
	}

	public final Anb_knowContext anb_know() throws RecognitionException {
		Anb_knowContext _localctx = new Anb_knowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_anb_know);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ANB_Identifier);
			setState(53);
			match(T__1);
			setState(54);
			match(ANB_KNOW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_ActionsContext extends ParserRuleContext {
		public List<Anb_ActionContext> anb_Action() {
			return getRuleContexts(Anb_ActionContext.class);
		}
		public Anb_ActionContext anb_Action(int i) {
			return getRuleContext(Anb_ActionContext.class,i);
		}
		public Anb_ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Actions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Actions(this);
		}
	}

	public final Anb_ActionsContext anb_Actions() throws RecognitionException {
		Anb_ActionsContext _localctx = new Anb_ActionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_anb_Actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__5);
			setState(57);
			match(T__1);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				anb_Action();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANB_Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_ActionContext extends ParserRuleContext {
		public List<TerminalNode> ANB_Identifier() { return getTokens(ANBParser.ANB_Identifier); }
		public TerminalNode ANB_Identifier(int i) {
			return getToken(ANBParser.ANB_Identifier, i);
		}
		public TerminalNode ANB_CHANNEL() { return getToken(ANBParser.ANB_CHANNEL, 0); }
		public List<Anb_SubActionContext> anb_SubAction() {
			return getRuleContexts(Anb_SubActionContext.class);
		}
		public Anb_SubActionContext anb_SubAction(int i) {
			return getRuleContext(Anb_SubActionContext.class,i);
		}
		public Anb_ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Action(this);
		}
	}

	public final Anb_ActionContext anb_Action() throws RecognitionException {
		Anb_ActionContext _localctx = new Anb_ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_anb_Action);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ANB_Identifier);
			setState(64);
			match(ANB_CHANNEL);
			setState(65);
			match(ANB_Identifier);
			setState(66);
			match(T__1);
			setState(68); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(67);
					anb_SubAction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_SubActionContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public List<TerminalNode> ANB_KNOW() { return getTokens(ANBParser.ANB_KNOW); }
		public TerminalNode ANB_KNOW(int i) {
			return getToken(ANBParser.ANB_KNOW, i);
		}
		public Anb_SubActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_SubAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_SubAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_SubAction(this);
		}
	}

	public final Anb_SubActionContext anb_SubAction() throws RecognitionException {
		Anb_SubActionContext _localctx = new Anb_SubActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anb_SubAction);
		try {
			int _alt;
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(ANB_Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(ANB_KNOW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__6);
				setState(75);
				match(ANB_KNOW);
				setState(76);
				match(T__7);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						match(ANB_KNOW);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(T__6);
				setState(84);
				match(T__8);
				setState(85);
				match(ANB_KNOW);
				setState(86);
				match(T__8);
				setState(87);
				match(T__7);
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						match(ANB_KNOW);
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anb_GoalsContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public Anb_GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Goals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Goals(this);
		}
	}

	public final Anb_GoalsContext anb_Goals() throws RecognitionException {
		Anb_GoalsContext _localctx = new Anb_GoalsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_anb_Goals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__9);
			setState(97);
			match(T__1);
			setState(98);
			match(ANB_Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4&\n\4\r"+
		"\4\16\4\'\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6\63\n\6\r\6\16\6\64\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\6\b>\n\b\r\b\16\b?\3\t\3\t\3\t\3\t\3\t\6\t"+
		"G\n\t\r\t\16\tH\3\n\3\n\3\n\3\n\3\n\3\n\7\nQ\n\n\f\n\16\nT\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\5\na\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2g\2\26\3\2\2\2\4\33\3\2\2"+
		"\2\6\37\3\2\2\2\b)\3\2\2\2\n,\3\2\2\2\f\66\3\2\2\2\16:\3\2\2\2\20A\3\2"+
		"\2\2\22`\3\2\2\2\24b\3\2\2\2\26\27\5\4\3\2\27\30\5\6\4\2\30\31\5\n\6\2"+
		"\31\32\5\16\b\2\32\3\3\2\2\2\33\34\7\3\2\2\34\35\7\4\2\2\35\36\7\r\2\2"+
		"\36\5\3\2\2\2\37 \7\5\2\2 %\7\4\2\2!\"\5\b\5\2\"#\7\6\2\2#&\3\2\2\2$&"+
		"\5\b\5\2%!\3\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\7\3\2\2"+
		"\2)*\7\r\2\2*+\7\20\2\2+\t\3\2\2\2,-\7\7\2\2-\62\7\4\2\2./\5\f\7\2/\60"+
		"\7\6\2\2\60\63\3\2\2\2\61\63\5\f\7\2\62.\3\2\2\2\62\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\67\7\r\2\2\678\7\4"+
		"\2\289\7\20\2\29\r\3\2\2\2:;\7\b\2\2;=\7\4\2\2<>\5\20\t\2=<\3\2\2\2>?"+
		"\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\17\3\2\2\2AB\7\r\2\2BC\7\22\2\2CD\7\r\2"+
		"\2DF\7\4\2\2EG\5\22\n\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21\3"+
		"\2\2\2Ja\7\r\2\2Ka\7\20\2\2LM\7\t\2\2MN\7\20\2\2NR\7\n\2\2OQ\7\20\2\2"+
		"PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2Sa\3\2\2\2TR\3\2\2\2UV\7\t\2\2"+
		"VW\7\13\2\2WX\7\20\2\2XY\7\13\2\2Y]\7\n\2\2Z\\\7\20\2\2[Z\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`J\3\2\2\2`K\3\2\2\2`L\3"+
		"\2\2\2`U\3\2\2\2a\23\3\2\2\2bc\7\f\2\2cd\7\4\2\2de\7\r\2\2e\25\3\2\2\2"+
		"\13%\'\62\64?HR]`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}