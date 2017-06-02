lexer grammar ANBLexer;

ANB_COMMENT
    : '#' ~[\r\n]* -> channel(HIDDEN)
    ;

ANB_PROTOCOLE_TAG
	: 'Protocol: ' Identifier
	;
	
ANB_PROTOCOLTYPE
	: Identifier
	;
	
ANB_TYPES_TAG
	: 'Types:'
	;
	
ANB_TYPE_FUNCTIONS
	: Trick WS Identifier (',' Identifier)*
	;

ANB_KNOWLEDGE_TAG
	: 'Knowledge:'
	;
	
ANB_KNOW
	: Trick ':' 
	;

ANB_VARIABLES
	: Trick (',' ( Identifier | ANB_KNOW_FUNCTION )  )*
	;

ANB_KNOW_FUNCTION
	: Trick '(' ( Identifier | ANB_KNOW_FUNCTION ) ')'
	;
	
ANB_ACTIONS_TAG
	: 'Actions:' WS
	;
	
//ANB_ACTION
//	: ANB_ACTION_PREDOUBLEDOT ':' WS ANB_ACTION_POSTDOUBLEDOT 
//	;
	
ANB_ACTION_PREDOUBLEDOT
	: Identifier WS '->' WS Identifier 
	| Identifier WS '->' WS Identifier ',' ( '(' (Identifier|'-')  '|' (Identifier|'-') '|' (Identifier|'-') ')' ) 
	;
	
ANB_ACTION_POSTDOUBLEDOT
	: ANB_VARIABLES
	| ANB_KNOW_FUNCTION
	| '{' ( ANB_VARIABLES | ANB_ACTION_POSTDOUBLEDOT | ANB_KNOW_FUNCTION ) '}' 
	;
	
ANB_GOALS_TAG
	: 'Goals:'
	;
	
Identifier
	:  ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
	;
	
Trick: Identifier;
	
ANB_END_LINE
	: ';'
	;
	
ANB_DOUBLE_DOT
	: ':'
	;
	
ANB_SPECIAL_CHARACTER
	: '#'
	;
	
WS
    :  (' '|'\t'|'\r'? '\n')+
    ;
