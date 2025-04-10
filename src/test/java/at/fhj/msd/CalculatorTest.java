package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    private static final Logger logger = LogManager.getLogger(CalculatorTest.class);

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAddNormalValues() {
        assertEquals(5.0, calc.add(2, 3));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(0.0, calc.add(0, 0));
    }

    @Test
    public void testAddWithNegative() {
        assertEquals(1.0, calc.add(-2, 3));
    }    

    
    @Test
    public void testMinusNormalValues() {
        assertEquals(5.0, calc.minus(8.0, 3.0));
    }

    @Test
    public void testMinusWithZero() {
        assertEquals(128.0, calc.minus(128.0, 0.0));
    }

    @Test
    public void testMinusWithNegative() {
        assertEquals(10.0, calc.minus(8, -2));
    }    

    @Test
    public void testMultiplyNormalValues() {
        assertEquals(34.0, calc.multiply(8.5, 4.0));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0.0, calc.multiply(0.0, 0));
    }

    @Test
    public void testMultiplyWithNegative() {
        assertEquals(-6.0, calc.multiply(3.0, -2.0));
    }  

    
    @Test
    public void testDivideNormalValues() {
        assertEquals(5.0, calc.divide(10, 2));
    }

    @Test
    public void testDivideWithZero() {         
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });        
        logger.error("Capture an error for dividing with 0：", e);
    }

    @Test
    public void testDivideWithNegative() {
        assertEquals(-3.0, calc.divide(6, -2));
    }  

    @Test
    public void testFactorialNormalValues() {
        assertEquals(120, calc.factorial(5)); 
    }

    @Test
    public void testFactorialWithZero() {
        assertEquals(1, calc.factorial(0)); 
    }

    @Test
    public void testFactorialWithNegative() {
        assertEquals(0, calc.factorial(-5)); 
    }
}



