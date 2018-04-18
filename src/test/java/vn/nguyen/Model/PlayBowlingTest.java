package vn.nguyen.Model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by nals on 4/4/18.
 */
public class PlayBowlingTest {
    private PlayBowling playBowling;

    void rollMany(int n, int pins, PlayBowling playBowling) {
        for (int i = 0; i < n; i++){
            playBowling.roll(pins);
        }
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        playBowling = new PlayBowling();
    }

    @Test
    public void testScoreIs0WhenHavePersonPlayWith0Pins() throws Exception {
        rollMany(20, 0, playBowling);
        assertEquals(0, playBowling.score());
//        String actual = "1";
//        assertThat(actual,is(playBowling.printResult("Nguyen",1)));
    }

    @Test
    public void testScoreIs20WhenHavePersonPlayWith1Pins() throws Exception {
        rollMany(20,1,playBowling);
        assertEquals(20,playBowling.score());
    }

    @Test
    public void testScoreWhenPlayOneSpare() throws Exception {
        playBowling.roll(5);
        playBowling.roll(5);
        playBowling.roll(3);
        rollMany(17,0,playBowling);
        assertEquals(16, playBowling.score());

    }
}