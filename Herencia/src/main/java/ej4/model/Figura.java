package ej4.model;

public interface Figura {
    double calcularArea();
    double calcularPerimetro();
    double PI = 3.14159265359; // Valor de PI
    default String getTipo(){
        return this.getClass().getSimpleName().toUpperCase();
    }
}
