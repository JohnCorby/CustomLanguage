// Generated from /home/johncorby/Desktop/CustomLanguage/Grammar.g4 by ANTLR 4.7.2
package com.johncorby.customlanguage.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, EXPR = 8, INT_LITERAL = 9,
            IDENT = 10, WHITESPACE = 11, COMMENT = 12, BLOCK_COMMENT = 13;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17p\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3" +
                    "\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n\65\n\n" +
                    "\3\n\6\n8\n\n\r\n\16\n9\3\13\3\13\5\13>\n\13\3\13\3\13\3\13\7\13C\n\13" +
                    "\f\13\16\13F\13\13\3\f\3\f\6\fJ\n\f\r\f\16\fK\3\f\3\f\3\r\3\r\3\r\3\r" +
                    "\7\rT\n\r\f\r\16\rW\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16a\n\16" +
                    "\f\16\16\16d\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3" +
                    "\21\4Ub\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16" +
                    "\33\17\35\2\37\2!\2\3\2\6\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;\4\2C\\c" +
                    "|\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r" +
                    "\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2" +
                    "\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3" +
                    "\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\64\3\2\2\2" +
                    "\25=\3\2\2\2\27I\3\2\2\2\31O\3\2\2\2\33\\\3\2\2\2\35j\3\2\2\2\37l\3\2" +
                    "\2\2!n\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2\2\2\'(\7+\2\2(\b\3" +
                    "\2\2\2)*\7=\2\2*\n\3\2\2\2+,\7?\2\2,\f\3\2\2\2-.\7}\2\2.\16\3\2\2\2/\60" +
                    "\7\177\2\2\60\20\3\2\2\2\61\62\5\23\n\2\62\22\3\2\2\2\63\65\7/\2\2\64" +
                    "\63\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\668\5\37\20\2\67\66\3\2\2\289" +
                    "\3\2\2\29\67\3\2\2\29:\3\2\2\2:\24\3\2\2\2;>\5!\21\2<>\7a\2\2=;\3\2\2" +
                    "\2=<\3\2\2\2>D\3\2\2\2?C\5\37\20\2@C\5!\21\2AC\7a\2\2B?\3\2\2\2B@\3\2" +
                    "\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\26\3\2\2\2FD\3\2\2\2GJ\t" +
                    "\2\2\2HJ\5\35\17\2IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L" +
                    "M\3\2\2\2MN\b\f\2\2N\30\3\2\2\2OP\7\61\2\2PQ\7\61\2\2QU\3\2\2\2RT\13\2" +
                    "\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5\35" +
                    "\17\2YZ\3\2\2\2Z[\b\r\2\2[\32\3\2\2\2\\]\7\61\2\2]^\7,\2\2^b\3\2\2\2_" +
                    "a\13\2\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2" +
                    "ef\7,\2\2fg\7\61\2\2gh\3\2\2\2hi\b\16\2\2i\34\3\2\2\2jk\t\3\2\2k\36\3" +
                    "\2\2\2lm\t\4\2\2m \3\2\2\2no\t\5\2\2o\"\3\2\2\2\f\2\649=BDIKUb\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public GrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "EXPR", "INT_LITERAL",
                "IDENT", "WHITESPACE", "COMMENT", "BLOCK_COMMENT", "NEWLINE", "DIGIT",
                "LETTER"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'('", "','", "')'", "';'", "'='", "'{'", "'}'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, "EXPR", "INT_LITERAL",
                "IDENT", "WHITESPACE", "COMMENT", "BLOCK_COMMENT"
        };
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
    public String getGrammarFileName() {
        return "Grammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}
