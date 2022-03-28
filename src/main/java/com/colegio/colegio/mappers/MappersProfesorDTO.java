package com.colegio.colegio.mappers;


import com.colegio.colegio.mappers.request.ProfesorRequest;
import com.colegio.colegio.mappers.response.EstudianteResponse;
import com.colegio.colegio.mappers.response.ProfesorResponse;
import com.colegio.colegio.model.Profesor;

public class MappersProfesorDTO {

    public MappersProfesorDTO() {
        throw new IllegalStateException("Utility class");

    }

    public static ProfesorResponse mappControllerDTO(Profesor profesor) {

        return ProfesorResponse.builder()
                .id(profesor.getId())
                .nombre(profesor.getNombre())
                .edad(profesor.getEdad())
                .jornda(profesor.getJornda())
                .build();
    }

    public static Profesor mappServiceDTO(ProfesorRequest profesorRequest) {
        return Profesor.builder()
                .nombre(profesorRequest.getNombre())
                .edad(profesorRequest.getEdad())
                .jornda(profesorRequest.getJornda())
                .build();
    }
}
