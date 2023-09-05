package eje3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Alojamiento {
    private String nombre;
    private String direccion;
    private String localidad;
    private String gerente;

    public abstract double calcularPrecio();

    // Getters y setters
}
