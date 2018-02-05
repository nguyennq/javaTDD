package vn.nguyen.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
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
    @InjectMocks
    private NumberSourceImpl numberSourceImpl;

    public static final long FIRST_NUMBER = 10L;
    public static final long SECOND_NUMBER = 20L;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        numberSourceImpl = new NumberSourceImpl(numberSource);
        Mockito.when(numberSource.fetchNumber()).thenReturn(FIRST_NUMBER, SECOND_NUMBER);
    }

    @Test
    public void addTwoNumberFromSource(){
        Calculator calculator = new Calculator(numberSource);
        long actual = calculator.fetchTwoAndAdd();
        assertThat(actual,is(FIRST_NUMBER + SECOND_NUMBER));
    }

    @Test
    public void addTwoNumber_ShouldReturnSumOf2Number() throws Exception {
        long numberActual = numberSourceImpl.addTwoNumber(FIRST_NUMBER, SECOND_NUMBER);
        assertThat(numberActual,is(FIRST_NUMBER + SECOND_NUMBER));
    }

}