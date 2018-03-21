package vn.nguyen.Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
/**
 * Created by nals on 3/21/18.
 */
public class StringHelperTest {
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testswapLast2CharsWith2CharsIsReversed() throws Exception {
        StringHelper stringHelper = new StringHelper();
        String actual = "BA";
        assertThat(actual,is(stringHelper.swapLast2Chars("AB")));
        Assert.assertEquals(actual,stringHelper.swapLast2Chars("AB"));
    }

    @Test
    public void testswapLast2CharsWith4Char() throws Exception {
        StringHelper stringHelper = new StringHelper();
        String actual = "ABDC";
        assertThat(actual,is(stringHelper.swapLast2Chars("ABCD")));
    }

    @Test
    public void testswapLast2CharsWith10Char() throws Exception {
        StringHelper stringHelper = new StringHelper();
        String actual = "ABCDEFGHJI";
        assertThat(actual,is(stringHelper.swapLast2Chars("ABCDEFGHIJ")));
    }

    @Test
    public void testswapLast2CharsWith1Char() throws Exception {
        StringHelper stringHelper = new StringHelper();
        String actual = "A";
        assertThat(actual,is(stringHelper.swapLast2Chars("A")));
    }
}