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
		MULTILINE_COMMENT=56, ID=57, NUM=58, UNUM=59, DATE=60, CHAR=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'>='", "';'", "'<'", "'='", "'>'", "'<='", "'<>'", "'('", 
		"')'", "'*'", "','", "'-'", "'.'", "K_CREATE", "K_DATABASE", "K_DATABASES", 
		"K_DROP", "K_USE", "K_SHOW", "K_ALTER", "K_RENAME", "K_TO", "K_TABLE", 
		"K_TABLES", "K_CONSTRAINT", "K_COLUMN", "K_COLUMNS", "K_FROM", "K_ADD", 
		"K_SELECT", "K_WHERE", "K_INT", "K_DATE", "K_CHAR", "K_FLOAT", "K_PRIMARY", 
		"K_CHECK", "K_REFERENCES", "K_FOREIGN", "K_KEY", "K_INSERT", "K_INTO", 
		"K_VALUES", "K_ORDER", "K_SET", "K_UPDATE", "K_BY", "K_ASC", "K_DESC", 
		"K_AND", "K_OR", "K_NOT", "K_DELETE", "SPACES", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "ID", "NUM", "UNUM", "DATE", "CHAR"
	};
	public static final int
		RULE_todo = 0, RULE_casitodo = 1, RULE_database = 2, RULE_data = 3, RULE_table = 4, 
		RULE_constraints = 5, RULE_tableAction = 6, RULE_tipo = 7, RULE_constraint = 8, 
		RULE_references = 9, RULE_exp = 10, RULE_expr = 11, RULE_exp2 = 12, RULE_exp3 = 13, 
		RULE_exp4 = 14, RULE_unifactor = 15, RULE_factor = 16, RULE_literal = 17, 
		RULE_logicExp = 18, RULE_logicExpNot = 19, RULE_logicExpOr = 20, RULE_logicExpAnd = 21, 
		RULE_relationalExpEq = 22, RULE_relationalExpGL = 23, RULE_relationalExp = 24, 
		RULE_insert = 25, RULE_formatValue = 26, RULE_entero = 27, RULE_decimal = 28, 
		RULE_fecha = 29, RULE_character = 30, RULE_update = 31, RULE_asignacion = 32, 
		RULE_condicion = 33, RULE_delete = 34, RULE_query = 35, RULE_column = 36, 
		RULE_expresion = 37;
	public static final String[] ruleNames = {
		"todo", "casitodo", "database", "data", "table", "constraints", "tableAction", 
		"tipo", "constraint", "references", "exp", "expr", "exp2", "exp3", "exp4", 
		"unifactor", "factor", "literal", "logicExp", "logicExpNot", "logicExpOr", 
		"logicExpAnd", "relationalExpEq", "relationalExpGL", "relationalExp", 
		"insert", "formatValue", "entero", "decimal", "fecha", "character", "update", 
		"asignacion", "condicion", "delete", "query", "column", "expresion"
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76); casitodo();
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77); match(T__11);
					setState(78); casitodo();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(85);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(84); match(T__11);
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
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); data();
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
			setState(109);
			switch (_input.LA(1)) {
			case K_CREATE:
				_localctx = new CreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92); match(K_CREATE);
				setState(93); match(K_DATABASE);
				setState(94); match(ID);
				}
				break;
			case K_DROP:
				_localctx = new DropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(K_DROP);
				setState(96); match(K_DATABASE);
				setState(97); match(ID);
				}
				break;
			case K_USE:
				_localctx = new UseDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98); match(K_USE);
				setState(99); match(K_DATABASE);
				setState(100); match(ID);
				}
				break;
			case K_SHOW:
				_localctx = new ShowDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101); match(K_SHOW);
				setState(102); match(K_DATABASES);
				}
				break;
			case K_ALTER:
				_localctx = new AlterDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103); match(K_ALTER);
				setState(104); match(K_DATABASE);
				setState(105); match(ID);
				setState(106); match(K_RENAME);
				setState(107); match(K_TO);
				setState(108); match(ID);
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
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
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
			setState(115);
			switch (_input.LA(1)) {
			case K_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); insert();
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); update();
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); delete();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); query();
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
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
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
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CreateTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(K_CREATE);
				setState(118); match(K_TABLE);
				setState(119); match(ID);
				setState(120); match(T__5);
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121); match(ID);
					setState(122); tipo();
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(123); match(T__2);
						setState(124); match(ID);
						setState(125); tipo();
						}
						}
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				{
				setState(135); constraints();
				}
				setState(136); match(T__4);
				}
				break;
			case 2:
				_localctx = new AlterTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(K_ALTER);
				setState(139); match(K_TABLE);
				setState(140); match(ID);
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141); tableAction();
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(142); match(T__2);
						setState(143); tableAction();
						}
						}
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_DROP || _la==K_ADD );
				}
				break;
			case 3:
				_localctx = new RenameTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153); match(K_ALTER);
				setState(154); match(K_TABLE);
				setState(155); match(ID);
				setState(156); match(K_RENAME);
				setState(157); match(K_TO);
				setState(158); match(ID);
				}
				break;
			case 4:
				_localctx = new DropTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159); match(K_DROP);
				setState(160); match(K_TABLE);
				setState(161); match(ID);
				}
				break;
			case 5:
				_localctx = new ShowTBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(162); match(K_SHOW);
				setState(163); match(K_TABLES);
				}
				break;
			case 6:
				_localctx = new ShowColumsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(164); match(K_SHOW);
				setState(165); match(K_COLUMNS);
				setState(166); match(K_FROM);
				setState(167); match(ID);
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

	public static class ConstraintsContext extends ParserRuleContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public List<TerminalNode> K_CONSTRAINT() { return getTokens(SQLParser.K_CONSTRAINT); }
		public TerminalNode K_CONSTRAINT(int i) {
			return getToken(SQLParser.K_CONSTRAINT, i);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CONSTRAINT) {
				{
				{
				setState(170); match(K_CONSTRAINT);
				setState(171); constraint();
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(172); match(T__2);
						setState(173); match(K_CONSTRAINT);
						setState(174); constraint();
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				}
				setState(184);
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
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
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
		enterRule(_localctx, 12, RULE_tableAction);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AddColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(K_ADD);
				setState(186); match(K_COLUMN);
				setState(187); match(ID);
				setState(188); tipo();
				{
				setState(189); constraints();
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191); match(K_ADD);
				setState(192); match(K_CONSTRAINT);
				setState(193); constraint();
				}
				break;
			case 3:
				_localctx = new DropColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194); match(K_DROP);
				setState(195); match(K_COLUMN);
				setState(196); match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197); match(K_DROP);
				setState(198); match(K_CONSTRAINT);
				setState(199); match(ID);
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
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoDateContext extends TipoContext {
		public TerminalNode K_DATE() { return getToken(SQLParser.K_DATE, 0); }
		public TipoDateContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTipoDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTipoDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTipoDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIntContext extends TipoContext {
		public TerminalNode K_INT() { return getToken(SQLParser.K_INT, 0); }
		public TipoIntContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTipoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTipoInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTipoInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoFloatContext extends TipoContext {
		public TerminalNode K_FLOAT() { return getToken(SQLParser.K_FLOAT, 0); }
		public TipoFloatContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTipoFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTipoFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTipoFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoCharContext extends TipoContext {
		public TerminalNode NUM() { return getToken(SQLParser.NUM, 0); }
		public TerminalNode K_CHAR() { return getToken(SQLParser.K_CHAR, 0); }
		public TipoCharContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTipoChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTipoChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTipoChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case K_INT:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202); match(K_INT);
				}
				break;
			case K_FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203); match(K_FLOAT);
				}
				break;
			case K_DATE:
				_localctx = new TipoDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204); match(K_DATE);
				}
				break;
			case K_CHAR:
				_localctx = new TipoCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205); match(K_CHAR);
				setState(206); match(T__5);
				setState(207); match(NUM);
				setState(208); match(T__4);
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
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	 
		public ConstraintContext() { }
		public void copyFrom(ConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CCheckContext extends ConstraintContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public CCheckContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CFKContext extends ConstraintContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public CFKContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCFK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCFK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCFK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CPKContext extends ConstraintContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public CPKContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCPK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCPK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCPK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constraint);
		int _la;
		try {
			setState(251);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				_localctx = new CPKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211); match(K_PRIMARY);
				setState(212); match(K_KEY);
				setState(213); match(ID);
				setState(214); match(T__5);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(215); match(ID);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(216); match(T__2);
						setState(217); match(ID);
						}
						}
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228); match(T__4);
				}
				break;
			case K_FOREIGN:
				_localctx = new CFKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(K_FOREIGN);
				setState(230); match(K_KEY);
				setState(231); match(ID);
				setState(232); match(T__5);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(233); match(ID);
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(234); match(T__2);
						setState(235); match(ID);
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246); match(T__4);
				setState(247); references();
				}
				break;
			case ID:
				_localctx = new CCheckContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248); match(ID);
				setState(249); match(K_CHECK);
				{
				setState(250); exp();
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

	public static class ReferencesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesContext references() throws RecognitionException {
		ReferencesContext _localctx = new ReferencesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(K_REFERENCES);
			setState(254); match(ID);
			setState(255); match(T__5);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(256); match(ID);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(257); match(T__2);
					setState(258); match(ID);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); match(T__4);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpAndContext extends ExprContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public LogicExpAndContext logicExpAnd() {
			return getRuleContext(LogicExpAndContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNotAndContext extends ExprContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpNotAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpNotAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpNotAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpNotAnd(this);
			else return visitor.visitChildren(this);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpNotAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(274); exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpAndContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(276);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(277); logicExpAnd();
					setState(278); exp2(0);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
	 
		public Exp2Context() { }
		public void copyFrom(Exp2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpOrContext extends Exp2Context {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public LogicExpOrContext logicExpOr() {
			return getRuleContext(LogicExpOrContext.class,0);
		}
		public ExpOrContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNotOrContext extends Exp2Context {
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public ExpNotOrContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpNotOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpNotOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpNotOr(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpNotOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(286); exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpOrContext(new Exp2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(288);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(289); logicExpOr();
					setState(290); exp3(0);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
	 
		public Exp3Context() { }
		public void copyFrom(Exp3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpNotEqContext extends Exp3Context {
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public ExpNotEqContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpNotEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpNotEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpEqContext extends Exp3Context {
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public RelationalExpEqContext relationalExpEq() {
			return getRuleContext(RelationalExpEqContext.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public ExpEqContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpEq(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpNotEqContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(298); exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpEqContext(new Exp3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(300);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(301); relationalExpEq();
					setState(302); exp4(0);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public Exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp4; }
	 
		public Exp4Context() { }
		public void copyFrom(Exp4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpGLContext extends Exp4Context {
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public UnifactorContext unifactor() {
			return getRuleContext(UnifactorContext.class,0);
		}
		public RelationalExpGLContext relationalExpGL() {
			return getRuleContext(RelationalExpGLContext.class,0);
		}
		public ExpGLContext(Exp4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpGL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpGL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpGL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNotGlContext extends Exp4Context {
		public UnifactorContext unifactor() {
			return getRuleContext(UnifactorContext.class,0);
		}
		public ExpNotGlContext(Exp4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpNotGl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpNotGl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpNotGl(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpNotGlContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(310); unifactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpGLContext(new Exp4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(312);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(313); relationalExpGL();
					setState(314); unifactor();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public UnifactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unifactor; }
	 
		public UnifactorContext() { }
		public void copyFrom(UnifactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpFactorContext extends UnifactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpFactorContext(UnifactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNotFactorContext extends UnifactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public ExpNotFactorContext(UnifactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpNotFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpNotFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpNotFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnifactorContext unifactor() throws RecognitionException {
		UnifactorContext _localctx = new UnifactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unifactor);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case K_NOT:
				_localctx = new ExpNotFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321); match(K_NOT);
				setState(322); factor();
				}
				break;
			case T__5:
			case T__1:
			case ID:
			case NUM:
			case DATE:
			case CHAR:
				_localctx = new ExpFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323); factor();
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpParenthesesContext extends FactorContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpParenthesesContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpLiteralContext extends FactorContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpLiteralContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpIDContext extends FactorContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ExpIDContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case T__1:
			case NUM:
			case DATE:
			case CHAR:
				_localctx = new ExpLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326); literal();
				}
				break;
			case T__5:
				_localctx = new ExpParenthesesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327); match(T__5);
				setState(328); exp();
				setState(329); match(T__4);
				}
				break;
			case ID:
				_localctx = new ExpIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331); match(ID);
				setState(334);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(332); match(T__0);
					setState(333); match(ID);
					}
					break;
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
		enterRule(_localctx, 34, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); formatValue();
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
		enterRule(_localctx, 36, RULE_logicExp);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case K_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(340); logicExpAnd();
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(341); logicExpOr();
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(342); logicExpNot();
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
		enterRule(_localctx, 38, RULE_logicExpNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(K_NOT);
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
		enterRule(_localctx, 40, RULE_logicExpOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(K_OR);
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
		enterRule(_localctx, 42, RULE_logicExpAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(K_AND);
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
		enterRule(_localctx, 44, RULE_relationalExpEq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 46, RULE_relationalExpGL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__10) | (1L << T__8) | (1L << T__7))) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_relationalExp);
		try {
			setState(357);
			switch (_input.LA(1)) {
			case T__12:
			case T__10:
			case T__8:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); relationalExpGL();
				}
				break;
			case T__9:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); relationalExpEq();
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
		enterRule(_localctx, 50, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(K_INSERT);
			setState(360); match(K_INTO);
			setState(361); match(ID);
			setState(377);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(362); match(T__5);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(363); match(ID);
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(364); match(T__2);
						setState(365); match(ID);
						}
						}
						setState(370);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376); match(T__4);
				}
			}

			setState(379); match(K_VALUES);
			setState(380); match(T__5);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUM) | (1L << DATE) | (1L << CHAR))) != 0)) {
				{
				{
				setState(381); formatValue();
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(382); match(T__2);
					setState(383); formatValue();
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394); match(T__4);
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
		enterRule(_localctx, 52, RULE_formatValue);
		try {
			setState(400);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398); fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399); character();
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
		enterRule(_localctx, 54, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(402); match(T__1);
				}
			}

			setState(405); match(NUM);
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
		enterRule(_localctx, 56, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); entero();
			setState(408); match(T__0);
			setState(409); match(NUM);
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
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
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
		enterRule(_localctx, 58, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(DATE);
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
		enterRule(_localctx, 60, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(CHAR);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
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
		enterRule(_localctx, 62, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(K_UPDATE);
			setState(416); match(ID);
			setState(417); match(K_SET);
			setState(418); asignacion();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(419); match(T__2);
				setState(420); asignacion();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(426); match(K_WHERE);
				setState(427); exp();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(ID);
			setState(431); match(T__9);
			setState(432); literal();
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
		enterRule(_localctx, 66, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(434); expresion();
			setState(435); relationalExp();
			setState(438);
			switch (_input.LA(1)) {
			case T__1:
			case NUM:
			case DATE:
			case CHAR:
				{
				setState(436); formatValue();
				}
				break;
			case ID:
				{
				setState(437); expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(440); logicExp();
				setState(441); condicion();
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
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
		enterRule(_localctx, 68, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(K_DELETE);
			setState(446); match(K_FROM);
			setState(447); match(ID);
			setState(450);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(448); match(K_WHERE);
				setState(449); exp();
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

	public static class QueryContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode K_ASC(int i) {
			return getToken(SQLParser.K_ASC, i);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
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
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
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
		enterRule(_localctx, 70, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); match(K_SELECT);
			setState(462);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(453); match(T__3);
				}
				break;
			case ID:
				{
				setState(454); column();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(455); match(T__2);
					setState(456); column();
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(464); match(K_FROM);
			setState(465); match(ID);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(466); match(T__2);
				setState(467); match(ID);
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(473); match(K_WHERE);
				setState(474); exp();
				setState(493);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(475); match(K_ORDER);
					setState(476); match(K_BY);
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(477); expresion();
						setState(478);
						_la = _input.LA(1);
						if ( !(_la==K_ASC || _la==K_DESC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(485);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(479); match(T__2);
							setState(480); expresion();
							setState(481);
							_la = _input.LA(1);
							if ( !(_la==K_ASC || _la==K_DESC) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
							}
							setState(487);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(492);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
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

	public static class ColumnContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(ID);
			setState(500);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(498); match(T__0);
				setState(499); match(ID);
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
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
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
		enterRule(_localctx, 74, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502); match(ID);
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
		case 11: return expr_sempred((ExprContext)_localctx, predIndex);
		case 12: return exp2_sempred((Exp2Context)_localctx, predIndex);
		case 13: return exp3_sempred((Exp3Context)_localctx, predIndex);
		case 14: return exp4_sempred((Exp4Context)_localctx, predIndex);
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
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u01fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\5\2X\n\2\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\5\5"+
		"v\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084"+
		"\13\6\6\6\u0086\n\6\r\6\16\6\u0087\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0093\n\6\f\6\16\6\u0096\13\6\6\6\u0098\n\6\r\6\16\6\u0099\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ab\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00b2\n\7\f\7\16\7\u00b5\13\7\7\7\u00b7\n\7\f\7"+
		"\16\7\u00ba\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00cb\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d4\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00dd\n\n\f\n\16\n\u00e0\13\n\7\n\u00e2\n\n\f"+
		"\n\16\n\u00e5\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ef\n\n\f\n\16"+
		"\n\u00f2\13\n\7\n\u00f4\n\n\f\n\16\n\u00f7\13\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00fe\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0106\n\13\f\13\16\13"+
		"\u0109\13\13\7\13\u010b\n\13\f\13\16\13\u010e\13\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u011b\n\r\f\r\16\r\u011e\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u0127\n\16\f\16\16\16\u012a\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0133\n\17\f\17\16\17\u0136\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u013f\n\20\f\20\16\20\u0142"+
		"\13\20\3\21\3\21\3\21\5\21\u0147\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0151\n\22\5\22\u0153\n\22\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u015a\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\5\32\u0168\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0171\n\33\f"+
		"\33\16\33\u0174\13\33\7\33\u0176\n\33\f\33\16\33\u0179\13\33\3\33\5\33"+
		"\u017c\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u0183\n\33\f\33\16\33\u0186"+
		"\13\33\7\33\u0188\n\33\f\33\16\33\u018b\13\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\5\34\u0193\n\34\3\35\5\35\u0196\n\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\7!\u01a8\n!\f!\16!\u01ab\13!\3!"+
		"\3!\5!\u01af\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u01b9\n#\3#\3#\3#\5#\u01be"+
		"\n#\3$\3$\3$\3$\3$\5$\u01c5\n$\3%\3%\3%\3%\3%\7%\u01cc\n%\f%\16%\u01cf"+
		"\13%\5%\u01d1\n%\3%\3%\3%\3%\7%\u01d7\n%\f%\16%\u01da\13%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u01e6\n%\f%\16%\u01e9\13%\7%\u01eb\n%\f%\16%\u01ee"+
		"\13%\5%\u01f0\n%\5%\u01f2\n%\3&\3&\3&\5&\u01f7\n&\3\'\3\'\3\'\2\6\30\32"+
		"\34\36(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJL\2\5\4\2\6\6\t\t\5\2\3\3\5\5\7\b\3\2\62\63\u0219\2N\3\2\2\2\4"+
		"\\\3\2\2\2\6o\3\2\2\2\bu\3\2\2\2\n\u00aa\3\2\2\2\f\u00b8\3\2\2\2\16\u00ca"+
		"\3\2\2\2\20\u00d3\3\2\2\2\22\u00fd\3\2\2\2\24\u00ff\3\2\2\2\26\u0111\3"+
		"\2\2\2\30\u0113\3\2\2\2\32\u011f\3\2\2\2\34\u012b\3\2\2\2\36\u0137\3\2"+
		"\2\2 \u0146\3\2\2\2\"\u0152\3\2\2\2$\u0154\3\2\2\2&\u0159\3\2\2\2(\u015b"+
		"\3\2\2\2*\u015d\3\2\2\2,\u015f\3\2\2\2.\u0161\3\2\2\2\60\u0163\3\2\2\2"+
		"\62\u0167\3\2\2\2\64\u0169\3\2\2\2\66\u0192\3\2\2\28\u0195\3\2\2\2:\u0199"+
		"\3\2\2\2<\u019d\3\2\2\2>\u019f\3\2\2\2@\u01a1\3\2\2\2B\u01b0\3\2\2\2D"+
		"\u01b4\3\2\2\2F\u01bf\3\2\2\2H\u01c6\3\2\2\2J\u01f3\3\2\2\2L\u01f8\3\2"+
		"\2\2NS\5\4\3\2OP\7\4\2\2PR\5\4\3\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2VX\7\4\2\2WV\3\2\2\2WX\3\2\2\2X\3\3\2\2\2Y]\5"+
		"\6\4\2Z]\5\n\6\2[]\5\b\5\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\5\3\2\2\2"+
		"^_\7\20\2\2_`\7\21\2\2`p\7;\2\2ab\7\23\2\2bc\7\21\2\2cp\7;\2\2de\7\24"+
		"\2\2ef\7\21\2\2fp\7;\2\2gh\7\25\2\2hp\7\22\2\2ij\7\26\2\2jk\7\21\2\2k"+
		"l\7;\2\2lm\7\27\2\2mn\7\30\2\2np\7;\2\2o^\3\2\2\2oa\3\2\2\2od\3\2\2\2"+
		"og\3\2\2\2oi\3\2\2\2p\7\3\2\2\2qv\5\64\33\2rv\5@!\2sv\5F$\2tv\5H%\2uq"+
		"\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\t\3\2\2\2wx\7\20\2\2xy\7\31\2"+
		"\2yz\7;\2\2z\u0085\7\n\2\2{|\7;\2\2|\u0082\5\20\t\2}~\7\r\2\2~\177\7;"+
		"\2\2\177\u0081\5\20\t\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"{\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7\13\2\2\u008b\u00ab"+
		"\3\2\2\2\u008c\u008d\7\26\2\2\u008d\u008e\7\31\2\2\u008e\u0097\7;\2\2"+
		"\u008f\u0094\5\16\b\2\u0090\u0091\7\r\2\2\u0091\u0093\5\16\b\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u008f\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00ab\3\2\2\2\u009b"+
		"\u009c\7\26\2\2\u009c\u009d\7\31\2\2\u009d\u009e\7;\2\2\u009e\u009f\7"+
		"\27\2\2\u009f\u00a0\7\30\2\2\u00a0\u00ab\7;\2\2\u00a1\u00a2\7\23\2\2\u00a2"+
		"\u00a3\7\31\2\2\u00a3\u00ab\7;\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00ab\7"+
		"\32\2\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\7\36\2\2"+
		"\u00a9\u00ab\7;\2\2\u00aaw\3\2\2\2\u00aa\u008c\3\2\2\2\u00aa\u009b\3\2"+
		"\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab"+
		"\13\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad\u00b3\5\22\n\2\u00ae\u00af\7\r"+
		"\2\2\u00af\u00b0\7\33\2\2\u00b0\u00b2\5\22\n\2\u00b1\u00ae\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\r\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00bb\u00bc\7\37\2\2\u00bc\u00bd\7\34\2\2\u00bd\u00be\7;\2\2\u00be\u00bf"+
		"\5\20\t\2\u00bf\u00c0\5\f\7\2\u00c0\u00cb\3\2\2\2\u00c1\u00c2\7\37\2\2"+
		"\u00c2\u00c3\7\33\2\2\u00c3\u00cb\5\22\n\2\u00c4\u00c5\7\23\2\2\u00c5"+
		"\u00c6\7\34\2\2\u00c6\u00cb\7;\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\7"+
		"\33\2\2\u00c9\u00cb\7;\2\2\u00ca\u00bb\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\17\3\2\2\2\u00cc\u00d4\7\"\2"+
		"\2\u00cd\u00d4\7%\2\2\u00ce\u00d4\7#\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d1"+
		"\7\n\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d4\7\13\2\2\u00d3\u00cc\3\2\2\2\u00d3"+
		"\u00cd\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\21\3\2\2"+
		"\2\u00d5\u00d6\7&\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7;\2\2\u00d8\u00e3"+
		"\7\n\2\2\u00d9\u00de\7;\2\2\u00da\u00db\7\r\2\2\u00db\u00dd\7;\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00fe\7\13\2\2\u00e7\u00e8\7)\2\2\u00e8"+
		"\u00e9\7*\2\2\u00e9\u00ea\7;\2\2\u00ea\u00f5\7\n\2\2\u00eb\u00f0\7;\2"+
		"\2\u00ec\u00ed\7\r\2\2\u00ed\u00ef\7;\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7\13\2\2\u00f9\u00fe\5\24\13\2\u00fa\u00fb\7;\2\2\u00fb\u00fc\7"+
		"\'\2\2\u00fc\u00fe\5\26\f\2\u00fd\u00d5\3\2\2\2\u00fd\u00e7\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fe\23\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7;\2\2"+
		"\u0101\u010c\7\n\2\2\u0102\u0107\7;\2\2\u0103\u0104\7\r\2\2\u0104\u0106"+
		"\7;\2\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0102\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\13\2\2\u0110\25\3\2\2"+
		"\2\u0111\u0112\5\30\r\2\u0112\27\3\2\2\2\u0113\u0114\b\r\1\2\u0114\u0115"+
		"\5\32\16\2\u0115\u011c\3\2\2\2\u0116\u0117\f\4\2\2\u0117\u0118\5,\27\2"+
		"\u0118\u0119\5\32\16\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\31\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\b\16\1\2\u0120\u0121\5\34\17\2\u0121\u0128"+
		"\3\2\2\2\u0122\u0123\f\4\2\2\u0123\u0124\5*\26\2\u0124\u0125\5\34\17\2"+
		"\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\33\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012c\b\17\1\2\u012c\u012d\5\36\20\2\u012d\u0134\3\2\2\2\u012e\u012f"+
		"\f\4\2\2\u012f\u0130\5.\30\2\u0130\u0131\5\36\20\2\u0131\u0133\3\2\2\2"+
		"\u0132\u012e\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\35\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\b\20\1\2\u0138"+
		"\u0139\5 \21\2\u0139\u0140\3\2\2\2\u013a\u013b\f\4\2\2\u013b\u013c\5\60"+
		"\31\2\u013c\u013d\5 \21\2\u013d\u013f\3\2\2\2\u013e\u013a\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\37\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0143\u0144\7\66\2\2\u0144\u0147\5\"\22\2\u0145"+
		"\u0147\5\"\22\2\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0147!\3\2\2\2"+
		"\u0148\u0153\5$\23\2\u0149\u014a\7\n\2\2\u014a\u014b\5\26\f\2\u014b\u014c"+
		"\7\13\2\2\u014c\u0153\3\2\2\2\u014d\u0150\7;\2\2\u014e\u014f\7\17\2\2"+
		"\u014f\u0151\7;\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\3\2\2\2\u0152\u0148\3\2\2\2\u0152\u0149\3\2\2\2\u0152\u014d\3\2\2\2\u0153"+
		"#\3\2\2\2\u0154\u0155\5\66\34\2\u0155%\3\2\2\2\u0156\u015a\5,\27\2\u0157"+
		"\u015a\5*\26\2\u0158\u015a\5(\25\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u0158\3\2\2\2\u015a\'\3\2\2\2\u015b\u015c\7\66\2\2\u015c)\3"+
		"\2\2\2\u015d\u015e\7\65\2\2\u015e+\3\2\2\2\u015f\u0160\7\64\2\2\u0160"+
		"-\3\2\2\2\u0161\u0162\t\2\2\2\u0162/\3\2\2\2\u0163\u0164\t\3\2\2\u0164"+
		"\61\3\2\2\2\u0165\u0168\5\60\31\2\u0166\u0168\5.\30\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0166\3\2\2\2\u0168\63\3\2\2\2\u0169\u016a\7+\2\2\u016a\u016b"+
		"\7,\2\2\u016b\u017b\7;\2\2\u016c\u0177\7\n\2\2\u016d\u0172\7;\2\2\u016e"+
		"\u016f\7\r\2\2\u016f\u0171\7;\2\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u016d\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017c\7\13\2\2\u017b\u016c\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3"+
		"\2\2\2\u017d\u017e\7-\2\2\u017e\u0189\7\n\2\2\u017f\u0184\5\66\34\2\u0180"+
		"\u0181\7\r\2\2\u0181\u0183\5\66\34\2\u0182\u0180\3\2\2\2\u0183\u0186\3"+
		"\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u017f\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"\u018d\7\13\2\2\u018d\65\3\2\2\2\u018e\u0193\58\35\2\u018f\u0193\5:\36"+
		"\2\u0190\u0193\5<\37\2\u0191\u0193\5> \2\u0192\u018e\3\2\2\2\u0192\u018f"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\67\3\2\2\2\u0194"+
		"\u0196\7\16\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3"+
		"\2\2\2\u0197\u0198\7<\2\2\u01989\3\2\2\2\u0199\u019a\58\35\2\u019a\u019b"+
		"\7\17\2\2\u019b\u019c\7<\2\2\u019c;\3\2\2\2\u019d\u019e\7>\2\2\u019e="+
		"\3\2\2\2\u019f\u01a0\7?\2\2\u01a0?\3\2\2\2\u01a1\u01a2\7\60\2\2\u01a2"+
		"\u01a3\7;\2\2\u01a3\u01a4\7/\2\2\u01a4\u01a9\5B\"\2\u01a5\u01a6\7\r\2"+
		"\2\u01a6\u01a8\5B\"\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01ad\7!\2\2\u01ad\u01af\5\26\f\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01afA\3\2\2\2\u01b0\u01b1\7;\2\2\u01b1\u01b2\7\6\2\2\u01b2\u01b3"+
		"\5$\23\2\u01b3C\3\2\2\2\u01b4\u01b5\5L\'\2\u01b5\u01b8\5\62\32\2\u01b6"+
		"\u01b9\5\66\34\2\u01b7\u01b9\5L\'\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3"+
		"\2\2\2\u01b9\u01bd\3\2\2\2\u01ba\u01bb\5&\24\2\u01bb\u01bc\5D#\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01beE\3\2\2\2"+
		"\u01bf\u01c0\7\67\2\2\u01c0\u01c1\7\36\2\2\u01c1\u01c4\7;\2\2\u01c2\u01c3"+
		"\7!\2\2\u01c3\u01c5\5\26\f\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"G\3\2\2\2\u01c6\u01d0\7 \2\2\u01c7\u01d1\7\f\2\2\u01c8\u01cd\5J&\2\u01c9"+
		"\u01ca\7\r\2\2\u01ca\u01cc\5J&\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2\2"+
		"\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01d0\u01c7\3\2\2\2\u01d0\u01c8\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\7\36\2\2\u01d3\u01d8\7;\2\2\u01d4\u01d5\7\r\2\2\u01d5\u01d7\7;"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01f1\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7!"+
		"\2\2\u01dc\u01ef\5\26\f\2\u01dd\u01de\7.\2\2\u01de\u01ec\7\61\2\2\u01df"+
		"\u01e0\5L\'\2\u01e0\u01e7\t\4\2\2\u01e1\u01e2\7\r\2\2\u01e2\u01e3\5L\'"+
		"\2\u01e3\u01e4\t\4\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01df\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01dd\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01db\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2I\3\2\2\2\u01f3\u01f6\7;\2\2\u01f4\u01f5"+
		"\7\17\2\2\u01f5\u01f7\7;\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"K\3\2\2\2\u01f8\u01f9\7;\2\2\u01f9M\3\2\2\2\64SW\\ou\u0082\u0087\u0094"+
		"\u0099\u00aa\u00b3\u00b8\u00ca\u00d3\u00de\u00e3\u00f0\u00f5\u00fd\u0107"+
		"\u010c\u011c\u0128\u0134\u0140\u0146\u0150\u0152\u0159\u0167\u0172\u0177"+
		"\u017b\u0184\u0189\u0192\u0195\u01a9\u01ae\u01b8\u01bd\u01c4\u01cd\u01d0"+
		"\u01d8\u01e7\u01ec\u01ef\u01f1\u01f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}