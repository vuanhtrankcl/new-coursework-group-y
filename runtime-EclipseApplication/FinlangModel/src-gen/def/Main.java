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
        Portfolio myPort1 = new Portfolio("myPort1");
        investor.addPortfolio(myPort1);
        portfolioMap.put("myPort1", myPort1);

        // Generate code for Bonds within this Portfolio
        Bond myBondA1 = new Bond("myBondA1", 1000.0, 0.05, 10, 0.04);
        myPort1.addBond(myBondA1);

        // Generate code for Options within this Portfolio
        Option myOptionA = new Option("myOptionA", OptionType.Call, 100.5, 95.25, 20.0, 0.01, 0.06, 0.03);
        myPort1.addOption(myOptionA);

        Portfolio myPort2 = new Portfolio("myPort2");
        investor.addPortfolio(myPort2);
        portfolioMap.put("myPort2", myPort2);

        // Generate code for Bonds within this Portfolio
        Bond myBondA2 = new Bond("myBondA2", 1000.0, 0.05, 10, 0.04);
        myPort2.addBond(myBondA2);

        // Generate code for Options within this Portfolio
        Option myOptionA2 = new Option("myOptionA2", OptionType.Call, 100.5, 95.25, 20.0, 0.01, 0.06, 0.03);
        myPort2.addOption(myOptionA2);



        // View actions
        if (portfolioMap.containsKey("myPort1")) {
            Portfolio portfolioToView = portfolioMap.get("myPort1");
            Views.viewPortfolio(portfolioToView);
        }
    }
}
