package ej1.model;

public class Gato extends Animal{
    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String alimentarse() {
        return super.getNombre() + " solo come " + super.getAlimento();
    }
}
