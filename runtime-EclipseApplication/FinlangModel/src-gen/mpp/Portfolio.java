package mpp;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Bond> bonds = new ArrayList<>();
    private List<Option> options = new ArrayList<>();
    private String name;

    public Portfolio(String name) {
        this.name = name;
    }

    public void addBond(Bond bond) {
        bonds.add(bond);
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public List<Bond> getBonds() {
        return bonds;
    }

    public List<Option> getOptions() {
        return options;
    }

    public String getName() {
        return name;
    }

    // Additional portfolio-related methods can be added here
}
