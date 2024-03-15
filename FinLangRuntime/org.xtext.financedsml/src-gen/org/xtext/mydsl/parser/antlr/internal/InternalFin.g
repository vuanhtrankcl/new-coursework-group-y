/*
 * generated by Xtext 2.33.0
 */
grammar InternalFin;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementElementParserRuleCall_0());
			}
			lv_element_0_0=ruleElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"element",
					lv_element_0_0,
					"org.xtext.mydsl.Fin.Element");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementAccess().getPortfolioParserRuleCall_0());
		}
		this_Portfolio_0=rulePortfolio
		{
			$current = $this_Portfolio_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getTransactionParserRuleCall_1());
		}
		this_Transaction_1=ruleTransaction
		{
			$current = $this_Transaction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getActionParserRuleCall_2());
		}
		this_Action_2=ruleAction
		{
			$current = $this_Action_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementAccess().getElementAction_3_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getElementAccess().getConditionalStatementParserRuleCall_3_1());
			}
			ruleConditionalStatement
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleAsset
entryRuleAsset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssetRule()); }
	iv_ruleAsset=ruleAsset
	{ $current=$iv_ruleAsset.current; }
	EOF;

// Rule Asset
ruleAsset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssetAccess().getBondParserRuleCall_0());
		}
		this_Bond_0=ruleBond
		{
			$current = $this_Bond_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssetAccess().getOptionParserRuleCall_1());
		}
		this_Option_1=ruleOption
		{
			$current = $this_Option_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssetAccess().getCashParserRuleCall_2());
		}
		this_Cash_2=ruleCash
		{
			$current = $this_Cash_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTransaction
entryRuleTransaction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransactionRule()); }
	iv_ruleTransaction=ruleTransaction
	{ $current=$iv_ruleTransaction.current; }
	EOF;

// Rule Transaction
ruleTransaction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTransactionAccess().getBuyParserRuleCall_0());
		}
		this_Buy_0=ruleBuy
		{
			$current = $this_Buy_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransactionAccess().getSellParserRuleCall_1());
		}
		this_Sell_1=ruleSell
		{
			$current = $this_Sell_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransactionAccess().getDepositParserRuleCall_2());
		}
		this_Deposit_2=ruleDeposit
		{
			$current = $this_Deposit_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransactionAccess().getWithdrawalParserRuleCall_3());
		}
		this_Withdrawal_3=ruleWithdrawal
		{
			$current = $this_Withdrawal_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getActionAccess().getViewParserRuleCall());
	}
	this_View_0=ruleView
	{
		$current = $this_View_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleConditionalStatement
entryRuleConditionalStatement returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConditionalStatementRule()); }
	iv_ruleConditionalStatement=ruleConditionalStatement
	{ $current=$iv_ruleConditionalStatement.current.getText(); }
	EOF;

// Rule ConditionalStatement
ruleConditionalStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionalStatementAccess().getIfStatementParserRuleCall_0());
		}
		this_IfStatement_0=ruleIfStatement
		{
			$current.merge(this_IfStatement_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionalStatementAccess().getForStatementParserRuleCall_1());
		}
		this_ForStatement_1=ruleForStatement
		{
			$current.merge(this_ForStatement_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIfStatement
entryRuleIfStatement returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIfStatementRule()); }
	iv_ruleIfStatement=ruleIfStatement
	{ $current=$iv_ruleIfStatement.current.getText(); }
	EOF;

// Rule IfStatement
ruleIfStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='If'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getIfStatementAccess().getIfKeyword());
	}
;

// Entry rule entryRuleForStatement
entryRuleForStatement returns [String current=null]:
	{ newCompositeNode(grammarAccess.getForStatementRule()); }
	iv_ruleForStatement=ruleForStatement
	{ $current=$iv_ruleForStatement.current.getText(); }
	EOF;

// Rule ForStatement
ruleForStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='For'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getForStatementAccess().getForKeyword());
	}
;

// Entry rule entryRulePortfolio
entryRulePortfolio returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortfolioRule()); }
	iv_rulePortfolio=rulePortfolio
	{ $current=$iv_rulePortfolio.current; }
	EOF;

// Rule Portfolio
rulePortfolio returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Portfolio'
		{
			newLeafNode(otherlv_0, grammarAccess.getPortfolioAccess().getPortfolioKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getPortfolioAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPortfolioAccess().getAssetAssetParserRuleCall_2_0());
				}
				lv_asset_2_0=ruleAsset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPortfolioRule());
					}
					add(
						$current,
						"asset",
						lv_asset_2_0,
						"org.xtext.mydsl.Fin.Asset");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getPortfolioAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleBond
entryRuleBond returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBondRule()); }
	iv_ruleBond=ruleBond
	{ $current=$iv_ruleBond.current; }
	EOF;

