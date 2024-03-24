package org.xtext.mydsl.parser.antlr.internal;

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
import org.xtext.mydsl.services.FinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'portfolio'", "'{'", "'}'", "'bond'", "'faceValue'", "'couponRate'", "'maturity'", "'yieldRate'", "'option'", "'type'", "'underlyingPrice'", "'strikePrice'", "'timeToExpiration'", "'riskFreeRate'", "'volatility'", "'dividendYield'", "'cash'", "'amount'", "'buy'", "'sell'", "'deposit'", "'withdrawal'", "'view'", "'time'", "'delete'", "'.'", "'day'", "'month'", "'year'", "'Call'", "'Put'"
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
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFinParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFin.g"; }



     	private FinGrammarAccess grammarAccess;

        public InternalFinParser(TokenStream input, FinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFin.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFin.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalFin.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalFin.g:72:1: ruleModel returns [EObject current=null] : ( (lv_element_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;



        	enterRule();

        try {
            // InternalFin.g:78:2: ( ( (lv_element_0_0= ruleElement ) )* )
            // InternalFin.g:79:2: ( (lv_element_0_0= ruleElement ) )*
            {
            // InternalFin.g:79:2: ( (lv_element_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=29 && LA1_0<=33)||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFin.g:80:3: (lv_element_0_0= ruleElement )
            	    {
            	    // InternalFin.g:80:3: (lv_element_0_0= ruleElement )
            	    // InternalFin.g:81:4: lv_element_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_element_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"element",
            	    					lv_element_0_0,
            	    					"org.xtext.mydsl.Fin.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleElement"
    // InternalFin.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalFin.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalFin.g:102:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalFin.g:108:1: ruleElement returns [EObject current=null] : (this_Portfolio_0= rulePortfolio | this_Transaction_1= ruleTransaction | this_Action_2= ruleAction ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Portfolio_0 = null;

        EObject this_Transaction_1 = null;

        EObject this_Action_2 = null;



        	enterRule();

        try {
            // InternalFin.g:114:2: ( (this_Portfolio_0= rulePortfolio | this_Transaction_1= ruleTransaction | this_Action_2= ruleAction ) )
            // InternalFin.g:115:2: (this_Portfolio_0= rulePortfolio | this_Transaction_1= ruleTransaction | this_Action_2= ruleAction )
            {
            // InternalFin.g:115:2: (this_Portfolio_0= rulePortfolio | this_Transaction_1= ruleTransaction | this_Action_2= ruleAction )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt2=2;
                }
                break;
            case 33:
            case 35:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFin.g:116:3: this_Portfolio_0= rulePortfolio
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPortfolioParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Portfolio_0=rulePortfolio();

                    state._fsp--;


                    			current = this_Portfolio_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFin.g:125:3: this_Transaction_1= ruleTransaction
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTransactionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transaction_1=ruleTransaction();

                    state._fsp--;


                    			current = this_Transaction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFin.g:134:3: this_Action_2= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_2=ruleAction();

                    state._fsp--;


                    			current = this_Action_2;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAsset"
    // InternalFin.g:146:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalFin.g:146:46: (iv_ruleAsset= ruleAsset EOF )
            // InternalFin.g:147:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
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
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalFin.g:153:1: ruleAsset returns [EObject current=null] : (this_Bond_0= ruleBond | this_Option_1= ruleOption | this_Cash_2= ruleCash ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        EObject this_Bond_0 = null;

        EObject this_Option_1 = null;

        EObject this_Cash_2 = null;



        	enterRule();

        try {
            // InternalFin.g:159:2: ( (this_Bond_0= ruleBond | this_Option_1= ruleOption | this_Cash_2= ruleCash ) )
            // InternalFin.g:160:2: (this_Bond_0= ruleBond | this_Option_1= ruleOption | this_Cash_2= ruleCash )
            {
            // InternalFin.g:160:2: (this_Bond_0= ruleBond | this_Option_1= ruleOption | this_Cash_2= ruleCash )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 27:
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
                    // InternalFin.g:161:3: this_Bond_0= ruleBond
                    {

                    			newCompositeNode(grammarAccess.getAssetAccess().getBondParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bond_0=ruleBond();

                    state._fsp--;


                    			current = this_Bond_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFin.g:170:3: this_Option_1= ruleOption
                    {

                    			newCompositeNode(grammarAccess.getAssetAccess().getOptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Option_1=ruleOption();

                    state._fsp--;


                    			current = this_Option_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFin.g:179:3: this_Cash_2= ruleCash
                    {

                    			newCompositeNode(grammarAccess.getAssetAccess().getCashParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cash_2=ruleCash();

                    state._fsp--;


                    			current = this_Cash_2;
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
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleTransaction"
    // InternalFin.g:191:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalFin.g:191:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalFin.g:192:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
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
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalFin.g:198:1: ruleTransaction returns [EObject current=null] : (this_Buy_0= ruleBuy | this_Sell_1= ruleSell | this_Deposit_2= ruleDeposit | this_Withdrawal_3= ruleWithdrawal ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        EObject this_Buy_0 = null;

        EObject this_Sell_1 = null;

        EObject this_Deposit_2 = null;

        EObject this_Withdrawal_3 = null;



        	enterRule();

        try {
            // InternalFin.g:204:2: ( (this_Buy_0= ruleBuy | this_Sell_1= ruleSell | this_Deposit_2= ruleDeposit | this_Withdrawal_3= ruleWithdrawal ) )
            // InternalFin.g:205:2: (this_Buy_0= ruleBuy | this_Sell_1= ruleSell | this_Deposit_2= ruleDeposit | this_Withdrawal_3= ruleWithdrawal )
            {
            // InternalFin.g:205:2: (this_Buy_0= ruleBuy | this_Sell_1= ruleSell | this_Deposit_2= ruleDeposit | this_Withdrawal_3= ruleWithdrawal )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFin.g:206:3: this_Buy_0= ruleBuy
                    {

                    			newCompositeNode(grammarAccess.getTransactionAccess().getBuyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Buy_0=ruleBuy();

                    state._fsp--;


                    			current = this_Buy_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFin.g:215:3: this_Sell_1= ruleSell
                    {

                    			newCompositeNode(grammarAccess.getTransactionAccess().getSellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sell_1=ruleSell();

                    state._fsp--;


                    			current = this_Sell_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFin.g:224:3: this_Deposit_2= ruleDeposit
                    {

                    			newCompositeNode(grammarAccess.getTransactionAccess().getDepositParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Deposit_2=ruleDeposit();

                    state._fsp--;


                    			current = this_Deposit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFin.g:233:3: this_Withdrawal_3= ruleWithdrawal
                    {

                    			newCompositeNode(grammarAccess.getTransactionAccess().getWithdrawalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Withdrawal_3=ruleWithdrawal();

                    state._fsp--;


                    			current = this_Withdrawal_3;
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
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleAction"
    // InternalFin.g:245:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalFin.g:245:47: (iv_ruleAction= ruleAction EOF )
            // InternalFin.g:246:2: iv_ruleAction= ruleAction EOF
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
    // InternalFin.g:252:1: ruleAction returns [EObject current=null] : (this_View_0= ruleView | this_Delete_1= ruleDelete ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_View_0 = null;

        EObject this_Delete_1 = null;



        	enterRule();

        try {
            // InternalFin.g:258:2: ( (this_View_0= ruleView | this_Delete_1= ruleDelete ) )
            // InternalFin.g:259:2: (this_View_0= ruleView | this_Delete_1= ruleDelete )
            {
            // InternalFin.g:259:2: (this_View_0= ruleView | this_Delete_1= ruleDelete )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFin.g:260:3: this_View_0= ruleView
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getViewParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_View_0=ruleView();

                    state._fsp--;


                    			current = this_View_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFin.g:269:3: this_Delete_1= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDeleteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_1=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_1;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePortfolio"
    // InternalFin.g:281:1: entryRulePortfolio returns [EObject current=null] : iv_rulePortfolio= rulePortfolio EOF ;
    public final EObject entryRulePortfolio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortfolio = null;


        try {
            // InternalFin.g:281:50: (iv_rulePortfolio= rulePortfolio EOF )
            // InternalFin.g:282:2: iv_rulePortfolio= rulePortfolio EOF
            {
             newCompositeNode(grammarAccess.getPortfolioRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortfolio=rulePortfolio();

            state._fsp--;

             current =iv_rulePortfolio; 
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
    // $ANTLR end "entryRulePortfolio"


    // $ANTLR start "rulePortfolio"
    // InternalFin.g:288:1: rulePortfolio returns [EObject current=null] : (otherlv_0= 'portfolio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_asset_3_0= ruleAsset ) )+ otherlv_4= '}' ) ;
    public final EObject rulePortfolio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_asset_3_0 = null;



        	enterRule();

        try {
            // InternalFin.g:294:2: ( (otherlv_0= 'portfolio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_asset_3_0= ruleAsset ) )+ otherlv_4= '}' ) )
            // InternalFin.g:295:2: (otherlv_0= 'portfolio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_asset_3_0= ruleAsset ) )+ otherlv_4= '}' )
            {
            // InternalFin.g:295:2: (otherlv_0= 'portfolio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_asset_3_0= ruleAsset ) )+ otherlv_4= '}' )
            // InternalFin.g:296:3: otherlv_0= 'portfolio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_asset_3_0= ruleAsset ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPortfolioAccess().getPortfolioKeyword_0());
            		
            // InternalFin.g:300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFin.g:301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFin.g:301:4: (lv_name_1_0= RULE_ID )
            // InternalFin.g:302:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPortfolioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortfolioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPortfolioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFin.g:322:3: ( (lv_asset_3_0= ruleAsset ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14||LA6_0==19||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFin.g:323:4: (lv_asset_3_0= ruleAsset )
            	    {
            	    // InternalFin.g:323:4: (lv_asset_3_0= ruleAsset )
            	    // InternalFin.g:324:5: lv_asset_3_0= ruleAsset
            	    {

            	    					newCompositeNode(grammarAccess.getPortfolioAccess().getAssetAssetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_asset_3_0=ruleAsset();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortfolioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"asset",
            	    						lv_asset_3_0,
            	    						"org.xtext.mydsl.Fin.Asset");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPortfolioAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePortfolio"


    // $ANTLR start "entryRuleBond"
    // InternalFin.g:349:1: entryRuleBond returns [EObject current=null] : iv_ruleBond= ruleBond EOF ;
    public final EObject entryRuleBond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBond = null;


        try {
            // InternalFin.g:349:45: (iv_ruleBond= ruleBond EOF )
            // InternalFin.g:350:2: iv_ruleBond= ruleBond EOF
            {
             newCompositeNode(grammarAccess.getBondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBond=ruleBond();

            state._fsp--;

             current =iv_ruleBond; 
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
    // $ANTLR end "entryRuleBond"


    // $ANTLR start "ruleBond"
    // InternalFin.g:356:1: ruleBond returns [EObject current=null] : (otherlv_0= 'bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' ) ;
    public final EObject ruleBond() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_maturity_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_faceValue_4_0 = null;

        AntlrDatatypeRuleToken lv_couponRate_6_0 = null;

        AntlrDatatypeRuleToken lv_yieldRate_10_0 = null;



        	enterRule();

        try {
            // InternalFin.g:362:2: ( (otherlv_0= 'bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' ) )
            // InternalFin.g:363:2: (otherlv_0= 'bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' )
            {
            // InternalFin.g:363:2: (otherlv_0= 'bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' )
            // InternalFin.g:364:3: otherlv_0= 'bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBondAccess().getBondKeyword_0());
            		
            // InternalFin.g:368:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFin.g:369:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFin.g:369:4: (lv_name_1_0= RULE_ID )
            // InternalFin.g:370:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBondAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBondRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getBondAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getBondAccess().getFaceValueKeyword_3());
            		
            // InternalFin.g:394:3: ( (lv_faceValue_4_0= ruleFLOAT ) )
            // InternalFin.g:395:4: (lv_faceValue_4_0= ruleFLOAT )
            {
            // InternalFin.g:395:4: (lv_faceValue_4_0= ruleFLOAT )
            // InternalFin.g:396:5: lv_faceValue_4_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getBondAccess().getFaceValueFLOATParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_faceValue_4_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBondRule());
            					}
            					set(
            						current,
            						"faceValue",
            						lv_faceValue_4_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getBondAccess().getCouponRateKeyword_5());
            		
            // InternalFin.g:417:3: ( (lv_couponRate_6_0= ruleFLOAT ) )
            // InternalFin.g:418:4: (lv_couponRate_6_0= ruleFLOAT )
            {
            // InternalFin.g:418:4: (lv_couponRate_6_0= ruleFLOAT )
            // InternalFin.g:419:5: lv_couponRate_6_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getBondAccess().getCouponRateFLOATParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_couponRate_6_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBondRule());
            					}
            					set(
            						current,
            						"couponRate",
            						lv_couponRate_6_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getBondAccess().getMaturityKeyword_7());
            		
            // InternalFin.g:440:3: ( (lv_maturity_8_0= RULE_INT ) )
            // InternalFin.g:441:4: (lv_maturity_8_0= RULE_INT )
            {
            // InternalFin.g:441:4: (lv_maturity_8_0= RULE_INT )
            // InternalFin.g:442:5: lv_maturity_8_0= RULE_INT
            {
            lv_maturity_8_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_maturity_8_0, grammarAccess.getBondAccess().getMaturityINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBondRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maturity",
            						lv_maturity_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getBondAccess().getYieldRateKeyword_9());
            		
            // InternalFin.g:462:3: ( (lv_yieldRate_10_0= ruleFLOAT ) )
            // InternalFin.g:463:4: (lv_yieldRate_10_0= ruleFLOAT )
            {
            // InternalFin.g:463:4: (lv_yieldRate_10_0= ruleFLOAT )
            // InternalFin.g:464:5: lv_yieldRate_10_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getBondAccess().getYieldRateFLOATParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_yieldRate_10_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBondRule());
            					}
            					set(
            						current,
            						"yieldRate",
            						lv_yieldRate_10_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBondAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleBond"


    // $ANTLR start "entryRuleOption"
    // InternalFin.g:489:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalFin.g:489:47: (iv_ruleOption= ruleOption EOF )
            // InternalFin.g:490:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalFin.g:496:1: ruleOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_underlyingPrice_6_0 = null;

        AntlrDatatypeRuleToken lv_strikePrice_8_0 = null;

        AntlrDatatypeRuleToken lv_timeToExpiration_10_0 = null;

        AntlrDatatypeRuleToken lv_riskFreeRate_12_0 = null;

        AntlrDatatypeRuleToken lv_volatility_14_0 = null;

        AntlrDatatypeRuleToken lv_dividendYield_16_0 = null;



        	enterRule();

        try {
            // InternalFin.g:502:2: ( (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' ) )
            // InternalFin.g:503:2: (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' )
            {
            // InternalFin.g:503:2: (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' )
            // InternalFin.g:504:3: otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionKeyword_0());
            		
            // InternalFin.g:508:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFin.g:509:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFin.g:509:4: (lv_name_1_0= RULE_ID )
            // InternalFin.g:510:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getTypeKeyword_3());
            		
            // InternalFin.g:534:3: ( (lv_type_4_0= ruleOptionType ) )
            // InternalFin.g:535:4: (lv_type_4_0= ruleOptionType )
            {
            // InternalFin.g:535:4: (lv_type_4_0= ruleOptionType )
            // InternalFin.g:536:5: lv_type_4_0= ruleOptionType
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getTypeOptionTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_4_0=ruleOptionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.mydsl.Fin.OptionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getOptionAccess().getUnderlyingPriceKeyword_5());
            		
            // InternalFin.g:557:3: ( (lv_underlyingPrice_6_0= ruleFLOAT ) )
            // InternalFin.g:558:4: (lv_underlyingPrice_6_0= ruleFLOAT )
            {
            // InternalFin.g:558:4: (lv_underlyingPrice_6_0= ruleFLOAT )
            // InternalFin.g:559:5: lv_underlyingPrice_6_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getUnderlyingPriceFLOATParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_underlyingPrice_6_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"underlyingPrice",
            						lv_underlyingPrice_6_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getOptionAccess().getStrikePriceKeyword_7());
            		
            // InternalFin.g:580:3: ( (lv_strikePrice_8_0= ruleFLOAT ) )
            // InternalFin.g:581:4: (lv_strikePrice_8_0= ruleFLOAT )
            {
            // InternalFin.g:581:4: (lv_strikePrice_8_0= ruleFLOAT )
            // InternalFin.g:582:5: lv_strikePrice_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getStrikePriceFLOATParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_strikePrice_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"strikePrice",
            						lv_strikePrice_8_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getOptionAccess().getTimeToExpirationKeyword_9());
            		
            // InternalFin.g:603:3: ( (lv_timeToExpiration_10_0= ruleFLOAT ) )
            // InternalFin.g:604:4: (lv_timeToExpiration_10_0= ruleFLOAT )
            {
            // InternalFin.g:604:4: (lv_timeToExpiration_10_0= ruleFLOAT )
            // InternalFin.g:605:5: lv_timeToExpiration_10_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getTimeToExpirationFLOATParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_20);
            lv_timeToExpiration_10_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"timeToExpiration",
            						lv_timeToExpiration_10_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getOptionAccess().getRiskFreeRateKeyword_11());
            		
            // InternalFin.g:626:3: ( (lv_riskFreeRate_12_0= ruleFLOAT ) )
            // InternalFin.g:627:4: (lv_riskFreeRate_12_0= ruleFLOAT )
            {
            // InternalFin.g:627:4: (lv_riskFreeRate_12_0= ruleFLOAT )
            // InternalFin.g:628:5: lv_riskFreeRate_12_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getRiskFreeRateFLOATParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_riskFreeRate_12_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"riskFreeRate",
            						lv_riskFreeRate_12_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getOptionAccess().getVolatilityKeyword_13());
            		
            // InternalFin.g:649:3: ( (lv_volatility_14_0= ruleFLOAT ) )
            // InternalFin.g:650:4: (lv_volatility_14_0= ruleFLOAT )
            {
            // InternalFin.g:650:4: (lv_volatility_14_0= ruleFLOAT )
            // InternalFin.g:651:5: lv_volatility_14_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getVolatilityFLOATParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_22);
            lv_volatility_14_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"volatility",
            						lv_volatility_14_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getOptionAccess().getDividendYieldKeyword_15());
            		
            // InternalFin.g:672:3: ( (lv_dividendYield_16_0= ruleFLOAT ) )
            // InternalFin.g:673:4: (lv_dividendYield_16_0= ruleFLOAT )
            {
            // InternalFin.g:673:4: (lv_dividendYield_16_0= ruleFLOAT )
            // InternalFin.g:674:5: lv_dividendYield_16_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getDividendYieldFLOATParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_14);
            lv_dividendYield_16_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"dividendYield",
            						lv_dividendYield_16_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleCash"
    // InternalFin.g:699:1: entryRuleCash returns [EObject current=null] : iv_ruleCash= ruleCash EOF ;
    public final EObject entryRuleCash() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCash = null;


        try {
            // InternalFin.g:699:45: (iv_ruleCash= ruleCash EOF )
            // InternalFin.g:700:2: iv_ruleCash= ruleCash EOF
            {
             newCompositeNode(grammarAccess.getCashRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCash=ruleCash();

            state._fsp--;

             current =iv_ruleCash; 
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
    // $ANTLR end "entryRuleCash"


    // $ANTLR start "ruleCash"
    // InternalFin.g:706:1: ruleCash returns [EObject current=null] : (otherlv_0= 'cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' ) ;
    public final EObject ruleCash() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_amount_3_0 = null;



        	enterRule();

        try {
            // InternalFin.g:712:2: ( (otherlv_0= 'cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' ) )
            // InternalFin.g:713:2: (otherlv_0= 'cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            {
            // InternalFin.g:713:2: (otherlv_0= 'cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            // InternalFin.g:714:3: otherlv_0= 'cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCashAccess().getCashKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCashAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCashAccess().getAmountKeyword_2());
            		
            // InternalFin.g:726:3: ( (lv_amount_3_0= ruleFLOAT ) )
            // InternalFin.g:727:4: (lv_amount_3_0= ruleFLOAT )
            {
            // InternalFin.g:727:4: (lv_amount_3_0= ruleFLOAT )
            // InternalFin.g:728:5: lv_amount_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getCashAccess().getAmountFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_amount_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCashRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_3_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCashAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCash"


    // $ANTLR start "entryRuleBuy"
    // InternalFin.g:753:1: entryRuleBuy returns [EObject current=null] : iv_ruleBuy= ruleBuy EOF ;
    public final EObject entryRuleBuy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuy = null;


        try {
            // InternalFin.g:753:44: (iv_ruleBuy= ruleBuy EOF )
            // InternalFin.g:754:2: iv_ruleBuy= ruleBuy EOF
            {
             newCompositeNode(grammarAccess.getBuyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuy=ruleBuy();

            state._fsp--;

             current =iv_ruleBuy; 
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
    // $ANTLR end "entryRuleBuy"


    // $ANTLR start "ruleBuy"
    // InternalFin.g:760:1: ruleBuy returns [EObject current=null] : (otherlv_0= 'buy' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) ( ( (lv_bond_4_0= ruleBond ) ) | ( (lv_option_5_0= ruleOption ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleBuy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_bond_4_0 = null;

        EObject lv_option_5_0 = null;



        	enterRule();

        try {
            // InternalFin.g:766:2: ( (otherlv_0= 'buy' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) ( ( (lv_bond_4_0= ruleBond ) ) | ( (lv_option_5_0= ruleOption ) ) )+ otherlv_6= '}' ) )
            // InternalFin.g:767:2: (otherlv_0= 'buy' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) ( ( (lv_bond_4_0= ruleBond ) ) | ( (lv_option_5_0= ruleOption ) ) )+ otherlv_6= '}' )
            {
            // InternalFin.g:767:2: (otherlv_0= 'buy' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) ( ( (lv_bond_4_0= ruleBond ) ) | ( (lv_option_5_0= ruleOption ) ) )+ otherlv_6= '}' )
            // InternalFin.g:768:3: otherlv_0= 'buy' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) ( ( (lv_bond_4_0= ruleBond ) ) | ( (lv_option_5_0= ruleOption ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBuyAccess().getBuyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getBuyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBuyAccess().getPortfolioKeyword_2());
            		
            // InternalFin.g:780:3: ( (otherlv_3= RULE_ID ) )
            // InternalFin.g:781:4: (otherlv_3= RULE_ID )
            {
            // InternalFin.g:781:4: (otherlv_3= RULE_ID )
            // InternalFin.g:782:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getBuyAccess().getPortfolioPortfolioCrossReference_3_0());
            				

            }


            }

            // InternalFin.g:793:3: ( ( (lv_bond_4_0= ruleBond ) ) | ( (lv_option_5_0= ruleOption ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }
                else if ( (LA7_0==19) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFin.g:794:4: ( (lv_bond_4_0= ruleBond ) )
            	    {
            	    // InternalFin.g:794:4: ( (lv_bond_4_0= ruleBond ) )
            	    // InternalFin.g:795:5: (lv_bond_4_0= ruleBond )
            	    {
            	    // InternalFin.g:795:5: (lv_bond_4_0= ruleBond )
            	    // InternalFin.g:796:6: lv_bond_4_0= ruleBond
            	    {

            	    						newCompositeNode(grammarAccess.getBuyAccess().getBondBondParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_bond_4_0=ruleBond();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBuyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bond",
            	    							lv_bond_4_0,
            	    							"org.xtext.mydsl.Fin.Bond");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFin.g:814:4: ( (lv_option_5_0= ruleOption ) )
            	    {
            	    // InternalFin.g:814:4: ( (lv_option_5_0= ruleOption ) )
            	    // InternalFin.g:815:5: (lv_option_5_0= ruleOption )
            	    {
            	    // InternalFin.g:815:5: (lv_option_5_0= ruleOption )
            	    // InternalFin.g:816:6: lv_option_5_0= ruleOption
            	    {

            	    						newCompositeNode(grammarAccess.getBuyAccess().getOptionOptionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_option_5_0=ruleOption();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBuyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"option",
            	    							lv_option_5_0,
            	    							"org.xtext.mydsl.Fin.Option");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBuyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBuy"


    // $ANTLR start "entryRuleSell"
    // InternalFin.g:842:1: entryRuleSell returns [EObject current=null] : iv_ruleSell= ruleSell EOF ;
    public final EObject entryRuleSell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSell = null;


        try {
            // InternalFin.g:842:45: (iv_ruleSell= ruleSell EOF )
            // InternalFin.g:843:2: iv_ruleSell= ruleSell EOF
            {
             newCompositeNode(grammarAccess.getSellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSell=ruleSell();

            state._fsp--;

             current =iv_ruleSell; 
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
    // $ANTLR end "entryRuleSell"


    // $ANTLR start "ruleSell"
    // InternalFin.g:849:1: ruleSell returns [EObject current=null] : (otherlv_0= 'sell' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'bond' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'option' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleSell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalFin.g:855:2: ( (otherlv_0= 'sell' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'bond' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'option' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) )
            // InternalFin.g:856:2: (otherlv_0= 'sell' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'bond' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'option' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            {
            // InternalFin.g:856:2: (otherlv_0= 'sell' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'bond' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'option' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            // InternalFin.g:857:3: otherlv_0= 'sell' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'bond' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'option' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSellAccess().getSellKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSellAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSellAccess().getPortfolioKeyword_2());
            		
            // InternalFin.g:869:3: ( (otherlv_3= RULE_ID ) )
            // InternalFin.g:870:4: (otherlv_3= RULE_ID )
            {
            // InternalFin.g:870:4: (otherlv_3= RULE_ID )
            // InternalFin.g:871:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSellRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_3, grammarAccess.getSellAccess().getPortfolioPortfolioCrossReference_3_0());
            				

            }


            }

            // InternalFin.g:882:3: (otherlv_4= 'bond' ( (otherlv_5= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFin.g:883:4: otherlv_4= 'bond' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSellAccess().getBondKeyword_4_0());
            	    			
            	    // InternalFin.g:887:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalFin.g:888:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalFin.g:888:5: (otherlv_5= RULE_ID )
            	    // InternalFin.g:889:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSellRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSellAccess().getBondBondCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalFin.g:901:3: (otherlv_6= 'option' ( (otherlv_7= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFin.g:902:4: otherlv_6= 'option' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSellAccess().getOptionKeyword_5_0());
            	    			
            	    // InternalFin.g:906:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalFin.g:907:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalFin.g:907:5: (otherlv_7= RULE_ID )
            	    // InternalFin.g:908:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSellRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    						newLeafNode(otherlv_7, grammarAccess.getSellAccess().getOptionOptionCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSellAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSell"


    // $ANTLR start "entryRuleDeposit"
    // InternalFin.g:928:1: entryRuleDeposit returns [EObject current=null] : iv_ruleDeposit= ruleDeposit EOF ;
    public final EObject entryRuleDeposit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeposit = null;


        try {
            // InternalFin.g:928:48: (iv_ruleDeposit= ruleDeposit EOF )
            // InternalFin.g:929:2: iv_ruleDeposit= ruleDeposit EOF
            {
             newCompositeNode(grammarAccess.getDepositRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeposit=ruleDeposit();

            state._fsp--;

             current =iv_ruleDeposit; 
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
    // $ANTLR end "entryRuleDeposit"


    // $ANTLR start "ruleDeposit"
    // InternalFin.g:935:1: ruleDeposit returns [EObject current=null] : (otherlv_0= 'deposit' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' ) ;
    public final EObject ruleDeposit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_amount_5_0 = null;



        	enterRule();

        try {
            // InternalFin.g:941:2: ( (otherlv_0= 'deposit' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' ) )
            // InternalFin.g:942:2: (otherlv_0= 'deposit' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' )
            {
            // InternalFin.g:942:2: (otherlv_0= 'deposit' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' )
            // InternalFin.g:943:3: otherlv_0= 'deposit' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDepositAccess().getDepositKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDepositAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDepositAccess().getPortfolioKeyword_2());
            		
            // InternalFin.g:955:3: ( (otherlv_3= RULE_ID ) )
            // InternalFin.g:956:4: (otherlv_3= RULE_ID )
            {
            // InternalFin.g:956:4: (otherlv_3= RULE_ID )
            // InternalFin.g:957:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepositRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getDepositAccess().getPortfolioPortfolioCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDepositAccess().getAmountKeyword_4());
            		
            // InternalFin.g:972:3: ( (lv_amount_5_0= ruleFLOAT ) )
            // InternalFin.g:973:4: (lv_amount_5_0= ruleFLOAT )
            {
            // InternalFin.g:973:4: (lv_amount_5_0= ruleFLOAT )
            // InternalFin.g:974:5: lv_amount_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getDepositAccess().getAmountFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_amount_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepositRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_5_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDepositAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDeposit"


    // $ANTLR start "entryRuleWithdrawal"
    // InternalFin.g:999:1: entryRuleWithdrawal returns [EObject current=null] : iv_ruleWithdrawal= ruleWithdrawal EOF ;
    public final EObject entryRuleWithdrawal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithdrawal = null;


        try {
            // InternalFin.g:999:51: (iv_ruleWithdrawal= ruleWithdrawal EOF )
            // InternalFin.g:1000:2: iv_ruleWithdrawal= ruleWithdrawal EOF
            {
             newCompositeNode(grammarAccess.getWithdrawalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithdrawal=ruleWithdrawal();

            state._fsp--;

             current =iv_ruleWithdrawal; 
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
    // $ANTLR end "entryRuleWithdrawal"


    // $ANTLR start "ruleWithdrawal"
    // InternalFin.g:1006:1: ruleWithdrawal returns [EObject current=null] : (otherlv_0= 'withdrawal' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' ) ;
    public final EObject ruleWithdrawal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_amount_5_0 = null;



        	enterRule();

        try {
            // InternalFin.g:1012:2: ( (otherlv_0= 'withdrawal' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' ) )
            // InternalFin.g:1013:2: (otherlv_0= 'withdrawal' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' )
            {
            // InternalFin.g:1013:2: (otherlv_0= 'withdrawal' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' )
            // InternalFin.g:1014:3: otherlv_0= 'withdrawal' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWithdrawalAccess().getWithdrawalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getWithdrawalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getWithdrawalAccess().getPortfolioKeyword_2());
            		
            // InternalFin.g:1026:3: ( (otherlv_3= RULE_ID ) )
            // InternalFin.g:1027:4: (otherlv_3= RULE_ID )
            {
            // InternalFin.g:1027:4: (otherlv_3= RULE_ID )
            // InternalFin.g:1028:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithdrawalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getWithdrawalAccess().getPortfolioPortfolioCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getWithdrawalAccess().getAmountKeyword_4());
            		
            // InternalFin.g:1043:3: ( (lv_amount_5_0= ruleFLOAT ) )
            // InternalFin.g:1044:4: (lv_amount_5_0= ruleFLOAT )
            {
            // InternalFin.g:1044:4: (lv_amount_5_0= ruleFLOAT )
            // InternalFin.g:1045:5: lv_amount_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getWithdrawalAccess().getAmountFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_amount_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithdrawalRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_5_0,
            						"org.xtext.mydsl.Fin.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWithdrawalAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWithdrawal"


    // $ANTLR start "entryRuleView"
    // InternalFin.g:1070:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // InternalFin.g:1070:45: (iv_ruleView= ruleView EOF )
            // InternalFin.g:1071:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // InternalFin.g:1077:1: ruleView returns [EObject current=null] : (otherlv_0= 'view' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'time' ( (lv_range_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeUnit ) ) otherlv_7= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_range_5_0=null;
        Token otherlv_7=null;
        Enumerator lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalFin.g:1083:2: ( (otherlv_0= 'view' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'time' ( (lv_range_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeUnit ) ) otherlv_7= '}' ) )
            // InternalFin.g:1084:2: (otherlv_0= 'view' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'time' ( (lv_range_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeUnit ) ) otherlv_7= '}' )
            {
            // InternalFin.g:1084:2: (otherlv_0= 'view' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'time' ( (lv_range_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeUnit ) ) otherlv_7= '}' )
            // InternalFin.g:1085:3: otherlv_0= 'view' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'time' ( (lv_range_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeUnit ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getViewAccess().getPortfolioKeyword_2());
            		
            // InternalFin.g:1097:3: ( (otherlv_3= RULE_ID ) )
            // InternalFin.g:1098:4: (otherlv_3= RULE_ID )
            {
            // InternalFin.g:1098:4: (otherlv_3= RULE_ID )
            // InternalFin.g:1099:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViewRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_3, grammarAccess.getViewAccess().getPortfolioPortfolioCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getViewAccess().getTimeKeyword_4());
            		
            // InternalFin.g:1114:3: ( (lv_range_5_0= RULE_INT ) )
            // InternalFin.g:1115:4: (lv_range_5_0= RULE_INT )
            {
            // InternalFin.g:1115:4: (lv_range_5_0= RULE_INT )
            // InternalFin.g:1116:5: lv_range_5_0= RULE_INT
            {
            lv_range_5_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_range_5_0, grammarAccess.getViewAccess().getRangeINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"range",
            						lv_range_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalFin.g:1132:3: ( (lv_unit_6_0= ruleTimeUnit ) )
            // InternalFin.g:1133:4: (lv_unit_6_0= ruleTimeUnit )
            {
            // InternalFin.g:1133:4: (lv_unit_6_0= ruleTimeUnit )
            // InternalFin.g:1134:5: lv_unit_6_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getViewAccess().getUnitTimeUnitEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_unit_6_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getViewRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_6_0,
            						"org.xtext.mydsl.Fin.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleDelete"
    // InternalFin.g:1159:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalFin.g:1159:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalFin.g:1160:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalFin.g:1166:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFin.g:1172:2: ( (otherlv_0= 'delete' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalFin.g:1173:2: (otherlv_0= 'delete' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalFin.g:1173:2: (otherlv_0= 'delete' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // InternalFin.g:1174:3: otherlv_0= 'delete' otherlv_1= '{' otherlv_2= 'portfolio' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getPortfolioKeyword_2());
            		
            // InternalFin.g:1186:3: ( (otherlv_3= RULE_ID ) )
            // InternalFin.g:1187:4: (otherlv_3= RULE_ID )
            {
            // InternalFin.g:1187:4: (otherlv_3= RULE_ID )
            // InternalFin.g:1188:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getDeleteAccess().getPortfolioPortfolioCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleFLOAT"
    // InternalFin.g:1207:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFin.g:1209:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalFin.g:1210:2: iv_ruleFLOAT= ruleFLOAT EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalFin.g:1219:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFin.g:1226:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalFin.g:1227:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFin.g:1227:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalFin.g:1228:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalFin.g:1228:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFin.g:1229:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,36,FOLLOW_12); 

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "ruleTimeUnit"
    // InternalFin.g:1256:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFin.g:1262:2: ( ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) ) )
            // InternalFin.g:1263:2: ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) )
            {
            // InternalFin.g:1263:2: ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 39:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFin.g:1264:3: (enumLiteral_0= 'day' )
                    {
                    // InternalFin.g:1264:3: (enumLiteral_0= 'day' )
                    // InternalFin.g:1265:4: enumLiteral_0= 'day'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFin.g:1272:3: (enumLiteral_1= 'month' )
                    {
                    // InternalFin.g:1272:3: (enumLiteral_1= 'month' )
                    // InternalFin.g:1273:4: enumLiteral_1= 'month'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFin.g:1280:3: (enumLiteral_2= 'year' )
                    {
                    // InternalFin.g:1280:3: (enumLiteral_2= 'year' )
                    // InternalFin.g:1281:4: enumLiteral_2= 'year'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getYearEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getYearEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleOptionType"
    // InternalFin.g:1291:1: ruleOptionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) ) ;
    public final Enumerator ruleOptionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFin.g:1297:2: ( ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) ) )
            // InternalFin.g:1298:2: ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) )
            {
            // InternalFin.g:1298:2: ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFin.g:1299:3: (enumLiteral_0= 'Call' )
                    {
                    // InternalFin.g:1299:3: (enumLiteral_0= 'Call' )
                    // InternalFin.g:1300:4: enumLiteral_0= 'Call'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOptionTypeAccess().getCallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOptionTypeAccess().getCallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFin.g:1307:3: (enumLiteral_1= 'Put' )
                    {
                    // InternalFin.g:1307:3: (enumLiteral_1= 'Put' )
                    // InternalFin.g:1308:4: enumLiteral_1= 'Put'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOptionTypeAccess().getPutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOptionTypeAccess().getPutEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOptionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000BE0000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008084000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008086000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});

}