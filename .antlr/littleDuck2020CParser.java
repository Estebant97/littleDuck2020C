// Generated from c:\Users\estib\Documents\Compiladores\littleDuck2020C\littleDuck2020C.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class littleDuck2020CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, MULT=3, DIV=4, PLUS=5, MINUS=6, LPAREN=7, RPAREN=8, 
		LBRACKET=9, RBRACKET=10, SEMI=11, COLON=12, COMMA=13, PRINT=14, IF=15, 
		ELSE=16, EQ=17, GT=18, LT=19, NE=20, TYPE_INT=21, TYPE_FLOAT=22, COMMENT=23, 
		WS=24, IDENTIFIER=25, INT=26, FLOAT=27, STRING=28;
	public static final int
		RULE_programa = 0, RULE_programa_vars = 1, RULE_r_vars = 2, RULE_r_vars_1 = 3, 
		RULE_r_vars_2 = 4, RULE_r_vars_3 = 5, RULE_r_vars_4 = 6, RULE_tipo = 7, 
		RULE_bloque = 8, RULE_bloque_1 = 9, RULE_estatuto = 10, RULE_asignacion = 11, 
		RULE_expresion = 12, RULE_expresion_1 = 13, RULE_exp = 14, RULE_exp_1 = 15, 
		RULE_termino = 16, RULE_termino_1 = 17, RULE_factor = 18, RULE_factor_1 = 19, 
		RULE_factor_2 = 20, RULE_var_cte = 21, RULE_condicion = 22, RULE_condicion_1 = 23, 
		RULE_escritura = 24, RULE_escritura_1 = 25, RULE_escritura_2 = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "programa_vars", "r_vars", "r_vars_1", "r_vars_2", "r_vars_3", 
			"r_vars_4", "tipo", "bloque", "bloque_1", "estatuto", "asignacion", "expresion", 
			"expresion_1", "exp", "exp_1", "termino", "termino_1", "factor", "factor_1", 
			"factor_2", "var_cte", "condicion", "condicion_1", "escritura", "escritura_1", 
			"escritura_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", 
			"'{'", "'}'", "';'", "':'", "','", "'print'", "'if'", "'else'", "'='", 
			"'>'", "'<'", "'<>'", "'int'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "MULT", "DIV", "PLUS", "MINUS", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "SEMI", "COLON", "COMMA", "PRINT", "IF", "ELSE", 
			"EQ", "GT", "LT", "NE", "TYPE_INT", "TYPE_FLOAT", "COMMENT", "WS", "IDENTIFIER", 
			"INT", "FLOAT", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "littleDuck2020C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public littleDuck2020CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(littleDuck2020CParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(littleDuck2020CParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(littleDuck2020CParser.SEMI, 0); }
		public Programa_varsContext programa_vars() {
			return getRuleContext(Programa_varsContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PROGRAM);
			setState(55);
			match(IDENTIFIER);
			setState(56);
			match(SEMI);
			setState(57);
			programa_vars();
			setState(58);
			bloque();
			print("Sintaxis valida!");
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

	public static class Programa_varsContext extends ParserRuleContext {
		public R_varsContext r_vars() {
			return getRuleContext(R_varsContext.class,0);
		}
		public Programa_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa_vars; }
	}

	public final Programa_varsContext programa_vars() throws RecognitionException {
		Programa_varsContext _localctx = new Programa_varsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa_vars);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				r_vars();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class R_varsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(littleDuck2020CParser.VAR, 0); }
		public R_vars_1Context r_vars_1() {
			return getRuleContext(R_vars_1Context.class,0);
		}
		public R_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_vars; }
	}

	public final R_varsContext r_vars() throws RecognitionException {
		R_varsContext _localctx = new R_varsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_r_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(VAR);
			setState(66);
			r_vars_1();
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

	public static class R_vars_1Context extends ParserRuleContext {
		public R_vars_2Context r_vars_2() {
			return getRuleContext(R_vars_2Context.class,0);
		}
		public TerminalNode COLON() { return getToken(littleDuck2020CParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(littleDuck2020CParser.SEMI, 0); }
		public R_vars_4Context r_vars_4() {
			return getRuleContext(R_vars_4Context.class,0);
		}
		public R_vars_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_vars_1; }
	}

	public final R_vars_1Context r_vars_1() throws RecognitionException {
		R_vars_1Context _localctx = new R_vars_1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_r_vars_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			r_vars_2();
			setState(69);
			match(COLON);
			setState(70);
			tipo();
			setState(71);
			match(SEMI);
			setState(72);
			r_vars_4();
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

	public static class R_vars_2Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(littleDuck2020CParser.IDENTIFIER, 0); }
		public R_vars_3Context r_vars_3() {
			return getRuleContext(R_vars_3Context.class,0);
		}
		public R_vars_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_vars_2; }
	}

	public final R_vars_2Context r_vars_2() throws RecognitionException {
		R_vars_2Context _localctx = new R_vars_2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_r_vars_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			r_vars_3();
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

	public static class R_vars_3Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(littleDuck2020CParser.COMMA, 0); }
		public R_vars_2Context r_vars_2() {
			return getRuleContext(R_vars_2Context.class,0);
		}
		public R_vars_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_vars_3; }
	}

	public final R_vars_3Context r_vars_3() throws RecognitionException {
		R_vars_3Context _localctx = new R_vars_3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_r_vars_3);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(COMMA);
				setState(78);
				r_vars_2();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class R_vars_4Context extends ParserRuleContext {
		public R_vars_1Context r_vars_1() {
			return getRuleContext(R_vars_1Context.class,0);
		}
		public R_vars_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_vars_4; }
	}

	public final R_vars_4Context r_vars_4() throws RecognitionException {
		R_vars_4Context _localctx = new R_vars_4Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_r_vars_4);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				r_vars_1();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(littleDuck2020CParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(littleDuck2020CParser.TYPE_FLOAT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==TYPE_INT || _la==TYPE_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(littleDuck2020CParser.LBRACKET, 0); }
		public Bloque_1Context bloque_1() {
			return getRuleContext(Bloque_1Context.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(littleDuck2020CParser.RBRACKET, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LBRACKET);
			setState(89);
			bloque_1();
			setState(90);
			match(RBRACKET);
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

	public static class Bloque_1Context extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public Bloque_1Context bloque_1() {
			return getRuleContext(Bloque_1Context.class,0);
		}
		public Bloque_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_1; }
	}

	public final Bloque_1Context bloque_1() throws RecognitionException {
		Bloque_1Context _localctx = new Bloque_1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloque_1);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case IF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				estatuto();
				setState(93);
				bloque_1();
				}
				break;
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_estatuto);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				condicion();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				escritura();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(littleDuck2020CParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(littleDuck2020CParser.EQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(littleDuck2020CParser.SEMI, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IDENTIFIER);
			setState(104);
			match(EQ);
			setState(105);
			expresion();
			setState(106);
			match(SEMI);
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion_1Context expresion_1() {
			return getRuleContext(Expresion_1Context.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			exp();
			setState(109);
			expresion_1();
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

	public static class Expresion_1Context extends ParserRuleContext {
		public TerminalNode GT() { return getToken(littleDuck2020CParser.GT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode LT() { return getToken(littleDuck2020CParser.LT, 0); }
		public TerminalNode NE() { return getToken(littleDuck2020CParser.NE, 0); }
		public Expresion_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_1; }
	}

	public final Expresion_1Context expresion_1() throws RecognitionException {
		Expresion_1Context _localctx = new Expresion_1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion_1);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(GT);
				setState(112);
				exp();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(LT);
				setState(114);
				exp();
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(NE);
				setState(116);
				exp();
				}
				break;
			case RPAREN:
			case SEMI:
			case COMMA:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp_1Context exp_1() {
			return getRuleContext(Exp_1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			termino();
			setState(121);
			exp_1();
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

	public static class Exp_1Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(littleDuck2020CParser.PLUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(littleDuck2020CParser.MINUS, 0); }
		public Exp_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_1; }
	}

	public final Exp_1Context exp_1() throws RecognitionException {
		Exp_1Context _localctx = new Exp_1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_1);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(PLUS);
				setState(124);
				exp();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(MINUS);
				setState(126);
				exp();
				}
				break;
			case RPAREN:
			case SEMI:
			case COMMA:
			case GT:
			case LT:
			case NE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino_1Context termino_1() {
			return getRuleContext(Termino_1Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			factor();
			setState(131);
			termino_1();
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

	public static class Termino_1Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(littleDuck2020CParser.MULT, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode DIV() { return getToken(littleDuck2020CParser.DIV, 0); }
		public Termino_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_1; }
	}

	public final Termino_1Context termino_1() throws RecognitionException {
		Termino_1Context _localctx = new Termino_1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_termino_1);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(MULT);
				setState(134);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(DIV);
				setState(136);
				termino();
				}
				break;
			case PLUS:
			case MINUS:
			case RPAREN:
			case SEMI:
			case COMMA:
			case GT:
			case LT:
			case NE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FactorContext extends ParserRuleContext {
		public Factor_1Context factor_1() {
			return getRuleContext(Factor_1Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			factor_1();
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

	public static class Factor_1Context extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(littleDuck2020CParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(littleDuck2020CParser.RPAREN, 0); }
		public Factor_2Context factor_2() {
			return getRuleContext(Factor_2Context.class,0);
		}
		public Var_cteContext var_cte() {
			return getRuleContext(Var_cteContext.class,0);
		}
		public Factor_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_1; }
	}

	public final Factor_1Context factor_1() throws RecognitionException {
		Factor_1Context _localctx = new Factor_1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor_1);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(LPAREN);
				setState(143);
				expresion();
				setState(144);
				match(RPAREN);
				}
				break;
			case PLUS:
			case MINUS:
			case IDENTIFIER:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				factor_2();
				setState(147);
				var_cte();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Factor_2Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(littleDuck2020CParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(littleDuck2020CParser.MINUS, 0); }
		public Factor_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_2; }
	}

	public final Factor_2Context factor_2() throws RecognitionException {
		Factor_2Context _localctx = new Factor_2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor_2);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(MINUS);
				}
				break;
			case IDENTIFIER:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Var_cteContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(littleDuck2020CParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(littleDuck2020CParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(littleDuck2020CParser.FLOAT, 0); }
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(littleDuck2020CParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(littleDuck2020CParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(littleDuck2020CParser.RPAREN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Condicion_1Context condicion_1() {
			return getRuleContext(Condicion_1Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(littleDuck2020CParser.SEMI, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IF);
			setState(159);
			match(LPAREN);
			setState(160);
			expresion();
			setState(161);
			match(RPAREN);
			setState(162);
			bloque();
			setState(163);
			condicion_1();
			setState(164);
			match(SEMI);
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

	public static class Condicion_1Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(littleDuck2020CParser.ELSE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Condicion_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_1; }
	}

	public final Condicion_1Context condicion_1() throws RecognitionException {
		Condicion_1Context _localctx = new Condicion_1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicion_1);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ELSE);
				setState(167);
				bloque();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EscrituraContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(littleDuck2020CParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(littleDuck2020CParser.LPAREN, 0); }
		public Escritura_1Context escritura_1() {
			return getRuleContext(Escritura_1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(littleDuck2020CParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(littleDuck2020CParser.SEMI, 0); }
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_escritura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PRINT);
			setState(172);
			match(LPAREN);
			setState(173);
			escritura_1();
			setState(174);
			match(RPAREN);
			setState(175);
			match(SEMI);
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

	public static class Escritura_1Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Escritura_2Context escritura_2() {
			return getRuleContext(Escritura_2Context.class,0);
		}
		public TerminalNode STRING() { return getToken(littleDuck2020CParser.STRING, 0); }
		public Escritura_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura_1; }
	}

	public final Escritura_1Context escritura_1() throws RecognitionException {
		Escritura_1Context _localctx = new Escritura_1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_escritura_1);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENTIFIER:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				expresion();
				setState(178);
				escritura_2();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(STRING);
				setState(181);
				escritura_2();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Escritura_2Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(littleDuck2020CParser.COMMA, 0); }
		public Escritura_1Context escritura_1() {
			return getRuleContext(Escritura_1Context.class,0);
		}
		public Escritura_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura_2; }
	}

	public final Escritura_2Context escritura_2() throws RecognitionException {
		Escritura_2Context _localctx = new Escritura_2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_escritura_2);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(COMMA);
				setState(185);
				escritura_1();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7"+
		"S\n\7\3\b\3\b\5\bW\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13"+
		"c\n\13\3\f\3\f\3\f\5\fh\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17y\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0083\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u008d\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0098\n"+
		"\25\3\26\3\26\3\26\5\26\u009d\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u00ac\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u00b9\n\33\3\34\3\34\3\34\5\34\u00be"+
		"\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\66\2\4\3\2\27\30\3\2\33\35\2\u00b7\28\3\2\2\2\4A\3\2\2\2\6C\3\2\2"+
		"\2\bF\3\2\2\2\nL\3\2\2\2\fR\3\2\2\2\16V\3\2\2\2\20X\3\2\2\2\22Z\3\2\2"+
		"\2\24b\3\2\2\2\26g\3\2\2\2\30i\3\2\2\2\32n\3\2\2\2\34x\3\2\2\2\36z\3\2"+
		"\2\2 \u0082\3\2\2\2\"\u0084\3\2\2\2$\u008c\3\2\2\2&\u008e\3\2\2\2(\u0097"+
		"\3\2\2\2*\u009c\3\2\2\2,\u009e\3\2\2\2.\u00a0\3\2\2\2\60\u00ab\3\2\2\2"+
		"\62\u00ad\3\2\2\2\64\u00b8\3\2\2\2\66\u00bd\3\2\2\289\7\3\2\29:\7\33\2"+
		"\2:;\7\r\2\2;<\5\4\3\2<=\5\22\n\2=>\b\2\1\2>\3\3\2\2\2?B\5\6\4\2@B\3\2"+
		"\2\2A?\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CD\7\4\2\2DE\5\b\5\2E\7\3\2\2\2FG\5"+
		"\n\6\2GH\7\16\2\2HI\5\20\t\2IJ\7\r\2\2JK\5\16\b\2K\t\3\2\2\2LM\7\33\2"+
		"\2MN\5\f\7\2N\13\3\2\2\2OP\7\17\2\2PS\5\n\6\2QS\3\2\2\2RO\3\2\2\2RQ\3"+
		"\2\2\2S\r\3\2\2\2TW\5\b\5\2UW\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\17\3\2\2\2"+
		"XY\t\2\2\2Y\21\3\2\2\2Z[\7\13\2\2[\\\5\24\13\2\\]\7\f\2\2]\23\3\2\2\2"+
		"^_\5\26\f\2_`\5\24\13\2`c\3\2\2\2ac\3\2\2\2b^\3\2\2\2ba\3\2\2\2c\25\3"+
		"\2\2\2dh\5\30\r\2eh\5.\30\2fh\5\62\32\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2"+
		"h\27\3\2\2\2ij\7\33\2\2jk\7\23\2\2kl\5\32\16\2lm\7\r\2\2m\31\3\2\2\2n"+
		"o\5\36\20\2op\5\34\17\2p\33\3\2\2\2qr\7\24\2\2ry\5\36\20\2st\7\25\2\2"+
		"ty\5\36\20\2uv\7\26\2\2vy\5\36\20\2wy\3\2\2\2xq\3\2\2\2xs\3\2\2\2xu\3"+
		"\2\2\2xw\3\2\2\2y\35\3\2\2\2z{\5\"\22\2{|\5 \21\2|\37\3\2\2\2}~\7\7\2"+
		"\2~\u0083\5\36\20\2\177\u0080\7\b\2\2\u0080\u0083\5\36\20\2\u0081\u0083"+
		"\3\2\2\2\u0082}\3\2\2\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083!\3"+
		"\2\2\2\u0084\u0085\5&\24\2\u0085\u0086\5$\23\2\u0086#\3\2\2\2\u0087\u0088"+
		"\7\5\2\2\u0088\u008d\5\"\22\2\u0089\u008a\7\6\2\2\u008a\u008d\5\"\22\2"+
		"\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d%\3\2\2\2\u008e\u008f\5(\25\2\u008f\'\3\2\2\2\u0090\u0091"+
		"\7\t\2\2\u0091\u0092\5\32\16\2\u0092\u0093\7\n\2\2\u0093\u0098\3\2\2\2"+
		"\u0094\u0095\5*\26\2\u0095\u0096\5,\27\2\u0096\u0098\3\2\2\2\u0097\u0090"+
		"\3\2\2\2\u0097\u0094\3\2\2\2\u0098)\3\2\2\2\u0099\u009d\7\7\2\2\u009a"+
		"\u009d\7\b\2\2\u009b\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d+\3\2\2\2\u009e\u009f\t\3\2\2\u009f-\3\2"+
		"\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\7\n\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\5\60\31\2\u00a6\u00a7"+
		"\7\r\2\2\u00a7/\3\2\2\2\u00a8\u00a9\7\22\2\2\u00a9\u00ac\5\22\n\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\61\3\2\2"+
		"\2\u00ad\u00ae\7\20\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\5\64\33\2\u00b0"+
		"\u00b1\7\n\2\2\u00b1\u00b2\7\r\2\2\u00b2\63\3\2\2\2\u00b3\u00b4\5\32\16"+
		"\2\u00b4\u00b5\5\66\34\2\u00b5\u00b9\3\2\2\2\u00b6\u00b7\7\36\2\2\u00b7"+
		"\u00b9\5\66\34\2\u00b8\u00b3\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\65\3\2"+
		"\2\2\u00ba\u00bb\7\17\2\2\u00bb\u00be\5\64\33\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\67\3\2\2\2\17ARVbgx\u0082\u008c"+
		"\u0097\u009c\u00ab\u00b8\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}