package eje3.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Residencia extends AlojamientoExtrahotelero {
    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean esPrivado, double metrosCuadrados,
                      int cantidadHabitaciones, boolean descuentoGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public double calcularPrecio() {
        return 20.0 + 1.5*cantidadHabitaciones + (descuentoGremios ? 10.0 : 20.0) + (tieneCampoDeportivo ? 5.0 : 0.0);
    }

    // Getters y setters
}
