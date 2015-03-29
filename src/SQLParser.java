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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, K_CREATE=13, K_DATABASE=14, K_DATABASES=15, 
		K_DROP=16, K_USE=17, K_SHOW=18, K_ALTER=19, K_RENAME=20, K_TO=21, K_TABLE=22, 
		K_TABLES=23, K_CONSTRAINT=24, K_COLUMN=25, K_COLUMNS=26, K_FROM=27, K_ADD=28, 
		K_SELECT=29, K_WHERE=30, K_INT=31, K_DATE=32, K_CHAR=33, K_FLOAT=34, K_PRIMARY=35, 
		K_CHECK=36, K_REFERENCES=37, K_FOREIGN=38, K_KEY=39, K_INSERT=40, K_INTO=41, 
		K_VALUES=42, K_ORDER=43, K_SET=44, K_UPDATE=45, K_BY=46, K_ASC=47, K_DESC=48, 
		K_AND=49, K_OR=50, K_NOT=51, K_DELETE=52, SPACES=53, SINGLE_LINE_COMMENT=54, 
		MULTILINE_COMMENT=55, ID=56, NUM=57, UNUM=58, CHAR=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'<='", "'<>'", "'('", "')'", "'*'", "'>='", "'<'", "','", 
		"'-'", "'='", "'.'", "'>'", "K_CREATE", "K_DATABASE", "K_DATABASES", "K_DROP", 
		"K_USE", "K_SHOW", "K_ALTER", "K_RENAME", "K_TO", "K_TABLE", "K_TABLES", 
		"K_CONSTRAINT", "K_COLUMN", "K_COLUMNS", "K_FROM", "K_ADD", "K_SELECT", 
		"K_WHERE", "K_INT", "K_DATE", "K_CHAR", "K_FLOAT", "K_PRIMARY", "K_CHECK", 
		"K_REFERENCES", "K_FOREIGN", "K_KEY", "K_INSERT", "K_INTO", "K_VALUES", 
		"K_ORDER", "K_SET", "K_UPDATE", "K_BY", "K_ASC", "K_DESC", "K_AND", "K_OR", 
		"K_NOT", "K_DELETE", "SPACES", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"ID", "NUM", "UNUM", "CHAR"
	};
	public static final int
		RULE_todo = 0, RULE_casitodo = 1, RULE_database = 2, RULE_data = 3, RULE_table = 4, 
		RULE_constraints = 5, RULE_tableAction = 6, RULE_tipo = 7, RULE_constraint = 8, 
		RULE_references = 9, RULE_exp = 10, RULE_exp2 = 11, RULE_exp3 = 12, RULE_exp4 = 13, 
		RULE_unifactor = 14, RULE_factor = 15, RULE_literal = 16, RULE_logicExp = 17, 
		RULE_logicExpNot = 18, RULE_logicExpOr = 19, RULE_logicExpAnd = 20, RULE_relationalExpEq = 21, 
		RULE_relationalExpGL = 22, RULE_relationalExp = 23, RULE_insert = 24, 
		RULE_formatValue = 25, RULE_entero = 26, RULE_decimal = 27, RULE_fecha = 28, 
		RULE_character = 29, RULE_update = 30, RULE_asignacion = 31, RULE_condicion = 32, 
		RULE_delete = 33, RULE_query = 34, RULE_expresion = 35;
	public static final String[] ruleNames = {
		"todo", "casitodo", "database", "data", "table", "constraints", "tableAction", 
		"tipo", "constraint", "references", "exp", "exp2", "exp3", "exp4", "unifactor", 
		"factor", "literal", "logicExp", "logicExpNot", "logicExpOr", "logicExpAnd", 
		"relationalExpEq", "relationalExpGL", "relationalExp", "insert", "formatValue", 
		"entero", "decimal", "fecha", "character", "update", "asignacion", "condicion", 
		"delete", "query", "expresion"
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
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72); casitodo();
				}
				}
				setState(75); 
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
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); data();
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
			setState(99);
			switch (_input.LA(1)) {
			case K_CREATE:
				_localctx = new CreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(K_CREATE);
				setState(83); match(K_DATABASE);
				setState(84); match(ID);
				}
				break;
			case K_DROP:
				_localctx = new DropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(K_DROP);
				setState(86); match(K_DATABASE);
				setState(87); match(ID);
				}
				break;
			case K_USE:
				_localctx = new UseDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88); match(K_USE);
				setState(89); match(K_DATABASE);
				setState(90); match(ID);
				}
				break;
			case K_SHOW:
				_localctx = new ShowDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91); match(K_SHOW);
				setState(92); match(K_DATABASES);
				}
				break;
			case K_ALTER:
				_localctx = new AlterDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(93); match(K_ALTER);
				setState(94); match(K_DATABASE);
				setState(95); match(ID);
				setState(96); match(K_RENAME);
				setState(97); match(K_TO);
				setState(98); match(ID);
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
			setState(104);
			switch (_input.LA(1)) {
			case K_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); insert();
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); delete();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); query();
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
			int _alt;
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new CreateTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(K_CREATE);
				setState(107); match(K_TABLE);
				setState(108); match(ID);
				setState(109); match(T__9);
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110); match(ID);
					setState(111); tipo();
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(112); match(T__4);
						setState(113); match(ID);
						setState(114); tipo();
						}
						}
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				{
				setState(124); constraints();
				}
				setState(125); match(T__8);
				}
				break;
			case 2:
				_localctx = new AlterTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127); match(K_ALTER);
				setState(128); match(K_TABLE);
				setState(129); match(ID);
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(130); tableAction();
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(131); match(T__4);
							setState(132); tableAction();
							}
							}
							setState(137);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new RenameTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142); match(K_ALTER);
				setState(143); match(K_TABLE);
				setState(144); match(ID);
				setState(145); match(K_RENAME);
				setState(146); match(K_TO);
				setState(147); match(ID);
				}
				break;
			case 4:
				_localctx = new DropTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148); match(K_DROP);
				setState(149); match(K_TABLE);
				setState(150); match(ID);
				}
				break;
			case 5:
				_localctx = new ShowTBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151); match(K_SHOW);
				setState(152); match(K_TABLES);
				}
				break;
			case 6:
				_localctx = new ShowColumsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(153); match(K_SHOW);
				setState(154); match(K_COLUMNS);
				setState(155); match(K_FROM);
				setState(156); match(ID);
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CONSTRAINT) {
				{
				{
				setState(159); match(K_CONSTRAINT);
				setState(160); constraint();
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161); match(T__4);
						setState(162); match(K_CONSTRAINT);
						setState(163); constraint();
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				}
				setState(173);
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
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AddColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174); match(K_ADD);
				setState(175); match(K_COLUMN);
				setState(176); match(ID);
				setState(177); tipo();
				{
				setState(178); constraints();
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180); match(K_ADD);
				setState(181); match(K_CONSTRAINT);
				setState(182); constraint();
				}
				break;
			case 3:
				_localctx = new DropColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183); match(K_DROP);
				setState(184); match(K_COLUMN);
				setState(185); match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(186); match(K_DROP);
				setState(187); match(K_CONSTRAINT);
				setState(188); match(ID);
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
			setState(198);
			switch (_input.LA(1)) {
			case K_INT:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(K_INT);
				}
				break;
			case K_FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(K_FLOAT);
				}
				break;
			case K_DATE:
				_localctx = new TipoDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193); match(K_DATE);
				}
				break;
			case K_CHAR:
				_localctx = new TipoCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194); match(K_CHAR);
				setState(195); match(T__9);
				setState(196); match(NUM);
				setState(197); match(T__8);
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
			setState(240);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				_localctx = new CPKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200); match(K_PRIMARY);
				setState(201); match(K_KEY);
				setState(202); match(ID);
				setState(203); match(T__9);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(204); match(ID);
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(205); match(T__4);
						setState(206); match(ID);
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217); match(T__8);
				}
				break;
			case K_FOREIGN:
				_localctx = new CFKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(K_FOREIGN);
				setState(219); match(K_KEY);
				setState(220); match(ID);
				setState(221); match(T__9);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(222); match(ID);
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(223); match(T__4);
						setState(224); match(ID);
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235); match(T__8);
				setState(236); references();
				}
				break;
			case ID:
				_localctx = new CCheckContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237); match(ID);
				setState(238); match(K_CHECK);
				{
				setState(239); exp(0);
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
			setState(242); match(K_REFERENCES);
			setState(243); match(ID);
			setState(244); match(T__9);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(245); match(ID);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(246); match(T__4);
					setState(247); match(ID);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258); match(T__8);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(261); exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(263);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(264); logicExpAnd();
					setState(265); exp2(0);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(273); exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(275);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(276); logicExpOr();
					setState(277); exp3(0);
					}
					} 
				}
				setState(283);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285); exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(287);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(288); relationalExpEq();
					setState(289); exp4(0);
					}
					} 
				}
				setState(295);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297); unifactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(299);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(300); relationalExpGL();
					setState(301); exp4(3);
					}
					} 
				}
				setState(307);
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
		enterRule(_localctx, 28, RULE_unifactor);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case K_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); match(K_NOT);
				setState(309); factor();
				}
				break;
			case T__9:
			case T__3:
			case ID:
			case NUM:
			case UNUM:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); factor();
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
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
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
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case T__3:
			case NUM:
			case UNUM:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); literal();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); match(T__9);
				setState(315); exp(0);
				setState(316); match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(318); match(ID);
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
		enterRule(_localctx, 32, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); formatValue();
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
		enterRule(_localctx, 34, RULE_logicExp);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case K_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); logicExpAnd();
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(324); logicExpOr();
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(325); logicExpNot();
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
		enterRule(_localctx, 36, RULE_logicExpNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(K_NOT);
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
		enterRule(_localctx, 38, RULE_logicExpOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(K_OR);
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
		enterRule(_localctx, 40, RULE_logicExpAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(K_AND);
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
		enterRule(_localctx, 42, RULE_relationalExpEq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__2) ) {
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
		enterRule(_localctx, 44, RULE_relationalExpGL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__6) | (1L << T__5) | (1L << T__0))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_relationalExp);
		try {
			setState(340);
			switch (_input.LA(1)) {
			case T__11:
			case T__6:
			case T__5:
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); relationalExpGL();
				}
				break;
			case T__10:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); relationalExpEq();
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
		enterRule(_localctx, 48, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(K_INSERT);
			setState(343); match(K_INTO);
			setState(344); match(ID);
			setState(345); match(T__9);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(346); match(ID);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(347); match(T__4);
					setState(348); match(ID);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); match(T__8);
			setState(360); match(K_VALUES);
			setState(361); match(T__9);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << NUM) | (1L << UNUM) | (1L << CHAR))) != 0)) {
				{
				{
				setState(362); formatValue();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(363); match(T__4);
					setState(364); formatValue();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375); match(T__8);
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
		enterRule(_localctx, 50, RULE_formatValue);
		try {
			setState(381);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378); decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379); fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(380); character();
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
		enterRule(_localctx, 52, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(383); match(T__3);
				}
			}

			setState(386); match(NUM);
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
		enterRule(_localctx, 54, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); entero();
			setState(389); match(T__1);
			setState(390); match(NUM);
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
		enterRule(_localctx, 56, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(UNUM);
			setState(393); match(UNUM);
			setState(394); match(UNUM);
			setState(395); match(UNUM);
			setState(396); match(T__3);
			setState(397); match(UNUM);
			setState(398); match(UNUM);
			setState(399); match(T__3);
			setState(400); match(UNUM);
			setState(401); match(UNUM);
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
		enterRule(_localctx, 58, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); match(CHAR);
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
		enterRule(_localctx, 60, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); match(K_UPDATE);
			setState(406); match(ID);
			setState(407); match(K_SET);
			setState(408); asignacion();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(409); match(T__4);
				setState(410); asignacion();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(416); match(K_WHERE);
				setState(417); exp(0);
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
		enterRule(_localctx, 62, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(ID);
			setState(421); match(T__2);
			setState(422); literal();
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
		enterRule(_localctx, 64, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424); expresion();
			setState(425); relationalExp();
			setState(428);
			switch (_input.LA(1)) {
			case T__3:
			case NUM:
			case UNUM:
			case CHAR:
				{
				setState(426); formatValue();
				}
				break;
			case ID:
				{
				setState(427); expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(430); logicExp();
				setState(431); condicion();
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
		enterRule(_localctx, 66, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(K_DELETE);
			setState(436); match(K_FROM);
			setState(437); match(ID);
			setState(438); match(K_WHERE);
			setState(439); exp(0);
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
		enterRule(_localctx, 68, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(K_SELECT);
			setState(451);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(442); match(T__7);
				}
				break;
			case ID:
				{
				{
				setState(443); match(ID);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(444); match(T__4);
					setState(445); match(ID);
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(453); match(K_FROM);
			setState(454); match(ID);
			setState(475);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(455); match(K_WHERE);
				setState(456); exp(0);
				setState(457); match(K_ORDER);
				setState(458); match(K_BY);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(459); expresion();
					setState(460);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(461); match(T__4);
						setState(462); expresion();
						setState(463);
						_la = _input.LA(1);
						if ( !(_la==K_ASC || _la==K_DESC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(469);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(474);
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
		enterRule(_localctx, 70, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); match(ID);
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
		case 10: return exp_sempred((ExpContext)_localctx, predIndex);
		case 11: return exp2_sempred((Exp2Context)_localctx, predIndex);
		case 12: return exp3_sempred((Exp3Context)_localctx, predIndex);
		case 13: return exp4_sempred((Exp4Context)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u01e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2L\n\2\r\2\16\2M\3\3\3\3\3\3\5\3S"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4f\n\4\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6v\n\6\f\6\16\6y\13\6\6\6{\n\6\r\6\16\6|\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\6\6\u008d\n\6\r\6\16\6\u008e"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u00a7\n\7\f\7\16\7\u00aa\13\7\7\7\u00ac\n"+
		"\7\f\7\16\7\u00af\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00c0\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\7\n\u00d7"+
		"\n\n\f\n\16\n\u00da\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e4\n\n"+
		"\f\n\16\n\u00e7\13\n\7\n\u00e9\n\n\f\n\16\n\u00ec\13\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00f3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00fb\n\13\f\13"+
		"\16\13\u00fe\13\13\7\13\u0100\n\13\f\13\16\13\u0103\13\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010e\n\f\f\f\16\f\u0111\13\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u011a\n\r\f\r\16\r\u011d\13\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u0126\n\16\f\16\16\16\u0129\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0132\n\17\f\17\16\17\u0135\13\17\3\20\3"+
		"\20\3\20\5\20\u013a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0142\n\21"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u0149\n\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0157\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0160\n\32\f\32\16\32\u0163\13\32\7\32\u0165\n\32\f\32"+
		"\16\32\u0168\13\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0170\n\32\f\32"+
		"\16\32\u0173\13\32\7\32\u0175\n\32\f\32\16\32\u0178\13\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\5\33\u0180\n\33\3\34\5\34\u0183\n\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u019e\n \f \16 \u01a1\13 \3 \3 \5 \u01a5"+
		"\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u01af\n\"\3\"\3\"\3\"\5\"\u01b4\n"+
		"\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\7$\u01c1\n$\f$\16$\u01c4\13$\5$\u01c6"+
		"\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u01d4\n$\f$\16$\u01d7\13$\7"+
		"$\u01d9\n$\f$\16$\u01dc\13$\5$\u01de\n$\3%\3%\3%\2\6\26\30\32\34&\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\5"+
		"\4\2\4\4\f\f\5\2\3\3\b\t\16\16\3\2\61\62\u01fa\2K\3\2\2\2\4R\3\2\2\2\6"+
		"e\3\2\2\2\bj\3\2\2\2\n\u009f\3\2\2\2\f\u00ad\3\2\2\2\16\u00bf\3\2\2\2"+
		"\20\u00c8\3\2\2\2\22\u00f2\3\2\2\2\24\u00f4\3\2\2\2\26\u0106\3\2\2\2\30"+
		"\u0112\3\2\2\2\32\u011e\3\2\2\2\34\u012a\3\2\2\2\36\u0139\3\2\2\2 \u0141"+
		"\3\2\2\2\"\u0143\3\2\2\2$\u0148\3\2\2\2&\u014a\3\2\2\2(\u014c\3\2\2\2"+
		"*\u014e\3\2\2\2,\u0150\3\2\2\2.\u0152\3\2\2\2\60\u0156\3\2\2\2\62\u0158"+
		"\3\2\2\2\64\u017f\3\2\2\2\66\u0182\3\2\2\28\u0186\3\2\2\2:\u018a\3\2\2"+
		"\2<\u0195\3\2\2\2>\u0197\3\2\2\2@\u01a6\3\2\2\2B\u01aa\3\2\2\2D\u01b5"+
		"\3\2\2\2F\u01bb\3\2\2\2H\u01df\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LM\3\2\2\2M"+
		"K\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OS\5\6\4\2PS\5\n\6\2QS\5\b\5\2RO\3\2\2\2"+
		"RP\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2TU\7\17\2\2UV\7\20\2\2Vf\7:\2\2WX\7\22"+
		"\2\2XY\7\20\2\2Yf\7:\2\2Z[\7\23\2\2[\\\7\20\2\2\\f\7:\2\2]^\7\24\2\2^"+
		"f\7\21\2\2_`\7\25\2\2`a\7\20\2\2ab\7:\2\2bc\7\26\2\2cd\7\27\2\2df\7:\2"+
		"\2eT\3\2\2\2eW\3\2\2\2eZ\3\2\2\2e]\3\2\2\2e_\3\2\2\2f\7\3\2\2\2gk\5\62"+
		"\32\2hk\5D#\2ik\5F$\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lm\7\17"+
		"\2\2mn\7\30\2\2no\7:\2\2oz\7\5\2\2pq\7:\2\2qw\5\20\t\2rs\7\n\2\2st\7:"+
		"\2\2tv\5\20\t\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3"+
		"\2\2\2zp\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5\f\7\2"+
		"\177\u0080\7\6\2\2\u0080\u00a0\3\2\2\2\u0081\u0082\7\25\2\2\u0082\u0083"+
		"\7\30\2\2\u0083\u008c\7:\2\2\u0084\u0089\5\16\b\2\u0085\u0086\7\n\2\2"+
		"\u0086\u0088\5\16\b\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u00a0\3\2\2\2\u0090\u0091\7\25\2\2\u0091\u0092\7\30\2\2\u0092"+
		"\u0093\7:\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7\27\2\2\u0095\u00a0\7"+
		":\2\2\u0096\u0097\7\22\2\2\u0097\u0098\7\30\2\2\u0098\u00a0\7:\2\2\u0099"+
		"\u009a\7\24\2\2\u009a\u00a0\7\31\2\2\u009b\u009c\7\24\2\2\u009c\u009d"+
		"\7\34\2\2\u009d\u009e\7\35\2\2\u009e\u00a0\7:\2\2\u009fl\3\2\2\2\u009f"+
		"\u0081\3\2\2\2\u009f\u0090\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2"+
		"\2\2\u009f\u009b\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a8"+
		"\5\22\n\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a7\5\22\n"+
		"\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\r\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\36\2\2\u00b1\u00b2\7\33\2\2\u00b2\u00b3"+
		"\7:\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\5\f\7\2\u00b5\u00c0\3\2\2\2\u00b6"+
		"\u00b7\7\36\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00c0\5\22\n\2\u00b9\u00ba"+
		"\7\22\2\2\u00ba\u00bb\7\33\2\2\u00bb\u00c0\7:\2\2\u00bc\u00bd\7\22\2\2"+
		"\u00bd\u00be\7\32\2\2\u00be\u00c0\7:\2\2\u00bf\u00b0\3\2\2\2\u00bf\u00b6"+
		"\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\17\3\2\2\2\u00c1"+
		"\u00c9\7!\2\2\u00c2\u00c9\7$\2\2\u00c3\u00c9\7\"\2\2\u00c4\u00c5\7#\2"+
		"\2\u00c5\u00c6\7\5\2\2\u00c6\u00c7\7;\2\2\u00c7\u00c9\7\6\2\2\u00c8\u00c1"+
		"\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9"+
		"\21\3\2\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\7:\2\2\u00cd"+
		"\u00d8\7\5\2\2\u00ce\u00d3\7:\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d2\7:\2"+
		"\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00f3\7\6\2\2\u00dc\u00dd\7(\2\2\u00dd"+
		"\u00de\7)\2\2\u00de\u00df\7:\2\2\u00df\u00ea\7\5\2\2\u00e0\u00e5\7:\2"+
		"\2\u00e1\u00e2\7\n\2\2\u00e2\u00e4\7:\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\6\2\2\u00ee\u00f3\5\24\13\2\u00ef\u00f0\7:\2\2\u00f0\u00f1\7"+
		"&\2\2\u00f1\u00f3\5\26\f\2\u00f2\u00ca\3\2\2\2\u00f2\u00dc\3\2\2\2\u00f2"+
		"\u00ef\3\2\2\2\u00f3\23\3\2\2\2\u00f4\u00f5\7\'\2\2\u00f5\u00f6\7:\2\2"+
		"\u00f6\u0101\7\5\2\2\u00f7\u00fc\7:\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fb"+
		"\7:\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00f7\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\6\2\2\u0105\25\3\2\2"+
		"\2\u0106\u0107\b\f\1\2\u0107\u0108\5\30\r\2\u0108\u010f\3\2\2\2\u0109"+
		"\u010a\f\4\2\2\u010a\u010b\5*\26\2\u010b\u010c\5\30\r\2\u010c\u010e\3"+
		"\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\27\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\b\r\1"+
		"\2\u0113\u0114\5\32\16\2\u0114\u011b\3\2\2\2\u0115\u0116\f\4\2\2\u0116"+
		"\u0117\5(\25\2\u0117\u0118\5\32\16\2\u0118\u011a\3\2\2\2\u0119\u0115\3"+
		"\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\31\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\b\16\1\2\u011f\u0120\5\34"+
		"\17\2\u0120\u0127\3\2\2\2\u0121\u0122\f\4\2\2\u0122\u0123\5,\27\2\u0123"+
		"\u0124\5\34\17\2\u0124\u0126\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0129\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\33\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\b\17\1\2\u012b\u012c\5\36\20\2\u012c\u0133"+
		"\3\2\2\2\u012d\u012e\f\4\2\2\u012e\u012f\5.\30\2\u012f\u0130\5\34\17\5"+
		"\u0130\u0132\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\35\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\7\65\2\2\u0137\u013a\5 \21\2\u0138\u013a\5 \21\2\u0139\u0136\3"+
		"\2\2\2\u0139\u0138\3\2\2\2\u013a\37\3\2\2\2\u013b\u0142\5\"\22\2\u013c"+
		"\u013d\7\5\2\2\u013d\u013e\5\26\f\2\u013e\u013f\7\6\2\2\u013f\u0142\3"+
		"\2\2\2\u0140\u0142\7:\2\2\u0141\u013b\3\2\2\2\u0141\u013c\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142!\3\2\2\2\u0143\u0144\5\64\33\2\u0144#\3\2\2\2\u0145"+
		"\u0149\5*\26\2\u0146\u0149\5(\25\2\u0147\u0149\5&\24\2\u0148\u0145\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149%\3\2\2\2\u014a\u014b"+
		"\7\65\2\2\u014b\'\3\2\2\2\u014c\u014d\7\64\2\2\u014d)\3\2\2\2\u014e\u014f"+
		"\7\63\2\2\u014f+\3\2\2\2\u0150\u0151\t\2\2\2\u0151-\3\2\2\2\u0152\u0153"+
		"\t\3\2\2\u0153/\3\2\2\2\u0154\u0157\5.\30\2\u0155\u0157\5,\27\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\61\3\2\2\2\u0158\u0159\7*\2\2"+
		"\u0159\u015a\7+\2\2\u015a\u015b\7:\2\2\u015b\u0166\7\5\2\2\u015c\u0161"+
		"\7:\2\2\u015d\u015e\7\n\2\2\u015e\u0160\7:\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u015c\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016a\7\6\2\2\u016a\u016b\7,\2\2\u016b\u0176\7\5\2\2\u016c"+
		"\u0171\5\64\33\2\u016d\u016e\7\n\2\2\u016e\u0170\5\64\33\2\u016f\u016d"+
		"\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u016c\3\2\2\2\u0175\u0178\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7\6\2\2\u017a\63\3\2\2\2\u017b\u0180\5\66\34"+
		"\2\u017c\u0180\58\35\2\u017d\u0180\5:\36\2\u017e\u0180\5<\37\2\u017f\u017b"+
		"\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180"+
		"\65\3\2\2\2\u0181\u0183\7\13\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2"+
		"\2\u0183\u0184\3\2\2\2\u0184\u0185\7;\2\2\u0185\67\3\2\2\2\u0186\u0187"+
		"\5\66\34\2\u0187\u0188\7\r\2\2\u0188\u0189\7;\2\2\u01899\3\2\2\2\u018a"+
		"\u018b\7<\2\2\u018b\u018c\7<\2\2\u018c\u018d\7<\2\2\u018d\u018e\7<\2\2"+
		"\u018e\u018f\7\13\2\2\u018f\u0190\7<\2\2\u0190\u0191\7<\2\2\u0191\u0192"+
		"\7\13\2\2\u0192\u0193\7<\2\2\u0193\u0194\7<\2\2\u0194;\3\2\2\2\u0195\u0196"+
		"\7=\2\2\u0196=\3\2\2\2\u0197\u0198\7/\2\2\u0198\u0199\7:\2\2\u0199\u019a"+
		"\7.\2\2\u019a\u019f\5@!\2\u019b\u019c\7\n\2\2\u019c\u019e\5@!\2\u019d"+
		"\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a4\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7 \2\2\u01a3"+
		"\u01a5\5\26\f\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5?\3\2\2\2"+
		"\u01a6\u01a7\7:\2\2\u01a7\u01a8\7\f\2\2\u01a8\u01a9\5\"\22\2\u01a9A\3"+
		"\2\2\2\u01aa\u01ab\5H%\2\u01ab\u01ae\5\60\31\2\u01ac\u01af\5\64\33\2\u01ad"+
		"\u01af\5H%\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b3\3\2\2"+
		"\2\u01b0\u01b1\5$\23\2\u01b1\u01b2\5B\"\2\u01b2\u01b4\3\2\2\2\u01b3\u01b0"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4C\3\2\2\2\u01b5\u01b6\7\66\2\2\u01b6"+
		"\u01b7\7\35\2\2\u01b7\u01b8\7:\2\2\u01b8\u01b9\7 \2\2\u01b9\u01ba\5\26"+
		"\f\2\u01baE\3\2\2\2\u01bb\u01c5\7\37\2\2\u01bc\u01c6\7\7\2\2\u01bd\u01c2"+
		"\7:\2\2\u01be\u01bf\7\n\2\2\u01bf\u01c1\7:\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01bc\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\7\35\2\2\u01c8\u01dd\7:\2\2\u01c9\u01ca\7 "+
		"\2\2\u01ca\u01cb\5\26\f\2\u01cb\u01cc\7-\2\2\u01cc\u01da\7\60\2\2\u01cd"+
		"\u01ce\5H%\2\u01ce\u01d5\t\4\2\2\u01cf\u01d0\7\n\2\2\u01d0\u01d1\5H%\2"+
		"\u01d1\u01d2\t\4\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d4\u01d7"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01cd\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01c9\3\2\2\2\u01dd\u01de\3\2\2\2\u01deG\3\2\2\2\u01df\u01e0\7:\2\2\u01e0"+
		"I\3\2\2\2-MRejw|\u0089\u008e\u009f\u00a8\u00ad\u00bf\u00c8\u00d3\u00d8"+
		"\u00e5\u00ea\u00f2\u00fc\u0101\u010f\u011b\u0127\u0133\u0139\u0141\u0148"+
		"\u0156\u0161\u0166\u0171\u0176\u017f\u0182\u019f\u01a4\u01ae\u01b3\u01c2"+
		"\u01c5\u01d5\u01da\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}