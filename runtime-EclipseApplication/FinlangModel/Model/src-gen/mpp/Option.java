package mpp;

public class Option {
    private String name;
    private OptionType type;
    private double underlyingPrice;
    private double strikePrice;
    private double timeToExpiration;
    private double riskFreeRate;
    private double volatility;
    private double dividendYield;

    public Option(String name, OptionType type, double underlyingPrice, double strikePrice,
                  double timeToExpiration, double riskFreeRate, double volatility, double dividendYield) {
        this.name = name;
        this.type = type;
        this.underlyingPrice = underlyingPrice;
        this.strikePrice = strikePrice;
        this.timeToExpiration = timeToExpiration;
        this.riskFreeRate = riskFreeRate;
        this.volatility = volatility;
        this.dividendYield = dividendYield;
    }
    
    private double normalCDF(double value) {
        // Constants for the approximation
        double a1 =  0.254829592;
        double a2 = -0.284496736;
        double a3 =  1.421413741;
        double a4 = -1.453152027;
        double a5 =  1.061405429;
        double p  =  0.3275911;

        // Save the sign of value
        int sign = (value >= 0) ? 1 : -1;
        value = Math.abs(value) / Math.sqrt(2.0);

        // A&S formula 7.1.26
        double t = 1.0 / (1.0 + p * value);
        double y = 1.0 - (((((a5 * t + a4) * t) + a3) * t + a2) * t + a1) * t * Math.exp(-value * value);

        return 0.5 * (1.0 + sign * y);
    }

    public double calculateBlackScholesPrice() {
        double d1 = (Math.log(underlyingPrice / strikePrice) + (riskFreeRate + Math.pow(volatility, 2) / 2) * timeToExpiration) / (volatility * Math.sqrt(timeToExpiration));
        double d2 = d1 - volatility * Math.sqrt(timeToExpiration);
        
        if (type == OptionType.CALL) {
            return underlyingPrice * normalCDF(d1) - strikePrice * Math.exp(-riskFreeRate * timeToExpiration) * normalCDF(d2);
        } else {
            return strikePrice * Math.exp(-riskFreeRate * timeToExpiration) * normalCDF(-d2) - underlyingPrice * normalCDF(-d1);
        }
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OptionType getType() {
        return type;
    }

    public void setType(OptionType type) {
        this.type = type;
    }

    public double getUnderlyingPrice() {
        return underlyingPrice;
    }

    public void setUnderlyingPrice(double underlyingPrice) {
        this.underlyingPrice = underlyingPrice;
    }

    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }

    public double getTimeToExpiration() {
        return timeToExpiration;
    }

    public void setTimeToExpiration(double timeToExpiration) {
        this.timeToExpiration = timeToExpiration;
    }

    public double getRiskFreeRate() {
        return riskFreeRate;
    }

    public void setRiskFreeRate(double riskFreeRate) {
        this.riskFreeRate = riskFreeRate;
    }

    public double getVolatility() {
        return volatility;
    }

    public void setVolatility(double volatility) {
        this.volatility = volatility;
    }

    public double getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public enum OptionType {
        CALL, PUT
    }
}
