package vn.nguyen.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import vn.nguyen.Model.Calculator;
import vn.nguyen.service.NumberSource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by nals on 11/27/17.
 */
public class NumberSourceImplTest {

    @Mock
    private NumberSource numberSource;

    public static final long FIRST_NUMNER = 123456789L;
    public static final long SECOND_NUMNER = 987654321L;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Mockito.when(numberSource.fetchNumber()).thenReturn(FIRST_NUMNER, SECOND_NUMNER);
    }

    @Test
    public void addTwoNumberFromSource(){
        Calculator calculator = new Calculator(numberSource);
        long actual = calculator.fetchTwoAndAdd();
        assertThat(actual,is(FIRST_NUMNER + SECOND_NUMNER));

    }

}