package org.smartcitymodel.parser.antlr.internal;

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
import org.smartcitymodel.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_COMP", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sensor'", "'{'", "'}'", "'actor'", "'controller'", "'structure'", "'property'", "'port'", "'direction'", "'type'", "'unit'", "'location'", "'longitude'", "'degrees'", "'latitude'", "'altitude'", "'meters'", "'frequency'", "'every'", "'action'", "'if'", "'then'", "';'", "'set'", "'to'", "'service'", "'connection'", "'->'", "'::'", "'.'", "'true'", "'false'", "'in'", "'out'", "'float'", "'integer'", "'string'", "'bool'", "'cd'", "'C'", "'s'", "'m'", "'h'", "'d'", "'r'", "'w'", "'rw'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
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
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_COMP=6;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SmartCityModel";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmartCityModel"
    // InternalDsl.g:65:1: entryRuleSmartCityModel returns [EObject current=null] : iv_ruleSmartCityModel= ruleSmartCityModel EOF ;
    public final EObject entryRuleSmartCityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartCityModel = null;


        try {
            // InternalDsl.g:65:55: (iv_ruleSmartCityModel= ruleSmartCityModel EOF )
            // InternalDsl.g:66:2: iv_ruleSmartCityModel= ruleSmartCityModel EOF
            {
             newCompositeNode(grammarAccess.getSmartCityModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartCityModel=ruleSmartCityModel();

            state._fsp--;

             current =iv_ruleSmartCityModel; 
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
    // $ANTLR end "entryRuleSmartCityModel"


    // $ANTLR start "ruleSmartCityModel"
    // InternalDsl.g:72:1: ruleSmartCityModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_connections_1_0= ruleConnection ) )* ) ;
    public final EObject ruleSmartCityModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_connections_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_connections_1_0= ruleConnection ) )* ) )
            // InternalDsl.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_connections_1_0= ruleConnection ) )* )
            {
            // InternalDsl.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_connections_1_0= ruleConnection ) )* )
            // InternalDsl.g:80:3: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_connections_1_0= ruleConnection ) )*
            {
            // InternalDsl.g:80:3: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:81:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalDsl.g:81:4: (lv_entities_0_0= ruleEntity )
            	    // InternalDsl.g:82:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSmartCityModelAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmartCityModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"org.smartcitymodel.Dsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:99:3: ( (lv_connections_1_0= ruleConnection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:100:4: (lv_connections_1_0= ruleConnection )
            	    {
            	    // InternalDsl.g:100:4: (lv_connections_1_0= ruleConnection )
            	    // InternalDsl.g:101:5: lv_connections_1_0= ruleConnection
            	    {

            	    					newCompositeNode(grammarAccess.getSmartCityModelAccess().getConnectionsConnectionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_connections_1_0=ruleConnection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmartCityModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connections",
            	    						lv_connections_1_0,
            	    						"org.smartcitymodel.Dsl.Connection");
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
    // $ANTLR end "ruleSmartCityModel"


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:122:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDsl.g:122:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDsl.g:123:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:129:1: ruleEntity returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actor_1= ruleActor | this_Controller_2= ruleController | this_CompoundEntity_3= ruleCompoundEntity ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actor_1 = null;

        EObject this_Controller_2 = null;

        EObject this_CompoundEntity_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:135:2: ( (this_Sensor_0= ruleSensor | this_Actor_1= ruleActor | this_Controller_2= ruleController | this_CompoundEntity_3= ruleCompoundEntity ) )
            // InternalDsl.g:136:2: (this_Sensor_0= ruleSensor | this_Actor_1= ruleActor | this_Controller_2= ruleController | this_CompoundEntity_3= ruleCompoundEntity )
            {
            // InternalDsl.g:136:2: (this_Sensor_0= ruleSensor | this_Actor_1= ruleActor | this_Controller_2= ruleController | this_CompoundEntity_3= ruleCompoundEntity )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:137:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:146:3: this_Actor_1= ruleActor
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actor_1=ruleActor();

                    state._fsp--;


                    			current = this_Actor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:155:3: this_Controller_2= ruleController
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getControllerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Controller_2=ruleController();

                    state._fsp--;


                    			current = this_Controller_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:164:3: this_CompoundEntity_3= ruleCompoundEntity
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getCompoundEntityParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundEntity_3=ruleCompoundEntity();

                    state._fsp--;


                    			current = this_CompoundEntity_3;
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:176:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDsl.g:176:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDsl.g:177:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalDsl.g:183:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_frequency_5_0= ruleFrequency ) )? ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_properties_3_0 = null;

        EObject lv_ports_4_0 = null;

        EObject lv_frequency_5_0 = null;

        EObject lv_location_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:189:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_frequency_5_0= ruleFrequency ) )? ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' ) )
            // InternalDsl.g:190:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_frequency_5_0= ruleFrequency ) )? ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' )
            {
            // InternalDsl.g:190:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_frequency_5_0= ruleFrequency ) )? ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' )
            // InternalDsl.g:191:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_frequency_5_0= ruleFrequency ) )? ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalDsl.g:195:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:196:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:196:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:197:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:217:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:218:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:218:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:219:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.smartcitymodel.Dsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDsl.g:236:3: ( (lv_ports_4_0= rulePort ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:237:4: (lv_ports_4_0= rulePort )
            	    {
            	    // InternalDsl.g:237:4: (lv_ports_4_0= rulePort )
            	    // InternalDsl.g:238:5: lv_ports_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getPortsPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ports_4_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ports",
            	    						lv_ports_4_0,
            	    						"org.smartcitymodel.Dsl.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            // InternalDsl.g:255:3: ( (lv_frequency_5_0= ruleFrequency ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:256:4: (lv_frequency_5_0= ruleFrequency )
                    {
                    // InternalDsl.g:256:4: (lv_frequency_5_0= ruleFrequency )
                    // InternalDsl.g:257:5: lv_frequency_5_0= ruleFrequency
                    {

                    					newCompositeNode(grammarAccess.getSensorAccess().getFrequencyFrequencyParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_frequency_5_0=ruleFrequency();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSensorRule());
                    					}
                    					set(
                    						current,
                    						"frequency",
                    						lv_frequency_5_0,
                    						"org.smartcitymodel.Dsl.Frequency");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:274:3: ( (lv_location_6_0= ruleLocation ) )
            // InternalDsl.g:275:4: (lv_location_6_0= ruleLocation )
            {
            // InternalDsl.g:275:4: (lv_location_6_0= ruleLocation )
            // InternalDsl.g:276:5: lv_location_6_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getLocationLocationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_location_6_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_6_0,
            						"org.smartcitymodel.Dsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleActor"
    // InternalDsl.g:301:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalDsl.g:301:46: (iv_ruleActor= ruleActor EOF )
            // InternalDsl.g:302:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalDsl.g:308:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_properties_3_0 = null;

        EObject lv_ports_4_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_location_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:314:2: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' ) )
            // InternalDsl.g:315:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' )
            {
            // InternalDsl.g:315:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}' )
            // InternalDsl.g:316:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_location_6_0= ruleLocation ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalDsl.g:320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:321:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:322:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:342:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:343:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:343:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:344:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.smartcitymodel.Dsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDsl.g:361:3: ( (lv_ports_4_0= rulePort ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:362:4: (lv_ports_4_0= rulePort )
            	    {
            	    // InternalDsl.g:362:4: (lv_ports_4_0= rulePort )
            	    // InternalDsl.g:363:5: lv_ports_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getPortsPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ports_4_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ports",
            	    						lv_ports_4_0,
            	    						"org.smartcitymodel.Dsl.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            // InternalDsl.g:380:3: ( (lv_actions_5_0= ruleAction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:381:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalDsl.g:381:4: (lv_actions_5_0= ruleAction )
            	    // InternalDsl.g:382:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"org.smartcitymodel.Dsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalDsl.g:399:3: ( (lv_location_6_0= ruleLocation ) )
            // InternalDsl.g:400:4: (lv_location_6_0= ruleLocation )
            {
            // InternalDsl.g:400:4: (lv_location_6_0= ruleLocation )
            // InternalDsl.g:401:5: lv_location_6_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getActorAccess().getLocationLocationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_location_6_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_6_0,
            						"org.smartcitymodel.Dsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleController"
    // InternalDsl.g:426:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalDsl.g:426:51: (iv_ruleController= ruleController EOF )
            // InternalDsl.g:427:2: iv_ruleController= ruleController EOF
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
    // InternalDsl.g:433:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_services_6_0= ruleService ) )* ( (lv_location_7_0= ruleLocation ) ) otherlv_8= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_properties_3_0 = null;

        EObject lv_ports_4_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_services_6_0 = null;

        EObject lv_location_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:439:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_services_6_0= ruleService ) )* ( (lv_location_7_0= ruleLocation ) ) otherlv_8= '}' ) )
            // InternalDsl.g:440:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_services_6_0= ruleService ) )* ( (lv_location_7_0= ruleLocation ) ) otherlv_8= '}' )
            {
            // InternalDsl.g:440:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_services_6_0= ruleService ) )* ( (lv_location_7_0= ruleLocation ) ) otherlv_8= '}' )
            // InternalDsl.g:441:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_ports_4_0= rulePort ) )+ ( (lv_actions_5_0= ruleAction ) )* ( (lv_services_6_0= ruleService ) )* ( (lv_location_7_0= ruleLocation ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalDsl.g:445:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:446:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:446:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:447:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:467:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:468:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:468:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:469:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.smartcitymodel.Dsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalDsl.g:486:3: ( (lv_ports_4_0= rulePort ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:487:4: (lv_ports_4_0= rulePort )
            	    {
            	    // InternalDsl.g:487:4: (lv_ports_4_0= rulePort )
            	    // InternalDsl.g:488:5: lv_ports_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getPortsPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_ports_4_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ports",
            	    						lv_ports_4_0,
            	    						"org.smartcitymodel.Dsl.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalDsl.g:505:3: ( (lv_actions_5_0= ruleAction ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:506:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalDsl.g:506:4: (lv_actions_5_0= ruleAction )
            	    // InternalDsl.g:507:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"org.smartcitymodel.Dsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalDsl.g:524:3: ( (lv_services_6_0= ruleService ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:525:4: (lv_services_6_0= ruleService )
            	    {
            	    // InternalDsl.g:525:4: (lv_services_6_0= ruleService )
            	    // InternalDsl.g:526:5: lv_services_6_0= ruleService
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getServicesServiceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_services_6_0=ruleService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_6_0,
            	    						"org.smartcitymodel.Dsl.Service");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalDsl.g:543:3: ( (lv_location_7_0= ruleLocation ) )
            // InternalDsl.g:544:4: (lv_location_7_0= ruleLocation )
            {
            // InternalDsl.g:544:4: (lv_location_7_0= ruleLocation )
            // InternalDsl.g:545:5: lv_location_7_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getLocationLocationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_location_7_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_7_0,
            						"org.smartcitymodel.Dsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleCompoundEntity"
    // InternalDsl.g:570:1: entryRuleCompoundEntity returns [EObject current=null] : iv_ruleCompoundEntity= ruleCompoundEntity EOF ;
    public final EObject entryRuleCompoundEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundEntity = null;


        try {
            // InternalDsl.g:570:55: (iv_ruleCompoundEntity= ruleCompoundEntity EOF )
            // InternalDsl.g:571:2: iv_ruleCompoundEntity= ruleCompoundEntity EOF
            {
             newCompositeNode(grammarAccess.getCompoundEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundEntity=ruleCompoundEntity();

            state._fsp--;

             current =iv_ruleCompoundEntity; 
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
    // $ANTLR end "entryRuleCompoundEntity"


    // $ANTLR start "ruleCompoundEntity"
    // InternalDsl.g:577:1: ruleCompoundEntity returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_actors_4_0= ruleActor ) )* otherlv_5= '}' ) ;
    public final EObject ruleCompoundEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_sensors_3_0 = null;

        EObject lv_actors_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:583:2: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_actors_4_0= ruleActor ) )* otherlv_5= '}' ) )
            // InternalDsl.g:584:2: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_actors_4_0= ruleActor ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:584:2: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_actors_4_0= ruleActor ) )* otherlv_5= '}' )
            // InternalDsl.g:585:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sensors_3_0= ruleSensor ) )* ( (lv_actors_4_0= ruleActor ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundEntityAccess().getStructureKeyword_0());
            		
            // InternalDsl.g:589:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:590:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:590:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:591:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompoundEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompoundEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCompoundEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:611:3: ( (lv_sensors_3_0= ruleSensor ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:612:4: (lv_sensors_3_0= ruleSensor )
            	    {
            	    // InternalDsl.g:612:4: (lv_sensors_3_0= ruleSensor )
            	    // InternalDsl.g:613:5: lv_sensors_3_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getCompoundEntityAccess().getSensorsSensorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_sensors_3_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompoundEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_3_0,
            	    						"org.smartcitymodel.Dsl.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalDsl.g:630:3: ( (lv_actors_4_0= ruleActor ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:631:4: (lv_actors_4_0= ruleActor )
            	    {
            	    // InternalDsl.g:631:4: (lv_actors_4_0= ruleActor )
            	    // InternalDsl.g:632:5: lv_actors_4_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getCompoundEntityAccess().getActorsActorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_actors_4_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompoundEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_4_0,
            	    						"org.smartcitymodel.Dsl.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCompoundEntityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCompoundEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalDsl.g:657:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDsl.g:657:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDsl.g:658:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDsl.g:664:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= ruleTYPE ) ) ( (lv_access_4_0= ruleACCESS ) ) otherlv_5= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_access_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:670:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= ruleTYPE ) ) ( (lv_access_4_0= ruleACCESS ) ) otherlv_5= '}' ) )
            // InternalDsl.g:671:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= ruleTYPE ) ) ( (lv_access_4_0= ruleACCESS ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:671:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= ruleTYPE ) ) ( (lv_access_4_0= ruleACCESS ) ) otherlv_5= '}' )
            // InternalDsl.g:672:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= ruleTYPE ) ) ( (lv_access_4_0= ruleACCESS ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
            		
            // InternalDsl.g:676:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:677:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:677:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:678:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:698:3: ( (lv_type_3_0= ruleTYPE ) )
            // InternalDsl.g:699:4: (lv_type_3_0= ruleTYPE )
            {
            // InternalDsl.g:699:4: (lv_type_3_0= ruleTYPE )
            // InternalDsl.g:700:5: lv_type_3_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTYPEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.smartcitymodel.Dsl.TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:717:3: ( (lv_access_4_0= ruleACCESS ) )
            // InternalDsl.g:718:4: (lv_access_4_0= ruleACCESS )
            {
            // InternalDsl.g:718:4: (lv_access_4_0= ruleACCESS )
            // InternalDsl.g:719:5: lv_access_4_0= ruleACCESS
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getAccessACCESSEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_access_4_0=ruleACCESS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"access",
            						lv_access_4_0,
            						"org.smartcitymodel.Dsl.ACCESS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePort"
    // InternalDsl.g:744:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDsl.g:744:45: (iv_rulePort= rulePort EOF )
            // InternalDsl.g:745:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDsl.g:751:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_id_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleTYPE ) ) otherlv_7= 'unit' ( (lv_unit_8_0= ruleUNIT ) ) otherlv_9= '}' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_direction_4_0 = null;

        Enumerator lv_type_6_0 = null;

        Enumerator lv_unit_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:757:2: ( (otherlv_0= 'port' ( (lv_id_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleTYPE ) ) otherlv_7= 'unit' ( (lv_unit_8_0= ruleUNIT ) ) otherlv_9= '}' ) )
            // InternalDsl.g:758:2: (otherlv_0= 'port' ( (lv_id_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleTYPE ) ) otherlv_7= 'unit' ( (lv_unit_8_0= ruleUNIT ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:758:2: (otherlv_0= 'port' ( (lv_id_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleTYPE ) ) otherlv_7= 'unit' ( (lv_unit_8_0= ruleUNIT ) ) otherlv_9= '}' )
            // InternalDsl.g:759:3: otherlv_0= 'port' ( (lv_id_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleTYPE ) ) otherlv_7= 'unit' ( (lv_unit_8_0= ruleUNIT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalDsl.g:763:3: ( (lv_id_1_0= RULE_INT ) )
            // InternalDsl.g:764:4: (lv_id_1_0= RULE_INT )
            {
            // InternalDsl.g:764:4: (lv_id_1_0= RULE_INT )
            // InternalDsl.g:765:5: lv_id_1_0= RULE_INT
            {
            lv_id_1_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_id_1_0, grammarAccess.getPortAccess().getIdINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getDirectionKeyword_3());
            		
            // InternalDsl.g:789:3: ( (lv_direction_4_0= ruleDIRECTION ) )
            // InternalDsl.g:790:4: (lv_direction_4_0= ruleDIRECTION )
            {
            // InternalDsl.g:790:4: (lv_direction_4_0= ruleDIRECTION )
            // InternalDsl.g:791:5: lv_direction_4_0= ruleDIRECTION
            {

            					newCompositeNode(grammarAccess.getPortAccess().getDirectionDIRECTIONEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_direction_4_0=ruleDIRECTION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_4_0,
            						"org.smartcitymodel.Dsl.DIRECTION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getPortAccess().getTypeKeyword_5());
            		
            // InternalDsl.g:812:3: ( (lv_type_6_0= ruleTYPE ) )
            // InternalDsl.g:813:4: (lv_type_6_0= ruleTYPE )
            {
            // InternalDsl.g:813:4: (lv_type_6_0= ruleTYPE )
            // InternalDsl.g:814:5: lv_type_6_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getPortAccess().getTypeTYPEEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_type_6_0=ruleTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"org.smartcitymodel.Dsl.TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getPortAccess().getUnitKeyword_7());
            		
            // InternalDsl.g:835:3: ( (lv_unit_8_0= ruleUNIT ) )
            // InternalDsl.g:836:4: (lv_unit_8_0= ruleUNIT )
            {
            // InternalDsl.g:836:4: (lv_unit_8_0= ruleUNIT )
            // InternalDsl.g:837:5: lv_unit_8_0= ruleUNIT
            {

            					newCompositeNode(grammarAccess.getPortAccess().getUnitUNITEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_unit_8_0=ruleUNIT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_8_0,
            						"org.smartcitymodel.Dsl.UNIT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleLocation"
    // InternalDsl.g:862:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalDsl.g:862:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalDsl.g:863:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalDsl.g:869:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'location' otherlv_1= '{' otherlv_2= 'longitude' ( (lv_longitude_3_0= ruleFLOAT ) ) otherlv_4= 'degrees' otherlv_5= 'latitude' ( (lv_latitude_6_0= ruleFLOAT ) ) otherlv_7= 'degrees' otherlv_8= 'altitude' ( (lv_altitude_9_0= ruleFLOAT ) ) otherlv_10= 'meters' otherlv_11= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_longitude_3_0 = null;

        AntlrDatatypeRuleToken lv_latitude_6_0 = null;

        AntlrDatatypeRuleToken lv_altitude_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:875:2: ( (otherlv_0= 'location' otherlv_1= '{' otherlv_2= 'longitude' ( (lv_longitude_3_0= ruleFLOAT ) ) otherlv_4= 'degrees' otherlv_5= 'latitude' ( (lv_latitude_6_0= ruleFLOAT ) ) otherlv_7= 'degrees' otherlv_8= 'altitude' ( (lv_altitude_9_0= ruleFLOAT ) ) otherlv_10= 'meters' otherlv_11= '}' ) )
            // InternalDsl.g:876:2: (otherlv_0= 'location' otherlv_1= '{' otherlv_2= 'longitude' ( (lv_longitude_3_0= ruleFLOAT ) ) otherlv_4= 'degrees' otherlv_5= 'latitude' ( (lv_latitude_6_0= ruleFLOAT ) ) otherlv_7= 'degrees' otherlv_8= 'altitude' ( (lv_altitude_9_0= ruleFLOAT ) ) otherlv_10= 'meters' otherlv_11= '}' )
            {
            // InternalDsl.g:876:2: (otherlv_0= 'location' otherlv_1= '{' otherlv_2= 'longitude' ( (lv_longitude_3_0= ruleFLOAT ) ) otherlv_4= 'degrees' otherlv_5= 'latitude' ( (lv_latitude_6_0= ruleFLOAT ) ) otherlv_7= 'degrees' otherlv_8= 'altitude' ( (lv_altitude_9_0= ruleFLOAT ) ) otherlv_10= 'meters' otherlv_11= '}' )
            // InternalDsl.g:877:3: otherlv_0= 'location' otherlv_1= '{' otherlv_2= 'longitude' ( (lv_longitude_3_0= ruleFLOAT ) ) otherlv_4= 'degrees' otherlv_5= 'latitude' ( (lv_latitude_6_0= ruleFLOAT ) ) otherlv_7= 'degrees' otherlv_8= 'altitude' ( (lv_altitude_9_0= ruleFLOAT ) ) otherlv_10= 'meters' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLongitudeKeyword_2());
            		
            // InternalDsl.g:889:3: ( (lv_longitude_3_0= ruleFLOAT ) )
            // InternalDsl.g:890:4: (lv_longitude_3_0= ruleFLOAT )
            {
            // InternalDsl.g:890:4: (lv_longitude_3_0= ruleFLOAT )
            // InternalDsl.g:891:5: lv_longitude_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLongitudeFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_longitude_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"longitude",
            						lv_longitude_3_0,
            						"org.smartcitymodel.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getDegreesKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getLatitudeKeyword_5());
            		
            // InternalDsl.g:916:3: ( (lv_latitude_6_0= ruleFLOAT ) )
            // InternalDsl.g:917:4: (lv_latitude_6_0= ruleFLOAT )
            {
            // InternalDsl.g:917:4: (lv_latitude_6_0= ruleFLOAT )
            // InternalDsl.g:918:5: lv_latitude_6_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLatitudeFLOATParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_latitude_6_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"latitude",
            						lv_latitude_6_0,
            						"org.smartcitymodel.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getDegreesKeyword_7());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getLocationAccess().getAltitudeKeyword_8());
            		
            // InternalDsl.g:943:3: ( (lv_altitude_9_0= ruleFLOAT ) )
            // InternalDsl.g:944:4: (lv_altitude_9_0= ruleFLOAT )
            {
            // InternalDsl.g:944:4: (lv_altitude_9_0= ruleFLOAT )
            // InternalDsl.g:945:5: lv_altitude_9_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getAltitudeFLOATParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_30);
            lv_altitude_9_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"altitude",
            						lv_altitude_9_0,
            						"org.smartcitymodel.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getLocationAccess().getMetersKeyword_10());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleFrequency"
    // InternalDsl.g:974:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalDsl.g:974:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalDsl.g:975:2: iv_ruleFrequency= ruleFrequency EOF
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
    // InternalDsl.g:981:1: ruleFrequency returns [EObject current=null] : (otherlv_0= 'frequency' otherlv_1= '{' otherlv_2= 'every' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTIME ) ) otherlv_5= '}' ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:987:2: ( (otherlv_0= 'frequency' otherlv_1= '{' otherlv_2= 'every' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTIME ) ) otherlv_5= '}' ) )
            // InternalDsl.g:988:2: (otherlv_0= 'frequency' otherlv_1= '{' otherlv_2= 'every' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTIME ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:988:2: (otherlv_0= 'frequency' otherlv_1= '{' otherlv_2= 'every' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTIME ) ) otherlv_5= '}' )
            // InternalDsl.g:989:3: otherlv_0= 'frequency' otherlv_1= '{' otherlv_2= 'every' ( (lv_value_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleTIME ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFrequencyAccess().getFrequencyKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getFrequencyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getFrequencyAccess().getEveryKeyword_2());
            		
            // InternalDsl.g:1001:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalDsl.g:1002:4: (lv_value_3_0= RULE_INT )
            {
            // InternalDsl.g:1002:4: (lv_value_3_0= RULE_INT )
            // InternalDsl.g:1003:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            					newLeafNode(lv_value_3_0, grammarAccess.getFrequencyAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrequencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDsl.g:1019:3: ( (lv_unit_4_0= ruleTIME ) )
            // InternalDsl.g:1020:4: (lv_unit_4_0= ruleTIME )
            {
            // InternalDsl.g:1020:4: (lv_unit_4_0= ruleTIME )
            // InternalDsl.g:1021:5: lv_unit_4_0= ruleTIME
            {

            					newCompositeNode(grammarAccess.getFrequencyAccess().getUnitTIMEEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_unit_4_0=ruleTIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrequencyRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_4_0,
            						"org.smartcitymodel.Dsl.TIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFrequencyAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:1046:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:1046:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:1047:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:1053:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_stmts_3_0= ruleStatement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_stmts_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1059:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_stmts_3_0= ruleStatement ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:1060:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_stmts_3_0= ruleStatement ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:1060:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_stmts_3_0= ruleStatement ) )+ otherlv_4= '}' )
            // InternalDsl.g:1061:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_stmts_3_0= ruleStatement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalDsl.g:1065:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1066:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1066:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1067:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1087:3: ( (lv_stmts_3_0= ruleStatement ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1088:4: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalDsl.g:1088:4: (lv_stmts_3_0= ruleStatement )
            	    // InternalDsl.g:1089:5: lv_stmts_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getStmtsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmts",
            	    						lv_stmts_3_0,
            	    						"org.smartcitymodel.Dsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleStatement"
    // InternalDsl.g:1114:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDsl.g:1114:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDsl.g:1115:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDsl.g:1121:1: ruleStatement returns [EObject current=null] : this_ConditionalStatement_0= ruleConditionalStatement ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalStatement_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1127:2: (this_ConditionalStatement_0= ruleConditionalStatement )
            // InternalDsl.g:1128:2: this_ConditionalStatement_0= ruleConditionalStatement
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ConditionalStatement_0=ruleConditionalStatement();

            state._fsp--;


            		current = this_ConditionalStatement_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleConditionalStatement"
    // InternalDsl.g:1139:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalDsl.g:1139:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalDsl.g:1140:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;

             current =iv_ruleConditionalStatement; 
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
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // InternalDsl.g:1146:1: ruleConditionalStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_effect_3_0= ruleEffect ) ) otherlv_4= ';' ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_effect_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1152:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_effect_3_0= ruleEffect ) ) otherlv_4= ';' ) )
            // InternalDsl.g:1153:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_effect_3_0= ruleEffect ) ) otherlv_4= ';' )
            {
            // InternalDsl.g:1153:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_effect_3_0= ruleEffect ) ) otherlv_4= ';' )
            // InternalDsl.g:1154:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_effect_3_0= ruleEffect ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getIfKeyword_0());
            		
            // InternalDsl.g:1158:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalDsl.g:1159:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalDsl.g:1159:4: (lv_condition_1_0= ruleCondition )
            // InternalDsl.g:1160:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.smartcitymodel.Dsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalStatementAccess().getThenKeyword_2());
            		
            // InternalDsl.g:1181:3: ( (lv_effect_3_0= ruleEffect ) )
            // InternalDsl.g:1182:4: (lv_effect_3_0= ruleEffect )
            {
            // InternalDsl.g:1182:4: (lv_effect_3_0= ruleEffect )
            // InternalDsl.g:1183:5: lv_effect_3_0= ruleEffect
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getEffectEffectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_effect_3_0=ruleEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					set(
            						current,
            						"effect",
            						lv_effect_3_0,
            						"org.smartcitymodel.Dsl.Effect");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalStatementAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleCondition"
    // InternalDsl.g:1208:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDsl.g:1208:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalDsl.g:1209:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDsl.g:1215:1: ruleCondition returns [EObject current=null] : ( ( (lv_target_0_0= rulePortFQN ) ) | ( rulePropertyFQN this_COMP_2= RULE_COMP ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token this_COMP_2=null;
        AntlrDatatypeRuleToken lv_target_0_0 = null;

        AntlrDatatypeRuleToken lv_expr_3_1 = null;

        AntlrDatatypeRuleToken lv_expr_3_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:1221:2: ( ( ( (lv_target_0_0= rulePortFQN ) ) | ( rulePropertyFQN this_COMP_2= RULE_COMP ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) ) ) ) )
            // InternalDsl.g:1222:2: ( ( (lv_target_0_0= rulePortFQN ) ) | ( rulePropertyFQN this_COMP_2= RULE_COMP ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) ) ) )
            {
            // InternalDsl.g:1222:2: ( ( (lv_target_0_0= rulePortFQN ) ) | ( rulePropertyFQN this_COMP_2= RULE_COMP ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==40) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==RULE_ID) ) {
                        int LA18_3 = input.LA(4);

                        if ( (LA18_3==40) ) {
                            int LA18_5 = input.LA(5);

                            if ( (LA18_5==RULE_ID) ) {
                                alt18=2;
                            }
                            else if ( (LA18_5==RULE_INT) ) {
                                alt18=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA18_3==RULE_COMP) ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_2==RULE_INT) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1223:3: ( (lv_target_0_0= rulePortFQN ) )
                    {
                    // InternalDsl.g:1223:3: ( (lv_target_0_0= rulePortFQN ) )
                    // InternalDsl.g:1224:4: (lv_target_0_0= rulePortFQN )
                    {
                    // InternalDsl.g:1224:4: (lv_target_0_0= rulePortFQN )
                    // InternalDsl.g:1225:5: lv_target_0_0= rulePortFQN
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getTargetPortFQNParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_target_0_0=rulePortFQN();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"target",
                    						lv_target_0_0,
                    						"org.smartcitymodel.Dsl.PortFQN");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1243:3: ( rulePropertyFQN this_COMP_2= RULE_COMP ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) ) )
                    {
                    // InternalDsl.g:1243:3: ( rulePropertyFQN this_COMP_2= RULE_COMP ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) ) )
                    // InternalDsl.g:1244:4: rulePropertyFQN this_COMP_2= RULE_COMP ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) )
                    {

                    				newCompositeNode(grammarAccess.getConditionAccess().getPropertyFQNParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_38);
                    rulePropertyFQN();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    this_COMP_2=(Token)match(input,RULE_COMP,FOLLOW_39); 

                    				newLeafNode(this_COMP_2, grammarAccess.getConditionAccess().getCOMPTerminalRuleCall_1_1());
                    			
                    // InternalDsl.g:1255:4: ( ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) ) )
                    // InternalDsl.g:1256:5: ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) )
                    {
                    // InternalDsl.g:1256:5: ( (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression ) )
                    // InternalDsl.g:1257:6: (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression )
                    {
                    // InternalDsl.g:1257:6: (lv_expr_3_1= rulePortFQN | lv_expr_3_2= ruleExpression )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_INT||LA17_0==RULE_STRING||(LA17_0>=42 && LA17_0<=43)) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDsl.g:1258:7: lv_expr_3_1= rulePortFQN
                            {

                            							newCompositeNode(grammarAccess.getConditionAccess().getExprPortFQNParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_expr_3_1=rulePortFQN();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConditionRule());
                            							}
                            							set(
                            								current,
                            								"expr",
                            								lv_expr_3_1,
                            								"org.smartcitymodel.Dsl.PortFQN");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1274:7: lv_expr_3_2= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getConditionAccess().getExprExpressionParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_expr_3_2=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConditionRule());
                            							}
                            							set(
                            								current,
                            								"expr",
                            								lv_expr_3_2,
                            								"org.smartcitymodel.Dsl.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEffect"
    // InternalDsl.g:1297:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalDsl.g:1297:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalDsl.g:1298:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalDsl.g:1304:1: ruleEffect returns [EObject current=null] : ( (otherlv_0= 'set' ( (lv_target_1_0= rulePortFQN ) ) ) | ( rulePropertyFQN otherlv_3= 'to' ( (lv_expr_4_0= ruleExpression ) ) ) ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_target_1_0 = null;

        AntlrDatatypeRuleToken lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1310:2: ( ( (otherlv_0= 'set' ( (lv_target_1_0= rulePortFQN ) ) ) | ( rulePropertyFQN otherlv_3= 'to' ( (lv_expr_4_0= ruleExpression ) ) ) ) )
            // InternalDsl.g:1311:2: ( (otherlv_0= 'set' ( (lv_target_1_0= rulePortFQN ) ) ) | ( rulePropertyFQN otherlv_3= 'to' ( (lv_expr_4_0= ruleExpression ) ) ) )
            {
            // InternalDsl.g:1311:2: ( (otherlv_0= 'set' ( (lv_target_1_0= rulePortFQN ) ) ) | ( rulePropertyFQN otherlv_3= 'to' ( (lv_expr_4_0= ruleExpression ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1312:3: (otherlv_0= 'set' ( (lv_target_1_0= rulePortFQN ) ) )
                    {
                    // InternalDsl.g:1312:3: (otherlv_0= 'set' ( (lv_target_1_0= rulePortFQN ) ) )
                    // InternalDsl.g:1313:4: otherlv_0= 'set' ( (lv_target_1_0= rulePortFQN ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getSetKeyword_0_0());
                    			
                    // InternalDsl.g:1317:4: ( (lv_target_1_0= rulePortFQN ) )
                    // InternalDsl.g:1318:5: (lv_target_1_0= rulePortFQN )
                    {
                    // InternalDsl.g:1318:5: (lv_target_1_0= rulePortFQN )
                    // InternalDsl.g:1319:6: lv_target_1_0= rulePortFQN
                    {

                    						newCompositeNode(grammarAccess.getEffectAccess().getTargetPortFQNParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_1_0=rulePortFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectRule());
                    						}
                    						set(
                    							current,
                    							"target",
                    							lv_target_1_0,
                    							"org.smartcitymodel.Dsl.PortFQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1338:3: ( rulePropertyFQN otherlv_3= 'to' ( (lv_expr_4_0= ruleExpression ) ) )
                    {
                    // InternalDsl.g:1338:3: ( rulePropertyFQN otherlv_3= 'to' ( (lv_expr_4_0= ruleExpression ) ) )
                    // InternalDsl.g:1339:4: rulePropertyFQN otherlv_3= 'to' ( (lv_expr_4_0= ruleExpression ) )
                    {

                    				newCompositeNode(grammarAccess.getEffectAccess().getPropertyFQNParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_40);
                    rulePropertyFQN();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,36,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectAccess().getToKeyword_1_1());
                    			
                    // InternalDsl.g:1350:4: ( (lv_expr_4_0= ruleExpression ) )
                    // InternalDsl.g:1351:5: (lv_expr_4_0= ruleExpression )
                    {
                    // InternalDsl.g:1351:5: (lv_expr_4_0= ruleExpression )
                    // InternalDsl.g:1352:6: lv_expr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectAccess().getExprExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"org.smartcitymodel.Dsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalDsl.g:1374:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalDsl.g:1374:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalDsl.g:1375:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDsl.g:1381:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ValueExpression_0= ruleValueExpression ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ValueExpression_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1387:2: (this_ValueExpression_0= ruleValueExpression )
            // InternalDsl.g:1388:2: this_ValueExpression_0= ruleValueExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ValueExpression_0=ruleValueExpression();

            state._fsp--;


            		current.merge(this_ValueExpression_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleValueExpression"
    // InternalDsl.g:1401:1: entryRuleValueExpression returns [String current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final String entryRuleValueExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueExpression = null;


        try {
            // InternalDsl.g:1401:55: (iv_ruleValueExpression= ruleValueExpression EOF )
            // InternalDsl.g:1402:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
             newCompositeNode(grammarAccess.getValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueExpression=ruleValueExpression();

            state._fsp--;

             current =iv_ruleValueExpression.getText(); 
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
    // $ANTLR end "entryRuleValueExpression"


    // $ANTLR start "ruleValueExpression"
    // InternalDsl.g:1408:1: ruleValueExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= ruleBOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleValueExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;

        AntlrDatatypeRuleToken this_BOOLEAN_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:1414:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= ruleBOOLEAN ) )
            // InternalDsl.g:1415:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= ruleBOOLEAN )
            {
            // InternalDsl.g:1415:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= ruleBOOLEAN )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||(LA20_1>=33 && LA20_1<=34)) ) {
                    alt20=1;
                }
                else if ( (LA20_1==41) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            case 42:
            case 43:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1416:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueExpressionAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1424:3: this_FLOAT_1= ruleFLOAT
                    {

                    			newCompositeNode(grammarAccess.getValueExpressionAccess().getFLOATParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLOAT_1=ruleFLOAT();

                    state._fsp--;


                    			current.merge(this_FLOAT_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1435:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getValueExpressionAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:1443:3: this_BOOLEAN_3= ruleBOOLEAN
                    {

                    			newCompositeNode(grammarAccess.getValueExpressionAccess().getBOOLEANParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BOOLEAN_3=ruleBOOLEAN();

                    state._fsp--;


                    			current.merge(this_BOOLEAN_3);
                    		

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
    // $ANTLR end "ruleValueExpression"


    // $ANTLR start "entryRuleService"
    // InternalDsl.g:1457:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDsl.g:1457:48: (iv_ruleService= ruleService EOF )
            // InternalDsl.g:1458:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDsl.g:1464:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1470:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalDsl.g:1471:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalDsl.g:1471:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalDsl.g:1472:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:1476:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1477:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1477:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1478:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleConnection"
    // InternalDsl.g:1506:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalDsl.g:1506:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalDsl.g:1507:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalDsl.g:1513:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourceRef_3_0= rulePortFQN ) ) otherlv_4= '->' ( (lv_targetRef_5_0= rulePortFQN ) ) otherlv_6= '}' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_sourceRef_3_0 = null;

        AntlrDatatypeRuleToken lv_targetRef_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1519:2: ( (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourceRef_3_0= rulePortFQN ) ) otherlv_4= '->' ( (lv_targetRef_5_0= rulePortFQN ) ) otherlv_6= '}' ) )
            // InternalDsl.g:1520:2: (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourceRef_3_0= rulePortFQN ) ) otherlv_4= '->' ( (lv_targetRef_5_0= rulePortFQN ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:1520:2: (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourceRef_3_0= rulePortFQN ) ) otherlv_4= '->' ( (lv_targetRef_5_0= rulePortFQN ) ) otherlv_6= '}' )
            // InternalDsl.g:1521:3: otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sourceRef_3_0= rulePortFQN ) ) otherlv_4= '->' ( (lv_targetRef_5_0= rulePortFQN ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
            		
            // InternalDsl.g:1525:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1526:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1526:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1527:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1547:3: ( (lv_sourceRef_3_0= rulePortFQN ) )
            // InternalDsl.g:1548:4: (lv_sourceRef_3_0= rulePortFQN )
            {
            // InternalDsl.g:1548:4: (lv_sourceRef_3_0= rulePortFQN )
            // InternalDsl.g:1549:5: lv_sourceRef_3_0= rulePortFQN
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getSourceRefPortFQNParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
            lv_sourceRef_3_0=rulePortFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"sourceRef",
            						lv_sourceRef_3_0,
            						"org.smartcitymodel.Dsl.PortFQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalDsl.g:1570:3: ( (lv_targetRef_5_0= rulePortFQN ) )
            // InternalDsl.g:1571:4: (lv_targetRef_5_0= rulePortFQN )
            {
            // InternalDsl.g:1571:4: (lv_targetRef_5_0= rulePortFQN )
            // InternalDsl.g:1572:5: lv_targetRef_5_0= rulePortFQN
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getTargetRefPortFQNParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_targetRef_5_0=rulePortFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"targetRef",
            						lv_targetRef_5_0,
            						"org.smartcitymodel.Dsl.PortFQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRulePortFQN"
    // InternalDsl.g:1597:1: entryRulePortFQN returns [String current=null] : iv_rulePortFQN= rulePortFQN EOF ;
    public final String entryRulePortFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePortFQN = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalDsl.g:1599:2: (iv_rulePortFQN= rulePortFQN EOF )
            // InternalDsl.g:1600:2: iv_rulePortFQN= rulePortFQN EOF
            {
             newCompositeNode(grammarAccess.getPortFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortFQN=rulePortFQN();

            state._fsp--;

             current =iv_rulePortFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePortFQN"


    // $ANTLR start "rulePortFQN"
    // InternalDsl.g:1609:1: rulePortFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '::' this_INT_2= RULE_INT ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT ) ) ) ;
    public final AntlrDatatypeRuleToken rulePortFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_ID_4=null;
        Token this_INT_6=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalDsl.g:1616:2: ( (this_ID_0= RULE_ID ( (kw= '::' this_INT_2= RULE_INT ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT ) ) ) )
            // InternalDsl.g:1617:2: (this_ID_0= RULE_ID ( (kw= '::' this_INT_2= RULE_INT ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT ) ) )
            {
            // InternalDsl.g:1617:2: (this_ID_0= RULE_ID ( (kw= '::' this_INT_2= RULE_INT ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT ) ) )
            // InternalDsl.g:1618:3: this_ID_0= RULE_ID ( (kw= '::' this_INT_2= RULE_INT ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getPortFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalDsl.g:1625:3: ( (kw= '::' this_INT_2= RULE_INT ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    alt21=2;
                }
                else if ( (LA21_1==RULE_INT) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1626:4: (kw= '::' this_INT_2= RULE_INT )
                    {
                    // InternalDsl.g:1626:4: (kw= '::' this_INT_2= RULE_INT )
                    // InternalDsl.g:1627:5: kw= '::' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,40,FOLLOW_20); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getPortFQNAccess().getColonColonKeyword_1_0_0());
                    				
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					current.merge(this_INT_2);
                    				

                    					newLeafNode(this_INT_2, grammarAccess.getPortFQNAccess().getINTTerminalRuleCall_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1641:4: (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT )
                    {
                    // InternalDsl.g:1641:4: (kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT )
                    // InternalDsl.g:1642:5: kw= '::' this_ID_4= RULE_ID kw= '::' this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,40,FOLLOW_5); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getPortFQNAccess().getColonColonKeyword_1_1_0());
                    				
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_42); 

                    					current.merge(this_ID_4);
                    				

                    					newLeafNode(this_ID_4, grammarAccess.getPortFQNAccess().getIDTerminalRuleCall_1_1_1());
                    				
                    kw=(Token)match(input,40,FOLLOW_20); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getPortFQNAccess().getColonColonKeyword_1_1_2());
                    				
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					current.merge(this_INT_6);
                    				

                    					newLeafNode(this_INT_6, grammarAccess.getPortFQNAccess().getINTTerminalRuleCall_1_1_3());
                    				

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePortFQN"


    // $ANTLR start "entryRulePropertyFQN"
    // InternalDsl.g:1675:1: entryRulePropertyFQN returns [String current=null] : iv_rulePropertyFQN= rulePropertyFQN EOF ;
    public final String entryRulePropertyFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyFQN = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalDsl.g:1677:2: (iv_rulePropertyFQN= rulePropertyFQN EOF )
            // InternalDsl.g:1678:2: iv_rulePropertyFQN= rulePropertyFQN EOF
            {
             newCompositeNode(grammarAccess.getPropertyFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyFQN=rulePropertyFQN();

            state._fsp--;

             current =iv_rulePropertyFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePropertyFQN"


    // $ANTLR start "rulePropertyFQN"
    // InternalDsl.g:1687:1: rulePropertyFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '::' this_ID_2= RULE_ID ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID ) ) ) ;
    public final AntlrDatatypeRuleToken rulePropertyFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_6=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalDsl.g:1694:2: ( (this_ID_0= RULE_ID ( (kw= '::' this_ID_2= RULE_ID ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID ) ) ) )
            // InternalDsl.g:1695:2: (this_ID_0= RULE_ID ( (kw= '::' this_ID_2= RULE_ID ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID ) ) )
            {
            // InternalDsl.g:1695:2: (this_ID_0= RULE_ID ( (kw= '::' this_ID_2= RULE_ID ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID ) ) )
            // InternalDsl.g:1696:3: this_ID_0= RULE_ID ( (kw= '::' this_ID_2= RULE_ID ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getPropertyFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalDsl.g:1703:3: ( (kw= '::' this_ID_2= RULE_ID ) | (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==EOF||LA22_2==RULE_COMP||LA22_2==36) ) {
                        alt22=1;
                    }
                    else if ( (LA22_2==40) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1704:4: (kw= '::' this_ID_2= RULE_ID )
                    {
                    // InternalDsl.g:1704:4: (kw= '::' this_ID_2= RULE_ID )
                    // InternalDsl.g:1705:5: kw= '::' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,40,FOLLOW_5); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getPropertyFQNAccess().getColonColonKeyword_1_0_0());
                    				
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					current.merge(this_ID_2);
                    				

                    					newLeafNode(this_ID_2, grammarAccess.getPropertyFQNAccess().getIDTerminalRuleCall_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1719:4: (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID )
                    {
                    // InternalDsl.g:1719:4: (kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID )
                    // InternalDsl.g:1720:5: kw= '::' this_ID_4= RULE_ID kw= '::' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,40,FOLLOW_5); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getPropertyFQNAccess().getColonColonKeyword_1_1_0());
                    				
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_42); 

                    					current.merge(this_ID_4);
                    				

                    					newLeafNode(this_ID_4, grammarAccess.getPropertyFQNAccess().getIDTerminalRuleCall_1_1_1());
                    				
                    kw=(Token)match(input,40,FOLLOW_5); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getPropertyFQNAccess().getColonColonKeyword_1_1_2());
                    				
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					current.merge(this_ID_6);
                    				

                    					newLeafNode(this_ID_6, grammarAccess.getPropertyFQNAccess().getIDTerminalRuleCall_1_1_3());
                    				

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePropertyFQN"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:1753:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalDsl.g:1753:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalDsl.g:1754:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:1760:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1766:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDsl.g:1767:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDsl.g:1767:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDsl.g:1768:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,41,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalDsl.g:1791:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalDsl.g:1791:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalDsl.g:1792:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalDsl.g:1798:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1804:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDsl.g:1805:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDsl.g:1805:2: (kw= 'true' | kw= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            else if ( (LA23_0==43) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1806:3: kw= 'true'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1812:3: kw= 'false'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "ruleDIRECTION"
    // InternalDsl.g:1821:1: ruleDIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleDIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1827:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalDsl.g:1828:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalDsl.g:1828:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1829:3: (enumLiteral_0= 'in' )
                    {
                    // InternalDsl.g:1829:3: (enumLiteral_0= 'in' )
                    // InternalDsl.g:1830:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDIRECTIONAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDIRECTIONAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1837:3: (enumLiteral_1= 'out' )
                    {
                    // InternalDsl.g:1837:3: (enumLiteral_1= 'out' )
                    // InternalDsl.g:1838:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDIRECTIONAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDIRECTIONAccess().getOutEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDIRECTION"


    // $ANTLR start "ruleTYPE"
    // InternalDsl.g:1848:1: ruleTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'bool' ) ) ;
    public final Enumerator ruleTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1854:2: ( ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'bool' ) ) )
            // InternalDsl.g:1855:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'bool' ) )
            {
            // InternalDsl.g:1855:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'bool' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt25=1;
                }
                break;
            case 47:
                {
                alt25=2;
                }
                break;
            case 48:
                {
                alt25=3;
                }
                break;
            case 49:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1856:3: (enumLiteral_0= 'float' )
                    {
                    // InternalDsl.g:1856:3: (enumLiteral_0= 'float' )
                    // InternalDsl.g:1857:4: enumLiteral_0= 'float'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getFloatEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPEAccess().getFloatEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1864:3: (enumLiteral_1= 'integer' )
                    {
                    // InternalDsl.g:1864:3: (enumLiteral_1= 'integer' )
                    // InternalDsl.g:1865:4: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPEAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1872:3: (enumLiteral_2= 'string' )
                    {
                    // InternalDsl.g:1872:3: (enumLiteral_2= 'string' )
                    // InternalDsl.g:1873:4: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1880:3: (enumLiteral_3= 'bool' )
                    {
                    // InternalDsl.g:1880:3: (enumLiteral_3= 'bool' )
                    // InternalDsl.g:1881:4: enumLiteral_3= 'bool'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getBoolEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTYPEAccess().getBoolEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "ruleUNIT"
    // InternalDsl.g:1891:1: ruleUNIT returns [Enumerator current=null] : ( (enumLiteral_0= 'cd' ) | (enumLiteral_1= 'C' ) ) ;
    public final Enumerator ruleUNIT() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1897:2: ( ( (enumLiteral_0= 'cd' ) | (enumLiteral_1= 'C' ) ) )
            // InternalDsl.g:1898:2: ( (enumLiteral_0= 'cd' ) | (enumLiteral_1= 'C' ) )
            {
            // InternalDsl.g:1898:2: ( (enumLiteral_0= 'cd' ) | (enumLiteral_1= 'C' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            else if ( (LA26_0==51) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1899:3: (enumLiteral_0= 'cd' )
                    {
                    // InternalDsl.g:1899:3: (enumLiteral_0= 'cd' )
                    // InternalDsl.g:1900:4: enumLiteral_0= 'cd'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getUNITAccess().getCdEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUNITAccess().getCdEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1907:3: (enumLiteral_1= 'C' )
                    {
                    // InternalDsl.g:1907:3: (enumLiteral_1= 'C' )
                    // InternalDsl.g:1908:4: enumLiteral_1= 'C'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getUNITAccess().getCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUNITAccess().getCEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "ruleTIME"
    // InternalDsl.g:1918:1: ruleTIME returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) ) ;
    public final Enumerator ruleTIME() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1924:2: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) ) )
            // InternalDsl.g:1925:2: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) )
            {
            // InternalDsl.g:1925:2: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt27=1;
                }
                break;
            case 53:
                {
                alt27=2;
                }
                break;
            case 54:
                {
                alt27=3;
                }
                break;
            case 55:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1926:3: (enumLiteral_0= 's' )
                    {
                    // InternalDsl.g:1926:3: (enumLiteral_0= 's' )
                    // InternalDsl.g:1927:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTIMEAccess().getSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1934:3: (enumLiteral_1= 'm' )
                    {
                    // InternalDsl.g:1934:3: (enumLiteral_1= 'm' )
                    // InternalDsl.g:1935:4: enumLiteral_1= 'm'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTIMEAccess().getMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1942:3: (enumLiteral_2= 'h' )
                    {
                    // InternalDsl.g:1942:3: (enumLiteral_2= 'h' )
                    // InternalDsl.g:1943:4: enumLiteral_2= 'h'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTIMEAccess().getHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1950:3: (enumLiteral_3= 'd' )
                    {
                    // InternalDsl.g:1950:3: (enumLiteral_3= 'd' )
                    // InternalDsl.g:1951:4: enumLiteral_3= 'd'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTIMEAccess().getDEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTIME"


    // $ANTLR start "ruleACCESS"
    // InternalDsl.g:1961:1: ruleACCESS returns [Enumerator current=null] : ( (enumLiteral_0= 'r' ) | (enumLiteral_1= 'w' ) | (enumLiteral_2= 'rw' ) ) ;
    public final Enumerator ruleACCESS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1967:2: ( ( (enumLiteral_0= 'r' ) | (enumLiteral_1= 'w' ) | (enumLiteral_2= 'rw' ) ) )
            // InternalDsl.g:1968:2: ( (enumLiteral_0= 'r' ) | (enumLiteral_1= 'w' ) | (enumLiteral_2= 'rw' ) )
            {
            // InternalDsl.g:1968:2: ( (enumLiteral_0= 'r' ) | (enumLiteral_1= 'w' ) | (enumLiteral_2= 'rw' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt28=1;
                }
                break;
            case 57:
                {
                alt28=2;
                }
                break;
            case 58:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1969:3: (enumLiteral_0= 'r' )
                    {
                    // InternalDsl.g:1969:3: (enumLiteral_0= 'r' )
                    // InternalDsl.g:1970:4: enumLiteral_0= 'r'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getACCESSAccess().getREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getACCESSAccess().getREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1977:3: (enumLiteral_1= 'w' )
                    {
                    // InternalDsl.g:1977:3: (enumLiteral_1= 'w' )
                    // InternalDsl.g:1978:4: enumLiteral_1= 'w'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getACCESSAccess().getWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getACCESSAccess().getWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1985:3: (enumLiteral_2= 'rw' )
                    {
                    // InternalDsl.g:1985:3: (enumLiteral_2= 'rw' )
                    // InternalDsl.g:1986:4: enumLiteral_2= 'rw'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getACCESSAccess().getRwEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getACCESSAccess().getRwEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleACCESS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000039002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000208C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000A08C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A0800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000020A08C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000020A0800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002020800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000C00000000B0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});

}