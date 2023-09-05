package eje3.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Camping extends AlojamientoExtrahotelero {
    private int capacidadMaximaCarpas;
    private int cantidadBanios;
    private boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean esPrivado, double metrosCuadrados,
                   int capacidadMaximaCarpas, int cantidadBanios, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public double calcularPrecio() {
        return 10.0 + 1.1*capacidadMaximaCarpas + 1.5*cantidadBanios + (tieneRestaurante ? 5.0 : 0.0);
    }

    // Getters y setters
}