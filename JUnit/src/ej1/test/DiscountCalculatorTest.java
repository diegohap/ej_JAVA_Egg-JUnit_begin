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
        assertEquals(10, dc.calcularDescuent(90.0, 100.0), 1);
        assertNotEquals(11, dc.calcularDescuent(10.0, 100.0));
    }
    @Test
    public void shouldNotDiscount(){
        assertEquals(0, dc.calcularDescuent(100.0, 100.0));
    }
    @Test
    public void shouldNotDiscountMoreThanLimitDiscount(){
        assertTrue(dc.DESCUENTO_MAXIMO > dc.calcularDescuent(60.0, 100.0));
        assertEquals(dc.DESCUENTO_MAXIMO, dc.calcularDescuent(40.0, 100.0));
    }
}