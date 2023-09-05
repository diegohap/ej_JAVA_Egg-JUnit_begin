package eje3.service;

import eje3.model.Alojamiento;

import java.util.ArrayList;
import java.util.List;

public class AlojamientoService {
    private List<Alojamiento> alojamientos;

    public AlojamientoService() {
        alojamientos = new ArrayList<>();
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }

    public List<Alojamiento> obtenerTodosAlojamientos() {
        return alojamientos;
    }

    // Implementa otros métodos de consulta según los criterios requeridos
}
