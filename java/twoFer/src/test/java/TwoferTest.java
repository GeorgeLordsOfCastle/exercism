import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TwoferTest {

    private Twofer twofer;

    @Before
    public void setup() {
        twofer = new Twofer();
    }

    @Test
    public void noNameGiven() {
        String input = null;
        String expected = "One for you, one for me.";

        assertThat(twofer.twofer(input), is(expected));
    }

    @Test
    public void voidNameGivenReturnsYouAsName() {
        String input = "";
        String expected = "One for you, one for me.";

        assertThat(twofer.twofer(input), is(expected));
    }

    @Test
    public void aNameGiven() {
        String input = "Alice";
        String expected = "One for Alice, one for me.";

        assertThat(twofer.twofer(input), is(expected));
    }

    @Test
    public void anotherNameGiven() {
        String input = "Bob";
        String expected = "One for Bob, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }
}
