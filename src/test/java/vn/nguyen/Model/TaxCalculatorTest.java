package vn.nguyen.Model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nals on 2/7/18.
 */
public class TaxCalculatorTest {

    @Test
    public void when_income_less_than_5Lacs_then_deducts_10_percent_tax() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        double payableTax = taxCalculator.calculate(400000.00);
        assertTrue(40000 == payableTax);
        //Check boundary values 0 and 500,000.
        payableTax = taxCalculator.calculate(0);
        assertTrue(0 == payableTax);

        payableTax = taxCalculator.calculate(500000.00);
        assertTrue(50000 == payableTax);


    }

    @Test
    public void when_income_between_5lacs_and_10lacs_then_deducts_fifty_thousand_plus_20_percent_above_5lacs() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        double payableTax = taxCalculator.calculate(800000.00);
        double expectedTaxForFirstFiveHundredThousand = 50000;
        double expectedTaxForReminder = 60000;
        double expectedTotalTax =
                expectedTaxForFirstFiveHundredThousand +
                        expectedTaxForReminder;
        assertTrue(expectedTotalTax == payableTax);
    }
}