package ej2y3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Televisor extends Electrodomestico {
    private int resolucion; // en pulgadas
    private boolean sintonizadorTDT;

    // Constructor vacío
    public Televisor() {
        super(); // Llama al constructor vacío de Electrodomestico
        this.resolucion = 20; // Resolución de 20 pulgadas por defecto
        this.sintonizadorTDT = false; // Sin sintonizador TDT por defecto
    }

    // Constructor con atributos
    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso); // Llama al constructor con atributos de Electrodomestico
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    public Televisor(Electrodomestico e, int resolucion, boolean sintonizadorTDT){
        super(e.getPrecioBase(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Métodos getters y setters (omitiendo setters para consumoEnergetico)

    public static Televisor crearTelevisor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creación de Televisor");
        Electrodomestico e = crearElectrodomestico();

        System.out.print("Ingrese la resolución (pulgadas): ");
        int resolucion = scanner.nextInt();

        System.out.print("¿Tiene sintonizador TDT? (true/false): ");
        boolean sintonizadorTDT = scanner.nextBoolean();

        return new Televisor(e, resolucion, sintonizadorTDT);
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40)
            precioFinal *= 1.3;
        if (sintonizadorTDT)
            precioFinal += 500;
        return precioFinal;
    }
}
