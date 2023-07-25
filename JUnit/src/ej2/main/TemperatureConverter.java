package ej2.main;

public class TemperatureConverter {

    public TemperatureConverter() {
    }

    public static Double celsiusToFarenheit(Double c){
        return c*1.8+32;
    }
    public static Double celsiusToKelvin(Double c) {
        return c+273.15;
    }
    public static Double farenheitToCelsius(Double f) {
        return (f-32)*5/9;
    }
    public static Double farenheitToKelvin(Double f) {
        return (f-32)/1.8+273.15;
    }
    public static Double kelvinToCelsius(Double k) {
        return k-273.15;
    }
    public static Double kelvinTofarenheit(Double k) {
        return (k-273.15)*1.8+32;
    }

}