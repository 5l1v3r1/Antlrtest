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
		(' '|'\t'|'\r'? '\n')+ -> channel(HIDDEN)
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
		
ANB_VARIABLES: 
		ANB_Identifier (',' ( ANB_Identifier | ANB_KNOW_FUNCTION )  )*
		;

ANB_KNOW_FUNCTION
		: ANB_Identifier '(' ( ANB_Identifier | ANB_KNOW_FUNCTION ) ')'
		;
	
		
anb_Document:
		anb_Protocol anb_Types anb_Knowlegde anb_Actions anb_Goals
		;
		
anb_Protocol:
		'Protocol' ':' ANB_Identifier
		;
		
anb_Types:
		'Types' ':' anb_type
		;
anb_type: 
		ANB_Identifier ANB_ListIdentifier
		|ANB_Identifier ANB_ListIdentifier ';' anb_type
		;

		
anb_Knowlegde:
		'Knowledge' ':' anb_Know
		;
		
anb_Know:
		ANB_Identifier ':' ANB_VARIABLES 
		|ANB_Identifier ':' ANB_VARIABLES  ';' anb_Know
		;
		
anb_Actions:
		'Actions' ':' anb_Action
		;
		
anb_Action:
		ANB_Identifier '->' ANB_Identifier '(' ANB_Identifier ( ',' ANB_Identifier )* ':' ANB_Message ';'
		|ANB_Identifier '<-' ANB_Identifier '(' ANB_Identifier ( ',' ANB_Identifier )* ':' ANB_Message ';'
		;

anb_Goals:
		'Goals' ':' anb_goal
		;
		
anb_goal:
		ANB_Identifier 
		;