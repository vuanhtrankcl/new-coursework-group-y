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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Portfolio'", "'{'", "'}'", "'Bond'", "'faceValue'", "'couponRate'", "'maturity'", "'yieldRate'", "'Option'", "'type'", "'underlyingPrice'", "'strikePrice'", "'timeToExpiration'", "'riskFreeRate'", "'volatility'", "'dividendYield'", "'Cash'", "'amount'", "'Buy'", "'Sell'", "'assetName'", "'Deposit'", "'Withdrawal'", "'Display'", "'Porfolio'", "'All'", "'.'", "'Call'", "'Put'"
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

                if ( (LA1_0==11||(LA1_0>=29 && LA1_0<=30)||(LA1_0>=32 && LA1_0<=34)) ) {
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
            case 32:
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
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
            case 32:
                {
                alt4=3;
                }
                break;
            case 33:
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
    // InternalFin.g:252:1: ruleAction returns [EObject current=null] : this_Display_0= ruleDisplay ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Display_0 = null;



        	enterRule();

        try {
            // InternalFin.g:258:2: (this_Display_0= ruleDisplay )
            // InternalFin.g:259:2: this_Display_0= ruleDisplay
            {

            		newCompositeNode(grammarAccess.getActionAccess().getDisplayParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Display_0=ruleDisplay();

            state._fsp--;


            		current = this_Display_0;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePortfolio"
    // InternalFin.g:270:1: entryRulePortfolio returns [EObject current=null] : iv_rulePortfolio= rulePortfolio EOF ;
    public final EObject entryRulePortfolio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortfolio = null;


        try {
            // InternalFin.g:270:50: (iv_rulePortfolio= rulePortfolio EOF )
            // InternalFin.g:271:2: iv_rulePortfolio= rulePortfolio EOF
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
    // InternalFin.g:277:1: rulePortfolio returns [EObject current=null] : (otherlv_0= 'Portfolio' otherlv_1= '{' ( (lv_asset_2_0= ruleAsset ) )+ otherlv_3= '}' ) ;
    public final EObject rulePortfolio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_asset_2_0 = null;



        	enterRule();

        try {
            // InternalFin.g:283:2: ( (otherlv_0= 'Portfolio' otherlv_1= '{' ( (lv_asset_2_0= ruleAsset ) )+ otherlv_3= '}' ) )
            // InternalFin.g:284:2: (otherlv_0= 'Portfolio' otherlv_1= '{' ( (lv_asset_2_0= ruleAsset ) )+ otherlv_3= '}' )
            {
            // InternalFin.g:284:2: (otherlv_0= 'Portfolio' otherlv_1= '{' ( (lv_asset_2_0= ruleAsset ) )+ otherlv_3= '}' )
            // InternalFin.g:285:3: otherlv_0= 'Portfolio' otherlv_1= '{' ( (lv_asset_2_0= ruleAsset ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPortfolioAccess().getPortfolioKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortfolioAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFin.g:293:3: ( (lv_asset_2_0= ruleAsset ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14||LA5_0==19||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFin.g:294:4: (lv_asset_2_0= ruleAsset )
            	    {
            	    // InternalFin.g:294:4: (lv_asset_2_0= ruleAsset )
            	    // InternalFin.g:295:5: lv_asset_2_0= ruleAsset
            	    {

            	    					newCompositeNode(grammarAccess.getPortfolioAccess().getAssetAssetParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_asset_2_0=ruleAsset();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortfolioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"asset",
            	    						lv_asset_2_0,
            	    						"org.xtext.mydsl.Fin.Asset");
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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPortfolioAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalFin.g:320:1: entryRuleBond returns [EObject current=null] : iv_ruleBond= ruleBond EOF ;
    public final EObject entryRuleBond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBond = null;


        try {
            // InternalFin.g:320:45: (iv_ruleBond= ruleBond EOF )
            // InternalFin.g:321:2: iv_ruleBond= ruleBond EOF
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
    // InternalFin.g:327:1: ruleBond returns [EObject current=null] : (otherlv_0= 'Bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' ) ;
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
            // InternalFin.g:333:2: ( (otherlv_0= 'Bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' ) )
            // InternalFin.g:334:2: (otherlv_0= 'Bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' )
            {
            // InternalFin.g:334:2: (otherlv_0= 'Bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}' )
            // InternalFin.g:335:3: otherlv_0= 'Bond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'faceValue' ( (lv_faceValue_4_0= ruleFLOAT ) ) otherlv_5= 'couponRate' ( (lv_couponRate_6_0= ruleFLOAT ) ) otherlv_7= 'maturity' ( (lv_maturity_8_0= RULE_INT ) ) otherlv_9= 'yieldRate' ( (lv_yieldRate_10_0= ruleFLOAT ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBondAccess().getBondKeyword_0());
            		
            // InternalFin.g:339:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFin.g:340:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFin.g:340:4: (lv_name_1_0= RULE_ID )
            // InternalFin.g:341:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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
            		
            // InternalFin.g:365:3: ( (lv_faceValue_4_0= ruleFLOAT ) )
            // InternalFin.g:366:4: (lv_faceValue_4_0= ruleFLOAT )
            {
            // InternalFin.g:366:4: (lv_faceValue_4_0= ruleFLOAT )
            // InternalFin.g:367:5: lv_faceValue_4_0= ruleFLOAT
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
            		
            // InternalFin.g:388:3: ( (lv_couponRate_6_0= ruleFLOAT ) )
            // InternalFin.g:389:4: (lv_couponRate_6_0= ruleFLOAT )
            {
            // InternalFin.g:389:4: (lv_couponRate_6_0= ruleFLOAT )
            // InternalFin.g:390:5: lv_couponRate_6_0= ruleFLOAT
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
            		
            // InternalFin.g:411:3: ( (lv_maturity_8_0= RULE_INT ) )
            // InternalFin.g:412:4: (lv_maturity_8_0= RULE_INT )
            {
            // InternalFin.g:412:4: (lv_maturity_8_0= RULE_INT )
            // InternalFin.g:413:5: lv_maturity_8_0= RULE_INT
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
            		
            // InternalFin.g:433:3: ( (lv_yieldRate_10_0= ruleFLOAT ) )
            // InternalFin.g:434:4: (lv_yieldRate_10_0= ruleFLOAT )
            {
            // InternalFin.g:434:4: (lv_yieldRate_10_0= ruleFLOAT )
            // InternalFin.g:435:5: lv_yieldRate_10_0= ruleFLOAT
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
    // InternalFin.g:460:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalFin.g:460:47: (iv_ruleOption= ruleOption EOF )
            // InternalFin.g:461:2: iv_ruleOption= ruleOption EOF
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
    // InternalFin.g:467:1: ruleOption returns [EObject current=null] : (otherlv_0= 'Option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' ) ;
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
            // InternalFin.g:473:2: ( (otherlv_0= 'Option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' ) )
            // InternalFin.g:474:2: (otherlv_0= 'Option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' )
            {
            // InternalFin.g:474:2: (otherlv_0= 'Option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}' )
            // InternalFin.g:475:3: otherlv_0= 'Option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleOptionType ) ) otherlv_5= 'underlyingPrice' ( (lv_underlyingPrice_6_0= ruleFLOAT ) ) otherlv_7= 'strikePrice' ( (lv_strikePrice_8_0= ruleFLOAT ) ) otherlv_9= 'timeToExpiration' ( (lv_timeToExpiration_10_0= ruleFLOAT ) ) otherlv_11= 'riskFreeRate' ( (lv_riskFreeRate_12_0= ruleFLOAT ) ) otherlv_13= 'volatility' ( (lv_volatility_14_0= ruleFLOAT ) ) otherlv_15= 'dividendYield' ( (lv_dividendYield_16_0= ruleFLOAT ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionKeyword_0());
            		
            // InternalFin.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFin.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFin.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalFin.g:481:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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
            		
            // InternalFin.g:505:3: ( (lv_type_4_0= ruleOptionType ) )
            // InternalFin.g:506:4: (lv_type_4_0= ruleOptionType )
            {
            // InternalFin.g:506:4: (lv_type_4_0= ruleOptionType )
            // InternalFin.g:507:5: lv_type_4_0= ruleOptionType
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
            		
            // InternalFin.g:528:3: ( (lv_underlyingPrice_6_0= ruleFLOAT ) )
            // InternalFin.g:529:4: (lv_underlyingPrice_6_0= ruleFLOAT )
            {
            // InternalFin.g:529:4: (lv_underlyingPrice_6_0= ruleFLOAT )
            // InternalFin.g:530:5: lv_underlyingPrice_6_0= ruleFLOAT
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
            		
            // InternalFin.g:551:3: ( (lv_strikePrice_8_0= ruleFLOAT ) )
            // InternalFin.g:552:4: (lv_strikePrice_8_0= ruleFLOAT )
            {
            // InternalFin.g:552:4: (lv_strikePrice_8_0= ruleFLOAT )
            // InternalFin.g:553:5: lv_strikePrice_8_0= ruleFLOAT
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
            		
            // InternalFin.g:574:3: ( (lv_timeToExpiration_10_0= ruleFLOAT ) )
            // InternalFin.g:575:4: (lv_timeToExpiration_10_0= ruleFLOAT )
            {
            // InternalFin.g:575:4: (lv_timeToExpiration_10_0= ruleFLOAT )
            // InternalFin.g:576:5: lv_timeToExpiration_10_0= ruleFLOAT
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
            		
            // InternalFin.g:597:3: ( (lv_riskFreeRate_12_0= ruleFLOAT ) )
            // InternalFin.g:598:4: (lv_riskFreeRate_12_0= ruleFLOAT )
            {
            // InternalFin.g:598:4: (lv_riskFreeRate_12_0= ruleFLOAT )
            // InternalFin.g:599:5: lv_riskFreeRate_12_0= ruleFLOAT
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
            		
            // InternalFin.g:620:3: ( (lv_volatility_14_0= ruleFLOAT ) )
            // InternalFin.g:621:4: (lv_volatility_14_0= ruleFLOAT )
            {
            // InternalFin.g:621:4: (lv_volatility_14_0= ruleFLOAT )
            // InternalFin.g:622:5: lv_volatility_14_0= ruleFLOAT
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
            		
            // InternalFin.g:643:3: ( (lv_dividendYield_16_0= ruleFLOAT ) )
            // InternalFin.g:644:4: (lv_dividendYield_16_0= ruleFLOAT )
            {
            // InternalFin.g:644:4: (lv_dividendYield_16_0= ruleFLOAT )
            // InternalFin.g:645:5: lv_dividendYield_16_0= ruleFLOAT
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
    // InternalFin.g:670:1: entryRuleCash returns [EObject current=null] : iv_ruleCash= ruleCash EOF ;
    public final EObject entryRuleCash() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCash = null;


        try {
            // InternalFin.g:670:45: (iv_ruleCash= ruleCash EOF )
            // InternalFin.g:671:2: iv_ruleCash= ruleCash EOF
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
    // InternalFin.g:677:1: ruleCash returns [EObject current=null] : (otherlv_0= 'Cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' ) ;
    public final EObject ruleCash() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_amount_3_0 = null;



        	enterRule();

        try {
            // InternalFin.g:683:2: ( (otherlv_0= 'Cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' ) )
            // InternalFin.g:684:2: (otherlv_0= 'Cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            {
            // InternalFin.g:684:2: (otherlv_0= 'Cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            // InternalFin.g:685:3: otherlv_0= 'Cash' otherlv_1= '{' otherlv_2= 'amount' ( (lv_amount_3_0= ruleFLOAT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCashAccess().getCashKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCashAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCashAccess().getAmountKeyword_2());
            		
            // InternalFin.g:697:3: ( (lv_amount_3_0= ruleFLOAT ) )
            // InternalFin.g:698:4: (lv_amount_3_0= ruleFLOAT )
            {
            // InternalFin.g:698:4: (lv_amount_3_0= ruleFLOAT )
            // InternalFin.g:699:5: lv_amount_3_0= ruleFLOAT
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
    // InternalFin.g:724:1: entryRuleBuy returns [EObject current=null] : iv_ruleBuy= ruleBuy EOF ;
    public final EObject entryRuleBuy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuy = null;


        try {
            // InternalFin.g:724:44: (iv_ruleBuy= ruleBuy EOF )
            // InternalFin.g:725:2: iv_ruleBuy= ruleBuy EOF
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
    // InternalFin.g:731:1: ruleBuy returns [EObject current=null] : (otherlv_0= 'Buy' otherlv_1= '{' ( ( (lv_bond_2_0= ruleBond ) ) | ( (lv_option_3_0= ruleOption ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleBuy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_bond_2_0 = null;

        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalFin.g:737:2: ( (otherlv_0= 'Buy' otherlv_1= '{' ( ( (lv_bond_2_0= ruleBond ) ) | ( (lv_option_3_0= ruleOption ) ) ) otherlv_4= '}' ) )
            // InternalFin.g:738:2: (otherlv_0= 'Buy' otherlv_1= '{' ( ( (lv_bond_2_0= ruleBond ) ) | ( (lv_option_3_0= ruleOption ) ) ) otherlv_4= '}' )
            {
            // InternalFin.g:738:2: (otherlv_0= 'Buy' otherlv_1= '{' ( ( (lv_bond_2_0= ruleBond ) ) | ( (lv_option_3_0= ruleOption ) ) ) otherlv_4= '}' )
            // InternalFin.g:739:3: otherlv_0= 'Buy' otherlv_1= '{' ( ( (lv_bond_2_0= ruleBond ) ) | ( (lv_option_3_0= ruleOption ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBuyAccess().getBuyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getBuyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFin.g:747:3: ( ( (lv_bond_2_0= ruleBond ) ) | ( (lv_option_3_0= ruleOption ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFin.g:748:4: ( (lv_bond_2_0= ruleBond ) )
                    {
                    // InternalFin.g:748:4: ( (lv_bond_2_0= ruleBond ) )
                    // InternalFin.g:749:5: (lv_bond_2_0= ruleBond )
                    {
                    // InternalFin.g:749:5: (lv_bond_2_0= ruleBond )
                    // InternalFin.g:750:6: lv_bond_2_0= ruleBond
                    {

                    						newCompositeNode(grammarAccess.getBuyAccess().getBondBondParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_bond_2_0=ruleBond();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuyRule());
                    						}
                    						set(
                    							current,
                    							"bond",
                    							lv_bond_2_0,
                    							"org.xtext.mydsl.Fin.Bond");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFin.g:768:4: ( (lv_option_3_0= ruleOption ) )
                    {
                    // InternalFin.g:768:4: ( (lv_option_3_0= ruleOption ) )
                    // InternalFin.g:769:5: (lv_option_3_0= ruleOption )
                    {
                    // InternalFin.g:769:5: (lv_option_3_0= ruleOption )
                    // InternalFin.g:770:6: lv_option_3_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getBuyAccess().getOptionOptionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_option_3_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuyRule());
                    						}
                    						set(
                    							current,
                    							"option",
                    							lv_option_3_0,
                    							"org.xtext.mydsl.Fin.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBuyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalFin.g:796:1: entryRuleSell returns [EObject current=null] : iv_ruleSell= ruleSell EOF ;
    public final EObject entryRuleSell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSell = null;


        try {
            // InternalFin.g:796:45: (iv_ruleSell= ruleSell EOF )
            // InternalFin.g:797:2: iv_ruleSell= ruleSell EOF
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
    // InternalFin.g:803:1: ruleSell returns [EObject current=null] : (otherlv_0= 'Sell' otherlv_1= '{' otherlv_2= 'assetName' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' ) ;
    public final EObject ruleSell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_amount_5_0 = null;



        	enterRule();

        try {
            // InternalFin.g:809:2: ( (otherlv_0= 'Sell' otherlv_1= '{' otherlv_2= 'assetName' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' ) )
            // InternalFin.g:810:2: (otherlv_0= 'Sell' otherlv_1= '{' otherlv_2= 'assetName' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' )
            {
            // InternalFin.g:810:2: (otherlv_0= 'Sell' otherlv_1= '{' otherlv_2= 'assetName' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}' )
            // InternalFin.g:811:3: otherlv_0= 'Sell' otherlv_1= '{' otherlv_2= 'assetName' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleFLOAT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSellAccess().getSellKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getSellAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSellAccess().getAssetNameKeyword_2());
            		
            // InternalFin.g:823:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFin.g:824:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFin.g:824:4: (lv_name_3_0= RULE_ID )
            // InternalFin.g:825:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSellAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSellAccess().getAmountKeyword_4());
            		
            // InternalFin.g:845:3: ( (lv_amount_5_0= ruleFLOAT ) )
            // InternalFin.g:846:4: (lv_amount_5_0= ruleFLOAT )
            {
            // InternalFin.g:846:4: (lv_amount_5_0= ruleFLOAT )
            // InternalFin.g:847:5: lv_amount_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getSellAccess().getAmountFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_amount_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSellRule());
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

            			newLeafNode(otherlv_6, grammarAccess.getSellAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalFin.g:872:1: entryRuleDeposit returns [EObject current=null] : iv_ruleDeposit= ruleDeposit EOF ;
    public final EObject entryRuleDeposit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeposit = null;


        try {
            // InternalFin.g:872:48: (iv_ruleDeposit= ruleDeposit EOF )
            // InternalFin.g:873:2: iv_ruleDeposit= ruleDeposit EOF
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
    // InternalFin.g:879:1: ruleDeposit returns [EObject current=null] : (otherlv_0= 'Deposit' ( (lv_amount_1_0= ruleFLOAT ) ) ) ;
    public final EObject ruleDeposit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_amount_1_0 = null;



        	enterRule();

        try {
            // InternalFin.g:885:2: ( (otherlv_0= 'Deposit' ( (lv_amount_1_0= ruleFLOAT ) ) ) )
            // InternalFin.g:886:2: (otherlv_0= 'Deposit' ( (lv_amount_1_0= ruleFLOAT ) ) )
            {
            // InternalFin.g:886:2: (otherlv_0= 'Deposit' ( (lv_amount_1_0= ruleFLOAT ) ) )
            // InternalFin.g:887:3: otherlv_0= 'Deposit' ( (lv_amount_1_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDepositAccess().getDepositKeyword_0());
            		
            // InternalFin.g:891:3: ( (lv_amount_1_0= ruleFLOAT ) )
            // InternalFin.g:892:4: (lv_amount_1_0= ruleFLOAT )
            {
            // InternalFin.g:892:4: (lv_amount_1_0= ruleFLOAT )
            // InternalFin.g:893:5: lv_amount_1_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getDepositAccess().getAmountFLOATParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_amount_1_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepositRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.xtext.mydsl.Fin.FLOAT");
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
    // $ANTLR end "ruleDeposit"


    // $ANTLR start "entryRuleWithdrawal"
    // InternalFin.g:914:1: entryRuleWithdrawal returns [EObject current=null] : iv_ruleWithdrawal= ruleWithdrawal EOF ;
    public final EObject entryRuleWithdrawal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithdrawal = null;


        try {
            // InternalFin.g:914:51: (iv_ruleWithdrawal= ruleWithdrawal EOF )
            // InternalFin.g:915:2: iv_ruleWithdrawal= ruleWithdrawal EOF
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
    // InternalFin.g:921:1: ruleWithdrawal returns [EObject current=null] : (otherlv_0= 'Withdrawal' ( (lv_amount_1_0= ruleFLOAT ) ) ) ;
    public final EObject ruleWithdrawal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_amount_1_0 = null;



        	enterRule();

        try {
            // InternalFin.g:927:2: ( (otherlv_0= 'Withdrawal' ( (lv_amount_1_0= ruleFLOAT ) ) ) )
            // InternalFin.g:928:2: (otherlv_0= 'Withdrawal' ( (lv_amount_1_0= ruleFLOAT ) ) )
            {
            // InternalFin.g:928:2: (otherlv_0= 'Withdrawal' ( (lv_amount_1_0= ruleFLOAT ) ) )
            // InternalFin.g:929:3: otherlv_0= 'Withdrawal' ( (lv_amount_1_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWithdrawalAccess().getWithdrawalKeyword_0());
            		
            // InternalFin.g:933:3: ( (lv_amount_1_0= ruleFLOAT ) )
            // InternalFin.g:934:4: (lv_amount_1_0= ruleFLOAT )
            {
            // InternalFin.g:934:4: (lv_amount_1_0= ruleFLOAT )
            // InternalFin.g:935:5: lv_amount_1_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getWithdrawalAccess().getAmountFLOATParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_amount_1_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithdrawalRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.xtext.mydsl.Fin.FLOAT");
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
    // $ANTLR end "ruleWithdrawal"


    // $ANTLR start "entryRuleDisplay"
    // InternalFin.g:956:1: entryRuleDisplay returns [EObject current=null] : iv_ruleDisplay= ruleDisplay EOF ;
    public final EObject entryRuleDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplay = null;


        try {
            // InternalFin.g:956:48: (iv_ruleDisplay= ruleDisplay EOF )
            // InternalFin.g:957:2: iv_ruleDisplay= ruleDisplay EOF
            {
             newCompositeNode(grammarAccess.getDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplay=ruleDisplay();

            state._fsp--;

             current =iv_ruleDisplay; 
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
    // $ANTLR end "entryRuleDisplay"


    // $ANTLR start "ruleDisplay"
    // InternalFin.g:963:1: ruleDisplay returns [EObject current=null] : (otherlv_0= 'Display' ( (lv_displayType_1_0= ruleDisplayType ) ) ) ;
    public final EObject ruleDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_displayType_1_0 = null;



        	enterRule();

        try {
            // InternalFin.g:969:2: ( (otherlv_0= 'Display' ( (lv_displayType_1_0= ruleDisplayType ) ) ) )
            // InternalFin.g:970:2: (otherlv_0= 'Display' ( (lv_displayType_1_0= ruleDisplayType ) ) )
            {
            // InternalFin.g:970:2: (otherlv_0= 'Display' ( (lv_displayType_1_0= ruleDisplayType ) ) )
            // InternalFin.g:971:3: otherlv_0= 'Display' ( (lv_displayType_1_0= ruleDisplayType ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDisplayAccess().getDisplayKeyword_0());
            		
            // InternalFin.g:975:3: ( (lv_displayType_1_0= ruleDisplayType ) )
            // InternalFin.g:976:4: (lv_displayType_1_0= ruleDisplayType )
            {
            // InternalFin.g:976:4: (lv_displayType_1_0= ruleDisplayType )
            // InternalFin.g:977:5: lv_displayType_1_0= ruleDisplayType
            {

            					newCompositeNode(grammarAccess.getDisplayAccess().getDisplayTypeDisplayTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_displayType_1_0=ruleDisplayType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisplayRule());
            					}
            					set(
            						current,
            						"displayType",
            						lv_displayType_1_0,
            						"org.xtext.mydsl.Fin.DisplayType");
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
    // $ANTLR end "ruleDisplay"


    // $ANTLR start "entryRuleDisplayType"
    // InternalFin.g:998:1: entryRuleDisplayType returns [String current=null] : iv_ruleDisplayType= ruleDisplayType EOF ;
    public final String entryRuleDisplayType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayType = null;


        try {
            // InternalFin.g:998:51: (iv_ruleDisplayType= ruleDisplayType EOF )
            // InternalFin.g:999:2: iv_ruleDisplayType= ruleDisplayType EOF
            {
             newCompositeNode(grammarAccess.getDisplayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplayType=ruleDisplayType();

            state._fsp--;

             current =iv_ruleDisplayType.getText(); 
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
    // $ANTLR end "entryRuleDisplayType"


    // $ANTLR start "ruleDisplayType"
    // InternalFin.g:1005:1: ruleDisplayType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Porfolio' | kw= 'Bond' | kw= 'Option' | kw= 'Cash' | kw= 'All' ) ;
    public final AntlrDatatypeRuleToken ruleDisplayType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFin.g:1011:2: ( (kw= 'Porfolio' | kw= 'Bond' | kw= 'Option' | kw= 'Cash' | kw= 'All' ) )
            // InternalFin.g:1012:2: (kw= 'Porfolio' | kw= 'Bond' | kw= 'Option' | kw= 'Cash' | kw= 'All' )
            {
            // InternalFin.g:1012:2: (kw= 'Porfolio' | kw= 'Bond' | kw= 'Option' | kw= 'Cash' | kw= 'All' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFin.g:1013:3: kw= 'Porfolio'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDisplayTypeAccess().getPorfolioKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFin.g:1019:3: kw= 'Bond'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDisplayTypeAccess().getBondKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFin.g:1025:3: kw= 'Option'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDisplayTypeAccess().getOptionKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalFin.g:1031:3: kw= 'Cash'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDisplayTypeAccess().getCashKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalFin.g:1037:3: kw= 'All'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDisplayTypeAccess().getAllKeyword_4());
                    		

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
    // $ANTLR end "ruleDisplayType"


    // $ANTLR start "entryRuleFLOAT"
    // InternalFin.g:1046:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFin.g:1048:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalFin.g:1049:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalFin.g:1058:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFin.g:1065:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalFin.g:1066:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFin.g:1066:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalFin.g:1067:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalFin.g:1067:3: (this_INT_0= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFin.g:1068:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_12); 

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


    // $ANTLR start "ruleOptionType"
    // InternalFin.g:1095:1: ruleOptionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) ) ;
    public final Enumerator ruleOptionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFin.g:1101:2: ( ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) ) )
            // InternalFin.g:1102:2: ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) )
            {
            // InternalFin.g:1102:2: ( (enumLiteral_0= 'Call' ) | (enumLiteral_1= 'Put' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            else if ( (LA9_0==39) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFin.g:1103:3: (enumLiteral_0= 'Call' )
                    {
                    // InternalFin.g:1103:3: (enumLiteral_0= 'Call' )
                    // InternalFin.g:1104:4: enumLiteral_0= 'Call'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getOptionTypeAccess().getCallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOptionTypeAccess().getCallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFin.g:1111:3: (enumLiteral_1= 'Put' )
                    {
                    // InternalFin.g:1111:3: (enumLiteral_1= 'Put' )
                    // InternalFin.g:1112:4: enumLiteral_1= 'Put'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000760000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008084000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008086000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001808084000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});

}