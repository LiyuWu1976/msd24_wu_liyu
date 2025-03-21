package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setup() {
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
    public void testDivideWithZero() throws ArithmeticException {        
        calc.divide(10, 0);
    }

    @Test
    public void testDivideWithNegative() {
        assertEquals(-3.0, calc.divide(6, -2));
    }  
}



