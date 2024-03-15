package def;
public class BondCalculator {
    public static double calculatePrice(double faceValue, double couponRate, int maturity, double yieldRate) {
        // Simplified bond valuation formula
        return faceValue / Math.pow(1 + yieldRate, maturity);
    }
}
