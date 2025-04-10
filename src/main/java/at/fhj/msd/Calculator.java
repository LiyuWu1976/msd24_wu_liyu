package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){};
    public double add(double number1, double number2){
        logger.debug("Method add called with parameters: number1={}, number2={}", number1, number2);
        return number1+number2;
    }
    public double minus(double number1, double number2){
        logger.debug("Method minus called with parameters: number1={}, number2={}", number1, number2);
        return number1-number2;
    }
    public double multiply(double number1, double number2){
        logger.debug("Method multiply called with parameters: number1={}, number2={}", number1, number2);
        return number1*number2;
    }
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
