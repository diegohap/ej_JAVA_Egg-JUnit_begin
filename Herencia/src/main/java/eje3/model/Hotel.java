package eje3.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hotel extends Alojamiento {
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private boolean gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;
    private int estrellas;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
                 int numeroCamas, int cantidadPisos, boolean gimnasio, String nombreRestaurante, int capacidadRestaurante,
                 int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas, int estrellas) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
        this.estrellas = estrellas;
    }

    @Override
    public double calcularPrecio() {
        double precio = 50 + (1 * capacidadRestaurante);
        if (capacidadRestaurante < 30) {
            precio += 10;
        } else if (capacidadRestaurante <= 50) {
            precio += 30;
        } else {
            precio += 50;
        }

        if (gimnasio) {
            precio += 50;
        } else {
            precio += 30;
        }

        precio += 15 * cantidadLimosinas;

        return precio;
    }

    // Getters y setters
}
