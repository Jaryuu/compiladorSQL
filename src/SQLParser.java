// Generated from SQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, SPACES=14, SINGLE_LINE_COMMENT=15, 
		MULTILINE_COMMENT=16, ID=17, NUM=18, CHAR=19, C=20, R=21, E=22, A=23, 
		T=24, D=25, B=26, S=27, O=28, P=29, U=30, H=31, W=32, L=33, N=34, M=35, 
		I=36, F=37, Y=38, K=39, G=40, V=41, DIGIT=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "')'", "','", "'-'", "'*'", "'('", "'<>'", "'<'", 
		"'='", "'<='", "'>'", "') '", "'>='", "SPACES", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "ID", "NUM", "CHAR", "C", "R", "E", "A", "T", "D", 
		"B", "S", "O", "P", "U", "H", "W", "L", "N", "M", "I", "F", "Y", "K", 
		"G", "V", "DIGIT"
	};
	public static final int
		RULE_k_create = 0, RULE_k_database = 1, RULE_k_databases = 2, RULE_k_drop = 3, 
		RULE_k_use = 4, RULE_k_show = 5, RULE_k_alter = 6, RULE_k_rename = 7, 
		RULE_k_to = 8, RULE_k_table = 9, RULE_k_tables = 10, RULE_k_constraint = 11, 
		RULE_k_column = 12, RULE_k_columns = 13, RULE_k_from = 14, RULE_k_add = 15, 
		RULE_k_select = 16, RULE_k_where = 17, RULE_k_int = 18, RULE_k_date = 19, 
		RULE_k_char = 20, RULE_k_float = 21, RULE_k_primary = 22, RULE_k_check = 23, 
		RULE_k_references = 24, RULE_k_foreign = 25, RULE_k_key = 26, RULE_k_insert = 27, 
		RULE_k_into = 28, RULE_k_values = 29, RULE_k_order = 30, RULE_k_set = 31, 
		RULE_k_update = 32, RULE_k_by = 33, RULE_k_asc = 34, RULE_k_desc = 35, 
		RULE_k_and = 36, RULE_k_or = 37, RULE_k_not = 38, RULE_k_delete = 39, 
		RULE_todo = 40, RULE_database = 41, RULE_table = 42, RULE_tableAction = 43, 
		RULE_tipo = 44, RULE_constraint = 45, RULE_exp = 46, RULE_logicExp = 47, 
		RULE_relationalExp = 48, RULE_insert = 49, RULE_formatValue = 50, RULE_entero = 51, 
		RULE_decimal = 52, RULE_fecha = 53, RULE_character = 54, RULE_update = 55, 
		RULE_condicion = 56, RULE_delete = 57, RULE_query = 58, RULE_expresion = 59;
	public static final String[] ruleNames = {
		"k_create", "k_database", "k_databases", "k_drop", "k_use", "k_show", 
		"k_alter", "k_rename", "k_to", "k_table", "k_tables", "k_constraint", 
		"k_column", "k_columns", "k_from", "k_add", "k_select", "k_where", "k_int", 
		"k_date", "k_char", "k_float", "k_primary", "k_check", "k_references", 
		"k_foreign", "k_key", "k_insert", "k_into", "k_values", "k_order", "k_set", 
		"k_update", "k_by", "k_asc", "k_desc", "k_and", "k_or", "k_not", "k_delete", 
		"todo", "database", "table", "tableAction", "tipo", "constraint", "exp", 
		"logicExp", "relationalExp", "insert", "formatValue", "entero", "decimal", 
		"fecha", "character", "update", "condicion", "delete", "query", "expresion"
	};

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class K_createContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode E(int i) {
			return getToken(SQLParser.E, i);
		}
		public List<TerminalNode> E() { return getTokens(SQLParser.E); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_create(this);
		}
	}

	public final K_createContext k_create() throws RecognitionException {
		K_createContext _localctx = new K_createContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_k_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(C);
			setState(121); match(R);
			setState(122); match(E);
			setState(123); match(A);
			setState(124); match(T);
			setState(125); match(E);
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

	public static class K_databaseContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode A(int i) {
			return getToken(SQLParser.A, i);
		}
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public List<TerminalNode> A() { return getTokens(SQLParser.A); }
		public TerminalNode B() { return getToken(SQLParser.B, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_database(this);
		}
	}

	public final K_databaseContext k_database() throws RecognitionException {
		K_databaseContext _localctx = new K_databaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_k_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(D);
			setState(128); match(A);
			setState(129); match(T);
			setState(130); match(A);
			setState(131); match(B);
			setState(132); match(A);
			setState(133); match(S);
			setState(134); match(E);
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

	public static class K_databasesContext extends ParserRuleContext {
		public List<TerminalNode> S() { return getTokens(SQLParser.S); }
		public TerminalNode A(int i) {
			return getToken(SQLParser.A, i);
		}
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public List<TerminalNode> A() { return getTokens(SQLParser.A); }
		public TerminalNode B() { return getToken(SQLParser.B, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public TerminalNode S(int i) {
			return getToken(SQLParser.S, i);
		}
		public K_databasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_databases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_databases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_databases(this);
		}
	}

	public final K_databasesContext k_databases() throws RecognitionException {
		K_databasesContext _localctx = new K_databasesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_k_databases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(D);
			setState(137); match(A);
			setState(138); match(T);
			setState(139); match(A);
			setState(140); match(B);
			setState(141); match(A);
			setState(142); match(S);
			setState(143); match(E);
			setState(144); match(S);
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

	public static class K_dropContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode P() { return getToken(SQLParser.P, 0); }
		public K_dropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_drop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_drop(this);
		}
	}

	public final K_dropContext k_drop() throws RecognitionException {
		K_dropContext _localctx = new K_dropContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_k_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(D);
			setState(147); match(R);
			setState(148); match(O);
			setState(149); match(P);
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

	public static class K_useContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode U() { return getToken(SQLParser.U, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public K_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_use(this);
		}
	}

	public final K_useContext k_use() throws RecognitionException {
		K_useContext _localctx = new K_useContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_k_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(U);
			setState(152); match(S);
			setState(153); match(E);
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

	public static class K_showContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode W() { return getToken(SQLParser.W, 0); }
		public TerminalNode H() { return getToken(SQLParser.H, 0); }
		public K_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_show(this);
		}
	}

	public final K_showContext k_show() throws RecognitionException {
		K_showContext _localctx = new K_showContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_k_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(S);
			setState(156); match(H);
			setState(157); match(O);
			setState(158); match(W);
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

	public static class K_alterContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_alterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_alter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_alter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_alter(this);
		}
	}

	public final K_alterContext k_alter() throws RecognitionException {
		K_alterContext _localctx = new K_alterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_k_alter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(A);
			setState(161); match(L);
			setState(162); match(T);
			setState(163); match(E);
			setState(164); match(R);
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

	public static class K_renameContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode E(int i) {
			return getToken(SQLParser.E, i);
		}
		public List<TerminalNode> E() { return getTokens(SQLParser.E); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode M() { return getToken(SQLParser.M, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public K_renameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_rename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_rename(this);
		}
	}

	public final K_renameContext k_rename() throws RecognitionException {
		K_renameContext _localctx = new K_renameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_k_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(R);
			setState(167); match(E);
			setState(168); match(N);
			setState(169); match(A);
			setState(170); match(M);
			setState(171); match(E);
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

	public static class K_toContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_to(this);
		}
	}

	public final K_toContext k_to() throws RecognitionException {
		K_toContext _localctx = new K_toContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_k_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(T);
			setState(174); match(O);
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

	public static class K_tableContext extends ParserRuleContext {
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode B() { return getToken(SQLParser.B, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_table(this);
		}
	}

	public final K_tableContext k_table() throws RecognitionException {
		K_tableContext _localctx = new K_tableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_k_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(T);
			setState(177); match(A);
			setState(178); match(B);
			setState(179); match(L);
			setState(180); match(E);
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

	public static class K_tablesContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode B() { return getToken(SQLParser.B, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_tablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_tables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_tables(this);
		}
	}

	public final K_tablesContext k_tables() throws RecognitionException {
		K_tablesContext _localctx = new K_tablesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_k_tables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(T);
			setState(183); match(A);
			setState(184); match(B);
			setState(185); match(L);
			setState(186); match(E);
			setState(187); match(S);
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

	public static class K_constraintContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode N(int i) {
			return getToken(SQLParser.N, i);
		}
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode I() { return getToken(SQLParser.I, 0); }
		public List<TerminalNode> N() { return getTokens(SQLParser.N); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public TerminalNode T(int i) {
			return getToken(SQLParser.T, i);
		}
		public List<TerminalNode> T() { return getTokens(SQLParser.T); }
		public K_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_constraint(this);
		}
	}

	public final K_constraintContext k_constraint() throws RecognitionException {
		K_constraintContext _localctx = new K_constraintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_k_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(C);
			setState(190); match(O);
			setState(191); match(N);
			setState(192); match(S);
			setState(193); match(T);
			setState(194); match(R);
			setState(195); match(A);
			setState(196); match(I);
			setState(197); match(N);
			setState(198); match(T);
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

	public static class K_columnContext extends ParserRuleContext {
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode U() { return getToken(SQLParser.U, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public TerminalNode M() { return getToken(SQLParser.M, 0); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public K_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_column(this);
		}
	}

	public final K_columnContext k_column() throws RecognitionException {
		K_columnContext _localctx = new K_columnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_k_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(C);
			setState(201); match(O);
			setState(202); match(L);
			setState(203); match(U);
			setState(204); match(M);
			setState(205); match(N);
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

	public static class K_columnsContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode U() { return getToken(SQLParser.U, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public TerminalNode M() { return getToken(SQLParser.M, 0); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public K_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_columns(this);
		}
	}

	public final K_columnsContext k_columns() throws RecognitionException {
		K_columnsContext _localctx = new K_columnsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_k_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(C);
			setState(208); match(O);
			setState(209); match(L);
			setState(210); match(U);
			setState(211); match(M);
			setState(212); match(N);
			setState(213); match(S);
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

	public static class K_fromContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(SQLParser.F, 0); }
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode M() { return getToken(SQLParser.M, 0); }
		public K_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_from(this);
		}
	}

	public final K_fromContext k_from() throws RecognitionException {
		K_fromContext _localctx = new K_fromContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_k_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(F);
			setState(216); match(R);
			setState(217); match(O);
			setState(218); match(M);
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

	public static class K_addContext extends ParserRuleContext {
		public TerminalNode D(int i) {
			return getToken(SQLParser.D, i);
		}
		public List<TerminalNode> D() { return getTokens(SQLParser.D); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public K_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_add(this);
		}
	}

	public final K_addContext k_add() throws RecognitionException {
		K_addContext _localctx = new K_addContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_k_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(A);
			setState(221); match(D);
			setState(222); match(D);
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

	public static class K_selectContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode E(int i) {
			return getToken(SQLParser.E, i);
		}
		public List<TerminalNode> E() { return getTokens(SQLParser.E); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_select(this);
		}
	}

	public final K_selectContext k_select() throws RecognitionException {
		K_selectContext _localctx = new K_selectContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_k_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(S);
			setState(225); match(E);
			setState(226); match(L);
			setState(227); match(E);
			setState(228); match(C);
			setState(229); match(T);
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

	public static class K_whereContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode E(int i) {
			return getToken(SQLParser.E, i);
		}
		public TerminalNode H() { return getToken(SQLParser.H, 0); }
		public TerminalNode W() { return getToken(SQLParser.W, 0); }
		public List<TerminalNode> E() { return getTokens(SQLParser.E); }
		public K_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_where(this);
		}
	}

	public final K_whereContext k_where() throws RecognitionException {
		K_whereContext _localctx = new K_whereContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_k_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(W);
			setState(232); match(H);
			setState(233); match(E);
			setState(234); match(R);
			setState(235); match(E);
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

	public static class K_intContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public TerminalNode I() { return getToken(SQLParser.I, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_int(this);
		}
	}

	public final K_intContext k_int() throws RecognitionException {
		K_intContext _localctx = new K_intContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_k_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(I);
			setState(238); match(N);
			setState(239); match(T);
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

	public static class K_dateContext extends ParserRuleContext {
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_date(this);
		}
	}

	public final K_dateContext k_date() throws RecognitionException {
		K_dateContext _localctx = new K_dateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_k_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(D);
			setState(242); match(A);
			setState(243); match(T);
			setState(244); match(E);
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

	public static class K_charContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode H() { return getToken(SQLParser.H, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public K_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_char(this);
		}
	}

	public final K_charContext k_char() throws RecognitionException {
		K_charContext _localctx = new K_charContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_k_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(C);
			setState(247); match(H);
			setState(248); match(A);
			setState(249); match(R);
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

	public static class K_floatContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(SQLParser.F, 0); }
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_float(this);
		}
	}

	public final K_floatContext k_float() throws RecognitionException {
		K_floatContext _localctx = new K_floatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_k_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(F);
			setState(252); match(L);
			setState(253); match(O);
			setState(254); match(A);
			setState(255); match(T);
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

	public static class K_primaryContext extends ParserRuleContext {
		public List<TerminalNode> R() { return getTokens(SQLParser.R); }
		public TerminalNode R(int i) {
			return getToken(SQLParser.R, i);
		}
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode M() { return getToken(SQLParser.M, 0); }
		public TerminalNode I() { return getToken(SQLParser.I, 0); }
		public TerminalNode Y() { return getToken(SQLParser.Y, 0); }
		public TerminalNode P() { return getToken(SQLParser.P, 0); }
		public K_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_primary(this);
		}
	}

	public final K_primaryContext k_primary() throws RecognitionException {
		K_primaryContext _localctx = new K_primaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_k_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(P);
			setState(258); match(R);
			setState(259); match(I);
			setState(260); match(M);
			setState(261); match(A);
			setState(262); match(R);
			setState(263); match(Y);
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

	public static class K_checkContext extends ParserRuleContext {
		public TerminalNode C(int i) {
			return getToken(SQLParser.C, i);
		}
		public TerminalNode K() { return getToken(SQLParser.K, 0); }
		public TerminalNode H() { return getToken(SQLParser.H, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public List<TerminalNode> C() { return getTokens(SQLParser.C); }
		public K_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_check(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_check(this);
		}
	}

	public final K_checkContext k_check() throws RecognitionException {
		K_checkContext _localctx = new K_checkContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_k_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(C);
			setState(266); match(H);
			setState(267); match(E);
			setState(268); match(C);
			setState(269); match(K);
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

	public static class K_referencesContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode F() { return getToken(SQLParser.F, 0); }
		public List<TerminalNode> R() { return getTokens(SQLParser.R); }
		public TerminalNode R(int i) {
			return getToken(SQLParser.R, i);
		}
		public TerminalNode E(int i) {
			return getToken(SQLParser.E, i);
		}
		public List<TerminalNode> E() { return getTokens(SQLParser.E); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public K_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_references(this);
		}
	}

	public final K_referencesContext k_references() throws RecognitionException {
		K_referencesContext _localctx = new K_referencesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_k_references);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(R);
			setState(272); match(E);
			setState(273); match(F);
			setState(274); match(E);
			setState(275); match(R);
			setState(276); match(E);
			setState(277); match(N);
			setState(278); match(C);
			setState(279); match(E);
			setState(280); match(S);
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

	public static class K_foreignContext extends ParserRuleContext {
		public TerminalNode G() { return getToken(SQLParser.G, 0); }
		public TerminalNode F() { return getToken(SQLParser.F, 0); }
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public TerminalNode I() { return getToken(SQLParser.I, 0); }
		public K_foreignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_foreign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_foreign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_foreign(this);
		}
	}

	public final K_foreignContext k_foreign() throws RecognitionException {
		K_foreignContext _localctx = new K_foreignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_k_foreign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(F);
			setState(283); match(O);
			setState(284); match(R);
			setState(285); match(E);
			setState(286); match(I);
			setState(287); match(G);
			setState(288); match(N);
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

	public static class K_keyContext extends ParserRuleContext {
		public TerminalNode K() { return getToken(SQLParser.K, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode Y() { return getToken(SQLParser.Y, 0); }
		public K_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_key(this);
		}
	}

	public final K_keyContext k_key() throws RecognitionException {
		K_keyContext _localctx = new K_keyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_k_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(K);
			setState(291); match(E);
			setState(292); match(Y);
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

	public static class K_insertContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public TerminalNode I() { return getToken(SQLParser.I, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_insert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_insert(this);
		}
	}

	public final K_insertContext k_insert() throws RecognitionException {
		K_insertContext _localctx = new K_insertContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_k_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(I);
			setState(295); match(N);
			setState(296); match(S);
			setState(297); match(E);
			setState(298); match(R);
			setState(299); match(T);
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

	public static class K_intoContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public TerminalNode I() { return getToken(SQLParser.I, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_into(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_into(this);
		}
	}

	public final K_intoContext k_into() throws RecognitionException {
		K_intoContext _localctx = new K_intoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_k_into);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(I);
			setState(302); match(N);
			setState(303); match(T);
			setState(304); match(O);
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

	public static class K_valuesContext extends ParserRuleContext {
		public TerminalNode V() { return getToken(SQLParser.V, 0); }
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode U() { return getToken(SQLParser.U, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public K_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_values(this);
		}
	}

	public final K_valuesContext k_values() throws RecognitionException {
		K_valuesContext _localctx = new K_valuesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_k_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(V);
			setState(307); match(A);
			setState(308); match(L);
			setState(309); match(U);
			setState(310); match(E);
			setState(311); match(S);
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

	public static class K_orderContext extends ParserRuleContext {
		public List<TerminalNode> R() { return getTokens(SQLParser.R); }
		public TerminalNode R(int i) {
			return getToken(SQLParser.R, i);
		}
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public K_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_order(this);
		}
	}

	public final K_orderContext k_order() throws RecognitionException {
		K_orderContext _localctx = new K_orderContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_k_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(O);
			setState(314); match(R);
			setState(315); match(D);
			setState(316); match(E);
			setState(317); match(R);
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

	public static class K_setContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_set(this);
		}
	}

	public final K_setContext k_set() throws RecognitionException {
		K_setContext _localctx = new K_setContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_k_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(S);
			setState(320); match(E);
			setState(321); match(T);
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

	public static class K_updateContext extends ParserRuleContext {
		public TerminalNode U() { return getToken(SQLParser.U, 0); }
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode P() { return getToken(SQLParser.P, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_update(this);
		}
	}

	public final K_updateContext k_update() throws RecognitionException {
		K_updateContext _localctx = new K_updateContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_k_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(U);
			setState(324); match(P);
			setState(325); match(D);
			setState(326); match(A);
			setState(327); match(T);
			setState(328); match(E);
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

	public static class K_byContext extends ParserRuleContext {
		public TerminalNode Y() { return getToken(SQLParser.Y, 0); }
		public TerminalNode B() { return getToken(SQLParser.B, 0); }
		public K_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_by(this);
		}
	}

	public final K_byContext k_by() throws RecognitionException {
		K_byContext _localctx = new K_byContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_k_by);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(B);
			setState(331); match(Y);
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

	public static class K_ascContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public K_ascContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_asc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_asc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_asc(this);
		}
	}

	public final K_ascContext k_asc() throws RecognitionException {
		K_ascContext _localctx = new K_ascContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_k_asc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(A);
			setState(334); match(S);
			setState(335); match(C);
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

	public static class K_descContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(SQLParser.S, 0); }
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode E() { return getToken(SQLParser.E, 0); }
		public TerminalNode C() { return getToken(SQLParser.C, 0); }
		public K_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_desc(this);
		}
	}

	public final K_descContext k_desc() throws RecognitionException {
		K_descContext _localctx = new K_descContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_k_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(D);
			setState(338); match(E);
			setState(339); match(S);
			setState(340); match(C);
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

	public static class K_andContext extends ParserRuleContext {
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode A() { return getToken(SQLParser.A, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public K_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_and(this);
		}
	}

	public final K_andContext k_and() throws RecognitionException {
		K_andContext _localctx = new K_andContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_k_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(A);
			setState(343); match(N);
			setState(344); match(D);
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

	public static class K_orContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(SQLParser.R, 0); }
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public K_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_or(this);
		}
	}

	public final K_orContext k_or() throws RecognitionException {
		K_orContext _localctx = new K_orContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_k_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(O);
			setState(347); match(R);
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

	public static class K_notContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(SQLParser.O, 0); }
		public TerminalNode N() { return getToken(SQLParser.N, 0); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_not(this);
		}
	}

	public final K_notContext k_not() throws RecognitionException {
		K_notContext _localctx = new K_notContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_k_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(N);
			setState(350); match(O);
			setState(351); match(T);
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

	public static class K_deleteContext extends ParserRuleContext {
		public TerminalNode L() { return getToken(SQLParser.L, 0); }
		public TerminalNode D() { return getToken(SQLParser.D, 0); }
		public TerminalNode E(int i) {
			return getToken(SQLParser.E, i);
		}
		public List<TerminalNode> E() { return getTokens(SQLParser.E); }
		public TerminalNode T() { return getToken(SQLParser.T, 0); }
		public K_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterK_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitK_delete(this);
		}
	}

	public final K_deleteContext k_delete() throws RecognitionException {
		K_deleteContext _localctx = new K_deleteContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_k_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(D);
			setState(354); match(E);
			setState(355); match(L);
			setState(356); match(E);
			setState(357); match(T);
			setState(358); match(E);
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

	public static class TodoContext extends ParserRuleContext {
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_todo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTodo(this);
		}
	}

	public final TodoContext todo() throws RecognitionException {
		TodoContext _localctx = new TodoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_todo);
		try {
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); table();
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

	public static class DatabaseContext extends ParserRuleContext {
		public K_showContext k_show() {
			return getRuleContext(K_showContext.class,0);
		}
		public K_useContext k_use() {
			return getRuleContext(K_useContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_renameContext k_rename() {
			return getRuleContext(K_renameContext.class,0);
		}
		public K_alterContext k_alter() {
			return getRuleContext(K_alterContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public K_createContext k_create() {
			return getRuleContext(K_createContext.class,0);
		}
		public K_databaseContext k_database() {
			return getRuleContext(K_databaseContext.class,0);
		}
		public K_databasesContext k_databases() {
			return getRuleContext(K_databasesContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public K_dropContext k_drop() {
			return getRuleContext(K_dropContext.class,0);
		}
		public K_toContext k_to() {
			return getRuleContext(K_toContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_database);
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); k_create();
				setState(365); k_database();
				setState(366); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); k_drop();
				setState(369); k_database();
				setState(370); match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372); k_use();
				setState(373); k_database();
				setState(374); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376); k_show();
				setState(377); k_databases();
				setState(378); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380); k_alter();
				setState(381); k_database();
				setState(382); match(ID);
				setState(383); k_rename();
				setState(384); k_to();
				setState(385); match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387); insert();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(388); delete();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(389); query();
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

	public static class TableContext extends ParserRuleContext {
		public K_showContext k_show() {
			return getRuleContext(K_showContext.class,0);
		}
		public TableActionContext tableAction(int i) {
			return getRuleContext(TableActionContext.class,i);
		}
		public K_fromContext k_from() {
			return getRuleContext(K_fromContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_renameContext k_rename() {
			return getRuleContext(K_renameContext.class,0);
		}
		public K_alterContext k_alter() {
			return getRuleContext(K_alterContext.class,0);
		}
		public K_columnsContext k_columns() {
			return getRuleContext(K_columnsContext.class,0);
		}
		public K_createContext k_create() {
			return getRuleContext(K_createContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<TableActionContext> tableAction() {
			return getRuleContexts(TableActionContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public List<K_constraintContext> k_constraint() {
			return getRuleContexts(K_constraintContext.class);
		}
		public K_constraintContext k_constraint(int i) {
			return getRuleContext(K_constraintContext.class,i);
		}
		public K_tablesContext k_tables() {
			return getRuleContext(K_tablesContext.class,0);
		}
		public K_dropContext k_drop() {
			return getRuleContext(K_dropContext.class,0);
		}
		public K_toContext k_to() {
			return getRuleContext(K_toContext.class,0);
		}
		public K_tableContext k_table() {
			return getRuleContext(K_tableContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_table);
		int _la;
		try {
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); k_create();
				setState(393); k_table();
				setState(394); match(ID);
				setState(409);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(395); match(T__7);
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(396); match(ID);
						setState(397); tipo();
						setState(401);
						_la = _input.LA(1);
						if (_la==C) {
							{
							setState(398); k_constraint();
							setState(399); constraint();
							}
						}

						}
						}
						setState(407);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(408); match(T__11);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411); k_alter();
				setState(412); k_table();
				setState(413); match(ID);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==A || _la==D) {
					{
					{
					setState(414); tableAction();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420); k_alter();
				setState(421); k_table();
				setState(422); match(ID);
				setState(423); k_rename();
				setState(424); k_to();
				setState(425); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427); k_drop();
				setState(428); k_table();
				setState(429); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(431); k_show();
				setState(432); k_tables();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(434); k_show();
				setState(435); k_columns();
				setState(436); k_from();
				setState(437); match(ID);
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

	public static class TableActionContext extends ParserRuleContext {
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public K_constraintContext k_constraint() {
			return getRuleContext(K_constraintContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public K_addContext k_add() {
			return getRuleContext(K_addContext.class,0);
		}
		public K_columnContext k_column() {
			return getRuleContext(K_columnContext.class,0);
		}
		public K_dropContext k_drop() {
			return getRuleContext(K_dropContext.class,0);
		}
		public TableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTableAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTableAction(this);
		}
	}

	public final TableActionContext tableAction() throws RecognitionException {
		TableActionContext _localctx = new TableActionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableAction);
		int _la;
		try {
			setState(466);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441); k_add();
				setState(442); k_column();
				setState(443); match(ID);
				setState(444); tipo();
				setState(452);
				_la = _input.LA(1);
				if (_la==C) {
					{
					setState(445); k_constraint();
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << P) | (1L << F))) != 0)) {
						{
						{
						setState(446); constraint();
						}
						}
						setState(451);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454); k_add();
				setState(455); k_constraint();
				setState(456); constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458); k_drop();
				setState(459); k_column();
				setState(460); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(462); k_drop();
				setState(463); k_constraint();
				setState(464); match(ID);
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

	public static class TipoContext extends ParserRuleContext {
		public K_floatContext k_float() {
			return getRuleContext(K_floatContext.class,0);
		}
		public K_charContext k_char() {
			return getRuleContext(K_charContext.class,0);
		}
		public K_intContext k_int() {
			return getRuleContext(K_intContext.class,0);
		}
		public K_dateContext k_date() {
			return getRuleContext(K_dateContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tipo);
		try {
			setState(476);
			switch (_input.LA(1)) {
			case I:
				enterOuterAlt(_localctx, 1);
				{
				setState(468); k_int();
				}
				break;
			case F:
				enterOuterAlt(_localctx, 2);
				{
				setState(469); k_float();
				}
				break;
			case D:
				enterOuterAlt(_localctx, 3);
				{
				setState(470); k_date();
				}
				break;
			case C:
				enterOuterAlt(_localctx, 4);
				{
				setState(471); k_char();
				setState(472); match(T__7);
				setState(473); match(NUM);
				setState(474); match(T__11);
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

	public static class ConstraintContext extends ParserRuleContext {
		public K_keyContext k_key() {
			return getRuleContext(K_keyContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public K_foreignContext k_foreign() {
			return getRuleContext(K_foreignContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_primaryContext k_primary() {
			return getRuleContext(K_primaryContext.class,0);
		}
		public K_checkContext k_check() {
			return getRuleContext(K_checkContext.class,0);
		}
		public K_referencesContext k_references() {
			return getRuleContext(K_referencesContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constraint);
		int _la;
		try {
			setState(510);
			switch (_input.LA(1)) {
			case P:
				enterOuterAlt(_localctx, 1);
				{
				setState(478); k_primary();
				setState(479); k_key();
				setState(480); match(T__7);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(481); match(ID);
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(482); match(T__10);
						setState(483); match(ID);
						}
						}
						setState(488);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494); match(T__11);
				}
				break;
			case F:
				enterOuterAlt(_localctx, 2);
				{
				setState(496); k_foreign();
				setState(497); k_key();
				setState(498); match(T__7);
				setState(499); match(ID);
				setState(500); match(T__11);
				setState(501); k_references();
				setState(502); match(ID);
				setState(503); match(T__7);
				setState(504); match(ID);
				setState(505); match(T__11);
				}
				break;
			case C:
				enterOuterAlt(_localctx, 3);
				{
				setState(507); k_check();
				{
				setState(508); exp();
				}
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
		public LogicExpContext logicExp() {
			return getRuleContext(LogicExpContext.class,0);
		}
		public RelationalExpContext relationalExp() {
			return getRuleContext(RelationalExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_exp);
		try {
			setState(514);
			switch (_input.LA(1)) {
			case A:
			case O:
			case N:
				enterOuterAlt(_localctx, 1);
				{
				setState(512); logicExp();
				}
				break;
			case T__6:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); relationalExp();
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

	public static class LogicExpContext extends ParserRuleContext {
		public K_orContext k_or() {
			return getRuleContext(K_orContext.class,0);
		}
		public K_andContext k_and() {
			return getRuleContext(K_andContext.class,0);
		}
		public K_notContext k_not() {
			return getRuleContext(K_notContext.class,0);
		}
		public LogicExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLogicExp(this);
		}
	}

	public final LogicExpContext logicExp() throws RecognitionException {
		LogicExpContext _localctx = new LogicExpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_logicExp);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case A:
				enterOuterAlt(_localctx, 1);
				{
				setState(516); k_and();
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(517); k_or();
				}
				break;
			case N:
				enterOuterAlt(_localctx, 3);
				{
				setState(518); k_not();
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

	public static class RelationalExpContext extends ParserRuleContext {
		public RelationalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRelationalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRelationalExp(this);
		}
	}

	public final RelationalExpContext relationalExp() throws RecognitionException {
		RelationalExpContext _localctx = new RelationalExpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_relationalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class InsertContext extends ParserRuleContext {
		public K_valuesContext k_values() {
			return getRuleContext(K_valuesContext.class,0);
		}
		public FormatValueContext formatValue(int i) {
			return getRuleContext(FormatValueContext.class,i);
		}
		public List<FormatValueContext> formatValue() {
			return getRuleContexts(FormatValueContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_intoContext k_into() {
			return getRuleContext(K_intoContext.class,0);
		}
		public K_insertContext k_insert() {
			return getRuleContext(K_insertContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); k_insert();
			setState(524); k_into();
			setState(525); match(ID);
			setState(526); match(T__7);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(527); match(ID);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(528); match(T__10);
					setState(529); match(ID);
					}
					}
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540); match(T__1);
			setState(541); k_values();
			setState(542); match(T__7);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << NUM) | (1L << CHAR) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(543); formatValue();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(544); match(T__10);
					setState(545); formatValue();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556); match(T__11);
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

	public static class FormatValueContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public FechaContext fecha() {
			return getRuleContext(FechaContext.class,0);
		}
		public FormatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFormatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFormatValue(this);
		}
	}

	public final FormatValueContext formatValue() throws RecognitionException {
		FormatValueContext _localctx = new FormatValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formatValue);
		try {
			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559); decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560); fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(561); character();
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(564); match(T__9);
				}
			}

			setState(567); match(NUM);
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

	public static class DecimalContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); entero();
			setState(570); match(T__12);
			setState(571); match(NUM);
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

	public static class FechaContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(SQLParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SQLParser.DIGIT); }
		public FechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFecha(this);
		}
	}

	public final FechaContext fecha() throws RecognitionException {
		FechaContext _localctx = new FechaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(DIGIT);
			setState(574); match(DIGIT);
			setState(575); match(DIGIT);
			setState(576); match(DIGIT);
			setState(577); match(T__9);
			setState(578); match(DIGIT);
			setState(579); match(DIGIT);
			setState(580); match(T__9);
			setState(581); match(DIGIT);
			setState(582); match(DIGIT);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); match(CHAR);
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

	public static class UpdateContext extends ParserRuleContext {
		public K_updateContext k_update() {
			return getRuleContext(K_updateContext.class,0);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public K_setContext k_set() {
			return getRuleContext(K_setContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public K_whereContext k_where() {
			return getRuleContext(K_whereContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); k_update();
			setState(587); match(ID);
			setState(588); k_set();
			setState(589); condicion();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(590); match(T__10);
				setState(591); condicion();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			_la = _input.LA(1);
			if (_la==W) {
				{
				setState(597); k_where();
				setState(598); condicion();
				}
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
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public FormatValueContext formatValue() {
			return getRuleContext(FormatValueContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public LogicExpContext logicExp() {
			return getRuleContext(LogicExpContext.class,0);
		}
		public RelationalExpContext relationalExp() {
			return getRuleContext(RelationalExpContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(602); expresion();
			setState(603); relationalExp();
			setState(606);
			switch (_input.LA(1)) {
			case T__9:
			case NUM:
			case CHAR:
			case DIGIT:
				{
				setState(604); formatValue();
				}
				break;
			case ID:
				{
				setState(605); expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(611);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(608); logicExp();
				setState(609); condicion();
				}
				break;
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

	public static class DeleteContext extends ParserRuleContext {
		public K_fromContext k_from() {
			return getRuleContext(K_fromContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public K_deleteContext k_delete() {
			return getRuleContext(K_deleteContext.class,0);
		}
		public K_whereContext k_where() {
			return getRuleContext(K_whereContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); k_delete();
			setState(614); k_from();
			setState(615); match(ID);
			setState(616); k_where();
			setState(617); condicion();
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

	public static class QueryContext extends ParserRuleContext {
		public K_selectContext k_select() {
			return getRuleContext(K_selectContext.class,0);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public K_fromContext k_from() {
			return getRuleContext(K_fromContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_whereContext k_where() {
			return getRuleContext(K_whereContext.class,0);
		}
		public List<K_descContext> k_desc() {
			return getRuleContexts(K_descContext.class);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public K_byContext k_by() {
			return getRuleContext(K_byContext.class,0);
		}
		public K_ascContext k_asc(int i) {
			return getRuleContext(K_ascContext.class,i);
		}
		public K_orderContext k_order() {
			return getRuleContext(K_orderContext.class,0);
		}
		public List<K_ascContext> k_asc() {
			return getRuleContexts(K_ascContext.class);
		}
		public K_descContext k_desc(int i) {
			return getRuleContext(K_descContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); k_select();
			setState(629);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(620); match(T__8);
				}
				break;
			case ID:
				{
				{
				setState(621); match(ID);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(622); match(T__10);
					setState(623); match(ID);
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(631); k_from();
			setState(632); match(ID);
			setState(633); k_where();
			setState(634); condicion();
			setState(635); k_order();
			setState(636); k_by();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(637); expresion();
				setState(640);
				switch (_input.LA(1)) {
				case A:
					{
					setState(638); k_asc();
					}
					break;
				case D:
					{
					setState(639); k_desc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(642); match(T__10);
					setState(643); expresion();
					setState(646);
					switch (_input.LA(1)) {
					case A:
						{
						setState(644); k_asc();
						}
						break;
					case D:
						{
						setState(645); k_desc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658); match(ID);
			setState(661);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(659); match(T__12);
				setState(660); match(ID);
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u029a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\5"+
		"*\u016d\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u0189\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0194\n"+
		",\7,\u0196\n,\f,\16,\u0199\13,\3,\5,\u019c\n,\3,\3,\3,\3,\7,\u01a2\n,"+
		"\f,\16,\u01a5\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u01ba\n,\3-\3-\3-\3-\3-\3-\7-\u01c2\n-\f-\16-\u01c5\13-\5-\u01c7"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01d5\n-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u01df\n.\3/\3/\3/\3/\3/\3/\7/\u01e7\n/\f/\16/\u01ea\13/\7/\u01ec"+
		"\n/\f/\16/\u01ef\13/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5"+
		"/\u0201\n/\3\60\3\60\5\60\u0205\n\60\3\61\3\61\3\61\5\61\u020a\n\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0215\n\63\f\63\16\63"+
		"\u0218\13\63\7\63\u021a\n\63\f\63\16\63\u021d\13\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u0225\n\63\f\63\16\63\u0228\13\63\7\63\u022a\n\63\f\63"+
		"\16\63\u022d\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0235\n\64\3\65"+
		"\5\65\u0238\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\39\39\39\39\39\39\79\u0253\n9\f9"+
		"\169\u0256\139\39\39\39\59\u025b\n9\3:\3:\3:\3:\5:\u0261\n:\3:\3:\3:\5"+
		":\u0266\n:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\7<\u0273\n<\f<\16<\u0276\13"+
		"<\5<\u0278\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0283\n<\3<\3<\3<\3<\5<\u0289"+
		"\n<\7<\u028b\n<\f<\16<\u028e\13<\7<\u0290\n<\f<\16<\u0293\13<\3=\3=\3"+
		"=\5=\u0298\n=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\3\4\2\t\r\17\17\u0290"+
		"\2z\3\2\2\2\4\u0081\3\2\2\2\6\u008a\3\2\2\2\b\u0094\3\2\2\2\n\u0099\3"+
		"\2\2\2\f\u009d\3\2\2\2\16\u00a2\3\2\2\2\20\u00a8\3\2\2\2\22\u00af\3\2"+
		"\2\2\24\u00b2\3\2\2\2\26\u00b8\3\2\2\2\30\u00bf\3\2\2\2\32\u00ca\3\2\2"+
		"\2\34\u00d1\3\2\2\2\36\u00d9\3\2\2\2 \u00de\3\2\2\2\"\u00e2\3\2\2\2$\u00e9"+
		"\3\2\2\2&\u00ef\3\2\2\2(\u00f3\3\2\2\2*\u00f8\3\2\2\2,\u00fd\3\2\2\2."+
		"\u0103\3\2\2\2\60\u010b\3\2\2\2\62\u0111\3\2\2\2\64\u011c\3\2\2\2\66\u0124"+
		"\3\2\2\28\u0128\3\2\2\2:\u012f\3\2\2\2<\u0134\3\2\2\2>\u013b\3\2\2\2@"+
		"\u0141\3\2\2\2B\u0145\3\2\2\2D\u014c\3\2\2\2F\u014f\3\2\2\2H\u0153\3\2"+
		"\2\2J\u0158\3\2\2\2L\u015c\3\2\2\2N\u015f\3\2\2\2P\u0163\3\2\2\2R\u016c"+
		"\3\2\2\2T\u0188\3\2\2\2V\u01b9\3\2\2\2X\u01d4\3\2\2\2Z\u01de\3\2\2\2\\"+
		"\u0200\3\2\2\2^\u0204\3\2\2\2`\u0209\3\2\2\2b\u020b\3\2\2\2d\u020d\3\2"+
		"\2\2f\u0234\3\2\2\2h\u0237\3\2\2\2j\u023b\3\2\2\2l\u023f\3\2\2\2n\u024a"+
		"\3\2\2\2p\u024c\3\2\2\2r\u025c\3\2\2\2t\u0267\3\2\2\2v\u026d\3\2\2\2x"+
		"\u0294\3\2\2\2z{\7\26\2\2{|\7\27\2\2|}\7\30\2\2}~\7\31\2\2~\177\7\32\2"+
		"\2\177\u0080\7\30\2\2\u0080\3\3\2\2\2\u0081\u0082\7\33\2\2\u0082\u0083"+
		"\7\31\2\2\u0083\u0084\7\32\2\2\u0084\u0085\7\31\2\2\u0085\u0086\7\34\2"+
		"\2\u0086\u0087\7\31\2\2\u0087\u0088\7\35\2\2\u0088\u0089\7\30\2\2\u0089"+
		"\5\3\2\2\2\u008a\u008b\7\33\2\2\u008b\u008c\7\31\2\2\u008c\u008d\7\32"+
		"\2\2\u008d\u008e\7\31\2\2\u008e\u008f\7\34\2\2\u008f\u0090\7\31\2\2\u0090"+
		"\u0091\7\35\2\2\u0091\u0092\7\30\2\2\u0092\u0093\7\35\2\2\u0093\7\3\2"+
		"\2\2\u0094\u0095\7\33\2\2\u0095\u0096\7\27\2\2\u0096\u0097\7\36\2\2\u0097"+
		"\u0098\7\37\2\2\u0098\t\3\2\2\2\u0099\u009a\7 \2\2\u009a\u009b\7\35\2"+
		"\2\u009b\u009c\7\30\2\2\u009c\13\3\2\2\2\u009d\u009e\7\35\2\2\u009e\u009f"+
		"\7!\2\2\u009f\u00a0\7\36\2\2\u00a0\u00a1\7\"\2\2\u00a1\r\3\2\2\2\u00a2"+
		"\u00a3\7\31\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\7"+
		"\30\2\2\u00a6\u00a7\7\27\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\27\2\2\u00a9"+
		"\u00aa\7\30\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\7\31\2\2\u00ac\u00ad\7"+
		"%\2\2\u00ad\u00ae\7\30\2\2\u00ae\21\3\2\2\2\u00af\u00b0\7\32\2\2\u00b0"+
		"\u00b1\7\36\2\2\u00b1\23\3\2\2\2\u00b2\u00b3\7\32\2\2\u00b3\u00b4\7\31"+
		"\2\2\u00b4\u00b5\7\34\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7\30\2\2\u00b7"+
		"\25\3\2\2\2\u00b8\u00b9\7\32\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\7\34"+
		"\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\7\35\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\7$\2"+
		"\2\u00c2\u00c3\7\35\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00c5\7\27\2\2\u00c5"+
		"\u00c6\7\31\2\2\u00c6\u00c7\7&\2\2\u00c7\u00c8\7$\2\2\u00c8\u00c9\7\32"+
		"\2\2\u00c9\31\3\2\2\2\u00ca\u00cb\7\26\2\2\u00cb\u00cc\7\36\2\2\u00cc"+
		"\u00cd\7#\2\2\u00cd\u00ce\7 \2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\7$\2\2"+
		"\u00d0\33\3\2\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00d3\7\36\2\2\u00d3\u00d4"+
		"\7#\2\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\7$\2\2\u00d7"+
		"\u00d8\7\35\2\2\u00d8\35\3\2\2\2\u00d9\u00da\7\'\2\2\u00da\u00db\7\27"+
		"\2\2\u00db\u00dc\7\36\2\2\u00dc\u00dd\7%\2\2\u00dd\37\3\2\2\2\u00de\u00df"+
		"\7\31\2\2\u00df\u00e0\7\33\2\2\u00e0\u00e1\7\33\2\2\u00e1!\3\2\2\2\u00e2"+
		"\u00e3\7\35\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\7"+
		"\30\2\2\u00e6\u00e7\7\26\2\2\u00e7\u00e8\7\32\2\2\u00e8#\3\2\2\2\u00e9"+
		"\u00ea\7\"\2\2\u00ea\u00eb\7!\2\2\u00eb\u00ec\7\30\2\2\u00ec\u00ed\7\27"+
		"\2\2\u00ed\u00ee\7\30\2\2\u00ee%\3\2\2\2\u00ef\u00f0\7&\2\2\u00f0\u00f1"+
		"\7$\2\2\u00f1\u00f2\7\32\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\7\33\2\2\u00f4"+
		"\u00f5\7\31\2\2\u00f5\u00f6\7\32\2\2\u00f6\u00f7\7\30\2\2\u00f7)\3\2\2"+
		"\2\u00f8\u00f9\7\26\2\2\u00f9\u00fa\7!\2\2\u00fa\u00fb\7\31\2\2\u00fb"+
		"\u00fc\7\27\2\2\u00fc+\3\2\2\2\u00fd\u00fe\7\'\2\2\u00fe\u00ff\7#\2\2"+
		"\u00ff\u0100\7\36\2\2\u0100\u0101\7\31\2\2\u0101\u0102\7\32\2\2\u0102"+
		"-\3\2\2\2\u0103\u0104\7\37\2\2\u0104\u0105\7\27\2\2\u0105\u0106\7&\2\2"+
		"\u0106\u0107\7%\2\2\u0107\u0108\7\31\2\2\u0108\u0109\7\27\2\2\u0109\u010a"+
		"\7(\2\2\u010a/\3\2\2\2\u010b\u010c\7\26\2\2\u010c\u010d\7!\2\2\u010d\u010e"+
		"\7\30\2\2\u010e\u010f\7\26\2\2\u010f\u0110\7)\2\2\u0110\61\3\2\2\2\u0111"+
		"\u0112\7\27\2\2\u0112\u0113\7\30\2\2\u0113\u0114\7\'\2\2\u0114\u0115\7"+
		"\30\2\2\u0115\u0116\7\27\2\2\u0116\u0117\7\30\2\2\u0117\u0118\7$\2\2\u0118"+
		"\u0119\7\26\2\2\u0119\u011a\7\30\2\2\u011a\u011b\7\35\2\2\u011b\63\3\2"+
		"\2\2\u011c\u011d\7\'\2\2\u011d\u011e\7\36\2\2\u011e\u011f\7\27\2\2\u011f"+
		"\u0120\7\30\2\2\u0120\u0121\7&\2\2\u0121\u0122\7*\2\2\u0122\u0123\7$\2"+
		"\2\u0123\65\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0126\7\30\2\2\u0126\u0127"+
		"\7(\2\2\u0127\67\3\2\2\2\u0128\u0129\7&\2\2\u0129\u012a\7$\2\2\u012a\u012b"+
		"\7\35\2\2\u012b\u012c\7\30\2\2\u012c\u012d\7\27\2\2\u012d\u012e\7\32\2"+
		"\2\u012e9\3\2\2\2\u012f\u0130\7&\2\2\u0130\u0131\7$\2\2\u0131\u0132\7"+
		"\32\2\2\u0132\u0133\7\36\2\2\u0133;\3\2\2\2\u0134\u0135\7+\2\2\u0135\u0136"+
		"\7\31\2\2\u0136\u0137\7#\2\2\u0137\u0138\7 \2\2\u0138\u0139\7\30\2\2\u0139"+
		"\u013a\7\35\2\2\u013a=\3\2\2\2\u013b\u013c\7\36\2\2\u013c\u013d\7\27\2"+
		"\2\u013d\u013e\7\33\2\2\u013e\u013f\7\30\2\2\u013f\u0140\7\27\2\2\u0140"+
		"?\3\2\2\2\u0141\u0142\7\35\2\2\u0142\u0143\7\30\2\2\u0143\u0144\7\32\2"+
		"\2\u0144A\3\2\2\2\u0145\u0146\7 \2\2\u0146\u0147\7\37\2\2\u0147\u0148"+
		"\7\33\2\2\u0148\u0149\7\31\2\2\u0149\u014a\7\32\2\2\u014a\u014b\7\30\2"+
		"\2\u014bC\3\2\2\2\u014c\u014d\7\34\2\2\u014d\u014e\7(\2\2\u014eE\3\2\2"+
		"\2\u014f\u0150\7\31\2\2\u0150\u0151\7\35\2\2\u0151\u0152\7\26\2\2\u0152"+
		"G\3\2\2\2\u0153\u0154\7\33\2\2\u0154\u0155\7\30\2\2\u0155\u0156\7\35\2"+
		"\2\u0156\u0157\7\26\2\2\u0157I\3\2\2\2\u0158\u0159\7\31\2\2\u0159\u015a"+
		"\7$\2\2\u015a\u015b\7\33\2\2\u015bK\3\2\2\2\u015c\u015d\7\36\2\2\u015d"+
		"\u015e\7\27\2\2\u015eM\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161\7\36\2\2"+
		"\u0161\u0162\7\32\2\2\u0162O\3\2\2\2\u0163\u0164\7\33\2\2\u0164\u0165"+
		"\7\30\2\2\u0165\u0166\7#\2\2\u0166\u0167\7\30\2\2\u0167\u0168\7\32\2\2"+
		"\u0168\u0169\7\30\2\2\u0169Q\3\2\2\2\u016a\u016d\5T+\2\u016b\u016d\5V"+
		",\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016dS\3\2\2\2\u016e\u016f"+
		"\5\2\2\2\u016f\u0170\5\4\3\2\u0170\u0171\7\23\2\2\u0171\u0189\3\2\2\2"+
		"\u0172\u0173\5\b\5\2\u0173\u0174\5\4\3\2\u0174\u0175\7\23\2\2\u0175\u0189"+
		"\3\2\2\2\u0176\u0177\5\n\6\2\u0177\u0178\5\4\3\2\u0178\u0179\7\23\2\2"+
		"\u0179\u0189\3\2\2\2\u017a\u017b\5\f\7\2\u017b\u017c\5\6\4\2\u017c\u017d"+
		"\7\23\2\2\u017d\u0189\3\2\2\2\u017e\u017f\5\16\b\2\u017f\u0180\5\4\3\2"+
		"\u0180\u0181\7\23\2\2\u0181\u0182\5\20\t\2\u0182\u0183\5\22\n\2\u0183"+
		"\u0184\7\23\2\2\u0184\u0189\3\2\2\2\u0185\u0189\5d\63\2\u0186\u0189\5"+
		"t;\2\u0187\u0189\5v<\2\u0188\u016e\3\2\2\2\u0188\u0172\3\2\2\2\u0188\u0176"+
		"\3\2\2\2\u0188\u017a\3\2\2\2\u0188\u017e\3\2\2\2\u0188\u0185\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189U\3\2\2\2\u018a\u018b\5\2\2\2"+
		"\u018b\u018c\5\24\13\2\u018c\u019b\7\23\2\2\u018d\u0197\7\b\2\2\u018e"+
		"\u018f\7\23\2\2\u018f\u0193\5Z.\2\u0190\u0191\5\30\r\2\u0191\u0192\5\\"+
		"/\2\u0192\u0194\3\2\2\2\u0193\u0190\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u018e\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019c\7\4\2\2\u019b\u018d\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01ba\3\2"+
		"\2\2\u019d\u019e\5\16\b\2\u019e\u019f\5\24\13\2\u019f\u01a3\7\23\2\2\u01a0"+
		"\u01a2\5X-\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2"+
		"\2\u01a3\u01a4\3\2\2\2\u01a4\u01ba\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7"+
		"\5\16\b\2\u01a7\u01a8\5\24\13\2\u01a8\u01a9\7\23\2\2\u01a9\u01aa\5\20"+
		"\t\2\u01aa\u01ab\5\22\n\2\u01ab\u01ac\7\23\2\2\u01ac\u01ba\3\2\2\2\u01ad"+
		"\u01ae\5\b\5\2\u01ae\u01af\5\24\13\2\u01af\u01b0\7\23\2\2\u01b0\u01ba"+
		"\3\2\2\2\u01b1\u01b2\5\f\7\2\u01b2\u01b3\5\26\f\2\u01b3\u01ba\3\2\2\2"+
		"\u01b4\u01b5\5\f\7\2\u01b5\u01b6\5\34\17\2\u01b6\u01b7\5\36\20\2\u01b7"+
		"\u01b8\7\23\2\2\u01b8\u01ba\3\2\2\2\u01b9\u018a\3\2\2\2\u01b9\u019d\3"+
		"\2\2\2\u01b9\u01a6\3\2\2\2\u01b9\u01ad\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9"+
		"\u01b4\3\2\2\2\u01baW\3\2\2\2\u01bb\u01bc\5 \21\2\u01bc\u01bd\5\32\16"+
		"\2\u01bd\u01be\7\23\2\2\u01be\u01c6\5Z.\2\u01bf\u01c3\5\30\r\2\u01c0\u01c2"+
		"\5\\/\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01bf\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01d5\3\2\2\2\u01c8\u01c9\5 \21\2\u01c9"+
		"\u01ca\5\30\r\2\u01ca\u01cb\5\\/\2\u01cb\u01d5\3\2\2\2\u01cc\u01cd\5\b"+
		"\5\2\u01cd\u01ce\5\32\16\2\u01ce\u01cf\7\23\2\2\u01cf\u01d5\3\2\2\2\u01d0"+
		"\u01d1\5\b\5\2\u01d1\u01d2\5\30\r\2\u01d2\u01d3\7\23\2\2\u01d3\u01d5\3"+
		"\2\2\2\u01d4\u01bb\3\2\2\2\u01d4\u01c8\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d4"+
		"\u01d0\3\2\2\2\u01d5Y\3\2\2\2\u01d6\u01df\5&\24\2\u01d7\u01df\5,\27\2"+
		"\u01d8\u01df\5(\25\2\u01d9\u01da\5*\26\2\u01da\u01db\7\b\2\2\u01db\u01dc"+
		"\7\24\2\2\u01dc\u01dd\7\4\2\2\u01dd\u01df\3\2\2\2\u01de\u01d6\3\2\2\2"+
		"\u01de\u01d7\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01d9\3\2\2\2\u01df[\3"+
		"\2\2\2\u01e0\u01e1\5.\30\2\u01e1\u01e2\5\66\34\2\u01e2\u01ed\7\b\2\2\u01e3"+
		"\u01e8\7\23\2\2\u01e4\u01e5\7\5\2\2\u01e5\u01e7\7\23\2\2\u01e6\u01e4\3"+
		"\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01e3\3\2\2\2\u01ec\u01ef\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f1\7\4\2\2\u01f1\u0201\3\2\2\2\u01f2\u01f3\5\64"+
		"\33\2\u01f3\u01f4\5\66\34\2\u01f4\u01f5\7\b\2\2\u01f5\u01f6\7\23\2\2\u01f6"+
		"\u01f7\7\4\2\2\u01f7\u01f8\5\62\32\2\u01f8\u01f9\7\23\2\2\u01f9\u01fa"+
		"\7\b\2\2\u01fa\u01fb\7\23\2\2\u01fb\u01fc\7\4\2\2\u01fc\u0201\3\2\2\2"+
		"\u01fd\u01fe\5\60\31\2\u01fe\u01ff\5^\60\2\u01ff\u0201\3\2\2\2\u0200\u01e0"+
		"\3\2\2\2\u0200\u01f2\3\2\2\2\u0200\u01fd\3\2\2\2\u0201]\3\2\2\2\u0202"+
		"\u0205\5`\61\2\u0203\u0205\5b\62\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2"+
		"\2\2\u0205_\3\2\2\2\u0206\u020a\5J&\2\u0207\u020a\5L\'\2\u0208\u020a\5"+
		"N(\2\u0209\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a"+
		"a\3\2\2\2\u020b\u020c\t\2\2\2\u020cc\3\2\2\2\u020d\u020e\58\35\2\u020e"+
		"\u020f\5:\36\2\u020f\u0210\7\23\2\2\u0210\u021b\7\b\2\2\u0211\u0216\7"+
		"\23\2\2\u0212\u0213\7\5\2\2\u0213\u0215\7\23\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a\3\2"+
		"\2\2\u0218\u0216\3\2\2\2\u0219\u0211\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u021f\7\16\2\2\u021f\u0220\5<\37\2\u0220\u022b\7\b\2\2\u0221"+
		"\u0226\5f\64\2\u0222\u0223\7\5\2\2\u0223\u0225\5f\64\2\u0224\u0222\3\2"+
		"\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u0221\3\2\2\2\u022a\u022d\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u022f\7\4\2\2\u022fe\3\2\2\2\u0230\u0235\5h\65\2"+
		"\u0231\u0235\5j\66\2\u0232\u0235\5l\67\2\u0233\u0235\5n8\2\u0234\u0230"+
		"\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235"+
		"g\3\2\2\2\u0236\u0238\7\6\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2"+
		"\u0238\u0239\3\2\2\2\u0239\u023a\7\24\2\2\u023ai\3\2\2\2\u023b\u023c\5"+
		"h\65\2\u023c\u023d\7\3\2\2\u023d\u023e\7\24\2\2\u023ek\3\2\2\2\u023f\u0240"+
		"\7,\2\2\u0240\u0241\7,\2\2\u0241\u0242\7,\2\2\u0242\u0243\7,\2\2\u0243"+
		"\u0244\7\6\2\2\u0244\u0245\7,\2\2\u0245\u0246\7,\2\2\u0246\u0247\7\6\2"+
		"\2\u0247\u0248\7,\2\2\u0248\u0249\7,\2\2\u0249m\3\2\2\2\u024a\u024b\7"+
		"\25\2\2\u024bo\3\2\2\2\u024c\u024d\5B\"\2\u024d\u024e\7\23\2\2\u024e\u024f"+
		"\5@!\2\u024f\u0254\5r:\2\u0250\u0251\7\5\2\2\u0251\u0253\5r:\2\u0252\u0250"+
		"\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u025a\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\5$\23\2\u0258\u0259\5r"+
		":\2\u0259\u025b\3\2\2\2\u025a\u0257\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"q\3\2\2\2\u025c\u025d\5x=\2\u025d\u0260\5b\62\2\u025e\u0261\5f\64\2\u025f"+
		"\u0261\5x=\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261\u0265\3\2\2"+
		"\2\u0262\u0263\5`\61\2\u0263\u0264\5r:\2\u0264\u0266\3\2\2\2\u0265\u0262"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266s\3\2\2\2\u0267\u0268\5P)\2\u0268\u0269"+
		"\5\36\20\2\u0269\u026a\7\23\2\2\u026a\u026b\5$\23\2\u026b\u026c\5r:\2"+
		"\u026cu\3\2\2\2\u026d\u0277\5\"\22\2\u026e\u0278\7\7\2\2\u026f\u0274\7"+
		"\23\2\2\u0270\u0271\7\5\2\2\u0271\u0273\7\23\2\2\u0272\u0270\3\2\2\2\u0273"+
		"\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0278\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0277\u026e\3\2\2\2\u0277\u026f\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027a\5\36\20\2\u027a\u027b\7\23\2\2\u027b\u027c"+
		"\5$\23\2\u027c\u027d\5r:\2\u027d\u027e\5> \2\u027e\u0291\5D#\2\u027f\u0282"+
		"\5x=\2\u0280\u0283\5F$\2\u0281\u0283\5H%\2\u0282\u0280\3\2\2\2\u0282\u0281"+
		"\3\2\2\2\u0283\u028c\3\2\2\2\u0284\u0285\7\5\2\2\u0285\u0288\5x=\2\u0286"+
		"\u0289\5F$\2\u0287\u0289\5H%\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2"+
		"\u0289\u028b\3\2\2\2\u028a\u0284\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028f"+
		"\u027f\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292w\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0297\7\23\2\2\u0295\u0296"+
		"\7\3\2\2\u0296\u0298\7\23\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2"+
		"\u0298y\3\2\2\2#\u016c\u0188\u0193\u0197\u019b\u01a3\u01b9\u01c3\u01c6"+
		"\u01d4\u01de\u01e8\u01ed\u0200\u0204\u0209\u0216\u021b\u0226\u022b\u0234"+
		"\u0237\u0254\u025a\u0260\u0265\u0274\u0277\u0282\u0288\u028c\u0291\u0297";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}