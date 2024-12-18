package uibk.ac.at.smartcity.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uibk.ac.at.smartcity.services.SmartCityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartCityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TEMPERATURE'", "'PH'", "'TURBIDITY'", "'TDS'", "'CURRENT'", "'PULSE'", "'ULTRASONIC'", "'CAMERA'", "'UART'", "'ADC'", "'SPI'", "'GPIO'", "'CSI'", "'HTTPS'", "'layer'", "'priority'", "'delay'", "'node'", "'{'", "'}'", "'sensor'", "'type'", "'link'", "'from'", "'->'", "'datatype'", "'controller'", "'['", "'..'", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

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

    	public void setGrammarAccess(SmartCityGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSmartCity.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSmartCity.g:54:1: ( ruleModel EOF )
            // InternalSmartCity.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSmartCity.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSmartCity.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSmartCity.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSmartCity.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSmartCity.g:69:3: ( rule__Model__Group__0 )
            // InternalSmartCity.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLayer"
    // InternalSmartCity.g:78:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalSmartCity.g:79:1: ( ruleLayer EOF )
            // InternalSmartCity.g:80:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSmartCity.g:87:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:91:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalSmartCity.g:92:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalSmartCity.g:92:2: ( ( rule__Layer__Group__0 ) )
            // InternalSmartCity.g:93:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalSmartCity.g:94:3: ( rule__Layer__Group__0 )
            // InternalSmartCity.g:94:4: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleNode"
    // InternalSmartCity.g:103:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalSmartCity.g:104:1: ( ruleNode EOF )
            // InternalSmartCity.g:105:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSmartCity.g:112:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:116:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalSmartCity.g:117:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalSmartCity.g:117:2: ( ( rule__Node__Group__0 ) )
            // InternalSmartCity.g:118:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalSmartCity.g:119:3: ( rule__Node__Group__0 )
            // InternalSmartCity.g:119:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSensor"
    // InternalSmartCity.g:128:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSmartCity.g:129:1: ( ruleSensor EOF )
            // InternalSmartCity.g:130:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSmartCity.g:137:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:141:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSmartCity.g:142:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSmartCity.g:142:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSmartCity.g:143:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSmartCity.g:144:3: ( rule__Sensor__Group__0 )
            // InternalSmartCity.g:144:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleCommunicationLink"
    // InternalSmartCity.g:153:1: entryRuleCommunicationLink : ruleCommunicationLink EOF ;
    public final void entryRuleCommunicationLink() throws RecognitionException {
        try {
            // InternalSmartCity.g:154:1: ( ruleCommunicationLink EOF )
            // InternalSmartCity.g:155:1: ruleCommunicationLink EOF
            {
             before(grammarAccess.getCommunicationLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunicationLink();

            state._fsp--;

             after(grammarAccess.getCommunicationLinkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommunicationLink"


    // $ANTLR start "ruleCommunicationLink"
    // InternalSmartCity.g:162:1: ruleCommunicationLink : ( ( rule__CommunicationLink__Group__0 ) ) ;
    public final void ruleCommunicationLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:166:2: ( ( ( rule__CommunicationLink__Group__0 ) ) )
            // InternalSmartCity.g:167:2: ( ( rule__CommunicationLink__Group__0 ) )
            {
            // InternalSmartCity.g:167:2: ( ( rule__CommunicationLink__Group__0 ) )
            // InternalSmartCity.g:168:3: ( rule__CommunicationLink__Group__0 )
            {
             before(grammarAccess.getCommunicationLinkAccess().getGroup()); 
            // InternalSmartCity.g:169:3: ( rule__CommunicationLink__Group__0 )
            // InternalSmartCity.g:169:4: rule__CommunicationLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommunicationLink"


    // $ANTLR start "entryRuleController"
    // InternalSmartCity.g:178:1: entryRuleController : ruleController EOF ;
    public final void entryRuleController() throws RecognitionException {
        try {
            // InternalSmartCity.g:179:1: ( ruleController EOF )
            // InternalSmartCity.g:180:1: ruleController EOF
            {
             before(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleController();

            state._fsp--;

             after(grammarAccess.getControllerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalSmartCity.g:187:1: ruleController : ( ( rule__Controller__Group__0 ) ) ;
    public final void ruleController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:191:2: ( ( ( rule__Controller__Group__0 ) ) )
            // InternalSmartCity.g:192:2: ( ( rule__Controller__Group__0 ) )
            {
            // InternalSmartCity.g:192:2: ( ( rule__Controller__Group__0 ) )
            // InternalSmartCity.g:193:3: ( rule__Controller__Group__0 )
            {
             before(grammarAccess.getControllerAccess().getGroup()); 
            // InternalSmartCity.g:194:3: ( rule__Controller__Group__0 )
            // InternalSmartCity.g:194:4: rule__Controller__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleDelayRange"
    // InternalSmartCity.g:203:1: entryRuleDelayRange : ruleDelayRange EOF ;
    public final void entryRuleDelayRange() throws RecognitionException {
        try {
            // InternalSmartCity.g:204:1: ( ruleDelayRange EOF )
            // InternalSmartCity.g:205:1: ruleDelayRange EOF
            {
             before(grammarAccess.getDelayRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleDelayRange();

            state._fsp--;

             after(grammarAccess.getDelayRangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelayRange"


    // $ANTLR start "ruleDelayRange"
    // InternalSmartCity.g:212:1: ruleDelayRange : ( ( rule__DelayRange__Group__0 ) ) ;
    public final void ruleDelayRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:216:2: ( ( ( rule__DelayRange__Group__0 ) ) )
            // InternalSmartCity.g:217:2: ( ( rule__DelayRange__Group__0 ) )
            {
            // InternalSmartCity.g:217:2: ( ( rule__DelayRange__Group__0 ) )
            // InternalSmartCity.g:218:3: ( rule__DelayRange__Group__0 )
            {
             before(grammarAccess.getDelayRangeAccess().getGroup()); 
            // InternalSmartCity.g:219:3: ( rule__DelayRange__Group__0 )
            // InternalSmartCity.g:219:4: rule__DelayRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelayRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelayRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelayRange"


    // $ANTLR start "ruleSensorType"
    // InternalSmartCity.g:228:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:232:1: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalSmartCity.g:233:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalSmartCity.g:233:2: ( ( rule__SensorType__Alternatives ) )
            // InternalSmartCity.g:234:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalSmartCity.g:235:3: ( rule__SensorType__Alternatives )
            // InternalSmartCity.g:235:4: rule__SensorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleLinkType"
    // InternalSmartCity.g:244:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:248:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // InternalSmartCity.g:249:2: ( ( rule__LinkType__Alternatives ) )
            {
            // InternalSmartCity.g:249:2: ( ( rule__LinkType__Alternatives ) )
            // InternalSmartCity.g:250:3: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // InternalSmartCity.g:251:3: ( rule__LinkType__Alternatives )
            // InternalSmartCity.g:251:4: rule__LinkType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LinkType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinkTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkType"


    // $ANTLR start "ruleDataType"
    // InternalSmartCity.g:260:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:264:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSmartCity.g:265:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSmartCity.g:265:2: ( ( rule__DataType__Alternatives ) )
            // InternalSmartCity.g:266:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSmartCity.g:267:3: ( rule__DataType__Alternatives )
            // InternalSmartCity.g:267:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__SensorType__Alternatives"
    // InternalSmartCity.g:275:1: rule__SensorType__Alternatives : ( ( ( 'TEMPERATURE' ) ) | ( ( 'PH' ) ) | ( ( 'TURBIDITY' ) ) | ( ( 'TDS' ) ) | ( ( 'CURRENT' ) ) | ( ( 'PULSE' ) ) | ( ( 'ULTRASONIC' ) ) | ( ( 'CAMERA' ) ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:279:1: ( ( ( 'TEMPERATURE' ) ) | ( ( 'PH' ) ) | ( ( 'TURBIDITY' ) ) | ( ( 'TDS' ) ) | ( ( 'CURRENT' ) ) | ( ( 'PULSE' ) ) | ( ( 'ULTRASONIC' ) ) | ( ( 'CAMERA' ) ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmartCity.g:280:2: ( ( 'TEMPERATURE' ) )
                    {
                    // InternalSmartCity.g:280:2: ( ( 'TEMPERATURE' ) )
                    // InternalSmartCity.g:281:3: ( 'TEMPERATURE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 
                    // InternalSmartCity.g:282:3: ( 'TEMPERATURE' )
                    // InternalSmartCity.g:282:4: 'TEMPERATURE'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:286:2: ( ( 'PH' ) )
                    {
                    // InternalSmartCity.g:286:2: ( ( 'PH' ) )
                    // InternalSmartCity.g:287:3: ( 'PH' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1()); 
                    // InternalSmartCity.g:288:3: ( 'PH' )
                    // InternalSmartCity.g:288:4: 'PH'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getPHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:292:2: ( ( 'TURBIDITY' ) )
                    {
                    // InternalSmartCity.g:292:2: ( ( 'TURBIDITY' ) )
                    // InternalSmartCity.g:293:3: ( 'TURBIDITY' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2()); 
                    // InternalSmartCity.g:294:3: ( 'TURBIDITY' )
                    // InternalSmartCity.g:294:4: 'TURBIDITY'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getTURBIDITYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:298:2: ( ( 'TDS' ) )
                    {
                    // InternalSmartCity.g:298:2: ( ( 'TDS' ) )
                    // InternalSmartCity.g:299:3: ( 'TDS' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3()); 
                    // InternalSmartCity.g:300:3: ( 'TDS' )
                    // InternalSmartCity.g:300:4: 'TDS'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getTDSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:304:2: ( ( 'CURRENT' ) )
                    {
                    // InternalSmartCity.g:304:2: ( ( 'CURRENT' ) )
                    // InternalSmartCity.g:305:3: ( 'CURRENT' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4()); 
                    // InternalSmartCity.g:306:3: ( 'CURRENT' )
                    // InternalSmartCity.g:306:4: 'CURRENT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getCURRENTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:310:2: ( ( 'PULSE' ) )
                    {
                    // InternalSmartCity.g:310:2: ( ( 'PULSE' ) )
                    // InternalSmartCity.g:311:3: ( 'PULSE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5()); 
                    // InternalSmartCity.g:312:3: ( 'PULSE' )
                    // InternalSmartCity.g:312:4: 'PULSE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getPULSEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSmartCity.g:316:2: ( ( 'ULTRASONIC' ) )
                    {
                    // InternalSmartCity.g:316:2: ( ( 'ULTRASONIC' ) )
                    // InternalSmartCity.g:317:3: ( 'ULTRASONIC' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6()); 
                    // InternalSmartCity.g:318:3: ( 'ULTRASONIC' )
                    // InternalSmartCity.g:318:4: 'ULTRASONIC'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSmartCity.g:322:2: ( ( 'CAMERA' ) )
                    {
                    // InternalSmartCity.g:322:2: ( ( 'CAMERA' ) )
                    // InternalSmartCity.g:323:3: ( 'CAMERA' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7()); 
                    // InternalSmartCity.g:324:3: ( 'CAMERA' )
                    // InternalSmartCity.g:324:4: 'CAMERA'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getCAMERAEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorType__Alternatives"


    // $ANTLR start "rule__LinkType__Alternatives"
    // InternalSmartCity.g:332:1: rule__LinkType__Alternatives : ( ( ( 'UART' ) ) | ( ( 'ADC' ) ) | ( ( 'SPI' ) ) | ( ( 'GPIO' ) ) | ( ( 'CSI' ) ) | ( ( 'HTTPS' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:336:1: ( ( ( 'UART' ) ) | ( ( 'ADC' ) ) | ( ( 'SPI' ) ) | ( ( 'GPIO' ) ) | ( ( 'CSI' ) ) | ( ( 'HTTPS' ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 24:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSmartCity.g:337:2: ( ( 'UART' ) )
                    {
                    // InternalSmartCity.g:337:2: ( ( 'UART' ) )
                    // InternalSmartCity.g:338:3: ( 'UART' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0()); 
                    // InternalSmartCity.g:339:3: ( 'UART' )
                    // InternalSmartCity.g:339:4: 'UART'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getUARTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:343:2: ( ( 'ADC' ) )
                    {
                    // InternalSmartCity.g:343:2: ( ( 'ADC' ) )
                    // InternalSmartCity.g:344:3: ( 'ADC' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1()); 
                    // InternalSmartCity.g:345:3: ( 'ADC' )
                    // InternalSmartCity.g:345:4: 'ADC'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getADCEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:349:2: ( ( 'SPI' ) )
                    {
                    // InternalSmartCity.g:349:2: ( ( 'SPI' ) )
                    // InternalSmartCity.g:350:3: ( 'SPI' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2()); 
                    // InternalSmartCity.g:351:3: ( 'SPI' )
                    // InternalSmartCity.g:351:4: 'SPI'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getSPIEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmartCity.g:355:2: ( ( 'GPIO' ) )
                    {
                    // InternalSmartCity.g:355:2: ( ( 'GPIO' ) )
                    // InternalSmartCity.g:356:3: ( 'GPIO' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getGPIOEnumLiteralDeclaration_3()); 
                    // InternalSmartCity.g:357:3: ( 'GPIO' )
                    // InternalSmartCity.g:357:4: 'GPIO'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getGPIOEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmartCity.g:361:2: ( ( 'CSI' ) )
                    {
                    // InternalSmartCity.g:361:2: ( ( 'CSI' ) )
                    // InternalSmartCity.g:362:3: ( 'CSI' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_4()); 
                    // InternalSmartCity.g:363:3: ( 'CSI' )
                    // InternalSmartCity.g:363:4: 'CSI'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCSIEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSmartCity.g:367:2: ( ( 'HTTPS' ) )
                    {
                    // InternalSmartCity.g:367:2: ( ( 'HTTPS' ) )
                    // InternalSmartCity.g:368:3: ( 'HTTPS' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getHTTPSEnumLiteralDeclaration_5()); 
                    // InternalSmartCity.g:369:3: ( 'HTTPS' )
                    // InternalSmartCity.g:369:4: 'HTTPS'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getHTTPSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkType__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSmartCity.g:377:1: rule__DataType__Alternatives : ( ( ( 'PH' ) ) | ( ( 'TDS' ) ) | ( ( 'TEMPERATURE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:381:1: ( ( ( 'PH' ) ) | ( ( 'TDS' ) ) | ( ( 'TEMPERATURE' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSmartCity.g:382:2: ( ( 'PH' ) )
                    {
                    // InternalSmartCity.g:382:2: ( ( 'PH' ) )
                    // InternalSmartCity.g:383:3: ( 'PH' )
                    {
                     before(grammarAccess.getDataTypeAccess().getPHEnumLiteralDeclaration_0()); 
                    // InternalSmartCity.g:384:3: ( 'PH' )
                    // InternalSmartCity.g:384:4: 'PH'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getPHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartCity.g:388:2: ( ( 'TDS' ) )
                    {
                    // InternalSmartCity.g:388:2: ( ( 'TDS' ) )
                    // InternalSmartCity.g:389:3: ( 'TDS' )
                    {
                     before(grammarAccess.getDataTypeAccess().getTDSEnumLiteralDeclaration_1()); 
                    // InternalSmartCity.g:390:3: ( 'TDS' )
                    // InternalSmartCity.g:390:4: 'TDS'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getTDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartCity.g:394:2: ( ( 'TEMPERATURE' ) )
                    {
                    // InternalSmartCity.g:394:2: ( ( 'TEMPERATURE' ) )
                    // InternalSmartCity.g:395:3: ( 'TEMPERATURE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getTEMPERATUREEnumLiteralDeclaration_2()); 
                    // InternalSmartCity.g:396:3: ( 'TEMPERATURE' )
                    // InternalSmartCity.g:396:4: 'TEMPERATURE'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getTEMPERATUREEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSmartCity.g:404:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:408:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSmartCity.g:409:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSmartCity.g:416:1: rule__Model__Group__0__Impl : ( ( rule__Model__NodesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:420:1: ( ( ( rule__Model__NodesAssignment_0 )* ) )
            // InternalSmartCity.g:421:1: ( ( rule__Model__NodesAssignment_0 )* )
            {
            // InternalSmartCity.g:421:1: ( ( rule__Model__NodesAssignment_0 )* )
            // InternalSmartCity.g:422:2: ( rule__Model__NodesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getNodesAssignment_0()); 
            // InternalSmartCity.g:423:2: ( rule__Model__NodesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartCity.g:423:3: rule__Model__NodesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__NodesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getNodesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSmartCity.g:431:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:435:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSmartCity.g:436:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSmartCity.g:443:1: rule__Model__Group__1__Impl : ( ( rule__Model__InteroperableLayerAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:447:1: ( ( ( rule__Model__InteroperableLayerAssignment_1 ) ) )
            // InternalSmartCity.g:448:1: ( ( rule__Model__InteroperableLayerAssignment_1 ) )
            {
            // InternalSmartCity.g:448:1: ( ( rule__Model__InteroperableLayerAssignment_1 ) )
            // InternalSmartCity.g:449:2: ( rule__Model__InteroperableLayerAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getInteroperableLayerAssignment_1()); 
            // InternalSmartCity.g:450:2: ( rule__Model__InteroperableLayerAssignment_1 )
            // InternalSmartCity.g:450:3: rule__Model__InteroperableLayerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__InteroperableLayerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getInteroperableLayerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalSmartCity.g:458:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:462:1: ( rule__Model__Group__2__Impl )
            // InternalSmartCity.g:463:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalSmartCity.g:469:1: rule__Model__Group__2__Impl : ( ( rule__Model__GlobalLinksAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:473:1: ( ( ( rule__Model__GlobalLinksAssignment_2 )* ) )
            // InternalSmartCity.g:474:1: ( ( rule__Model__GlobalLinksAssignment_2 )* )
            {
            // InternalSmartCity.g:474:1: ( ( rule__Model__GlobalLinksAssignment_2 )* )
            // InternalSmartCity.g:475:2: ( rule__Model__GlobalLinksAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getGlobalLinksAssignment_2()); 
            // InternalSmartCity.g:476:2: ( rule__Model__GlobalLinksAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartCity.g:476:3: rule__Model__GlobalLinksAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__GlobalLinksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGlobalLinksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalSmartCity.g:485:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:489:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalSmartCity.g:490:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalSmartCity.g:497:1: rule__Layer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:501:1: ( ( 'layer' ) )
            // InternalSmartCity.g:502:1: ( 'layer' )
            {
            // InternalSmartCity.g:502:1: ( 'layer' )
            // InternalSmartCity.g:503:2: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalSmartCity.g:512:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:516:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalSmartCity.g:517:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalSmartCity.g:524:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:528:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // InternalSmartCity.g:529:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // InternalSmartCity.g:529:1: ( ( rule__Layer__NameAssignment_1 ) )
            // InternalSmartCity.g:530:2: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // InternalSmartCity.g:531:2: ( rule__Layer__NameAssignment_1 )
            // InternalSmartCity.g:531:3: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalSmartCity.g:539:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:543:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalSmartCity.g:544:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalSmartCity.g:551:1: rule__Layer__Group__2__Impl : ( 'priority' ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:555:1: ( ( 'priority' ) )
            // InternalSmartCity.g:556:1: ( 'priority' )
            {
            // InternalSmartCity.g:556:1: ( 'priority' )
            // InternalSmartCity.g:557:2: 'priority'
            {
             before(grammarAccess.getLayerAccess().getPriorityKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getPriorityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // InternalSmartCity.g:566:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:570:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalSmartCity.g:571:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // InternalSmartCity.g:578:1: rule__Layer__Group__3__Impl : ( ( rule__Layer__PriorityAssignment_3 ) ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:582:1: ( ( ( rule__Layer__PriorityAssignment_3 ) ) )
            // InternalSmartCity.g:583:1: ( ( rule__Layer__PriorityAssignment_3 ) )
            {
            // InternalSmartCity.g:583:1: ( ( rule__Layer__PriorityAssignment_3 ) )
            // InternalSmartCity.g:584:2: ( rule__Layer__PriorityAssignment_3 )
            {
             before(grammarAccess.getLayerAccess().getPriorityAssignment_3()); 
            // InternalSmartCity.g:585:2: ( rule__Layer__PriorityAssignment_3 )
            // InternalSmartCity.g:585:3: rule__Layer__PriorityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Layer__PriorityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getPriorityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // InternalSmartCity.g:593:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl rule__Layer__Group__5 ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:597:1: ( rule__Layer__Group__4__Impl rule__Layer__Group__5 )
            // InternalSmartCity.g:598:2: rule__Layer__Group__4__Impl rule__Layer__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Layer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // InternalSmartCity.g:605:1: rule__Layer__Group__4__Impl : ( 'delay' ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:609:1: ( ( 'delay' ) )
            // InternalSmartCity.g:610:1: ( 'delay' )
            {
            // InternalSmartCity.g:610:1: ( 'delay' )
            // InternalSmartCity.g:611:2: 'delay'
            {
             before(grammarAccess.getLayerAccess().getDelayKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getDelayKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__Layer__Group__5"
    // InternalSmartCity.g:620:1: rule__Layer__Group__5 : rule__Layer__Group__5__Impl ;
    public final void rule__Layer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:624:1: ( rule__Layer__Group__5__Impl )
            // InternalSmartCity.g:625:2: rule__Layer__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__5"


    // $ANTLR start "rule__Layer__Group__5__Impl"
    // InternalSmartCity.g:631:1: rule__Layer__Group__5__Impl : ( ( rule__Layer__DelayAssignment_5 ) ) ;
    public final void rule__Layer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:635:1: ( ( ( rule__Layer__DelayAssignment_5 ) ) )
            // InternalSmartCity.g:636:1: ( ( rule__Layer__DelayAssignment_5 ) )
            {
            // InternalSmartCity.g:636:1: ( ( rule__Layer__DelayAssignment_5 ) )
            // InternalSmartCity.g:637:2: ( rule__Layer__DelayAssignment_5 )
            {
             before(grammarAccess.getLayerAccess().getDelayAssignment_5()); 
            // InternalSmartCity.g:638:2: ( rule__Layer__DelayAssignment_5 )
            // InternalSmartCity.g:638:3: rule__Layer__DelayAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Layer__DelayAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getDelayAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalSmartCity.g:647:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:651:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalSmartCity.g:652:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalSmartCity.g:659:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:663:1: ( ( 'node' ) )
            // InternalSmartCity.g:664:1: ( 'node' )
            {
            // InternalSmartCity.g:664:1: ( 'node' )
            // InternalSmartCity.g:665:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalSmartCity.g:674:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:678:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalSmartCity.g:679:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalSmartCity.g:686:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:690:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalSmartCity.g:691:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalSmartCity.g:691:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalSmartCity.g:692:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalSmartCity.g:693:2: ( rule__Node__NameAssignment_1 )
            // InternalSmartCity.g:693:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalSmartCity.g:701:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:705:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalSmartCity.g:706:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalSmartCity.g:713:1: rule__Node__Group__2__Impl : ( '{' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:717:1: ( ( '{' ) )
            // InternalSmartCity.g:718:1: ( '{' )
            {
            // InternalSmartCity.g:718:1: ( '{' )
            // InternalSmartCity.g:719:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalSmartCity.g:728:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:732:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalSmartCity.g:733:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalSmartCity.g:740:1: rule__Node__Group__3__Impl : ( ( rule__Node__SensorsAssignment_3 )* ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:744:1: ( ( ( rule__Node__SensorsAssignment_3 )* ) )
            // InternalSmartCity.g:745:1: ( ( rule__Node__SensorsAssignment_3 )* )
            {
            // InternalSmartCity.g:745:1: ( ( rule__Node__SensorsAssignment_3 )* )
            // InternalSmartCity.g:746:2: ( rule__Node__SensorsAssignment_3 )*
            {
             before(grammarAccess.getNodeAccess().getSensorsAssignment_3()); 
            // InternalSmartCity.g:747:2: ( rule__Node__SensorsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartCity.g:747:3: rule__Node__SensorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Node__SensorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getSensorsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalSmartCity.g:755:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:759:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalSmartCity.g:760:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalSmartCity.g:767:1: rule__Node__Group__4__Impl : ( ( rule__Node__ControllerAssignment_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:771:1: ( ( ( rule__Node__ControllerAssignment_4 ) ) )
            // InternalSmartCity.g:772:1: ( ( rule__Node__ControllerAssignment_4 ) )
            {
            // InternalSmartCity.g:772:1: ( ( rule__Node__ControllerAssignment_4 ) )
            // InternalSmartCity.g:773:2: ( rule__Node__ControllerAssignment_4 )
            {
             before(grammarAccess.getNodeAccess().getControllerAssignment_4()); 
            // InternalSmartCity.g:774:2: ( rule__Node__ControllerAssignment_4 )
            // InternalSmartCity.g:774:3: rule__Node__ControllerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Node__ControllerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getControllerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // InternalSmartCity.g:782:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:786:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // InternalSmartCity.g:787:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // InternalSmartCity.g:794:1: rule__Node__Group__5__Impl : ( ( rule__Node__LinksAssignment_5 )* ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:798:1: ( ( ( rule__Node__LinksAssignment_5 )* ) )
            // InternalSmartCity.g:799:1: ( ( rule__Node__LinksAssignment_5 )* )
            {
            // InternalSmartCity.g:799:1: ( ( rule__Node__LinksAssignment_5 )* )
            // InternalSmartCity.g:800:2: ( rule__Node__LinksAssignment_5 )*
            {
             before(grammarAccess.getNodeAccess().getLinksAssignment_5()); 
            // InternalSmartCity.g:801:2: ( rule__Node__LinksAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartCity.g:801:3: rule__Node__LinksAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Node__LinksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getLinksAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // InternalSmartCity.g:809:1: rule__Node__Group__6 : rule__Node__Group__6__Impl ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:813:1: ( rule__Node__Group__6__Impl )
            // InternalSmartCity.g:814:2: rule__Node__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // InternalSmartCity.g:820:1: rule__Node__Group__6__Impl : ( '}' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:824:1: ( ( '}' ) )
            // InternalSmartCity.g:825:1: ( '}' )
            {
            // InternalSmartCity.g:825:1: ( '}' )
            // InternalSmartCity.g:826:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSmartCity.g:836:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:840:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSmartCity.g:841:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalSmartCity.g:848:1: rule__Sensor__Group__0__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:852:1: ( ( 'sensor' ) )
            // InternalSmartCity.g:853:1: ( 'sensor' )
            {
            // InternalSmartCity.g:853:1: ( 'sensor' )
            // InternalSmartCity.g:854:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalSmartCity.g:863:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:867:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSmartCity.g:868:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalSmartCity.g:875:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:879:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalSmartCity.g:880:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalSmartCity.g:880:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalSmartCity.g:881:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalSmartCity.g:882:2: ( rule__Sensor__NameAssignment_1 )
            // InternalSmartCity.g:882:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalSmartCity.g:890:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:894:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalSmartCity.g:895:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalSmartCity.g:902:1: rule__Sensor__Group__2__Impl : ( 'type' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:906:1: ( ( 'type' ) )
            // InternalSmartCity.g:907:1: ( 'type' )
            {
            // InternalSmartCity.g:907:1: ( 'type' )
            // InternalSmartCity.g:908:2: 'type'
            {
             before(grammarAccess.getSensorAccess().getTypeKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalSmartCity.g:917:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:921:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalSmartCity.g:922:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalSmartCity.g:929:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__TypeAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:933:1: ( ( ( rule__Sensor__TypeAssignment_3 ) ) )
            // InternalSmartCity.g:934:1: ( ( rule__Sensor__TypeAssignment_3 ) )
            {
            // InternalSmartCity.g:934:1: ( ( rule__Sensor__TypeAssignment_3 ) )
            // InternalSmartCity.g:935:2: ( rule__Sensor__TypeAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_3()); 
            // InternalSmartCity.g:936:2: ( rule__Sensor__TypeAssignment_3 )
            // InternalSmartCity.g:936:3: rule__Sensor__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalSmartCity.g:944:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:948:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalSmartCity.g:949:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalSmartCity.g:956:1: rule__Sensor__Group__4__Impl : ( 'priority' ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:960:1: ( ( 'priority' ) )
            // InternalSmartCity.g:961:1: ( 'priority' )
            {
            // InternalSmartCity.g:961:1: ( 'priority' )
            // InternalSmartCity.g:962:2: 'priority'
            {
             before(grammarAccess.getSensorAccess().getPriorityKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getPriorityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalSmartCity.g:971:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:975:1: ( rule__Sensor__Group__5__Impl )
            // InternalSmartCity.g:976:2: rule__Sensor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalSmartCity.g:982:1: rule__Sensor__Group__5__Impl : ( ( rule__Sensor__PriorityAssignment_5 ) ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:986:1: ( ( ( rule__Sensor__PriorityAssignment_5 ) ) )
            // InternalSmartCity.g:987:1: ( ( rule__Sensor__PriorityAssignment_5 ) )
            {
            // InternalSmartCity.g:987:1: ( ( rule__Sensor__PriorityAssignment_5 ) )
            // InternalSmartCity.g:988:2: ( rule__Sensor__PriorityAssignment_5 )
            {
             before(grammarAccess.getSensorAccess().getPriorityAssignment_5()); 
            // InternalSmartCity.g:989:2: ( rule__Sensor__PriorityAssignment_5 )
            // InternalSmartCity.g:989:3: rule__Sensor__PriorityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__PriorityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getPriorityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__0"
    // InternalSmartCity.g:998:1: rule__CommunicationLink__Group__0 : rule__CommunicationLink__Group__0__Impl rule__CommunicationLink__Group__1 ;
    public final void rule__CommunicationLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1002:1: ( rule__CommunicationLink__Group__0__Impl rule__CommunicationLink__Group__1 )
            // InternalSmartCity.g:1003:2: rule__CommunicationLink__Group__0__Impl rule__CommunicationLink__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__CommunicationLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__0"


    // $ANTLR start "rule__CommunicationLink__Group__0__Impl"
    // InternalSmartCity.g:1010:1: rule__CommunicationLink__Group__0__Impl : ( 'link' ) ;
    public final void rule__CommunicationLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1014:1: ( ( 'link' ) )
            // InternalSmartCity.g:1015:1: ( 'link' )
            {
            // InternalSmartCity.g:1015:1: ( 'link' )
            // InternalSmartCity.g:1016:2: 'link'
            {
             before(grammarAccess.getCommunicationLinkAccess().getLinkKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__0__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__1"
    // InternalSmartCity.g:1025:1: rule__CommunicationLink__Group__1 : rule__CommunicationLink__Group__1__Impl rule__CommunicationLink__Group__2 ;
    public final void rule__CommunicationLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1029:1: ( rule__CommunicationLink__Group__1__Impl rule__CommunicationLink__Group__2 )
            // InternalSmartCity.g:1030:2: rule__CommunicationLink__Group__1__Impl rule__CommunicationLink__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__CommunicationLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__1"


    // $ANTLR start "rule__CommunicationLink__Group__1__Impl"
    // InternalSmartCity.g:1037:1: rule__CommunicationLink__Group__1__Impl : ( ( rule__CommunicationLink__TypeAssignment_1 ) ) ;
    public final void rule__CommunicationLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1041:1: ( ( ( rule__CommunicationLink__TypeAssignment_1 ) ) )
            // InternalSmartCity.g:1042:1: ( ( rule__CommunicationLink__TypeAssignment_1 ) )
            {
            // InternalSmartCity.g:1042:1: ( ( rule__CommunicationLink__TypeAssignment_1 ) )
            // InternalSmartCity.g:1043:2: ( rule__CommunicationLink__TypeAssignment_1 )
            {
             before(grammarAccess.getCommunicationLinkAccess().getTypeAssignment_1()); 
            // InternalSmartCity.g:1044:2: ( rule__CommunicationLink__TypeAssignment_1 )
            // InternalSmartCity.g:1044:3: rule__CommunicationLink__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationLink__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationLinkAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__1__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__2"
    // InternalSmartCity.g:1052:1: rule__CommunicationLink__Group__2 : rule__CommunicationLink__Group__2__Impl rule__CommunicationLink__Group__3 ;
    public final void rule__CommunicationLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1056:1: ( rule__CommunicationLink__Group__2__Impl rule__CommunicationLink__Group__3 )
            // InternalSmartCity.g:1057:2: rule__CommunicationLink__Group__2__Impl rule__CommunicationLink__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__CommunicationLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__2"


    // $ANTLR start "rule__CommunicationLink__Group__2__Impl"
    // InternalSmartCity.g:1064:1: rule__CommunicationLink__Group__2__Impl : ( 'from' ) ;
    public final void rule__CommunicationLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1068:1: ( ( 'from' ) )
            // InternalSmartCity.g:1069:1: ( 'from' )
            {
            // InternalSmartCity.g:1069:1: ( 'from' )
            // InternalSmartCity.g:1070:2: 'from'
            {
             before(grammarAccess.getCommunicationLinkAccess().getFromKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__2__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__3"
    // InternalSmartCity.g:1079:1: rule__CommunicationLink__Group__3 : rule__CommunicationLink__Group__3__Impl rule__CommunicationLink__Group__4 ;
    public final void rule__CommunicationLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1083:1: ( rule__CommunicationLink__Group__3__Impl rule__CommunicationLink__Group__4 )
            // InternalSmartCity.g:1084:2: rule__CommunicationLink__Group__3__Impl rule__CommunicationLink__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__CommunicationLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__3"


    // $ANTLR start "rule__CommunicationLink__Group__3__Impl"
    // InternalSmartCity.g:1091:1: rule__CommunicationLink__Group__3__Impl : ( ( rule__CommunicationLink__OriginAssignment_3 ) ) ;
    public final void rule__CommunicationLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1095:1: ( ( ( rule__CommunicationLink__OriginAssignment_3 ) ) )
            // InternalSmartCity.g:1096:1: ( ( rule__CommunicationLink__OriginAssignment_3 ) )
            {
            // InternalSmartCity.g:1096:1: ( ( rule__CommunicationLink__OriginAssignment_3 ) )
            // InternalSmartCity.g:1097:2: ( rule__CommunicationLink__OriginAssignment_3 )
            {
             before(grammarAccess.getCommunicationLinkAccess().getOriginAssignment_3()); 
            // InternalSmartCity.g:1098:2: ( rule__CommunicationLink__OriginAssignment_3 )
            // InternalSmartCity.g:1098:3: rule__CommunicationLink__OriginAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationLink__OriginAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationLinkAccess().getOriginAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__3__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__4"
    // InternalSmartCity.g:1106:1: rule__CommunicationLink__Group__4 : rule__CommunicationLink__Group__4__Impl rule__CommunicationLink__Group__5 ;
    public final void rule__CommunicationLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1110:1: ( rule__CommunicationLink__Group__4__Impl rule__CommunicationLink__Group__5 )
            // InternalSmartCity.g:1111:2: rule__CommunicationLink__Group__4__Impl rule__CommunicationLink__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__CommunicationLink__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__4"


    // $ANTLR start "rule__CommunicationLink__Group__4__Impl"
    // InternalSmartCity.g:1118:1: rule__CommunicationLink__Group__4__Impl : ( '->' ) ;
    public final void rule__CommunicationLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1122:1: ( ( '->' ) )
            // InternalSmartCity.g:1123:1: ( '->' )
            {
            // InternalSmartCity.g:1123:1: ( '->' )
            // InternalSmartCity.g:1124:2: '->'
            {
             before(grammarAccess.getCommunicationLinkAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__4__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__5"
    // InternalSmartCity.g:1133:1: rule__CommunicationLink__Group__5 : rule__CommunicationLink__Group__5__Impl rule__CommunicationLink__Group__6 ;
    public final void rule__CommunicationLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1137:1: ( rule__CommunicationLink__Group__5__Impl rule__CommunicationLink__Group__6 )
            // InternalSmartCity.g:1138:2: rule__CommunicationLink__Group__5__Impl rule__CommunicationLink__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__CommunicationLink__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__5"


    // $ANTLR start "rule__CommunicationLink__Group__5__Impl"
    // InternalSmartCity.g:1145:1: rule__CommunicationLink__Group__5__Impl : ( ( rule__CommunicationLink__DestinationAssignment_5 ) ) ;
    public final void rule__CommunicationLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1149:1: ( ( ( rule__CommunicationLink__DestinationAssignment_5 ) ) )
            // InternalSmartCity.g:1150:1: ( ( rule__CommunicationLink__DestinationAssignment_5 ) )
            {
            // InternalSmartCity.g:1150:1: ( ( rule__CommunicationLink__DestinationAssignment_5 ) )
            // InternalSmartCity.g:1151:2: ( rule__CommunicationLink__DestinationAssignment_5 )
            {
             before(grammarAccess.getCommunicationLinkAccess().getDestinationAssignment_5()); 
            // InternalSmartCity.g:1152:2: ( rule__CommunicationLink__DestinationAssignment_5 )
            // InternalSmartCity.g:1152:3: rule__CommunicationLink__DestinationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationLink__DestinationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationLinkAccess().getDestinationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__5__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__6"
    // InternalSmartCity.g:1160:1: rule__CommunicationLink__Group__6 : rule__CommunicationLink__Group__6__Impl rule__CommunicationLink__Group__7 ;
    public final void rule__CommunicationLink__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1164:1: ( rule__CommunicationLink__Group__6__Impl rule__CommunicationLink__Group__7 )
            // InternalSmartCity.g:1165:2: rule__CommunicationLink__Group__6__Impl rule__CommunicationLink__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__CommunicationLink__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__6"


    // $ANTLR start "rule__CommunicationLink__Group__6__Impl"
    // InternalSmartCity.g:1172:1: rule__CommunicationLink__Group__6__Impl : ( '{' ) ;
    public final void rule__CommunicationLink__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1176:1: ( ( '{' ) )
            // InternalSmartCity.g:1177:1: ( '{' )
            {
            // InternalSmartCity.g:1177:1: ( '{' )
            // InternalSmartCity.g:1178:2: '{'
            {
             before(grammarAccess.getCommunicationLinkAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__6__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__7"
    // InternalSmartCity.g:1187:1: rule__CommunicationLink__Group__7 : rule__CommunicationLink__Group__7__Impl rule__CommunicationLink__Group__8 ;
    public final void rule__CommunicationLink__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1191:1: ( rule__CommunicationLink__Group__7__Impl rule__CommunicationLink__Group__8 )
            // InternalSmartCity.g:1192:2: rule__CommunicationLink__Group__7__Impl rule__CommunicationLink__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__CommunicationLink__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__7"


    // $ANTLR start "rule__CommunicationLink__Group__7__Impl"
    // InternalSmartCity.g:1199:1: rule__CommunicationLink__Group__7__Impl : ( 'delay' ) ;
    public final void rule__CommunicationLink__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1203:1: ( ( 'delay' ) )
            // InternalSmartCity.g:1204:1: ( 'delay' )
            {
            // InternalSmartCity.g:1204:1: ( 'delay' )
            // InternalSmartCity.g:1205:2: 'delay'
            {
             before(grammarAccess.getCommunicationLinkAccess().getDelayKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getDelayKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__7__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__8"
    // InternalSmartCity.g:1214:1: rule__CommunicationLink__Group__8 : rule__CommunicationLink__Group__8__Impl rule__CommunicationLink__Group__9 ;
    public final void rule__CommunicationLink__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1218:1: ( rule__CommunicationLink__Group__8__Impl rule__CommunicationLink__Group__9 )
            // InternalSmartCity.g:1219:2: rule__CommunicationLink__Group__8__Impl rule__CommunicationLink__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__CommunicationLink__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__8"


    // $ANTLR start "rule__CommunicationLink__Group__8__Impl"
    // InternalSmartCity.g:1226:1: rule__CommunicationLink__Group__8__Impl : ( ( rule__CommunicationLink__DelayAssignment_8 ) ) ;
    public final void rule__CommunicationLink__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1230:1: ( ( ( rule__CommunicationLink__DelayAssignment_8 ) ) )
            // InternalSmartCity.g:1231:1: ( ( rule__CommunicationLink__DelayAssignment_8 ) )
            {
            // InternalSmartCity.g:1231:1: ( ( rule__CommunicationLink__DelayAssignment_8 ) )
            // InternalSmartCity.g:1232:2: ( rule__CommunicationLink__DelayAssignment_8 )
            {
             before(grammarAccess.getCommunicationLinkAccess().getDelayAssignment_8()); 
            // InternalSmartCity.g:1233:2: ( rule__CommunicationLink__DelayAssignment_8 )
            // InternalSmartCity.g:1233:3: rule__CommunicationLink__DelayAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationLink__DelayAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationLinkAccess().getDelayAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__8__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__9"
    // InternalSmartCity.g:1241:1: rule__CommunicationLink__Group__9 : rule__CommunicationLink__Group__9__Impl rule__CommunicationLink__Group__10 ;
    public final void rule__CommunicationLink__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1245:1: ( rule__CommunicationLink__Group__9__Impl rule__CommunicationLink__Group__10 )
            // InternalSmartCity.g:1246:2: rule__CommunicationLink__Group__9__Impl rule__CommunicationLink__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__CommunicationLink__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__9"


    // $ANTLR start "rule__CommunicationLink__Group__9__Impl"
    // InternalSmartCity.g:1253:1: rule__CommunicationLink__Group__9__Impl : ( 'datatype' ) ;
    public final void rule__CommunicationLink__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1257:1: ( ( 'datatype' ) )
            // InternalSmartCity.g:1258:1: ( 'datatype' )
            {
            // InternalSmartCity.g:1258:1: ( 'datatype' )
            // InternalSmartCity.g:1259:2: 'datatype'
            {
             before(grammarAccess.getCommunicationLinkAccess().getDatatypeKeyword_9()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getDatatypeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__9__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__10"
    // InternalSmartCity.g:1268:1: rule__CommunicationLink__Group__10 : rule__CommunicationLink__Group__10__Impl rule__CommunicationLink__Group__11 ;
    public final void rule__CommunicationLink__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1272:1: ( rule__CommunicationLink__Group__10__Impl rule__CommunicationLink__Group__11 )
            // InternalSmartCity.g:1273:2: rule__CommunicationLink__Group__10__Impl rule__CommunicationLink__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__CommunicationLink__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__10"


    // $ANTLR start "rule__CommunicationLink__Group__10__Impl"
    // InternalSmartCity.g:1280:1: rule__CommunicationLink__Group__10__Impl : ( ( rule__CommunicationLink__DatatypeAssignment_10 ) ) ;
    public final void rule__CommunicationLink__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1284:1: ( ( ( rule__CommunicationLink__DatatypeAssignment_10 ) ) )
            // InternalSmartCity.g:1285:1: ( ( rule__CommunicationLink__DatatypeAssignment_10 ) )
            {
            // InternalSmartCity.g:1285:1: ( ( rule__CommunicationLink__DatatypeAssignment_10 ) )
            // InternalSmartCity.g:1286:2: ( rule__CommunicationLink__DatatypeAssignment_10 )
            {
             before(grammarAccess.getCommunicationLinkAccess().getDatatypeAssignment_10()); 
            // InternalSmartCity.g:1287:2: ( rule__CommunicationLink__DatatypeAssignment_10 )
            // InternalSmartCity.g:1287:3: rule__CommunicationLink__DatatypeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationLink__DatatypeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationLinkAccess().getDatatypeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__10__Impl"


    // $ANTLR start "rule__CommunicationLink__Group__11"
    // InternalSmartCity.g:1295:1: rule__CommunicationLink__Group__11 : rule__CommunicationLink__Group__11__Impl ;
    public final void rule__CommunicationLink__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1299:1: ( rule__CommunicationLink__Group__11__Impl )
            // InternalSmartCity.g:1300:2: rule__CommunicationLink__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationLink__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__11"


    // $ANTLR start "rule__CommunicationLink__Group__11__Impl"
    // InternalSmartCity.g:1306:1: rule__CommunicationLink__Group__11__Impl : ( '}' ) ;
    public final void rule__CommunicationLink__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1310:1: ( ( '}' ) )
            // InternalSmartCity.g:1311:1: ( '}' )
            {
            // InternalSmartCity.g:1311:1: ( '}' )
            // InternalSmartCity.g:1312:2: '}'
            {
             before(grammarAccess.getCommunicationLinkAccess().getRightCurlyBracketKeyword_11()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__Group__11__Impl"


    // $ANTLR start "rule__Controller__Group__0"
    // InternalSmartCity.g:1322:1: rule__Controller__Group__0 : rule__Controller__Group__0__Impl rule__Controller__Group__1 ;
    public final void rule__Controller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1326:1: ( rule__Controller__Group__0__Impl rule__Controller__Group__1 )
            // InternalSmartCity.g:1327:2: rule__Controller__Group__0__Impl rule__Controller__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__0"


    // $ANTLR start "rule__Controller__Group__0__Impl"
    // InternalSmartCity.g:1334:1: rule__Controller__Group__0__Impl : ( 'controller' ) ;
    public final void rule__Controller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1338:1: ( ( 'controller' ) )
            // InternalSmartCity.g:1339:1: ( 'controller' )
            {
            // InternalSmartCity.g:1339:1: ( 'controller' )
            // InternalSmartCity.g:1340:2: 'controller'
            {
             before(grammarAccess.getControllerAccess().getControllerKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getControllerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__0__Impl"


    // $ANTLR start "rule__Controller__Group__1"
    // InternalSmartCity.g:1349:1: rule__Controller__Group__1 : rule__Controller__Group__1__Impl ;
    public final void rule__Controller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1353:1: ( rule__Controller__Group__1__Impl )
            // InternalSmartCity.g:1354:2: rule__Controller__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__1"


    // $ANTLR start "rule__Controller__Group__1__Impl"
    // InternalSmartCity.g:1360:1: rule__Controller__Group__1__Impl : ( ( rule__Controller__NameAssignment_1 ) ) ;
    public final void rule__Controller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1364:1: ( ( ( rule__Controller__NameAssignment_1 ) ) )
            // InternalSmartCity.g:1365:1: ( ( rule__Controller__NameAssignment_1 ) )
            {
            // InternalSmartCity.g:1365:1: ( ( rule__Controller__NameAssignment_1 ) )
            // InternalSmartCity.g:1366:2: ( rule__Controller__NameAssignment_1 )
            {
             before(grammarAccess.getControllerAccess().getNameAssignment_1()); 
            // InternalSmartCity.g:1367:2: ( rule__Controller__NameAssignment_1 )
            // InternalSmartCity.g:1367:3: rule__Controller__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__1__Impl"


    // $ANTLR start "rule__DelayRange__Group__0"
    // InternalSmartCity.g:1376:1: rule__DelayRange__Group__0 : rule__DelayRange__Group__0__Impl rule__DelayRange__Group__1 ;
    public final void rule__DelayRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1380:1: ( rule__DelayRange__Group__0__Impl rule__DelayRange__Group__1 )
            // InternalSmartCity.g:1381:2: rule__DelayRange__Group__0__Impl rule__DelayRange__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DelayRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelayRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__0"


    // $ANTLR start "rule__DelayRange__Group__0__Impl"
    // InternalSmartCity.g:1388:1: rule__DelayRange__Group__0__Impl : ( '[' ) ;
    public final void rule__DelayRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1392:1: ( ( '[' ) )
            // InternalSmartCity.g:1393:1: ( '[' )
            {
            // InternalSmartCity.g:1393:1: ( '[' )
            // InternalSmartCity.g:1394:2: '['
            {
             before(grammarAccess.getDelayRangeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDelayRangeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__0__Impl"


    // $ANTLR start "rule__DelayRange__Group__1"
    // InternalSmartCity.g:1403:1: rule__DelayRange__Group__1 : rule__DelayRange__Group__1__Impl rule__DelayRange__Group__2 ;
    public final void rule__DelayRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1407:1: ( rule__DelayRange__Group__1__Impl rule__DelayRange__Group__2 )
            // InternalSmartCity.g:1408:2: rule__DelayRange__Group__1__Impl rule__DelayRange__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__DelayRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelayRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__1"


    // $ANTLR start "rule__DelayRange__Group__1__Impl"
    // InternalSmartCity.g:1415:1: rule__DelayRange__Group__1__Impl : ( ( rule__DelayRange__MinAssignment_1 ) ) ;
    public final void rule__DelayRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1419:1: ( ( ( rule__DelayRange__MinAssignment_1 ) ) )
            // InternalSmartCity.g:1420:1: ( ( rule__DelayRange__MinAssignment_1 ) )
            {
            // InternalSmartCity.g:1420:1: ( ( rule__DelayRange__MinAssignment_1 ) )
            // InternalSmartCity.g:1421:2: ( rule__DelayRange__MinAssignment_1 )
            {
             before(grammarAccess.getDelayRangeAccess().getMinAssignment_1()); 
            // InternalSmartCity.g:1422:2: ( rule__DelayRange__MinAssignment_1 )
            // InternalSmartCity.g:1422:3: rule__DelayRange__MinAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DelayRange__MinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelayRangeAccess().getMinAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__1__Impl"


    // $ANTLR start "rule__DelayRange__Group__2"
    // InternalSmartCity.g:1430:1: rule__DelayRange__Group__2 : rule__DelayRange__Group__2__Impl rule__DelayRange__Group__3 ;
    public final void rule__DelayRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1434:1: ( rule__DelayRange__Group__2__Impl rule__DelayRange__Group__3 )
            // InternalSmartCity.g:1435:2: rule__DelayRange__Group__2__Impl rule__DelayRange__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DelayRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelayRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__2"


    // $ANTLR start "rule__DelayRange__Group__2__Impl"
    // InternalSmartCity.g:1442:1: rule__DelayRange__Group__2__Impl : ( '..' ) ;
    public final void rule__DelayRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1446:1: ( ( '..' ) )
            // InternalSmartCity.g:1447:1: ( '..' )
            {
            // InternalSmartCity.g:1447:1: ( '..' )
            // InternalSmartCity.g:1448:2: '..'
            {
             before(grammarAccess.getDelayRangeAccess().getFullStopFullStopKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDelayRangeAccess().getFullStopFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__2__Impl"


    // $ANTLR start "rule__DelayRange__Group__3"
    // InternalSmartCity.g:1457:1: rule__DelayRange__Group__3 : rule__DelayRange__Group__3__Impl rule__DelayRange__Group__4 ;
    public final void rule__DelayRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1461:1: ( rule__DelayRange__Group__3__Impl rule__DelayRange__Group__4 )
            // InternalSmartCity.g:1462:2: rule__DelayRange__Group__3__Impl rule__DelayRange__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__DelayRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelayRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__3"


    // $ANTLR start "rule__DelayRange__Group__3__Impl"
    // InternalSmartCity.g:1469:1: rule__DelayRange__Group__3__Impl : ( ( rule__DelayRange__MaxAssignment_3 ) ) ;
    public final void rule__DelayRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1473:1: ( ( ( rule__DelayRange__MaxAssignment_3 ) ) )
            // InternalSmartCity.g:1474:1: ( ( rule__DelayRange__MaxAssignment_3 ) )
            {
            // InternalSmartCity.g:1474:1: ( ( rule__DelayRange__MaxAssignment_3 ) )
            // InternalSmartCity.g:1475:2: ( rule__DelayRange__MaxAssignment_3 )
            {
             before(grammarAccess.getDelayRangeAccess().getMaxAssignment_3()); 
            // InternalSmartCity.g:1476:2: ( rule__DelayRange__MaxAssignment_3 )
            // InternalSmartCity.g:1476:3: rule__DelayRange__MaxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DelayRange__MaxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDelayRangeAccess().getMaxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__3__Impl"


    // $ANTLR start "rule__DelayRange__Group__4"
    // InternalSmartCity.g:1484:1: rule__DelayRange__Group__4 : rule__DelayRange__Group__4__Impl ;
    public final void rule__DelayRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1488:1: ( rule__DelayRange__Group__4__Impl )
            // InternalSmartCity.g:1489:2: rule__DelayRange__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelayRange__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__4"


    // $ANTLR start "rule__DelayRange__Group__4__Impl"
    // InternalSmartCity.g:1495:1: rule__DelayRange__Group__4__Impl : ( ']' ) ;
    public final void rule__DelayRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1499:1: ( ( ']' ) )
            // InternalSmartCity.g:1500:1: ( ']' )
            {
            // InternalSmartCity.g:1500:1: ( ']' )
            // InternalSmartCity.g:1501:2: ']'
            {
             before(grammarAccess.getDelayRangeAccess().getRightSquareBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDelayRangeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__Group__4__Impl"


    // $ANTLR start "rule__Model__NodesAssignment_0"
    // InternalSmartCity.g:1511:1: rule__Model__NodesAssignment_0 : ( ruleNode ) ;
    public final void rule__Model__NodesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1515:1: ( ( ruleNode ) )
            // InternalSmartCity.g:1516:2: ( ruleNode )
            {
            // InternalSmartCity.g:1516:2: ( ruleNode )
            // InternalSmartCity.g:1517:3: ruleNode
            {
             before(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NodesAssignment_0"


    // $ANTLR start "rule__Model__InteroperableLayerAssignment_1"
    // InternalSmartCity.g:1526:1: rule__Model__InteroperableLayerAssignment_1 : ( ruleLayer ) ;
    public final void rule__Model__InteroperableLayerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1530:1: ( ( ruleLayer ) )
            // InternalSmartCity.g:1531:2: ( ruleLayer )
            {
            // InternalSmartCity.g:1531:2: ( ruleLayer )
            // InternalSmartCity.g:1532:3: ruleLayer
            {
             before(grammarAccess.getModelAccess().getInteroperableLayerLayerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInteroperableLayerLayerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InteroperableLayerAssignment_1"


    // $ANTLR start "rule__Model__GlobalLinksAssignment_2"
    // InternalSmartCity.g:1541:1: rule__Model__GlobalLinksAssignment_2 : ( ruleCommunicationLink ) ;
    public final void rule__Model__GlobalLinksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1545:1: ( ( ruleCommunicationLink ) )
            // InternalSmartCity.g:1546:2: ( ruleCommunicationLink )
            {
            // InternalSmartCity.g:1546:2: ( ruleCommunicationLink )
            // InternalSmartCity.g:1547:3: ruleCommunicationLink
            {
             before(grammarAccess.getModelAccess().getGlobalLinksCommunicationLinkParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCommunicationLink();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGlobalLinksCommunicationLinkParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GlobalLinksAssignment_2"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // InternalSmartCity.g:1556:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1560:1: ( ( RULE_ID ) )
            // InternalSmartCity.g:1561:2: ( RULE_ID )
            {
            // InternalSmartCity.g:1561:2: ( RULE_ID )
            // InternalSmartCity.g:1562:3: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__NameAssignment_1"


    // $ANTLR start "rule__Layer__PriorityAssignment_3"
    // InternalSmartCity.g:1571:1: rule__Layer__PriorityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Layer__PriorityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1575:1: ( ( RULE_INT ) )
            // InternalSmartCity.g:1576:2: ( RULE_INT )
            {
            // InternalSmartCity.g:1576:2: ( RULE_INT )
            // InternalSmartCity.g:1577:3: RULE_INT
            {
             before(grammarAccess.getLayerAccess().getPriorityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getPriorityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__PriorityAssignment_3"


    // $ANTLR start "rule__Layer__DelayAssignment_5"
    // InternalSmartCity.g:1586:1: rule__Layer__DelayAssignment_5 : ( RULE_INT ) ;
    public final void rule__Layer__DelayAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1590:1: ( ( RULE_INT ) )
            // InternalSmartCity.g:1591:2: ( RULE_INT )
            {
            // InternalSmartCity.g:1591:2: ( RULE_INT )
            // InternalSmartCity.g:1592:3: RULE_INT
            {
             before(grammarAccess.getLayerAccess().getDelayINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getDelayINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__DelayAssignment_5"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalSmartCity.g:1601:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1605:1: ( ( RULE_ID ) )
            // InternalSmartCity.g:1606:2: ( RULE_ID )
            {
            // InternalSmartCity.g:1606:2: ( RULE_ID )
            // InternalSmartCity.g:1607:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__SensorsAssignment_3"
    // InternalSmartCity.g:1616:1: rule__Node__SensorsAssignment_3 : ( ruleSensor ) ;
    public final void rule__Node__SensorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1620:1: ( ( ruleSensor ) )
            // InternalSmartCity.g:1621:2: ( ruleSensor )
            {
            // InternalSmartCity.g:1621:2: ( ruleSensor )
            // InternalSmartCity.g:1622:3: ruleSensor
            {
             before(grammarAccess.getNodeAccess().getSensorsSensorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getSensorsSensorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__SensorsAssignment_3"


    // $ANTLR start "rule__Node__ControllerAssignment_4"
    // InternalSmartCity.g:1631:1: rule__Node__ControllerAssignment_4 : ( ruleController ) ;
    public final void rule__Node__ControllerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1635:1: ( ( ruleController ) )
            // InternalSmartCity.g:1636:2: ( ruleController )
            {
            // InternalSmartCity.g:1636:2: ( ruleController )
            // InternalSmartCity.g:1637:3: ruleController
            {
             before(grammarAccess.getNodeAccess().getControllerControllerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleController();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getControllerControllerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ControllerAssignment_4"


    // $ANTLR start "rule__Node__LinksAssignment_5"
    // InternalSmartCity.g:1646:1: rule__Node__LinksAssignment_5 : ( ruleCommunicationLink ) ;
    public final void rule__Node__LinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1650:1: ( ( ruleCommunicationLink ) )
            // InternalSmartCity.g:1651:2: ( ruleCommunicationLink )
            {
            // InternalSmartCity.g:1651:2: ( ruleCommunicationLink )
            // InternalSmartCity.g:1652:3: ruleCommunicationLink
            {
             before(grammarAccess.getNodeAccess().getLinksCommunicationLinkParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCommunicationLink();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getLinksCommunicationLinkParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__LinksAssignment_5"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalSmartCity.g:1661:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1665:1: ( ( RULE_ID ) )
            // InternalSmartCity.g:1666:2: ( RULE_ID )
            {
            // InternalSmartCity.g:1666:2: ( RULE_ID )
            // InternalSmartCity.g:1667:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__TypeAssignment_3"
    // InternalSmartCity.g:1676:1: rule__Sensor__TypeAssignment_3 : ( ruleSensorType ) ;
    public final void rule__Sensor__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1680:1: ( ( ruleSensorType ) )
            // InternalSmartCity.g:1681:2: ( ruleSensorType )
            {
            // InternalSmartCity.g:1681:2: ( ruleSensorType )
            // InternalSmartCity.g:1682:3: ruleSensorType
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__TypeAssignment_3"


    // $ANTLR start "rule__Sensor__PriorityAssignment_5"
    // InternalSmartCity.g:1691:1: rule__Sensor__PriorityAssignment_5 : ( RULE_INT ) ;
    public final void rule__Sensor__PriorityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1695:1: ( ( RULE_INT ) )
            // InternalSmartCity.g:1696:2: ( RULE_INT )
            {
            // InternalSmartCity.g:1696:2: ( RULE_INT )
            // InternalSmartCity.g:1697:3: RULE_INT
            {
             before(grammarAccess.getSensorAccess().getPriorityINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getPriorityINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__PriorityAssignment_5"


    // $ANTLR start "rule__CommunicationLink__TypeAssignment_1"
    // InternalSmartCity.g:1706:1: rule__CommunicationLink__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__CommunicationLink__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1710:1: ( ( ruleLinkType ) )
            // InternalSmartCity.g:1711:2: ( ruleLinkType )
            {
            // InternalSmartCity.g:1711:2: ( ruleLinkType )
            // InternalSmartCity.g:1712:3: ruleLinkType
            {
             before(grammarAccess.getCommunicationLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkType();

            state._fsp--;

             after(grammarAccess.getCommunicationLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__TypeAssignment_1"


    // $ANTLR start "rule__CommunicationLink__OriginAssignment_3"
    // InternalSmartCity.g:1721:1: rule__CommunicationLink__OriginAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CommunicationLink__OriginAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1725:1: ( ( ( RULE_ID ) ) )
            // InternalSmartCity.g:1726:2: ( ( RULE_ID ) )
            {
            // InternalSmartCity.g:1726:2: ( ( RULE_ID ) )
            // InternalSmartCity.g:1727:3: ( RULE_ID )
            {
             before(grammarAccess.getCommunicationLinkAccess().getOriginLinkableCrossReference_3_0()); 
            // InternalSmartCity.g:1728:3: ( RULE_ID )
            // InternalSmartCity.g:1729:4: RULE_ID
            {
             before(grammarAccess.getCommunicationLinkAccess().getOriginLinkableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getOriginLinkableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCommunicationLinkAccess().getOriginLinkableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__OriginAssignment_3"


    // $ANTLR start "rule__CommunicationLink__DestinationAssignment_5"
    // InternalSmartCity.g:1740:1: rule__CommunicationLink__DestinationAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CommunicationLink__DestinationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1744:1: ( ( ( RULE_ID ) ) )
            // InternalSmartCity.g:1745:2: ( ( RULE_ID ) )
            {
            // InternalSmartCity.g:1745:2: ( ( RULE_ID ) )
            // InternalSmartCity.g:1746:3: ( RULE_ID )
            {
             before(grammarAccess.getCommunicationLinkAccess().getDestinationLinkableCrossReference_5_0()); 
            // InternalSmartCity.g:1747:3: ( RULE_ID )
            // InternalSmartCity.g:1748:4: RULE_ID
            {
             before(grammarAccess.getCommunicationLinkAccess().getDestinationLinkableIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationLinkAccess().getDestinationLinkableIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCommunicationLinkAccess().getDestinationLinkableCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__DestinationAssignment_5"


    // $ANTLR start "rule__CommunicationLink__DelayAssignment_8"
    // InternalSmartCity.g:1759:1: rule__CommunicationLink__DelayAssignment_8 : ( ruleDelayRange ) ;
    public final void rule__CommunicationLink__DelayAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1763:1: ( ( ruleDelayRange ) )
            // InternalSmartCity.g:1764:2: ( ruleDelayRange )
            {
            // InternalSmartCity.g:1764:2: ( ruleDelayRange )
            // InternalSmartCity.g:1765:3: ruleDelayRange
            {
             before(grammarAccess.getCommunicationLinkAccess().getDelayDelayRangeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDelayRange();

            state._fsp--;

             after(grammarAccess.getCommunicationLinkAccess().getDelayDelayRangeParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__DelayAssignment_8"


    // $ANTLR start "rule__CommunicationLink__DatatypeAssignment_10"
    // InternalSmartCity.g:1774:1: rule__CommunicationLink__DatatypeAssignment_10 : ( ruleDataType ) ;
    public final void rule__CommunicationLink__DatatypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1778:1: ( ( ruleDataType ) )
            // InternalSmartCity.g:1779:2: ( ruleDataType )
            {
            // InternalSmartCity.g:1779:2: ( ruleDataType )
            // InternalSmartCity.g:1780:3: ruleDataType
            {
             before(grammarAccess.getCommunicationLinkAccess().getDatatypeDataTypeEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getCommunicationLinkAccess().getDatatypeDataTypeEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationLink__DatatypeAssignment_10"


    // $ANTLR start "rule__Controller__NameAssignment_1"
    // InternalSmartCity.g:1789:1: rule__Controller__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Controller__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1793:1: ( ( RULE_ID ) )
            // InternalSmartCity.g:1794:2: ( RULE_ID )
            {
            // InternalSmartCity.g:1794:2: ( RULE_ID )
            // InternalSmartCity.g:1795:3: RULE_ID
            {
             before(grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__NameAssignment_1"


    // $ANTLR start "rule__DelayRange__MinAssignment_1"
    // InternalSmartCity.g:1804:1: rule__DelayRange__MinAssignment_1 : ( RULE_INT ) ;
    public final void rule__DelayRange__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1808:1: ( ( RULE_INT ) )
            // InternalSmartCity.g:1809:2: ( RULE_INT )
            {
            // InternalSmartCity.g:1809:2: ( RULE_INT )
            // InternalSmartCity.g:1810:3: RULE_INT
            {
             before(grammarAccess.getDelayRangeAccess().getMinINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDelayRangeAccess().getMinINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__MinAssignment_1"


    // $ANTLR start "rule__DelayRange__MaxAssignment_3"
    // InternalSmartCity.g:1819:1: rule__DelayRange__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__DelayRange__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartCity.g:1823:1: ( ( RULE_INT ) )
            // InternalSmartCity.g:1824:2: ( RULE_INT )
            {
            // InternalSmartCity.g:1824:2: ( RULE_INT )
            // InternalSmartCity.g:1825:3: RULE_INT
            {
             before(grammarAccess.getDelayRangeAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDelayRangeAccess().getMaxINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayRange__MaxAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});

}