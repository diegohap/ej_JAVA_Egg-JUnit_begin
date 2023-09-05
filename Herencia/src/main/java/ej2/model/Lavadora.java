package ej2.model;

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

    // Métodos getters y setters (omitiendo setters para consumoEnergetico)

    public Lavadora crearLavadora() {
        super.crearElectrodomestico(); // Llama al método crearElectrodomestico() de Electrodomestico
        // Llena el atributo propio de la lavadora (carga)
        // También puedes solicitar información adicional al usuario si es necesario
        return this;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Llama al método precioFinal() de Electrodomestico

        // Aumenta el precio según la carga
        if (carga > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}
