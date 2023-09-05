package eje3.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AlojamientoExtrahotelero extends Alojamiento {
    private boolean esPrivado;
    private double metrosCuadrados;

    public AlojamientoExtrahotelero(String nombre, String direccion, String localidad, String gerente, boolean esPrivado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.metrosCuadrados = metrosCuadrados;
    }

    // Getters y setters
}
