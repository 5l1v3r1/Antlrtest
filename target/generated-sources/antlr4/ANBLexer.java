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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ANB_Identifier=19, ANB_COMMENT=20, WS=21, ANB_KNOW=22, ANB_KNOW_FUNCTION=23, 
		ANB_KNOW_CONDITION=24, ANB_CHANNEL=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "ANB_Identifier", "ANB_COMMENT", "WS", "ANB_KNOW", "ANB_KNOW_FUNCTION", 
		"ANB_KNOW_CONDITION", "ANB_CHANNEL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "':'", "'Types'", "';'", "'Knowledge'", "'where'", 
		"','", "'Actions'", "'{'", "'}'", "'|'", "'Goals'", "'weakly'", "'authenticates'", 
		"'on'", "'secret'", "'between'", "'of'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ANB_Identifier", "ANB_COMMENT", 
		"WS", "ANB_KNOW", "ANB_KNOW_FUNCTION", "ANB_KNOW_CONDITION", "ANB_CHANNEL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00f3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\7\24\u009b\n\24\f\24"+
		"\16\24\u009e\13\24\3\25\3\25\7\25\u00a2\n\25\f\25\16\25\u00a5\13\25\3"+
		"\25\3\25\3\26\3\26\5\26\u00ab\n\26\3\26\6\26\u00ae\n\26\r\26\16\26\u00af"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00b9\n\27\7\27\u00bb\n\27\f"+
		"\27\16\27\u00be\13\27\3\27\5\27\u00c1\n\27\3\30\3\30\3\30\3\30\3\30\7"+
		"\30\u00c8\n\30\f\30\16\30\u00cb\13\30\3\30\3\30\3\30\7\30\u00d0\n\30\f"+
		"\30\16\30\u00d3\13\30\3\30\3\30\3\30\7\30\u00d8\n\30\f\30\16\30\u00db"+
		"\13\30\5\30\u00dd\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f2\n\32\2\2\33"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\5\2C\\aac|\6"+
		"\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0103\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\5>\3\2\2\2\7@\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rR\3"+
		"\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31"+
		"h\3\2\2\2\33n\3\2\2\2\35u\3\2\2\2\37\u0083\3\2\2\2!\u0086\3\2\2\2#\u008d"+
		"\3\2\2\2%\u0095\3\2\2\2\'\u0098\3\2\2\2)\u009f\3\2\2\2+\u00ad\3\2\2\2"+
		"-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61\u00e0\3\2\2\2\63\u00f1\3\2\2\2\65\66"+
		"\7R\2\2\66\67\7t\2\2\678\7q\2\289\7v\2\29:\7q\2\2:;\7e\2\2;<\7q\2\2<="+
		"\7n\2\2=\4\3\2\2\2>?\7<\2\2?\6\3\2\2\2@A\7V\2\2AB\7{\2\2BC\7r\2\2CD\7"+
		"g\2\2DE\7u\2\2E\b\3\2\2\2FG\7=\2\2G\n\3\2\2\2HI\7M\2\2IJ\7p\2\2JK\7q\2"+
		"\2KL\7y\2\2LM\7n\2\2MN\7g\2\2NO\7f\2\2OP\7i\2\2PQ\7g\2\2Q\f\3\2\2\2RS"+
		"\7y\2\2ST\7j\2\2TU\7g\2\2UV\7t\2\2VW\7g\2\2W\16\3\2\2\2XY\7.\2\2Y\20\3"+
		"\2\2\2Z[\7C\2\2[\\\7e\2\2\\]\7v\2\2]^\7k\2\2^_\7q\2\2_`\7p\2\2`a\7u\2"+
		"\2a\22\3\2\2\2bc\7}\2\2c\24\3\2\2\2de\7\177\2\2e\26\3\2\2\2fg\7~\2\2g"+
		"\30\3\2\2\2hi\7I\2\2ij\7q\2\2jk\7c\2\2kl\7n\2\2lm\7u\2\2m\32\3\2\2\2n"+
		"o\7y\2\2op\7g\2\2pq\7c\2\2qr\7m\2\2rs\7n\2\2st\7{\2\2t\34\3\2\2\2uv\7"+
		"c\2\2vw\7w\2\2wx\7v\2\2xy\7j\2\2yz\7g\2\2z{\7p\2\2{|\7v\2\2|}\7k\2\2}"+
		"~\7e\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080\u0081\7g\2\2\u0081\u0082\7"+
		"u\2\2\u0082\36\3\2\2\2\u0083\u0084\7q\2\2\u0084\u0085\7p\2\2\u0085 \3"+
		"\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\u0089\7e\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7v\2\2\u008c\"\3\2\2\2\u008d"+
		"\u008e\7d\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7y\2\2"+
		"\u0091\u0092\7g\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2\u0094$\3\2\2"+
		"\2\u0095\u0096\7q\2\2\u0096\u0097\7h\2\2\u0097&\3\2\2\2\u0098\u009c\t"+
		"\2\2\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d(\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009f\u00a3\7%\2\2\u00a0\u00a2\n\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\b\25\2\2\u00a7*\3\2\2\2\u00a8\u00ae\t\5\2\2"+
		"\u00a9\u00ab\7\17\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ae\7\f\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\b\26\2\2\u00b2,\3\2\2\2\u00b3\u00c1\5\'\24\2\u00b4\u00bc"+
		"\5\'\24\2\u00b5\u00b8\7.\2\2\u00b6\u00b9\5\'\24\2\u00b7\u00b9\5/\30\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b5"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c1\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\5/\30\2\u00c0\u00b3\3\2"+
		"\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1.\3\2\2\2\u00c2\u00c3"+
		"\5\'\24\2\u00c3\u00dc\7*\2\2\u00c4\u00c9\5\'\24\2\u00c5\u00c6\7.\2\2\u00c6"+
		"\u00c8\5\'\24\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00dd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d1\5/\30\2\u00cd\u00ce\7.\2\2\u00ce\u00d0\5/\30\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00dd\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9\5-\27\2\u00d5\u00d6\7."+
		"\2\2\u00d6\u00d8\5-\27\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00c4\3\2\2\2\u00dc\u00cc\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7+\2\2\u00df\60\3\2\2\2\u00e0\u00e1\5\'\24"+
		"\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\5\'\24\2\u00e4\62"+
		"\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6\u00f2\7@\2\2\u00e7\u00e8\7,\2\2\u00e8"+
		"\u00e9\7/\2\2\u00e9\u00ea\7@\2\2\u00ea\u00f2\7,\2\2\u00eb\u00ec\7,\2\2"+
		"\u00ec\u00ed\7/\2\2\u00ed\u00f2\7@\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f0"+
		"\7@\2\2\u00f0\u00f2\7,\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\64\3\2\2\2\20\2\u009c\u00a3\u00aa"+
		"\u00ad\u00af\u00b8\u00bc\u00c0\u00c9\u00d1\u00d9\u00dc\u00f1\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}