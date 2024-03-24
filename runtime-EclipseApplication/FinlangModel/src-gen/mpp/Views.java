package mpp;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Views {

    public static void viewPortfolio(Portfolio portfolio) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("views.txt", true))) {
            writer.println("Portfolio: " + portfolio.getName());
            for (Bond bond : portfolio.getBonds()) {
                viewBond(bond, writer);
            }
            for (Option option : portfolio.getOptions()) {
                viewOption(option, writer);
            }
            writer.println(); // Add a newline for readability
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void viewBond(Bond bond, PrintWriter writer) {
        double bondValue = bond.calculatePrice();
        writer.println("    Bond: " + bond.getName() + ", Face Value: " + bond.getFaceValue() + 
                       ", Coupon Rate: " + bond.getCouponRate() + "%, Maturity: " + bond.getMaturity() + 
                       " years, Yield Rate: " + bond.getYieldRate() + "%, Estimated Value: " + bondValue);
    }

    private static void viewOption(Option option, PrintWriter writer) {
        double optionValue = option.calculateBlackScholesPrice();
        writer.println("    Option: " + option.getName() + ", Type: " + option.getType() + 
                       ", Underlying Price: " + option.getUnderlyingPrice() + ", Strike Price: " + option.getStrikePrice() + 
                       ", Time to Expiration: " + option.getTimeToExpiration() + " years, Risk Free Rate: " + option.getRiskFreeRate() + 
                       "%, Volatility: " + option.getVolatility() + "%, Dividend Yield: " + option.getDividendYield() + 
                       "%, Estimated Value: " + optionValue);
    }
}
