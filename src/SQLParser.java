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
		T__3=10, T__2=11, T__1=12, T__0=13, K_CREATE=14, K_DATABASE=15, K_DATABASES=16, 
		K_DROP=17, K_USE=18, K_SHOW=19, K_ALTER=20, K_RENAME=21, K_TO=22, K_TABLE=23, 
		K_TABLES=24, K_CONSTRAINT=25, K_COLUMN=26, K_COLUMNS=27, K_FROM=28, K_ADD=29, 
		K_SELECT=30, K_WHERE=31, K_INT=32, K_DATE=33, K_CHAR=34, K_FLOAT=35, K_PRIMARY=36, 
		K_CHECK=37, K_REFERENCES=38, K_FOREIGN=39, K_KEY=40, K_INSERT=41, K_INTO=42, 
		K_VALUES=43, K_ORDER=44, K_SET=45, K_UPDATE=46, K_BY=47, K_ASC=48, K_DESC=49, 
		K_AND=50, K_OR=51, K_NOT=52, K_DELETE=53, SPACES=54, SINGLE_LINE_COMMENT=55, 
		MULTILINE_COMMENT=56, ID=57, UNUM=58, NUM=59, CHAR=60;
	public static final String[] tokenNames = {
		"<INVALID>", "') '", "'>='", "'<'", "'='", "'>'", "'<='", "'<>'", "'('", 
		"')'", "'*'", "','", "'-'", "'.'", "K_CREATE", "K_DATABASE", "K_DATABASES", 
		"K_DROP", "K_USE", "K_SHOW", "K_ALTER", "K_RENAME", "K_TO", "K_TABLE", 
		"K_TABLES", "K_CONSTRAINT", "K_COLUMN", "K_COLUMNS", "K_FROM", "K_ADD", 
		"K_SELECT", "K_WHERE", "K_INT", "K_DATE", "K_CHAR", "K_FLOAT", "K_PRIMARY", 
		"K_CHECK", "K_REFERENCES", "K_FOREIGN", "K_KEY", "K_INSERT", "K_INTO", 
		"K_VALUES", "K_ORDER", "K_SET", "K_UPDATE", "K_BY", "K_ASC", "K_DESC", 
		"K_AND", "K_OR", "K_NOT", "K_DELETE", "SPACES", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "ID", "UNUM", "NUM", "CHAR"
	};
	public static final int
		RULE_todo = 0, RULE_casitodo = 1, RULE_database = 2, RULE_data = 3, RULE_table = 4, 
		RULE_tableAction = 5, RULE_tipo = 6, RULE_constraint = 7, RULE_exp = 8, 
		RULE_exp2 = 9, RULE_exp3 = 10, RULE_exp4 = 11, RULE_unifactor = 12, RULE_factor = 13, 
		RULE_literal = 14, RULE_logicExp = 15, RULE_logicExpNot = 16, RULE_logicExpOr = 17, 
		RULE_logicExpAnd = 18, RULE_relationalExpEq = 19, RULE_relationalExpGL = 20, 
		RULE_relationalExp = 21, RULE_insert = 22, RULE_formatValue = 23, RULE_entero = 24, 
		RULE_decimal = 25, RULE_fecha = 26, RULE_character = 27, RULE_update = 28, 
		RULE_condicion = 29, RULE_delete = 30, RULE_query = 31, RULE_expresion = 32;
	public static final String[] ruleNames = {
		"todo", "casitodo", "database", "data", "table", "tableAction", "tipo", 
		"constraint", "exp", "exp2", "exp3", "exp4", "unifactor", "factor", "literal", 
		"logicExp", "logicExpNot", "logicExpOr", "logicExpAnd", "relationalExpEq", 
		"relationalExpGL", "relationalExp", "insert", "formatValue", "entero", 
		"decimal", "fecha", "character", "update", "condicion", "delete", "query", 
		"expresion"
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
	public static class TodoContext extends ParserRuleContext {
		public CasitodoContext casitodo(int i) {
			return getRuleContext(CasitodoContext.class,i);
		}
		public List<CasitodoContext> casitodo() {
			return getRuleContexts(CasitodoContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TodoContext todo() throws RecognitionException {
		TodoContext _localctx = new TodoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_todo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); casitodo();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CREATE) | (1L << K_DROP) | (1L << K_USE) | (1L << K_SHOW) | (1L << K_ALTER) | (1L << K_SELECT) | (1L << K_INSERT) | (1L << K_DELETE))) != 0) );
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

	public static class CasitodoContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public CasitodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casitodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCasitodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCasitodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCasitodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasitodoContext casitodo() throws RecognitionException {
		CasitodoContext _localctx = new CasitodoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_casitodo);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); data();
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
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
	 
		public DatabaseContext() { }
		public void copyFrom(DatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowDBContext extends DatabaseContext {
		public TerminalNode K_DATABASES() { return getToken(SQLParser.K_DATABASES, 0); }
		public TerminalNode K_SHOW() { return getToken(SQLParser.K_SHOW, 0); }
		public ShowDBContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterShowDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitShowDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitShowDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDBContext extends DatabaseContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public DropDBContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDropDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDropDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDropDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseDBContext extends DatabaseContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_USE() { return getToken(SQLParser.K_USE, 0); }
		public UseDBContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUseDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUseDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUseDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDBContext extends DatabaseContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public CreateDBContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreateDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreateDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreateDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterDBContext extends DatabaseContext {
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public AlterDBContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlterDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlterDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlterDB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_database);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case K_CREATE:
				_localctx = new CreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(K_CREATE);
				setState(77); match(K_DATABASE);
				setState(78); match(ID);
				}
				break;
			case K_DROP:
				_localctx = new DropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(K_DROP);
				setState(80); match(K_DATABASE);
				setState(81); match(ID);
				}
				break;
			case K_USE:
				_localctx = new UseDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82); match(K_USE);
				setState(83); match(K_DATABASE);
				setState(84); match(ID);
				}
				break;
			case K_SHOW:
				_localctx = new ShowDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85); match(K_SHOW);
				setState(86); match(K_DATABASES);
				}
				break;
			case K_ALTER:
				_localctx = new AlterDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87); match(K_ALTER);
				setState(88); match(K_DATABASE);
				setState(89); match(ID);
				setState(90); match(K_RENAME);
				setState(91); match(K_TO);
				setState(92); match(ID);
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

	public static class DataContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case K_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); insert();
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); delete();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); query();
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
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	 
		public TableContext() { }
		public void copyFrom(TableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowTBContext extends TableContext {
		public TerminalNode K_TABLES() { return getToken(SQLParser.K_TABLES, 0); }
		public TerminalNode K_SHOW() { return getToken(SQLParser.K_SHOW, 0); }
		public ShowTBContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterShowTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitShowTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitShowTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTBContext extends TableContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public DropTBContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDropTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDropTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDropTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTBContext extends TableContext {
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public RenameTBContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRenameTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRenameTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRenameTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTBContext extends TableContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public List<TerminalNode> K_CONSTRAINT() { return getTokens(SQLParser.K_CONSTRAINT); }
		public TerminalNode K_CONSTRAINT(int i) {
			return getToken(SQLParser.K_CONSTRAINT, i);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public CreateTBContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreateTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreateTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreateTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTBContext extends TableContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public List<TableActionContext> tableAction() {
			return getRuleContexts(TableActionContext.class);
		}
		public TableActionContext tableAction(int i) {
			return getRuleContext(TableActionContext.class,i);
		}
		public AlterTBContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlterTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlterTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlterTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumsContext extends TableContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_SHOW() { return getToken(SQLParser.K_SHOW, 0); }
		public TerminalNode K_COLUMNS() { return getToken(SQLParser.K_COLUMNS, 0); }
		public ShowColumsContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterShowColums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitShowColums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitShowColums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_table);
		int _la;
		try {
			int _alt;
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new CreateTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(K_CREATE);
				setState(101); match(K_TABLE);
				setState(102); match(ID);
				setState(116);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(103); match(T__5);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(104); match(ID);
						setState(105); tipo();
						setState(108);
						_la = _input.LA(1);
						if (_la==K_CONSTRAINT) {
							{
							setState(106); match(K_CONSTRAINT);
							setState(107); constraint();
							}
						}

						}
						}
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(115); match(T__4);
					}
				}

				}
				break;
			case 2:
				_localctx = new AlterTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(K_ALTER);
				setState(119); match(K_TABLE);
				setState(120); match(ID);
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121); tableAction();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new RenameTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127); match(K_ALTER);
				setState(128); match(K_TABLE);
				setState(129); match(ID);
				setState(130); match(K_RENAME);
				setState(131); match(K_TO);
				setState(132); match(ID);
				}
				break;
			case 4:
				_localctx = new DropTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133); match(K_DROP);
				setState(134); match(K_TABLE);
				setState(135); match(ID);
				}
				break;
			case 5:
				_localctx = new ShowTBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136); match(K_SHOW);
				setState(137); match(K_TABLES);
				}
				break;
			case 6:
				_localctx = new ShowColumsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138); match(K_SHOW);
				setState(139); match(K_COLUMNS);
				setState(140); match(K_FROM);
				setState(141); match(ID);
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
		public TableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAction; }
	 
		public TableActionContext() { }
		public void copyFrom(TableActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddColumnTBContext extends TableActionContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public AddColumnTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAddColumnTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAddColumnTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAddColumnTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddConstraintTBContext extends TableActionContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public AddConstraintTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAddConstraintTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAddConstraintTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAddConstraintTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnTBContext extends TableActionContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public DropColumnTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDropColumnTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDropColumnTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDropColumnTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropConstraintTBContext extends TableActionContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public DropConstraintTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDropConstraintTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDropConstraintTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDropConstraintTB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableActionContext tableAction() throws RecognitionException {
		TableActionContext _localctx = new TableActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableAction);
		int _la;
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AddColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144); match(K_ADD);
				setState(145); match(K_COLUMN);
				setState(146); match(ID);
				setState(147); tipo();
				setState(155);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT) {
					{
					setState(148); match(K_CONSTRAINT);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_PRIMARY) | (1L << K_CHECK) | (1L << K_FOREIGN))) != 0)) {
						{
						{
						setState(149); constraint();
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				_localctx = new AddConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157); match(K_ADD);
				setState(158); match(K_CONSTRAINT);
				setState(159); constraint();
				}
				break;
			case 3:
				_localctx = new DropColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160); match(K_DROP);
				setState(161); match(K_COLUMN);
				setState(162); match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163); match(K_DROP);
				setState(164); match(K_CONSTRAINT);
				setState(165); match(ID);
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
		public TerminalNode K_INT() { return getToken(SQLParser.K_INT, 0); }
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public TerminalNode K_FLOAT() { return getToken(SQLParser.K_FLOAT, 0); }
		public TerminalNode K_DATE() { return getToken(SQLParser.K_DATE, 0); }
		public TerminalNode K_CHAR() { return getToken(SQLParser.K_CHAR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case K_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); match(K_INT);
				}
				break;
			case K_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(K_FLOAT);
				}
				break;
			case K_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); match(K_DATE);
				}
				break;
			case K_CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(171); match(K_CHAR);
				setState(172); match(T__5);
				setState(173); match(NUM);
				setState(174); match(T__4);
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
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constraint);
		int _la;
		try {
			setState(206);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(K_PRIMARY);
				setState(178); match(K_KEY);
				setState(179); match(T__5);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(180); match(ID);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(181); match(T__2);
						setState(182); match(ID);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193); match(T__4);
				}
				break;
			case K_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(K_FOREIGN);
				setState(195); match(K_KEY);
				setState(196); match(T__5);
				setState(197); match(ID);
				setState(198); match(T__4);
				setState(199); match(K_REFERENCES);
				setState(200); match(ID);
				setState(201); match(T__5);
				setState(202); match(ID);
				setState(203); match(T__4);
				}
				break;
			case K_CHECK:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); match(K_CHECK);
				{
				setState(205); exp(0);
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
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LogicExpAndContext logicExpAnd() {
			return getRuleContext(LogicExpAndContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209); exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(211);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(212); logicExpAnd();
					setState(213); exp2(0);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public LogicExpOrContext logicExpOr() {
			return getRuleContext(LogicExpOrContext.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		return exp2(0);
	}

	private Exp2Context exp2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp2Context _localctx = new Exp2Context(_ctx, _parentState);
		Exp2Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221); exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224); logicExpOr();
					setState(225); exp3(0);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp3Context extends ParserRuleContext {
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public RelationalExpEqContext relationalExpEq() {
			return getRuleContext(RelationalExpEqContext.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		return exp3(0);
	}

	private Exp3Context exp3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp3Context _localctx = new Exp3Context(_ctx, _parentState);
		Exp3Context _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233); exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(235);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(236); relationalExpEq();
					setState(237); exp4(0);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp4Context extends ParserRuleContext {
		public List<Exp4Context> exp4() {
			return getRuleContexts(Exp4Context.class);
		}
		public UnifactorContext unifactor() {
			return getRuleContext(UnifactorContext.class,0);
		}
		public Exp4Context exp4(int i) {
			return getRuleContext(Exp4Context.class,i);
		}
		public RelationalExpGLContext relationalExpGL() {
			return getRuleContext(RelationalExpGLContext.class,0);
		}
		public Exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp4Context exp4() throws RecognitionException {
		return exp4(0);
	}

	private Exp4Context exp4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp4Context _localctx = new Exp4Context(_ctx, _parentState);
		Exp4Context _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(245); unifactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(247);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(248); relationalExpGL();
					setState(249); exp4(3);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnifactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public UnifactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unifactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnifactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnifactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnifactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnifactorContext unifactor() throws RecognitionException {
		UnifactorContext _localctx = new UnifactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unifactor);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case K_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); match(K_NOT);
				setState(257); factor();
				}
				break;
			case T__5:
			case T__1:
			case UNUM:
			case NUM:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); factor();
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case T__1:
			case UNUM:
			case NUM:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); literal();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(262); match(T__5);
				setState(263); exp(0);
				setState(264); match(T__4);
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

	public static class LiteralContext extends ParserRuleContext {
		public FormatValueContext formatValue() {
			return getRuleContext(FormatValueContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); formatValue();
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
		public LogicExpAndContext logicExpAnd() {
			return getRuleContext(LogicExpAndContext.class,0);
		}
		public LogicExpNotContext logicExpNot() {
			return getRuleContext(LogicExpNotContext.class,0);
		}
		public LogicExpOrContext logicExpOr() {
			return getRuleContext(LogicExpOrContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpContext logicExp() throws RecognitionException {
		LogicExpContext _localctx = new LogicExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicExp);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case K_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); logicExpAnd();
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); logicExpOr();
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); logicExpNot();
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

	public static class LogicExpNotContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public LogicExpNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLogicExpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLogicExpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLogicExpNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpNotContext logicExpNot() throws RecognitionException {
		LogicExpNotContext _localctx = new LogicExpNotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicExpNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(K_NOT);
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

	public static class LogicExpOrContext extends ParserRuleContext {
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public LogicExpOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLogicExpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLogicExpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLogicExpOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpOrContext logicExpOr() throws RecognitionException {
		LogicExpOrContext _localctx = new LogicExpOrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicExpOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(K_OR);
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

	public static class LogicExpAndContext extends ParserRuleContext {
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public LogicExpAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLogicExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLogicExpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLogicExpAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpAndContext logicExpAnd() throws RecognitionException {
		LogicExpAndContext _localctx = new LogicExpAndContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicExpAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(K_AND);
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

	public static class RelationalExpEqContext extends ParserRuleContext {
		public RelationalExpEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRelationalExpEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRelationalExpEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRelationalExpEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpEqContext relationalExpEq() throws RecognitionException {
		RelationalExpEqContext _localctx = new RelationalExpEqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relationalExpEq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__6) ) {
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

	public static class RelationalExpGLContext extends ParserRuleContext {
		public RelationalExpGLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpGL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRelationalExpGL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRelationalExpGL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRelationalExpGL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpGLContext relationalExpGL() throws RecognitionException {
		RelationalExpGLContext _localctx = new RelationalExpGLContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relationalExpGL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__8) | (1L << T__7))) != 0)) ) {
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

	public static class RelationalExpContext extends ParserRuleContext {
		public RelationalExpEqContext relationalExpEq() {
			return getRuleContext(RelationalExpEqContext.class,0);
		}
		public RelationalExpGLContext relationalExpGL() {
			return getRuleContext(RelationalExpGLContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRelationalExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpContext relationalExp() throws RecognitionException {
		RelationalExpContext _localctx = new RelationalExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relationalExp);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case T__11:
			case T__10:
			case T__8:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); relationalExpGL();
				}
				break;
			case T__9:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); relationalExpEq();
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public List<FormatValueContext> formatValue() {
			return getRuleContexts(FormatValueContext.class);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public FormatValueContext formatValue(int i) {
			return getRuleContext(FormatValueContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(K_INSERT);
			setState(290); match(K_INTO);
			setState(291); match(ID);
			setState(292); match(T__5);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(293); match(ID);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(294); match(T__2);
					setState(295); match(ID);
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); match(T__12);
			setState(307); match(K_VALUES);
			setState(308); match(T__5);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNUM) | (1L << NUM) | (1L << CHAR))) != 0)) {
				{
				{
				setState(309); formatValue();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(310); match(T__2);
					setState(311); formatValue();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322); match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFormatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatValueContext formatValue() throws RecognitionException {
		FormatValueContext _localctx = new FormatValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formatValue);
		try {
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326); fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327); character();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(330); match(T__1);
				}
			}

			setState(333); match(NUM);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); entero();
			setState(336); match(T__0);
			setState(337); match(NUM);
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
		public List<TerminalNode> UNUM() { return getTokens(SQLParser.UNUM); }
		public TerminalNode UNUM(int i) {
			return getToken(SQLParser.UNUM, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FechaContext fecha() throws RecognitionException {
		FechaContext _localctx = new FechaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(UNUM);
			setState(340); match(UNUM);
			setState(341); match(UNUM);
			setState(342); match(UNUM);
			setState(343); match(T__1);
			setState(344); match(UNUM);
			setState(345); match(UNUM);
			setState(346); match(T__1);
			setState(347); match(UNUM);
			setState(348); match(UNUM);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(CHAR);
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
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(K_UPDATE);
			setState(353); match(ID);
			setState(354); match(K_SET);
			setState(355); condicion();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(356); match(T__2);
				setState(357); condicion();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(363); match(K_WHERE);
				setState(364); condicion();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(367); expresion();
			setState(368); relationalExp();
			setState(371);
			switch (_input.LA(1)) {
			case T__1:
			case UNUM:
			case NUM:
			case CHAR:
				{
				setState(369); formatValue();
				}
				break;
			case ID:
				{
				setState(370); expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(376);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_AND) | (1L << K_OR) | (1L << K_NOT))) != 0)) {
				{
				setState(373); logicExp();
				setState(374); condicion();
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
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(K_DELETE);
			setState(379); match(K_FROM);
			setState(380); match(ID);
			setState(381); match(K_WHERE);
			setState(382); condicion();
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode K_ASC(int i) {
			return getToken(SQLParser.K_ASC, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public List<TerminalNode> K_DESC() { return getTokens(SQLParser.K_DESC); }
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DESC(int i) {
			return getToken(SQLParser.K_DESC, i);
		}
		public List<TerminalNode> K_ASC() { return getTokens(SQLParser.K_ASC); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(K_SELECT);
			setState(394);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(385); match(T__3);
				}
				break;
			case ID:
				{
				{
				setState(386); match(ID);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(387); match(T__2);
					setState(388); match(ID);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(396); match(K_FROM);
			setState(397); match(ID);
			setState(418);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(398); match(K_WHERE);
				setState(399); condicion();
				setState(400); match(K_ORDER);
				setState(401); match(K_BY);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(402); expresion();
					setState(403);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(404); match(T__2);
						setState(405); expresion();
						setState(406);
						_la = _input.LA(1);
						if ( !(_la==K_ASC || _la==K_DESC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(412);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(ID);
			setState(423);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(421); match(T__0);
				setState(422); match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return exp_sempred((ExpContext)_localctx, predIndex);
		case 9: return exp2_sempred((Exp2Context)_localctx, predIndex);
		case 10: return exp3_sempred((Exp3Context)_localctx, predIndex);
		case 11: return exp4_sempred((Exp4Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp4_sempred(Exp4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp3_sempred(Exp3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2F\n\2\r\2\16\2G\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3"+
		"\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\7\6q\n\6\f\6"+
		"\16\6t\13\6\3\6\5\6w\n\6\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0091"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\5\7\u009e"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a9\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ba\n\t\f\t\16"+
		"\t\u00bd\13\t\7\t\u00bf\n\t\f\t\16\t\u00c2\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00da\n\n\f\n\16\n\u00dd\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00e6\n\13\f\13\16\13\u00e9\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00f2\n\f\f\f\16\f\u00f5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fe"+
		"\n\r\f\r\16\r\u0101\13\r\3\16\3\16\3\16\5\16\u0106\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\21\3\21\3\21\5\21\u0114\n\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u0122"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u012b\n\30\f\30\16\30\u012e"+
		"\13\30\7\30\u0130\n\30\f\30\16\30\u0133\13\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u013b\n\30\f\30\16\30\u013e\13\30\7\30\u0140\n\30\f\30\16\30"+
		"\u0143\13\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u014b\n\31\3\32\5\32\u014e"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0169"+
		"\n\36\f\36\16\36\u016c\13\36\3\36\3\36\5\36\u0170\n\36\3\37\3\37\3\37"+
		"\3\37\5\37\u0176\n\37\3\37\3\37\3\37\5\37\u017b\n\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\7!\u0188\n!\f!\16!\u018b\13!\5!\u018d\n!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\7!\u019b\n!\f!\16!\u019e\13!\7!\u01a0\n!\f!\16"+
		"!\u01a3\13!\5!\u01a5\n!\3\"\3\"\3\"\5\"\u01aa\n\"\3\"\2\6\22\24\26\30"+
		"#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2"+
		"\5\4\2\6\6\t\t\4\2\4\5\7\b\3\2\62\63\u01c3\2E\3\2\2\2\4L\3\2\2\2\6_\3"+
		"\2\2\2\bd\3\2\2\2\n\u0090\3\2\2\2\f\u00a8\3\2\2\2\16\u00b1\3\2\2\2\20"+
		"\u00d0\3\2\2\2\22\u00d2\3\2\2\2\24\u00de\3\2\2\2\26\u00ea\3\2\2\2\30\u00f6"+
		"\3\2\2\2\32\u0105\3\2\2\2\34\u010c\3\2\2\2\36\u010e\3\2\2\2 \u0113\3\2"+
		"\2\2\"\u0115\3\2\2\2$\u0117\3\2\2\2&\u0119\3\2\2\2(\u011b\3\2\2\2*\u011d"+
		"\3\2\2\2,\u0121\3\2\2\2.\u0123\3\2\2\2\60\u014a\3\2\2\2\62\u014d\3\2\2"+
		"\2\64\u0151\3\2\2\2\66\u0155\3\2\2\28\u0160\3\2\2\2:\u0162\3\2\2\2<\u0171"+
		"\3\2\2\2>\u017c\3\2\2\2@\u0182\3\2\2\2B\u01a6\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IM\5\6\4\2JM\5\n\6\2KM\5"+
		"\b\5\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\7\20\2\2OP\7\21\2\2"+
		"P`\7;\2\2QR\7\23\2\2RS\7\21\2\2S`\7;\2\2TU\7\24\2\2UV\7\21\2\2V`\7;\2"+
		"\2WX\7\25\2\2X`\7\22\2\2YZ\7\26\2\2Z[\7\21\2\2[\\\7;\2\2\\]\7\27\2\2]"+
		"^\7\30\2\2^`\7;\2\2_N\3\2\2\2_Q\3\2\2\2_T\3\2\2\2_W\3\2\2\2_Y\3\2\2\2"+
		"`\7\3\2\2\2ae\5.\30\2be\5> \2ce\5@!\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\t"+
		"\3\2\2\2fg\7\20\2\2gh\7\31\2\2hv\7;\2\2ir\7\n\2\2jk\7;\2\2kn\5\16\b\2"+
		"lm\7\33\2\2mo\5\20\t\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pj\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uw\7\13\2\2vi\3\2\2\2vw\3\2"+
		"\2\2w\u0091\3\2\2\2xy\7\26\2\2yz\7\31\2\2z~\7;\2\2{}\5\f\7\2|{\3\2\2\2"+
		"}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0091\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081\u0082\7\26\2\2\u0082\u0083\7\31\2\2\u0083\u0084\7;\2\2\u0084"+
		"\u0085\7\27\2\2\u0085\u0086\7\30\2\2\u0086\u0091\7;\2\2\u0087\u0088\7"+
		"\23\2\2\u0088\u0089\7\31\2\2\u0089\u0091\7;\2\2\u008a\u008b\7\25\2\2\u008b"+
		"\u0091\7\32\2\2\u008c\u008d\7\25\2\2\u008d\u008e\7\35\2\2\u008e\u008f"+
		"\7\36\2\2\u008f\u0091\7;\2\2\u0090f\3\2\2\2\u0090x\3\2\2\2\u0090\u0081"+
		"\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0091"+
		"\13\3\2\2\2\u0092\u0093\7\37\2\2\u0093\u0094\7\34\2\2\u0094\u0095\7;\2"+
		"\2\u0095\u009d\5\16\b\2\u0096\u009a\7\33\2\2\u0097\u0099\5\20\t\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0096\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a9\3\2\2\2\u009f\u00a0\7\37\2\2\u00a0\u00a1\7"+
		"\33\2\2\u00a1\u00a9\5\20\t\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\7\34\2\2"+
		"\u00a4\u00a9\7;\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\7\33\2\2\u00a7\u00a9"+
		"\7;\2\2\u00a8\u0092\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a9\r\3\2\2\2\u00aa\u00b2\7\"\2\2\u00ab\u00b2\7%\2\2"+
		"\u00ac\u00b2\7#\2\2\u00ad\u00ae\7$\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0"+
		"\7=\2\2\u00b0\u00b2\7\13\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b4\7&\2\2"+
		"\u00b4\u00b5\7*\2\2\u00b5\u00c0\7\n\2\2\u00b6\u00bb\7;\2\2\u00b7\u00b8"+
		"\7\r\2\2\u00b8\u00ba\7;\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00b6\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00d1\7\13"+
		"\2\2\u00c4\u00c5\7)\2\2\u00c5\u00c6\7*\2\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8"+
		"\7;\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\7(\2\2\u00ca\u00cb\7;\2\2\u00cb"+
		"\u00cc\7\n\2\2\u00cc\u00cd\7;\2\2\u00cd\u00d1\7\13\2\2\u00ce\u00cf\7\'"+
		"\2\2\u00cf\u00d1\5\22\n\2\u00d0\u00b3\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\21\3\2\2\2\u00d2\u00d3\b\n\1\2\u00d3\u00d4\5\24\13"+
		"\2\u00d4\u00db\3\2\2\2\u00d5\u00d6\f\4\2\2\u00d6\u00d7\5&\24\2\u00d7\u00d8"+
		"\5\24\13\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\23\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00df\b\13\1\2\u00df\u00e0\5\26\f\2\u00e0\u00e7\3\2\2\2"+
		"\u00e1\u00e2\f\4\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\5\26\f\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\b\f\1"+
		"\2\u00eb\u00ec\5\30\r\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee\f\4\2\2\u00ee"+
		"\u00ef\5(\25\2\u00ef\u00f0\5\30\r\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3"+
		"\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\27\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b\r\1\2\u00f7\u00f8\5\32\16"+
		"\2\u00f8\u00ff\3\2\2\2\u00f9\u00fa\f\4\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc"+
		"\5\30\r\5\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\31\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\7\66\2\2\u0103\u0106\5\34\17\2\u0104\u0106\5\34\17"+
		"\2\u0105\u0102\3\2\2\2\u0105\u0104\3\2\2\2\u0106\33\3\2\2\2\u0107\u010d"+
		"\5\36\20\2\u0108\u0109\7\n\2\2\u0109\u010a\5\22\n\2\u010a\u010b\7\13\2"+
		"\2\u010b\u010d\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010d\35"+
		"\3\2\2\2\u010e\u010f\5\60\31\2\u010f\37\3\2\2\2\u0110\u0114\5&\24\2\u0111"+
		"\u0114\5$\23\2\u0112\u0114\5\"\22\2\u0113\u0110\3\2\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0112\3\2\2\2\u0114!\3\2\2\2\u0115\u0116\7\66\2\2\u0116#"+
		"\3\2\2\2\u0117\u0118\7\65\2\2\u0118%\3\2\2\2\u0119\u011a\7\64\2\2\u011a"+
		"\'\3\2\2\2\u011b\u011c\t\2\2\2\u011c)\3\2\2\2\u011d\u011e\t\3\2\2\u011e"+
		"+\3\2\2\2\u011f\u0122\5*\26\2\u0120\u0122\5(\25\2\u0121\u011f\3\2\2\2"+
		"\u0121\u0120\3\2\2\2\u0122-\3\2\2\2\u0123\u0124\7+\2\2\u0124\u0125\7,"+
		"\2\2\u0125\u0126\7;\2\2\u0126\u0131\7\n\2\2\u0127\u012c\7;\2\2\u0128\u0129"+
		"\7\r\2\2\u0129\u012b\7;\2\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0127\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\3"+
		"\2\2\u0135\u0136\7-\2\2\u0136\u0141\7\n\2\2\u0137\u013c\5\60\31\2\u0138"+
		"\u0139\7\r\2\2\u0139\u013b\5\60\31\2\u013a\u0138\3\2\2\2\u013b\u013e\3"+
		"\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0137\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7\13\2\2\u0145/\3\2\2\2\u0146\u014b\5\62\32\2\u0147\u014b\5\64"+
		"\33\2\u0148\u014b\5\66\34\2\u0149\u014b\58\35\2\u014a\u0146\3\2\2\2\u014a"+
		"\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\61\3\2\2"+
		"\2\u014c\u014e\7\16\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\7=\2\2\u0150\63\3\2\2\2\u0151\u0152\5\62\32"+
		"\2\u0152\u0153\7\17\2\2\u0153\u0154\7=\2\2\u0154\65\3\2\2\2\u0155\u0156"+
		"\7<\2\2\u0156\u0157\7<\2\2\u0157\u0158\7<\2\2\u0158\u0159\7<\2\2\u0159"+
		"\u015a\7\16\2\2\u015a\u015b\7<\2\2\u015b\u015c\7<\2\2\u015c\u015d\7\16"+
		"\2\2\u015d\u015e\7<\2\2\u015e\u015f\7<\2\2\u015f\67\3\2\2\2\u0160\u0161"+
		"\7>\2\2\u01619\3\2\2\2\u0162\u0163\7\60\2\2\u0163\u0164\7;\2\2\u0164\u0165"+
		"\7/\2\2\u0165\u016a\5<\37\2\u0166\u0167\7\r\2\2\u0167\u0169\5<\37\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016f\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7!\2\2\u016e"+
		"\u0170\5<\37\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170;\3\2\2\2"+
		"\u0171\u0172\5B\"\2\u0172\u0175\5,\27\2\u0173\u0176\5\60\31\2\u0174\u0176"+
		"\5B\"\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u017a\3\2\2\2\u0177"+
		"\u0178\5 \21\2\u0178\u0179\5<\37\2\u0179\u017b\3\2\2\2\u017a\u0177\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b=\3\2\2\2\u017c\u017d\7\67\2\2\u017d\u017e"+
		"\7\36\2\2\u017e\u017f\7;\2\2\u017f\u0180\7!\2\2\u0180\u0181\5<\37\2\u0181"+
		"?\3\2\2\2\u0182\u018c\7 \2\2\u0183\u018d\7\f\2\2\u0184\u0189\7;\2\2\u0185"+
		"\u0186\7\r\2\2\u0186\u0188\7;\2\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018c\u0183\3\2\2\2\u018c\u0184\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u018f\7\36\2\2\u018f\u01a4\7;\2\2\u0190\u0191\7!\2\2\u0191"+
		"\u0192\5<\37\2\u0192\u0193\7.\2\2\u0193\u01a1\7\61\2\2\u0194\u0195\5B"+
		"\"\2\u0195\u019c\t\4\2\2\u0196\u0197\7\r\2\2\u0197\u0198\5B\"\2\u0198"+
		"\u0199\t\4\2\2\u0199\u019b\3\2\2\2\u019a\u0196\3\2\2\2\u019b\u019e\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u0194\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u0190\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5A\3\2\2\2\u01a6\u01a9\7;\2\2\u01a7"+
		"\u01a8\7\17\2\2\u01a8\u01aa\7;\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aaC\3\2\2\2*GL_dnrv~\u0090\u009a\u009d\u00a8\u00b1\u00bb\u00c0"+
		"\u00d0\u00db\u00e7\u00f3\u00ff\u0105\u010c\u0113\u0121\u012c\u0131\u013c"+
		"\u0141\u014a\u014d\u016a\u016f\u0175\u017a\u0189\u018c\u019c\u01a1\u01a4"+
		"\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}