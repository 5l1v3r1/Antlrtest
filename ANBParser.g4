parser grammar ANBParser;
options { tokenVocab=ANBLexer; }
anbDocument
	:  (protocolType) (types) (knowledge) (actions) (goals)
	;

protocolType
	:  ANB_PROTOCOLE_TAG WS 
	;	
	
types
	:  ANB_TYPES_TAG WS typeFuntions (WS typeFuntions)* 
	;
	
typeFuntions
	: (ANB_TYPE_FUNCTIONS (ANB_END_LINE|WS) )
	;

knowledge 
	: ANB_KNOWLEDGE_TAG WS know (WS know)*
	;

know
	: (ANB_KNOW WS ANB_VARIABLES (ANB_END_LINE|WS))
	;
	
actions 
	:  ANB_ACTIONS_TAG action //(WS action)*
	;
	
action
	:  ANB_ACTION_PREDOUBLEDOT ANB_DOUBLE_DOT WS ANB_ACTION_POSTDOUBLEDOT
	;
	
goals
	:  ANB_GOALS_TAG
	;
