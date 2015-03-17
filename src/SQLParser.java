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
		T__52=1, T__51=2, T__50=3, T__49=4, T__48=5, T__47=6, T__46=7, T__45=8, 
		T__44=9, T__43=10, T__42=11, T__41=12, T__40=13, T__39=14, T__38=15, T__37=16, 
		T__36=17, T__35=18, T__34=19, T__33=20, T__32=21, T__31=22, T__30=23, 
		T__29=24, T__28=25, T__27=26, T__26=27, T__25=28, T__24=29, T__23=30, 
		T__22=31, T__21=32, T__20=33, T__19=34, T__18=35, T__17=36, T__16=37, 
		T__15=38, T__14=39, T__13=40, T__12=41, T__11=42, T__10=43, T__9=44, T__8=45, 
		T__7=46, T__6=47, T__5=48, T__4=49, T__3=50, T__2=51, T__1=52, T__0=53, 
		SPACES=54, SINGLE_LINE_COMMENT=55, MULTILINE_COMMENT=56, ID=57, NUM=58, 
		CHAR=59, DIGIT=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'FOREIGN'", "'CONSTRAINT'", "') '", "'FROM'", "'char'", 
		"'REFERENCES'", "'='", "'('", "','", "'PRIMARY'", "'COLUMNS'", "'ASC'", 
		"'VALUES'", "'CHECK'", "'UPDATE'", "'DELETE'", "'>='", "'<'", "'TABLES'", 
		"'<>'", "'INSERT'", "'SHOW'", "'CREATE'", "'COLUMN'", "'TABLE'", "'DATABASES'", 
		"'BY'", "'WHERE'", "'INTO'", "'AND'", "'NOT'", "'<='", "'ADD'", "'KEY'", 
		"'ORDER'", "'*'", "'SELECT'", "'.'", "'DROP'", "'DATE'", "'INT'", "'TO'", 
		"'RENAME'", "'>'", "'OR'", "'ALTER'", "'USE'", "'FLOAT'", "')'", "'DESC'", 
		"'DATABASE'", "'-'", "'SET'", "SPACES", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"ID", "NUM", "CHAR", "DIGIT"
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
			setState(120); match(T__30);
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
			setState(122); match(T__2);
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
			setState(124); match(T__27);
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
			setState(126); match(T__14);
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
			setState(128); match(T__6);
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
			setState(130); match(T__31);
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
			setState(132); match(T__7);
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
			setState(134); match(T__10);
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
			setState(136); match(T__11);
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
			setState(138); match(T__28);
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
			setState(140); match(T__34);
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
			setState(142); match(T__51);
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
			setState(144); match(T__29);
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
			setState(146); match(T__42);
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
			setState(148); match(T__49);
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
			setState(150); match(T__20);
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
			setState(152); match(T__16);
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
			setState(154); match(T__25);
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
			setState(156); match(T__12);
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
			setState(158); match(T__13);
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
			setState(160); match(T__48);
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
			setState(162); match(T__5);
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
			setState(164); match(T__43);
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
			setState(166); match(T__39);
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
			setState(168); match(T__47);
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
			setState(170); match(T__52);
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
			setState(172); match(T__19);
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
			setState(174); match(T__32);
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
			setState(176); match(T__24);
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
			setState(178); match(T__40);
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
			setState(180); match(T__18);
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
			setState(182); match(T__0);
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
			setState(184); match(T__38);
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
			setState(186); match(T__26);
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
			setState(188); match(T__41);
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
			setState(190); match(T__3);
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
			setState(192); match(T__23);
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
			setState(194); match(T__8);
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
			setState(196); match(T__22);
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
			setState(198); match(T__37);
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
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
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
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); table();
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
		public K_dropContext k_drop() {
			return getRuleContext(K_dropContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public K_databaseContext k_database() {
			return getRuleContext(K_databaseContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public K_useContext k_use() {
			return getRuleContext(K_useContext.class,0);
		}
		public K_databasesContext k_databases() {
			return getRuleContext(K_databasesContext.class,0);
		}
		public K_renameContext k_rename() {
			return getRuleContext(K_renameContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_toContext k_to() {
			return getRuleContext(K_toContext.class,0);
		}
		public K_showContext k_show() {
			return getRuleContext(K_showContext.class,0);
		}
		public K_alterContext k_alter() {
			return getRuleContext(K_alterContext.class,0);
		}
		public K_createContext k_create() {
			return getRuleContext(K_createContext.class,0);
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
			setState(230);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); k_create();
				setState(205); k_database();
				setState(206); match(ID);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); k_drop();
				setState(209); k_database();
				setState(210); match(ID);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); k_use();
				setState(213); k_database();
				setState(214); match(ID);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(216); k_show();
				setState(217); k_databases();
				setState(218); match(ID);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(220); k_alter();
				setState(221); k_database();
				setState(222); match(ID);
				setState(223); k_rename();
				setState(224); k_to();
				setState(225); match(ID);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(227); insert();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 7);
				{
				setState(228); delete();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(229); query();
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

	public static class TableContext extends ParserRuleContext {
		public K_columnsContext k_columns() {
			return getRuleContext(K_columnsContext.class,0);
		}
		public K_fromContext k_from() {
			return getRuleContext(K_fromContext.class,0);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public K_dropContext k_drop() {
			return getRuleContext(K_dropContext.class,0);
		}
		public List<TableActionContext> tableAction() {
			return getRuleContexts(TableActionContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public List<K_constraintContext> k_constraint() {
			return getRuleContexts(K_constraintContext.class);
		}
		public K_tablesContext k_tables() {
			return getRuleContext(K_tablesContext.class,0);
		}
		public K_tableContext k_table() {
			return getRuleContext(K_tableContext.class,0);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public K_renameContext k_rename() {
			return getRuleContext(K_renameContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_constraintContext k_constraint(int i) {
			return getRuleContext(K_constraintContext.class,i);
		}
		public K_toContext k_to() {
			return getRuleContext(K_toContext.class,0);
		}
		public K_showContext k_show() {
			return getRuleContext(K_showContext.class,0);
		}
		public K_alterContext k_alter() {
			return getRuleContext(K_alterContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public K_createContext k_create() {
			return getRuleContext(K_createContext.class,0);
		}
		public TableActionContext tableAction(int i) {
			return getRuleContext(TableActionContext.class,i);
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
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); k_create();
				setState(233); k_table();
				setState(234); match(ID);
				setState(249);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(235); match(T__45);
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(236); match(ID);
						setState(237); tipo();
						setState(241);
						_la = _input.LA(1);
						if (_la==T__51) {
							{
							setState(238); k_constraint();
							setState(239); constraint();
							}
						}

						}
						}
						setState(247);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(248); match(T__4);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); k_alter();
				setState(252); k_table();
				setState(253); match(ID);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20 || _la==T__14) {
					{
					{
					setState(254); tableAction();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260); k_alter();
				setState(261); k_table();
				setState(262); match(ID);
				setState(263); k_rename();
				setState(264); k_to();
				setState(265); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267); k_drop();
				setState(268); k_table();
				setState(269); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271); k_show();
				setState(272); k_tables();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274); k_show();
				setState(275); k_columns();
				setState(276); k_from();
				setState(277); match(ID);
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
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public K_addContext k_add() {
			return getRuleContext(K_addContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public K_dropContext k_drop() {
			return getRuleContext(K_dropContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public K_constraintContext k_constraint() {
			return getRuleContext(K_constraintContext.class,0);
		}
		public K_columnContext k_column() {
			return getRuleContext(K_columnContext.class,0);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
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
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); k_add();
				setState(282); k_column();
				setState(283); match(ID);
				setState(284); tipo();
				setState(292);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(285); k_constraint();
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__43) | (1L << T__39))) != 0)) {
						{
						{
						setState(286); constraint();
						}
						}
						setState(291);
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
				setState(294); k_add();
				setState(295); k_constraint();
				setState(296); constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298); k_drop();
				setState(299); k_column();
				setState(300); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302); k_drop();
				setState(303); k_constraint();
				setState(304); match(ID);
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
		public K_charContext k_char() {
			return getRuleContext(K_charContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public K_intContext k_int() {
			return getRuleContext(K_intContext.class,0);
		}
		public K_floatContext k_float() {
			return getRuleContext(K_floatContext.class,0);
		}
		public K_dateContext k_date() {
			return getRuleContext(K_dateContext.class,0);
		}
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
			setState(316);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); k_int();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); k_float();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(310); k_date();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(311); k_char();
				setState(312); match(T__45);
				setState(313); match(NUM);
				setState(314); match(T__4);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_foreignContext k_foreign() {
			return getRuleContext(K_foreignContext.class,0);
		}
		public K_referencesContext k_references() {
			return getRuleContext(K_referencesContext.class,0);
		}
		public K_primaryContext k_primary() {
			return getRuleContext(K_primaryContext.class,0);
		}
		public K_keyContext k_key() {
			return getRuleContext(K_keyContext.class,0);
		}
		public K_checkContext k_check() {
			return getRuleContext(K_checkContext.class,0);
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
			setState(350);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); k_primary();
				setState(319); k_key();
				setState(320); match(T__45);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(321); match(ID);
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__44) {
						{
						{
						setState(322); match(T__44);
						setState(323); match(ID);
						}
						}
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334); match(T__4);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); k_foreign();
				setState(337); k_key();
				setState(338); match(T__45);
				setState(339); match(ID);
				setState(340); match(T__4);
				setState(341); k_references();
				setState(342); match(ID);
				setState(343); match(T__45);
				setState(344); match(ID);
				setState(345); match(T__4);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(347); k_check();
				{
				setState(348); exp();
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
		public RelationalExpContext relationalExp() {
			return getRuleContext(RelationalExpContext.class,0);
		}
		public LogicExpContext logicExp() {
			return getRuleContext(LogicExpContext.class,0);
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
			setState(354);
			switch (_input.LA(1)) {
			case T__23:
			case T__22:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(352); logicExp();
				}
				break;
			case T__46:
			case T__36:
			case T__35:
			case T__33:
			case T__21:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); relationalExp();
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
		public K_notContext k_not() {
			return getRuleContext(K_notContext.class,0);
		}
		public K_orContext k_or() {
			return getRuleContext(K_orContext.class,0);
		}
		public K_andContext k_and() {
			return getRuleContext(K_andContext.class,0);
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
			setState(359);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(356); k_and();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(357); k_or();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(358); k_not();
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
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__21) | (1L << T__9))) != 0)) ) {
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
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public List<FormatValueContext> formatValue() {
			return getRuleContexts(FormatValueContext.class);
		}
		public K_intoContext k_into() {
			return getRuleContext(K_intoContext.class,0);
		}
		public K_insertContext k_insert() {
			return getRuleContext(K_insertContext.class,0);
		}
		public FormatValueContext formatValue(int i) {
			return getRuleContext(FormatValueContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public K_valuesContext k_values() {
			return getRuleContext(K_valuesContext.class,0);
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
			setState(363); k_insert();
			setState(364); k_into();
			setState(365); match(ID);
			setState(366); match(T__45);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(367); match(ID);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(368); match(T__44);
					setState(369); match(ID);
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380); match(T__50);
			setState(381); k_values();
			setState(382); match(T__45);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUM) | (1L << CHAR) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(383); formatValue();
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(384); match(T__44);
					setState(385); formatValue();
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396); match(T__4);
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
		public FechaContext fecha() {
			return getRuleContext(FechaContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
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
			setState(402);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400); fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401); character();
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
			setState(405);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(404); match(T__1);
				}
			}

			setState(407); match(NUM);
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
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
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
			setState(409); entero();
			setState(410); match(T__15);
			setState(411); match(NUM);
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
			setState(413); match(DIGIT);
			setState(414); match(DIGIT);
			setState(415); match(DIGIT);
			setState(416); match(DIGIT);
			setState(417); match(T__1);
			setState(418); match(DIGIT);
			setState(419); match(DIGIT);
			setState(420); match(T__1);
			setState(421); match(DIGIT);
			setState(422); match(DIGIT);
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
			setState(424); match(CHAR);
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
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public K_whereContext k_where() {
			return getRuleContext(K_whereContext.class,0);
		}
		public K_updateContext k_update() {
			return getRuleContext(K_updateContext.class,0);
		}
		public K_setContext k_set() {
			return getRuleContext(K_setContext.class,0);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
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
			setState(426); k_update();
			setState(427); match(ID);
			setState(428); k_set();
			setState(429); condicion();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__44) {
				{
				{
				setState(430); match(T__44);
				setState(431); condicion();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(437); k_where();
				setState(438); condicion();
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
		public RelationalExpContext relationalExp() {
			return getRuleContext(RelationalExpContext.class,0);
		}
		public FormatValueContext formatValue() {
			return getRuleContext(FormatValueContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public LogicExpContext logicExp() {
			return getRuleContext(LogicExpContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(442); expresion();
			setState(443); relationalExp();
			setState(446);
			switch (_input.LA(1)) {
			case T__1:
			case NUM:
			case CHAR:
			case DIGIT:
				{
				setState(444); formatValue();
				}
				break;
			case ID:
				{
				setState(445); expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(451);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__22) | (1L << T__8))) != 0)) {
				{
				setState(448); logicExp();
				setState(449); condicion();
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

	public static class DeleteContext extends ParserRuleContext {
		public K_fromContext k_from() {
			return getRuleContext(K_fromContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public K_whereContext k_where() {
			return getRuleContext(K_whereContext.class,0);
		}
		public K_deleteContext k_delete() {
			return getRuleContext(K_deleteContext.class,0);
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
			setState(453); k_delete();
			setState(454); k_from();
			setState(455); match(ID);
			setState(456); k_where();
			setState(457); condicion();
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
		public K_fromContext k_from() {
			return getRuleContext(K_fromContext.class,0);
		}
		public List<K_ascContext> k_asc() {
			return getRuleContexts(K_ascContext.class);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public K_whereContext k_where() {
			return getRuleContext(K_whereContext.class,0);
		}
		public K_ascContext k_asc(int i) {
			return getRuleContext(K_ascContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public K_orderContext k_order() {
			return getRuleContext(K_orderContext.class,0);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public K_byContext k_by() {
			return getRuleContext(K_byContext.class,0);
		}
		public K_descContext k_desc(int i) {
			return getRuleContext(K_descContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public K_selectContext k_select() {
			return getRuleContext(K_selectContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public List<K_descContext> k_desc() {
			return getRuleContexts(K_descContext.class);
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
			setState(459); k_select();
			setState(469);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(460); match(T__17);
				}
				break;
			case ID:
				{
				{
				setState(461); match(ID);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(462); match(T__44);
					setState(463); match(ID);
					}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(471); k_from();
			setState(472); match(ID);
			setState(473); k_where();
			setState(474); condicion();
			setState(475); k_order();
			setState(476); k_by();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(477); expresion();
				setState(480);
				switch (_input.LA(1)) {
				case T__41:
					{
					setState(478); k_asc();
					}
					break;
				case T__3:
					{
					setState(479); k_desc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(482); match(T__44);
					setState(483); expresion();
					setState(486);
					switch (_input.LA(1)) {
					case T__41:
						{
						setState(484); k_asc();
						}
						break;
					case T__3:
						{
						setState(485); k_desc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(497);
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
			setState(498); match(ID);
			setState(501);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(499); match(T__15);
				setState(500); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u01fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\5"+
		"*\u00cd\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u00e9\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u00f4\n"+
		",\7,\u00f6\n,\f,\16,\u00f9\13,\3,\5,\u00fc\n,\3,\3,\3,\3,\7,\u0102\n,"+
		"\f,\16,\u0105\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u011a\n,\3-\3-\3-\3-\3-\3-\7-\u0122\n-\f-\16-\u0125\13-\5-\u0127"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0135\n-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u013f\n.\3/\3/\3/\3/\3/\3/\7/\u0147\n/\f/\16/\u014a\13/\7/\u014c"+
		"\n/\f/\16/\u014f\13/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5"+
		"/\u0161\n/\3\60\3\60\5\60\u0165\n\60\3\61\3\61\3\61\5\61\u016a\n\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0175\n\63\f\63\16\63"+
		"\u0178\13\63\7\63\u017a\n\63\f\63\16\63\u017d\13\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u0185\n\63\f\63\16\63\u0188\13\63\7\63\u018a\n\63\f\63"+
		"\16\63\u018d\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0195\n\64\3\65"+
		"\5\65\u0198\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\39\39\39\39\39\39\79\u01b3\n9\f9"+
		"\169\u01b6\139\39\39\39\59\u01bb\n9\3:\3:\3:\3:\5:\u01c1\n:\3:\3:\3:\5"+
		":\u01c6\n:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\7<\u01d3\n<\f<\16<\u01d6\13"+
		"<\5<\u01d8\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01e3\n<\3<\3<\3<\3<\5<\u01e9"+
		"\n<\7<\u01eb\n<\f<\16<\u01ee\13<\7<\u01f0\n<\f<\16<\u01f3\13<\3=\3=\3"+
		"=\5=\u01f8\n=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\3\7\2\t\t\23\24\26\26"+
		"\"\"..\u01f0\2z\3\2\2\2\4|\3\2\2\2\6~\3\2\2\2\b\u0080\3\2\2\2\n\u0082"+
		"\3\2\2\2\f\u0084\3\2\2\2\16\u0086\3\2\2\2\20\u0088\3\2\2\2\22\u008a\3"+
		"\2\2\2\24\u008c\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2"+
		"\2\2\34\u0094\3\2\2\2\36\u0096\3\2\2\2 \u0098\3\2\2\2\"\u009a\3\2\2\2"+
		"$\u009c\3\2\2\2&\u009e\3\2\2\2(\u00a0\3\2\2\2*\u00a2\3\2\2\2,\u00a4\3"+
		"\2\2\2.\u00a6\3\2\2\2\60\u00a8\3\2\2\2\62\u00aa\3\2\2\2\64\u00ac\3\2\2"+
		"\2\66\u00ae\3\2\2\28\u00b0\3\2\2\2:\u00b2\3\2\2\2<\u00b4\3\2\2\2>\u00b6"+
		"\3\2\2\2@\u00b8\3\2\2\2B\u00ba\3\2\2\2D\u00bc\3\2\2\2F\u00be\3\2\2\2H"+
		"\u00c0\3\2\2\2J\u00c2\3\2\2\2L\u00c4\3\2\2\2N\u00c6\3\2\2\2P\u00c8\3\2"+
		"\2\2R\u00cc\3\2\2\2T\u00e8\3\2\2\2V\u0119\3\2\2\2X\u0134\3\2\2\2Z\u013e"+
		"\3\2\2\2\\\u0160\3\2\2\2^\u0164\3\2\2\2`\u0169\3\2\2\2b\u016b\3\2\2\2"+
		"d\u016d\3\2\2\2f\u0194\3\2\2\2h\u0197\3\2\2\2j\u019b\3\2\2\2l\u019f\3"+
		"\2\2\2n\u01aa\3\2\2\2p\u01ac\3\2\2\2r\u01bc\3\2\2\2t\u01c7\3\2\2\2v\u01cd"+
		"\3\2\2\2x\u01f4\3\2\2\2z{\7\31\2\2{\3\3\2\2\2|}\7\65\2\2}\5\3\2\2\2~\177"+
		"\7\34\2\2\177\7\3\2\2\2\u0080\u0081\7)\2\2\u0081\t\3\2\2\2\u0082\u0083"+
		"\7\61\2\2\u0083\13\3\2\2\2\u0084\u0085\7\30\2\2\u0085\r\3\2\2\2\u0086"+
		"\u0087\7\60\2\2\u0087\17\3\2\2\2\u0088\u0089\7-\2\2\u0089\21\3\2\2\2\u008a"+
		"\u008b\7,\2\2\u008b\23\3\2\2\2\u008c\u008d\7\33\2\2\u008d\25\3\2\2\2\u008e"+
		"\u008f\7\25\2\2\u008f\27\3\2\2\2\u0090\u0091\7\4\2\2\u0091\31\3\2\2\2"+
		"\u0092\u0093\7\32\2\2\u0093\33\3\2\2\2\u0094\u0095\7\r\2\2\u0095\35\3"+
		"\2\2\2\u0096\u0097\7\6\2\2\u0097\37\3\2\2\2\u0098\u0099\7#\2\2\u0099!"+
		"\3\2\2\2\u009a\u009b\7\'\2\2\u009b#\3\2\2\2\u009c\u009d\7\36\2\2\u009d"+
		"%\3\2\2\2\u009e\u009f\7+\2\2\u009f\'\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1"+
		")\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3+\3\2\2\2\u00a4\u00a5\7\62\2\2\u00a5"+
		"-\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7/\3\2\2\2\u00a8\u00a9\7\20\2\2\u00a9"+
		"\61\3\2\2\2\u00aa\u00ab\7\b\2\2\u00ab\63\3\2\2\2\u00ac\u00ad\7\3\2\2\u00ad"+
		"\65\3\2\2\2\u00ae\u00af\7$\2\2\u00af\67\3\2\2\2\u00b0\u00b1\7\27\2\2\u00b1"+
		"9\3\2\2\2\u00b2\u00b3\7\37\2\2\u00b3;\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5"+
		"=\3\2\2\2\u00b6\u00b7\7%\2\2\u00b7?\3\2\2\2\u00b8\u00b9\7\67\2\2\u00b9"+
		"A\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bbC\3\2\2\2\u00bc\u00bd\7\35\2\2\u00bd"+
		"E\3\2\2\2\u00be\u00bf\7\16\2\2\u00bfG\3\2\2\2\u00c0\u00c1\7\64\2\2\u00c1"+
		"I\3\2\2\2\u00c2\u00c3\7 \2\2\u00c3K\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5M"+
		"\3\2\2\2\u00c6\u00c7\7!\2\2\u00c7O\3\2\2\2\u00c8\u00c9\7\22\2\2\u00c9"+
		"Q\3\2\2\2\u00ca\u00cd\5T+\2\u00cb\u00cd\5V,\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cdS\3\2\2\2\u00ce\u00cf\5\2\2\2\u00cf\u00d0\5\4\3\2"+
		"\u00d0\u00d1\7;\2\2\u00d1\u00e9\3\2\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4"+
		"\5\4\3\2\u00d4\u00d5\7;\2\2\u00d5\u00e9\3\2\2\2\u00d6\u00d7\5\n\6\2\u00d7"+
		"\u00d8\5\4\3\2\u00d8\u00d9\7;\2\2\u00d9\u00e9\3\2\2\2\u00da\u00db\5\f"+
		"\7\2\u00db\u00dc\5\6\4\2\u00dc\u00dd\7;\2\2\u00dd\u00e9\3\2\2\2\u00de"+
		"\u00df\5\16\b\2\u00df\u00e0\5\4\3\2\u00e0\u00e1\7;\2\2\u00e1\u00e2\5\20"+
		"\t\2\u00e2\u00e3\5\22\n\2\u00e3\u00e4\7;\2\2\u00e4\u00e9\3\2\2\2\u00e5"+
		"\u00e9\5d\63\2\u00e6\u00e9\5t;\2\u00e7\u00e9\5v<\2\u00e8\u00ce\3\2\2\2"+
		"\u00e8\u00d2\3\2\2\2\u00e8\u00d6\3\2\2\2\u00e8\u00da\3\2\2\2\u00e8\u00de"+
		"\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"U\3\2\2\2\u00ea\u00eb\5\2\2\2\u00eb\u00ec\5\24\13\2\u00ec\u00fb\7;\2\2"+
		"\u00ed\u00f7\7\n\2\2\u00ee\u00ef\7;\2\2\u00ef\u00f3\5Z.\2\u00f0\u00f1"+
		"\5\30\r\2\u00f1\u00f2\5\\/\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fc\7\63\2\2\u00fb\u00ed\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u011a\3\2\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\5\24\13\2"+
		"\u00ff\u0103\7;\2\2\u0100\u0102\5X-\2\u0101\u0100\3\2\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u011a\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0107\5\16\b\2\u0107\u0108\5\24\13\2\u0108\u0109"+
		"\7;\2\2\u0109\u010a\5\20\t\2\u010a\u010b\5\22\n\2\u010b\u010c\7;\2\2\u010c"+
		"\u011a\3\2\2\2\u010d\u010e\5\b\5\2\u010e\u010f\5\24\13\2\u010f\u0110\7"+
		";\2\2\u0110\u011a\3\2\2\2\u0111\u0112\5\f\7\2\u0112\u0113\5\26\f\2\u0113"+
		"\u011a\3\2\2\2\u0114\u0115\5\f\7\2\u0115\u0116\5\34\17\2\u0116\u0117\5"+
		"\36\20\2\u0117\u0118\7;\2\2\u0118\u011a\3\2\2\2\u0119\u00ea\3\2\2\2\u0119"+
		"\u00fd\3\2\2\2\u0119\u0106\3\2\2\2\u0119\u010d\3\2\2\2\u0119\u0111\3\2"+
		"\2\2\u0119\u0114\3\2\2\2\u011aW\3\2\2\2\u011b\u011c\5 \21\2\u011c\u011d"+
		"\5\32\16\2\u011d\u011e\7;\2\2\u011e\u0126\5Z.\2\u011f\u0123\5\30\r\2\u0120"+
		"\u0122\5\\/\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u011f\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0135\3\2\2\2\u0128\u0129\5 "+
		"\21\2\u0129\u012a\5\30\r\2\u012a\u012b\5\\/\2\u012b\u0135\3\2\2\2\u012c"+
		"\u012d\5\b\5\2\u012d\u012e\5\32\16\2\u012e\u012f\7;\2\2\u012f\u0135\3"+
		"\2\2\2\u0130\u0131\5\b\5\2\u0131\u0132\5\30\r\2\u0132\u0133\7;\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u011b\3\2\2\2\u0134\u0128\3\2\2\2\u0134\u012c\3\2"+
		"\2\2\u0134\u0130\3\2\2\2\u0135Y\3\2\2\2\u0136\u013f\5&\24\2\u0137\u013f"+
		"\5,\27\2\u0138\u013f\5(\25\2\u0139\u013a\5*\26\2\u013a\u013b\7\n\2\2\u013b"+
		"\u013c\7<\2\2\u013c\u013d\7\63\2\2\u013d\u013f\3\2\2\2\u013e\u0136\3\2"+
		"\2\2\u013e\u0137\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013f"+
		"[\3\2\2\2\u0140\u0141\5.\30\2\u0141\u0142\5\66\34\2\u0142\u014d\7\n\2"+
		"\2\u0143\u0148\7;\2\2\u0144\u0145\7\13\2\2\u0145\u0147\7;\2\2\u0146\u0144"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0143\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\7\63\2\2\u0151\u0161\3\2\2\2\u0152\u0153\5"+
		"\64\33\2\u0153\u0154\5\66\34\2\u0154\u0155\7\n\2\2\u0155\u0156\7;\2\2"+
		"\u0156\u0157\7\63\2\2\u0157\u0158\5\62\32\2\u0158\u0159\7;\2\2\u0159\u015a"+
		"\7\n\2\2\u015a\u015b\7;\2\2\u015b\u015c\7\63\2\2\u015c\u0161\3\2\2\2\u015d"+
		"\u015e\5\60\31\2\u015e\u015f\5^\60\2\u015f\u0161\3\2\2\2\u0160\u0140\3"+
		"\2\2\2\u0160\u0152\3\2\2\2\u0160\u015d\3\2\2\2\u0161]\3\2\2\2\u0162\u0165"+
		"\5`\61\2\u0163\u0165\5b\62\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"_\3\2\2\2\u0166\u016a\5J&\2\u0167\u016a\5L\'\2\u0168\u016a\5N(\2\u0169"+
		"\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016aa\3\2\2\2"+
		"\u016b\u016c\t\2\2\2\u016cc\3\2\2\2\u016d\u016e\58\35\2\u016e\u016f\5"+
		":\36\2\u016f\u0170\7;\2\2\u0170\u017b\7\n\2\2\u0171\u0176\7;\2\2\u0172"+
		"\u0173\7\13\2\2\u0173\u0175\7;\2\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u0171\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\7\5\2\2\u017f\u0180\5<\37\2\u0180\u018b\7\n\2\2\u0181\u0186\5f"+
		"\64\2\u0182\u0183\7\13\2\2\u0183\u0185\5f\64\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u0181\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u018f\7\63\2\2\u018fe\3\2\2\2\u0190\u0195\5h\65\2\u0191\u0195"+
		"\5j\66\2\u0192\u0195\5l\67\2\u0193\u0195\5n8\2\u0194\u0190\3\2\2\2\u0194"+
		"\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195g\3\2\2\2"+
		"\u0196\u0198\7\66\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019a\7<\2\2\u019ai\3\2\2\2\u019b\u019c\5h\65\2\u019c\u019d"+
		"\7(\2\2\u019d\u019e\7<\2\2\u019ek\3\2\2\2\u019f\u01a0\7>\2\2\u01a0\u01a1"+
		"\7>\2\2\u01a1\u01a2\7>\2\2\u01a2\u01a3\7>\2\2\u01a3\u01a4\7\66\2\2\u01a4"+
		"\u01a5\7>\2\2\u01a5\u01a6\7>\2\2\u01a6\u01a7\7\66\2\2\u01a7\u01a8\7>\2"+
		"\2\u01a8\u01a9\7>\2\2\u01a9m\3\2\2\2\u01aa\u01ab\7=\2\2\u01abo\3\2\2\2"+
		"\u01ac\u01ad\5B\"\2\u01ad\u01ae\7;\2\2\u01ae\u01af\5@!\2\u01af\u01b4\5"+
		"r:\2\u01b0\u01b1\7\13\2\2\u01b1\u01b3\5r:\2\u01b2\u01b0\3\2\2\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01ba\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\5$\23\2\u01b8\u01b9\5r:\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbq\3\2\2\2\u01bc"+
		"\u01bd\5x=\2\u01bd\u01c0\5b\62\2\u01be\u01c1\5f\64\2\u01bf\u01c1\5x=\2"+
		"\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c5\3\2\2\2\u01c2\u01c3"+
		"\5`\61\2\u01c3\u01c4\5r:\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6s\3\2\2\2\u01c7\u01c8\5P)\2\u01c8\u01c9\5\36\20\2"+
		"\u01c9\u01ca\7;\2\2\u01ca\u01cb\5$\23\2\u01cb\u01cc\5r:\2\u01ccu\3\2\2"+
		"\2\u01cd\u01d7\5\"\22\2\u01ce\u01d8\7&\2\2\u01cf\u01d4\7;\2\2\u01d0\u01d1"+
		"\7\13\2\2\u01d1\u01d3\7;\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01cf\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\5\36\20\2\u01da\u01db\7;\2\2\u01db\u01dc\5$\23\2\u01dc\u01dd\5"+
		"r:\2\u01dd\u01de\5> \2\u01de\u01f1\5D#\2\u01df\u01e2\5x=\2\u01e0\u01e3"+
		"\5F$\2\u01e1\u01e3\5H%\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01ec\3\2\2\2\u01e4\u01e5\7\13\2\2\u01e5\u01e8\5x=\2\u01e6\u01e9\5F$"+
		"\2\u01e7\u01e9\5H%\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01eb"+
		"\3\2\2\2\u01ea\u01e4\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01df\3\2"+
		"\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"w\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\7;\2\2\u01f5\u01f6\7(\2\2\u01f6"+
		"\u01f8\7;\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8y\3\2\2\2#"+
		"\u00cc\u00e8\u00f3\u00f7\u00fb\u0103\u0119\u0123\u0126\u0134\u013e\u0148"+
		"\u014d\u0160\u0164\u0169\u0176\u017b\u0186\u018b\u0194\u0197\u01b4\u01ba"+
		"\u01c0\u01c5\u01d4\u01d7\u01e2\u01e8\u01ec\u01f1\u01f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}