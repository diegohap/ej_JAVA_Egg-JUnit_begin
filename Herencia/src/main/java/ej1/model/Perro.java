package ej1.model;

public class Perro extends Animal {
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String alimentarse() {
        return getNombre() + " tiene alimentacion: " + getAlimento();
    }
}
