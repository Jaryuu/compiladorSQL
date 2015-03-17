grammar SQL;

fragment LETTER: ( 'a'..'z' | 'A'..'Z') ;
fragment DIGIT: '0'..'9' ;

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

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
:	C R E A T E
;

k_database
:	D A T A B A S E
;

k_databases
:	D A T A B A S E S 
;

k_drop
:	D R O P
;

k_use
:	U S E
;

k_show
:	S H O W
;

k_alter
:	A L T E R
;

k_rename
:	R E N A M E
;

k_to
:	T O
;

k_table
:	T A B L E
;

k_tables
:	T A B L E S
;

k_constraint
:	C O N S T R A I N T
;

k_column
:	C O L U M N
;

k_columns
:	C O L U M N S
;

k_from
:	F R O M
;

k_add
:	A D D
;

k_select
:	S E L E C T
;

k_where
: 	W H E R E
;

k_int
:	I N T
;

k_date
:	D A T E
;

k_char
:	C H A R
;

k_float
: 	F L O A T
;

k_primary
:	P R I M A R Y
;

k_check
:	C H E C K
;

k_references
:	R E F E R E N C E S
;

k_foreign
:	F O R E I G N
;

k_key
: 	K E Y
;

k_insert
:	I N S E R T
;

k_into
:	I N T O
;

k_values
:	V A L U E S
;

k_order
:	O R D E R
;

k_set
:	S E T
;

k_update
: 	U P D A  T E
;

k_by
:	B Y
;

k_asc
:	A S C
;

k_desc
:	D E S C
;

k_and
:	A N D
;

k_or
:	O R
;

k_not
:	N O T
;

k_delete
:	D E L E T E
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