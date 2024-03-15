package def;
        import java.io.File;
import java.io.PrintWriter;

        public class FinancialCalculatorMain {
            public static void main(String[] args) {
                try (PrintWriter writer = new PrintWriter(new File("financial_results.txt"))) {
                    // Calculate and write bond values
                    double bondPrice = BondCalculator.calculatePrice(1000.0, 0.05, 10, 0.04);
                    writer.println("Bond Price: " + bondPrice);

                    // Calculate and write option values
                    double optionPrice = OptionCalculator.calculateBlackScholes(100.5, 95.25, 0.5, 0.01, 0.2);
                    writer.println("Option Price: " + optionPrice);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
