grammar ANB;

ANB_Identifier :
		('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
		;
ANB_String:
		ANB_Identifier 
		;
ANB_COMMENT: 
		'#' ~[\r\n]* -> channel(HIDDEN)
   		;
WS:  
		(' '|'\t'|'\r'? '\n')+
    	;
		
ANB_Message:
		ANB_Identifier
		|ANB_String
		|'pk' '(' ANB_Identifier ')'
		|'sk' '(' ANB_Identifier ')'
		|'k' '(' ANB_Identifier ',' ANB_Identifier ')'
		|'<' ANB_Message ('.' ANB_Message)+ '>'
		|'(' ANB_Message ')'
		|'aenc' '{' ANB_Message '}' ANB_Message
		|'senc' '{' ANB_Message '}' ANB_Message
		|'hash' '(' ANB_Message ')'
		|'inv' '(' ANB_Identifier '(' ANB_Identifier ')' ')'
		|ANB_Identifier '(' (ANB_Message (',' ANB_Message)*) ')'
		;			
		
ANB_ListIdentifier:
		ANB_Identifier 
		|ANB_Identifier ',' ANB_ListIdentifier
		;
		
ANB_ListKnow:
		ANB_Identifier
		|ANB_Identifier '(' (ANB_ListKnow (',' ANB_ListKnow)*) ')' 
		;	
		
ANB_VARIABLES
	: ANB_Identifier (',' ( ANB_Identifier | ANB_KNOW_FUNCTION )  )*
	;

ANB_KNOW_FUNCTION
	: ANB_Identifier '(' ( ANB_Identifier | ANB_KNOW_FUNCTION ) ')'
	;
	
		
anb_Document:
		anb_Protocol WS anb_Types WS anb_Knowlegde WS anb_Actions WS anb_Goals
		;
		
anb_Protocol:
		'Protocol' ':' WS ANB_Identifier
		;
		
anb_Types:
		'Types' ':' WS anb_type
		;
anb_type: 
		ANB_Identifier WS ANB_ListIdentifier
		|ANB_Identifier WS ANB_ListIdentifier ';' WS anb_type
		;

		
anb_Knowlegde:
		'Knowledge' ':' WS anb_Know
		;
		
anb_Know:
		ANB_Identifier ':' WS ANB_VARIABLES 
		|ANB_Identifier ':' WS ANB_VARIABLES  ';' WS anb_Know
		;
		
anb_Actions:
		'Actions' ':' WS anb_Action
		;
		
anb_Action:
		ANB_Identifier '->' ANB_Identifier '(' ANB_Identifier ( ',' ANB_Identifier )* ':' ANB_Message ';'
		|ANB_Identifier '<-' ANB_Identifier '(' ANB_Identifier ( ',' ANB_Identifier )* ':' ANB_Message ';'
		;

anb_Goals:
		'Goals' ':' WS anb_goal
		;
		
anb_goal:
		ANB_Identifier 
		;