import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
    This file is an intro to software testing.
 */
public class WhatDoesTestDo {
    @Test
    public void whatDoesTestDo() {
        /*
            Testing is to verify whether a piece of code is correct.

            It needs 3 basic components:

            1. A set of inputs.
            2. The expected (correct) outputs.
            3. The actual outputs from by passing the inputs to the code being tested.

            If the actual outputs match the expected outputs, this test passes, fails otherwise.
         */
    }

    @Test
    public void example() {
        int var = 1;

        // verify var has value 1
        assertEquals(1, var);

        // same as above, but if it fails, give a message
        assertEquals("test failed. var is not 1", 1, var);

        // still the same check, just a different way to express it
        assertTrue("test failed. var is not 1", var == 1);

    }
}
