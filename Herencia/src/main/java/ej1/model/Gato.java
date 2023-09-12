package ej1.model;

public class Gato extends Animal implements MovilidadTerrestre{
    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String alimentarse() {
        return super.getNombre() + " solo come " + super.getAlimento();
    }

    @Override
    public void caminar() {
        System.out.println("camina como gato");
    }
    @Override
    public void corre() {

    }
}
