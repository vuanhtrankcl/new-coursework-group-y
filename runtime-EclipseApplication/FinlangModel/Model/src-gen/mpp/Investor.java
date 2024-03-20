package mpp;

import java.util.ArrayList;
import java.util.List;

public class Investor {
    private List<Portfolio> portfolios = new ArrayList<>();

    public void addPortfolio(Portfolio portfolio) {
        portfolios.add(portfolio);
    }

    public void removePortfolio(Portfolio portfolio) {
        portfolios.remove(portfolio);
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }
}
