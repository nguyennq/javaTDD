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
    public void testNumberShouldReturn1WhenInputNumnerIs1() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = "1";
        assertThat(actual,is(fizzBuzz.numberFizzBuzz(1)));
    }
}