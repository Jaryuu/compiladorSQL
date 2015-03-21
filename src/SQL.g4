grammar SQL;

fragment LETTER: ( 'a'..'z' | 'A'..'Z') ;
fragment DIGIT: '0'..'9' ;

//keywords
K_CREATE
:	('C'|'c') ('R'|'r') ('E'|'e') ('A'|'a') ('T'|'t') ('E'|'e')
;

K_DATABASE
:	('D'|'d') ('A'|'a') ('T'|'t') ('A'|'a') ('B'|'b') ('A'|'a') ('S'|'s') ('E'|'e')
;

K_DATABASES
:	('D'|'d') ('A'|'a') ('T'|'t') ('A'|'a') ('B'|'b') ('A'|'a') ('S'|'s') ('E'|'e') ('S'|'s') 
;

K_DROP
:	('D'|'d') ('R'|'r') ('O'|'o') ('P'|'p')
;

K_USE
:	('U'|'u') ('S'|'s') ('E'|'e')
;

K_SHOW
:	('S'|'s') ('H'|'h') ('O'|'o') ('W'|'w')
;

K_ALTER
:	('A'|'a') ('L'|'l') ('T'|'t') ('E'|'e') ('R'|'r')
;

K_RENAME
:	('R'|'r') ('E'|'e') ('N'|'n') ('A'|'a') ('M'|'m') ('E'|'e')
;

K_TO
:	('T'|'t') ('O'|'o')
;

K_TABLE
:	('T'|'t') ('A'|'a') ('B'|'b') ('L'|'l') ('E'|'e')
;

K_TABLES
:	('T'|'t') ('A'|'a') ('B'|'b') ('L'|'l') ('E'|'e') ('S'|'s')
;

K_CONSTRAINT
:	('C'|'c') ('O'|'o') ('N'|'n') ('S'|'s') ('T'|'t') ('R'|'r') ('A'|'a') ('I'|'i') ('N'|'n') ('T'|'t')
;

K_COLUMN
:	('C'|'c') ('O'|'o') ('L'|'l') ('U'|'u') ('M'|'m') ('N'|'n')
;

K_COLUMNS
:	('C'|'c') ('O'|'o') ('L'|'l') ('U'|'u') ('M'|'m') ('N'|'n') ('S'|'s')
;

K_FROM
:	('F'|'f') ('R'|'r') ('O'|'o') ('M'|'m')
;

K_ADD
:	('A'|'a') ('D'|'d') ('D'|'d')
;

K_SELECT
:	('S'|'s') ('E'|'e') ('L'|'l') ('E'|'e') ('C'|'c') ('T'|'t')
;

K_WHERE
: 	('W'|'w') ('H'|'h') ('E'|'e') ('R'|'r') ('E'|'e')
;

K_INT
:	('I'|'i') ('N'|'n') ('T'|'t')
;

K_DATE
:	('D'|'d') ('A'|'a') ('T'|'t') ('E'|'e')
;

K_CHAR
:	('C'|'c') ('H'|'h') ('A'|'a') ('R'|'r')
;

K_FLOAT
: 	('F'|'f') ('L'|'l') ('O'|'o') ('A'|'a') ('T'|'t')
;

K_PRIMARY
:	('P'|'p') ('R'|'r') ('I'|'i') ('M'|'m') ('A'|'a') ('R'|'r') ('Y'|'y')
;

K_CHECK
:	('C'|'c') ('H'|'h') ('E'|'e') ('C'|'c') ('K'|'k')
;

K_REFERENCES
:	('R'|'r') ('E'|'e') ('F'|'f') ('E'|'e') ('R'|'r') ('E'|'e') ('N'|'n') ('C'|'c') ('E'|'e') ('S'|'s')
;

K_FOREIGN
:	('F'|'f') ('O'|'o') ('R'|'r') ('E'|'e') ('I'|'i') ('G'|'g') ('N'|'n')
;

K_KEY
: 	('K'|'k') ('E'|'e') ('Y'|'y')
;

K_INSERT
:	('I'|'i') ('N'|'n') ('S'|'s') ('E'|'e') ('R'|'r') ('T'|'t')
;

K_INTO
:	('I'|'i') ('N'|'n') ('T'|'t') ('O'|'o')
;

K_VALUES
:	('V'|'v') ('A'|'a') ('L'|'l') ('U'|'u') ('E'|'e') ('S'|'s')
;

K_ORDER
:	('O'|'o') ('R'|'r') ('D'|'d') ('E'|'e') ('R'|'r')
;

K_SET
:	('S'|'s') ('E'|'e') ('T'|'t')
;

