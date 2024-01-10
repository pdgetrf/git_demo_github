import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberTest {
    @Test
    public void myAwesomeTest() {
        long[] inputs = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        boolean[] expect = {false, false, false, false, true, true, false, true, false, true, false};

        assertEquals(inputs.length, expect.length);

        for (int i = 0; i < inputs.length; i++) {
            boolean actual = PrimeNumber.isAPrimeNumber(inputs[i]);
            assertEquals("input: " + inputs[i], expect[i], actual);
        }
    }
}
