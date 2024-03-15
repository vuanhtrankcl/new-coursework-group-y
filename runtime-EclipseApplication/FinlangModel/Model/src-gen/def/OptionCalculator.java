package def;
public class OptionCalculator {
    public static double calculateBlackScholes(double S, double K, double T, double r, double sigma) {
        double d1 = (Math.log(S / K) + (r + sigma * sigma / 2) * T) / (sigma * Math.sqrt(T));
        double d2 = d1 - sigma * Math.sqrt(T);
        //NormalDistribution nd = new NormalDistribution();
        //return S * nd.cumulativeProbability(d1) - K * Math.exp(-r * T) * nd.cumulativeProbability(d2);
        return 10;
    }
}
