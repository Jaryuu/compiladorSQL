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
		RULE_todo = 0, RULE_database = 1, RULE_table = 2, RULE_tableAction = 3, 
		RULE_tipo = 4, RULE_constraint = 5, RULE_exp = 6, RULE_exp2 = 7, RULE_exp3 = 8, 
		RULE_exp4 = 9, RULE_unifactor = 10, RULE_factor = 11, RULE_literal = 12, 
		RULE_logicExp = 13, RULE_logicExpNot = 14, RULE_logicExpOr = 15, RULE_logicExpAnd = 16, 
		RULE_relationalExpEq = 17, RULE_relationalExpGL = 18, RULE_relationalExp = 19, 
		RULE_insert = 20, RULE_formatValue = 21, RULE_entero = 22, RULE_decimal = 23, 
		RULE_fecha = 24, RULE_character = 25, RULE_update = 26, RULE_condicion = 27, 
		RULE_delete = 28, RULE_query = 29, RULE_expresion = 30;
	public static final String[] ruleNames = {
		"todo", "database", "table", "tableAction", "tipo", "constraint", "exp", 
		"exp2", "exp3", "exp4", "unifactor", "factor", "literal", "logicExp", 
		"logicExpNot", "logicExpOr", "logicExpAnd", "relationalExpEq", "relationalExpGL", 
		"relationalExp", "insert", "formatValue", "entero", "decimal", "fecha", 
		"character", "update", "condicion", "delete", "query", "expresion"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TodoContext todo() throws RecognitionException {
		TodoContext _localctx = new TodoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_todo);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); table();
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
	public static class DeleteTBContext extends DatabaseContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public DeleteTBContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDeleteTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDeleteTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDeleteTB(this);
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
	public static class InsertionContext extends DatabaseContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public InsertionContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsertion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryDBContext extends DatabaseContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QueryDBContext(DatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQueryDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQueryDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQueryDB(this);
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
		enterRule(_localctx, 2, RULE_database);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case K_CREATE:
				_localctx = new CreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66); match(K_CREATE);
				setState(67); match(K_DATABASE);
				setState(68); match(ID);
				}
				break;
			case K_DROP:
				_localctx = new DropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69); match(K_DROP);
				setState(70); match(K_DATABASE);
				setState(71); match(ID);
				}
				break;
			case K_USE:
				_localctx = new UseDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(K_USE);
				setState(73); match(K_DATABASE);
				setState(74); match(ID);
				}
				break;
			case K_SHOW:
				_localctx = new ShowDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75); match(K_SHOW);
				setState(76); match(K_DATABASES);
				}
				break;
			case K_ALTER:
				_localctx = new AlterDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77); match(K_ALTER);
				setState(78); match(K_DATABASE);
				setState(79); match(ID);
				setState(80); match(K_RENAME);
				setState(81); match(K_TO);
				setState(82); match(ID);
				}
				break;
			case K_INSERT:
				_localctx = new InsertionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83); insert();
				}
				break;
			case K_DELETE:
				_localctx = new DeleteTBContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(84); delete();
				}
				break;
			case K_SELECT:
				_localctx = new QueryDBContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(85); query();
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
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public List<TableActionContext> tableAction() {
			return getRuleContexts(TableActionContext.class);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_CONSTRAINT(int i) {
			return getToken(SQLParser.K_CONSTRAINT, i);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLES() { return getToken(SQLParser.K_TABLES, 0); }
		public List<TerminalNode> K_CONSTRAINT() { return getTokens(SQLParser.K_CONSTRAINT); }
		public TerminalNode K_SHOW() { return getToken(SQLParser.K_SHOW, 0); }
		public TableActionContext tableAction(int i) {
			return getRuleContext(TableActionContext.class,i);
		}
		public TerminalNode K_COLUMNS() { return getToken(SQLParser.K_COLUMNS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_table);
		int _la;
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(K_CREATE);
				setState(89); match(K_TABLE);
				setState(90); match(ID);
				setState(104);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(91); match(T__5);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(92); match(ID);
						setState(93); tipo();
						setState(96);
						_la = _input.LA(1);
						if (_la==K_CONSTRAINT) {
							{
							setState(94); match(K_CONSTRAINT);
							setState(95); constraint();
							}
						}

						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(103); match(T__4);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(K_ALTER);
				setState(107); match(K_TABLE);
				setState(108); match(ID);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_DROP || _la==K_ADD) {
					{
					{
					setState(109); tableAction();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115); match(K_ALTER);
				setState(116); match(K_TABLE);
				setState(117); match(ID);
				setState(118); match(K_RENAME);
				setState(119); match(K_TO);
				setState(120); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121); match(K_DROP);
				setState(122); match(K_TABLE);
				setState(123); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124); match(K_SHOW);
				setState(125); match(K_TABLES);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126); match(K_SHOW);
				setState(127); match(K_COLUMNS);
				setState(128); match(K_FROM);
				setState(129); match(ID);
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTableAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableActionContext tableAction() throws RecognitionException {
		TableActionContext _localctx = new TableActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableAction);
		int _la;
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); match(K_ADD);
				setState(133); match(K_COLUMN);
				setState(134); match(ID);
				setState(135); tipo();
				setState(143);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT) {
					{
					setState(136); match(K_CONSTRAINT);
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_PRIMARY) | (1L << K_CHECK) | (1L << K_FOREIGN))) != 0)) {
						{
						{
						setState(137); constraint();
						}
						}
						setState(142);
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
				setState(145); match(K_ADD);
				setState(146); match(K_CONSTRAINT);
				setState(147); constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); match(K_DROP);
				setState(149); match(K_COLUMN);
				setState(150); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151); match(K_DROP);
				setState(152); match(K_CONSTRAINT);
				setState(153); match(ID);
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
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(163);
			switch (_input.LA(1)) {
			case K_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); match(K_INT);
				}
				break;
			case K_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); match(K_FLOAT);
				}
				break;
			case K_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(158); match(K_DATE);
				}
				break;
			case K_CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); match(K_CHAR);
				setState(160); match(T__5);
				setState(161); match(NUM);
				setState(162); match(T__4);
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
		enterRule(_localctx, 10, RULE_constraint);
		int _la;
		try {
			setState(194);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); match(K_PRIMARY);
				setState(166); match(K_KEY);
				setState(167); match(T__5);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(168); match(ID);
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(169); match(T__2);
						setState(170); match(ID);
						}
						}
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181); match(T__4);
				}
				break;
			case K_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); match(K_FOREIGN);
				setState(183); match(K_KEY);
				setState(184); match(T__5);
				setState(185); match(ID);
				setState(186); match(T__4);
				setState(187); match(K_REFERENCES);
				setState(188); match(ID);
				setState(189); match(T__5);
				setState(190); match(ID);
				setState(191); match(T__4);
				}
				break;
			case K_CHECK:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); match(K_CHECK);
				{
				setState(193); exp(0);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(197); exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(199);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(200); logicExpAnd();
					setState(201); exp2(0);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209); exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(211);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(212); logicExpOr();
					setState(213); exp3(0);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221); exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224); relationalExpEq();
					setState(225); exp4(0);
					}
					} 
				}
				setState(231);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233); unifactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(235);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(236); relationalExpGL();
					setState(237); exp4(3);
					}
					} 
				}
				setState(243);
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
		enterRule(_localctx, 20, RULE_unifactor);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case K_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); match(K_NOT);
				setState(245); factor();
				}
				break;
			case T__5:
			case T__1:
			case UNUM:
			case NUM:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); factor();
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
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case T__1:
			case UNUM:
			case NUM:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); literal();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); match(T__5);
				setState(251); exp(0);
				setState(252); match(T__4);
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
		enterRule(_localctx, 24, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); formatValue();
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
		enterRule(_localctx, 26, RULE_logicExp);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case K_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); logicExpAnd();
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); logicExpOr();
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(260); logicExpNot();
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
		enterRule(_localctx, 28, RULE_logicExpNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(K_NOT);
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
		enterRule(_localctx, 30, RULE_logicExpOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(K_OR);
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
		enterRule(_localctx, 32, RULE_logicExpAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(K_AND);
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
		enterRule(_localctx, 34, RULE_relationalExpEq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 36, RULE_relationalExpGL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 38, RULE_relationalExp);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case T__11:
			case T__10:
			case T__8:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); relationalExpGL();
				}
				break;
			case T__9:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); relationalExpEq();
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
		enterRule(_localctx, 40, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(K_INSERT);
			setState(278); match(K_INTO);
			setState(279); match(ID);
			setState(280); match(T__5);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(281); match(ID);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(282); match(T__2);
					setState(283); match(ID);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294); match(T__12);
			setState(295); match(K_VALUES);
			setState(296); match(T__5);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNUM) | (1L << NUM) | (1L << CHAR))) != 0)) {
				{
				{
				setState(297); formatValue();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(298); match(T__2);
					setState(299); formatValue();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310); match(T__4);
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
		enterRule(_localctx, 42, RULE_formatValue);
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314); fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315); character();
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
		enterRule(_localctx, 44, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(318); match(T__1);
				}
			}

			setState(321); match(NUM);
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
		enterRule(_localctx, 46, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); entero();
			setState(324); match(T__0);
			setState(325); match(NUM);
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
		enterRule(_localctx, 48, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(UNUM);
			setState(328); match(UNUM);
			setState(329); match(UNUM);
			setState(330); match(UNUM);
			setState(331); match(T__1);
			setState(332); match(UNUM);
			setState(333); match(UNUM);
			setState(334); match(T__1);
			setState(335); match(UNUM);
			setState(336); match(UNUM);
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
		enterRule(_localctx, 50, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(CHAR);
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
		enterRule(_localctx, 52, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(K_UPDATE);
			setState(341); match(ID);
			setState(342); match(K_SET);
			setState(343); condicion();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(344); match(T__2);
				setState(345); condicion();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(351); match(K_WHERE);
				setState(352); condicion();
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
		enterRule(_localctx, 54, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(355); expresion();
			setState(356); relationalExp();
			setState(359);
			switch (_input.LA(1)) {
			case T__1:
			case UNUM:
			case NUM:
			case CHAR:
				{
				setState(357); formatValue();
				}
				break;
			case ID:
				{
				setState(358); expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(364);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_AND) | (1L << K_OR) | (1L << K_NOT))) != 0)) {
				{
				setState(361); logicExp();
				setState(362); condicion();
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
		enterRule(_localctx, 56, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(K_DELETE);
			setState(367); match(K_FROM);
			setState(368); match(ID);
			setState(369); match(K_WHERE);
			setState(370); condicion();
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
		enterRule(_localctx, 58, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); match(K_SELECT);
			setState(382);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(373); match(T__3);
				}
				break;
			case ID:
				{
				{
				setState(374); match(ID);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(375); match(T__2);
					setState(376); match(ID);
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(384); match(K_FROM);
			setState(385); match(ID);
			setState(386); match(K_WHERE);
			setState(387); condicion();
			setState(388); match(K_ORDER);
			setState(389); match(K_BY);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(390); expresion();
				setState(391);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(392); match(T__2);
					setState(393); expresion();
					setState(394);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(405);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(ID);
			setState(409);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(407); match(T__0);
				setState(408); match(ID);
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
		case 6: return exp_sempred((ExpContext)_localctx, predIndex);
		case 7: return exp2_sempred((Exp2Context)_localctx, predIndex);
		case 8: return exp3_sempred((Exp3Context)_localctx, predIndex);
		case 9: return exp4_sempred((Exp4Context)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u019e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\5\2C\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"c\n\4\7\4e\n\4\f\4\16\4h\13\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\7\4q\n\4\f"+
		"\4\16\4t\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u0085\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008d\n\5\f\5\16\5\u0090"+
		"\13\5\5\5\u0092\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009d\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00ae\n\7\f\7\16\7\u00b1\13\7\7\7\u00b3\n\7\f\7\16\7\u00b6\13\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c5\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00ce\n\b\f\b\16\b\u00d1\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00da\n\t\f\t\16\t\u00dd\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00e6\n\n\f\n\16\n\u00e9\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00f2\n\13\f\13\16\13\u00f5\13\13\3\f\3\f\3\f\5\f\u00fa\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0101\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u0108\n\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u0116"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011f\n\26\f\26\16\26\u0122"+
		"\13\26\7\26\u0124\n\26\f\26\16\26\u0127\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u012f\n\26\f\26\16\26\u0132\13\26\7\26\u0134\n\26\f\26\16\26"+
		"\u0137\13\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u013f\n\27\3\30\5\30\u0142"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u015d"+
		"\n\34\f\34\16\34\u0160\13\34\3\34\3\34\5\34\u0164\n\34\3\35\3\35\3\35"+
		"\3\35\5\35\u016a\n\35\3\35\3\35\3\35\5\35\u016f\n\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u017c\n\37\f\37\16\37\u017f"+
		"\13\37\5\37\u0181\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\7\37\u018f\n\37\f\37\16\37\u0192\13\37\7\37\u0194\n\37\f"+
		"\37\16\37\u0197\13\37\3 \3 \3 \5 \u019c\n \3 \2\6\16\20\22\24!\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5\4\2\6\6\t"+
		"\t\4\2\4\5\7\b\3\2\62\63\u01b5\2B\3\2\2\2\4X\3\2\2\2\6\u0084\3\2\2\2\b"+
		"\u009c\3\2\2\2\n\u00a5\3\2\2\2\f\u00c4\3\2\2\2\16\u00c6\3\2\2\2\20\u00d2"+
		"\3\2\2\2\22\u00de\3\2\2\2\24\u00ea\3\2\2\2\26\u00f9\3\2\2\2\30\u0100\3"+
		"\2\2\2\32\u0102\3\2\2\2\34\u0107\3\2\2\2\36\u0109\3\2\2\2 \u010b\3\2\2"+
		"\2\"\u010d\3\2\2\2$\u010f\3\2\2\2&\u0111\3\2\2\2(\u0115\3\2\2\2*\u0117"+
		"\3\2\2\2,\u013e\3\2\2\2.\u0141\3\2\2\2\60\u0145\3\2\2\2\62\u0149\3\2\2"+
		"\2\64\u0154\3\2\2\2\66\u0156\3\2\2\28\u0165\3\2\2\2:\u0170\3\2\2\2<\u0176"+
		"\3\2\2\2>\u0198\3\2\2\2@C\5\4\3\2AC\5\6\4\2B@\3\2\2\2BA\3\2\2\2C\3\3\2"+
		"\2\2DE\7\20\2\2EF\7\21\2\2FY\7;\2\2GH\7\23\2\2HI\7\21\2\2IY\7;\2\2JK\7"+
		"\24\2\2KL\7\21\2\2LY\7;\2\2MN\7\25\2\2NY\7\22\2\2OP\7\26\2\2PQ\7\21\2"+
		"\2QR\7;\2\2RS\7\27\2\2ST\7\30\2\2TY\7;\2\2UY\5*\26\2VY\5:\36\2WY\5<\37"+
		"\2XD\3\2\2\2XG\3\2\2\2XJ\3\2\2\2XM\3\2\2\2XO\3\2\2\2XU\3\2\2\2XV\3\2\2"+
		"\2XW\3\2\2\2Y\5\3\2\2\2Z[\7\20\2\2[\\\7\31\2\2\\j\7;\2\2]f\7\n\2\2^_\7"+
		";\2\2_b\5\n\6\2`a\7\33\2\2ac\5\f\7\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d^\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ik\7\13\2\2j]"+
		"\3\2\2\2jk\3\2\2\2k\u0085\3\2\2\2lm\7\26\2\2mn\7\31\2\2nr\7;\2\2oq\5\b"+
		"\5\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\u0085\3\2\2\2tr\3\2\2\2"+
		"uv\7\26\2\2vw\7\31\2\2wx\7;\2\2xy\7\27\2\2yz\7\30\2\2z\u0085\7;\2\2{|"+
		"\7\23\2\2|}\7\31\2\2}\u0085\7;\2\2~\177\7\25\2\2\177\u0085\7\32\2\2\u0080"+
		"\u0081\7\25\2\2\u0081\u0082\7\35\2\2\u0082\u0083\7\36\2\2\u0083\u0085"+
		"\7;\2\2\u0084Z\3\2\2\2\u0084l\3\2\2\2\u0084u\3\2\2\2\u0084{\3\2\2\2\u0084"+
		"~\3\2\2\2\u0084\u0080\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7\37\2\2\u0087"+
		"\u0088\7\34\2\2\u0088\u0089\7;\2\2\u0089\u0091\5\n\6\2\u008a\u008e\7\33"+
		"\2\2\u008b\u008d\5\f\7\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u008a\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009d\3\2\2\2\u0093"+
		"\u0094\7\37\2\2\u0094\u0095\7\33\2\2\u0095\u009d\5\f\7\2\u0096\u0097\7"+
		"\23\2\2\u0097\u0098\7\34\2\2\u0098\u009d\7;\2\2\u0099\u009a\7\23\2\2\u009a"+
		"\u009b\7\33\2\2\u009b\u009d\7;\2\2\u009c\u0086\3\2\2\2\u009c\u0093\3\2"+
		"\2\2\u009c\u0096\3\2\2\2\u009c\u0099\3\2\2\2\u009d\t\3\2\2\2\u009e\u00a6"+
		"\7\"\2\2\u009f\u00a6\7%\2\2\u00a0\u00a6\7#\2\2\u00a1\u00a2\7$\2\2\u00a2"+
		"\u00a3\7\n\2\2\u00a3\u00a4\7=\2\2\u00a4\u00a6\7\13\2\2\u00a5\u009e\3\2"+
		"\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00a8\7&\2\2\u00a8\u00a9\7*\2\2\u00a9\u00b4\7\n\2\2"+
		"\u00aa\u00af\7;\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ae\7;\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00c5\7\13\2\2\u00b8\u00b9\7)\2\2\u00b9\u00ba\7*"+
		"\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bc\7;\2\2\u00bc\u00bd\7\13\2\2\u00bd"+
		"\u00be\7(\2\2\u00be\u00bf\7;\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c1\7;\2"+
		"\2\u00c1\u00c5\7\13\2\2\u00c2\u00c3\7\'\2\2\u00c3\u00c5\5\16\b\2\u00c4"+
		"\u00a7\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\r\3\2\2\2"+
		"\u00c6\u00c7\b\b\1\2\u00c7\u00c8\5\20\t\2\u00c8\u00cf\3\2\2\2\u00c9\u00ca"+
		"\f\4\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\5\20\t\2\u00cc\u00ce\3\2\2\2"+
		"\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\17\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\t\1\2\u00d3"+
		"\u00d4\5\22\n\2\u00d4\u00db\3\2\2\2\u00d5\u00d6\f\4\2\2\u00d6\u00d7\5"+
		" \21\2\u00d7\u00d8\5\22\n\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\21\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00de\u00df\b\n\1\2\u00df\u00e0\5\24\13\2\u00e0"+
		"\u00e7\3\2\2\2\u00e1\u00e2\f\4\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\5\24"+
		"\13\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\23\3\2\2\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea\u00eb\b\13\1\2\u00eb\u00ec\5\26\f\2\u00ec\u00f3\3\2\2\2\u00ed"+
		"\u00ee\f\4\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\5\24\13\5\u00f0\u00f2\3"+
		"\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\25\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\66\2"+
		"\2\u00f7\u00fa\5\30\r\2\u00f8\u00fa\5\30\r\2\u00f9\u00f6\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u0101\5\32\16\2\u00fc\u00fd\7\n"+
		"\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\7\13\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\31\3\2\2\2\u0102\u0103\5,\27"+
		"\2\u0103\33\3\2\2\2\u0104\u0108\5\"\22\2\u0105\u0108\5 \21\2\u0106\u0108"+
		"\5\36\20\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\35\3\2\2\2\u0109\u010a\7\66\2\2\u010a\37\3\2\2\2\u010b\u010c\7"+
		"\65\2\2\u010c!\3\2\2\2\u010d\u010e\7\64\2\2\u010e#\3\2\2\2\u010f\u0110"+
		"\t\2\2\2\u0110%\3\2\2\2\u0111\u0112\t\3\2\2\u0112\'\3\2\2\2\u0113\u0116"+
		"\5&\24\2\u0114\u0116\5$\23\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		")\3\2\2\2\u0117\u0118\7+\2\2\u0118\u0119\7,\2\2\u0119\u011a\7;\2\2\u011a"+
		"\u0125\7\n\2\2\u011b\u0120\7;\2\2\u011c\u011d\7\r\2\2\u011d\u011f\7;\2"+
		"\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u011b\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\3\2\2\u0129\u012a\7-\2\2\u012a"+
		"\u0135\7\n\2\2\u012b\u0130\5,\27\2\u012c\u012d\7\r\2\2\u012d\u012f\5,"+
		"\27\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u012b\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\13\2\2\u0139+\3\2\2\2"+
		"\u013a\u013f\5.\30\2\u013b\u013f\5\60\31\2\u013c\u013f\5\62\32\2\u013d"+
		"\u013f\5\64\33\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3"+
		"\2\2\2\u013e\u013d\3\2\2\2\u013f-\3\2\2\2\u0140\u0142\7\16\2\2\u0141\u0140"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7=\2\2\u0144"+
		"/\3\2\2\2\u0145\u0146\5.\30\2\u0146\u0147\7\17\2\2\u0147\u0148\7=\2\2"+
		"\u0148\61\3\2\2\2\u0149\u014a\7<\2\2\u014a\u014b\7<\2\2\u014b\u014c\7"+
		"<\2\2\u014c\u014d\7<\2\2\u014d\u014e\7\16\2\2\u014e\u014f\7<\2\2\u014f"+
		"\u0150\7<\2\2\u0150\u0151\7\16\2\2\u0151\u0152\7<\2\2\u0152\u0153\7<\2"+
		"\2\u0153\63\3\2\2\2\u0154\u0155\7>\2\2\u0155\65\3\2\2\2\u0156\u0157\7"+
		"\60\2\2\u0157\u0158\7;\2\2\u0158\u0159\7/\2\2\u0159\u015e\58\35\2\u015a"+
		"\u015b\7\r\2\2\u015b\u015d\58\35\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0162\7!\2\2\u0162\u0164\58\35\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\67\3\2\2\2\u0165\u0166\5> \2\u0166\u0169"+
		"\5(\25\2\u0167\u016a\5,\27\2\u0168\u016a\5> \2\u0169\u0167\3\2\2\2\u0169"+
		"\u0168\3\2\2\2\u016a\u016e\3\2\2\2\u016b\u016c\5\34\17\2\u016c\u016d\5"+
		"8\35\2\u016d\u016f\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"9\3\2\2\2\u0170\u0171\7\67\2\2\u0171\u0172\7\36\2\2\u0172\u0173\7;\2\2"+
		"\u0173\u0174\7!\2\2\u0174\u0175\58\35\2\u0175;\3\2\2\2\u0176\u0180\7 "+
		"\2\2\u0177\u0181\7\f\2\2\u0178\u017d\7;\2\2\u0179\u017a\7\r\2\2\u017a"+
		"\u017c\7;\2\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0177\3\2\2\2\u0180\u0178\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\36"+
		"\2\2\u0183\u0184\7;\2\2\u0184\u0185\7!\2\2\u0185\u0186\58\35\2\u0186\u0187"+
		"\7.\2\2\u0187\u0195\7\61\2\2\u0188\u0189\5> \2\u0189\u0190\t\4\2\2\u018a"+
		"\u018b\7\r\2\2\u018b\u018c\5> \2\u018c\u018d\t\4\2\2\u018d\u018f\3\2\2"+
		"\2\u018e\u018a\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0188\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196=\3\2\2\2"+
		"\u0197\u0195\3\2\2\2\u0198\u019b\7;\2\2\u0199\u019a\7\17\2\2\u019a\u019c"+
		"\7;\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c?\3\2\2\2\'BXbfj"+
		"r\u0084\u008e\u0091\u009c\u00a5\u00af\u00b4\u00c4\u00cf\u00db\u00e7\u00f3"+
		"\u00f9\u0100\u0107\u0115\u0120\u0125\u0130\u0135\u013e\u0141\u015e\u0163"+
		"\u0169\u016e\u017d\u0180\u0190\u0195\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}