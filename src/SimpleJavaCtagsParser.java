// $ANTLR 3.3 Nov 30, 2010 12:45:30 SimpleJavaCtags.g 2011-09-25 18:57:38

import java.util.HashSet;
import java.io.PrintStream;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SimpleJavaCtagsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "ID", "SL_COMMENT", "ML_COMMENT", "WS", "'.'", "'/'", "'\\\\'", "'.java'", "'access:'", "'private'", "'public'", "'protected'", "'default'", "'inherits:'", "','", "'signature:'", "'('", "'final'", "'[]'", "')'"
    };
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int NEWLINE=4;
    public static final int ID=5;
    public static final int SL_COMMENT=6;
    public static final int ML_COMMENT=7;
    public static final int WS=8;

    // delegates
    // delegators


        public SimpleJavaCtagsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SimpleJavaCtagsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SimpleJavaCtagsParser.tokenNames; }
    public String getGrammarFileName() { return "SimpleJavaCtags.g"; }






    // $ANTLR start "program"
    // SimpleJavaCtags.g:12:1: program : ( statement NEWLINE )* ;
    public final void program() throws RecognitionException {
        try {
            // SimpleJavaCtags.g:13:1: ( ( statement NEWLINE )* )
            // SimpleJavaCtags.g:13:3: ( statement NEWLINE )*
            {
            // SimpleJavaCtags.g:13:3: ( statement NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SimpleJavaCtags.g:13:4: statement NEWLINE
            	    {
            	    pushFollow(FOLLOW_statement_in_program23);
            	    statement();

            	    state._fsp--;

            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_program25); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "statement"
    // SimpleJavaCtags.g:16:1: statement : itemname ( ( ID | '.' | '/' ) ( '\\\\' | '/' ) )* classname= ID '.java' ( 'access:' acessattr= ( 'private' | 'public' | 'protected' | 'default' ) | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* 'access:' ( 'private' | 'public' | 'protected' | 'default' ) ) ( 'signature:' '(' ( ( 'final' )? typename1= typename ( '[]' )* varname ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )* )? ')' )? ;
    public final void statement() throws RecognitionException {
        Token classname=null;
        Token acessattr=null;
        SimpleJavaCtagsParser.typename_return inhtype1 = null;

        SimpleJavaCtagsParser.typename_return inhtype2 = null;

        SimpleJavaCtagsParser.typename_return typename1 = null;

        SimpleJavaCtagsParser.typename_return typename2 = null;


        try {
            // SimpleJavaCtags.g:17:1: ( itemname ( ( ID | '.' | '/' ) ( '\\\\' | '/' ) )* classname= ID '.java' ( 'access:' acessattr= ( 'private' | 'public' | 'protected' | 'default' ) | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* 'access:' ( 'private' | 'public' | 'protected' | 'default' ) ) ( 'signature:' '(' ( ( 'final' )? typename1= typename ( '[]' )* varname ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )* )? ')' )? )
            // SimpleJavaCtags.g:17:3: itemname ( ( ID | '.' | '/' ) ( '\\\\' | '/' ) )* classname= ID '.java' ( 'access:' acessattr= ( 'private' | 'public' | 'protected' | 'default' ) | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* 'access:' ( 'private' | 'public' | 'protected' | 'default' ) ) ( 'signature:' '(' ( ( 'final' )? typename1= typename ( '[]' )* varname ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )* )? ')' )?
            {
            pushFollow(FOLLOW_itemname_in_statement37);
            itemname();

            state._fsp--;

            // SimpleJavaCtags.g:17:12: ( ( ID | '.' | '/' ) ( '\\\\' | '/' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( ((LA2_1>=10 && LA2_1<=11)) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>=9 && LA2_0<=10)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // SimpleJavaCtags.g:17:13: ( ID | '.' | '/' ) ( '\\\\' | '/' )
            	    {
            	    if ( input.LA(1)==ID||(input.LA(1)>=9 && input.LA(1)<=10) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    if ( (input.LA(1)>=10 && input.LA(1)<=11) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            classname=(Token)match(input,ID,FOLLOW_ID_in_statement64); 
            match(input,12,FOLLOW_12_in_statement66); 
            // SimpleJavaCtags.g:18:3: ( 'access:' acessattr= ( 'private' | 'public' | 'protected' | 'default' ) | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* 'access:' ( 'private' | 'public' | 'protected' | 'default' ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // SimpleJavaCtags.g:19:3: 'access:' acessattr= ( 'private' | 'public' | 'protected' | 'default' )
                    {
                    match(input,13,FOLLOW_13_in_statement75); 
                    acessattr=(Token)input.LT(1);
                    if ( (input.LA(1)>=14 && input.LA(1)<=17) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // SimpleJavaCtags.g:21:3: 'inherits:' inhtype1= typename ( ',' inhtype2= typename )*
                    {
                    match(input,18,FOLLOW_18_in_statement102); 
                    pushFollow(FOLLOW_typename_in_statement106);
                    inhtype1=typename();

                    state._fsp--;

                     GenDotJava.printInterface((inhtype1!=null?input.toString(inhtype1.start,inhtype1.stop):null), (classname!=null?classname.getText():null)); 
                    // SimpleJavaCtags.g:22:7: ( ',' inhtype2= typename )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // SimpleJavaCtags.g:22:8: ',' inhtype2= typename
                    	    {
                    	    match(input,19,FOLLOW_19_in_statement117); 
                    	    pushFollow(FOLLOW_typename_in_statement121);
                    	    inhtype2=typename();

                    	    state._fsp--;

                    	     GenDotJava.printInterface((inhtype2!=null?input.toString(inhtype2.start,inhtype2.stop):null), (classname!=null?classname.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // SimpleJavaCtags.g:24:3: 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* 'access:' ( 'private' | 'public' | 'protected' | 'default' )
                    {
                    match(input,18,FOLLOW_18_in_statement134); 
                    pushFollow(FOLLOW_typename_in_statement138);
                    inhtype1=typename();

                    state._fsp--;

                    // SimpleJavaCtags.g:24:33: ( ',' inhtype2= typename )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // SimpleJavaCtags.g:24:34: ',' inhtype2= typename
                    	    {
                    	    match(input,19,FOLLOW_19_in_statement141); 
                    	    pushFollow(FOLLOW_typename_in_statement145);
                    	    inhtype2=typename();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match(input,13,FOLLOW_13_in_statement152); 
                    if ( (input.LA(1)>=14 && input.LA(1)<=17) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SimpleJavaCtags.g:27:3: ( 'signature:' '(' ( ( 'final' )? typename1= typename ( '[]' )* varname ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )* )? ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // SimpleJavaCtags.g:27:4: 'signature:' '(' ( ( 'final' )? typename1= typename ( '[]' )* varname ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )* )? ')'
                    {
                    match(input,20,FOLLOW_20_in_statement178); 
                    match(input,21,FOLLOW_21_in_statement183); 
                    // SimpleJavaCtags.g:28:7: ( ( 'final' )? typename1= typename ( '[]' )* varname ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID||LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // SimpleJavaCtags.g:28:9: ( 'final' )? typename1= typename ( '[]' )* varname ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )*
                            {
                            // SimpleJavaCtags.g:28:9: ( 'final' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==22) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // SimpleJavaCtags.g:28:10: 'final'
                                    {
                                    match(input,22,FOLLOW_22_in_statement188); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_typename_in_statement194);
                            typename1=typename();

                            state._fsp--;

                             if(!new String("private").equals((acessattr!=null?acessattr.getText():null))) GenDotJava.printMethodClass((classname!=null?classname.getText():null), (typename1!=null?input.toString(typename1.start,typename1.stop):null)); 
                            // SimpleJavaCtags.g:29:7: ( '[]' )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==23) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // SimpleJavaCtags.g:29:8: '[]'
                            	    {
                            	    match(input,23,FOLLOW_23_in_statement206); 

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);

                            pushFollow(FOLLOW_varname_in_statement210);
                            varname();

                            state._fsp--;

                            // SimpleJavaCtags.g:30:3: ( ',' ( 'final' )? typename2= typename ( '[]' )* varname )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==19) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // SimpleJavaCtags.g:30:4: ',' ( 'final' )? typename2= typename ( '[]' )* varname
                            	    {
                            	    match(input,19,FOLLOW_19_in_statement216); 
                            	    // SimpleJavaCtags.g:30:8: ( 'final' )?
                            	    int alt8=2;
                            	    int LA8_0 = input.LA(1);

                            	    if ( (LA8_0==22) ) {
                            	        alt8=1;
                            	    }
                            	    switch (alt8) {
                            	        case 1 :
                            	            // SimpleJavaCtags.g:30:9: 'final'
                            	            {
                            	            match(input,22,FOLLOW_22_in_statement219); 

                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_typename_in_statement225);
                            	    typename2=typename();

                            	    state._fsp--;

                            	     if(!new String("private").equals((acessattr!=null?acessattr.getText():null))) GenDotJava.printMethodClass((classname!=null?classname.getText():null), (typename2!=null?input.toString(typename2.start,typename2.stop):null)); 
                            	    // SimpleJavaCtags.g:31:7: ( '[]' )*
                            	    loop9:
                            	    do {
                            	        int alt9=2;
                            	        int LA9_0 = input.LA(1);

                            	        if ( (LA9_0==23) ) {
                            	            alt9=1;
                            	        }


                            	        switch (alt9) {
                            	    	case 1 :
                            	    	    // SimpleJavaCtags.g:31:8: '[]'
                            	    	    {
                            	    	    match(input,23,FOLLOW_23_in_statement237); 

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop9;
                            	        }
                            	    } while (true);

                            	    pushFollow(FOLLOW_varname_in_statement241);
                            	    varname();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,24,FOLLOW_24_in_statement247); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"

    public static class typename_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "typename"
    // SimpleJavaCtags.g:35:1: typename : ID ( '.' ID )* ;
    public final SimpleJavaCtagsParser.typename_return typename() throws RecognitionException {
        SimpleJavaCtagsParser.typename_return retval = new SimpleJavaCtagsParser.typename_return();
        retval.start = input.LT(1);

        try {
            // SimpleJavaCtags.g:36:1: ( ID ( '.' ID )* )
            // SimpleJavaCtags.g:36:3: ID ( '.' ID )*
            {
            match(input,ID,FOLLOW_ID_in_typename261); 
            // SimpleJavaCtags.g:36:6: ( '.' ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==9) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // SimpleJavaCtags.g:36:7: '.' ID
            	    {
            	    match(input,9,FOLLOW_9_in_typename264); 
            	    match(input,ID,FOLLOW_ID_in_typename266); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typename"


    // $ANTLR start "itemname"
    // SimpleJavaCtags.g:39:1: itemname : ID ( '.' ID )* ;
    public final void itemname() throws RecognitionException {
        try {
            // SimpleJavaCtags.g:40:1: ( ID ( '.' ID )* )
            // SimpleJavaCtags.g:40:3: ID ( '.' ID )*
            {
            match(input,ID,FOLLOW_ID_in_itemname277); 
            // SimpleJavaCtags.g:40:6: ( '.' ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==9) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // SimpleJavaCtags.g:40:7: '.' ID
            	    {
            	    match(input,9,FOLLOW_9_in_itemname280); 
            	    match(input,ID,FOLLOW_ID_in_itemname282); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "itemname"


    // $ANTLR start "varname"
    // SimpleJavaCtags.g:43:1: varname : ID ( '[]' )* ;
    public final void varname() throws RecognitionException {
        try {
            // SimpleJavaCtags.g:44:1: ( ID ( '[]' )* )
            // SimpleJavaCtags.g:44:3: ID ( '[]' )*
            {
            match(input,ID,FOLLOW_ID_in_varname294); 
            // SimpleJavaCtags.g:44:6: ( '[]' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // SimpleJavaCtags.g:44:7: '[]'
            	    {
            	    match(input,23,FOLLOW_23_in_varname297); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varname"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\15\1\uffff\1\5\1\4\2\5\2\uffff\2\4\1\5\1\4";
    static final String DFA5_maxS =
        "\1\22\1\uffff\1\5\1\24\2\5\2\uffff\2\24\1\5\1\24";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\1\3\4\uffff";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\4\uffff\1\2",
            "",
            "\1\3",
            "\1\6\4\uffff\1\4\3\uffff\1\7\5\uffff\1\5\1\6",
            "\1\10",
            "\1\11",
            "",
            "",
            "\1\6\4\uffff\1\4\3\uffff\1\7\5\uffff\1\5\1\6",
            "\1\6\4\uffff\1\12\3\uffff\1\7\5\uffff\1\5\1\6",
            "\1\13",
            "\1\6\4\uffff\1\12\3\uffff\1\7\5\uffff\1\5\1\6"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "18:3: ( 'access:' acessattr= ( 'private' | 'public' | 'protected' | 'default' ) | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* | 'inherits:' inhtype1= typename ( ',' inhtype2= typename )* 'access:' ( 'private' | 'public' | 'protected' | 'default' ) )";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_program23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_program25 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_itemname_in_statement37 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_set_in_statement40 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_statement52 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_ID_in_statement64 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement66 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_statement75 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_statement79 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18_in_statement102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_typename_in_statement106 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_statement117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_typename_in_statement121 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_18_in_statement134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_typename_in_statement138 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_19_in_statement141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_typename_in_statement145 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_statement152 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_set_in_statement154 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_statement178 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement183 = new BitSet(new long[]{0x0000000001400020L});
    public static final BitSet FOLLOW_22_in_statement188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_typename_in_statement194 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_statement206 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_varname_in_statement210 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_statement216 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_22_in_statement219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_typename_in_statement225 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_statement237 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_varname_in_statement241 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_24_in_statement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typename261 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_typename264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_typename266 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ID_in_itemname277 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_itemname280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_itemname282 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ID_in_varname294 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_varname297 = new BitSet(new long[]{0x0000000000800002L});

}