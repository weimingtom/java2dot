grammar SimpleJavaCtags;

@header {
import java.util.HashSet;
import java.io.PrintStream;
}

@members {

}

program
: (statement NEWLINE)*
;

statement 
: itemname ((ID | '.' | '/') ('\\' | '/'))* classname=ID '.java' 
  (
  'access:' acessattr=( 'private' | 'public' | 'protected' | 'default')
  |
  'inherits:' inhtype1=typename { GenDotJava.printInterface($inhtype1.text, $classname.text); }
      (',' inhtype2=typename { GenDotJava.printInterface($inhtype2.text, $classname.text); } )*
  |
  'inherits:' inhtype1=typename (',' inhtype2=typename)* 
  'access:' ( 'private' | 'public' | 'protected' | 'default')
  )
  ('signature:' 
  '(' ( ('final')? typename1=typename { if(!new String("private").equals($acessattr.text)) GenDotJava.printMethodClass($classname.text, $typename1.text); } 
      ('[]')* varname 
  (',' ('final')? typename2=typename { if(!new String("private").equals($acessattr.text)) GenDotJava.printMethodClass($classname.text, $typename2.text); } 
      ('[]')* varname)*)? ')'
  )?
;

typename
: ID ('.' ID)*
;

itemname
: ID ('.' ID)*
;

varname	
: ID ('[]')*
;

ID : ('a'..'z'|'A'..'Z'|'_'|'$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

SL_COMMENT : '!' (~('\r' | '\n'))* '\r'? '\n' {$channel = HIDDEN;} ;

ML_COMMENT : '/' '^' .* '$' '/' ';' '"' {$channel = HIDDEN;} ;

WS: (' ' | '\t' | '\r' | '\n') {$channel = HIDDEN;} ;

NEWLINE	: ('\r')? '\n';
