// Generated from ANB.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ANB_Identifier=12, ANB_String=13, ANB_COMMENT=14, WS=15, 
		ANB_Message=16, ANB_ListIdentifier=17, ANB_ListKnow=18, ANB_VARIABLES=19, 
		ANB_KNOW_FUNCTION=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "ANB_Identifier", "ANB_String", "ANB_COMMENT", "WS", 
		"ANB_Message", "ANB_ListIdentifier", "ANB_ListKnow", "ANB_VARIABLES", 
		"ANB_KNOW_FUNCTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "':'", "'Types'", "';'", "'Knowledge'", "'Actions'", 
		"'->'", "'('", "','", "'<-'", "'Goals'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ANB_Identifier", "ANB_String", "ANB_COMMENT", "WS", "ANB_Message", "ANB_ListIdentifier", 
		"ANB_ListKnow", "ANB_VARIABLES", "ANB_KNOW_FUNCTION"
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
	public String getGrammarFileName() { return "ANB.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0101\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\rc\n\r\f\r\16\rf\13"+
		"\r\3\16\3\16\3\17\3\17\7\17l\n\17\f\17\16\17o\13\17\3\17\3\17\3\20\3\20"+
		"\5\20u\n\20\3\20\6\20x\n\20\r\20\16\20y\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0099\n\21\r\21\16"+
		"\21\u009a\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d0\n\21"+
		"\f\21\16\21\u00d3\13\21\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00de\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e6\n\23\f"+
		"\23\16\23\u00e9\13\23\3\23\3\23\5\23\u00ed\n\23\3\24\3\24\3\24\3\24\5"+
		"\24\u00f3\n\24\7\24\u00f5\n\24\f\24\16\24\u00f8\13\24\3\25\3\25\3\25\3"+
		"\25\5\25\u00fe\n\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0118\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\t<"+
		"\3\2\2\2\13>\3\2\2\2\rH\3\2\2\2\17P\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25"+
		"W\3\2\2\2\27Z\3\2\2\2\31`\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37w\3\2\2\2"+
		"!\u00d6\3\2\2\2#\u00dd\3\2\2\2%\u00ec\3\2\2\2\'\u00ee\3\2\2\2)\u00f9\3"+
		"\2\2\2+,\7R\2\2,-\7t\2\2-.\7q\2\2./\7v\2\2/\60\7q\2\2\60\61\7e\2\2\61"+
		"\62\7q\2\2\62\63\7n\2\2\63\4\3\2\2\2\64\65\7<\2\2\65\6\3\2\2\2\66\67\7"+
		"V\2\2\678\7{\2\289\7r\2\29:\7g\2\2:;\7u\2\2;\b\3\2\2\2<=\7=\2\2=\n\3\2"+
		"\2\2>?\7M\2\2?@\7p\2\2@A\7q\2\2AB\7y\2\2BC\7n\2\2CD\7g\2\2DE\7f\2\2EF"+
		"\7i\2\2FG\7g\2\2G\f\3\2\2\2HI\7C\2\2IJ\7e\2\2JK\7v\2\2KL\7k\2\2LM\7q\2"+
		"\2MN\7p\2\2NO\7u\2\2O\16\3\2\2\2PQ\7/\2\2QR\7@\2\2R\20\3\2\2\2ST\7*\2"+
		"\2T\22\3\2\2\2UV\7.\2\2V\24\3\2\2\2WX\7>\2\2XY\7/\2\2Y\26\3\2\2\2Z[\7"+
		"I\2\2[\\\7q\2\2\\]\7c\2\2]^\7n\2\2^_\7u\2\2_\30\3\2\2\2`d\t\2\2\2ac\t"+
		"\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\32\3\2\2\2fd\3\2\2\2g"+
		"h\5\31\r\2h\34\3\2\2\2im\7%\2\2jl\n\4\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\b\17\2\2q\36\3\2\2\2rx\t\5\2\2su\7"+
		"\17\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\7\f\2\2wr\3\2\2\2wt\3\2\2\2xy"+
		"\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\20\2\2| \3\2\2\2}\u00d7\5\31"+
		"\r\2~\u00d7\5\33\16\2\177\u0080\7r\2\2\u0080\u0081\7m\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\7*\2\2\u0083\u0084\5\31\r\2\u0084\u0085\7+\2\2\u0085"+
		"\u00d7\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7m\2\2\u0088\u0089\3\2\2"+
		"\2\u0089\u008a\7*\2\2\u008a\u008b\5\31\r\2\u008b\u008c\7+\2\2\u008c\u00d7"+
		"\3\2\2\2\u008d\u008e\7m\2\2\u008e\u008f\7*\2\2\u008f\u0090\5\31\r\2\u0090"+
		"\u0091\7.\2\2\u0091\u0092\5\31\r\2\u0092\u0093\7+\2\2\u0093\u00d7\3\2"+
		"\2\2\u0094\u0095\7>\2\2\u0095\u0098\5!\21\2\u0096\u0097\7\60\2\2\u0097"+
		"\u0099\5!\21\2\u0098\u0096\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7@\2\2\u009d"+
		"\u00d7\3\2\2\2\u009e\u009f\7*\2\2\u009f\u00a0\5!\21\2\u00a0\u00a1\7+\2"+
		"\2\u00a1\u00d7\3\2\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7p\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8"+
		"\u00a9\5!\21\2\u00a9\u00aa\7\177\2\2\u00aa\u00ab\5!\21\2\u00ab\u00d7\3"+
		"\2\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7p\2\2\u00af"+
		"\u00b0\7e\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2\u00b3\5!\21"+
		"\2\u00b3\u00b4\7\177\2\2\u00b4\u00b5\5!\21\2\u00b5\u00d7\3\2\2\2\u00b6"+
		"\u00b7\7j\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7j\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7*\2\2\u00bc\u00bd\5!\21\2\u00bd\u00be"+
		"\7+\2\2\u00be\u00d7\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7x\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c5\5\31"+
		"\r\2\u00c5\u00c6\7*\2\2\u00c6\u00c7\5\31\r\2\u00c7\u00c8\7+\2\2\u00c8"+
		"\u00c9\7+\2\2\u00c9\u00d7\3\2\2\2\u00ca\u00cb\5\31\r\2\u00cb\u00cc\7*"+
		"\2\2\u00cc\u00d1\5!\21\2\u00cd\u00ce\7.\2\2\u00ce\u00d0\5!\21\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7+\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6}\3\2\2\2\u00d6~\3\2\2\2\u00d6\177\3\2\2\2\u00d6\u0086"+
		"\3\2\2\2\u00d6\u008d\3\2\2\2\u00d6\u0094\3\2\2\2\u00d6\u009e\3\2\2\2\u00d6"+
		"\u00a2\3\2\2\2\u00d6\u00ac\3\2\2\2\u00d6\u00b6\3\2\2\2\u00d6\u00bf\3\2"+
		"\2\2\u00d6\u00ca\3\2\2\2\u00d7\"\3\2\2\2\u00d8\u00de\5\31\r\2\u00d9\u00da"+
		"\5\31\r\2\u00da\u00db\7.\2\2\u00db\u00dc\5#\22\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de$\3\2\2\2\u00df\u00ed\5\31\r\2"+
		"\u00e0\u00e1\5\31\r\2\u00e1\u00e2\7*\2\2\u00e2\u00e7\5%\23\2\u00e3\u00e4"+
		"\7.\2\2\u00e4\u00e6\5%\23\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00eb\7+\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec"+
		"\u00e0\3\2\2\2\u00ed&\3\2\2\2\u00ee\u00f6\5\31\r\2\u00ef\u00f2\7.\2\2"+
		"\u00f0\u00f3\5\31\r\2\u00f1\u00f3\5)\25\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7(\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fa\5\31\r\2\u00fa\u00fd\7*\2\2\u00fb\u00fe\5\31\r\2\u00fc\u00fe"+
		"\5)\25\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7+\2\2\u0100*\3\2\2\2\21\2dmtwy\u009a\u00d1\u00d6\u00dd\u00e7\u00ec"+
		"\u00f2\u00f6\u00fd\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}