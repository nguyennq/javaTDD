package vn.nguyen.Model;

/**
 * Created by nals on 2/7/18.
 */
public class TaxCalculator {
    public double calculate(double taxableIncome) {
        if(taxableIncome > 500000){
            return 50000 + ((taxableIncome-500000)/5);
        }
        return (taxableIncome/10);
    }
}
