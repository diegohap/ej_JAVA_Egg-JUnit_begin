package ej2.model;

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

    // Métodos getters y setters (omitiendo setters para consumoEnergetico)

    public void crearTelevisor() {
        super.crearElectrodomestico(); // Llama al método crearElectrodomestico() de Electrodomestico
        // Llena los atributos propios del televisor (resolucion y sintonizadorTDT)
        // También puedes solicitar información adicional al usuario si es necesario
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Llama al método precioFinal() de Electrodomestico

        // Aumenta el precio según la resolución
        if (resolucion > 40) {
            precioFinal *= 1.3; // Incremento del 30%
        }

        // Aumenta el precio si tiene sintonizador TDT
        if (sintonizadorTDT) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}
