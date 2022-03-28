package com.colegio.colegio.service;

import com.colegio.colegio.mappers.request.ProfesorRequest;
import com.colegio.colegio.model.Profesor;

import java.util.List;

public interface ProfesorService {
    Profesor createProfesor(ProfesorRequest profesorRequest);

    List<Profesor> listAllProfesor();
}
