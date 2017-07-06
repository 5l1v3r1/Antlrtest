grammar ANBX;

@header {
    package parsersLexers;
}


ANBX_Identifier :
		('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
		;
		
ANBX_COMMENT: 
		'#' ~[\r\n]* -> channel(HIDDEN)
   		;
   		
WS:  
		(' '|'\t'|'\r'? '\n')+ -> channel(HIDDEN)
    	;
    	
ANBX_DELIMITER:
		';'
		|','
		|':'
		;
		
ANBX_KNOW_RESERVEDWORDS:
		'share'
		|'agree'	
		;

ANBX_KNOW:
		 ANBX_Identifier
		|ANBX_Identifier ( ANBX_DELIMITER ( ANBX_Identifier | ANBX_KNOW_FUNCTION )  )*
		|ANBX_KNOW_FUNCTION
		;

ANBX_KNOW_FUNCTION: 
		ANBX_Identifier '(' ( ANBX_Identifier ( ANBX_DELIMITER ANBX_Identifier )* | ANBX_KNOW_FUNCTION ( ANBX_DELIMITER ANBX_KNOW_FUNCTION )* | ANBX_KNOW ( ANBX_DELIMITER ANBX_KNOW )* ) ')'
		|'(' ( ANBX_Identifier ( ANBX_DELIMITER ANBX_Identifier )* | ANBX_KNOW_FUNCTION ( ANBX_DELIMITER ANBX_KNOW_FUNCTION )* | ANBX_KNOW ( ANBX_DELIMITER ANBX_KNOW )* ) ')'
		;
		
ANBX_KNOW_CONDITION:
		ANBX_Identifier '!' '=' ANBX_Identifier
		;
		
ANBX_CHANNEL:
		'->'
		|'*->*'
		|'*->'
		|'->*'
		;
		
ANBX_OPERATION:
		'^'
		|'@'
		;		

anbx_Protocol:
		anbx_ProtocolName anbx_Types anbx_Definitions* anbx_Knowlegde anbx_Actions anbx_Goals EOF
		;
		
anbx_ProtocolName: 
		'Protocol' ANBX_DELIMITER ANBX_Identifier+
		;
	
anbx_Types: 
		'Types' ANBX_DELIMITER anbx_Type ( ';' anbx_Type)*
		;

anbx_Type:
		ANBX_Identifier ANBX_KNOW
		|ANBX_Identifier ANBX_Identifier
		|ANBX_Identifier '[' ( ANBX_KNOW | ANBX_Identifier ) ANBX_CHANNEL ( ANBX_KNOW | ANBX_Identifier ) ']' ( ANBX_KNOW | ANBX_Identifier )
		;
		
anbx_Definitions:
		'Definitions' ANBX_DELIMITER anbx_Definition ( ';' anbx_Definition)*
		;
		
anbx_Definition:
		ANBX_Identifier ANBX_DELIMITER anbx_SubDefinition+
		;
		
anbx_SubDefinition:
		ANBX_Identifier
		|ANBX_KNOW
		|'[' ( ANBX_Identifier | ANBX_KNOW | anbx_SubDefinition ) ']'
		|'[' ANBX_Identifier ANBX_DELIMITER ANBX_Identifier ']'
		|'{' ( ( ANBX_Identifier | ANBX_KNOW | anbx_SubDefinition ) | (ANBX_DELIMITER ANBX_Identifier | ANBX_KNOW | anbx_SubDefinition )* ) '}' ( ANBX_KNOW | ANBX_Identifier )
		|'{' '|' ( ( ANBX_KNOW | anbx_SubDefinition ) | (ANBX_DELIMITER anbx_SubDefinition )* ) '|' '}' ( ANBX_KNOW | ANBX_Identifier )
		| anbx_SubDefinition (ANBX_DELIMITER anbx_SubDefinition)+
		;

anbx_Knowlegde: 
		'Knowledge' ANBX_DELIMITER anbx_Know ( ';'* anbx_Know )*
		;
		
anbx_Know:
		ANBX_Identifier ANBX_DELIMITER ANBX_KNOW
		| 'where' ANBX_KNOW_CONDITION (ANBX_DELIMITER ANBX_KNOW_CONDITION)*
		| ( ANBX_KNOW | ANBX_Identifier )  'share' ( ANBX_KNOW | ANBX_Identifier ) 
		| ( ANBX_KNOW | ANBX_Identifier )  'agree' ( ANBX_KNOW | ANBX_Identifier ) 
		;

anbx_Actions:
		'Actions' ANBX_DELIMITER anbx_Action+
		;
		
anbx_Action:
		ANBX_Identifier ANBX_CHANNEL ANBX_Identifier ANBX_DELIMITER anbx_SubAction+
		|ANBX_Identifier ANBX_CHANNEL ANBX_Identifier ANBX_DELIMITER  ANBX_OPERATION*  '(' (ANBX_KNOW | ANBX_Identifier | '-') '|' ( ANBX_KNOW | ANBX_Identifier | '-' ) '|' ( ANBX_KNOW | ANBX_Identifier | '-' ) ')'   ANBX_DELIMITER anbx_SubAction+
		;
		
anbx_SubAction:
		ANBX_Identifier
		|ANBX_KNOW
		|'[' ( ANBX_KNOW | anbx_SubAction ) ']'
		|'{' ( ( ANBX_KNOW | anbx_SubAction ) | (ANBX_DELIMITER anbx_SubAction )* ) '}' ( ANBX_KNOW | ANBX_Identifier )
		|'{' '|' ( ( ANBX_KNOW | anbx_SubAction ) | (ANBX_DELIMITER anbx_SubAction )* ) '|' '}' ( ANBX_KNOW | ANBX_Identifier )
		|anbx_SubAction '(' anbx_SubAction ')'
		| anbx_SubAction (ANBX_DELIMITER anbx_SubAction)+
		;

anbx_Goals: 
		'Goals' ANBX_DELIMITER anbx_Goal+
		;
		
anbx_Goal:
		(ANBX_KNOW | ANBX_Identifier) 'weakly' 'authenticates' (ANBX_KNOW | ANBX_Identifier) 'on' (ANBX_KNOW | ANBX_Identifier)
		|(ANBX_KNOW | ANBX_Identifier) 'authenticates' (ANBX_KNOW | ANBX_Identifier) 'on' (ANBX_KNOW | ANBX_Identifier)
		|(ANBX_KNOW | ANBX_Identifier) 'secret' 'between' (ANBX_KNOW | ANBX_Identifier)
		|(ANBX_KNOW | ANBX_Identifier) 'secret' 'of' (ANBX_KNOW | ANBX_Identifier)
		| ANBX_Identifier ANBX_CHANNEL ANBX_Identifier ANBX_DELIMITER ANBX_Identifier
		;