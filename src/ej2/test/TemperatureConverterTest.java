package ej2.test;

import ej2.main.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void celsiusToFarenheit() {
        assertEquals(89.6,TemperatureConverter.celsiusToFarenheit(32.0),0.1);
        assertNotEquals(88.6,TemperatureConverter.celsiusToFarenheit(32.0),0.1);
    }

    @Test
    void celsiusToKelvin() {
        assertEquals(32+273.15, TemperatureConverter.celsiusToKelvin(32.0), 0.1);
        assertNotEquals(31+273.15, TemperatureConverter.celsiusToKelvin(32.0), 0.1);
    }

    @Test
    void farenheitToCelsius() {
        assertEquals(38.33, TemperatureConverter.farenheitToCelsius(101.0), 0.1);
        assertNotEquals(39, TemperatureConverter.farenheitToCelsius(101.0), 0.1);
    }

    @Test
    void farenheitToKelvin() {
        assertEquals(311.48, TemperatureConverter.farenheitToKelvin(101.0), 0.1);
        assertNotEquals(312.48, TemperatureConverter.farenheitToKelvin(101.0), 0.1);
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(32, TemperatureConverter.kelvinToCelsius(32+273.15), 0.1);
        assertNotEquals(31, TemperatureConverter.kelvinToCelsius(32+273.15), 0.1);
    }

    @Test
    void kelvinTofarenheit() {
        assertEquals(89.6, TemperatureConverter.kelvinTofarenheit(305.15), 0.1);
        assertNotEquals(88.6, TemperatureConverter.kelvinTofarenheit(305.15), 0.1);
    }
}