package org.athenian.homework;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/*
    Explicitly import some common JUnit assertinos that you will usually use for testing.
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by michael.ottati on 9/20/15.
 */
public class AssgnmentTest {

    /* Instantiate the class we will test */
    private Assignment assignment = new Assignment();

    @Test
    public void onePlusOne() {

        /* Demonstrate that 1 + 1 = 2 */
        assertEquals(assignment.instanceMain(new String[]{"1", "1"}), 2);

    }


    /**
     *    Force a number format exception in the instanceMain to demonstrate a
     *    test that is looking for an exception to be produced.
     *
     *    This test will fail if the expected exception does not occur.
     */
    @Test(expected = NumberFormatException.class)
    public void catchException() {

        assignment.instanceMain(new String[]{"1", "ONE"});

    }

}
