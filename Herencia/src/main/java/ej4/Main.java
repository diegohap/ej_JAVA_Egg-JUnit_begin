package ej4;

import ej4.model.Circulo;
import ej4.model.Figura;
import ej4.model.Rectangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de círculo y rectángulo
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(rectangulo);

        // Calcular y mostrar área y perímetro
        figuras.forEach(figura -> {
                //String nombre = figura.getClass().getSimpleName();
                String nombre = figura.getTipo();
                System.out.println("Area del " + nombre + ": " + figura.calcularArea());
                System.out.println("Perimetro del " + nombre + ": " + figura.calcularPerimetro());
            });
    }
}
