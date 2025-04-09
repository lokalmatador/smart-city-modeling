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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'simulationProperties'", "'{'", "'terminationTime'", "'generatorFile'", "'}'", "'dataGateway'", "'priority'", "'delay'", "'node'", "'postFrequency'", "'sensor'", "'type'", "'link'", "'from'", "'->'", "'datatype'", "'controller'", "'module'", "'['", "'..'", "']'", "'cyclicAction'", "'frequency'", "'TriggeredAction'", "'TEMPERATURE'", "'PH'", "'TURBIDITY'", "'TDS'", "'CURRENT'", "'PULSE'", "'ULTRASONIC'", "'CAMERA'", "'GSM'", "'ESP32'", "'RASPBERRY_PI'", "'OTHER'", "'UART'", "'ADC'", "'SPI'", "'CSI'", "'HTTPS'", "'HERTZ'", "'SECONDS'", "'MINUTES'", "'HOURS'", "'DAYS'", "'INF'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    // InternalSmartCity.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ( (lv_simulationProperties_3_0= ruleSimulationProperties ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_dataGateway_1_0 = null;

        EObject lv_globalLinks_2_0 = null;

        EObject lv_simulationProperties_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:78:2: ( ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ( (lv_simulationProperties_3_0= ruleSimulationProperties ) ) ) )
            // InternalSmartCity.g:79:2: ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ( (lv_simulationProperties_3_0= ruleSimulationProperties ) ) )
            {
            // InternalSmartCity.g:79:2: ( ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ( (lv_simulationProperties_3_0= ruleSimulationProperties ) ) )
            // InternalSmartCity.g:80:3: ( (lv_nodes_0_0= ruleNode ) )* ( (lv_dataGateway_1_0= ruleDataGateway ) ) ( (lv_globalLinks_2_0= ruleCommunicationLink ) )* ( (lv_simulationProperties_3_0= ruleSimulationProperties ) )
            {
            // InternalSmartCity.g:80:3: ( (lv_nodes_0_0= ruleNode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
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

                if ( (LA2_0==23) ) {
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

            // InternalSmartCity.g:137:3: ( (lv_simulationProperties_3_0= ruleSimulationProperties ) )
            // InternalSmartCity.g:138:4: (lv_simulationProperties_3_0= ruleSimulationProperties )
            {
            // InternalSmartCity.g:138:4: (lv_simulationProperties_3_0= ruleSimulationProperties )
            // InternalSmartCity.g:139:5: lv_simulationProperties_3_0= ruleSimulationProperties
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSimulationPropertiesSimulationPropertiesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_simulationProperties_3_0=ruleSimulationProperties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"simulationProperties",
            						lv_simulationProperties_3_0,
            						"uibk.ac.at.smartcity.SmartCity.SimulationProperties");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSimulationProperties"
    // InternalSmartCity.g:160:1: entryRuleSimulationProperties returns [EObject current=null] : iv_ruleSimulationProperties= ruleSimulationProperties EOF ;
    public final EObject entryRuleSimulationProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationProperties = null;


        try {
            // InternalSmartCity.g:160:61: (iv_ruleSimulationProperties= ruleSimulationProperties EOF )
            // InternalSmartCity.g:161:2: iv_ruleSimulationProperties= ruleSimulationProperties EOF
            {
             newCompositeNode(grammarAccess.getSimulationPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimulationProperties=ruleSimulationProperties();

            state._fsp--;

             current =iv_ruleSimulationProperties; 
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
    // $ANTLR end "entryRuleSimulationProperties"


    // $ANTLR start "ruleSimulationProperties"
    // InternalSmartCity.g:167:1: ruleSimulationProperties returns [EObject current=null] : (otherlv_0= 'simulationProperties' otherlv_1= '{' otherlv_2= 'terminationTime' ( (lv_terminationTime_3_0= RULE_INT ) ) (otherlv_4= 'generatorFile' ( (lv_generatorFile_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSimulationProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_terminationTime_3_0=null;
        Token otherlv_4=null;
        Token lv_generatorFile_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSmartCity.g:173:2: ( (otherlv_0= 'simulationProperties' otherlv_1= '{' otherlv_2= 'terminationTime' ( (lv_terminationTime_3_0= RULE_INT ) ) (otherlv_4= 'generatorFile' ( (lv_generatorFile_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) )
            // InternalSmartCity.g:174:2: (otherlv_0= 'simulationProperties' otherlv_1= '{' otherlv_2= 'terminationTime' ( (lv_terminationTime_3_0= RULE_INT ) ) (otherlv_4= 'generatorFile' ( (lv_generatorFile_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            {
            // InternalSmartCity.g:174:2: (otherlv_0= 'simulationProperties' otherlv_1= '{' otherlv_2= 'terminationTime' ( (lv_terminationTime_3_0= RULE_INT ) ) (otherlv_4= 'generatorFile' ( (lv_generatorFile_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            // InternalSmartCity.g:175:3: otherlv_0= 'simulationProperties' otherlv_1= '{' otherlv_2= 'terminationTime' ( (lv_terminationTime_3_0= RULE_INT ) ) (otherlv_4= 'generatorFile' ( (lv_generatorFile_5_0= RULE_STRING ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSimulationPropertiesAccess().getSimulationPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSimulationPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSimulationPropertiesAccess().getTerminationTimeKeyword_2());
            		
            // InternalSmartCity.g:187:3: ( (lv_terminationTime_3_0= RULE_INT ) )
            // InternalSmartCity.g:188:4: (lv_terminationTime_3_0= RULE_INT )
            {
            // InternalSmartCity.g:188:4: (lv_terminationTime_3_0= RULE_INT )
            // InternalSmartCity.g:189:5: lv_terminationTime_3_0= RULE_INT
            {
            lv_terminationTime_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_terminationTime_3_0, grammarAccess.getSimulationPropertiesAccess().getTerminationTimeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimulationPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"terminationTime",
            						lv_terminationTime_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:205:3: (otherlv_4= 'generatorFile' ( (lv_generatorFile_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmartCity.g:206:4: otherlv_4= 'generatorFile' ( (lv_generatorFile_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimulationPropertiesAccess().getGeneratorFileKeyword_4_0());
                    			
                    // InternalSmartCity.g:210:4: ( (lv_generatorFile_5_0= RULE_STRING ) )
                    // InternalSmartCity.g:211:5: (lv_generatorFile_5_0= RULE_STRING )
                    {
                    // InternalSmartCity.g:211:5: (lv_generatorFile_5_0= RULE_STRING )
                    // InternalSmartCity.g:212:6: lv_generatorFile_5_0= RULE_STRING
                    {
                    lv_generatorFile_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_generatorFile_5_0, grammarAccess.getSimulationPropertiesAccess().getGeneratorFileSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimulationPropertiesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"generatorFile",
                    							lv_generatorFile_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSimulationPropertiesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSimulationProperties"


    // $ANTLR start "entryRuleDataGateway"
    // InternalSmartCity.g:237:1: entryRuleDataGateway returns [EObject current=null] : iv_ruleDataGateway= ruleDataGateway EOF ;
    public final EObject entryRuleDataGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataGateway = null;


        try {
            // InternalSmartCity.g:237:52: (iv_ruleDataGateway= ruleDataGateway EOF )
            // InternalSmartCity.g:238:2: iv_ruleDataGateway= ruleDataGateway EOF
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
    // InternalSmartCity.g:244:1: ruleDataGateway returns [EObject current=null] : (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' ) ;
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
            // InternalSmartCity.g:250:2: ( (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' ) )
            // InternalSmartCity.g:251:2: (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' )
            {
            // InternalSmartCity.g:251:2: (otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}' )
            // InternalSmartCity.g:252:3: otherlv_0= 'dataGateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) otherlv_5= 'delay' ( (lv_delay_6_0= ruleDelayRange ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDataGatewayAccess().getDataGatewayKeyword_0());
            		
            // InternalSmartCity.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDataGatewayAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDataGatewayAccess().getPriorityKeyword_3());
            		
            // InternalSmartCity.g:282:3: ( (lv_priority_4_0= RULE_INT ) )
            // InternalSmartCity.g:283:4: (lv_priority_4_0= RULE_INT )
            {
            // InternalSmartCity.g:283:4: (lv_priority_4_0= RULE_INT )
            // InternalSmartCity.g:284:5: lv_priority_4_0= RULE_INT
            {
            lv_priority_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getDataGatewayAccess().getDelayKeyword_5());
            		
            // InternalSmartCity.g:304:3: ( (lv_delay_6_0= ruleDelayRange ) )
            // InternalSmartCity.g:305:4: (lv_delay_6_0= ruleDelayRange )
            {
            // InternalSmartCity.g:305:4: (lv_delay_6_0= ruleDelayRange )
            // InternalSmartCity.g:306:5: lv_delay_6_0= ruleDelayRange
            {

            					newCompositeNode(grammarAccess.getDataGatewayAccess().getDelayDelayRangeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
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
    // InternalSmartCity.g:331:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSmartCity.g:331:45: (iv_ruleNode= ruleNode EOF )
            // InternalSmartCity.g:332:2: iv_ruleNode= ruleNode EOF
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
    // InternalSmartCity.g:338:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_frequency_8_0= ruleFrequency ) ) otherlv_9= 'priority' ( (lv_priority_10_0= RULE_INT ) ) otherlv_11= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_priority_10_0=null;
        Token otherlv_11=null;
        EObject lv_sensors_3_0 = null;

        EObject lv_modules_4_0 = null;

        EObject lv_controller_5_0 = null;

        EObject lv_links_6_0 = null;

        EObject lv_frequency_8_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:344:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_frequency_8_0= ruleFrequency ) ) otherlv_9= 'priority' ( (lv_priority_10_0= RULE_INT ) ) otherlv_11= '}' ) )
            // InternalSmartCity.g:345:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_frequency_8_0= ruleFrequency ) ) otherlv_9= 'priority' ( (lv_priority_10_0= RULE_INT ) ) otherlv_11= '}' )
            {
            // InternalSmartCity.g:345:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_frequency_8_0= ruleFrequency ) ) otherlv_9= 'priority' ( (lv_priority_10_0= RULE_INT ) ) otherlv_11= '}' )
            // InternalSmartCity.g:346:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_modules_4_0= ruleModule ) )* ( (lv_controller_5_0= ruleController ) ) ( (lv_links_6_0= ruleCommunicationLink ) )* otherlv_7= 'postFrequency' ( (lv_frequency_8_0= ruleFrequency ) ) otherlv_9= 'priority' ( (lv_priority_10_0= RULE_INT ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalSmartCity.g:350:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:351:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:351:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:352:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartCity.g:372:3: ( (lv_sensors_3_0= ruleSensor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartCity.g:373:4: (lv_sensors_3_0= ruleSensor )
            	    {
            	    // InternalSmartCity.g:373:4: (lv_sensors_3_0= ruleSensor )
            	    // InternalSmartCity.g:374:5: lv_sensors_3_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getSensorsSensorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop4;
                }
            } while (true);

            // InternalSmartCity.g:391:3: ( (lv_modules_4_0= ruleModule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCity.g:392:4: (lv_modules_4_0= ruleModule )
            	    {
            	    // InternalSmartCity.g:392:4: (lv_modules_4_0= ruleModule )
            	    // InternalSmartCity.g:393:5: lv_modules_4_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getModulesModuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop5;
                }
            } while (true);

            // InternalSmartCity.g:410:3: ( (lv_controller_5_0= ruleController ) )
            // InternalSmartCity.g:411:4: (lv_controller_5_0= ruleController )
            {
            // InternalSmartCity.g:411:4: (lv_controller_5_0= ruleController )
            // InternalSmartCity.g:412:5: lv_controller_5_0= ruleController
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getControllerControllerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalSmartCity.g:429:3: ( (lv_links_6_0= ruleCommunicationLink ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartCity.g:430:4: (lv_links_6_0= ruleCommunicationLink )
            	    {
            	    // InternalSmartCity.g:430:4: (lv_links_6_0= ruleCommunicationLink )
            	    // InternalSmartCity.g:431:5: lv_links_6_0= ruleCommunicationLink
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getLinksCommunicationLinkParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getPostFrequencyKeyword_7());
            		
            // InternalSmartCity.g:452:3: ( (lv_frequency_8_0= ruleFrequency ) )
            // InternalSmartCity.g:453:4: (lv_frequency_8_0= ruleFrequency )
            {
            // InternalSmartCity.g:453:4: (lv_frequency_8_0= ruleFrequency )
            // InternalSmartCity.g:454:5: lv_frequency_8_0= ruleFrequency
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getFrequencyFrequencyParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_frequency_8_0=ruleFrequency();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"frequency",
            						lv_frequency_8_0,
            						"uibk.ac.at.smartcity.SmartCity.Frequency");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getPriorityKeyword_9());
            		
            // InternalSmartCity.g:475:3: ( (lv_priority_10_0= RULE_INT ) )
            // InternalSmartCity.g:476:4: (lv_priority_10_0= RULE_INT )
            {
            // InternalSmartCity.g:476:4: (lv_priority_10_0= RULE_INT )
            // InternalSmartCity.g:477:5: lv_priority_10_0= RULE_INT
            {
            lv_priority_10_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_priority_10_0, grammarAccess.getNodeAccess().getPriorityINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalSmartCity.g:501:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartCity.g:501:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartCity.g:502:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalSmartCity.g:508:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) ;
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
            // InternalSmartCity.g:514:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) )
            // InternalSmartCity.g:515:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            {
            // InternalSmartCity.g:515:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            // InternalSmartCity.g:516:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalSmartCity.g:520:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:521:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:521:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:522:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3());
            		
            // InternalSmartCity.g:546:3: ( (lv_type_4_0= ruleSensorType ) )
            // InternalSmartCity.g:547:4: (lv_type_4_0= ruleSensorType )
            {
            // InternalSmartCity.g:547:4: (lv_type_4_0= ruleSensorType )
            // InternalSmartCity.g:548:5: lv_type_4_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getPriorityKeyword_5());
            		
            // InternalSmartCity.g:569:3: ( (lv_priority_6_0= RULE_INT ) )
            // InternalSmartCity.g:570:4: (lv_priority_6_0= RULE_INT )
            {
            // InternalSmartCity.g:570:4: (lv_priority_6_0= RULE_INT )
            // InternalSmartCity.g:571:5: lv_priority_6_0= RULE_INT
            {
            lv_priority_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            // InternalSmartCity.g:587:3: ( (lv_cyclicActions_7_0= ruleCyclicAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartCity.g:588:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:588:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    // InternalSmartCity.g:589:5: lv_cyclicActions_7_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getCyclicActionsCyclicActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop7;
                }
            } while (true);

            // InternalSmartCity.g:606:3: ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmartCity.g:607:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    {
            	    // InternalSmartCity.g:607:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    // InternalSmartCity.g:608:5: lv_triggeredActions_8_0= ruleTriggeredAction
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getTriggeredActionsTriggeredActionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop8;
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
    // InternalSmartCity.g:633:1: entryRuleCommunicationLink returns [EObject current=null] : iv_ruleCommunicationLink= ruleCommunicationLink EOF ;
    public final EObject entryRuleCommunicationLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationLink = null;


        try {
            // InternalSmartCity.g:633:58: (iv_ruleCommunicationLink= ruleCommunicationLink EOF )
            // InternalSmartCity.g:634:2: iv_ruleCommunicationLink= ruleCommunicationLink EOF
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
    // InternalSmartCity.g:640:1: ruleCommunicationLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) ;
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
            // InternalSmartCity.g:646:2: ( (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' ) )
            // InternalSmartCity.g:647:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            {
            // InternalSmartCity.g:647:2: (otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}' )
            // InternalSmartCity.g:648:3: otherlv_0= 'link' ( (lv_type_1_0= ruleLinkType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'delay' ( (lv_delay_8_0= ruleDelayRange ) ) otherlv_9= 'datatype' ( (lv_datatype_10_0= ruleSensorType ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationLinkAccess().getLinkKeyword_0());
            		
            // InternalSmartCity.g:652:3: ( (lv_type_1_0= ruleLinkType ) )
            // InternalSmartCity.g:653:4: (lv_type_1_0= ruleLinkType )
            {
            // InternalSmartCity.g:653:4: (lv_type_1_0= ruleLinkType )
            // InternalSmartCity.g:654:5: lv_type_1_0= ruleLinkType
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getTypeLinkTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationLinkAccess().getFromKeyword_2());
            		
            // InternalSmartCity.g:675:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartCity.g:676:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartCity.g:676:4: (otherlv_3= RULE_ID )
            // InternalSmartCity.g:677:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getCommunicationLinkAccess().getOriginLinkableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getCommunicationLinkAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalSmartCity.g:692:3: ( (otherlv_5= RULE_ID ) )
            // InternalSmartCity.g:693:4: (otherlv_5= RULE_ID )
            {
            // InternalSmartCity.g:693:4: (otherlv_5= RULE_ID )
            // InternalSmartCity.g:694:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationLinkRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_5, grammarAccess.getCommunicationLinkAccess().getDestinationLinkableCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getCommunicationLinkAccess().getLeftCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getCommunicationLinkAccess().getDelayKeyword_7());
            		
            // InternalSmartCity.g:713:3: ( (lv_delay_8_0= ruleDelayRange ) )
            // InternalSmartCity.g:714:4: (lv_delay_8_0= ruleDelayRange )
            {
            // InternalSmartCity.g:714:4: (lv_delay_8_0= ruleDelayRange )
            // InternalSmartCity.g:715:5: lv_delay_8_0= ruleDelayRange
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getDelayDelayRangeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_9=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getCommunicationLinkAccess().getDatatypeKeyword_9());
            		
            // InternalSmartCity.g:736:3: ( (lv_datatype_10_0= ruleSensorType ) )
            // InternalSmartCity.g:737:4: (lv_datatype_10_0= ruleSensorType )
            {
            // InternalSmartCity.g:737:4: (lv_datatype_10_0= ruleSensorType )
            // InternalSmartCity.g:738:5: lv_datatype_10_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getCommunicationLinkAccess().getDatatypeSensorTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
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
    // InternalSmartCity.g:763:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSmartCity.g:763:51: (iv_ruleController= ruleController EOF )
            // InternalSmartCity.g:764:2: iv_ruleController= ruleController EOF
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
    // InternalSmartCity.g:770:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) ;
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
            // InternalSmartCity.g:776:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' ) )
            // InternalSmartCity.g:777:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            {
            // InternalSmartCity.g:777:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}' )
            // InternalSmartCity.g:778:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) otherlv_5= 'priority' ( (lv_priority_6_0= RULE_INT ) ) ( (lv_cyclicActions_7_0= ruleCyclicAction ) )* ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalSmartCity.g:782:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:783:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:783:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:784:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getTypeKeyword_3());
            		
            // InternalSmartCity.g:808:3: ( (lv_type_4_0= ruleControllerType ) )
            // InternalSmartCity.g:809:4: (lv_type_4_0= ruleControllerType )
            {
            // InternalSmartCity.g:809:4: (lv_type_4_0= ruleControllerType )
            // InternalSmartCity.g:810:5: lv_type_4_0= ruleControllerType
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getTypeControllerTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getPriorityKeyword_5());
            		
            // InternalSmartCity.g:831:3: ( (lv_priority_6_0= RULE_INT ) )
            // InternalSmartCity.g:832:4: (lv_priority_6_0= RULE_INT )
            {
            // InternalSmartCity.g:832:4: (lv_priority_6_0= RULE_INT )
            // InternalSmartCity.g:833:5: lv_priority_6_0= RULE_INT
            {
            lv_priority_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            // InternalSmartCity.g:849:3: ( (lv_cyclicActions_7_0= ruleCyclicAction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmartCity.g:850:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:850:4: (lv_cyclicActions_7_0= ruleCyclicAction )
            	    // InternalSmartCity.g:851:5: lv_cyclicActions_7_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getCyclicActionsCyclicActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop9;
                }
            } while (true);

            // InternalSmartCity.g:868:3: ( (lv_triggeredActions_8_0= ruleTriggeredAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmartCity.g:869:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    {
            	    // InternalSmartCity.g:869:4: (lv_triggeredActions_8_0= ruleTriggeredAction )
            	    // InternalSmartCity.g:870:5: lv_triggeredActions_8_0= ruleTriggeredAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getTriggeredActionsTriggeredActionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop10;
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
    // InternalSmartCity.g:895:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalSmartCity.g:895:47: (iv_ruleModule= ruleModule EOF )
            // InternalSmartCity.g:896:2: iv_ruleModule= ruleModule EOF
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
    // InternalSmartCity.g:902:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' ) ;
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
            // InternalSmartCity.g:908:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' ) )
            // InternalSmartCity.g:909:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' )
            {
            // InternalSmartCity.g:909:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}' )
            // InternalSmartCity.g:910:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= RULE_INT ) ) ( (lv_cyclicActions_5_0= ruleCyclicAction ) )* ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalSmartCity.g:914:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:915:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:915:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:916:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getPriorityKeyword_3());
            		
            // InternalSmartCity.g:940:3: ( (lv_priority_4_0= RULE_INT ) )
            // InternalSmartCity.g:941:4: (lv_priority_4_0= RULE_INT )
            {
            // InternalSmartCity.g:941:4: (lv_priority_4_0= RULE_INT )
            // InternalSmartCity.g:942:5: lv_priority_4_0= RULE_INT
            {
            lv_priority_4_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            // InternalSmartCity.g:958:3: ( (lv_cyclicActions_5_0= ruleCyclicAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmartCity.g:959:4: (lv_cyclicActions_5_0= ruleCyclicAction )
            	    {
            	    // InternalSmartCity.g:959:4: (lv_cyclicActions_5_0= ruleCyclicAction )
            	    // InternalSmartCity.g:960:5: lv_cyclicActions_5_0= ruleCyclicAction
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getCyclicActionsCyclicActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop11;
                }
            } while (true);

            // InternalSmartCity.g:977:3: ( (lv_triggeredActions_6_0= ruleTriggeredAction ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmartCity.g:978:4: (lv_triggeredActions_6_0= ruleTriggeredAction )
            	    {
            	    // InternalSmartCity.g:978:4: (lv_triggeredActions_6_0= ruleTriggeredAction )
            	    // InternalSmartCity.g:979:5: lv_triggeredActions_6_0= ruleTriggeredAction
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getTriggeredActionsTriggeredActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop12;
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


    // $ANTLR start "entryRuleFrequency"
    // InternalSmartCity.g:1004:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalSmartCity.g:1004:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalSmartCity.g:1005:2: iv_ruleFrequency= ruleFrequency EOF
            {
             newCompositeNode(grammarAccess.getFrequencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrequency=ruleFrequency();

            state._fsp--;

             current =iv_ruleFrequency; 
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
    // $ANTLR end "entryRuleFrequency"


    // $ANTLR start "ruleFrequency"
    // InternalSmartCity.g:1011:1: ruleFrequency returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleFrequencyUnit ) ) ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:1017:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleFrequencyUnit ) ) ) )
            // InternalSmartCity.g:1018:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleFrequencyUnit ) ) )
            {
            // InternalSmartCity.g:1018:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleFrequencyUnit ) ) )
            // InternalSmartCity.g:1019:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleFrequencyUnit ) )
            {
            // InternalSmartCity.g:1019:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalSmartCity.g:1020:4: (lv_value_0_0= RULE_INT )
            {
            // InternalSmartCity.g:1020:4: (lv_value_0_0= RULE_INT )
            // InternalSmartCity.g:1021:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_value_0_0, grammarAccess.getFrequencyAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrequencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartCity.g:1037:3: ( (lv_unit_1_0= ruleFrequencyUnit ) )
            // InternalSmartCity.g:1038:4: (lv_unit_1_0= ruleFrequencyUnit )
            {
            // InternalSmartCity.g:1038:4: (lv_unit_1_0= ruleFrequencyUnit )
            // InternalSmartCity.g:1039:5: lv_unit_1_0= ruleFrequencyUnit
            {

            					newCompositeNode(grammarAccess.getFrequencyAccess().getUnitFrequencyUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleFrequencyUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrequencyRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_1_0,
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
    // $ANTLR end "ruleFrequency"


    // $ANTLR start "entryRuleDelayRange"
    // InternalSmartCity.g:1060:1: entryRuleDelayRange returns [EObject current=null] : iv_ruleDelayRange= ruleDelayRange EOF ;
    public final EObject entryRuleDelayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayRange = null;


        try {
            // InternalSmartCity.g:1060:51: (iv_ruleDelayRange= ruleDelayRange EOF )
            // InternalSmartCity.g:1061:2: iv_ruleDelayRange= ruleDelayRange EOF
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
    // InternalSmartCity.g:1067:1: ruleDelayRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleDelayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1073:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalSmartCity.g:1074:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalSmartCity.g:1074:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalSmartCity.g:1075:3: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSmartCity.g:1079:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalSmartCity.g:1080:4: (lv_min_1_0= RULE_INT )
            {
            // InternalSmartCity.g:1080:4: (lv_min_1_0= RULE_INT )
            // InternalSmartCity.g:1081:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDelayRangeAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSmartCity.g:1101:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalSmartCity.g:1102:4: (lv_max_3_0= RULE_INT )
            {
            // InternalSmartCity.g:1102:4: (lv_max_3_0= RULE_INT )
            // InternalSmartCity.g:1103:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalSmartCity.g:1127:1: entryRuleCyclicAction returns [EObject current=null] : iv_ruleCyclicAction= ruleCyclicAction EOF ;
    public final EObject entryRuleCyclicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCyclicAction = null;


        try {
            // InternalSmartCity.g:1127:53: (iv_ruleCyclicAction= ruleCyclicAction EOF )
            // InternalSmartCity.g:1128:2: iv_ruleCyclicAction= ruleCyclicAction EOF
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
    // InternalSmartCity.g:1134:1: ruleCyclicAction returns [EObject current=null] : (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_frequency_3_0= ruleFrequency ) ) ) ;
    public final EObject ruleCyclicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_frequency_3_0 = null;



        	enterRule();

        try {
            // InternalSmartCity.g:1140:2: ( (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_frequency_3_0= ruleFrequency ) ) ) )
            // InternalSmartCity.g:1141:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_frequency_3_0= ruleFrequency ) ) )
            {
            // InternalSmartCity.g:1141:2: (otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_frequency_3_0= ruleFrequency ) ) )
            // InternalSmartCity.g:1142:3: otherlv_0= 'cyclicAction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'frequency' ( (lv_frequency_3_0= ruleFrequency ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCyclicActionAccess().getCyclicActionKeyword_0());
            		
            // InternalSmartCity.g:1146:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:1147:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:1147:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:1148:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCyclicActionAccess().getFrequencyKeyword_2());
            		
            // InternalSmartCity.g:1168:3: ( (lv_frequency_3_0= ruleFrequency ) )
            // InternalSmartCity.g:1169:4: (lv_frequency_3_0= ruleFrequency )
            {
            // InternalSmartCity.g:1169:4: (lv_frequency_3_0= ruleFrequency )
            // InternalSmartCity.g:1170:5: lv_frequency_3_0= ruleFrequency
            {

            					newCompositeNode(grammarAccess.getCyclicActionAccess().getFrequencyFrequencyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_frequency_3_0=ruleFrequency();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCyclicActionRule());
            					}
            					set(
            						current,
            						"frequency",
            						lv_frequency_3_0,
            						"uibk.ac.at.smartcity.SmartCity.Frequency");
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
    // InternalSmartCity.g:1191:1: entryRuleTriggeredAction returns [EObject current=null] : iv_ruleTriggeredAction= ruleTriggeredAction EOF ;
    public final EObject entryRuleTriggeredAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggeredAction = null;


        try {
            // InternalSmartCity.g:1191:56: (iv_ruleTriggeredAction= ruleTriggeredAction EOF )
            // InternalSmartCity.g:1192:2: iv_ruleTriggeredAction= ruleTriggeredAction EOF
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
    // InternalSmartCity.g:1198:1: ruleTriggeredAction returns [EObject current=null] : (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTriggeredAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1204:2: ( (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmartCity.g:1205:2: (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmartCity.g:1205:2: (otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmartCity.g:1206:3: otherlv_0= 'TriggeredAction' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggeredActionAccess().getTriggeredActionKeyword_0());
            		
            // InternalSmartCity.g:1210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartCity.g:1211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartCity.g:1211:4: (lv_name_1_0= RULE_ID )
            // InternalSmartCity.g:1212:5: lv_name_1_0= RULE_ID
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
    // InternalSmartCity.g:1232:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) ) ;
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
            // InternalSmartCity.g:1238:2: ( ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) ) )
            // InternalSmartCity.g:1239:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) )
            {
            // InternalSmartCity.g:1239:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PH' ) | (enumLiteral_2= 'TURBIDITY' ) | (enumLiteral_3= 'TDS' ) | (enumLiteral_4= 'CURRENT' ) | (enumLiteral_5= 'PULSE' ) | (enumLiteral_6= 'ULTRASONIC' ) | (enumLiteral_7= 'CAMERA' ) | (enumLiteral_8= 'GSM' ) )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 37:
                {
                alt13=3;
                }
                break;
            case 38:
                {
                alt13=4;
                }
                break;
            case 39:
                {
                alt13=5;
                }
                break;
            case 40:
                {
                alt13=6;
                }
                break;
            case 41:
                {
                alt13=7;
                }
                break;
            case 42:
                {
                alt13=8;
                }
                break;
            case 43:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSmartCity.g:1240:3: (enumLiteral_0= 'TEMPERATURE' )
                    {
                    // InternalSmartCity.g:1240:3: (enumLiteral_0= 'TEMPERATURE' )
                    // InternalSmartCity.g:1241:4: enumLiteral_0= 'TEMPERATURE'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1248:3: (enumLiteral_1= 'PH' )
                    {
                    // InternalSmartCity.g:1248:3: (enumLiteral_1= 'PH' )
                    // InternalSmartCity.g:1249:4: enumLiteral_1= 'PH'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1256:3: (enumLiteral_2= 'TURBIDITY' )
                    {
                    // InternalSmartCity.g:1256:3: (enumLiteral_2= 'TURBIDITY' )
                    // InternalSmartCity.g:1257:4: enumLiteral_2= 'TURBIDITY'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1264:3: (enumLiteral_3= 'TDS' )
                    {
                    // InternalSmartCity.g:1264:3: (enumLiteral_3= 'TDS' )
                    // InternalSmartCity.g:1265:4: enumLiteral_3= 'TDS'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1272:3: (enumLiteral_4= 'CURRENT' )
                    {
                    // InternalSmartCity.g:1272:3: (enumLiteral_4= 'CURRENT' )
                    // InternalSmartCity.g:1273:4: enumLiteral_4= 'CURRENT'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1280:3: (enumLiteral_5= 'PULSE' )
                    {
                    // InternalSmartCity.g:1280:3: (enumLiteral_5= 'PULSE' )
                    // InternalSmartCity.g:1281:4: enumLiteral_5= 'PULSE'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCity.g:1288:3: (enumLiteral_6= 'ULTRASONIC' )
                    {
                    // InternalSmartCity.g:1288:3: (enumLiteral_6= 'ULTRASONIC' )
                    // InternalSmartCity.g:1289:4: enumLiteral_6= 'ULTRASONIC'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSmartCity.g:1296:3: (enumLiteral_7= 'CAMERA' )
                    {
                    // InternalSmartCity.g:1296:3: (enumLiteral_7= 'CAMERA' )
                    // InternalSmartCity.g:1297:4: enumLiteral_7= 'CAMERA'
                    {
                    enumLiteral_7=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSmartCity.g:1304:3: (enumLiteral_8= 'GSM' )
                    {
                    // InternalSmartCity.g:1304:3: (enumLiteral_8= 'GSM' )
                    // InternalSmartCity.g:1305:4: enumLiteral_8= 'GSM'
                    {
                    enumLiteral_8=(Token)match(input,43,FOLLOW_2); 

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
    // InternalSmartCity.g:1315:1: ruleControllerType returns [Enumerator current=null] : ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) ) ;
    public final Enumerator ruleControllerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1321:2: ( ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) ) )
            // InternalSmartCity.g:1322:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) )
            {
            // InternalSmartCity.g:1322:2: ( (enumLiteral_0= 'ESP32' ) | (enumLiteral_1= 'RASPBERRY_PI' ) | (enumLiteral_2= 'OTHER' ) )
            int alt14=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSmartCity.g:1323:3: (enumLiteral_0= 'ESP32' )
                    {
                    // InternalSmartCity.g:1323:3: (enumLiteral_0= 'ESP32' )
                    // InternalSmartCity.g:1324:4: enumLiteral_0= 'ESP32'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getControllerTypeAccess().getESP32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1331:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    {
                    // InternalSmartCity.g:1331:3: (enumLiteral_1= 'RASPBERRY_PI' )
                    // InternalSmartCity.g:1332:4: enumLiteral_1= 'RASPBERRY_PI'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getControllerTypeAccess().getRASPBERRY_PIEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1339:3: (enumLiteral_2= 'OTHER' )
                    {
                    // InternalSmartCity.g:1339:3: (enumLiteral_2= 'OTHER' )
                    // InternalSmartCity.g:1340:4: enumLiteral_2= 'OTHER'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

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
    // InternalSmartCity.g:1350:1: ruleLinkType returns [Enumerator current=null] : ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmartCity.g:1356:2: ( ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) ) )
            // InternalSmartCity.g:1357:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) )
            {
            // InternalSmartCity.g:1357:2: ( (enumLiteral_0= 'UART' ) | (enumLiteral_1= 'ADC' ) | (enumLiteral_2= 'SPI' ) | (enumLiteral_3= 'CSI' ) | (enumLiteral_4= 'HTTPS' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt15=1;
                }
                break;
            case 48:
                {
                alt15=2;
                }
                break;
            case 49:
                {
                alt15=3;
                }
                break;
            case 50:
                {
                alt15=4;
                }
                break;
            case 51:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSmartCity.g:1358:3: (enumLiteral_0= 'UART' )
                    {
                    // InternalSmartCity.g:1358:3: (enumLiteral_0= 'UART' )
                    // InternalSmartCity.g:1359:4: enumLiteral_0= 'UART'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1366:3: (enumLiteral_1= 'ADC' )
                    {
                    // InternalSmartCity.g:1366:3: (enumLiteral_1= 'ADC' )
                    // InternalSmartCity.g:1367:4: enumLiteral_1= 'ADC'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1374:3: (enumLiteral_2= 'SPI' )
                    {
                    // InternalSmartCity.g:1374:3: (enumLiteral_2= 'SPI' )
                    // InternalSmartCity.g:1375:4: enumLiteral_2= 'SPI'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1382:3: (enumLiteral_3= 'CSI' )
                    {
                    // InternalSmartCity.g:1382:3: (enumLiteral_3= 'CSI' )
                    // InternalSmartCity.g:1383:4: enumLiteral_3= 'CSI'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1390:3: (enumLiteral_4= 'HTTPS' )
                    {
                    // InternalSmartCity.g:1390:3: (enumLiteral_4= 'HTTPS' )
                    // InternalSmartCity.g:1391:4: enumLiteral_4= 'HTTPS'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

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
    // InternalSmartCity.g:1401:1: ruleFrequencyUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) ;
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
            // InternalSmartCity.g:1407:2: ( ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) ) )
            // InternalSmartCity.g:1408:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            {
            // InternalSmartCity.g:1408:2: ( (enumLiteral_0= 'HERTZ' ) | (enumLiteral_1= 'SECONDS' ) | (enumLiteral_2= 'MINUTES' ) | (enumLiteral_3= 'HOURS' ) | (enumLiteral_4= 'DAYS' ) | (enumLiteral_5= 'INF' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt16=1;
                }
                break;
            case 53:
                {
                alt16=2;
                }
                break;
            case 54:
                {
                alt16=3;
                }
                break;
            case 55:
                {
                alt16=4;
                }
                break;
            case 56:
                {
                alt16=5;
                }
                break;
            case 57:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSmartCity.g:1409:3: (enumLiteral_0= 'HERTZ' )
                    {
                    // InternalSmartCity.g:1409:3: (enumLiteral_0= 'HERTZ' )
                    // InternalSmartCity.g:1410:4: enumLiteral_0= 'HERTZ'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrequencyUnitAccess().getHERTZEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:1417:3: (enumLiteral_1= 'SECONDS' )
                    {
                    // InternalSmartCity.g:1417:3: (enumLiteral_1= 'SECONDS' )
                    // InternalSmartCity.g:1418:4: enumLiteral_1= 'SECONDS'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrequencyUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:1425:3: (enumLiteral_2= 'MINUTES' )
                    {
                    // InternalSmartCity.g:1425:3: (enumLiteral_2= 'MINUTES' )
                    // InternalSmartCity.g:1426:4: enumLiteral_2= 'MINUTES'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrequencyUnitAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:1433:3: (enumLiteral_3= 'HOURS' )
                    {
                    // InternalSmartCity.g:1433:3: (enumLiteral_3= 'HOURS' )
                    // InternalSmartCity.g:1434:4: enumLiteral_3= 'HOURS'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrequencyUnitAccess().getHOURSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:1441:3: (enumLiteral_4= 'DAYS' )
                    {
                    // InternalSmartCity.g:1441:3: (enumLiteral_4= 'DAYS' )
                    // InternalSmartCity.g:1442:4: enumLiteral_4= 'DAYS'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFrequencyUnitAccess().getDAYSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:1449:3: (enumLiteral_5= 'INF' )
                    {
                    // InternalSmartCity.g:1449:3: (enumLiteral_5= 'INF' )
                    // InternalSmartCity.g:1450:4: enumLiteral_5= 'INF'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000FF800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000500008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});

}