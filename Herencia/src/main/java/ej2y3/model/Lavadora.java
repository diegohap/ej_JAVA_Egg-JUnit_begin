package ej2y3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Lavadora extends Electrodomestico {
    private double carga;

    // Constructor vacío
    public Lavadora() {
        super(); // Llama al constructor vacío de Electrodomestico
        this.carga = 5; // Carga de 5 kg por defecto
    }

    // Constructor con atributos
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso); // Llama al constructor con atributos de Electrodomestico
        this.carga = carga;
    }

    public Lavadora(Electrodomestico e, double carga){
        super(e.getPrecioBase(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        this.carga = carga;
    }

    // Métodos getters y setters (omitiendo setters para consumoEnergetico)

    public static Lavadora crearLavadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creación de Lavadora");
        Electrodomestico e = crearElectrodomestico();

        System.out.print("Ingrese la carga (kg): ");
        int carga = scanner.nextInt();

        return new Lavadora(e, carga);
    }

    @Override
    public double precioFinal() {
        return super.precioFinal() + (carga > 30 ? 500 : 0);
    }
}
