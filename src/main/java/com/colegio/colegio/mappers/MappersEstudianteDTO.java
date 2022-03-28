package com.colegio.colegio.mappers;


import com.colegio.colegio.mappers.request.EstudianteRequest;
import com.colegio.colegio.mappers.response.EstudianteResponse;
import com.colegio.colegio.model.Estudiante;

public class MappersEstudianteDTO {

    public MappersEstudianteDTO() {
        throw new IllegalStateException("Utility class");

    }

    public static EstudianteResponse mappControllerDTO(Estudiante estudiante) {

        return EstudianteResponse.builder()
                .nombre(estudiante.getNombre())
                .edad(estudiante.getEdad())
                .sexo(estudiante.getSexo())
                .nota(estudiante.getNota())
                .cantidadAsignatura(estudiante.getCantidadAsignatura())
                .build();
    }

    public static Estudiante mappServiceDTO(EstudianteRequest estudianteRequest) {
        return Estudiante.builder()
                .nombre(estudianteRequest.getNombre())
                .edad(estudianteRequest.getEdad())
                .sexo(estudianteRequest.getSexo())
                .nota(estudianteRequest.getNota())
                .cantidadAsignatura(estudianteRequest.getCantidadAsignatura())
                .build();
    }
}
