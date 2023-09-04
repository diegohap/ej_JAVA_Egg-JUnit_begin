package ej1.main;

import java.util.ArrayList;

public class DiscountCalculator {
    public static final Double DESCUENTO_MAXIMO = 50.0;
    //Devuelve el % aplicado
    public Double calcularDescuent(Double precioConRebaja, Double precioOriginal) {
        Double descuento = (1-precioConRebaja/precioOriginal)*100;
        ArrayList<Integer> l = new ArrayList<Integer>();
        return descuento <= DESCUENTO_MAXIMO ? descuento : precioOriginal*DESCUENTO_MAXIMO/100;
    }
}