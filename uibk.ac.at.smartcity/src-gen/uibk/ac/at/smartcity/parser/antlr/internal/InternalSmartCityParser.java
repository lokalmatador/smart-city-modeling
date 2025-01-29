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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dataGateway'", "'{'", "'priority'", "'delay'", "'}'", "'node'", "'postFrequency'", "'sensor'", "'type'", "'link'", "'from'", "'->'", "'datatype'", "'controller'", "'module'", "'['", "'..'", "']'", "'cyclicAction'", "'frequency'", "'TriggeredAction'", "'TEMPERATURE'", "'PH'", "'TURBIDITY'", "'TDS'", "'CURRENT'", "'PULSE'", "'ULTRASONIC'", "'CAMERA'", "'GSM'", "'ESP32'", "'RASPBERRY_PI'", "'OTHER'", "'UART'", "'ADC'", "'SPI'", "'CSI'", "'HTTPS'", "'HERTZ'", "'SECONDS'", "'MINUTES'", "'HOURS'", "'DAYS'", "'INF'"
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
    // InternalSmartCity.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_dataGateway_1_0 = null;

        EObject lv_globalLinks_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:78:2: ( ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ) )
            // InternalSmartCity.g:79:2: ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* )
            {
            // InternalSmartCity.g:79:2: ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* )
            // InternalSmartCity.g:80:3: ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )*
            {
            // InternalSmartCity.g:80:3: ( (lv_nodes_0_0= ruleNode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
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

            // InternalSmartCity.g:99:3: ( (lv_dataGateway_1_0= ruleDataGateway ) )
            // InternalSmartCity.g:100:4: (lv_dataGateway_1_0= ruleDataGateway )
            {
            // InternalSmartCity.g:100:4: (lv_dataGateway_1_0= ruleDataGateway )
            // InternalSmartCity.g:101:5: lv_dataGateway_1_0= ruleDataGateway
            {

            					newCompositeNode(grammarAccess.getModelAccess().getDataGatewayDataGatewayParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_dataGateway_1_0=ruleDataGateway();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"dataGateway",
            						lv_dataGateway_1_0,
            						"uibk.ac.at.smartcity.SmartCity.DataGateway");
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


    // $ANTLR start "entryRuleDataGateway"
    // InternalSmartCity.g:141:1: entryRuleDataGateway returns [EObject current=null] : iv_ruleDataGateway= ruleDataGateway EOF ;
    public final EObject entryRuleDataGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataGateway = null;


        try {
            // InternalSmartCity.g:141:52: (iv_ruleDataGateway= ruleDataGateway EOF )
            // InternalSmartCity.g:142:2: iv_ruleDataGateway= ruleDataGateway EOF
            {
             newCompositeNode(grammarAccess.getDataGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataGateway=ruleDataGateway();

            state._fsp--;

             current =iv_ruleDataGateway; 
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
    // $ANTLR end "entryRuleDataGateway"


    // $ANTLR start "ruleDataGateway"
    // InternalSmartCity.g:148:1: ruleDataGateway returns [EObject current=null] : (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' ) ;
    public final EObject ruleDataGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_priority_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_delay_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:154:2: ( (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' ) )
            // InternalSmartCity.g:155:2: (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' )
            {
            // InternalSmartCity.g:155:2: (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' )
            // InternalSmartCity.g:156:3: otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataGatewayAccess().getDataGatewayKeyword_0());
            		
            // InternalSmartCity.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:161:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataGatewayAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataGatewayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDataGatewayAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDataGatewayAccess().getPriorityKeyword_3());
            		
            // InternalSmartCity.g:186:3: ( (lv_priority_4_0= RULE_INT ) )
            // InternalSmartCity.g:187:4: (lv_priority_4_0= RULE_INT )
            {
            // InternalSmartCity.g:187:4: (lv_priority_4_0= RULE_INT )
            // InternalSmartCity.g:188:5: lv_priority_4_0= RULE_INT
            {
            lv_priority_4_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_priority_4_0, grammarAccess.getDataGatewayAccess().getPriorityINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataGatewayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getDataGatewayAccess().getDelayKeyword_5());
            		
            // InternalSmartCity.g:208:3: ( (lv_delay_6_0= ruleDelayRange ) )
            // InternalSmartCity.g:209:4: (lv_delay_6_0= ruleDelayRange )
            {
            // InternalSmartCity.g:209:4: (lv_delay_6_0= ruleDelayRange )
            // InternalSmartCity.g:210:5: lv_delay_6_0= ruleDelayRange
            {

            					newCompositeNode(grammarAccess.getDataGatewayAccess().getDelayDelayRangeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_delay_6_0=ruleDelayRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataGatewayRule());
            					}
            					set(
            						current,
            						"delay",
            						lv_delay_6_0,
            						"uibk.ac.at.smartcity.SmartCity.DelayRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataGatewayAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDataGateway"


    // $ANTLR start "entryRuleNode"
    // InternalSmartCity.g:235:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSmartCity.g:235:45: (iv_ruleNode= ruleNode EOF )
            // InternalSmartCity.g:236:2: iv_ruleNode= ruleNode EOF
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
    // InternalSmartCity.g:242:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_freqValue_8_0= RULE_INT ) ) ( (lv_freqUnit_9_0= ruleFrequencyUnit ) ) otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_freqValue_8_0=null;
        Token otherlv_10=null;
        Token lv_priority_11_0=null;
        Token otherlv_12=null;
        EObject lv_sensors_3_0 = null;

        EObject lv_modules_4_0 = null;

        EObject lv_controller_5_0 = null;

        EObject lv_links_6_0 = null;

        Enumerator lv_freqUnit_9_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:248:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_freqValue_8_0= RULE_INT ) ) ( (lv_freqUnit_9_0= ruleFrequencyUnit ) ) otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' ) )
            // InternalSmartCity.g:249:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_freqValue_8_0= RULE_INT ) ) ( (lv_freqUnit_9_0= ruleFrequencyUnit ) ) otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' )
            {
            // InternalSmartCity.g:249:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_freqValue_8_0= RULE_INT ) ) ( (lv_freqUnit_9_0= ruleFrequencyUnit ) ) otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}' )
            // InternalSmartCity.g:250:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_freqValue_8_0= RULE_INT ) ) ( (lv_freqUnit_9_0= ruleFrequencyUnit ) ) otherlv_10= 'priority' ( (lv_priority_11_0= RULE_INT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalSmartCity.g:254:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:255:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:255:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:256:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartCity.g:276:3: ( (lv_sensors_3_0= ruleSensor ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartCity.g:277:4: (lv_sensors_3_0= ruleSensor )
            	    {
            	    // InternalSmartCity.g:277:4: (lv_sensors_3_0= ruleSensor )
            	    // InternalSmartCity.g:278:5: lv_sensors_3_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getSensorsSensorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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

            // InternalSmartCity.g:295:3: ( (lv_modules_4_0= ruleModule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartCity.g:296:4: (lv_modules_4_0= ruleModule )
            	    {
            	    // InternalSmartCity.g:296:4: (lv_modules_4_0= ruleModule )
            	    // InternalSmartCity.g:297:5: lv_modules_4_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getModulesModuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
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

            // InternalSmartCity.g:314:3: ( (lv_controller_5_0= ruleController ) )
            // InternalSmartCity.g:315:4: (lv_controller_5_0= ruleController )
            {
            // InternalSmartCity.g:315:4: (lv_controller_5_0= ruleController )
            // InternalSmartCity.g:316:5: lv_controller_5_0= ruleController
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getControllerControllerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalSmartCity.g:333:3: ( (lv_links_6_0= ruleCommunicationLink ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCity.g:334:4: (lv_links_6_0= ruleCommunicationLink )
            	    {
            	    // InternalSmartCity.g:334:4: (lv_links_6_0= ruleCommunicationLink )
            	    // InternalSmartCity.g:335:5: lv_links_6_0= ruleCommunicationLink
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getLinksCommunicationLinkParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_links_6_0=ruleCommunicationLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_6_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CommunicationLink");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getPostFrequencyKeyword_7());
            		
            // InternalSmartCity.g:356:3: ( (lv_freqValue_8_0= RULE_INT ) )
            // InternalSmartCity.g:357:4: (lv_freqValue_8_0= RULE_INT )
            {
            // InternalSmartCity.g:357:4: (lv_freqValue_8_0= RULE_INT )
            // InternalSmartCity.g:358:5: lv_freqValue_8_0= RULE_INT
            {
            lv_freqValue_8_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_freqValue_8_0, grammarAccess.getNodeAccess().getFreqValueINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"freqValue",
            						lv_freqValue_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:374:3: ( (lv_freqUnit_9_0= ruleFrequencyUnit ) )
            // InternalSmartCity.g:375:4: (lv_freqUnit_9_0= ruleFrequencyUnit )
            {
            // InternalSmartCity.g:375:4: (lv_freqUnit_9_0= ruleFrequencyUnit )
            // InternalSmartCity.g:376:5: lv_freqUnit_9_0= ruleFrequencyUnit
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getFreqUnitFrequencyUnitEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_freqUnit_9_0=ruleFrequencyUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"freqUnit",
            						lv_freqUnit_9_0,
            						"uibk.ac.at.smartcity.SmartCity.FrequencyUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getPriorityKeyword_10());
            		
            // InternalSmartCity.g:397:3: ( (lv_priority_11_0= RULE_INT ) )
            // InternalSmartCity.g:398:4: (lv_priority_11_0= RULE_INT )
            {
            // InternalSmartCity.g:398:4: (lv_priority_11_0= RULE_INT )
            // InternalSmartCity.g:399:5: lv_priority_11_0= RULE_INT
            {
            lv_priority_11_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalSmartCity.g:423:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartCity.g:423:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartCity.g:424:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalSmartCity.g:430:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_priority_6_0=null;
        Token otherlv_9=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_cyclicActions_7_0 = null;

        EObject lv_triggeredActions_8_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:436:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) )
            // InternalSmartCity.g:437:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            {
            // InternalSmartCity.g:437:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            // InternalSmartCity.g:438:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalSmartCity.g:442:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:443:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:443:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:444:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3());
            		
            // InternalSmartCity.g:468:3: ( (lv_type_4_0= ruleSensorType ) )
            // InternalSmartCity.g:469:4: (lv_type_4_0= ruleSensorType )
            {
            // InternalSmartCity.g:469:4: (lv_type_4_0= ruleSensorType )
            // InternalSmartCity.g:470:5: lv_type_4_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"uibk.ac.at.smartcity.SmartCity.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getPriorityKeyword_5());
            		
            // InternalSmartCity.g:491:3: ( (lv_priority_6_0= RULE_INT ) )
            // InternalSmartCity.g:492:4: (lv_priority_6_0= RULE_INT )
            {
            // InternalSmartCity.g:492:4: (lv_priority_6_0= RULE_INT )
            // InternalSmartCity.g:493:5: lv_priority_6_0= RULE_INT
            {
            lv_priority_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_priority_6_0, grammarAccess.getSensorAccess().getPriorityINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:509:3: ( (lv_cyclicActions_7_0= ruleCyclicAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartCity.g:510:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:510:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    // InternalSmartCity.g:511:5: lv_cyclicActions_7_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getCyclicActionsCyclicActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_cyclicActions_7_0=ruleCyclicAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cyclicActions",
            	    						lv_cyclicActions_7_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CyclicAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSmartCity.g:528:3: ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartCity.g:529:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    {
            	    // InternalSmartCity.g:529:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    // InternalSmartCity.g:530:5: lv_triggeredActions_8_0= ruleTriggeredAction
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getTriggeredActionsTriggeredActionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_triggeredActions_8_0=ruleTriggeredAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"triggeredActions",
            	    						lv_triggeredActions_8_0,
            	    						"uibk.ac.at.smartcity.SmartCity.TriggeredAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalSmartCity.g:555:1: entryRuleCommunicationLink returns [EObject current=null] : iv_ruleCommunicationLink= ruleCommunicationLink EOF ;
    public final EObject entryRuleCommunicationLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationLink = null;


        try {
            // InternalSmartCity.g:555:58: (iv_ruleCommunicationLink= ruleCommunicationLink EOF )
            // InternalSmartCity.g:556:2: iv_ruleCommunicationLink= ruleCommunicationLink EOF
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
    // InternalSmartCity.g:562:1: ruleCommunicationLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) ;
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
            // InternalSmartCity.g:568:2: ( (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) )
            // InternalSmartCity.g:569:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            {
            // InternalSmartCity.g:569:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            // InternalSmartCity.g:570:3: otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationLinkAccess().getLinkKeyword_0());
            		
            // InternalSmartCity.g:574:3: ( (lv_type_1_0= ruleLinkType ) )
            // InternalSmartCity.g:575:4: (lv_type_1_0= ruleLinkType )
            {
            // InternalSmartCity.g:575:4: (lv_type_1_0= ruleLinkType )
            // InternalSmartCity.g:576:5: lv_type_1_0= ruleLinkType
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
            		
            // InternalSmartCity.g:597:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartCity.g:598:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartCity.g:598:4: (otherlv_3= RULE_ID )
            // InternalSmartCity.g:599:5: otherlv_3= RULE_ID
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
            		
            // InternalSmartCity.g:614:3: ( (otherlv_5= RULE_ID ) )
            // InternalSmartCity.g:615:4: (otherlv_5= RULE_ID )
            {
            // InternalSmartCity.g:615:4: (otherlv_5= RULE_ID )
            // InternalSmartCity.g:616:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationLinkRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_5, grammarAccess.getCommunicationLinkAccess().getDestinationLinkableCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getCommunicationLinkAccess().getLeftCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getCommunicationLinkAccess().getDelayKeyword_7());
            		
            // InternalSmartCity.g:635:3: ( (lv_delay_8_0= ruleDelayRange ) )
            // InternalSmartCity.g:636:4: (lv_delay_8_0= ruleDelayRange )
            {
            // InternalSmartCity.g:636:4: (lv_delay_8_0= ruleDelayRange )
            // InternalSmartCity.g:637:5: lv_delay_8_0= ruleDelayRange
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

            otherlv_9=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getCommunicationLinkAccess().getDatatypeKeyword_9());
            		
            // InternalSmartCity.g:658:3: ( (lv_datatype_10_0= ruleSensorType ) )
            // InternalSmartCity.g:659:4: (lv_datatype_10_0= ruleSensorType )
            {
            // InternalSmartCity.g:659:4: (lv_datatype_10_0= ruleSensorType )
            // InternalSmartCity.g:660:5: lv_datatype_10_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getDatatypeSensorTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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
    // InternalSmartCity.g:685:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSmartCity.g:685:51: (iv_ruleController= ruleController EOF )
            // InternalSmartCity.g:686:2: iv_ruleController= ruleController EOF
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
    // InternalSmartCity.g:692:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_priority_6_0=null;
        Token otherlv_9=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_cyclicActions_7_0 = null;

        EObject lv_triggeredActions_8_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:698:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) )
            // InternalSmartCity.g:699:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            {
            // InternalSmartCity.g:699:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            // InternalSmartCity.g:700:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalSmartCity.g:704:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:705:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:705:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:706:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getTypeKeyword_3());
            		
            // InternalSmartCity.g:730:3: ( (lv_type_4_0= ruleControllerType ) )
            // InternalSmartCity.g:731:4: (lv_type_4_0= ruleControllerType )
            {
            // InternalSmartCity.g:731:4: (lv_type_4_0= ruleControllerType )
            // InternalSmartCity.g:732:5: lv_type_4_0= ruleControllerType
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getTypeControllerTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleControllerType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"uibk.ac.at.smartcity.SmartCity.ControllerType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getPriorityKeyword_5());
            		
            // InternalSmartCity.g:753:3: ( (lv_priority_6_0= RULE_INT ) )
            // InternalSmartCity.g:754:4: (lv_priority_6_0= RULE_INT )
            {
            // InternalSmartCity.g:754:4: (lv_priority_6_0= RULE_INT )
            // InternalSmartCity.g:755:5: lv_priority_6_0= RULE_INT
            {
            lv_priority_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_priority_6_0, grammarAccess.getControllerAccess().getPriorityINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:771:3: ( (lv_cyclicActions_7_0= ruleCyclicAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmartCity.g:772:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:772:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    // InternalSmartCity.g:773:5: lv_cyclicActions_7_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getCyclicActionsCyclicActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_cyclicActions_7_0=ruleCyclicAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cyclicActions",
            	    						lv_cyclicActions_7_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CyclicAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSmartCity.g:790:3: ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmartCity.g:791:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    {
            	    // InternalSmartCity.g:791:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    // InternalSmartCity.g:792:5: lv_triggeredActions_8_0= ruleTriggeredAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getTriggeredActionsTriggeredActionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_triggeredActions_8_0=ruleTriggeredAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"triggeredActions",
            	    						lv_triggeredActions_8_0,
            	    						"uibk.ac.at.smartcity.SmartCity.TriggeredAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalSmartCity.g:817:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalSmartCity.g:817:47: (iv_ruleModule= ruleModule EOF )
            // InternalSmartCity.g:818:2: iv_ruleModule= ruleModule EOF
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
    // InternalSmartCity.g:824:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_priority_4_0=null;
        Token otherlv_7=null;
        EObject lv_cyclicActions_5_0 = null;

        EObject lv_triggeredActions_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:830:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' ) )
            // InternalSmartCity.g:831:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' )
            {
            // InternalSmartCity.g:831:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' )
            // InternalSmartCity.g:832:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalSmartCity.g:836:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:837:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:837:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:838:5: lv_name_1_0= RULE_ID
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

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getPriorityKeyword_3());
            		
            // InternalSmartCity.g:862:3: ( (lv_priority_4_0= RULE_INT ) )
            // InternalSmartCity.g:863:4: (lv_priority_4_0= RULE_INT )
            {
            // InternalSmartCity.g:863:4: (lv_priority_4_0= RULE_INT )
            // InternalSmartCity.g:864:5: lv_priority_4_0= RULE_INT
            {
            lv_priority_4_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_priority_4_0, grammarAccess.getModuleAccess().getPriorityINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:880:3: ( (lv_cyclicActions_5_0= ruleCyclicAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmartCity.g:881:4: (lv_cyclicActions_5_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:881:4: (lv_cyclicActions_5_0= ruleCyclicAction )
            	    // InternalSmartCity.g:882:5: lv_cyclicActions_5_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getCyclicActionsCyclicActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_cyclicActions_5_0=ruleCyclicAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cyclicActions",
            	    						lv_cyclicActions_5_0,
            	    						"uibk.ac.at.smartcity.SmartCity.CyclicAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalSmartCity.g:899:3: ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmartCity.g:900:4: (lv_triggeredActions_6_0= ruleTriggeredAction )
            	    {
            	    // InternalSmartCity.g:900:4: (lv_triggeredActions_6_0= ruleTriggeredAction )
            	    // InternalSmartCity.g:901:5: lv_triggeredActions_6_0= ruleTriggeredAction
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getTriggeredActionsTriggeredActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_triggeredActions_6_0=ruleTriggeredAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"triggeredActions",
            	    						lv_triggeredActions_6_0,
            	    						"uibk.ac.at.smartcity.SmartCity.TriggeredAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSmartCity.g:926:1: entryRuleDelayRange returns [EObject current=null] : iv_ruleDelayRange= ruleDelayRange EOF ;
    public final EObject entryRuleDelayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayRange = null;


        try {
            // InternalSmartCity.g:926:51: (iv_ruleDelayRange= ruleDelayRange EOF )
            // InternalSmartCity.g:927:2: iv_ruleDelayRange= ruleDelayRange EOF
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
    // InternalSmartCity.g:933:1: ruleDelayRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleDelayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSmartCity.g:939:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalSmartCity.g:940:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalSmartCity.g:940:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalSmartCity.g:941:3: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSmartCity.g:945:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalSmartCity.g:946:4: (lv_min_1_0= RULE_INT )
            {
            // InternalSmartCity.g:946:4: (lv_min_1_0= RULE_INT )
            // InternalSmartCity.g:947:5: lv_min_1_0= RULE_INT
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

            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDelayRangeAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSmartCity.g:967:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalSmartCity.g:968:4: (lv_max_3_0= RULE_INT )
            {
            // InternalSmartCity.g:968:4: (lv_max_3_0= RULE_INT )
            // InternalSmartCity.g:969:5: lv_max_3_0= RULE_INT
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
    // InternalSmartCity.g:993:1: entryRuleCyclicAction returns [EObject current=null] : iv_ruleCyclicAction= ruleCyclicAction EOF ;
    public final EObject entryRuleCyclicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyclicAction = null;


        try {
            // InternalSmartCity.g:993:53: (iv_ruleCyclicAction= ruleCyclicAction EOF )
            // InternalSmartCity.g:994:2: iv_ruleCyclicAction= ruleCyclicAction EOF
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
    // InternalSmartCity.g:1000:1: ruleCyclicAction returns [EObject current=null] : (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) ) ;
    public final EObject ruleCyclicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_freqValue_3_0=null;
        Enumerator lv_freqUnit_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:1006:2: ( (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) ) )
            // InternalSmartCity.g:1007:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) )
            {
            // InternalSmartCity.g:1007:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) ) )
            // InternalSmartCity.g:1008:3: otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_freqValue_3_0= RULE_INT ) ) ( (lv_freqUnit_4_0= ruleFrequencyUnit ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCyclicActionAccess().getCyclicActionKeyword_0());
            		
            // InternalSmartCity.g:1012:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:1013:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:1013:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:1014:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCyclicActionAccess().getFrequencyKeyword_2());
            		
            // InternalSmartCity.g:1034:3: ( (lv_freqValue_3_0= RULE_INT ) )
            // InternalSmartCity.g:1035:4: (lv_freqValue_3_0= RULE_INT )
            {
            // InternalSmartCity.g:1035:4: (lv_freqValue_3_0= RULE_INT )
            // InternalSmartCity.g:1036:5: lv_freqValue_3_0= RULE_INT
            {
            lv_freqValue_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalSmartCity.g:1052:3: ( (lv_freqUnit_4_0= ruleFrequencyUnit ) )
            // InternalSmartCity.g:1053:4: (lv_freqUnit_4_0= ruleFrequencyUnit )
            {
            // InternalSmartCity.g:1053:4: (lv_freqUnit_4_0= ruleFrequencyUnit )
            // InternalSmartCity.g:1054:5: lv_freqUnit_4_0= ruleFrequencyUnit
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


    // $ANTLR start "entryRuleTriggeredAction"
    // InternalSmartCity.g:1075:1: entryRuleTriggeredAction returns [EObject current=null] : iv_ruleTriggeredAction= ruleTriggeredAction EOF ;
    public final EObject entryRuleTriggeredAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggeredAction = null;


        try {
            // InternalSmartCity.g:1075:56: (iv_ruleTriggeredAction= ruleTriggeredAction EOF )
            // InternalSmartCity.g:1076:2: iv_ruleTriggeredAction= ruleTriggeredAction EOF
            {
             newCompositeNode(grammarAccess.getTriggeredActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggeredAction=ruleTriggeredAction();

            state._fsp--;

             current =iv_ruleTriggeredAction; 
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
    // $ANTLR end "entryRuleTriggeredAction"


    // $ANTLR start "ruleTriggeredAction"
    // InternalSmartCity.g:1082:1: ruleTriggeredAction returns [EObject current=null] : (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTriggeredAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1088:2: ( (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmartCity.g:1089:2: (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmartCity.g:1089:2: (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmartCity.g:1090:3: otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggeredActionAccess().getTriggeredActionKeyword_0());
            		
            // InternalSmartCity.g:1094:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:1095:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:1095:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:1096:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTriggeredActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggeredActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTriggeredAction"


    // $ANTLR start "ruleSensorType"
    // InternalSmartCity.g:1116:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) ) ;
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
            // InternalSmartCity.g:1122:2: ( ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) ) )
            // InternalSmartCity.g:1123:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) )
            {
            // InternalSmartCity.g:1123:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            case 36:
                {
                alt12=5;
                }
                break;
            case 37:
                {
                alt12=6;
                }
                break;
            case 38:
                {
                alt12=7;
                }
                break;
            case 39:
                {
                alt12=8;
                }
                break;
            case 40:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSmartCity.g:1124:3: (enumLiteral_0= 'TEMPERATURE' )
                    {
                    // InternalSmartCity.g:1124:3: (enumLiteral_0= 'TEMPERATURE' )
                    // InternalSmartCity.g:1125:4: enumLiteral_0= 'TEMPERATURE'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1132:3: (enumLiteral_1= 'PH' )
                    {
                    // InternalSmartCity.g:1132:3: (enumLiteral_1= 'PH' )
                    // InternalSmartCity.g:1133:4: enumLiteral_1= 'PH'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1140:3: (enumLiteral_2= 'TURBIDITY' )
                    {
                    // InternalSmartCity.g:1140:3: (enumLiteral_2= 'TURBIDITY' )
                    // InternalSmartCity.g:1141:4: enumLiteral_2= 'TURBIDITY'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1148:3: (enumLiteral_3= 'TDS' )
                    {
                    // InternalSmartCity.g:1148:3: (enumLiteral_3= 'TDS' )
                    // InternalSmartCity.g:1149:4: enumLiteral_3= 'TDS'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1156:3: (enumLiteral_4= 'CURRENT' )
                    {
                    // InternalSmartCity.g:1156:3: (enumLiteral_4= 'CURRENT' )
                    // InternalSmartCity.g:1157:4: enumLiteral_4= 'CURRENT'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1164:3: (enumLiteral_5= 'PULSE' )
                    {
                    // InternalSmartCity.g:1164:3: (enumLiteral_5= 'PULSE' )
                    // InternalSmartCity.g:1165:4: enumLiteral_5= 'PULSE'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCity.g:1172:3: (enumLiteral_6= 'ULTRASONIC' )
                    {
                    // InternalSmartCity.g:1172:3: (enumLiteral_6= 'ULTRASONIC' )
                    // InternalSmartCity.g:1173:4: enumLiteral_6= 'ULTRASONIC'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSmartCity.g:1180:3: (enumLiteral_7= 'CAMERA' )
                    {
                    // InternalSmartCity.g:1180:3: (enumLiteral_7= 'CAMERA' )
                    // InternalSmartCity.g:1181:4: enumLiteral_7= 'CAMERA'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSmartCity.g:1188:3: (enumLiteral_8= 'GSM' )
                    {
                    // InternalSmartCity.g:1188:3: (enumLiteral_8= 'GSM' )
                    // InternalSmartCity.g:1189:4: enumLiteral_8= 'GSM'
                    {
                    enumLiteral_8=(Token)match(input,40,FOLLOW_2); 

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
    // InternalSmartCity.g:1199:1: ruleControllerType returns [Enumerator current=null] : ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) ) ;
    public final Enumerator ruleControllerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1205:2: ( ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) ) )
            // InternalSmartCity.g:1206:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) )
            {
            // InternalSmartCity.g:1206:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSmartCity.g:1207:3: (enumLiteral_0= 'ESP32' )
                    {
                    // InternalSmartCity.g:1207:3: (enumLiteral_0= 'ESP32' )
                    // InternalSmartCity.g:1208:4: enumLiteral_0= 'ESP32'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1215:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    {
                    // InternalSmartCity.g:1215:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    // InternalSmartCity.g:1216:4: enumLiteral_1= 'RASPBERRY_PI'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1223:3: (enumLiteral_2= 'OTHER' )
                    {
                    // InternalSmartCity.g:1223:3: (enumLiteral_2= 'OTHER' )
                    // InternalSmartCity.g:1224:4: enumLiteral_2= 'OTHER'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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
    // InternalSmartCity.g:1234:1: ruleLinkType returns [Enumerator current=null] : ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1240:2: ( ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) ) )
            // InternalSmartCity.g:1241:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) )
            {
            // InternalSmartCity.g:1241:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt14=1;
                }
                break;
            case 45:
                {
                alt14=2;
                }
                break;
            case 46:
                {
                alt14=3;
                }
                break;
            case 47:
                {
                alt14=4;
                }
                break;
            case 48:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSmartCity.g:1242:3: (enumLiteral_0= 'UART' )
                    {
                    // InternalSmartCity.g:1242:3: (enumLiteral_0= 'UART' )
                    // InternalSmartCity.g:1243:4: enumLiteral_0= 'UART'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1250:3: (enumLiteral_1= 'ADC' )
                    {
                    // InternalSmartCity.g:1250:3: (enumLiteral_1= 'ADC' )
                    // InternalSmartCity.g:1251:4: enumLiteral_1= 'ADC'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1258:3: (enumLiteral_2= 'SPI' )
                    {
                    // InternalSmartCity.g:1258:3: (enumLiteral_2= 'SPI' )
                    // InternalSmartCity.g:1259:4: enumLiteral_2= 'SPI'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1266:3: (enumLiteral_3= 'CSI' )
                    {
                    // InternalSmartCity.g:1266:3: (enumLiteral_3= 'CSI' )
                    // InternalSmartCity.g:1267:4: enumLiteral_3= 'CSI'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1274:3: (enumLiteral_4= 'HTTPS' )
                    {
                    // InternalSmartCity.g:1274:3: (enumLiteral_4= 'HTTPS' )
                    // InternalSmartCity.g:1275:4: enumLiteral_4= 'HTTPS'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getHTTPSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLinkTypeAccess().getHTTPSEnumLiteralDeclaration_4());
                    			

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
    // InternalSmartCity.g:1285:1: ruleFrequencyUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) ;
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
            // InternalSmartCity.g:1291:2: ( ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) )
            // InternalSmartCity.g:1292:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            {
            // InternalSmartCity.g:1292:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt15=1;
                }
                break;
            case 50:
                {
                alt15=2;
                }
                break;
            case 51:
                {
                alt15=3;
                }
                break;
            case 52:
                {
                alt15=4;
                }
                break;
            case 53:
                {
                alt15=5;
                }
                break;
            case 54:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSmartCity.g:1293:3: (enumLiteral_0= 'HERTZ' )
                    {
                    // InternalSmartCity.g:1293:3: (enumLiteral_0= 'HERTZ' )
                    // InternalSmartCity.g:1294:4: enumLiteral_0= 'HERTZ'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1301:3: (enumLiteral_1= 'SECONDS' )
                    {
                    // InternalSmartCity.g:1301:3: (enumLiteral_1= 'SECONDS' )
                    // InternalSmartCity.g:1302:4: enumLiteral_1= 'SECONDS'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1309:3: (enumLiteral_2= 'MINUTES' )
                    {
                    // InternalSmartCity.g:1309:3: (enumLiteral_2= 'MINUTES' )
                    // InternalSmartCity.g:1310:4: enumLiteral_2= 'MINUTES'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1317:3: (enumLiteral_3= 'HOURS' )
                    {
                    // InternalSmartCity.g:1317:3: (enumLiteral_3= 'HOURS' )
                    // InternalSmartCity.g:1318:4: enumLiteral_3= 'HOURS'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1325:3: (enumLiteral_4= 'DAYS' )
                    {
                    // InternalSmartCity.g:1325:3: (enumLiteral_4= 'DAYS' )
                    // InternalSmartCity.g:1326:4: enumLiteral_4= 'DAYS'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1333:3: (enumLiteral_5= 'INF' )
                    {
                    // InternalSmartCity.g:1333:3: (enumLiteral_5= 'INF' )
                    // InternalSmartCity.g:1334:4: enumLiteral_5= 'INF'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x007E000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000001FF00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000A0008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});

}