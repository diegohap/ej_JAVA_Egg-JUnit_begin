package ej1.model;

public class Caballo extends Animal implements MovilidadTerrestre{
    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String alimentarse() {
        return super.getNombre() + " se alimenta con " + super.getAlimento();
    }
    @Override
    public void caminar() {
        System.out.println("camina como caballo");
    }
    @Override
    public void corre() {

    }
}
