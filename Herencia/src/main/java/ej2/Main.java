package ej2;

import ej2.model.Lavadora;
import ej2.model.Televisor;

public class Main {
    public static void main(String[] args) {
        // Crear una Lavadora
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());

        // Crear un Televisor
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println("Precio final del televisor: $" + televisor.precioFinal());
    }
}
