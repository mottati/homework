package org.athenian.homework;

import org.pmw.tinylog.Logger;

/**
 * Created by michael.ottati on 9/20/15.
 */
public class Assignment {

    public static void main(String[] args) {
        /*
        Pass directly through to a newly created object. This allows easy testing of instance methods
        and variables.
        */
        new Assignment().instanceMain(args);

    }

    /**
     * For this example template simply sum up all of the arguments passed in
     * Change the return value and implementation to something appropriate to
     * your your assignment.
     *
     * @param args
     * @return
     */

    public int instanceMain(String args[]) {

        Logger.info("Starting homework assignment");

        /* TODO Add parameter checking here */

        int returnValue = 0;

        /*
           Sums the numbers in the args list. If invalid (non numeric) input is provided this code will
           fail with a NumberFormatException. This is intentional and used in the accompanying
           catchException test.
         */

        for (int index=0;index<=args.length-1; index++) {

            returnValue += Integer.parseInt(args[index]);
            /* This logging will only take place when with logLevel=DEBUG or TRACE */
            Logger.debug("Index=" + index +
                         ",Argument= " + args[index] +
                         ",Running Total=" + returnValue + "\n" );
        }

        return returnValue;

    }


}
