package algorithms.complexities.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComplexitiesLexer extends Lexer {
    public static final int RULE_LINLOGEXP=9;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_LINLOG=8;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_EXPONENTIAL=6;
    public static final int RULE_ID=12;
    public static final int RULE_WS=16;
    public static final int RULE_LINEAR=5;
    public static final int RULE_FACTORIAL=11;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_LOGARITHMIC=7;
    public static final int RULE_POWER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalComplexitiesLexer() {;} 
    public InternalComplexitiesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalComplexitiesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalComplexities.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:11:7: ( 'seconds' )
            // InternalComplexities.g:11:9: 'seconds'
            {
            match("seconds"); 


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
            // InternalComplexities.g:12:7: ( 'minutes' )
            // InternalComplexities.g:12:9: 'minutes'
            {
            match("minutes"); 


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
            // InternalComplexities.g:13:7: ( 'hours' )
            // InternalComplexities.g:13:9: 'hours'
            {
            match("hours"); 


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
            // InternalComplexities.g:14:7: ( 'days' )
            // InternalComplexities.g:14:9: 'days'
            {
            match("days"); 


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
            // InternalComplexities.g:15:7: ( 'weeks' )
            // InternalComplexities.g:15:9: 'weeks'
            {
            match("weeks"); 


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
            // InternalComplexities.g:16:7: ( 'months' )
            // InternalComplexities.g:16:9: 'months'
            {
            match("months"); 


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
            // InternalComplexities.g:17:7: ( 'years' )
            // InternalComplexities.g:17:9: 'years'
            {
            match("years"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:18:7: ( 'calculations' )
            // InternalComplexities.g:18:9: 'calculations'
            {
            match("calculations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:19:7: ( 'with' )
            // InternalComplexities.g:19:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:20:7: ( 'a' )
            // InternalComplexities.g:20:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:21:7: ( 'complexity' )
            // InternalComplexities.g:21:9: 'complexity'
            {
            match("complexity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:22:7: ( 'if' )
            // InternalComplexities.g:22:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:23:7: ( 'time' )
            // InternalComplexities.g:23:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:24:7: ( '=' )
            // InternalComplexities.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:25:7: ( 'for' )
            // InternalComplexities.g:25:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:26:7: ( 'size' )
            // InternalComplexities.g:26:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:27:7: ( 'calculate' )
            // InternalComplexities.g:27:9: 'calculate'
            {
            match("calculate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:28:7: ( 'in' )
            // InternalComplexities.g:28:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:29:7: ( 'O' )
            // InternalComplexities.g:29:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:30:7: ( '(' )
            // InternalComplexities.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:31:7: ( ')' )
            // InternalComplexities.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_LINEAR"
    public final void mRULE_LINEAR() throws RecognitionException {
        try {
            int _type = RULE_LINEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1793:13: ( 'n' )
            // InternalComplexities.g:1793:15: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINEAR"

    // $ANTLR start "RULE_EXPONENTIAL"
    public final void mRULE_EXPONENTIAL() throws RecognitionException {
        try {
            int _type = RULE_EXPONENTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1795:18: ( 'n^' ( '1' .. '9' )+ )
            // InternalComplexities.g:1795:20: 'n^' ( '1' .. '9' )+
            {
            match("n^"); 

            // InternalComplexities.g:1795:25: ( '1' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='1' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComplexities.g:1795:26: '1' .. '9'
            	    {
            	    matchRange('1','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENTIAL"

    // $ANTLR start "RULE_LOGARITHMIC"
    public final void mRULE_LOGARITHMIC() throws RecognitionException {
        try {
            int _type = RULE_LOGARITHMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1797:18: ( 'log' 'n' )
            // InternalComplexities.g:1797:20: 'log' 'n'
            {
            match("log"); 

            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGARITHMIC"

    // $ANTLR start "RULE_LINLOG"
    public final void mRULE_LINLOG() throws RecognitionException {
        try {
            int _type = RULE_LINLOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1799:13: ( 'n' 'log' 'n' )
            // InternalComplexities.g:1799:15: 'n' 'log' 'n'
            {
            match('n'); 
            match("log"); 

            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINLOG"

    // $ANTLR start "RULE_LINLOGEXP"
    public final void mRULE_LINLOGEXP() throws RecognitionException {
        try {
            int _type = RULE_LINLOGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1801:16: ( 'n^' ( '1' .. '9' )+ 'log^' ( '1' .. '9' )+ ( ' ' )+ 'n' )
            // InternalComplexities.g:1801:18: 'n^' ( '1' .. '9' )+ 'log^' ( '1' .. '9' )+ ( ' ' )+ 'n'
            {
            match("n^"); 

            // InternalComplexities.g:1801:23: ( '1' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComplexities.g:1801:24: '1' .. '9'
            	    {
            	    matchRange('1','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match("log^"); 

            // InternalComplexities.g:1801:42: ( '1' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComplexities.g:1801:43: '1' .. '9'
            	    {
            	    matchRange('1','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalComplexities.g:1801:54: ( ' ' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComplexities.g:1801:54: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINLOGEXP"

    // $ANTLR start "RULE_POWER"
    public final void mRULE_POWER() throws RecognitionException {
        try {
            int _type = RULE_POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1803:12: ( ( '1' .. '9' )+ '^' 'n' )
            // InternalComplexities.g:1803:14: ( '1' .. '9' )+ '^' 'n'
            {
            // InternalComplexities.g:1803:14: ( '1' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComplexities.g:1803:15: '1' .. '9'
            	    {
            	    matchRange('1','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('^'); 
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POWER"

    // $ANTLR start "RULE_FACTORIAL"
    public final void mRULE_FACTORIAL() throws RecognitionException {
        try {
            int _type = RULE_FACTORIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1805:16: ( 'n!' )
            // InternalComplexities.g:1805:18: 'n!'
            {
            match("n!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FACTORIAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1807:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalComplexities.g:1807:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalComplexities.g:1807:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComplexities.g:1807:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalComplexities.g:1807:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComplexities.g:
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1809:10: ( ( '0' .. '9' )+ )
            // InternalComplexities.g:1809:12: ( '0' .. '9' )+
            {
            // InternalComplexities.g:1809:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComplexities.g:1809:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1811:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalComplexities.g:1811:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalComplexities.g:1811:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComplexities.g:1811:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalComplexities.g:1811:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalComplexities.g:1811:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComplexities.g:1811:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalComplexities.g:1811:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalComplexities.g:1811:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComplexities.g:1811:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComplexities.g:1811:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1813:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalComplexities.g:1813:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalComplexities.g:1813:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComplexities.g:1813:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1815:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalComplexities.g:1815:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalComplexities.g:1815:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComplexities.g:1815:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalComplexities.g:1815:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComplexities.g:1815:41: ( '\\r' )? '\\n'
                    {
                    // InternalComplexities.g:1815:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalComplexities.g:1815:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1817:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalComplexities.g:1817:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalComplexities.g:1817:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComplexities.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComplexities.g:1819:16: ( . )
            // InternalComplexities.g:1819:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalComplexities.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_LINEAR | RULE_EXPONENTIAL | RULE_LOGARITHMIC | RULE_LINLOG | RULE_LINLOGEXP | RULE_POWER | RULE_FACTORIAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=35;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalComplexities.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalComplexities.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalComplexities.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalComplexities.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalComplexities.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalComplexities.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalComplexities.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalComplexities.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalComplexities.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalComplexities.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalComplexities.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalComplexities.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalComplexities.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalComplexities.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalComplexities.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalComplexities.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalComplexities.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalComplexities.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalComplexities.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalComplexities.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalComplexities.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalComplexities.g:1:136: RULE_LINEAR
                {
                mRULE_LINEAR(); 

                }
                break;
            case 23 :
                // InternalComplexities.g:1:148: RULE_EXPONENTIAL
                {
                mRULE_EXPONENTIAL(); 

                }
                break;
            case 24 :
                // InternalComplexities.g:1:165: RULE_LOGARITHMIC
                {
                mRULE_LOGARITHMIC(); 

                }
                break;
            case 25 :
                // InternalComplexities.g:1:182: RULE_LINLOG
                {
                mRULE_LINLOG(); 

                }
                break;
            case 26 :
                // InternalComplexities.g:1:194: RULE_LINLOGEXP
                {
                mRULE_LINLOGEXP(); 

                }
                break;
            case 27 :
                // InternalComplexities.g:1:209: RULE_POWER
                {
                mRULE_POWER(); 

                }
                break;
            case 28 :
                // InternalComplexities.g:1:220: RULE_FACTORIAL
                {
                mRULE_FACTORIAL(); 

                }
                break;
            case 29 :
                // InternalComplexities.g:1:235: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalComplexities.g:1:243: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalComplexities.g:1:252: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalComplexities.g:1:264: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalComplexities.g:1:280: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalComplexities.g:1:296: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalComplexities.g:1:304: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\7\35\1\47\2\35\1\uffff\1\35\1\55\2\uffff\1\63\1\35\1\67\1\32\2\uffff\3\32\2\uffff\2\35\1\uffff\11\35\1\uffff\1\107\1\110\1\35\1\uffff\1\35\4\uffff\1\35\2\uffff\1\35\1\uffff\1\67\5\uffff\13\35\2\uffff\1\35\1\132\1\133\3\35\1\140\3\35\1\144\1\35\1\146\3\35\1\152\3\uffff\1\35\1\154\1\35\1\uffff\2\35\1\160\1\uffff\1\161\1\uffff\1\162\2\35\1\uffff\1\165\1\uffff\2\35\1\170\3\uffff\2\35\1\uffff\1\173\1\174\1\uffff\2\35\2\uffff\3\35\1\u0083\2\35\1\uffff\1\u0086\1\35\1\uffff\1\u0088\1\uffff";
    static final String DFA17_eofS =
        "\u0089\uffff";
    static final String DFA17_minS =
        "\1\0\1\145\1\151\1\157\1\141\2\145\1\141\1\60\1\146\1\151\1\uffff\1\157\1\60\2\uffff\1\41\1\157\1\61\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\172\1\uffff\2\156\1\165\1\171\1\145\1\164\1\141\1\154\1\155\1\uffff\2\60\1\155\1\uffff\1\162\3\uffff\1\61\1\157\2\uffff\1\147\1\uffff\1\61\5\uffff\1\157\1\145\1\165\1\164\1\162\1\163\1\153\1\150\1\162\1\143\1\160\2\uffff\1\145\1\60\1\61\1\147\2\156\1\60\1\164\1\150\1\163\1\60\1\163\1\60\1\163\1\165\1\154\1\60\3\uffff\1\156\1\60\1\144\1\uffff\1\145\1\163\1\60\1\uffff\1\60\1\uffff\1\60\1\154\1\145\1\uffff\1\60\1\uffff\2\163\1\60\3\uffff\1\141\1\170\1\uffff\2\60\1\uffff\1\164\1\151\2\uffff\1\145\1\164\1\157\1\60\1\171\1\156\1\uffff\1\60\1\163\1\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\151\2\157\1\141\1\151\1\145\1\157\1\172\1\156\1\151\1\uffff\1\157\1\172\2\uffff\1\172\1\157\1\136\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\172\1\uffff\2\156\1\165\1\171\1\145\1\164\1\141\1\154\1\155\1\uffff\2\172\1\155\1\uffff\1\162\3\uffff\1\71\1\157\2\uffff\1\147\1\uffff\1\136\5\uffff\1\157\1\145\1\165\1\164\1\162\1\163\1\153\1\150\1\162\1\143\1\160\2\uffff\1\145\1\172\1\154\1\147\2\156\1\172\1\164\1\150\1\163\1\172\1\163\1\172\1\163\1\165\1\154\1\172\3\uffff\1\156\1\172\1\144\1\uffff\1\145\1\163\1\172\1\uffff\1\172\1\uffff\1\172\1\154\1\145\1\uffff\1\172\1\uffff\2\163\1\172\3\uffff\1\141\1\170\1\uffff\2\172\1\uffff\1\164\1\151\2\uffff\1\151\1\164\1\157\1\172\1\171\1\156\1\uffff\1\172\1\163\1\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\13\uffff\1\16\2\uffff\1\24\1\25\4\uffff\1\35\1\36\3\uffff\1\42\1\43\2\uffff\1\35\11\uffff\1\12\3\uffff\1\16\1\uffff\1\23\1\24\1\25\2\uffff\1\34\1\26\1\uffff\1\33\1\uffff\1\36\1\37\1\40\1\41\1\42\13\uffff\1\14\1\22\21\uffff\1\17\1\27\1\32\3\uffff\1\20\3\uffff\1\4\1\uffff\1\11\3\uffff\1\15\1\uffff\1\30\3\uffff\1\3\1\5\1\7\2\uffff\1\31\2\uffff\1\6\2\uffff\1\1\1\2\6\uffff\1\21\2\uffff\1\13\1\uffff\1\10";
    static final String DFA17_specialS =
        "\1\1\25\uffff\1\2\1\0\161\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\1\16\1\17\5\32\1\30\1\25\11\22\3\32\1\13\3\32\16\24\1\15\13\24\3\32\1\23\1\24\1\32\1\10\1\24\1\7\1\4\1\24\1\14\1\24\1\3\1\11\2\24\1\21\1\2\1\20\4\24\1\1\1\12\2\24\1\5\1\24\1\6\1\24\uff85\32",
            "\1\33\3\uffff\1\34",
            "\1\36\5\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42\3\uffff\1\43",
            "\1\44",
            "\1\45\15\uffff\1\46",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\50\7\uffff\1\51",
            "\1\52",
            "",
            "\1\54",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\62\16\uffff\12\35\7\uffff\32\35\3\uffff\1\60\1\35\1\uffff\13\35\1\61\16\35",
            "\1\64",
            "\11\66\44\uffff\1\65",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\70",
            "\0\70",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\111",
            "",
            "\1\112",
            "",
            "",
            "",
            "\11\113",
            "\1\114",
            "",
            "",
            "\1\115",
            "",
            "\11\66\44\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "\1\131",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\11\113\62\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\145",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\1\153",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\163",
            "\1\164",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\166",
            "\1\167",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\175",
            "\1\176",
            "",
            "",
            "\1\u0080\3\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0084",
            "\1\u0085",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0087",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_LINEAR | RULE_EXPONENTIAL | RULE_LOGARITHMIC | RULE_LINLOG | RULE_LINLOGEXP | RULE_POWER | RULE_FACTORIAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( ((LA17_23>='\u0000' && LA17_23<='\uFFFF')) ) {s = 56;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='s') ) {s = 1;}

                        else if ( (LA17_0=='m') ) {s = 2;}

                        else if ( (LA17_0=='h') ) {s = 3;}

                        else if ( (LA17_0=='d') ) {s = 4;}

                        else if ( (LA17_0=='w') ) {s = 5;}

                        else if ( (LA17_0=='y') ) {s = 6;}

                        else if ( (LA17_0=='c') ) {s = 7;}

                        else if ( (LA17_0=='a') ) {s = 8;}

                        else if ( (LA17_0=='i') ) {s = 9;}

                        else if ( (LA17_0=='t') ) {s = 10;}

                        else if ( (LA17_0=='=') ) {s = 11;}

                        else if ( (LA17_0=='f') ) {s = 12;}

                        else if ( (LA17_0=='O') ) {s = 13;}

                        else if ( (LA17_0=='(') ) {s = 14;}

                        else if ( (LA17_0==')') ) {s = 15;}

                        else if ( (LA17_0=='n') ) {s = 16;}

                        else if ( (LA17_0=='l') ) {s = 17;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 18;}

                        else if ( (LA17_0=='^') ) {s = 19;}

                        else if ( ((LA17_0>='A' && LA17_0<='N')||(LA17_0>='P' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='b'||LA17_0=='e'||LA17_0=='g'||(LA17_0>='j' && LA17_0<='k')||(LA17_0>='o' && LA17_0<='r')||(LA17_0>='u' && LA17_0<='v')||LA17_0=='x'||LA17_0=='z') ) {s = 20;}

                        else if ( (LA17_0=='0') ) {s = 21;}

                        else if ( (LA17_0=='\"') ) {s = 22;}

                        else if ( (LA17_0=='\'') ) {s = 23;}

                        else if ( (LA17_0=='/') ) {s = 24;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 25;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='*' && LA17_0<='.')||(LA17_0>=':' && LA17_0<='<')||(LA17_0>='>' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_22 = input.LA(1);

                        s = -1;
                        if ( ((LA17_22>='\u0000' && LA17_22<='\uFFFF')) ) {s = 56;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}