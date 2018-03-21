package vn.nguyen.Model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by nals on 3/21/18.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testnumberFizzBuzzShouldReturn1WhenInputNumnerIs1() throws Exception {
        String actual = "1";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(1)));
    }

    @Test
    public void testnumberFizzBuzzShouldReturnFizzWhenInputNumberIs3() throws Exception {
        String actual = "Fizz";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(3)));
    }

    @Test
    public void testnumberFizzBuzzShouldReturnFizzWhenInputNumberDivisibleBy3() throws Exception {
        String actual = "Fizz";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(6)));
    }

    @Test
    public void testnumberFizzBuzzShouldReturnBuzzWhenInputNumberIs5() throws Exception {
        String actual = "Buzz";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(5)));
    }

    @Test
    public void testnumberFizzBuzzShouldReturnBuzzWhenInputNumberDivisibleBy5() throws Exception {
        String actual = "Buzz";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(10)));
    }

    @Test
    public void testnumberFizzBuzzShouldReturnFizzBuzzWhenInputNumberDivisibleBy3and5() throws Exception {
        String actual = "FizzBuzz";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(15)));
    }


}