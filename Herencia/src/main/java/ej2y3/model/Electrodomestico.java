package ej2y3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    // Constructor vacío
    public Electrodomestico() {
        this.precioBase = 1000; // Precio base $1000
        this.color = "blanco"; // Color blanco por defecto
        this.consumoEnergetico = 'F'; // Consumo energético F por defecto
        this.peso = 5; // Peso 5 kg por defecto
    }

    // Constructor con atributos
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Métodos getters y setters (omitiendo setters para consumoEnergetico)

    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F'; // Letra F por defecto si es incorrecta
        }
    }

    private void comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        color = color.toLowerCase();
        for (String c : coloresDisponibles) {
            if (color.equals(c)) {
                this.color = color;
                return;
            }
        }
        this.color = "blanco"; // Color blanco por defecto si es incorrecto
    }

    public static Electrodomestico crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creación de Electrodoméstico");
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese el consumo energético (A-F): ");
        char consumo = scanner.next().charAt(0);

        Electrodomestico electrodomestico = new Electrodomestico(precio, color, consumo, peso);
        electrodomestico.comprobarColor(color);
        electrodomestico.comprobarConsumoEnergetico(consumo);

        return electrodomestico;
    }

    public double precioFinal() {
        double precioFinal = precioBase;

        // Aumenta el precio según el consumo energético
        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        // Aumenta el precio según el peso
        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}
