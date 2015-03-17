grammar SQL;

fragment LETTER: ( 'a'..'z' | 'A'..'Z') ;
fragment DIGIT: '0'..'9' ;


SPACES
: [ \t\r\n\f]+ -> channel(HIDDEN)
;

SINGLE_LINE_COMMENT
: '//' ~('\r' | '\n' )*  -> channel(HIDDEN)
;

MULTILINE_COMMENT
: '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
;

ID : LETTER (LETTER | DIGIT)* ;
NUM: DIGIT(DIGIT)* ;
CHAR: '\''(([a-zA-Z]|DIGIT|| '!' | '"' | '#' | '$' | '%' | '&' | '\'' | '(' | ')' | '*' | '+' 
| ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '[' | '\\' | ']' | '^' | '_' | '`'| '{' | '|' | '}' | '~' 
'\t'| '\n' | '\"' |  '\\n' | '\\t' ))* '\'';


//keywords
k_create
:	'CREATE'
;

k_database
:	'DATABASE'
;

k_databases
:	'DATABASES'
;

k_drop
:	'DROP'
;

k_use
:	'USE'
;

k_show
:	'SHOW'
;

k_alter
:	'ALTER'
;

k_rename
:	'RENAME'
;

k_to
:	'TO'
;

k_table
:	'TABLE'
;

k_tables
:	'TABLES'
;

k_constraint
:	'CONSTRAINT'
;

k_column
:	'COLUMN'
;

k_columns
:	'COLUMNS'
;

k_from
:	'FROM'
;

k_add
:	'ADD'
;

k_select
:	'SELECT'
;

k_where
: 	'WHERE'
;

k_int
:	'INT'
;

k_date
:	'DATE'
;

k_char
:	'char'
;

k_float
: 	'FLOAT'
;

k_primary
:	'PRIMARY'
;

k_check
:	'CHECK'
;

k_references
:	'REFERENCES'
;

k_foreign
:	'FOREIGN'
;

k_key
: 	'KEY'
;

k_insert
:	'INSERT'
;

k_into
:	'INTO'
;

k_values
:	'VALUES'
;

k_order
:	'ORDER'
;

k_set
:	'SET'
;

k_update
: 	'UPDATE'
;

k_by
:	'BY'
;

k_asc
:	'ASC'
;

k_desc
:	'DESC'
;

k_and
:	'AND'
;

k_or
:	'OR'
;

k_not
:	'NOT'
;

k_delete
:	'DELETE'
;

todo
: 	database
| 	table
;

database
:	k_create k_database ID
|	k_drop  k_database  ID
|	k_use  k_database  ID
|	k_show  k_databases ID
|	k_alter  k_database  ID  k_rename  k_to  ID
|	insert
|	delete
|	query
;

table
:	k_create  k_table  ID ('(' (ID tipo (k_constraint constraint)? )* ')')?
|	k_alter  k_table  ID   (tableAction)*
|	k_alter  k_table  ID  k_rename  k_to  ID 
|	k_drop  k_table  ID
|	k_show  k_tables
| 	k_show  k_columns  k_from  ID 
;

tableAction
:	k_add  k_column  ID tipo (k_constraint (constraint)* )? 
|	k_add  k_constraint constraint
|	k_drop  k_column  ID
|	k_drop  k_constraint  ID
;

tipo
:	k_int
|	k_float
|	k_date
|	k_char '('NUM')'
;

constraint
:	k_primary  k_key '(' (ID (',' ID )*)* ')'
|	k_foreign  k_key '(' ID ')' k_references ID '('ID')'
|	k_check (exp)
;

exp
:	logicExp
|	relationalExp
;

logicExp	
:	k_and
|	k_or	
|	k_not
;

relationalExp
:	'<'
|	'<='
|	'>'
|	'>='
|	'<>'
|	'='
;

insert
:	k_insert  k_into  ID '(' (ID (',' ID )*)* ') ' k_values '(' (formatValue (',' formatValue )*)* ')'
;

formatValue
:	entero
|	decimal
|	fecha
|	character
;

entero
: ('-')? NUM
;

decimal
: entero '.' NUM
;

fecha
:	DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT
;

character
:	CHAR
;

update
:	k_update  ID  k_set  condicion (',' condicion)*  (k_where condicion)?
;

condicion
:	(expresion relationalExp (formatValue | expresion)) (logicExp condicion)?
;

delete
:	k_delete   k_from  ID  k_where condicion
;

query
:	k_select ('*' | (ID (',' ID)*))  k_from  ID  k_where  condicion k_order  k_by (expresion (k_asc | k_desc) (',' expresion (k_asc | k_desc))*)* 
;

expresion
:	ID ('.' ID)?
;