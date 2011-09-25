// $ANTLR 3.3 Nov 30, 2010 12:45:30 SimpleJavaCtags.g 2011-09-25 18:57:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SimpleJavaCtagsLexer extends Lexer {
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

    public SimpleJavaCtagsLexer() {;} 
    public SimpleJavaCtagsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleJavaCtagsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "SimpleJavaCtags.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:3:6: ( '.' )
            // SimpleJavaCtags.g:3:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:4:7: ( '/' )
            // SimpleJavaCtags.g:4:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:5:7: ( '\\\\' )
            // SimpleJavaCtags.g:5:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:6:7: ( '.java' )
            // SimpleJavaCtags.g:6:9: '.java'
            {
            match(".java"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:7:7: ( 'access:' )
            // SimpleJavaCtags.g:7:9: 'access:'
            {
            match("access:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:8:7: ( 'private' )
            // SimpleJavaCtags.g:8:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:9:7: ( 'public' )
            // SimpleJavaCtags.g:9:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:10:7: ( 'protected' )
            // SimpleJavaCtags.g:10:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:11:7: ( 'default' )
            // SimpleJavaCtags.g:11:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:12:7: ( 'inherits:' )
            // SimpleJavaCtags.g:12:9: 'inherits:'
            {
            match("inherits:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:13:7: ( ',' )
            // SimpleJavaCtags.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:14:7: ( 'signature:' )
            // SimpleJavaCtags.g:14:9: 'signature:'
            {
            match("signature:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:15:7: ( '(' )
            // SimpleJavaCtags.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:16:7: ( 'final' )
            // SimpleJavaCtags.g:16:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:17:7: ( '[]' )
            // SimpleJavaCtags.g:17:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:18:7: ( ')' )
            // SimpleJavaCtags.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:47:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // SimpleJavaCtags.g:47:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // SimpleJavaCtags.g:47:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SimpleJavaCtags.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:49:12: ( '!' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
            // SimpleJavaCtags.g:49:14: '!' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
            {
            match('!'); 
            // SimpleJavaCtags.g:49:18: (~ ( '\\r' | '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // SimpleJavaCtags.g:49:19: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // SimpleJavaCtags.g:49:36: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // SimpleJavaCtags.g:49:36: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:51:12: ( '/' '^' ( . )* '$' '/' ';' '\"' )
            // SimpleJavaCtags.g:51:14: '/' '^' ( . )* '$' '/' ';' '\"'
            {
            match('/'); 
            match('^'); 
            // SimpleJavaCtags.g:51:22: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        int LA4_3 = input.LA(3);

                        if ( (LA4_3==';') ) {
                            int LA4_4 = input.LA(4);

                            if ( (LA4_4=='\"') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_4>='\u0000' && LA4_4<='!')||(LA4_4>='#' && LA4_4<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_3>='\u0000' && LA4_3<=':')||(LA4_3>='<' && LA4_3<='\uFFFF')) ) {
                            alt4=1;
                        }


                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='#')||(LA4_0>='%' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // SimpleJavaCtags.g:51:22: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('$'); 
            match('/'); 
            match(';'); 
            match('\"'); 
            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:53:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // SimpleJavaCtags.g:53:5: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleJavaCtags.g:55:9: ( ( '\\r' )? '\\n' )
            // SimpleJavaCtags.g:55:11: ( '\\r' )? '\\n'
            {
            // SimpleJavaCtags.g:55:11: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // SimpleJavaCtags.g:55:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // SimpleJavaCtags.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | SL_COMMENT | ML_COMMENT | WS | NEWLINE )
        int alt6=21;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // SimpleJavaCtags.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // SimpleJavaCtags.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // SimpleJavaCtags.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // SimpleJavaCtags.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // SimpleJavaCtags.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // SimpleJavaCtags.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // SimpleJavaCtags.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // SimpleJavaCtags.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // SimpleJavaCtags.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // SimpleJavaCtags.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // SimpleJavaCtags.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // SimpleJavaCtags.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // SimpleJavaCtags.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // SimpleJavaCtags.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // SimpleJavaCtags.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // SimpleJavaCtags.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // SimpleJavaCtags.g:1:105: ID
                {
                mID(); 

                }
                break;
            case 18 :
                // SimpleJavaCtags.g:1:108: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 19 :
                // SimpleJavaCtags.g:1:119: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 20 :
                // SimpleJavaCtags.g:1:130: WS
                {
                mWS(); 

                }
                break;
            case 21 :
                // SimpleJavaCtags.g:1:133: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\24\1\26\1\uffff\4\16\1\uffff\1\16\1\uffff\1\16\4\uffff"+
        "\1\22\6\uffff\7\16\1\uffff\27\16\1\76\3\16\1\102\3\16\2\uffff\1"+
        "\106\1\16\1\uffff\1\110\2\16\1\uffff\1\16\1\uffff\2\16\1\116\1\uffff"+
        "\1\16\2\uffff";
    static final String DFA6_eofS =
        "\120\uffff";
    static final String DFA6_minS =
        "\1\11\1\152\1\136\1\uffff\1\143\1\162\1\145\1\156\1\uffff\1\151"+
        "\1\uffff\1\151\4\uffff\1\12\6\uffff\1\143\1\151\1\142\1\146\1\150"+
        "\1\147\1\156\1\uffff\1\145\1\166\1\164\1\154\1\141\1\145\1\156\1"+
        "\141\1\163\1\141\1\145\1\151\1\165\1\162\1\141\1\154\1\163\1\164"+
        "\2\143\1\154\1\151\1\164\1\60\1\72\1\145\1\164\1\60\2\164\1\165"+
        "\2\uffff\1\60\1\145\1\uffff\1\60\1\163\1\162\1\uffff\1\144\1\uffff"+
        "\1\72\1\145\1\60\1\uffff\1\72\2\uffff";
    static final String DFA6_maxS =
        "\1\172\1\152\1\136\1\uffff\1\143\1\165\1\145\1\156\1\uffff\1\151"+
        "\1\uffff\1\151\4\uffff\1\12\6\uffff\1\143\1\157\1\142\1\146\1\150"+
        "\1\147\1\156\1\uffff\1\145\1\166\1\164\1\154\1\141\1\145\1\156\1"+
        "\141\1\163\1\141\1\145\1\151\1\165\1\162\1\141\1\154\1\163\1\164"+
        "\2\143\1\154\1\151\1\164\1\172\1\72\1\145\1\164\1\172\2\164\1\165"+
        "\2\uffff\1\172\1\145\1\uffff\1\172\1\163\1\162\1\uffff\1\144\1\uffff"+
        "\1\72\1\145\1\172\1\uffff\1\72\2\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\4\uffff\1\13\1\uffff\1\15\1\uffff\1\17\1\20\1\21\1"+
        "\22\1\uffff\2\24\1\4\1\1\1\23\1\2\7\uffff\1\25\37\uffff\1\16\1\5"+
        "\2\uffff\1\7\3\uffff\1\6\1\uffff\1\11\3\uffff\1\12\1\uffff\1\10"+
        "\1\14";
    static final String DFA6_specialS =
        "\120\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\22\1\21\2\uffff\1\20\22\uffff\1\22\1\17\2\uffff\1\16\3\uffff"+
            "\1\12\1\15\2\uffff\1\10\1\uffff\1\1\1\2\21\uffff\32\16\1\14"+
            "\1\3\2\uffff\1\16\1\uffff\1\4\2\16\1\6\1\16\1\13\2\16\1\7\6"+
            "\16\1\5\2\16\1\11\7\16",
            "\1\23",
            "\1\25",
            "",
            "\1\27",
            "\1\30\2\uffff\1\31",
            "\1\32",
            "\1\33",
            "",
            "\1\34",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\40\5\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\107",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\117",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | SL_COMMENT | ML_COMMENT | WS | NEWLINE );";
        }
    }
 

}