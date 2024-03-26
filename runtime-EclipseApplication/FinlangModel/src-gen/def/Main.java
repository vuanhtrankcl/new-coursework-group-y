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
        Bond myBondA = new Bond("myBondA", 1000.0, 0.05, 10, 0.04);
        myPort1.addBond(myBondA);

        // Generate code for Options within this Portfolio
        Option myOptionA = new Option("myOptionA", OptionType.Call, 100.5, 95.25, 20.0, 0.01, 0.06, 0.03);
        myPort1.addOption(myOptionA);

        Portfolio myPort2 = new Portfolio("myPort2");
        investor.addPortfolio(myPort2);
        portfolioMap.put("myPort2", myPort2);

        // Generate code for Bonds within this Portfolio
        Bond myBond2A = new Bond("myBond2A", 1000.0, 0.05, 10, 0.04);
        myPort2.addBond(myBond2A);

        // Generate code for Options within this Portfolio
        Option myOption2A = new Option("myOption2A", OptionType.Call, 100.5, 95.25, 20.0, 0.01, 0.06, 0.03);
        myPort2.addOption(myOption2A);



        // View actions
        if (portfolioMap.containsKey("myPort1")) {
            Portfolio portfolioToView = portfolioMap.get("myPort1");
            Views.viewPortfolio(portfolioToView);
        }
    }
}
