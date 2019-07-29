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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, INT_LITERAL = 9,
            STR_LITERAL = 10, IDENT = 11, WHITESPACE = 12, COMMENT = 13, BLOCK_COMMENT = 14;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20}\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3" +
                    "\t\3\n\5\n9\n\n\3\n\6\n<\n\n\r\n\16\n=\3\13\3\13\7\13B\n\13\f\13\16\13" +
                    "E\13\13\3\13\3\13\3\f\3\f\5\fK\n\f\3\f\3\f\3\f\7\fP\n\f\f\f\16\fS\13\f" +
                    "\3\r\3\r\6\rW\n\r\r\r\16\rX\3\r\3\r\3\16\3\16\3\16\3\16\7\16a\n\16\f\16" +
                    "\16\16d\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17n\n\17\f\17" +
                    "\16\17q\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\5" +
                    "Cbo\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17" +
                    "\35\20\37\2!\2#\2\3\2\6\4\2\13\13\"\"\3\2\62;\4\2C\\c|\4\2\f\f\17\17\2" +
                    "\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2" +
                    "\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3" +
                    "\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7" +
                    ")\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2" +
                    "\2\238\3\2\2\2\25?\3\2\2\2\27J\3\2\2\2\31V\3\2\2\2\33\\\3\2\2\2\35i\3" +
                    "\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%&\7*\2\2&\4\3\2\2\2\'(\7.\2\2(" +
                    "\6\3\2\2\2)*\7+\2\2*\b\3\2\2\2+,\7=\2\2,\n\3\2\2\2-.\7?\2\2.\f\3\2\2\2" +
                    "/\60\7c\2\2\60\61\7u\2\2\61\62\7o\2\2\62\16\3\2\2\2\63\64\7}\2\2\64\20" +
                    "\3\2\2\2\65\66\7\177\2\2\66\22\3\2\2\2\679\7/\2\28\67\3\2\2\289\3\2\2" +
                    "\29;\3\2\2\2:<\5\37\20\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\24\3" +
                    "\2\2\2?C\7$\2\2@B\13\2\2\2A@\3\2\2\2BE\3\2\2\2CD\3\2\2\2CA\3\2\2\2DF\3" +
                    "\2\2\2EC\3\2\2\2FG\7$\2\2G\26\3\2\2\2HK\5!\21\2IK\7a\2\2JH\3\2\2\2JI\3" +
                    "\2\2\2KQ\3\2\2\2LP\5\37\20\2MP\5!\21\2NP\7a\2\2OL\3\2\2\2OM\3\2\2\2ON" +
                    "\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\30\3\2\2\2SQ\3\2\2\2TW\t\2\2\2" +
                    "UW\5#\22\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2" +
                    "Z[\b\r\2\2[\32\3\2\2\2\\]\7\61\2\2]^\7\61\2\2^b\3\2\2\2_a\13\2\2\2`_\3" +
                    "\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\5#\22\2fg\3" +
                    "\2\2\2gh\b\16\2\2h\34\3\2\2\2ij\7\61\2\2jk\7,\2\2ko\3\2\2\2ln\13\2\2\2" +
                    "ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7,\2\2" +
                    "st\7\61\2\2tu\3\2\2\2uv\b\17\2\2v\36\3\2\2\2wx\t\3\2\2x \3\2\2\2yz\t\4" +
                    "\2\2z\"\3\2\2\2{|\t\5\2\2|$\3\2\2\2\r\28=CJOQVXbo\3\b\2\2";
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
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "INT_LITERAL",
                "STR_LITERAL", "IDENT", "WHITESPACE", "COMMENT", "BLOCK_COMMENT", "DIGIT",
                "LETTER", "NEWLINE"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'('", "','", "')'", "';'", "'='", "'asm'", "'{'", "'}'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, "INT_LITERAL",
                "STR_LITERAL", "IDENT", "WHITESPACE", "COMMENT", "BLOCK_COMMENT"
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
