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
        final double payableTax = taxCalculator.calculate(400000.00);
        assertTrue(400000.00 == payableTax);

    }
}