package vn.nguyen.service.impl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by nals on 2/2/18.
 */
public class StringCalculatorTest {

//    @Test(expected = RuntimeException.class)
//    public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() throws Exception{
//        StringCalculator.add("1,2,3");
//    }

    @Test
    public void when2NumbersAreUsedThenNoExceptionIsThrown() throws Exception {
        StringCalculator.add("1,2");
        assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public void whenNonNumberIsUsedThenExceptionIsThrown() throws Exception {
        StringCalculator.add("1, X");
    }

    @Test
    public void whenEmptyStringIsUsedThenReturnValueIs0() throws Exception {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() throws Exception {
        Assert.assertEquals(3, StringCalculator.add("3"));
    }

    @Test
    public void whenTwoNumberAreUsedThenReturnValueIsTheirSum() throws Exception {
        Assert.assertEquals(3+6, StringCalculator.add("3, 6"));
    }

    @Test
    public void whenAnyNumberOfNumberIsUsedThenReturnValueIsTheirSum() throws Exception {
        Assert.assertEquals(3+6+4+5+7, StringCalculator.add("3, 6, 4, 5, 7"));
    }

    @Test
    public void whenNewLinesIsUsedBetweenNumbersThenReturnValuesAreTheirSum() throws Exception {
        Assert.assertEquals(3+6+4, StringCalculator.add("3, 6\n4"));
    }

    @Test
    public void whenDelimiterIsSpecifiedThenItUsedToSeparateNumber() throws Exception {
        Assert.assertEquals(3+6+4, StringCalculator.add("//;\n3; 6;4"));
    }

    @Test(expected = RuntimeException.class)
    public void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() throws Exception {
        StringCalculator.add("1, -6, 15, 20");
    }

    @Test
    public void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() throws Exception {
        RuntimeException exception = null;
        try {
            StringCalculator.add("3,-6,15,-18,46,33");
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals("Negative not allowed: [-6, -18]", exception.getMessage());
    }
}
