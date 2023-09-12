package ej1.model;

public class Pez extends Animal{

    public Pez(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    @Override
    public String alimentarse() {
        return getNombre() + " tiene alimentacion: " + getAlimento();
    }
}
