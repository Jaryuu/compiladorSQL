// Generated from SQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_char}.
	 * @param ctx the parse tree
	 */
	void enterK_char(@NotNull SQLParser.K_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_char}.
	 * @param ctx the parse tree
	 */
	void exitK_char(@NotNull SQLParser.K_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_tables}.
	 * @param ctx the parse tree
	 */
	void enterK_tables(@NotNull SQLParser.K_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_tables}.
	 * @param ctx the parse tree
	 */
	void exitK_tables(@NotNull SQLParser.K_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_and}.
	 * @param ctx the parse tree
	 */
	void enterK_and(@NotNull SQLParser.K_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_and}.
	 * @param ctx the parse tree
	 */
	void exitK_and(@NotNull SQLParser.K_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_delete}.
	 * @param ctx the parse tree
	 */
	void enterK_delete(@NotNull SQLParser.K_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_delete}.
	 * @param ctx the parse tree
	 */
	void exitK_delete(@NotNull SQLParser.K_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_alter}.
	 * @param ctx the parse tree
	 */
	void enterK_alter(@NotNull SQLParser.K_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_alter}.
	 * @param ctx the parse tree
	 */
	void exitK_alter(@NotNull SQLParser.K_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_table}.
	 * @param ctx the parse tree
	 */
	void enterK_table(@NotNull SQLParser.K_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_table}.
	 * @param ctx the parse tree
	 */
	void exitK_table(@NotNull SQLParser.K_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_databases}.
	 * @param ctx the parse tree
	 */
	void enterK_databases(@NotNull SQLParser.K_databasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_databases}.
	 * @param ctx the parse tree
	 */
	void exitK_databases(@NotNull SQLParser.K_databasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_show}.
	 * @param ctx the parse tree
	 */
	void enterK_show(@NotNull SQLParser.K_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_show}.
	 * @param ctx the parse tree
	 */
	void exitK_show(@NotNull SQLParser.K_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_desc}.
	 * @param ctx the parse tree
	 */
	void enterK_desc(@NotNull SQLParser.K_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_desc}.
	 * @param ctx the parse tree
	 */
	void exitK_desc(@NotNull SQLParser.K_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#formatValue}.
	 * @param ctx the parse tree
	 */
	void enterFormatValue(@NotNull SQLParser.FormatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#formatValue}.
	 * @param ctx the parse tree
	 */
	void exitFormatValue(@NotNull SQLParser.FormatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_to}.
	 * @param ctx the parse tree
	 */
	void enterK_to(@NotNull SQLParser.K_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_to}.
	 * @param ctx the parse tree
	 */
	void exitK_to(@NotNull SQLParser.K_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_from}.
	 * @param ctx the parse tree
	 */
	void enterK_from(@NotNull SQLParser.K_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_from}.
	 * @param ctx the parse tree
	 */
	void exitK_from(@NotNull SQLParser.K_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_asc}.
	 * @param ctx the parse tree
	 */
	void enterK_asc(@NotNull SQLParser.K_ascContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_asc}.
	 * @param ctx the parse tree
	 */
	void exitK_asc(@NotNull SQLParser.K_ascContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_set}.
	 * @param ctx the parse tree
	 */
	void enterK_set(@NotNull SQLParser.K_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_set}.
	 * @param ctx the parse tree
	 */
	void exitK_set(@NotNull SQLParser.K_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_add}.
	 * @param ctx the parse tree
	 */
	void enterK_add(@NotNull SQLParser.K_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_add}.
	 * @param ctx the parse tree
	 */
	void exitK_add(@NotNull SQLParser.K_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_values}.
	 * @param ctx the parse tree
	 */
	void enterK_values(@NotNull SQLParser.K_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_values}.
	 * @param ctx the parse tree
	 */
	void exitK_values(@NotNull SQLParser.K_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull SQLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull SQLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicExp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(@NotNull SQLParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicExp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(@NotNull SQLParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_constraint}.
	 * @param ctx the parse tree
	 */
	void enterK_constraint(@NotNull SQLParser.K_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_constraint}.
	 * @param ctx the parse tree
	 */
	void exitK_constraint(@NotNull SQLParser.K_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_create}.
	 * @param ctx the parse tree
	 */
	void enterK_create(@NotNull SQLParser.K_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_create}.
	 * @param ctx the parse tree
	 */
	void exitK_create(@NotNull SQLParser.K_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull SQLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull SQLParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_int}.
	 * @param ctx the parse tree
	 */
	void enterK_int(@NotNull SQLParser.K_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_int}.
	 * @param ctx the parse tree
	 */
	void exitK_int(@NotNull SQLParser.K_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull SQLParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull SQLParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_insert}.
	 * @param ctx the parse tree
	 */
	void enterK_insert(@NotNull SQLParser.K_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_insert}.
	 * @param ctx the parse tree
	 */
	void exitK_insert(@NotNull SQLParser.K_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_select}.
	 * @param ctx the parse tree
	 */
	void enterK_select(@NotNull SQLParser.K_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_select}.
	 * @param ctx the parse tree
	 */
	void exitK_select(@NotNull SQLParser.K_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_primary}.
	 * @param ctx the parse tree
	 */
	void enterK_primary(@NotNull SQLParser.K_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_primary}.
	 * @param ctx the parse tree
	 */
	void exitK_primary(@NotNull SQLParser.K_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_references}.
	 * @param ctx the parse tree
	 */
	void enterK_references(@NotNull SQLParser.K_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_references}.
	 * @param ctx the parse tree
	 */
	void exitK_references(@NotNull SQLParser.K_referencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_date}.
	 * @param ctx the parse tree
	 */
	void enterK_date(@NotNull SQLParser.K_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_date}.
	 * @param ctx the parse tree
	 */
	void exitK_date(@NotNull SQLParser.K_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_check}.
	 * @param ctx the parse tree
	 */
	void enterK_check(@NotNull SQLParser.K_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_check}.
	 * @param ctx the parse tree
	 */
	void exitK_check(@NotNull SQLParser.K_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_into}.
	 * @param ctx the parse tree
	 */
	void enterK_into(@NotNull SQLParser.K_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_into}.
	 * @param ctx the parse tree
	 */
	void exitK_into(@NotNull SQLParser.K_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull SQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull SQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void enterTableAction(@NotNull SQLParser.TableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void exitTableAction(@NotNull SQLParser.TableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull SQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull SQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#todo}.
	 * @param ctx the parse tree
	 */
	void enterTodo(@NotNull SQLParser.TodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#todo}.
	 * @param ctx the parse tree
	 */
	void exitTodo(@NotNull SQLParser.TodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull SQLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull SQLParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_float}.
	 * @param ctx the parse tree
	 */
	void enterK_float(@NotNull SQLParser.K_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_float}.
	 * @param ctx the parse tree
	 */
	void exitK_float(@NotNull SQLParser.K_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull SQLParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull SQLParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_columns}.
	 * @param ctx the parse tree
	 */
	void enterK_columns(@NotNull SQLParser.K_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_columns}.
	 * @param ctx the parse tree
	 */
	void exitK_columns(@NotNull SQLParser.K_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_database}.
	 * @param ctx the parse tree
	 */
	void enterK_database(@NotNull SQLParser.K_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_database}.
	 * @param ctx the parse tree
	 */
	void exitK_database(@NotNull SQLParser.K_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_foreign}.
	 * @param ctx the parse tree
	 */
	void enterK_foreign(@NotNull SQLParser.K_foreignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_foreign}.
	 * @param ctx the parse tree
	 */
	void exitK_foreign(@NotNull SQLParser.K_foreignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_not}.
	 * @param ctx the parse tree
	 */
	void enterK_not(@NotNull SQLParser.K_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_not}.
	 * @param ctx the parse tree
	 */
	void exitK_not(@NotNull SQLParser.K_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull SQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull SQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_by}.
	 * @param ctx the parse tree
	 */
	void enterK_by(@NotNull SQLParser.K_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_by}.
	 * @param ctx the parse tree
	 */
	void exitK_by(@NotNull SQLParser.K_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_order}.
	 * @param ctx the parse tree
	 */
	void enterK_order(@NotNull SQLParser.K_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_order}.
	 * @param ctx the parse tree
	 */
	void exitK_order(@NotNull SQLParser.K_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fecha}.
	 * @param ctx the parse tree
	 */
	void enterFecha(@NotNull SQLParser.FechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fecha}.
	 * @param ctx the parse tree
	 */
	void exitFecha(@NotNull SQLParser.FechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_update}.
	 * @param ctx the parse tree
	 */
	void enterK_update(@NotNull SQLParser.K_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_update}.
	 * @param ctx the parse tree
	 */
	void exitK_update(@NotNull SQLParser.K_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(@NotNull SQLParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(@NotNull SQLParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull SQLParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull SQLParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull SQLParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull SQLParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_where}.
	 * @param ctx the parse tree
	 */
	void enterK_where(@NotNull SQLParser.K_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_where}.
	 * @param ctx the parse tree
	 */
	void exitK_where(@NotNull SQLParser.K_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_or}.
	 * @param ctx the parse tree
	 */
	void enterK_or(@NotNull SQLParser.K_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_or}.
	 * @param ctx the parse tree
	 */
	void exitK_or(@NotNull SQLParser.K_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(@NotNull SQLParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(@NotNull SQLParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_drop}.
	 * @param ctx the parse tree
	 */
	void enterK_drop(@NotNull SQLParser.K_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_drop}.
	 * @param ctx the parse tree
	 */
	void exitK_drop(@NotNull SQLParser.K_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_rename}.
	 * @param ctx the parse tree
	 */
	void enterK_rename(@NotNull SQLParser.K_renameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_rename}.
	 * @param ctx the parse tree
	 */
	void exitK_rename(@NotNull SQLParser.K_renameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#relationalExp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExp(@NotNull SQLParser.RelationalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#relationalExp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExp(@NotNull SQLParser.RelationalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull SQLParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull SQLParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull SQLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull SQLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_key}.
	 * @param ctx the parse tree
	 */
	void enterK_key(@NotNull SQLParser.K_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_key}.
	 * @param ctx the parse tree
	 */
	void exitK_key(@NotNull SQLParser.K_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_use}.
	 * @param ctx the parse tree
	 */
	void enterK_use(@NotNull SQLParser.K_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_use}.
	 * @param ctx the parse tree
	 */
	void exitK_use(@NotNull SQLParser.K_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#k_column}.
	 * @param ctx the parse tree
	 */
	void enterK_column(@NotNull SQLParser.K_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#k_column}.
	 * @param ctx the parse tree
	 */
	void exitK_column(@NotNull SQLParser.K_columnContext ctx);
}