K_UPDATE
: 	('U'|'u') ('P'|'p') ('D'|'d') ('A'|'a')  ('T'|'t') ('E'|'e')
;

K_BY
:	('B'|'b') ('Y'|'y')
;

K_ASC
:	('A'|'a') ('S'|'s') ('C'|'c')
;

K_DESC
:	('D'|'d') ('E'|'e') ('S'|'s') ('C'|'c')
;

K_AND
:	('A'|'a') ('N'|'n') ('D'|'d')
;

K_OR
:	('O'|'o') ('R'|'r')
;

K_NOT
:	('N'|'n') ('O'|'o') ('T'|'t')
;

K_DELETE
:	('D'|'d') ('E'|'e') ('L'|'l') ('E'|'e') ('T'|'t') ('E'|'e')
;

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
UNUM: DIGIT ;
NUM: DIGIT(DIGIT)* ;
CHAR: '\''((LETTER|DIGIT|| '!' | '"' | '#' | '$' | '%' | '&' | '\'' | '(' | ')' | '*' | '+' 
| ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '[' | '\\' | ']' | '^' | '_' | '`'| '{' | '|' | '}' | '~' 
'\t'| '\n' | '\"' |  '\\n' | '\\t' ))* '\'';




todo
: 	database
| 	table
;

database
:	K_CREATE K_DATABASE ID													# createDB
|	K_DROP  K_DATABASE  ID													# dropDB
|	K_USE  K_DATABASE  ID													# useDB
|	K_SHOW  K_DATABASES ID													# showDB
|	K_ALTER  K_DATABASE  ID  K_RENAME  K_TO  ID								# alterDB
|	insert																	# insertion
|	delete																	# deleteTB
|	query																	# queryDB
;

table
:	K_CREATE  K_TABLE  ID ('(' (ID tipo (K_CONSTRAINT constraint)? )* ')')?
|	K_ALTER  K_TABLE  ID   (tableAction)*
|	K_ALTER  K_TABLE  ID  K_RENAME  K_TO  ID 
|	K_DROP  K_TABLE  ID
|	K_SHOW  K_TABLES
| 	K_SHOW  K_COLUMNS  K_FROM  ID 
;

tableAction
:	K_ADD  K_COLUMN  ID tipo (K_CONSTRAINT (constraint)* )? 
|	K_ADD  K_CONSTRAINT constraint
|	K_DROP  K_COLUMN  ID
|	K_DROP  K_CONSTRAINT  ID
;

tipo
:	K_INT
|	K_FLOAT
|	K_DATE
|	K_CHAR '('NUM')'
;

constraint
:	K_PRIMARY  K_KEY '(' (ID (',' ID )*)* ')'
|	K_FOREIGN  K_KEY '(' ID ')' K_REFERENCES ID '('ID')'
|	K_CHECK (exp)
;

exp
:	exp logicExpAnd exp2
|	exp2
;

exp2
:	exp2 logicExpOr exp3
|	exp3
;

exp3
:	exp3 relationalExpEq exp4
|	exp4
;

exp4
:	exp4 relationalExpGL exp4
|	unifactor
;

unifactor
:	K_NOT factor
| 	factor
;

factor
:	literal
|	'(' exp ')'
;

literal
:	formatValue
;

logicExp
:	logicExpAnd
|	logicExpOr
|	logicExpNot
;

logicExpNot
:	K_NOT
;

logicExpOr	
:	K_OR	
;

logicExpAnd
:	K_AND
;

relationalExpEq
: 	'='
|	'<>'
;

relationalExpGL
:	'<'
|	'<='
|	'>'
|	'>='
;

relationalExp
:	relationalExpGL
|	relationalExpEq
;

insert
:	K_INSERT  K_INTO  ID '(' (ID (',' ID )*)* ') ' K_VALUES '(' (formatValue (',' formatValue )*)* ')'
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
:	UNUM UNUM UNUM UNUM '-' UNUM UNUM '-' UNUM UNUM
;

character
:	CHAR
;

update
:	K_UPDATE  ID  K_SET  condicion (',' condicion)*  (K_WHERE condicion)?
;

condicion
:	(expresion relationalExp (formatValue | expresion)) (logicExp condicion)?
;

delete
:	K_DELETE   K_FROM  ID  K_WHERE condicion
;

query
:	K_SELECT ('*' | (ID (',' ID)*))  K_FROM  ID  K_WHERE  condicion K_ORDER  K_BY (expresion (K_ASC | K_DESC) (',' expresion (K_ASC | K_DESC))*)* 
;

expresion
:	ID ('.' ID)?
;