package com.colegio.colegio.service.impl;

import com.colegio.colegio.mappers.MappersEstudianteDTO;
import com.colegio.colegio.mappers.request.EstudianteRequest;
import com.colegio.colegio.model.Estudiante;
import com.colegio.colegio.repository.EstudianteRepository;
import com.colegio.colegio.service.EstudianteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EstudianteServiceImpl implements EstudianteService {

    private EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public Estudiante createEstudiante(EstudianteRequest estudianteRequest) {
        Estudiante estudiante =
        MappersEstudianteDTO.mappServiceDTO(estudianteRequest);
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> listAllEstudiante() {
        return estudianteRepository.findAll();
    }


}
