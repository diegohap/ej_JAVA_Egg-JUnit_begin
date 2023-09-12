package ej4.model;

public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }
    @Override
    public double calcularPerimetro() {
        return PI * 2 * radio;
    }
}
