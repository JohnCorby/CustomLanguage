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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, INT_LITERAL = 9,
            STR_LITERAL = 10, IDENT = 11, WHITESPACE = 12, COMMENT = 13, BLOCK_COMMENT = 14;
    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_funcDeclare = 2, RULE_funcArg = 3,
            RULE_funcCall = 4, RULE_funcCallArgs = 5, RULE_varDeclare = 6, RULE_varAssign = 7,
            RULE_asm = 8, RULE_block = 9, RULE_expr = 10;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20e\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4" +
                    "\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3" +
                    "&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\5\4\63\n\4\3\4" +
                    "\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7D\n\7\f\7" +
                    "\16\7G\13\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\13\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\13\3\13\3\f\3\f\3" +
                    "\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\13\f\2c\2\33\3\2\2\2\4%\3" +
                    "\2\2\2\6\'\3\2\2\2\b\67\3\2\2\2\n:\3\2\2\2\fH\3\2\2\2\16J\3\2\2\2\20N" +
                    "\3\2\2\2\22S\3\2\2\2\24Y\3\2\2\2\26b\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2" +
                    "\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2" +
                    "\2\36\37\7\2\2\3\37\3\3\2\2\2 &\5\6\4\2!&\5\n\6\2\"&\5\16\b\2#&\5\20\t" +
                    "\2$&\5\22\n\2% \3\2\2\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\5\3" +
                    "\2\2\2\'(\7\r\2\2()\7\r\2\2)\62\7\3\2\2*/\5\b\5\2+,\7\4\2\2,.\5\b\5\2" +
                    "-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2" +
                    "\62*\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\5\2\2\65\66\5\24\13\2" +
                    "\66\7\3\2\2\2\678\7\r\2\289\7\r\2\29\t\3\2\2\2:;\7\r\2\2;<\7\3\2\2<=\5" +
                    "\f\7\2=>\7\5\2\2>?\7\6\2\2?\13\3\2\2\2@E\5\26\f\2AB\7\4\2\2BD\5\26\f\2" +
                    "CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H@\3\2\2\2" +
                    "HI\3\2\2\2I\r\3\2\2\2JK\7\r\2\2KL\7\r\2\2LM\7\6\2\2M\17\3\2\2\2NO\7\r" +
                    "\2\2OP\7\7\2\2PQ\5\26\f\2QR\7\6\2\2R\21\3\2\2\2ST\7\b\2\2TU\7\3\2\2UV" +
                    "\7\f\2\2VW\7\5\2\2WX\7\6\2\2X\23\3\2\2\2Y]\7\t\2\2Z\\\5\4\3\2[Z\3\2\2" +
                    "\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\n\2\2a\25\3" +
                    "\2\2\2bc\t\2\2\2c\27\3\2\2\2\t\33%/\62EH]";
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
                "program", "statement", "funcDeclare", "funcArg", "funcCall", "funcCallArgs",
                "varDeclare", "varAssign", "asm", "block", "expr"
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
                setState(25);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__5 || _la == IDENT) {
                    {
                        {
                            setState(22);
                            statement();
                        }
                    }
                    setState(27);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(28);
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
            setState(35);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(30);
                    funcDeclare();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(31);
                    funcCall();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(32);
                    varDeclare();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(33);
                    varAssign();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(34);
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

    public final FuncDeclareContext funcDeclare() throws RecognitionException {
        FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_funcDeclare);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(37);
                ((FuncDeclareContext) _localctx).retType = match(IDENT);
                setState(38);
                ((FuncDeclareContext) _localctx).name = match(IDENT);
                setState(39);
                match(T__0);
                setState(48);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENT) {
                    {
                        setState(40);
                        funcArg();
                        setState(45);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__1) {
                            {
                                {
                                    setState(41);
                                    match(T__1);
                                    setState(42);
                                    funcArg();
                                }
                            }
                            setState(47);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(50);
                match(T__2);
                setState(51);
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
        enterRule(_localctx, 6, RULE_funcArg);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                ((FuncArgContext) _localctx).argType = match(IDENT);
                setState(54);
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

    public final FuncCallContext funcCall() throws RecognitionException {
        FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_funcCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(56);
                ((FuncCallContext) _localctx).name = match(IDENT);
                setState(57);
                match(T__0);
                setState(58);
                ((FuncCallContext) _localctx).args = funcCallArgs();
                setState(59);
                match(T__2);
                setState(60);
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
        enterRule(_localctx, 10, RULE_funcCallArgs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(70);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INT_LITERAL || _la == STR_LITERAL) {
                    {
                        setState(62);
                        expr();
                        setState(67);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__1) {
                            {
                                {
                                    setState(63);
                                    match(T__1);
                                    setState(64);
                                    expr();
                                }
                            }
                            setState(69);
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
        enterRule(_localctx, 12, RULE_varDeclare);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(72);
                ((VarDeclareContext) _localctx).varType = match(IDENT);
                setState(73);
                ((VarDeclareContext) _localctx).name = match(IDENT);
                setState(74);
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

    public final VarAssignContext varAssign() throws RecognitionException {
        VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_varAssign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                ((VarAssignContext) _localctx).name = match(IDENT);
                setState(77);
                match(T__4);
                setState(78);
                ((VarAssignContext) _localctx).val = expr();
                setState(79);
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

    public final AsmContext asm() throws RecognitionException {
        AsmContext _localctx = new AsmContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_asm);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                match(T__5);
                setState(82);
                match(T__0);
                setState(83);
                ((AsmContext) _localctx).code = match(STR_LITERAL);
                setState(84);
                match(T__2);
                setState(85);
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

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(87);
                match(T__6);
                setState(91);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__5 || _la == IDENT) {
                    {
                        {
                            setState(88);
                            statement();
                        }
                    }
                    setState(93);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(94);
                match(T__7);
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
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                _la = _input.LA(1);
                if (!(_la == INT_LITERAL || _la == STR_LITERAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT_LITERAL() {
            return getToken(GrammarParser.INT_LITERAL, 0);
        }

        public TerminalNode STR_LITERAL() {
            return getToken(GrammarParser.STR_LITERAL, 0);
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
