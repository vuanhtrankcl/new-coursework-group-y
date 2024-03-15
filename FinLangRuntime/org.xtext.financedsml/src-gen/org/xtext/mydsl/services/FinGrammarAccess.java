/*
 * generated by Xtext 2.33.0
 */
package org.xtext.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FinGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Model");
		private final Assignment cElementAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementElementParserRuleCall_0 = (RuleCall)cElementAssignment.eContents().get(0);
		
		//Model:
		//    (element+=Element)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(element+=Element)*
		public Assignment getElementAssignment() { return cElementAssignment; }
		
		//Element
		public RuleCall getElementElementParserRuleCall_0() { return cElementElementParserRuleCall_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPortfolioParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTransactionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cActionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Element:
		//    Portfolio | Transaction | Action
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Portfolio | Transaction | Action
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Portfolio
		public RuleCall getPortfolioParserRuleCall_0() { return cPortfolioParserRuleCall_0; }
		
		//Transaction
		public RuleCall getTransactionParserRuleCall_1() { return cTransactionParserRuleCall_1; }
		
		//Action
		public RuleCall getActionParserRuleCall_2() { return cActionParserRuleCall_2; }
	}
	public class AssetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Asset");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBondParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOptionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCashParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Asset:
		//    Bond | Option | Cash
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Bond | Option | Cash
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Bond
		public RuleCall getBondParserRuleCall_0() { return cBondParserRuleCall_0; }
		
		//Option
		public RuleCall getOptionParserRuleCall_1() { return cOptionParserRuleCall_1; }
		
		//Cash
		public RuleCall getCashParserRuleCall_2() { return cCashParserRuleCall_2; }
	}
	public class TransactionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Transaction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBuyParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSellParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDepositParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cWithdrawalParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Transaction:
		//    Buy | Sell | Deposit | Withdrawal
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Buy | Sell | Deposit | Withdrawal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Buy
		public RuleCall getBuyParserRuleCall_0() { return cBuyParserRuleCall_0; }
		
		//Sell
		public RuleCall getSellParserRuleCall_1() { return cSellParserRuleCall_1; }
		
		//Deposit
		public RuleCall getDepositParserRuleCall_2() { return cDepositParserRuleCall_2; }
		
		//Withdrawal
		public RuleCall getWithdrawalParserRuleCall_3() { return cWithdrawalParserRuleCall_3; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Action");
		private final RuleCall cDisplayParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// TODO: Thinking to add more actions
		//Action:
		//    Display
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Display
		public RuleCall getDisplayParserRuleCall() { return cDisplayParserRuleCall; }
	}
	public class PortfolioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Portfolio");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPortfolioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssetAssetParserRuleCall_2_0 = (RuleCall)cAssetAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//// Use portfolio to initialise a profile
		//Portfolio:
		//    'Portfolio' '{'
		//        (asset+=Asset)+
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Portfolio' '{'
		//    (asset+=Asset)+
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Portfolio'
		public Keyword getPortfolioKeyword_0() { return cPortfolioKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(asset+=Asset)+
		public Assignment getAssetAssignment_2() { return cAssetAssignment_2; }
		
		//Asset
		public RuleCall getAssetAssetParserRuleCall_2_0() { return cAssetAssetParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class BondElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Bond");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBondKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFaceValueKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFaceValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFaceValueFLOATParserRuleCall_4_0 = (RuleCall)cFaceValueAssignment_4.eContents().get(0);
		private final Keyword cCouponRateKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCouponRateAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCouponRateFLOATParserRuleCall_6_0 = (RuleCall)cCouponRateAssignment_6.eContents().get(0);
		private final Keyword cMaturityKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMaturityAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMaturityINTTerminalRuleCall_8_0 = (RuleCall)cMaturityAssignment_8.eContents().get(0);
		private final Keyword cYieldRateKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cYieldRateAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cYieldRateFLOATParserRuleCall_10_0 = (RuleCall)cYieldRateAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Bond:
		//    'Bond' name=ID '{'
		//        'faceValue' faceValue=FLOAT
		//        'couponRate' couponRate=FLOAT
		//        'maturity' maturity=INT
		//        'yieldRate' yieldRate=FLOAT
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Bond' name=ID '{'
		//    'faceValue' faceValue=FLOAT
		//    'couponRate' couponRate=FLOAT
		//    'maturity' maturity=INT
		//    'yieldRate' yieldRate=FLOAT
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Bond'
		public Keyword getBondKeyword_0() { return cBondKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'faceValue'
		public Keyword getFaceValueKeyword_3() { return cFaceValueKeyword_3; }
		
		//faceValue=FLOAT
		public Assignment getFaceValueAssignment_4() { return cFaceValueAssignment_4; }
		
		//FLOAT
		public RuleCall getFaceValueFLOATParserRuleCall_4_0() { return cFaceValueFLOATParserRuleCall_4_0; }
		
		//'couponRate'
		public Keyword getCouponRateKeyword_5() { return cCouponRateKeyword_5; }
		
		//couponRate=FLOAT
		public Assignment getCouponRateAssignment_6() { return cCouponRateAssignment_6; }
		
		//FLOAT
		public RuleCall getCouponRateFLOATParserRuleCall_6_0() { return cCouponRateFLOATParserRuleCall_6_0; }
		
		//'maturity'
		public Keyword getMaturityKeyword_7() { return cMaturityKeyword_7; }
		
		//maturity=INT
		public Assignment getMaturityAssignment_8() { return cMaturityAssignment_8; }
		
		//INT
		public RuleCall getMaturityINTTerminalRuleCall_8_0() { return cMaturityINTTerminalRuleCall_8_0; }
		
		//'yieldRate'
		public Keyword getYieldRateKeyword_9() { return cYieldRateKeyword_9; }
		
		//yieldRate=FLOAT
		public Assignment getYieldRateAssignment_10() { return cYieldRateAssignment_10; }
		
		//FLOAT
		public RuleCall getYieldRateFLOATParserRuleCall_10_0() { return cYieldRateFLOATParserRuleCall_10_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	public class OptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Option");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOptionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeOptionTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cUnderlyingPriceKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cUnderlyingPriceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUnderlyingPriceFLOATParserRuleCall_6_0 = (RuleCall)cUnderlyingPriceAssignment_6.eContents().get(0);
		private final Keyword cStrikePriceKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cStrikePriceAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cStrikePriceFLOATParserRuleCall_8_0 = (RuleCall)cStrikePriceAssignment_8.eContents().get(0);
		private final Keyword cTimeToExpirationKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cTimeToExpirationAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTimeToExpirationFLOATParserRuleCall_10_0 = (RuleCall)cTimeToExpirationAssignment_10.eContents().get(0);
		private final Keyword cRiskFreeRateKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cRiskFreeRateAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRiskFreeRateFLOATParserRuleCall_12_0 = (RuleCall)cRiskFreeRateAssignment_12.eContents().get(0);
		private final Keyword cVolatilityKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cVolatilityAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cVolatilityFLOATParserRuleCall_14_0 = (RuleCall)cVolatilityAssignment_14.eContents().get(0);
		private final Keyword cDividendYieldKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cDividendYieldAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDividendYieldFLOATParserRuleCall_16_0 = (RuleCall)cDividendYieldAssignment_16.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//Option:
		//    'Option' name=ID '{'
		//        'type' type=OptionType
		//        'underlyingPrice' underlyingPrice=FLOAT
		//        'strikePrice' strikePrice=FLOAT
		//        'timeToExpiration' timeToExpiration=FLOAT
		//        'riskFreeRate' riskFreeRate=FLOAT
		//        'volatility' volatility=FLOAT
		//        'dividendYield' dividendYield=FLOAT
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Option' name=ID '{'
		//    'type' type=OptionType
		//    'underlyingPrice' underlyingPrice=FLOAT
		//    'strikePrice' strikePrice=FLOAT
		//    'timeToExpiration' timeToExpiration=FLOAT
		//    'riskFreeRate' riskFreeRate=FLOAT
		//    'volatility' volatility=FLOAT
		//    'dividendYield' dividendYield=FLOAT
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Option'
		public Keyword getOptionKeyword_0() { return cOptionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'type'
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }
		
		//type=OptionType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//OptionType
		public RuleCall getTypeOptionTypeEnumRuleCall_4_0() { return cTypeOptionTypeEnumRuleCall_4_0; }
		
		//'underlyingPrice'
		public Keyword getUnderlyingPriceKeyword_5() { return cUnderlyingPriceKeyword_5; }
		
		//underlyingPrice=FLOAT
		public Assignment getUnderlyingPriceAssignment_6() { return cUnderlyingPriceAssignment_6; }
		
		//FLOAT
		public RuleCall getUnderlyingPriceFLOATParserRuleCall_6_0() { return cUnderlyingPriceFLOATParserRuleCall_6_0; }
		
		//'strikePrice'
		public Keyword getStrikePriceKeyword_7() { return cStrikePriceKeyword_7; }
		
		//strikePrice=FLOAT
		public Assignment getStrikePriceAssignment_8() { return cStrikePriceAssignment_8; }
		
		//FLOAT
		public RuleCall getStrikePriceFLOATParserRuleCall_8_0() { return cStrikePriceFLOATParserRuleCall_8_0; }
		
		//'timeToExpiration'
		public Keyword getTimeToExpirationKeyword_9() { return cTimeToExpirationKeyword_9; }
		
		//timeToExpiration=FLOAT
		public Assignment getTimeToExpirationAssignment_10() { return cTimeToExpirationAssignment_10; }
		
		//FLOAT
		public RuleCall getTimeToExpirationFLOATParserRuleCall_10_0() { return cTimeToExpirationFLOATParserRuleCall_10_0; }
		
		//'riskFreeRate'
		public Keyword getRiskFreeRateKeyword_11() { return cRiskFreeRateKeyword_11; }
		
		//riskFreeRate=FLOAT
		public Assignment getRiskFreeRateAssignment_12() { return cRiskFreeRateAssignment_12; }
		
		//FLOAT
		public RuleCall getRiskFreeRateFLOATParserRuleCall_12_0() { return cRiskFreeRateFLOATParserRuleCall_12_0; }
		
		//'volatility'
		public Keyword getVolatilityKeyword_13() { return cVolatilityKeyword_13; }
		
		//volatility=FLOAT
		public Assignment getVolatilityAssignment_14() { return cVolatilityAssignment_14; }
		
		//FLOAT
		public RuleCall getVolatilityFLOATParserRuleCall_14_0() { return cVolatilityFLOATParserRuleCall_14_0; }
		
		//'dividendYield'
		public Keyword getDividendYieldKeyword_15() { return cDividendYieldKeyword_15; }
		
		//dividendYield=FLOAT
		public Assignment getDividendYieldAssignment_16() { return cDividendYieldAssignment_16; }
		
		//FLOAT
		public RuleCall getDividendYieldFLOATParserRuleCall_16_0() { return cDividendYieldFLOATParserRuleCall_16_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
	}
	public class CashElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Cash");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCashKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAmountKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAmountAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAmountFLOATParserRuleCall_3_0 = (RuleCall)cAmountAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Cash:
		//    'Cash' '{'
		//        'amount' amount=FLOAT
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Cash' '{'
		//    'amount' amount=FLOAT
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Cash'
		public Keyword getCashKeyword_0() { return cCashKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'amount'
		public Keyword getAmountKeyword_2() { return cAmountKeyword_2; }
		
		//amount=FLOAT
		public Assignment getAmountAssignment_3() { return cAmountAssignment_3; }
		
		//FLOAT
		public RuleCall getAmountFLOATParserRuleCall_3_0() { return cAmountFLOATParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class BuyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Buy");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBuyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cBondAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cBondBondParserRuleCall_2_0_0 = (RuleCall)cBondAssignment_2_0.eContents().get(0);
		private final Assignment cOptionAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cOptionOptionParserRuleCall_2_1_0 = (RuleCall)cOptionAssignment_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Buy:
		//    'Buy' '{'
		//        (bond=Bond | option=Option)
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Buy' '{'
		//    (bond=Bond | option=Option)
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Buy'
		public Keyword getBuyKeyword_0() { return cBuyKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(bond=Bond | option=Option)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//bond=Bond
		public Assignment getBondAssignment_2_0() { return cBondAssignment_2_0; }
		
		//Bond
		public RuleCall getBondBondParserRuleCall_2_0_0() { return cBondBondParserRuleCall_2_0_0; }
		
		//option=Option
		public Assignment getOptionAssignment_2_1() { return cOptionAssignment_2_1; }
		
		//Option
		public RuleCall getOptionOptionParserRuleCall_2_1_0() { return cOptionOptionParserRuleCall_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class SellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Sell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSellKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAssetNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cAmountKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAmountAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAmountFLOATParserRuleCall_5_0 = (RuleCall)cAmountAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Sell:
		//    'Sell' '{'
		//        'assetName' name=ID
		//        'amount' amount=FLOAT
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Sell' '{'
		//    'assetName' name=ID
		//    'amount' amount=FLOAT
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Sell'
		public Keyword getSellKeyword_0() { return cSellKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'assetName'
		public Keyword getAssetNameKeyword_2() { return cAssetNameKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//'amount'
		public Keyword getAmountKeyword_4() { return cAmountKeyword_4; }
		
		//amount=FLOAT
		public Assignment getAmountAssignment_5() { return cAmountAssignment_5; }
		
		//FLOAT
		public RuleCall getAmountFLOATParserRuleCall_5_0() { return cAmountFLOATParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class DepositElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Deposit");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDepositKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAmountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAmountFLOATParserRuleCall_1_0 = (RuleCall)cAmountAssignment_1.eContents().get(0);
		
		//Deposit:
		//    'Deposit' amount=FLOAT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Deposit' amount=FLOAT
		public Group getGroup() { return cGroup; }
		
		//'Deposit'
		public Keyword getDepositKeyword_0() { return cDepositKeyword_0; }
		
		//amount=FLOAT
		public Assignment getAmountAssignment_1() { return cAmountAssignment_1; }
		
		//FLOAT
		public RuleCall getAmountFLOATParserRuleCall_1_0() { return cAmountFLOATParserRuleCall_1_0; }
	}
	public class WithdrawalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Withdrawal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithdrawalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAmountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAmountFLOATParserRuleCall_1_0 = (RuleCall)cAmountAssignment_1.eContents().get(0);
		
		//Withdrawal:
		//    'Withdrawal' amount=FLOAT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Withdrawal' amount=FLOAT
		public Group getGroup() { return cGroup; }
		
		//'Withdrawal'
		public Keyword getWithdrawalKeyword_0() { return cWithdrawalKeyword_0; }
		
		//amount=FLOAT
		public Assignment getAmountAssignment_1() { return cAmountAssignment_1; }
		
		//FLOAT
		public RuleCall getAmountFLOATParserRuleCall_1_0() { return cAmountFLOATParserRuleCall_1_0; }
	}
	public class DisplayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.Display");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDisplayKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDisplayTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDisplayTypeDisplayTypeParserRuleCall_1_0 = (RuleCall)cDisplayTypeAssignment_1.eContents().get(0);
		
		//Display:
		//    'Display' (displayType=DisplayType)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Display' (displayType=DisplayType)
		public Group getGroup() { return cGroup; }
		
		//'Display'
		public Keyword getDisplayKeyword_0() { return cDisplayKeyword_0; }
		
		//(displayType=DisplayType)
		public Assignment getDisplayTypeAssignment_1() { return cDisplayTypeAssignment_1; }
		
		//DisplayType
		public RuleCall getDisplayTypeDisplayTypeParserRuleCall_1_0() { return cDisplayTypeDisplayTypeParserRuleCall_1_0; }
	}
	public class DisplayTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.DisplayType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPorfolioKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBondKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cOptionKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cCashKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cAllKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//DisplayType:
		//    'Porfolio' | 'Bond' | 'Option' | 'Cash' | 'All'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Porfolio' | 'Bond' | 'Option' | 'Cash' | 'All'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'Porfolio'
		public Keyword getPorfolioKeyword_0() { return cPorfolioKeyword_0; }
		
		//'Bond'
		public Keyword getBondKeyword_1() { return cBondKeyword_1; }
		
		//'Option'
		public Keyword getOptionKeyword_2() { return cOptionKeyword_2; }
		
		//'Cash'
		public Keyword getCashKeyword_3() { return cCashKeyword_3; }
		
		//'All'
		public Keyword getAllKeyword_4() { return cAllKeyword_4; }
	}
	public class FLOATElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.FLOAT");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//FLOAT returns ecore::EFloat hidden():
		//    INT? "." INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//INT? "." INT
		public Group getGroup() { return cGroup; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	
	public class OptionTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mydsl.Fin.OptionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCallEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCallCallKeyword_0_0 = (Keyword)cCallEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPutEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPutPutKeyword_1_0 = (Keyword)cPutEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum OptionType:
		//    Call | Put
		//;
		public EnumRule getRule() { return rule; }
		
		//Call | Put
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Call
		public EnumLiteralDeclaration getCallEnumLiteralDeclaration_0() { return cCallEnumLiteralDeclaration_0; }
		
		public Keyword getCallCallKeyword_0_0() { return cCallCallKeyword_0_0; }
		
		//Put
		public EnumLiteralDeclaration getPutEnumLiteralDeclaration_1() { return cPutEnumLiteralDeclaration_1; }
		
		public Keyword getPutPutKeyword_1_0() { return cPutPutKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final AssetElements pAsset;
	private final TransactionElements pTransaction;
	private final ActionElements pAction;
	private final PortfolioElements pPortfolio;
	private final BondElements pBond;
	private final OptionElements pOption;
	private final CashElements pCash;
	private final BuyElements pBuy;
	private final SellElements pSell;
	private final DepositElements pDeposit;
	private final WithdrawalElements pWithdrawal;
	private final DisplayElements pDisplay;
	private final DisplayTypeElements pDisplayType;
	private final OptionTypeElements eOptionType;
	private final FLOATElements pFLOAT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FinGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pAsset = new AssetElements();
		this.pTransaction = new TransactionElements();
		this.pAction = new ActionElements();
		this.pPortfolio = new PortfolioElements();
		this.pBond = new BondElements();
		this.pOption = new OptionElements();
		this.pCash = new CashElements();
		this.pBuy = new BuyElements();
		this.pSell = new SellElements();
		this.pDeposit = new DepositElements();
		this.pWithdrawal = new WithdrawalElements();
		this.pDisplay = new DisplayElements();
		this.pDisplayType = new DisplayTypeElements();
		this.eOptionType = new OptionTypeElements();
		this.pFLOAT = new FLOATElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.mydsl.Fin".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    (element+=Element)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element:
	//    Portfolio | Transaction | Action
	//;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//Asset:
	//    Bond | Option | Cash
	//;
	public AssetElements getAssetAccess() {
		return pAsset;
	}
	
	public ParserRule getAssetRule() {
		return getAssetAccess().getRule();
	}
	
	//Transaction:
	//    Buy | Sell | Deposit | Withdrawal
	//;
	public TransactionElements getTransactionAccess() {
		return pTransaction;
	}
	
	public ParserRule getTransactionRule() {
		return getTransactionAccess().getRule();
	}
	
	//// TODO: Thinking to add more actions
	//Action:
	//    Display
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//// Use portfolio to initialise a profile
	//Portfolio:
	//    'Portfolio' '{'
	//        (asset+=Asset)+
	//    '}'
	//;
	public PortfolioElements getPortfolioAccess() {
		return pPortfolio;
	}
	
	public ParserRule getPortfolioRule() {
		return getPortfolioAccess().getRule();
	}
	
	//Bond:
	//    'Bond' name=ID '{'
	//        'faceValue' faceValue=FLOAT
	//        'couponRate' couponRate=FLOAT
	//        'maturity' maturity=INT
	//        'yieldRate' yieldRate=FLOAT
	//    '}'
	//;
	public BondElements getBondAccess() {
		return pBond;
	}
	
	public ParserRule getBondRule() {
		return getBondAccess().getRule();
	}
	
	//Option:
	//    'Option' name=ID '{'
	//        'type' type=OptionType
	//        'underlyingPrice' underlyingPrice=FLOAT
	//        'strikePrice' strikePrice=FLOAT
	//        'timeToExpiration' timeToExpiration=FLOAT
	//        'riskFreeRate' riskFreeRate=FLOAT
	//        'volatility' volatility=FLOAT
	//        'dividendYield' dividendYield=FLOAT
	//    '}'
	//;
	public OptionElements getOptionAccess() {
		return pOption;
	}
	
	public ParserRule getOptionRule() {
		return getOptionAccess().getRule();
	}
	
	//Cash:
	//    'Cash' '{'
	//        'amount' amount=FLOAT
	//    '}'
	//;
	public CashElements getCashAccess() {
		return pCash;
	}
	
	public ParserRule getCashRule() {
		return getCashAccess().getRule();
	}
	
	//Buy:
	//    'Buy' '{'
	//        (bond=Bond | option=Option)
	//    '}'
	//;
	public BuyElements getBuyAccess() {
		return pBuy;
	}
	
	public ParserRule getBuyRule() {
		return getBuyAccess().getRule();
	}
	
	//Sell:
	//    'Sell' '{'
	//        'assetName' name=ID
	//        'amount' amount=FLOAT
	//    '}';
	public SellElements getSellAccess() {
		return pSell;
	}
	
	public ParserRule getSellRule() {
		return getSellAccess().getRule();
	}
	
	//Deposit:
	//    'Deposit' amount=FLOAT
	//;
	public DepositElements getDepositAccess() {
		return pDeposit;
	}
	
	public ParserRule getDepositRule() {
		return getDepositAccess().getRule();
	}
	
	//Withdrawal:
	//    'Withdrawal' amount=FLOAT
	//;
	public WithdrawalElements getWithdrawalAccess() {
		return pWithdrawal;
	}
	
	public ParserRule getWithdrawalRule() {
		return getWithdrawalAccess().getRule();
	}
	
	//Display:
	//    'Display' (displayType=DisplayType)
	//;
	public DisplayElements getDisplayAccess() {
		return pDisplay;
	}
	
	public ParserRule getDisplayRule() {
		return getDisplayAccess().getRule();
	}
	
	//DisplayType:
	//    'Porfolio' | 'Bond' | 'Option' | 'Cash' | 'All'
	//;
	public DisplayTypeElements getDisplayTypeAccess() {
		return pDisplayType;
	}
	
	public ParserRule getDisplayTypeRule() {
		return getDisplayTypeAccess().getRule();
	}
	
	//enum OptionType:
	//    Call | Put
	//;
	public OptionTypeElements getOptionTypeAccess() {
		return eOptionType;
	}
	
	public EnumRule getOptionTypeRule() {
		return getOptionTypeAccess().getRule();
	}
	
	//FLOAT returns ecore::EFloat hidden():
	//    INT? "." INT
	//;
	public FLOATElements getFLOATAccess() {
		return pFLOAT;
	}
	
	public ParserRule getFLOATRule() {
		return getFLOATAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
