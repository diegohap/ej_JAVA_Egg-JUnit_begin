package ej1.model;

public class Perro extends Animal implements MovilidadTerrestre {
    private String color;
    public Perro(String nombre, String alimento, Integer edad, String raza, String color) {
        super(nombre, alimento, edad, raza);
        this.color = color;
    }
    @Override
    public String alimentarse() {
        return getNombre() + " tiene alimentacion: " + getAlimento();
    }
    public String getColor() {
        return color;
    }
    @Override
    public void caminar() {
        System.out.println("camina como perro");
    }
    @Override
    public void corre() {

    }
}
