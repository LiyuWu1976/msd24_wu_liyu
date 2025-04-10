package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Calculator for basic arithmetic operations.
 */

public class Calculator{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){};

    /**
     * Adds two numbers. 
     * @param number1 Addend1
     * @param number2 Addend2
     * @return result of addition
     */

    public double add(double number1, double number2){
        logger.debug("Method add called with parameters: number1={}, number2={}", number1, number2);
        return number1+number2;
    }

    /**
     * Subtracts the second number from the first number. 
     * @param number1 the number to subtract from
     * @param number2 the number to subtract
     * @return the result of substraction
     */

    public double minus(double number1, double number2){
        logger.debug("Method minus called with parameters: number1={}, number2={}", number1, number2);
        return number1-number2;
    }

    /**
     * Multiplies two double values.
     * @param number1 the first number
     * @param number2 the second number
     * @return the product of number1 and number2
     */

    public double multiply(double number1, double number2){
        logger.debug("Method multiply called with parameters: number1={}, number2={}", number1, number2);
        return number1*number2;
    }

    /**
     * Divides two numbers.
     * @param number1 dividend
     * @param number2 divisor
     * @return result of division
     * @throws ArithmeticException if b is 0
     */

    public double divide(double number1, double number2){
        logger.debug("Method divide called with parameters: number1={}, number2={}", number1, number2);
        if (number2 == 0) {
            logger.error("Division by zero attempted: number1={}, number2={}", number1, number2);
            throw new ArithmeticException("Division by zero!");
        }
        return number1/number2;
    }

    public int factorial(int n) {     
        if (n < 0){
            return 0;
        }   
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }    
}
