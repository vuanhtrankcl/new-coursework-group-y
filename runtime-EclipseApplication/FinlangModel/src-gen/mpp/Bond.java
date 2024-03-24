package mpp;

public class Bond {
    private String name;
    private double faceValue;
    private double couponRate;
    private int maturity;
    private double yieldRate;

    public Bond(String name, double faceValue, double couponRate, int maturity, double yieldRate) {
        this.name = name;
        this.faceValue = faceValue;
        this.couponRate = couponRate;
        this.maturity = maturity;
        this.yieldRate = yieldRate;
    }
    
    public double calculatePrice() {
                    return faceValue / Math.pow(1 + yieldRate, maturity);
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    public double getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(double couponRate) {
        this.couponRate = couponRate;
    }

    public int getMaturity() {
        return maturity;
    }

    public void setMaturity(int maturity) {
        this.maturity = maturity;
    }

    public double getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(double yieldRate) {
        this.yieldRate = yieldRate;
    }
}
