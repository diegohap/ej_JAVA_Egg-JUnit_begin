package ej1.model;

public class Caballo extends Animal{
    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String alimentarse() {
        return super.getNombre() + " se alimenta con " + super.getAlimento();
    }
}
