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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, ASM_BLOCK = 9,
            INT_LITERAL = 10, STR_LITERAL = 11, IDENT = 12, WHITESPACE = 13, COMMENT = 14, BLOCK_COMMENT = 15;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0087\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3" +
                    "\7\3\b\3\b\3\t\3\t\3\n\3\n\6\n<\n\n\r\n\16\n=\3\n\3\n\3\13\5\13C\n\13" +
                    "\3\13\6\13F\n\13\r\13\16\13G\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\f\3\f\3" +
                    "\r\3\r\5\rU\n\r\3\r\3\r\3\r\7\rZ\n\r\f\r\16\r]\13\r\3\16\3\16\6\16a\n" +
                    "\16\r\16\16\16b\3\16\3\16\3\17\3\17\3\17\3\17\7\17k\n\17\f\17\16\17n\13" +
                    "\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20x\n\20\f\20\16\20{\13" +
                    "\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6=Mly\2\24" +
                    "\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20" +
                    "\37\21!\2#\2%\2\3\2\6\4\2\13\13\"\"\3\2\62;\4\2C\\c|\4\2\f\f\17\17\2\u008f" +
                    "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
                    "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2" +
                    "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\'\3\2\2\2\5)\3" +
                    "\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\65\3\2\2\2\21" +
                    "\67\3\2\2\2\239\3\2\2\2\25B\3\2\2\2\27I\3\2\2\2\31T\3\2\2\2\33`\3\2\2" +
                    "\2\35f\3\2\2\2\37s\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085\3\2\2" +
                    "\2\'(\7*\2\2(\4\3\2\2\2)*\7.\2\2*\6\3\2\2\2+,\7+\2\2,\b\3\2\2\2-.\7=\2" +
                    "\2.\n\3\2\2\2/\60\7?\2\2\60\f\3\2\2\2\61\62\7c\2\2\62\63\7u\2\2\63\64" +
                    "\7o\2\2\64\16\3\2\2\2\65\66\7}\2\2\66\20\3\2\2\2\678\7\177\2\28\22\3\2" +
                    "\2\29;\7$\2\2:<\13\2\2\2;:\3\2\2\2<=\3\2\2\2=>\3\2\2\2=;\3\2\2\2>?\3\2" +
                    "\2\2?@\7$\2\2@\24\3\2\2\2AC\7/\2\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\5!" +
                    "\21\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\26\3\2\2\2IM\7$\2\2JL\13" +
                    "\2\2\2KJ\3\2\2\2LO\3\2\2\2MN\3\2\2\2MK\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7" +
                    "$\2\2Q\30\3\2\2\2RU\5#\22\2SU\7a\2\2TR\3\2\2\2TS\3\2\2\2U[\3\2\2\2VZ\5" +
                    "!\21\2WZ\5#\22\2XZ\7a\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3" +
                    "\2\2\2[\\\3\2\2\2\\\32\3\2\2\2][\3\2\2\2^a\t\2\2\2_a\5%\23\2`^\3\2\2\2" +
                    "`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\16\2\2e\34\3\2" +
                    "\2\2fg\7\61\2\2gh\7\61\2\2hl\3\2\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm" +
                    "\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\5%\23\2pq\3\2\2\2qr\b\17\2\2" +
                    "r\36\3\2\2\2st\7\61\2\2tu\7,\2\2uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2" +
                    "\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7,\2\2}~\7\61\2\2~\177" +
                    "\3\2\2\2\177\u0080\b\20\2\2\u0080 \3\2\2\2\u0081\u0082\t\3\2\2\u0082\"" +
                    "\3\2\2\2\u0083\u0084\t\4\2\2\u0084$\3\2\2\2\u0085\u0086\t\5\2\2\u0086" +
                    "&\3\2\2\2\16\2=BGMTY[`bly\3\b\2\2";
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
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ASM_BLOCK",
                "INT_LITERAL", "STR_LITERAL", "IDENT", "WHITESPACE", "COMMENT", "BLOCK_COMMENT",
                "DIGIT", "LETTER", "NEWLINE"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'('", "','", "')'", "';'", "'='", "'asm'", "'{'", "'}'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, "ASM_BLOCK", "INT_LITERAL",
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
