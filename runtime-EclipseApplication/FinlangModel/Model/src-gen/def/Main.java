package def;

import java.util.HashMap;
import java.util.Map;

import mpp.*;
import mpp.Option.OptionType;

import java.io.PrintWriter;
import java.io.File;




public class Main {
    public static void main(String[] args) {
        Investor investor = new Investor();
        Map<String, Portfolio> portfolioMap = new HashMap<>();

        // Iterate over portfolios
        Portfolio mp = new Portfolio("mp");
        investor.addPortfolio(mp);
        portfolioMap.put("mp", mp);

        // Generate code for Bonds within this Portfolio
        Bond myBond = new Bond("myBond", 1000.0, 0.05, 10, 0.04);
        mp.addBond(myBond);

        // Generate code for Options within this Portfolio
        Option myOption = new Option("myOption", OptionType.CALL, 100.5, 95.25, 20.0, 0.01, 0.06, 0.03);
        mp.addOption(myOption);



        // View actions
        if (portfolioMap.containsKey("mp")) {
            Portfolio portfolioToView = portfolioMap.get("mp");
            Views.viewPortfolio(portfolioToView);
        }
    }
}
