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
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNumber() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = "Fizz";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(3)));
    }
}