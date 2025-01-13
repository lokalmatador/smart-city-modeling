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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'layer'", "'priority'", "'delay'", "'node'", "'{'", "'}'", "'sensor'", "'type'", "'link'", "'from'", "'->'", "'datatype'", "'controller'", "'module'", "'['", "'..'", "']'", "'cyclicAction'", "'frequency'", "'TEMPERATURE'", "'PH'", "'TURBIDITY'", "'TDS'", "'CURRENT'", "'PULSE'", "'ULTRASONIC'", "'CAMERA'", "'ESP32'", "'RASPBERRY_PI'", "'UART'", "'ADC'", "'SPI'", "'GPIO'", "'CSI'", "'HTTPS'", "'HERTZ'", "'SECONDS'", "'MINUTES'", "'HOURS'", "'DAYS'", "'INF'"
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

                if ( (LA2_0==19) ) {
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
    // InternalSmartCity.g:234:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_sensors_3_0 = null;

        EObject lv_modules_4_0 = null;

        EObject lv_controller_5_0 = null;

        EObject lv_links_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:240:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= '}' ) )
            // InternalSmartCity.g:241:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= '}' )
            {
            // InternalSmartCity.g:241:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= '}' )
            // InternalSmartCity.g:242:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= '}'
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

                if ( (LA3_0==17) ) {
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

                if ( (LA4_0==24) ) {
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

            // InternalSmartCity.g:325:3: ( (lv_links_6_0= ruleCommunicationLink ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCity.g:326:4: (lv_links_6_0= ruleCommunicationLink )
            	    {
            	    // InternalSmartCity.g:326:4: (lv_links_6_0= ruleCommunicationLink )
            	    // InternalSmartCity.g:327:5: lv_links_6_0= ruleCommunicationLink
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getLinksCommunicationLinkParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSmartCity.g:352:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartCity.g:352:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartCity.g:353:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalSmartCity.g:359:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) ;
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
            // InternalSmartCity.g:365:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) )
            // InternalSmartCity.g:366:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            {
            // InternalSmartCity.g:366:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            // InternalSmartCity.g:367:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleSensorType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalSmartCity.g:371:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:372:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:372:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:373:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getTypeKeyword_2());
            		
            // InternalSmartCity.g:393:3: ( (lv_type_3_0= ruleSensorType ) )
            // InternalSmartCity.g:394:4: (lv_type_3_0= ruleSensorType )
            {
            // InternalSmartCity.g:394:4: (lv_type_3_0= ruleSensorType )
            // InternalSmartCity.g:395:5: lv_type_3_0= ruleSensorType
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
            		
            // InternalSmartCity.g:416:3: ( (lv_priority_5_0= RULE_INT ) )
            // InternalSmartCity.g:417:4: (lv_priority_5_0= RULE_INT )
            {
            // InternalSmartCity.g:417:4: (lv_priority_5_0= RULE_INT )
            // InternalSmartCity.g:418:5: lv_priority_5_0= RULE_INT
            {
            lv_priority_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalSmartCity.g:434:3: ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartCity.g:435:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:435:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    // InternalSmartCity.g:436:5: lv_cyclicActions_6_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getCyclicActionsCyclicActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
    // InternalSmartCity.g:457:1: entryRuleCommunicationLink returns [EObject current=null] : iv_ruleCommunicationLink= ruleCommunicationLink EOF ;
    public final EObject entryRuleCommunicationLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationLink = null;


        try {
            // InternalSmartCity.g:457:58: (iv_ruleCommunicationLink= ruleCommunicationLink EOF )
            // InternalSmartCity.g:458:2: iv_ruleCommunicationLink= ruleCommunicationLink EOF
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
    // InternalSmartCity.g:464:1: ruleCommunicationLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) ;
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
            // InternalSmartCity.g:470:2: ( (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) )
            // InternalSmartCity.g:471:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            {
            // InternalSmartCity.g:471:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            // InternalSmartCity.g:472:3: otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationLinkAccess().getLinkKeyword_0());
            		
            // InternalSmartCity.g:476:3: ( (lv_type_1_0= ruleLinkType ) )
            // InternalSmartCity.g:477:4: (lv_type_1_0= ruleLinkType )
            {
            // InternalSmartCity.g:477:4: (lv_type_1_0= ruleLinkType )
            // InternalSmartCity.g:478:5: lv_type_1_0= ruleLinkType
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getTypeLinkTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationLinkAccess().getFromKeyword_2());
            		
            // InternalSmartCity.g:499:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartCity.g:500:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartCity.g:500:4: (otherlv_3= RULE_ID )
            // InternalSmartCity.g:501:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getCommunicationLinkAccess().getOriginLinkableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getCommunicationLinkAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalSmartCity.g:516:3: ( (otherlv_5= RULE_ID ) )
            // InternalSmartCity.g:517:4: (otherlv_5= RULE_ID )
            {
            // InternalSmartCity.g:517:4: (otherlv_5= RULE_ID )
            // InternalSmartCity.g:518:5: otherlv_5= RULE_ID
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
            		
            // InternalSmartCity.g:537:3: ( (lv_delay_8_0= ruleDelayRange ) )
            // InternalSmartCity.g:538:4: (lv_delay_8_0= ruleDelayRange )
            {
            // InternalSmartCity.g:538:4: (lv_delay_8_0= ruleDelayRange )
            // InternalSmartCity.g:539:5: lv_delay_8_0= ruleDelayRange
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getDelayDelayRangeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_9=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getCommunicationLinkAccess().getDatatypeKeyword_9());
            		
            // InternalSmartCity.g:560:3: ( (lv_datatype_10_0= ruleSensorType ) )
            // InternalSmartCity.g:561:4: (lv_datatype_10_0= ruleSensorType )
            {
            // InternalSmartCity.g:561:4: (lv_datatype_10_0= ruleSensorType )
            // InternalSmartCity.g:562:5: lv_datatype_10_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getDatatypeSensorTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSmartCity.g:587:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSmartCity.g:587:51: (iv_ruleController= ruleController EOF )
            // InternalSmartCity.g:588:2: iv_ruleController= ruleController EOF
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
    // InternalSmartCity.g:594:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) ;
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
            // InternalSmartCity.g:600:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* ) )
            // InternalSmartCity.g:601:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            {
            // InternalSmartCity.g:601:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )* )
            // InternalSmartCity.g:602:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleControllerType ) ) otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalSmartCity.g:606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:607:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:608:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getTypeKeyword_2());
            		
            // InternalSmartCity.g:628:3: ( (lv_type_3_0= ruleControllerType ) )
            // InternalSmartCity.g:629:4: (lv_type_3_0= ruleControllerType )
            {
            // InternalSmartCity.g:629:4: (lv_type_3_0= ruleControllerType )
            // InternalSmartCity.g:630:5: lv_type_3_0= ruleControllerType
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
            		
            // InternalSmartCity.g:651:3: ( (lv_priority_5_0= RULE_INT ) )
            // InternalSmartCity.g:652:4: (lv_priority_5_0= RULE_INT )
            {
            // InternalSmartCity.g:652:4: (lv_priority_5_0= RULE_INT )
            // InternalSmartCity.g:653:5: lv_priority_5_0= RULE_INT
            {
            lv_priority_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalSmartCity.g:669:3: ( (lv_cyclicActions_6_0= ruleCyclicAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartCity.g:670:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:670:4: (lv_cyclicActions_6_0= ruleCyclicAction )
            	    // InternalSmartCity.g:671:5: lv_cyclicActions_6_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getCyclicActionsCyclicActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
    // InternalSmartCity.g:692:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalSmartCity.g:692:47: (iv_ruleModule= ruleModule EOF )
            // InternalSmartCity.g:693:2: iv_ruleModule= ruleModule EOF
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
    // InternalSmartCity.g:699:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_priority_3_0=null;
        EObject lv_cyclicActions_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:705:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* ) )
            // InternalSmartCity.g:706:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* )
            {
            // InternalSmartCity.g:706:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )* )
            // InternalSmartCity.g:707:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priority_3_0= RULE_INT ) ) ( (lv_cyclicActions_4_0= ruleCyclicAction ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalSmartCity.g:711:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:712:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:712:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:713:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSmartCity.g:733:3: ( (lv_priority_3_0= RULE_INT ) )
            // InternalSmartCity.g:734:4: (lv_priority_3_0= RULE_INT )
            {
            // InternalSmartCity.g:734:4: (lv_priority_3_0= RULE_INT )
            // InternalSmartCity.g:735:5: lv_priority_3_0= RULE_INT
            {
            lv_priority_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalSmartCity.g:751:3: ( (lv_cyclicActions_4_0= ruleCyclicAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmartCity.g:752:4: (lv_cyclicActions_4_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:752:4: (lv_cyclicActions_4_0= ruleCyclicAction )
            	    // InternalSmartCity.g:753:5: lv_cyclicActions_4_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getCyclicActionsCyclicActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
    // InternalSmartCity.g:774:1: entryRuleDelayRange returns [EObject current=null] : iv_ruleDelayRange= ruleDelayRange EOF ;
    public final EObject entryRuleDelayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayRange = null;


        try {
            // InternalSmartCity.g:774:51: (iv_ruleDelayRange= ruleDelayRange EOF )
            // InternalSmartCity.g:775:2: iv_ruleDelayRange= ruleDelayRange EOF
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
    // InternalSmartCity.g:781:1: ruleDelayRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleDelayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSmartCity.g:787:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalSmartCity.g:788:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalSmartCity.g:788:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalSmartCity.g:789:3: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSmartCity.g:793:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalSmartCity.g:794:4: (lv_min_1_0= RULE_INT )
            {
            // InternalSmartCity.g:794:4: (lv_min_1_0= RULE_INT )
            // InternalSmartCity.g:795:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDelayRangeAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSmartCity.g:815:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalSmartCity.g:816:4: (lv_max_3_0= RULE_INT )
            {
            // InternalSmartCity.g:816:4: (lv_max_3_0= RULE_INT )
            // InternalSmartCity.g:817:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSmartCity.g:841:1: entryRuleCyclicAction returns [EObject current=null] : iv_ruleCyclicAction= ruleCyclicAction EOF ;
    public final EObject entryRuleCyclicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyclicAction = null;


        try {
            // InternalSmartCity.g:841:53: (iv_ruleCyclicAction= ruleCyclicAction EOF )
            // InternalSmartCity.g:842:2: iv_ruleCyclicAction= ruleCyclicAction EOF
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
    // InternalSmartCity.g:848:1: ruleCyclicAction returns [EObject current=null] : (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleFrequencyUnit ) ) ) ;
    public final EObject ruleCyclicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Enumerator lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:854:2: ( (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleFrequencyUnit ) ) ) )
            // InternalSmartCity.g:855:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleFrequencyUnit ) ) )
            {
            // InternalSmartCity.g:855:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleFrequencyUnit ) ) )
            // InternalSmartCity.g:856:3: otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleFrequencyUnit ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCyclicActionAccess().getCyclicActionKeyword_0());
            		
            // InternalSmartCity.g:860:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:861:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:861:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:862:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCyclicActionAccess().getFrequencyKeyword_2());
            		
            // InternalSmartCity.g:882:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalSmartCity.g:883:4: (lv_value_3_0= RULE_INT )
            {
            // InternalSmartCity.g:883:4: (lv_value_3_0= RULE_INT )
            // InternalSmartCity.g:884:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_value_3_0, grammarAccess.getCyclicActionAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCyclicActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:900:3: ( (lv_unit_4_0= ruleFrequencyUnit ) )
            // InternalSmartCity.g:901:4: (lv_unit_4_0= ruleFrequencyUnit )
            {
            // InternalSmartCity.g:901:4: (lv_unit_4_0= ruleFrequencyUnit )
            // InternalSmartCity.g:902:5: lv_unit_4_0= ruleFrequencyUnit
            {

            					newCompositeNode(grammarAccess.getCyclicActionAccess().getUnitFrequencyUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_4_0=ruleFrequencyUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCyclicActionRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_4_0,
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
    // InternalSmartCity.g:923:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) ) ;
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


        	enterRule();

        try {
            // InternalSmartCity.g:929:2: ( ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) ) )
            // InternalSmartCity.g:930:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) )
            {
            // InternalSmartCity.g:930:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            case 34:
                {
                alt9=5;
                }
                break;
            case 35:
                {
                alt9=6;
                }
                break;
            case 36:
                {
                alt9=7;
                }
                break;
            case 37:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSmartCity.g:931:3: (enumLiteral_0= 'TEMPERATURE' )
                    {
                    // InternalSmartCity.g:931:3: (enumLiteral_0= 'TEMPERATURE' )
                    // InternalSmartCity.g:932:4: enumLiteral_0= 'TEMPERATURE'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:939:3: (enumLiteral_1= 'PH' )
                    {
                    // InternalSmartCity.g:939:3: (enumLiteral_1= 'PH' )
                    // InternalSmartCity.g:940:4: enumLiteral_1= 'PH'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:947:3: (enumLiteral_2= 'TURBIDITY' )
                    {
                    // InternalSmartCity.g:947:3: (enumLiteral_2= 'TURBIDITY' )
                    // InternalSmartCity.g:948:4: enumLiteral_2= 'TURBIDITY'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:955:3: (enumLiteral_3= 'TDS' )
                    {
                    // InternalSmartCity.g:955:3: (enumLiteral_3= 'TDS' )
                    // InternalSmartCity.g:956:4: enumLiteral_3= 'TDS'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:963:3: (enumLiteral_4= 'CURRENT' )
                    {
                    // InternalSmartCity.g:963:3: (enumLiteral_4= 'CURRENT' )
                    // InternalSmartCity.g:964:4: enumLiteral_4= 'CURRENT'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:971:3: (enumLiteral_5= 'PULSE' )
                    {
                    // InternalSmartCity.g:971:3: (enumLiteral_5= 'PULSE' )
                    // InternalSmartCity.g:972:4: enumLiteral_5= 'PULSE'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCity.g:979:3: (enumLiteral_6= 'ULTRASONIC' )
                    {
                    // InternalSmartCity.g:979:3: (enumLiteral_6= 'ULTRASONIC' )
                    // InternalSmartCity.g:980:4: enumLiteral_6= 'ULTRASONIC'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSmartCity.g:987:3: (enumLiteral_7= 'CAMERA' )
                    {
                    // InternalSmartCity.g:987:3: (enumLiteral_7= 'CAMERA' )
                    // InternalSmartCity.g:988:4: enumLiteral_7= 'CAMERA'
                    {
                    enumLiteral_7=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7());
                    			

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
    // InternalSmartCity.g:998:1: ruleControllerType returns [Enumerator current=null] : ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) ) ;
    public final Enumerator ruleControllerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1004:2: ( ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) ) )
            // InternalSmartCity.g:1005:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) )
            {
            // InternalSmartCity.g:1005:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmartCity.g:1006:3: (enumLiteral_0= 'ESP32' )
                    {
                    // InternalSmartCity.g:1006:3: (enumLiteral_0= 'ESP32' )
                    // InternalSmartCity.g:1007:4: enumLiteral_0= 'ESP32'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1014:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    {
                    // InternalSmartCity.g:1014:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    // InternalSmartCity.g:1015:4: enumLiteral_1= 'RASPBERRY_PI'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1());
                    			

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
    // InternalSmartCity.g:1025:1: ruleLinkType returns [Enumerator current=null] : ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) ) ;
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
            // InternalSmartCity.g:1031:2: ( ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) ) )
            // InternalSmartCity.g:1032:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) )
            {
            // InternalSmartCity.g:1032:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'GPIO' ) | (enumLiteral_4= 'CSI' ) | (enumLiteral_5= 'HTTPS' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 45:
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
                    // InternalSmartCity.g:1033:3: (enumLiteral_0= 'UART' )
                    {
                    // InternalSmartCity.g:1033:3: (enumLiteral_0= 'UART' )
                    // InternalSmartCity.g:1034:4: enumLiteral_0= 'UART'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1041:3: (enumLiteral_1= 'ADC' )
                    {
                    // InternalSmartCity.g:1041:3: (enumLiteral_1= 'ADC' )
                    // InternalSmartCity.g:1042:4: enumLiteral_1= 'ADC'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1049:3: (enumLiteral_2= 'SPI' )
                    {
                    // InternalSmartCity.g:1049:3: (enumLiteral_2= 'SPI' )
                    // InternalSmartCity.g:1050:4: enumLiteral_2= 'SPI'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1057:3: (enumLiteral_3= 'GPIO' )
                    {
                    // InternalSmartCity.g:1057:3: (enumLiteral_3= 'GPIO' )
                    // InternalSmartCity.g:1058:4: enumLiteral_3= 'GPIO'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getGPIOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLinkTypeAccess().getGPIOEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1065:3: (enumLiteral_4= 'CSI' )
                    {
                    // InternalSmartCity.g:1065:3: (enumLiteral_4= 'CSI' )
                    // InternalSmartCity.g:1066:4: enumLiteral_4= 'CSI'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1073:3: (enumLiteral_5= 'HTTPS' )
                    {
                    // InternalSmartCity.g:1073:3: (enumLiteral_5= 'HTTPS' )
                    // InternalSmartCity.g:1074:4: enumLiteral_5= 'HTTPS'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

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
    // InternalSmartCity.g:1084:1: ruleFrequencyUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) ;
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
            // InternalSmartCity.g:1090:2: ( ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) )
            // InternalSmartCity.g:1091:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            {
            // InternalSmartCity.g:1091:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt12=1;
                }
                break;
            case 47:
                {
                alt12=2;
                }
                break;
            case 48:
                {
                alt12=3;
                }
                break;
            case 49:
                {
                alt12=4;
                }
                break;
            case 50:
                {
                alt12=5;
                }
                break;
            case 51:
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
                    // InternalSmartCity.g:1092:3: (enumLiteral_0= 'HERTZ' )
                    {
                    // InternalSmartCity.g:1092:3: (enumLiteral_0= 'HERTZ' )
                    // InternalSmartCity.g:1093:4: enumLiteral_0= 'HERTZ'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1100:3: (enumLiteral_1= 'SECONDS' )
                    {
                    // InternalSmartCity.g:1100:3: (enumLiteral_1= 'SECONDS' )
                    // InternalSmartCity.g:1101:4: enumLiteral_1= 'SECONDS'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1108:3: (enumLiteral_2= 'MINUTES' )
                    {
                    // InternalSmartCity.g:1108:3: (enumLiteral_2= 'MINUTES' )
                    // InternalSmartCity.g:1109:4: enumLiteral_2= 'MINUTES'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1116:3: (enumLiteral_3= 'HOURS' )
                    {
                    // InternalSmartCity.g:1116:3: (enumLiteral_3= 'HOURS' )
                    // InternalSmartCity.g:1117:4: enumLiteral_3= 'HOURS'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1124:3: (enumLiteral_4= 'DAYS' )
                    {
                    // InternalSmartCity.g:1124:3: (enumLiteral_4= 'DAYS' )
                    // InternalSmartCity.g:1125:4: enumLiteral_4= 'DAYS'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1132:3: (enumLiteral_5= 'INF' )
                    {
                    // InternalSmartCity.g:1132:3: (enumLiteral_5= 'INF' )
                    // InternalSmartCity.g:1133:4: enumLiteral_5= 'INF'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003FC0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000FC00000000000L});

}