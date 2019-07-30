// Generated from /home/johncorby/Desktop/CustomLanguage/Grammar.g4 by ANTLR 4.7.2
package com.johncorby.customlanguage.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, INT_LITERAL = 13, STR_LITERAL = 14, IDENT = 15,
            WHITESPACE = 16, COMMENT = 17, BLOCK_COMMENT = 18;
    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_externFuncDeclare = 2, RULE_funcDeclare = 3,
            RULE_funcArg = 4, RULE_block = 5, RULE_funcCall = 6, RULE_funcCallArgs = 7,
            RULE_varDeclare = 8, RULE_varAssign = 9, RULE_asm = 10, RULE_expr = 11;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0089\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f" +
                    "\4\16\4\66\13\4\5\48\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5" +
                    "\f\5\16\5F\13\5\5\5H\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7R\n\7\f\7" +
                    "\16\7U\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\ta\n\t\f\t\16\t" +
                    "d\13\t\5\tf\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3" +
                    "\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0084" +
                    "\n\r\f\r\16\r\u0087\13\r\3\r\2\3\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2" +
                    "\4\3\2\13\f\3\2\r\16\2\u008d\2\35\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b<\3\2" +
                    "\2\2\nL\3\2\2\2\fO\3\2\2\2\16X\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24k\3\2" +
                    "\2\2\26p\3\2\2\2\30{\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2" +
                    "\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3!\3\3" +
                    "\2\2\2\"+\5\6\4\2#+\5\b\5\2$%\5\16\b\2%&\7\3\2\2&+\3\2\2\2\'+\5\22\n\2" +
                    "(+\5\24\13\2)+\5\26\f\2*\"\3\2\2\2*#\3\2\2\2*$\3\2\2\2*\'\3\2\2\2*(\3" +
                    "\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7\21\2\2-.\7\21\2\2.\67\7\4\2\2/\64\5\n" +
                    "\6\2\60\61\7\5\2\2\61\63\5\n\6\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2" +
                    "\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\67/\3\2\2\2\678\3\2\2\28" +
                    "9\3\2\2\29:\7\6\2\2:;\7\3\2\2;\7\3\2\2\2<=\7\21\2\2=>\7\21\2\2>G\7\4\2" +
                    "\2?D\5\n\6\2@A\7\5\2\2AC\5\n\6\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2" +
                    "\2EH\3\2\2\2FD\3\2\2\2G?\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\6\2\2JK\5\f\7" +
                    "\2K\t\3\2\2\2LM\7\21\2\2MN\7\21\2\2N\13\3\2\2\2OS\7\7\2\2PR\5\4\3\2QP" +
                    "\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\b\2\2W" +
                    "\r\3\2\2\2XY\7\21\2\2YZ\7\4\2\2Z[\5\20\t\2[\\\7\6\2\2\\\17\3\2\2\2]b\5" +
                    "\30\r\2^_\7\5\2\2_a\5\30\r\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c" +
                    "f\3\2\2\2db\3\2\2\2e]\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gh\7\21\2\2hi\7\21" +
                    "\2\2ij\7\3\2\2j\23\3\2\2\2kl\7\21\2\2lm\7\t\2\2mn\5\30\r\2no\7\3\2\2o" +
                    "\25\3\2\2\2pq\7\n\2\2qr\7\20\2\2rs\7\3\2\2s\27\3\2\2\2tu\b\r\1\2u|\7\17" +
                    "\2\2v|\5\16\b\2wx\7\4\2\2xy\5\30\r\2yz\7\6\2\2z|\3\2\2\2{t\3\2\2\2{v\3" +
                    "\2\2\2{w\3\2\2\2|\u0085\3\2\2\2}~\f\4\2\2~\177\t\2\2\2\177\u0084\5\30" +
                    "\r\5\u0080\u0081\f\3\2\2\u0081\u0082\t\3\2\2\u0082\u0084\5\30\r\4\u0083" +
                    "}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2" +
                    "\u0085\u0086\3\2\2\2\u0086\31\3\2\2\2\u0087\u0085\3\2\2\2\16\35*\64\67" +
                    "DGSbe{\u0083\u0085";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public GrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "statement", "externFuncDeclare", "funcDeclare", "funcArg",
                "block", "funcCall", "funcCallArgs", "varDeclare", "varAssign", "asm",
                "expr"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "';'", "'('", "','", "')'", "'{'", "'}'", "'='", "'asm'", "'*'",
                "'/'", "'+'", "'-'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, "INT_LITERAL", "STR_LITERAL", "IDENT", "WHITESPACE", "COMMENT",
                "BLOCK_COMMENT"
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
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(27);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__7 || _la == IDENT) {
                    {
                        {
                            setState(24);
                            statement();
                        }
                    }
                    setState(29);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(30);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(40);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(32);
                    externFuncDeclare();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(33);
                    funcDeclare();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(34);
                    funcCall();
                    setState(35);
                    match(T__0);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(37);
                    varDeclare();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(38);
                    varAssign();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(39);
                    asm();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExternFuncDeclareContext externFuncDeclare() throws RecognitionException {
        ExternFuncDeclareContext _localctx = new ExternFuncDeclareContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_externFuncDeclare);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(42);
                ((ExternFuncDeclareContext) _localctx).retType = match(IDENT);
                setState(43);
                ((ExternFuncDeclareContext) _localctx).name = match(IDENT);
                setState(44);
                match(T__1);
                setState(53);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENT) {
                    {
                        setState(45);
                        funcArg();
                        setState(50);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(46);
                                    match(T__2);
                                    setState(47);
                                    funcArg();
                                }
                            }
                            setState(52);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(55);
                match(T__3);
                setState(56);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FuncDeclareContext funcDeclare() throws RecognitionException {
        FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_funcDeclare);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(58);
                ((FuncDeclareContext) _localctx).retType = match(IDENT);
                setState(59);
                ((FuncDeclareContext) _localctx).name = match(IDENT);
                setState(60);
                match(T__1);
                setState(69);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENT) {
                    {
                        setState(61);
                        funcArg();
                        setState(66);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(62);
                                    match(T__2);
                                    setState(63);
                                    funcArg();
                                }
                            }
                            setState(68);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(71);
                match(T__3);
                setState(72);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FuncArgContext funcArg() throws RecognitionException {
        FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_funcArg);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(74);
                ((FuncArgContext) _localctx).argType = match(IDENT);
                setState(75);
                ((FuncArgContext) _localctx).name = match(IDENT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                match(T__4);
                setState(81);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__7 || _la == IDENT) {
                    {
                        {
                            setState(78);
                            statement();
                        }
                    }
                    setState(83);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(84);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FuncCallContext funcCall() throws RecognitionException {
        FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_funcCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                ((FuncCallContext) _localctx).name = match(IDENT);
                setState(87);
                match(T__1);
                setState(88);
                ((FuncCallContext) _localctx).args = funcCallArgs();
                setState(89);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FuncCallArgsContext funcCallArgs() throws RecognitionException {
        FuncCallArgsContext _localctx = new FuncCallArgsContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_funcCallArgs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(99);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT_LITERAL) | (1L << IDENT))) != 0)) {
                    {
                        setState(91);
                        expr(0);
                        setState(96);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(92);
                                    match(T__2);
                                    setState(93);
                                    expr(0);
                                }
                            }
                            setState(98);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarDeclareContext varDeclare() throws RecognitionException {
        VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_varDeclare);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(101);
                ((VarDeclareContext) _localctx).varType = match(IDENT);
                setState(102);
                ((VarDeclareContext) _localctx).name = match(IDENT);
                setState(103);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarAssignContext varAssign() throws RecognitionException {
        VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_varAssign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                ((VarAssignContext) _localctx).name = match(IDENT);
                setState(106);
                match(T__6);
                setState(107);
                ((VarAssignContext) _localctx).val = expr(0);
                setState(108);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AsmContext asm() throws RecognitionException {
        AsmContext _localctx = new AsmContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_asm);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                match(T__7);
                setState(111);
                ((AsmContext) _localctx).code = match(STR_LITERAL);
                setState(112);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 22;
        enterRecursionRule(_localctx, 22, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case INT_LITERAL: {
                        setState(115);
                        ((ExprContext) _localctx).literal = match(INT_LITERAL);
                    }
                    break;
                    case IDENT: {
                        setState(116);
                        ((ExprContext) _localctx).func = funcCall();
                    }
                    break;
                    case T__1: {
                        setState(117);
                        match(T__1);
                        setState(118);
                        ((ExprContext) _localctx).paren = expr(0);
                        setState(119);
                        match(T__3);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(131);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(129);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                                case 1: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    _localctx.left = _prevctx;
                                    _localctx.left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(123);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(124);
                                    ((ExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == T__8 || _la == T__9)) {
                                        ((ExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(125);
                                    ((ExprContext) _localctx).right = expr(3);
                                }
                                break;
                                case 2: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    _localctx.left = _prevctx;
                                    _localctx.left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(126);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(127);
                                    ((ExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == T__10 || _la == T__11)) {
                                        ((ExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(128);
                                    ((ExprContext) _localctx).right = expr(2);
                                }
                                break;
                            }
                        }
                    }
                    setState(133);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 11:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 2);
            case 1:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(GrammarParser.EOF, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitProgram(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExternFuncDeclareContext externFuncDeclare() {
            return getRuleContext(ExternFuncDeclareContext.class, 0);
        }

        public FuncDeclareContext funcDeclare() {
            return getRuleContext(FuncDeclareContext.class, 0);
        }

        public FuncCallContext funcCall() {
            return getRuleContext(FuncCallContext.class, 0);
        }

        public VarDeclareContext varDeclare() {
            return getRuleContext(VarDeclareContext.class, 0);
        }

        public VarAssignContext varAssign() {
            return getRuleContext(VarAssignContext.class, 0);
        }

        public AsmContext asm() {
            return getRuleContext(AsmContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitStatement(this);
        }
    }

    public static class ExternFuncDeclareContext extends ParserRuleContext {
        public Token retType;
        public Token name;

        public ExternFuncDeclareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(GrammarParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(GrammarParser.IDENT, i);
        }

        public List<FuncArgContext> funcArg() {
            return getRuleContexts(FuncArgContext.class);
        }

        public FuncArgContext funcArg(int i) {
            return getRuleContext(FuncArgContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_externFuncDeclare;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExternFuncDeclare(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExternFuncDeclare(this);
        }
    }

    public static class FuncDeclareContext extends ParserRuleContext {
        public Token retType;
        public Token name;

        public FuncDeclareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(GrammarParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(GrammarParser.IDENT, i);
        }

        public List<FuncArgContext> funcArg() {
            return getRuleContexts(FuncArgContext.class);
        }

        public FuncArgContext funcArg(int i) {
            return getRuleContext(FuncArgContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcDeclare;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterFuncDeclare(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitFuncDeclare(this);
        }
    }

    public static class FuncArgContext extends ParserRuleContext {
        public Token argType;
        public Token name;

        public FuncArgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(GrammarParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(GrammarParser.IDENT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcArg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterFuncArg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitFuncArg(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitBlock(this);
        }
    }

    public static class FuncCallContext extends ParserRuleContext {
        public Token name;
        public FuncCallArgsContext args;

        public FuncCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENT() {
            return getToken(GrammarParser.IDENT, 0);
        }

        public FuncCallArgsContext funcCallArgs() {
            return getRuleContext(FuncCallArgsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterFuncCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitFuncCall(this);
        }
    }

    public static class FuncCallArgsContext extends ParserRuleContext {
        public FuncCallArgsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcCallArgs;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterFuncCallArgs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitFuncCallArgs(this);
        }
    }

    public static class VarDeclareContext extends ParserRuleContext {
        public Token varType;
        public Token name;

        public VarDeclareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(GrammarParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(GrammarParser.IDENT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varDeclare;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterVarDeclare(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitVarDeclare(this);
        }
    }

    public static class VarAssignContext extends ParserRuleContext {
        public Token name;
        public ExprContext val;

        public VarAssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENT() {
            return getToken(GrammarParser.IDENT, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varAssign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterVarAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitVarAssign(this);
        }
    }

    public static class AsmContext extends ParserRuleContext {
        public Token code;

        public AsmContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode STR_LITERAL() {
            return getToken(GrammarParser.STR_LITERAL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_asm;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterAsm(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitAsm(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext left;
        public Token literal;
        public FuncCallContext func;
        public ExprContext paren;
        public Token op;
        public ExprContext right;

        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT_LITERAL() {
            return getToken(GrammarParser.INT_LITERAL, 0);
        }

        public FuncCallContext funcCall() {
            return getRuleContext(FuncCallContext.class, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExpr(this);
        }
    }
}
