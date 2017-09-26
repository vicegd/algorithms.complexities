package algorithms.complexities.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import algorithms.complexities.services.ComplexitiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComplexitiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_LINEAR", "RULE_EXPONENTIAL", "RULE_LOGARITHMIC", "RULE_LINLOG", "RULE_LINLOGEXP", "RULE_POWER", "RULE_FACTORIAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'calculations'", "'with'", "'a'", "'complexity'", "'if'", "'time'", "'='", "'for'", "'size'", "'calculate'", "'in'", "'O'", "'('", "')'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'months'", "'years'"
    };
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


        public InternalComplexitiesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComplexitiesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComplexitiesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComplexities.g"; }



     	private ComplexitiesGrammarAccess grammarAccess;

        public InternalComplexitiesParser(TokenStream input, ComplexitiesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ComplexitiesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalComplexities.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalComplexities.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalComplexities.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalComplexities.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'calculations' ( (lv_calculations_1_0= ruleCalculation ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_calculations_1_0 = null;



        	enterRule();

        try {
            // InternalComplexities.g:78:2: ( (otherlv_0= 'calculations' ( (lv_calculations_1_0= ruleCalculation ) )+ ) )
            // InternalComplexities.g:79:2: (otherlv_0= 'calculations' ( (lv_calculations_1_0= ruleCalculation ) )+ )
            {
            // InternalComplexities.g:79:2: (otherlv_0= 'calculations' ( (lv_calculations_1_0= ruleCalculation ) )+ )
            // InternalComplexities.g:80:3: otherlv_0= 'calculations' ( (lv_calculations_1_0= ruleCalculation ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCalculationsKeyword_0());
            		
            // InternalComplexities.g:84:3: ( (lv_calculations_1_0= ruleCalculation ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComplexities.g:85:4: (lv_calculations_1_0= ruleCalculation )
            	    {
            	    // InternalComplexities.g:85:4: (lv_calculations_1_0= ruleCalculation )
            	    // InternalComplexities.g:86:5: lv_calculations_1_0= ruleCalculation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCalculationsCalculationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_calculations_1_0=ruleCalculation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"calculations",
            	    						lv_calculations_1_0,
            	    						"algorithms.complexities.Complexities.Calculation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCalculation"
    // InternalComplexities.g:107:1: entryRuleCalculation returns [EObject current=null] : iv_ruleCalculation= ruleCalculation EOF ;
    public final EObject entryRuleCalculation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculation = null;


        try {
            // InternalComplexities.g:107:52: (iv_ruleCalculation= ruleCalculation EOF )
            // InternalComplexities.g:108:2: iv_ruleCalculation= ruleCalculation EOF
            {
             newCompositeNode(grammarAccess.getCalculationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculation=ruleCalculation();

            state._fsp--;

             current =iv_ruleCalculation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculation"


    // $ANTLR start "ruleCalculation"
    // InternalComplexities.g:114:1: ruleCalculation returns [EObject current=null] : (this_ExecutionTimes_0= ruleExecutionTimes | this_Sizes_1= ruleSizes ) ;
    public final EObject ruleCalculation() throws RecognitionException {
        EObject current = null;

        EObject this_ExecutionTimes_0 = null;

        EObject this_Sizes_1 = null;



        	enterRule();

        try {
            // InternalComplexities.g:120:2: ( (this_ExecutionTimes_0= ruleExecutionTimes | this_Sizes_1= ruleSizes ) )
            // InternalComplexities.g:121:2: (this_ExecutionTimes_0= ruleExecutionTimes | this_Sizes_1= ruleSizes )
            {
            // InternalComplexities.g:121:2: (this_ExecutionTimes_0= ruleExecutionTimes | this_Sizes_1= ruleSizes )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalComplexities.g:122:3: this_ExecutionTimes_0= ruleExecutionTimes
                    {

                    			newCompositeNode(grammarAccess.getCalculationAccess().getExecutionTimesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecutionTimes_0=ruleExecutionTimes();

                    state._fsp--;


                    			current = this_ExecutionTimes_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComplexities.g:131:3: this_Sizes_1= ruleSizes
                    {

                    			newCompositeNode(grammarAccess.getCalculationAccess().getSizesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sizes_1=ruleSizes();

                    state._fsp--;


                    			current = this_Sizes_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculation"


    // $ANTLR start "entryRuleExecutionTimes"
    // InternalComplexities.g:143:1: entryRuleExecutionTimes returns [EObject current=null] : iv_ruleExecutionTimes= ruleExecutionTimes EOF ;
    public final EObject entryRuleExecutionTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionTimes = null;


        try {
            // InternalComplexities.g:143:55: (iv_ruleExecutionTimes= ruleExecutionTimes EOF )
            // InternalComplexities.g:144:2: iv_ruleExecutionTimes= ruleExecutionTimes EOF
            {
             newCompositeNode(grammarAccess.getExecutionTimesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutionTimes=ruleExecutionTimes();

            state._fsp--;

             current =iv_ruleExecutionTimes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecutionTimes"


    // $ANTLR start "ruleExecutionTimes"
    // InternalComplexities.g:150:1: ruleExecutionTimes returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'time' otherlv_6= '=' ( (lv_time1_7_0= RULE_INT ) ) ( (lv_time1Unit_8_0= ruleTimeUnits ) ) otherlv_9= 'for' otherlv_10= 'size' otherlv_11= '=' ( (lv_size1_12_0= RULE_INT ) ) otherlv_13= 'calculate' otherlv_14= 'time' otherlv_15= 'in' ( (lv_time2Unit_16_0= ruleTimeUnits ) ) otherlv_17= 'for' otherlv_18= 'size' otherlv_19= '=' ( (lv_size2_20_0= RULE_INT ) ) ) ;
    public final EObject ruleExecutionTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_time1_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_size1_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_size2_20_0=null;
        AntlrDatatypeRuleToken lv_complexity_3_0 = null;

        Enumerator lv_time1Unit_8_0 = null;

        Enumerator lv_time2Unit_16_0 = null;



        	enterRule();

        try {
            // InternalComplexities.g:156:2: ( (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'time' otherlv_6= '=' ( (lv_time1_7_0= RULE_INT ) ) ( (lv_time1Unit_8_0= ruleTimeUnits ) ) otherlv_9= 'for' otherlv_10= 'size' otherlv_11= '=' ( (lv_size1_12_0= RULE_INT ) ) otherlv_13= 'calculate' otherlv_14= 'time' otherlv_15= 'in' ( (lv_time2Unit_16_0= ruleTimeUnits ) ) otherlv_17= 'for' otherlv_18= 'size' otherlv_19= '=' ( (lv_size2_20_0= RULE_INT ) ) ) )
            // InternalComplexities.g:157:2: (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'time' otherlv_6= '=' ( (lv_time1_7_0= RULE_INT ) ) ( (lv_time1Unit_8_0= ruleTimeUnits ) ) otherlv_9= 'for' otherlv_10= 'size' otherlv_11= '=' ( (lv_size1_12_0= RULE_INT ) ) otherlv_13= 'calculate' otherlv_14= 'time' otherlv_15= 'in' ( (lv_time2Unit_16_0= ruleTimeUnits ) ) otherlv_17= 'for' otherlv_18= 'size' otherlv_19= '=' ( (lv_size2_20_0= RULE_INT ) ) )
            {
            // InternalComplexities.g:157:2: (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'time' otherlv_6= '=' ( (lv_time1_7_0= RULE_INT ) ) ( (lv_time1Unit_8_0= ruleTimeUnits ) ) otherlv_9= 'for' otherlv_10= 'size' otherlv_11= '=' ( (lv_size1_12_0= RULE_INT ) ) otherlv_13= 'calculate' otherlv_14= 'time' otherlv_15= 'in' ( (lv_time2Unit_16_0= ruleTimeUnits ) ) otherlv_17= 'for' otherlv_18= 'size' otherlv_19= '=' ( (lv_size2_20_0= RULE_INT ) ) )
            // InternalComplexities.g:158:3: otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'time' otherlv_6= '=' ( (lv_time1_7_0= RULE_INT ) ) ( (lv_time1Unit_8_0= ruleTimeUnits ) ) otherlv_9= 'for' otherlv_10= 'size' otherlv_11= '=' ( (lv_size1_12_0= RULE_INT ) ) otherlv_13= 'calculate' otherlv_14= 'time' otherlv_15= 'in' ( (lv_time2Unit_16_0= ruleTimeUnits ) ) otherlv_17= 'for' otherlv_18= 'size' otherlv_19= '=' ( (lv_size2_20_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExecutionTimesAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExecutionTimesAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExecutionTimesAccess().getComplexityKeyword_2());
            		
            // InternalComplexities.g:170:3: ( (lv_complexity_3_0= ruleComplexity ) )
            // InternalComplexities.g:171:4: (lv_complexity_3_0= ruleComplexity )
            {
            // InternalComplexities.g:171:4: (lv_complexity_3_0= ruleComplexity )
            // InternalComplexities.g:172:5: lv_complexity_3_0= ruleComplexity
            {

            					newCompositeNode(grammarAccess.getExecutionTimesAccess().getComplexityComplexityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_complexity_3_0=ruleComplexity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecutionTimesRule());
            					}
            					set(
            						current,
            						"complexity",
            						lv_complexity_3_0,
            						"algorithms.complexities.Complexities.Complexity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getExecutionTimesAccess().getIfKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getExecutionTimesAccess().getTimeKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getExecutionTimesAccess().getEqualsSignKeyword_6());
            		
            // InternalComplexities.g:201:3: ( (lv_time1_7_0= RULE_INT ) )
            // InternalComplexities.g:202:4: (lv_time1_7_0= RULE_INT )
            {
            // InternalComplexities.g:202:4: (lv_time1_7_0= RULE_INT )
            // InternalComplexities.g:203:5: lv_time1_7_0= RULE_INT
            {
            lv_time1_7_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_time1_7_0, grammarAccess.getExecutionTimesAccess().getTime1INTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionTimesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time1",
            						lv_time1_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalComplexities.g:219:3: ( (lv_time1Unit_8_0= ruleTimeUnits ) )
            // InternalComplexities.g:220:4: (lv_time1Unit_8_0= ruleTimeUnits )
            {
            // InternalComplexities.g:220:4: (lv_time1Unit_8_0= ruleTimeUnits )
            // InternalComplexities.g:221:5: lv_time1Unit_8_0= ruleTimeUnits
            {

            					newCompositeNode(grammarAccess.getExecutionTimesAccess().getTime1UnitTimeUnitsEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_time1Unit_8_0=ruleTimeUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecutionTimesRule());
            					}
            					set(
            						current,
            						"time1Unit",
            						lv_time1Unit_8_0,
            						"algorithms.complexities.Complexities.TimeUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getExecutionTimesAccess().getForKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getExecutionTimesAccess().getSizeKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getExecutionTimesAccess().getEqualsSignKeyword_11());
            		
            // InternalComplexities.g:250:3: ( (lv_size1_12_0= RULE_INT ) )
            // InternalComplexities.g:251:4: (lv_size1_12_0= RULE_INT )
            {
            // InternalComplexities.g:251:4: (lv_size1_12_0= RULE_INT )
            // InternalComplexities.g:252:5: lv_size1_12_0= RULE_INT
            {
            lv_size1_12_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_size1_12_0, grammarAccess.getExecutionTimesAccess().getSize1INTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionTimesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size1",
            						lv_size1_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getExecutionTimesAccess().getCalculateKeyword_13());
            		
            otherlv_14=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getExecutionTimesAccess().getTimeKeyword_14());
            		
            otherlv_15=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getExecutionTimesAccess().getInKeyword_15());
            		
            // InternalComplexities.g:280:3: ( (lv_time2Unit_16_0= ruleTimeUnits ) )
            // InternalComplexities.g:281:4: (lv_time2Unit_16_0= ruleTimeUnits )
            {
            // InternalComplexities.g:281:4: (lv_time2Unit_16_0= ruleTimeUnits )
            // InternalComplexities.g:282:5: lv_time2Unit_16_0= ruleTimeUnits
            {

            					newCompositeNode(grammarAccess.getExecutionTimesAccess().getTime2UnitTimeUnitsEnumRuleCall_16_0());
            				
            pushFollow(FOLLOW_13);
            lv_time2Unit_16_0=ruleTimeUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecutionTimesRule());
            					}
            					set(
            						current,
            						"time2Unit",
            						lv_time2Unit_16_0,
            						"algorithms.complexities.Complexities.TimeUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_17, grammarAccess.getExecutionTimesAccess().getForKeyword_17());
            		
            otherlv_18=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_18, grammarAccess.getExecutionTimesAccess().getSizeKeyword_18());
            		
            otherlv_19=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_19, grammarAccess.getExecutionTimesAccess().getEqualsSignKeyword_19());
            		
            // InternalComplexities.g:311:3: ( (lv_size2_20_0= RULE_INT ) )
            // InternalComplexities.g:312:4: (lv_size2_20_0= RULE_INT )
            {
            // InternalComplexities.g:312:4: (lv_size2_20_0= RULE_INT )
            // InternalComplexities.g:313:5: lv_size2_20_0= RULE_INT
            {
            lv_size2_20_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_size2_20_0, grammarAccess.getExecutionTimesAccess().getSize2INTTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionTimesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size2",
            						lv_size2_20_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecutionTimes"


    // $ANTLR start "entryRuleSizes"
    // InternalComplexities.g:333:1: entryRuleSizes returns [EObject current=null] : iv_ruleSizes= ruleSizes EOF ;
    public final EObject entryRuleSizes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizes = null;


        try {
            // InternalComplexities.g:333:46: (iv_ruleSizes= ruleSizes EOF )
            // InternalComplexities.g:334:2: iv_ruleSizes= ruleSizes EOF
            {
             newCompositeNode(grammarAccess.getSizesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSizes=ruleSizes();

            state._fsp--;

             current =iv_ruleSizes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSizes"


    // $ANTLR start "ruleSizes"
    // InternalComplexities.g:340:1: ruleSizes returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'size' otherlv_6= '=' ( (lv_size1_7_0= RULE_INT ) ) otherlv_8= 'for' otherlv_9= 'time' otherlv_10= '=' ( (lv_time1_11_0= RULE_INT ) ) ( (lv_time1Unit_12_0= ruleTimeUnits ) ) otherlv_13= 'calculate' otherlv_14= 'size' otherlv_15= 'with' otherlv_16= 'time' otherlv_17= '=' ( (lv_time2_18_0= RULE_INT ) ) ( (lv_time2Unit_19_0= ruleTimeUnits ) ) ) ;
    public final EObject ruleSizes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_size1_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_time1_11_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_time2_18_0=null;
        AntlrDatatypeRuleToken lv_complexity_3_0 = null;

        Enumerator lv_time1Unit_12_0 = null;

        Enumerator lv_time2Unit_19_0 = null;



        	enterRule();

        try {
            // InternalComplexities.g:346:2: ( (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'size' otherlv_6= '=' ( (lv_size1_7_0= RULE_INT ) ) otherlv_8= 'for' otherlv_9= 'time' otherlv_10= '=' ( (lv_time1_11_0= RULE_INT ) ) ( (lv_time1Unit_12_0= ruleTimeUnits ) ) otherlv_13= 'calculate' otherlv_14= 'size' otherlv_15= 'with' otherlv_16= 'time' otherlv_17= '=' ( (lv_time2_18_0= RULE_INT ) ) ( (lv_time2Unit_19_0= ruleTimeUnits ) ) ) )
            // InternalComplexities.g:347:2: (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'size' otherlv_6= '=' ( (lv_size1_7_0= RULE_INT ) ) otherlv_8= 'for' otherlv_9= 'time' otherlv_10= '=' ( (lv_time1_11_0= RULE_INT ) ) ( (lv_time1Unit_12_0= ruleTimeUnits ) ) otherlv_13= 'calculate' otherlv_14= 'size' otherlv_15= 'with' otherlv_16= 'time' otherlv_17= '=' ( (lv_time2_18_0= RULE_INT ) ) ( (lv_time2Unit_19_0= ruleTimeUnits ) ) )
            {
            // InternalComplexities.g:347:2: (otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'size' otherlv_6= '=' ( (lv_size1_7_0= RULE_INT ) ) otherlv_8= 'for' otherlv_9= 'time' otherlv_10= '=' ( (lv_time1_11_0= RULE_INT ) ) ( (lv_time1Unit_12_0= ruleTimeUnits ) ) otherlv_13= 'calculate' otherlv_14= 'size' otherlv_15= 'with' otherlv_16= 'time' otherlv_17= '=' ( (lv_time2_18_0= RULE_INT ) ) ( (lv_time2Unit_19_0= ruleTimeUnits ) ) )
            // InternalComplexities.g:348:3: otherlv_0= 'with' otherlv_1= 'a' otherlv_2= 'complexity' ( (lv_complexity_3_0= ruleComplexity ) ) otherlv_4= 'if' otherlv_5= 'size' otherlv_6= '=' ( (lv_size1_7_0= RULE_INT ) ) otherlv_8= 'for' otherlv_9= 'time' otherlv_10= '=' ( (lv_time1_11_0= RULE_INT ) ) ( (lv_time1Unit_12_0= ruleTimeUnits ) ) otherlv_13= 'calculate' otherlv_14= 'size' otherlv_15= 'with' otherlv_16= 'time' otherlv_17= '=' ( (lv_time2_18_0= RULE_INT ) ) ( (lv_time2Unit_19_0= ruleTimeUnits ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSizesAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSizesAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSizesAccess().getComplexityKeyword_2());
            		
            // InternalComplexities.g:360:3: ( (lv_complexity_3_0= ruleComplexity ) )
            // InternalComplexities.g:361:4: (lv_complexity_3_0= ruleComplexity )
            {
            // InternalComplexities.g:361:4: (lv_complexity_3_0= ruleComplexity )
            // InternalComplexities.g:362:5: lv_complexity_3_0= ruleComplexity
            {

            					newCompositeNode(grammarAccess.getSizesAccess().getComplexityComplexityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_complexity_3_0=ruleComplexity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizesRule());
            					}
            					set(
            						current,
            						"complexity",
            						lv_complexity_3_0,
            						"algorithms.complexities.Complexities.Complexity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getSizesAccess().getIfKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getSizesAccess().getSizeKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getSizesAccess().getEqualsSignKeyword_6());
            		
            // InternalComplexities.g:391:3: ( (lv_size1_7_0= RULE_INT ) )
            // InternalComplexities.g:392:4: (lv_size1_7_0= RULE_INT )
            {
            // InternalComplexities.g:392:4: (lv_size1_7_0= RULE_INT )
            // InternalComplexities.g:393:5: lv_size1_7_0= RULE_INT
            {
            lv_size1_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_size1_7_0, grammarAccess.getSizesAccess().getSize1INTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size1",
            						lv_size1_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSizesAccess().getForKeyword_8());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getSizesAccess().getTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getSizesAccess().getEqualsSignKeyword_10());
            		
            // InternalComplexities.g:421:3: ( (lv_time1_11_0= RULE_INT ) )
            // InternalComplexities.g:422:4: (lv_time1_11_0= RULE_INT )
            {
            // InternalComplexities.g:422:4: (lv_time1_11_0= RULE_INT )
            // InternalComplexities.g:423:5: lv_time1_11_0= RULE_INT
            {
            lv_time1_11_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_time1_11_0, grammarAccess.getSizesAccess().getTime1INTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time1",
            						lv_time1_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalComplexities.g:439:3: ( (lv_time1Unit_12_0= ruleTimeUnits ) )
            // InternalComplexities.g:440:4: (lv_time1Unit_12_0= ruleTimeUnits )
            {
            // InternalComplexities.g:440:4: (lv_time1Unit_12_0= ruleTimeUnits )
            // InternalComplexities.g:441:5: lv_time1Unit_12_0= ruleTimeUnits
            {

            					newCompositeNode(grammarAccess.getSizesAccess().getTime1UnitTimeUnitsEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_15);
            lv_time1Unit_12_0=ruleTimeUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizesRule());
            					}
            					set(
            						current,
            						"time1Unit",
            						lv_time1Unit_12_0,
            						"algorithms.complexities.Complexities.TimeUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getSizesAccess().getCalculateKeyword_13());
            		
            otherlv_14=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getSizesAccess().getSizeKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getSizesAccess().getWithKeyword_15());
            		
            otherlv_16=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getSizesAccess().getTimeKeyword_16());
            		
            otherlv_17=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getSizesAccess().getEqualsSignKeyword_17());
            		
            // InternalComplexities.g:478:3: ( (lv_time2_18_0= RULE_INT ) )
            // InternalComplexities.g:479:4: (lv_time2_18_0= RULE_INT )
            {
            // InternalComplexities.g:479:4: (lv_time2_18_0= RULE_INT )
            // InternalComplexities.g:480:5: lv_time2_18_0= RULE_INT
            {
            lv_time2_18_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_time2_18_0, grammarAccess.getSizesAccess().getTime2INTTerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time2",
            						lv_time2_18_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalComplexities.g:496:3: ( (lv_time2Unit_19_0= ruleTimeUnits ) )
            // InternalComplexities.g:497:4: (lv_time2Unit_19_0= ruleTimeUnits )
            {
            // InternalComplexities.g:497:4: (lv_time2Unit_19_0= ruleTimeUnits )
            // InternalComplexities.g:498:5: lv_time2Unit_19_0= ruleTimeUnits
            {

            					newCompositeNode(grammarAccess.getSizesAccess().getTime2UnitTimeUnitsEnumRuleCall_19_0());
            				
            pushFollow(FOLLOW_2);
            lv_time2Unit_19_0=ruleTimeUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizesRule());
            					}
            					set(
            						current,
            						"time2Unit",
            						lv_time2Unit_19_0,
            						"algorithms.complexities.Complexities.TimeUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSizes"


    // $ANTLR start "entryRuleComplexity"
    // InternalComplexities.g:519:1: entryRuleComplexity returns [String current=null] : iv_ruleComplexity= ruleComplexity EOF ;
    public final String entryRuleComplexity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexity = null;


        try {
            // InternalComplexities.g:519:50: (iv_ruleComplexity= ruleComplexity EOF )
            // InternalComplexities.g:520:2: iv_ruleComplexity= ruleComplexity EOF
            {
             newCompositeNode(grammarAccess.getComplexityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexity=ruleComplexity();

            state._fsp--;

             current =iv_ruleComplexity.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexity"


    // $ANTLR start "ruleComplexity"
    // InternalComplexities.g:526:1: ruleComplexity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'O' kw= '(' (this_INT_2= RULE_INT | this_LINEAR_3= RULE_LINEAR | this_EXPONENTIAL_4= RULE_EXPONENTIAL | this_LOGARITHMIC_5= RULE_LOGARITHMIC | this_LINLOG_6= RULE_LINLOG | this_LINLOGEXP_7= RULE_LINLOGEXP | this_POWER_8= RULE_POWER | this_FACTORIAL_9= RULE_FACTORIAL ) kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleComplexity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_LINEAR_3=null;
        Token this_EXPONENTIAL_4=null;
        Token this_LOGARITHMIC_5=null;
        Token this_LINLOG_6=null;
        Token this_LINLOGEXP_7=null;
        Token this_POWER_8=null;
        Token this_FACTORIAL_9=null;


        	enterRule();

        try {
            // InternalComplexities.g:532:2: ( (kw= 'O' kw= '(' (this_INT_2= RULE_INT | this_LINEAR_3= RULE_LINEAR | this_EXPONENTIAL_4= RULE_EXPONENTIAL | this_LOGARITHMIC_5= RULE_LOGARITHMIC | this_LINLOG_6= RULE_LINLOG | this_LINLOGEXP_7= RULE_LINLOGEXP | this_POWER_8= RULE_POWER | this_FACTORIAL_9= RULE_FACTORIAL ) kw= ')' ) )
            // InternalComplexities.g:533:2: (kw= 'O' kw= '(' (this_INT_2= RULE_INT | this_LINEAR_3= RULE_LINEAR | this_EXPONENTIAL_4= RULE_EXPONENTIAL | this_LOGARITHMIC_5= RULE_LOGARITHMIC | this_LINLOG_6= RULE_LINLOG | this_LINLOGEXP_7= RULE_LINLOGEXP | this_POWER_8= RULE_POWER | this_FACTORIAL_9= RULE_FACTORIAL ) kw= ')' )
            {
            // InternalComplexities.g:533:2: (kw= 'O' kw= '(' (this_INT_2= RULE_INT | this_LINEAR_3= RULE_LINEAR | this_EXPONENTIAL_4= RULE_EXPONENTIAL | this_LOGARITHMIC_5= RULE_LOGARITHMIC | this_LINLOG_6= RULE_LINLOG | this_LINLOGEXP_7= RULE_LINLOGEXP | this_POWER_8= RULE_POWER | this_FACTORIAL_9= RULE_FACTORIAL ) kw= ')' )
            // InternalComplexities.g:534:3: kw= 'O' kw= '(' (this_INT_2= RULE_INT | this_LINEAR_3= RULE_LINEAR | this_EXPONENTIAL_4= RULE_EXPONENTIAL | this_LOGARITHMIC_5= RULE_LOGARITHMIC | this_LINLOG_6= RULE_LINLOG | this_LINLOGEXP_7= RULE_LINLOGEXP | this_POWER_8= RULE_POWER | this_FACTORIAL_9= RULE_FACTORIAL ) kw= ')'
            {
            kw=(Token)match(input,29,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getComplexityAccess().getOKeyword_0());
            		
            kw=(Token)match(input,30,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getComplexityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComplexities.g:544:3: (this_INT_2= RULE_INT | this_LINEAR_3= RULE_LINEAR | this_EXPONENTIAL_4= RULE_EXPONENTIAL | this_LOGARITHMIC_5= RULE_LOGARITHMIC | this_LINLOG_6= RULE_LINLOG | this_LINLOGEXP_7= RULE_LINLOGEXP | this_POWER_8= RULE_POWER | this_FACTORIAL_9= RULE_FACTORIAL )
            int alt3=8;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_LINEAR:
                {
                alt3=2;
                }
                break;
            case RULE_EXPONENTIAL:
                {
                alt3=3;
                }
                break;
            case RULE_LOGARITHMIC:
                {
                alt3=4;
                }
                break;
            case RULE_LINLOG:
                {
                alt3=5;
                }
                break;
            case RULE_LINLOGEXP:
                {
                alt3=6;
                }
                break;
            case RULE_POWER:
                {
                alt3=7;
                }
                break;
            case RULE_FACTORIAL:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalComplexities.g:545:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_19); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getComplexityAccess().getINTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalComplexities.g:553:4: this_LINEAR_3= RULE_LINEAR
                    {
                    this_LINEAR_3=(Token)match(input,RULE_LINEAR,FOLLOW_19); 

                    				current.merge(this_LINEAR_3);
                    			

                    				newLeafNode(this_LINEAR_3, grammarAccess.getComplexityAccess().getLINEARTerminalRuleCall_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalComplexities.g:561:4: this_EXPONENTIAL_4= RULE_EXPONENTIAL
                    {
                    this_EXPONENTIAL_4=(Token)match(input,RULE_EXPONENTIAL,FOLLOW_19); 

                    				current.merge(this_EXPONENTIAL_4);
                    			

                    				newLeafNode(this_EXPONENTIAL_4, grammarAccess.getComplexityAccess().getEXPONENTIALTerminalRuleCall_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalComplexities.g:569:4: this_LOGARITHMIC_5= RULE_LOGARITHMIC
                    {
                    this_LOGARITHMIC_5=(Token)match(input,RULE_LOGARITHMIC,FOLLOW_19); 

                    				current.merge(this_LOGARITHMIC_5);
                    			

                    				newLeafNode(this_LOGARITHMIC_5, grammarAccess.getComplexityAccess().getLOGARITHMICTerminalRuleCall_2_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalComplexities.g:577:4: this_LINLOG_6= RULE_LINLOG
                    {
                    this_LINLOG_6=(Token)match(input,RULE_LINLOG,FOLLOW_19); 

                    				current.merge(this_LINLOG_6);
                    			

                    				newLeafNode(this_LINLOG_6, grammarAccess.getComplexityAccess().getLINLOGTerminalRuleCall_2_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalComplexities.g:585:4: this_LINLOGEXP_7= RULE_LINLOGEXP
                    {
                    this_LINLOGEXP_7=(Token)match(input,RULE_LINLOGEXP,FOLLOW_19); 

                    				current.merge(this_LINLOGEXP_7);
                    			

                    				newLeafNode(this_LINLOGEXP_7, grammarAccess.getComplexityAccess().getLINLOGEXPTerminalRuleCall_2_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalComplexities.g:593:4: this_POWER_8= RULE_POWER
                    {
                    this_POWER_8=(Token)match(input,RULE_POWER,FOLLOW_19); 

                    				current.merge(this_POWER_8);
                    			

                    				newLeafNode(this_POWER_8, grammarAccess.getComplexityAccess().getPOWERTerminalRuleCall_2_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalComplexities.g:601:4: this_FACTORIAL_9= RULE_FACTORIAL
                    {
                    this_FACTORIAL_9=(Token)match(input,RULE_FACTORIAL,FOLLOW_19); 

                    				current.merge(this_FACTORIAL_9);
                    			

                    				newLeafNode(this_FACTORIAL_9, grammarAccess.getComplexityAccess().getFACTORIALTerminalRuleCall_2_7());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getComplexityAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexity"


    // $ANTLR start "ruleTimeUnits"
    // InternalComplexities.g:618:1: ruleTimeUnits returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) ) ;
    public final Enumerator ruleTimeUnits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalComplexities.g:624:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) ) )
            // InternalComplexities.g:625:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) )
            {
            // InternalComplexities.g:625:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            case 38:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalComplexities.g:626:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalComplexities.g:626:3: (enumLiteral_0= 'seconds' )
                    // InternalComplexities.g:627:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getSecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitsAccess().getSecondsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComplexities.g:634:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalComplexities.g:634:3: (enumLiteral_1= 'minutes' )
                    // InternalComplexities.g:635:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getMinutesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitsAccess().getMinutesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComplexities.g:642:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalComplexities.g:642:3: (enumLiteral_2= 'hours' )
                    // InternalComplexities.g:643:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getHoursEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitsAccess().getHoursEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComplexities.g:650:3: (enumLiteral_3= 'days' )
                    {
                    // InternalComplexities.g:650:3: (enumLiteral_3= 'days' )
                    // InternalComplexities.g:651:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getDaysEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitsAccess().getDaysEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComplexities.g:658:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalComplexities.g:658:3: (enumLiteral_4= 'weeks' )
                    // InternalComplexities.g:659:4: enumLiteral_4= 'weeks'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getWeeksEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitsAccess().getWeeksEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComplexities.g:666:3: (enumLiteral_5= 'months' )
                    {
                    // InternalComplexities.g:666:3: (enumLiteral_5= 'months' )
                    // InternalComplexities.g:667:4: enumLiteral_5= 'months'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getMonthsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitsAccess().getMonthsEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComplexities.g:674:3: (enumLiteral_6= 'years' )
                    {
                    // InternalComplexities.g:674:3: (enumLiteral_6= 'years' )
                    // InternalComplexities.g:675:4: enumLiteral_6= 'years'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getYearsEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTimeUnitsAccess().getYearsEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnits"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\23\1\24\1\25\1\35\1\36\1\4\10\37\1\26\1\27\2\uffff";
    static final String dfa_3s = "\1\23\1\24\1\25\1\35\1\36\1\13\10\37\1\26\1\32\2\uffff";
    static final String dfa_4s = "\20\uffff\1\1\1\2";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\20\2\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "121:2: (this_ExecutionTimes_0= ruleExecutionTimes | this_Sizes_1= ruleSizes )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000FF0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});

}