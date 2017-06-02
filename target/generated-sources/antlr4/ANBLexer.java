// Generated from ANBLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANB_COMMENT=1, ANB_PROTOCOLE_TAG=2, ANB_PROTOCOLTYPE=3, ANB_TYPES_TAG=4, 
		ANB_TYPE_FUNCTIONS=5, ANB_KNOWLEDGE_TAG=6, ANB_KNOW=7, ANB_VARIABLES=8, 
		ANB_KNOW_FUNCTION=9, ANB_ACTIONS_TAG=10, ANB_ACTION_PREDOUBLEDOT=11, ANB_ACTION_POSTDOUBLEDOT=12, 
		ANB_GOALS_TAG=13, Identifier=14, Trick=15, ANB_END_LINE=16, ANB_DOUBLE_DOT=17, 
		ANB_SPECIAL_CHARACTER=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ANB_COMMENT", "ANB_PROTOCOLE_TAG", "ANB_PROTOCOLTYPE", "ANB_TYPES_TAG", 
		"ANB_TYPE_FUNCTIONS", "ANB_KNOWLEDGE_TAG", "ANB_KNOW", "ANB_VARIABLES", 
		"ANB_KNOW_FUNCTION", "ANB_ACTIONS_TAG", "ANB_ACTION_PREDOUBLEDOT", "ANB_ACTION_POSTDOUBLEDOT", 
		"ANB_GOALS_TAG", "Identifier", "Trick", "ANB_END_LINE", "ANB_DOUBLE_DOT", 
		"ANB_SPECIAL_CHARACTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'Types:'", null, "'Knowledge:'", null, null, 
		null, null, null, null, "'Goals:'", null, null, "';'", "':'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANB_COMMENT", "ANB_PROTOCOLE_TAG", "ANB_PROTOCOLTYPE", "ANB_TYPES_TAG", 
		"ANB_TYPE_FUNCTIONS", "ANB_KNOWLEDGE_TAG", "ANB_KNOW", "ANB_VARIABLES", 
		"ANB_KNOW_FUNCTION", "ANB_ACTIONS_TAG", "ANB_ACTION_PREDOUBLEDOT", "ANB_ACTION_POSTDOUBLEDOT", 
		"ANB_GOALS_TAG", "Identifier", "Trick", "ANB_END_LINE", "ANB_DOUBLE_DOT", 
		"ANB_SPECIAL_CHARACTER", "WS"
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


	public ANBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANBLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\te\n\t"+
		"\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0092\n\f\3\f\3"+
		"\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\5\f\u009c\n\f\3\f\3\f\5\f\u00a0\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\r\3\r\5\r\u00ac\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u00b7\n\17\f\17\16\17\u00ba\13"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00c6\n\24"+
		"\3\24\6\24\u00c9\n\24\r\24\16\24\u00ca\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3"+
		"\2\6\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u00dc\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\62\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2"+
		"\13H\3\2\2\2\rR\3\2\2\2\17]\3\2\2\2\21`\3\2\2\2\23k\3\2\2\2\25s\3\2\2"+
		"\2\27\u009f\3\2\2\2\31\u00ab\3\2\2\2\33\u00ad\3\2\2\2\35\u00b4\3\2\2\2"+
		"\37\u00bb\3\2\2\2!\u00bd\3\2\2\2#\u00bf\3\2\2\2%\u00c1\3\2\2\2\'\u00c8"+
		"\3\2\2\2)-\7%\2\2*,\n\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60"+
		"\3\2\2\2/-\3\2\2\2\60\61\b\2\2\2\61\4\3\2\2\2\62\63\7R\2\2\63\64\7t\2"+
		"\2\64\65\7q\2\2\65\66\7v\2\2\66\67\7q\2\2\678\7e\2\289\7q\2\29:\7n\2\2"+
		":;\7<\2\2;<\7\"\2\2<=\3\2\2\2=>\5\35\17\2>\6\3\2\2\2?@\5\35\17\2@\b\3"+
		"\2\2\2AB\7V\2\2BC\7{\2\2CD\7r\2\2DE\7g\2\2EF\7u\2\2FG\7<\2\2G\n\3\2\2"+
		"\2HI\5\37\20\2IJ\5\'\24\2JO\5\35\17\2KL\7.\2\2LN\5\35\17\2MK\3\2\2\2N"+
		"Q\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\f\3\2\2\2QO\3\2\2\2RS\7M\2\2ST\7p\2\2T"+
		"U\7q\2\2UV\7y\2\2VW\7n\2\2WX\7g\2\2XY\7f\2\2YZ\7i\2\2Z[\7g\2\2[\\\7<\2"+
		"\2\\\16\3\2\2\2]^\5\37\20\2^_\7<\2\2_\20\3\2\2\2`h\5\37\20\2ad\7.\2\2"+
		"be\5\35\17\2ce\5\23\n\2db\3\2\2\2dc\3\2\2\2eg\3\2\2\2fa\3\2\2\2gj\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2i\22\3\2\2\2jh\3\2\2\2kl\5\37\20\2lo\7*\2\2mp"+
		"\5\35\17\2np\5\23\n\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qr\7+\2\2r\24\3\2\2"+
		"\2st\7C\2\2tu\7e\2\2uv\7v\2\2vw\7k\2\2wx\7q\2\2xy\7p\2\2yz\7u\2\2z{\7"+
		"<\2\2{|\3\2\2\2|}\5\'\24\2}\26\3\2\2\2~\177\5\35\17\2\177\u0080\5\'\24"+
		"\2\u0080\u0081\7/\2\2\u0081\u0082\7@\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\5\'\24\2\u0084\u0085\5\35\17\2\u0085\u00a0\3\2\2\2\u0086\u0087\5\35\17"+
		"\2\u0087\u0088\5\'\24\2\u0088\u0089\7/\2\2\u0089\u008a\7@\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\5\'\24\2\u008c\u008d\5\35\17\2\u008d\u008e\7.\2\2"+
		"\u008e\u0091\7*\2\2\u008f\u0092\5\35\17\2\u0090\u0092\7/\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\7~\2\2\u0094"+
		"\u0097\5\35\17\2\u0095\u0097\7/\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\7~\2\2\u0099\u009c\5\35\17\2\u009a"+
		"\u009c\7/\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\7+\2\2\u009e\u00a0\3\2\2\2\u009f~\3\2\2\2\u009f\u0086"+
		"\3\2\2\2\u00a0\30\3\2\2\2\u00a1\u00ac\5\21\t\2\u00a2\u00ac\5\23\n\2\u00a3"+
		"\u00a7\7}\2\2\u00a4\u00a8\5\21\t\2\u00a5\u00a8\5\31\r\2\u00a6\u00a8\5"+
		"\23\n\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a1\3"+
		"\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ac\32\3\2\2\2\u00ad"+
		"\u00ae\7I\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2"+
		"\u00b1\u00b2\7u\2\2\u00b2\u00b3\7<\2\2\u00b3\34\3\2\2\2\u00b4\u00b8\t"+
		"\3\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\36\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00bb\u00bc\5\35\17\2\u00bc \3\2\2\2\u00bd\u00be\7=\2\2\u00be\"\3\2"+
		"\2\2\u00bf\u00c0\7<\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2&\3\2\2"+
		"\2\u00c3\u00c9\t\5\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c4\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\7\f\2\2\u00c8\u00c3\3\2"+
		"\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb(\3\2\2\2\22\2-Odho\u0091\u0096\u009b\u009f\u00a7"+
		"\u00ab\u00b8\u00c5\u00c8\u00ca\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}