package uibk.ac.at.smartcity.parser.antlr.internal;

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
import uibk.ac.at.smartcity.services.SmartCityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartCityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'layer'", "'priority'", "'delay'", "'node'", "'{'", "'postFrequency'", "'}'", "'sensor'", "'type'", "'link'", "'from'", "'->'", "'datatype'", "'controller'", "'module'", "'['", "'..'", "']'", "'cyclicAction'", "'frequency'", "'TEMPERATURE'", "'PH'", "'TURBIDITY'", "'TDS'", "'CURRENT'", "'PULSE'", "'ULTRASONIC'", "'CAMERA'", "'GSM'", "'ESP32'", "'RASPBERRY_PI'", "'OTHER'", "'UART'", "'ADC'", "'SPI'", "'GPIO'", "'CSI'", "'HTTPS'", "'HERTZ'", "'SECONDS'", "'MINUTES'", "'HOURS'", "'DAYS'", "'INF'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSmartCityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartCityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartCityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartCity.g"; }



     	private SmartCityGrammarAccess grammarAccess;

        public InternalSmartCityParser(TokenStream input, SmartCityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SmartCityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSmartCity.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSmartCity.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSmartCity.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalSmartCity.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_interoperableLayer_1_0= ruleInteroperableLayer ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_interoperableLayer_1_0 = null;

        EObject lv_globalLinks_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:78:2: ( ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_interoperableLayer_1_0= ruleInteroperableLayer ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ) )
            // InternalSmartCity.g:79:2: ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_interoperableLayer_1_0= ruleInteroperableLayer ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* )
            {
            // InternalSmartCity.g:79:2: ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_interoperableLayer_1_0= ruleInteroperableLayer ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* )
            // InternalSmartCity.g:80:3: ( (lv_nodes_0_0= ruleNode ) )* ( (lv_interoperableLayer_1_0= ruleInteroperableLayer ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )*
            {
            // InternalSmartCity.g:80:3: ( (lv_nodes_0_0= ruleNode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmartCity.g:81:4: (lv_nodes_0_0= ruleNode )
            	    {
            	    // InternalSmartCity.g:81:4: (lv_nodes_0_0= ruleNode )
            	    // InternalSmartCity.g:82:5: lv_nodes_0_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_nodes_0_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_0_0,
            	    						"uibk.ac.at.smartcity.SmartCity.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSmartCity.g:99:3: ( (lv_interoperableLayer_1_0= ruleInteroperableLayer ) )
            // InternalSmartCity.g:100:4: (lv_interoperableLayer_1_0= ruleInteroperableLayer )
            {
            // InternalSmartCity.g:100:4: (lv_interoperableLayer_1_0= ruleInteroperableLayer )
            // InternalSmartCity.g:101:5: lv_interoperableLayer_1_0= ruleInteroperableLayer
            {

            					newCompositeNode(grammarAccess.getModelAccess().getInteroperableLayerInteroperableLayerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_interoperableLayer_1_0=ruleInteroperableLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"interoperableLayer",
            						lv_interoperableLayer_1_0,
            						"uibk.ac.at.smartcity.SmartCity.InteroperableLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCity.g:118:3: ( (lv_globalLinks_2_0= ruleCommunicationLink ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmartCity.g:119:4: (lv_globalLinks_2_0= ruleCommunicationLink )
            	    {
            	    // InternalSmartCity.g:119:4: (lv_globalLinks_2_0= ruleCommunicationLink )
            	    // InternalSmartCity.g:120:5: lv_globalLinks_2_0= ruleCommunicationLink
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getGlobalLinksCommunicationLinkParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_globalLinks_2_0=ruleCommunicationLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"globalLinks",
            	    						lv_globalLinks_2_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CommunicationLink");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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


    // $ANTLR start "entryRuleInteroperableLayer"
    // InternalSmartCity.g:141:1: entryRuleInteroperableLayer returns [EObject current=null] : iv_ruleInteroperableLayer= ruleInteroperableLayer EOF ;
    public final EObject entryRuleInteroperableLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteroperableLayer = null;


        try {
            // InternalSmartCity.g:141:59: (iv_ruleInteroperableLayer= ruleInteroperableLayer EOF )
            // InternalSmartCity.g:142:2: iv_ruleInteroperableLayer= ruleInteroperableLayer EOF
            {
             newCompositeNode(grammarAccess.getInteroperableLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteroperableLayer=ruleInteroperableLayer();

            state._fsp--;

             current =iv_ruleInteroperableLayer; 
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
    // $ANTLR end "entryRuleInteroperableLayer"


    // $ANTLR start "ruleInteroperableLayer"
    // InternalSmartCity.g:148:1: ruleInteroperableLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) otherlv_4= 'delay' ( (lv_delay_5_0= ruleDelayRange ) ) ) ;
    public final EObject ruleInteroperableLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_priority_3_0=null;
        Token otherlv_4=null;
        EObject lv_delay_5_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:154:2: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) otherlv_4= 'delay' ( (lv_delay_5_0= ruleDelayRange ) ) ) )
            // InternalSmartCity.g:155:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) otherlv_4= 'delay' ( (lv_delay_5_0= ruleDelayRange ) ) )
            {
            // InternalSmartCity.g:155:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) otherlv_4= 'delay' ( (lv_delay_5_0= ruleDelayRange ) ) )
            // InternalSmartCity.g:156:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) otherlv_4= 'delay' ( (lv_delay_5_0= ruleDelayRange ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInteroperableLayerAccess().getLayerKeyword_0());
            		
            // InternalSmartCity.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:161:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInteroperableLayerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteroperableLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getInteroperableLayerAccess().getPriorityKeyword_2());
            		
            // InternalSmartCity.g:182:3: ( (lv_priority_3_0= RULE_INT ) )
            // InternalSmartCity.g:183:4: (lv_priority_3_0= RULE_INT )
            {
            // InternalSmartCity.g:183:4: (lv_priority_3_0= RULE_INT )
            // InternalSmartCity.g:184:5: lv_priority_3_0= RULE_INT
            {
            lv_priority_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_priority_3_0, grammarAccess.getInteroperableLayerAccess().getPriorityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteroperableLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getInteroperableLayerAccess().getDelayKeyword_4());
            		
            // InternalSmartCity.g:204:3: ( (lv_delay_5_0= ruleDelayRange ) )
            // InternalSmartCity.g:205:4: (lv_delay_5_0= ruleDelayRange )
            {
            // InternalSmartCity.g:205:4: (lv_delay_5_0= ruleDelayRange )
            // InternalSmartCity.g:206:5: lv_delay_5_0= ruleDelayRange
            {

            					newCompositeNode(grammarAccess.getInteroperableLayerAccess().getDelayDelayRangeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_delay_5_0=ruleDelayRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteroperableLayerRule());
            					}
            					set(
            						current,
            						"delay",
            						lv_delay_5_0,
            						"uibk.ac.at.smartcity.SmartCity.DelayRange");
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
    // $ANTLR end "ruleInteroperableLayer"


    // $ANTLR start "entryRuleNode"
    // InternalSmartCity.g:227:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSmartCity.g:227:45: (iv_ruleNode= ruleNode EOF )
            // InternalSmartCity.g:228:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSmartCity.g:234:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) otherlv_6= 'postFrequency' ( (lv_freqValue_7_0= RULE_INT ) ) ( (lv_freqUnit_8_0= ruleFrequencyUnit ) ) ( (lv_links_9_0= ruleCommunicationLink ) )* otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token lv_freqValue_7_0=null;
        Token otherlv_10=null;
        Token lv_priority_11_0=null;
        Token otherlv_12=null;
        EObject lv_sensors_3_0 = null;

        EObject lv_modules_4_0 = null;

        EObject lv_controller_5_0 = null;

        Enumerator lv_freqUnit_8_0 = null;

        EObject lv_links_9_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:240:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) otherlv_6= 'postFrequency' ( (lv_freqValue_7_0= RULE_INT ) ) ( (lv_freqUnit_8_0= ruleFrequencyUnit ) ) ( (lv_links_9_0= ruleCommunicationLink ) )* otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' ) )
            // InternalSmartCity.g:241:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) otherlv_6= 'postFrequency' ( (lv_freqValue_7_0= RULE_INT ) ) ( (lv_freqUnit_8_0= ruleFrequencyUnit ) ) ( (lv_links_9_0= ruleCommunicationLink ) )* otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' )
            {
            // InternalSmartCity.g:241:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) otherlv_6= 'postFrequency' ( (lv_freqValue_7_0= RULE_INT ) ) ( (lv_freqUnit_8_0= ruleFrequencyUnit ) ) ( (lv_links_9_0= ruleCommunicationLink ) )* otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' )
            // InternalSmartCity.g:242:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) otherlv_6= 'postFrequency' ( (lv_freqValue_7_0= RULE_INT ) ) ( (lv_freqUnit_8_0= ruleFrequencyUnit ) ) ( (lv_links_9_0= ruleCommunicationLink ) )* otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalSmartCity.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartCity.g:268:3: ( (lv_sensors_3_0= ruleSensor ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartCity.g:269:4: (lv_sensors_3_0= ruleSensor )
            	    {
            	    // InternalSmartCity.g:269:4: (lv_sensors_3_0= ruleSensor )
            	    // InternalSmartCity.g:270:5: lv_sensors_3_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getSensorsSensorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_sensors_3_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_3_0,
            	    						"uibk.ac.at.smartcity.SmartCity.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSmartCity.g:287:3: ( (lv_modules_4_0= ruleModule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartCity.g:288:4: (lv_modules_4_0= ruleModule )
            	    {
            	    // InternalSmartCity.g:288:4: (lv_modules_4_0= ruleModule )
            	    // InternalSmartCity.g:289:5: lv_modules_4_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getModulesModuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_modules_4_0=ruleModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_4_0,
            	    						"uibk.ac.at.smartcity.SmartCity.Module");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSmartCity.g:306:3: ( (lv_controller_5_0= ruleController ) )
            // InternalSmartCity.g:307:4: (lv_controller_5_0= ruleController )
            {
            // InternalSmartCity.g:307:4: (lv_controller_5_0= ruleController )
            // InternalSmartCity.g:308:5: lv_controller_5_0= ruleController
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getControllerControllerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_controller_5_0=ruleController();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"controller",
            						lv_controller_5_0,
            						"uibk.ac.at.smartcity.SmartCity.Controller");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getPostFrequencyKeyword_6());
            		
            // InternalSmartCity.g:329:3: ( (lv_freqValue_7_0= RULE_INT ) )
            // InternalSmartCity.g:330:4: (lv_freqValue_7_0= RULE_INT )
            {
            // InternalSmartCity.g:330:4: (lv_freqValue_7_0= RULE_INT )
            // InternalSmartCity.g:331:5: lv_freqValue_7_0= RULE_INT
            {
            lv_freqValue_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_freqValue_7_0, grammarAccess.getNodeAccess().getFreqValueINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"freqValue",
            						lv_freqValue_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:347:3: ( (lv_freqUnit_8_0= ruleFrequencyUnit ) )
            // InternalSmartCity.g:348:4: (lv_freqUnit_8_0= ruleFrequencyUnit )
            {
            // InternalSmartCity.g:348:4: (lv_freqUnit_8_0= ruleFrequencyUnit )
            // InternalSmartCity.g:349:5: lv_freqUnit_8_0= ruleFrequencyUnit
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getFreqUnitFrequencyUnitEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_freqUnit_8_0=ruleFrequencyUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"freqUnit",
            						lv_freqUnit_8_0,
            						"uibk.ac.at.smartcity.SmartCity.FrequencyUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCity.g:366:3: ( (lv_links_9_0= ruleCommunicationLink ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCity.g:367:4: (lv_links_9_0= ruleCommunicationLink )
            	    {
            	    // InternalSmartCity.g:367:4: (lv_links_9_0= ruleCommunicationLink )
            	    // InternalSmartCity.g:368:5: lv_links_9_0= ruleCommunicationLink
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getLinksCommunicationLinkParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_links_9_0=ruleCommunicationLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_9_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CommunicationLink");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getPriorityKeyword_10());
            		
            // InternalSmartCity.g:389:3: ( (lv_priority_11_0= RULE_INT ) )
            // InternalSmartCity.g:390:4: (lv_priority_11_0= RULE_INT )
            {
            // InternalSmartCity.g:390:4: (lv_priority_11_0= RULE_INT )
            // InternalSmartCity.g:391:5: lv_priority_11_0= RULE_INT
            {
            lv_priority_11_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_priority_11_0, grammarAccess.getNodeAccess().getPriorityINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSensor"
    // InternalSmartCity.g:415:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartCity.g:415:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartCity.g:416:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSmartCity.g:422:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_priority_5_0=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_cyclicActions_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:428:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) )
            // InternalSmartCity.g:429:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            {
            // InternalSmartCity.g:429:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            // InternalSmartCity.g:430:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalSmartCity.g:434:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:435:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:435:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:436:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getTypeKeyword_2());
            		
            // InternalSmartCity.g:456:3: ( (lv_type_3_0= ruleSensorType ) )
            // InternalSmartCity.g:457:4: (lv_type_3_0= ruleSensorType )
            {
            // InternalSmartCity.g:457:4: (lv_type_3_0= ruleSensorType )
            // InternalSmartCity.g:458:5: lv_type_3_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_3_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"uibk.ac.at.smartcity.SmartCity.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPriorityKeyword_4());
            		
            // InternalSmartCity.g:479:3: ( (lv_priority_5_0= RULE_INT ) )
            // InternalSmartCity.g:480:4: (lv_priority_5_0= RULE_INT )
            {
            // InternalSmartCity.g:480:4: (lv_priority_5_0= RULE_INT )
            // InternalSmartCity.g:481:5: lv_priority_5_0= RULE_INT
            {
            lv_priority_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_priority_5_0, grammarAccess.getSensorAccess().getPriorityINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:497:3: ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartCity.g:498:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:498:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    // InternalSmartCity.g:499:5: lv_cyclicActions_6_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getCyclicActionsCyclicActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_cyclicActions_6_0=ruleCyclicAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cyclicActions",
            	    						lv_cyclicActions_6_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CyclicAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleCommunicationLink"
    // InternalSmartCity.g:520:1: entryRuleCommunicationLink returns [EObject current=null] : iv_ruleCommunicationLink= ruleCommunicationLink EOF ;
    public final EObject entryRuleCommunicationLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationLink = null;


        try {
            // InternalSmartCity.g:520:58: (iv_ruleCommunicationLink= ruleCommunicationLink EOF )
            // InternalSmartCity.g:521:2: iv_ruleCommunicationLink= ruleCommunicationLink EOF
            {
             newCompositeNode(grammarAccess.getCommunicationLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationLink=ruleCommunicationLink();

            state._fsp--;

             current =iv_ruleCommunicationLink; 
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
    // $ANTLR end "entryRuleCommunicationLink"


    // $ANTLR start "ruleCommunicationLink"
    // InternalSmartCity.g:527:1: ruleCommunicationLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) ;
    public final EObject ruleCommunicationLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_delay_8_0 = null;

        Enumerator lv_datatype_10_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:533:2: ( (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) )
            // InternalSmartCity.g:534:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            {
            // InternalSmartCity.g:534:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            // InternalSmartCity.g:535:3: otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationLinkAccess().getLinkKeyword_0());
            		
            // InternalSmartCity.g:539:3: ( (lv_type_1_0= ruleLinkType ) )
            // InternalSmartCity.g:540:4: (lv_type_1_0= ruleLinkType )
            {
            // InternalSmartCity.g:540:4: (lv_type_1_0= ruleLinkType )
            // InternalSmartCity.g:541:5: lv_type_1_0= ruleLinkType
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getTypeLinkTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_type_1_0=ruleLinkType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationLinkRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"uibk.ac.at.smartcity.SmartCity.LinkType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationLinkAccess().getFromKeyword_2());
            		
            // InternalSmartCity.g:562:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartCity.g:563:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartCity.g:563:4: (otherlv_3= RULE_ID )
            // InternalSmartCity.g:564:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_3, grammarAccess.getCommunicationLinkAccess().getOriginLinkableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getCommunicationLinkAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalSmartCity.g:579:3: ( (otherlv_5= RULE_ID ) )
            // InternalSmartCity.g:580:4: (otherlv_5= RULE_ID )
            {
            // InternalSmartCity.g:580:4: (otherlv_5= RULE_ID )
            // InternalSmartCity.g:581:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationLinkRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_5, grammarAccess.getCommunicationLinkAccess().getDestinationLinkableCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCommunicationLinkAccess().getLeftCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getCommunicationLinkAccess().getDelayKeyword_7());
            		
            // InternalSmartCity.g:600:3: ( (lv_delay_8_0= ruleDelayRange ) )
            // InternalSmartCity.g:601:4: (lv_delay_8_0= ruleDelayRange )
            {
            // InternalSmartCity.g:601:4: (lv_delay_8_0= ruleDelayRange )
            // InternalSmartCity.g:602:5: lv_delay_8_0= ruleDelayRange
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getDelayDelayRangeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_22);
            lv_delay_8_0=ruleDelayRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationLinkRule());
            					}
            					set(
            						current,
            						"delay",
            						lv_delay_8_0,
            						"uibk.ac.at.smartcity.SmartCity.DelayRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getCommunicationLinkAccess().getDatatypeKeyword_9());
            		
            // InternalSmartCity.g:623:3: ( (lv_datatype_10_0= ruleSensorType ) )
            // InternalSmartCity.g:624:4: (lv_datatype_10_0= ruleSensorType )
            {
            // InternalSmartCity.g:624:4: (lv_datatype_10_0= ruleSensorType )
            // InternalSmartCity.g:625:5: lv_datatype_10_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getDatatypeSensorTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_15);
            lv_datatype_10_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationLinkRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_10_0,
            						"uibk.ac.at.smartcity.SmartCity.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCommunicationLinkAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleCommunicationLink"


    // $ANTLR start "entryRuleController"
    // InternalSmartCity.g:650:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSmartCity.g:650:51: (iv_ruleController= ruleController EOF )
            // InternalSmartCity.g:651:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalSmartCity.g:657:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_priority_5_0=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_cyclicActions_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:663:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) )
            // InternalSmartCity.g:664:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            {
            // InternalSmartCity.g:664:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            // InternalSmartCity.g:665:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalSmartCity.g:669:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:670:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:670:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:671:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getTypeKeyword_2());
            		
            // InternalSmartCity.g:691:3: ( (lv_type_3_0= ruleControllerType ) )
            // InternalSmartCity.g:692:4: (lv_type_3_0= ruleControllerType )
            {
            // InternalSmartCity.g:692:4: (lv_type_3_0= ruleControllerType )
            // InternalSmartCity.g:693:5: lv_type_3_0= ruleControllerType
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getTypeControllerTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_3_0=ruleControllerType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"uibk.ac.at.smartcity.SmartCity.ControllerType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getPriorityKeyword_4());
            		
            // InternalSmartCity.g:714:3: ( (lv_priority_5_0= RULE_INT ) )
            // InternalSmartCity.g:715:4: (lv_priority_5_0= RULE_INT )
            {
            // InternalSmartCity.g:715:4: (lv_priority_5_0= RULE_INT )
            // InternalSmartCity.g:716:5: lv_priority_5_0= RULE_INT
            {
            lv_priority_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_priority_5_0, grammarAccess.getControllerAccess().getPriorityINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:732:3: ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartCity.g:733:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:733:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    // InternalSmartCity.g:734:5: lv_cyclicActions_6_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getCyclicActionsCyclicActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_cyclicActions_6_0=ruleCyclicAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cyclicActions",
            	    						lv_cyclicActions_6_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CyclicAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleModule"
    // InternalSmartCity.g:755:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalSmartCity.g:755:47: (iv_ruleModule= ruleModule EOF )
            // InternalSmartCity.g:756:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalSmartCity.g:762:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_priority_3_0=null;
        EObject lv_cyclicActions_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:768:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* ) )
            // InternalSmartCity.g:769:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* )
            {
            // InternalSmartCity.g:769:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* )
            // InternalSmartCity.g:770:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalSmartCity.g:774:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:775:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:775:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:776:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getPriorityKeyword_2());
            		
            // InternalSmartCity.g:796:3: ( (lv_priority_3_0= RULE_INT ) )
            // InternalSmartCity.g:797:4: (lv_priority_3_0= RULE_INT )
            {
            // InternalSmartCity.g:797:4: (lv_priority_3_0= RULE_INT )
            // InternalSmartCity.g:798:5: lv_priority_3_0= RULE_INT
            {
            lv_priority_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_priority_3_0, grammarAccess.getModuleAccess().getPriorityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:814:3: ( (lv_cyclicActions_4_0= ruleCyclicAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmartCity.g:815:4: (lv_cyclicActions_4_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:815:4: (lv_cyclicActions_4_0= ruleCyclicAction )
            	    // InternalSmartCity.g:816:5: lv_cyclicActions_4_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getCyclicActionsCyclicActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_cyclicActions_4_0=ruleCyclicAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cyclicActions",
            	    						lv_cyclicActions_4_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CyclicAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleDelayRange"
    // InternalSmartCity.g:837:1: entryRuleDelayRange returns [EObject current=null] : iv_ruleDelayRange= ruleDelayRange EOF ;
    public final EObject entryRuleDelayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayRange = null;


        try {
            // InternalSmartCity.g:837:51: (iv_ruleDelayRange= ruleDelayRange EOF )
            // InternalSmartCity.g:838:2: iv_ruleDelayRange= ruleDelayRange EOF
            {
             newCompositeNode(grammarAccess.getDelayRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelayRange=ruleDelayRange();

            state._fsp--;

             current =iv_ruleDelayRange; 
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
    // $ANTLR end "entryRuleDelayRange"


    // $ANTLR start "ruleDelayRange"
    // InternalSmartCity.g:844:1: ruleDelayRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleDelayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSmartCity.g:850:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalSmartCity.g:851:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalSmartCity.g:851:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalSmartCity.g:852:3: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSmartCity.g:856:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalSmartCity.g:857:4: (lv_min_1_0= RULE_INT )
            {
            // InternalSmartCity.g:857:4: (lv_min_1_0= RULE_INT )
            // InternalSmartCity.g:858:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_min_1_0, grammarAccess.getDelayRangeAccess().getMinINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelayRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDelayRangeAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSmartCity.g:878:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalSmartCity.g:879:4: (lv_max_3_0= RULE_INT )
            {
            // InternalSmartCity.g:879:4: (lv_max_3_0= RULE_INT )
            // InternalSmartCity.g:880:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_max_3_0, grammarAccess.getDelayRangeAccess().getMaxINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelayRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDelayRangeAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDelayRange"


    // $ANTLR start "entryRuleCyclicAction"
    // InternalSmartCity.g:904:1: entryRuleCyclicAction returns [EObject current=null] : iv_ruleCyclicAction= ruleCyclicAction EOF ;
    public final EObject entryRuleCyclicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyclicAction = null;


        try {
            // InternalSmartCity.g:904:53: (iv_ruleCyclicAction= ruleCyclicAction EOF )
            // InternalSmartCity.g:905:2: iv_ruleCyclicAction= ruleCyclicAction EOF
            {
             newCompositeNode(grammarAccess.getCyclicActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCyclicAction=ruleCyclicAction();

            state._fsp--;

             current =iv_ruleCyclicAction; 
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
    // $ANTLR end "entryRuleCyclicAction"


    // $ANTLR start "ruleCyclicAction"
    // InternalSmartCity.g:911:1: ruleCyclicAction returns [EObject current=null] : (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) ) ;
    public final EObject ruleCyclicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_freqValue_3_0=null;
        Enumerator lv_freqUnit_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:917:2: ( (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) ) )
            // InternalSmartCity.g:918:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) )
            {
            // InternalSmartCity.g:918:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) )
            // InternalSmartCity.g:919:3: otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCyclicActionAccess().getCyclicActionKeyword_0());
            		
            // InternalSmartCity.g:923:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:924:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:924:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:925:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCyclicActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCyclicActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCyclicActionAccess().getFrequencyKeyword_2());
            		
            // InternalSmartCity.g:945:3: ( (lv_freqValue_3_0= RULE_INT ) )
            // InternalSmartCity.g:946:4: (lv_freqValue_3_0= RULE_INT )
            {
            // InternalSmartCity.g:946:4: (lv_freqValue_3_0= RULE_INT )
            // InternalSmartCity.g:947:5: lv_freqValue_3_0= RULE_INT
            {
            lv_freqValue_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_freqValue_3_0, grammarAccess.getCyclicActionAccess().getFreqValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCyclicActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"freqValue",
            						lv_freqValue_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:963:3: ( (lv_freqUnit_4_0= ruleFrequencyUnit ) )
            // InternalSmartCity.g:964:4: (lv_freqUnit_4_0= ruleFrequencyUnit )
            {
            // InternalSmartCity.g:964:4: (lv_freqUnit_4_0= ruleFrequencyUnit )
            // InternalSmartCity.g:965:5: lv_freqUnit_4_0= ruleFrequencyUnit
            {

            					newCompositeNode(grammarAccess.getCyclicActionAccess().getFreqUnitFrequencyUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_freqUnit_4_0=ruleFrequencyUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCyclicActionRule());
            					}
            					set(
            						current,
            						"freqUnit",
            						lv_freqUnit_4_0,
            						"uibk.ac.at.smartcity.SmartCity.FrequencyUnit");
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
    // $ANTLR end "ruleCyclicAction"


    // $ANTLR start "ruleSensorType"
    // InternalSmartCity.g:986:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) ) ;
    public final Enumerator ruleSensorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalSmartCity.g:992:2: ( ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) ) )
            // InternalSmartCity.g:993:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) )
            {
            // InternalSmartCity.g:993:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            case 35:
                {
                alt9=5;
                }
                break;
            case 36:
                {
                alt9=6;
                }
                break;
            case 37:
                {
                alt9=7;
                }
                break;
            case 38:
                {
                alt9=8;
                }
                break;
            case 39:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSmartCity.g:994:3: (enumLiteral_0= 'TEMPERATURE' )
                    {
                    // InternalSmartCity.g:994:3: (enumLiteral_0= 'TEMPERATURE' )
                    // InternalSmartCity.g:995:4: enumLiteral_0= 'TEMPERATURE'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1002:3: (enumLiteral_1= 'PH' )
                    {
                    // InternalSmartCity.g:1002:3: (enumLiteral_1= 'PH' )
                    // InternalSmartCity.g:1003:4: enumLiteral_1= 'PH'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1010:3: (enumLiteral_2= 'TURBIDITY' )
                    {
                    // InternalSmartCity.g:1010:3: (enumLiteral_2= 'TURBIDITY' )
                    // InternalSmartCity.g:1011:4: enumLiteral_2= 'TURBIDITY'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1018:3: (enumLiteral_3= 'TDS' )
                    {
                    // InternalSmartCity.g:1018:3: (enumLiteral_3= 'TDS' )
                    // InternalSmartCity.g:1019:4: enumLiteral_3= 'TDS'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1026:3: (enumLiteral_4= 'CURRENT' )
                    {
                    // InternalSmartCity.g:1026:3: (enumLiteral_4= 'CURRENT' )
                    // InternalSmartCity.g:1027:4: enumLiteral_4= 'CURRENT'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1034:3: (enumLiteral_5= 'PULSE' )
                    {
                    // InternalSmartCity.g:1034:3: (enumLiteral_5= 'PULSE' )
                    // InternalSmartCity.g:1035:4: enumLiteral_5= 'PULSE'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCity.g:1042:3: (enumLiteral_6= 'ULTRASONIC' )
                    {
                    // InternalSmartCity.g:1042:3: (enumLiteral_6= 'ULTRASONIC' )
                    // InternalSmartCity.g:1043:4: enumLiteral_6= 'ULTRASONIC'
                    {
                    enumLiteral_6=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSmartCity.g:1050:3: (enumLiteral_7= 'CAMERA' )
                    {
                    // InternalSmartCity.g:1050:3: (enumLiteral_7= 'CAMERA' )
                    // InternalSmartCity.g:1051:4: enumLiteral_7= 'CAMERA'
                    {
                    enumLiteral_7=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSmartCity.g:1058:3: (enumLiteral_8= 'GSM' )
                    {
                    // InternalSmartCity.g:1058:3: (enumLiteral_8= 'GSM' )
                    // InternalSmartCity.g:1059:4: enumLiteral_8= 'GSM'
                    {
                    enumLiteral_8=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getGSMEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSensorTypeAccess().getGSMEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleControllerType"
    // InternalSmartCity.g:1069:1: ruleControllerType returns [Enumerator current=null] : ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) ) ;
    public final Enumerator ruleControllerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1075:2: ( ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) ) )
            // InternalSmartCity.g:1076:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) )
            {
            // InternalSmartCity.g:1076:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSmartCity.g:1077:3: (enumLiteral_0= 'ESP32' )
                    {
                    // InternalSmartCity.g:1077:3: (enumLiteral_0= 'ESP32' )
                    // InternalSmartCity.g:1078:4: enumLiteral_0= 'ESP32'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1085:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    {
                    // InternalSmartCity.g:1085:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    // InternalSmartCity.g:1086:4: enumLiteral_1= 'RASPBERRY_PI'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1093:3: (enumLiteral_2= 'OTHER' )
                    {
                    // InternalSmartCity.g:1093:3: (enumLiteral_2= 'OTHER' )
                    // InternalSmartCity.g:1094:4: enumLiteral_2= 'OTHER'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getOTHEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getControllerTypeAccess().getOTHEREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleControllerType"


    // $ANTLR start "ruleLinkType"
    // InternalSmartCity.g:1104:1: ruleLinkType returns [Enumerator current=null] : ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1110:2: ( ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) ) )
            // InternalSmartCity.g:1111:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) )
            {
            // InternalSmartCity.g:1111:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt11=1;
                }
                break;
            case 44:
                {
                alt11=2;
                }
                break;
            case 45:
                {
                alt11=3;
                }
                break;
            case 46:
                {
                alt11=4;
                }
                break;
            case 47:
                {
                alt11=5;
                }
                break;
            case 48:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSmartCity.g:1112:3: (enumLiteral_0= 'UART' )
                    {
                    // InternalSmartCity.g:1112:3: (enumLiteral_0= 'UART' )
                    // InternalSmartCity.g:1113:4: enumLiteral_0= 'UART'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1120:3: (enumLiteral_1= 'ADC' )
                    {
                    // InternalSmartCity.g:1120:3: (enumLiteral_1= 'ADC' )
                    // InternalSmartCity.g:1121:4: enumLiteral_1= 'ADC'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1128:3: (enumLiteral_2= 'SPI' )
                    {
                    // InternalSmartCity.g:1128:3: (enumLiteral_2= 'SPI' )
                    // InternalSmartCity.g:1129:4: enumLiteral_2= 'SPI'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1136:3: (enumLiteral_3= 'GPIO' )
                    {
                    // InternalSmartCity.g:1136:3: (enumLiteral_3= 'GPIO' )
                    // InternalSmartCity.g:1137:4: enumLiteral_3= 'GPIO'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getGPIOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLinkTypeAccess().getGPIOEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1144:3: (enumLiteral_4= 'CSI' )
                    {
                    // InternalSmartCity.g:1144:3: (enumLiteral_4= 'CSI' )
                    // InternalSmartCity.g:1145:4: enumLiteral_4= 'CSI'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1152:3: (enumLiteral_5= 'HTTPS' )
                    {
                    // InternalSmartCity.g:1152:3: (enumLiteral_5= 'HTTPS' )
                    // InternalSmartCity.g:1153:4: enumLiteral_5= 'HTTPS'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getHTTPSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLinkTypeAccess().getHTTPSEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleLinkType"


    // $ANTLR start "ruleFrequencyUnit"
    // InternalSmartCity.g:1163:1: ruleFrequencyUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) ;
    public final Enumerator ruleFrequencyUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1169:2: ( ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) )
            // InternalSmartCity.g:1170:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            {
            // InternalSmartCity.g:1170:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt12=1;
                }
                break;
            case 50:
                {
                alt12=2;
                }
                break;
            case 51:
                {
                alt12=3;
                }
                break;
            case 52:
                {
                alt12=4;
                }
                break;
            case 53:
                {
                alt12=5;
                }
                break;
            case 54:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSmartCity.g:1171:3: (enumLiteral_0= 'HERTZ' )
                    {
                    // InternalSmartCity.g:1171:3: (enumLiteral_0= 'HERTZ' )
                    // InternalSmartCity.g:1172:4: enumLiteral_0= 'HERTZ'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1179:3: (enumLiteral_1= 'SECONDS' )
                    {
                    // InternalSmartCity.g:1179:3: (enumLiteral_1= 'SECONDS' )
                    // InternalSmartCity.g:1180:4: enumLiteral_1= 'SECONDS'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1187:3: (enumLiteral_2= 'MINUTES' )
                    {
                    // InternalSmartCity.g:1187:3: (enumLiteral_2= 'MINUTES' )
                    // InternalSmartCity.g:1188:4: enumLiteral_2= 'MINUTES'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1195:3: (enumLiteral_3= 'HOURS' )
                    {
                    // InternalSmartCity.g:1195:3: (enumLiteral_3= 'HOURS' )
                    // InternalSmartCity.g:1196:4: enumLiteral_3= 'HOURS'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1203:3: (enumLiteral_4= 'DAYS' )
                    {
                    // InternalSmartCity.g:1203:3: (enumLiteral_4= 'DAYS' )
                    // InternalSmartCity.g:1204:4: enumLiteral_4= 'DAYS'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1211:3: (enumLiteral_5= 'INF' )
                    {
                    // InternalSmartCity.g:1211:3: (enumLiteral_5= 'INF' )
                    // InternalSmartCity.g:1212:4: enumLiteral_5= 'INF'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getINFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFrequencyUnitAccess().getINFEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleFrequencyUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x007E000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000FF80000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});

}