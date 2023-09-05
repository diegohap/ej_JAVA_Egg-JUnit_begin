package ej2y3;

import ej2y3.model.Electrodomestico;
import ej2y3.model.Lavadora;
import ej2y3.model.Televisor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        // Crear una Lavadora
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());

        // Crear un Televisor
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println("Precio final del televisor: $" + televisor.precioFinal());

        System.out.println(electrodomesticos.stream().mapToDouble(e -> e.precioFinal()).sum());
    }
}