// Rule Bond
ruleBond returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Bond'
		{
			newLeafNode(otherlv_0, grammarAccess.getBondAccess().getBondKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBondAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBondRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBondAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='faceValue'
		{
			newLeafNode(otherlv_3, grammarAccess.getBondAccess().getFaceValueKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBondAccess().getFaceValueFLOATParserRuleCall_4_0());
				}
				lv_faceValue_4_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBondRule());
					}
					set(
						$current,
						"faceValue",
						lv_faceValue_4_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='couponRate'
		{
			newLeafNode(otherlv_5, grammarAccess.getBondAccess().getCouponRateKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBondAccess().getCouponRateFLOATParserRuleCall_6_0());
				}
				lv_couponRate_6_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBondRule());
					}
					set(
						$current,
						"couponRate",
						lv_couponRate_6_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='maturity'
		{
			newLeafNode(otherlv_7, grammarAccess.getBondAccess().getMaturityKeyword_7());
		}
		(
			(
				lv_maturity_8_0=RULE_INT
				{
					newLeafNode(lv_maturity_8_0, grammarAccess.getBondAccess().getMaturityINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBondRule());
					}
					setWithLastConsumed(
						$current,
						"maturity",
						lv_maturity_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='yieldRate'
		{
			newLeafNode(otherlv_9, grammarAccess.getBondAccess().getYieldRateKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBondAccess().getYieldRateFLOATParserRuleCall_10_0());
				}
				lv_yieldRate_10_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBondRule());
					}
					set(
						$current,
						"yieldRate",
						lv_yieldRate_10_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getBondAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleOption
entryRuleOption returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionRule()); }
	iv_ruleOption=ruleOption
	{ $current=$iv_ruleOption.current; }
	EOF;

// Rule Option
ruleOption returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Option'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='type'
		{
			newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getTypeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getTypeOptionTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleOptionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"org.xtext.mydsl.Fin.OptionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='underlyingPrice'
		{
			newLeafNode(otherlv_5, grammarAccess.getOptionAccess().getUnderlyingPriceKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getUnderlyingPriceFLOATParserRuleCall_6_0());
				}
				lv_underlyingPrice_6_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					set(
						$current,
						"underlyingPrice",
						lv_underlyingPrice_6_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='strikePrice'
		{
			newLeafNode(otherlv_7, grammarAccess.getOptionAccess().getStrikePriceKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getStrikePriceFLOATParserRuleCall_8_0());
				}
				lv_strikePrice_8_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					set(
						$current,
						"strikePrice",
						lv_strikePrice_8_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='timeToExpiration'
		{
			newLeafNode(otherlv_9, grammarAccess.getOptionAccess().getTimeToExpirationKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getTimeToExpirationFLOATParserRuleCall_10_0());
				}
				lv_timeToExpiration_10_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					set(
						$current,
						"timeToExpiration",
						lv_timeToExpiration_10_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='riskFreeRate'
		{
			newLeafNode(otherlv_11, grammarAccess.getOptionAccess().getRiskFreeRateKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getRiskFreeRateFLOATParserRuleCall_12_0());
				}
				lv_riskFreeRate_12_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					set(
						$current,
						"riskFreeRate",
						lv_riskFreeRate_12_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='volatility'
		{
			newLeafNode(otherlv_13, grammarAccess.getOptionAccess().getVolatilityKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getVolatilityFLOATParserRuleCall_14_0());
				}
				lv_volatility_14_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					set(
						$current,
						"volatility",
						lv_volatility_14_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='dividendYield'
		{
			newLeafNode(otherlv_15, grammarAccess.getOptionAccess().getDividendYieldKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionAccess().getDividendYieldFLOATParserRuleCall_16_0());
				}
				lv_dividendYield_16_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionRule());
					}
					set(
						$current,
						"dividendYield",
						lv_dividendYield_16_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_17());
		}
	)
;

// Entry rule entryRuleCash
entryRuleCash returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCashRule()); }
	iv_ruleCash=ruleCash
	{ $current=$iv_ruleCash.current; }
	EOF;

// Rule Cash
ruleCash returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Cash'
		{
			newLeafNode(otherlv_0, grammarAccess.getCashAccess().getCashKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCashAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='amount'
		{
			newLeafNode(otherlv_2, grammarAccess.getCashAccess().getAmountKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCashAccess().getAmountFLOATParserRuleCall_3_0());
				}
				lv_amount_3_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCashRule());
					}
					set(
						$current,
						"amount",
						lv_amount_3_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getCashAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleBuy
entryRuleBuy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBuyRule()); }
	iv_ruleBuy=ruleBuy
	{ $current=$iv_ruleBuy.current; }
	EOF;

