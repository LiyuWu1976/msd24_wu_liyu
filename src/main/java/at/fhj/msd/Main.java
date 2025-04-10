package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Sample application class to demonstrate functionality.
 */

public class Main{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(1.5,3.4));
        System.out.println(c1.minus(6.9,1.5));
        System.out.println(c1.multiply(2,5.0));
        System.out.println(c1.divide(30,5));

        System.out.println("Wu Liyu");

        logger.info("This is an info log");
        logger.error("This is an error log");


    }
}    
