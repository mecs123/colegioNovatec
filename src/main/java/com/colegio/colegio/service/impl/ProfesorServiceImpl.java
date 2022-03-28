package com.colegio.colegio.service.impl;

import com.colegio.colegio.mappers.MappersProfesorDTO;
import com.colegio.colegio.mappers.request.ProfesorRequest;
import com.colegio.colegio.model.Profesor;
import com.colegio.colegio.repository.ProfesorRepository;
import com.colegio.colegio.service.ProfesorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProfesorServiceImpl implements ProfesorService {

    private ProfesorRepository profesorRepository;

    public ProfesorServiceImpl(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public Profesor createProfesor(ProfesorRequest profesorRequest) {
        Profesor profesor =
                MappersProfesorDTO.mappServiceDTO(profesorRequest);
        return profesorRepository.save(profesor);
    }

    @Override
    public List<Profesor> listAllProfesor() {
        return profesorRepository.findAll();
    }
}
