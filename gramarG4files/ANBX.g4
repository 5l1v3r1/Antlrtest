grammar ANBX;

@header {
    package parsersLexers;
}


ANB_Identifier :
		('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
		;
		
ANB_COMMENT: 
		'#' ~[\r\n]* -> channel(HIDDEN)
   		;
   		
WS:  
		(' '|'\t'|'\r'? '\n')+ -> channel(HIDDEN)
    	;
    	
ANB_DELIMITER:
		';'
		|','
		|':'
		;

ANB_KNOW:
		 ANB_Identifier
		|ANB_Identifier ( ANB_DELIMITER ( ANB_Identifier | ANB_KNOW_FUNCTION )  )*
		|ANB_KNOW_FUNCTION
		;

ANB_KNOW_FUNCTION: 
		ANB_Identifier '(' ( ANB_Identifier ( ANB_DELIMITER ANB_Identifier )* | ANB_KNOW_FUNCTION ( ANB_DELIMITER ANB_KNOW_FUNCTION )* | ANB_KNOW ( ANB_DELIMITER ANB_KNOW )* ) ')'
		|'(' ( ANB_Identifier ( ANB_DELIMITER ANB_Identifier )* | ANB_KNOW_FUNCTION ( ANB_DELIMITER ANB_KNOW_FUNCTION )* | ANB_KNOW ( ANB_DELIMITER ANB_KNOW )* ) ')'
		;
		
ANB_KNOW_CONDITION:
		ANB_Identifier '!' '=' ANB_Identifier
		;
		
ANB_CHANNEL:
		'->'
		|'*->*'
		|'*->'
		|'->*'
		;
		
ANB_OPERATION:
		'^'
		|'@'
		;		

anb_Protocol:
		anb_ProtocolName anb_Types anb_Definitions* anb_Knowlegde anb_Actions anb_Goals EOF
		;
		
anb_ProtocolName: 
		'Protocol' ':' ANB_Identifier+
		;
	
anb_Types: 
		'Types' ':' anb_Type ( ';' anb_Type)*
		;

anb_Type:
		ANB_Identifier ANB_KNOW
		|ANB_Identifier ANB_Identifier
		|ANB_Identifier '[' ( ANB_KNOW | ANB_Identifier ) ANB_CHANNEL ( ANB_KNOW | ANB_Identifier ) ']' ( ANB_KNOW | ANB_Identifier )
		;
		
anb_Definitions:
		'Definitions' ':' anb_Definition ( ';' anb_Definition)*
		;
		
anb_Definition:
		ANB_Identifier ':' anb_SubDefinition+
		;
		
anb_SubDefinition:
		ANB_Identifier
		|ANB_KNOW
		|'[' ( ANB_Identifier | ANB_KNOW | anb_SubDefinition ) ']'
		|'[' ANB_Identifier ':' ANB_Identifier ']'
		|'{' ( ( ANB_Identifier | ANB_KNOW | anb_SubDefinition ) | (ANB_DELIMITER ANB_Identifier | ANB_KNOW | anb_SubDefinition )* ) '}' ( ANB_KNOW | ANB_Identifier )
		|'{' '|' ( ( ANB_KNOW | anb_SubDefinition ) | (ANB_DELIMITER anb_SubDefinition )* ) '|' '}' ( ANB_KNOW | ANB_Identifier )
		| anb_SubDefinition (ANB_DELIMITER anb_SubDefinition)+
		;

anb_Knowlegde: 
		'Knowledge' ':' anb_know ( ';'* anb_know )*
		;
		
anb_know:
		ANB_Identifier ':' ANB_KNOW
		| 'where' ANB_KNOW_CONDITION (ANB_DELIMITER ANB_KNOW_CONDITION)*
		| ( ANB_KNOW | ANB_Identifier )  'share' ( ANB_KNOW | ANB_Identifier ) 
		| ( ANB_KNOW | ANB_Identifier )  'agree' ( ANB_KNOW | ANB_Identifier ) 
		;

anb_Actions:
		'Actions' ':' anb_Action+
		;
		
anb_Action:
		ANB_Identifier ANB_CHANNEL ANB_Identifier ':' anb_SubAction+
		|ANB_Identifier ANB_CHANNEL ANB_Identifier ANB_DELIMITER  ANB_OPERATION*  '(' (ANB_KNOW | ANB_Identifier | '-') '|' ( ANB_KNOW | ANB_Identifier | '-' ) '|' ( ANB_KNOW | ANB_Identifier | '-' ) ')'   ':' anb_SubAction+
		;
		
anb_SubAction:
		ANB_Identifier
		|ANB_KNOW
		|'[' ( ANB_KNOW | anb_SubAction ) ']'
		|'{' ( ( ANB_KNOW | anb_SubAction ) | (ANB_DELIMITER anb_SubAction )* ) '}' ( ANB_KNOW | ANB_Identifier )
		|'{' '|' ( ( ANB_KNOW | anb_SubAction ) | (ANB_DELIMITER anb_SubAction )* ) '|' '}' ( ANB_KNOW | ANB_Identifier )
		|anb_SubAction '(' anb_SubAction ')'
		| anb_SubAction (ANB_DELIMITER anb_SubAction)+
		;

anb_Goals: 
		'Goals' ':' anb_Goal+
		;
		
anb_Goal:
		(ANB_KNOW | ANB_Identifier) 'weakly' 'authenticates' (ANB_KNOW | ANB_Identifier) 'on' (ANB_KNOW | ANB_Identifier)
		|(ANB_KNOW | ANB_Identifier) 'authenticates' (ANB_KNOW | ANB_Identifier) 'on' (ANB_KNOW | ANB_Identifier)
		|(ANB_KNOW | ANB_Identifier) 'secret' 'between' (ANB_KNOW | ANB_Identifier)
		|(ANB_KNOW | ANB_Identifier) 'secret' 'of' (ANB_KNOW | ANB_Identifier)
		| ANB_Identifier ANB_CHANNEL ANB_Identifier ':' ANB_Identifier
		;