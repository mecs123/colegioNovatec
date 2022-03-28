package com.colegio.colegio.service;

import com.colegio.colegio.mappers.request.EstudianteRequest;
import com.colegio.colegio.model.Estudiante;

import java.util.List;

public interface EstudianteService {
    Estudiante createEstudiante(EstudianteRequest estudianteRequest);

    List<Estudiante> listAllEstudiante();
}