// Rule Buy
ruleBuy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Buy'
		{
			newLeafNode(otherlv_0, grammarAccess.getBuyAccess().getBuyKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBuyAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBuyAccess().getBondBondParserRuleCall_2_0_0());
					}
					lv_bond_2_0=ruleBond
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBuyRule());
						}
						set(
							$current,
							"bond",
							lv_bond_2_0,
							"org.xtext.mydsl.Fin.Bond");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getBuyAccess().getOptionOptionParserRuleCall_2_1_0());
					}
					lv_option_3_0=ruleOption
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBuyRule());
						}
						set(
							$current,
							"option",
							lv_option_3_0,
							"org.xtext.mydsl.Fin.Option");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getBuyAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSell
entryRuleSell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSellRule()); }
	iv_ruleSell=ruleSell
	{ $current=$iv_ruleSell.current; }
	EOF;

// Rule Sell
ruleSell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Sell'
		{
			newLeafNode(otherlv_0, grammarAccess.getSellAccess().getSellKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSellAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='assetName'
		{
			newLeafNode(otherlv_2, grammarAccess.getSellAccess().getAssetNameKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getSellAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSellRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='amount'
		{
			newLeafNode(otherlv_4, grammarAccess.getSellAccess().getAmountKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSellAccess().getAmountFLOATParserRuleCall_5_0());
				}
				lv_amount_5_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSellRule());
					}
					set(
						$current,
						"amount",
						lv_amount_5_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getSellAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleDeposit
entryRuleDeposit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDepositRule()); }
	iv_ruleDeposit=ruleDeposit
	{ $current=$iv_ruleDeposit.current; }
	EOF;

// Rule Deposit
ruleDeposit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Deposit'
		{
			newLeafNode(otherlv_0, grammarAccess.getDepositAccess().getDepositKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDepositAccess().getAmountFLOATParserRuleCall_1_0());
				}
				lv_amount_1_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDepositRule());
					}
					set(
						$current,
						"amount",
						lv_amount_1_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWithdrawal
entryRuleWithdrawal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithdrawalRule()); }
	iv_ruleWithdrawal=ruleWithdrawal
	{ $current=$iv_ruleWithdrawal.current; }
	EOF;

// Rule Withdrawal
ruleWithdrawal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Withdrawal'
		{
			newLeafNode(otherlv_0, grammarAccess.getWithdrawalAccess().getWithdrawalKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWithdrawalAccess().getAmountFLOATParserRuleCall_1_0());
				}
				lv_amount_1_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithdrawalRule());
					}
					set(
						$current,
						"amount",
						lv_amount_1_0,
						"org.xtext.mydsl.Fin.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleView
entryRuleView returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getViewRule()); }
	iv_ruleView=ruleView
	{ $current=$iv_ruleView.current; }
	EOF;

// Rule View
ruleView returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='View'
		{
			newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getViewAccess().getViewTypeViewTypeParserRuleCall_1_0());
				}
				lv_viewType_1_0=ruleViewType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getViewRule());
					}
					set(
						$current,
						"viewType",
						lv_viewType_1_0,
						"org.xtext.mydsl.Fin.ViewType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getViewAccess().getTimeTimeParserRuleCall_2_0());
				}
				lv_time_2_0=ruleTime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getViewRule());
					}
					set(
						$current,
						"time",
						lv_time_2_0,
						"org.xtext.mydsl.Fin.Time");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleViewType
entryRuleViewType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getViewTypeRule()); }
	iv_ruleViewType=ruleViewType
	{ $current=$iv_ruleViewType.current.getText(); }
	EOF;

// Rule ViewType
ruleViewType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Porfolio'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getViewTypeAccess().getPorfolioKeyword_0());
		}
		    |
		kw='Bond'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getViewTypeAccess().getBondKeyword_1());
		}
		    |
		kw='Option'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getViewTypeAccess().getOptionKeyword_2());
		}
		    |
		kw='Cash'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getViewTypeAccess().getCashKeyword_3());
		}
		    |
		kw='All'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getViewTypeAccess().getAllKeyword_4());
		}
	)
;

// Entry rule entryRuleTime
entryRuleTime returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTimeRule()); }
	iv_ruleTime=ruleTime
	{ $current=$iv_ruleTime.current.getText(); }
	EOF;

// Rule Time
ruleTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Now'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTimeAccess().getNowKeyword_0());
		}
		    |
		kw='NextMonth'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTimeAccess().getNextMonthKeyword_1());
		}
		    |
		kw='NextQuarter'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTimeAccess().getNextQuarterKeyword_2());
		}
		    |
		kw='NextYear'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTimeAccess().getNextYearKeyword_3());
		}
	)
;

// Entry rule entryRuleFLOAT
entryRuleFLOAT returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getFLOATRule()); }
	iv_ruleFLOAT=ruleFLOAT
	{ $current=$iv_ruleFLOAT.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule FLOAT
ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Rule OptionType
ruleOptionType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Call'
			{
				$current = grammarAccess.getOptionTypeAccess().getCallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOptionTypeAccess().getCallEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Put'
			{
				$current = grammarAccess.getOptionTypeAccess().getPutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOptionTypeAccess().getPutEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
