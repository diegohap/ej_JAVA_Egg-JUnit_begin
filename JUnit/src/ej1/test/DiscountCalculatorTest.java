package ej1.test;

import ej1.main.DiscountCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountCalculator dc;

    @BeforeEach
    public void beforeEachTest(){
        dc = new DiscountCalculator();
    }
    @Test
    public void shouldCalculate10dicount(){
        assertEquals(10, dc.calcularDescuent(10.0, 100.0));
        assertNotEquals(11, dc.calcularDescuent(10.0, 100.0));
    }
    @Test
    public void shouldNotDiscount(){
        assertEquals(0, dc.calcularDescuent(0.0, 100.0));
    }
}