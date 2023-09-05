package eje3;

import eje3.model.Alojamiento;
import eje3.model.Camping;
import eje3.model.Hotel;
import eje3.model.Residencia;
import eje3.service.AlojamientoService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Simulación: crea y gestiona los alojamientos
        AlojamientoService alojamientoService = new AlojamientoService();

        // Agrega alojamientos (hoteles, camping, residencias)
        Hotel hotel1 = new Hotel("Hotel A", "Dirección A", "Localidad A", "Gerente A", 100, 200, 5,
                true, "Restaurante A", 60, 3, 20, 2, 4);
        alojamientoService.agregarAlojamiento(hotel1);

        Camping camping1 = new Camping("Camping B", "Dirección B", "Localidad B", "Gerente B", false, 5000.0,
                100, 20, true);
        alojamientoService.agregarAlojamiento(camping1);

        Residencia residencia1 = new Residencia("Residencia C", "Dirección C", "Localidad C", "Gerente C", true, 300.0,
                30, true, true);
        alojamientoService.agregarAlojamiento(residencia1);

        // Consulta todos los alojamientos
        List<Alojamiento> todosAlojamientos = alojamientoService.obtenerTodosAlojamientos();
        for (Alojamiento alojamiento : todosAlojamientos) {
            System.out.println("Nombre: " + alojamiento.getNombre());
            System.out.println("Precio: $" + alojamiento.calcularPrecio());
            System.out.println("----------");
        }

        // Implementa otras consultas según los criterios requeridos
    }
}
