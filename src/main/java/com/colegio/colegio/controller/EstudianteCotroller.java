package com.colegio.colegio.controller;


import com.colegio.colegio.mappers.MappersEstudianteDTO;
import com.colegio.colegio.mappers.request.EstudianteRequest;
import com.colegio.colegio.mappers.response.EstudianteResponse;
import com.colegio.colegio.model.Estudiante;
import com.colegio.colegio.service.EstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiante")
@CrossOrigin(origins="http://localhost:4200")
public class EstudianteCotroller {

    private EstudianteService estudianteService;

    public EstudianteCotroller(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<EstudianteResponse> createEncuesta(
            @RequestBody EstudianteRequest estudianteRequest){
        EstudianteResponse estudianteResponse =
        MappersEstudianteDTO.mappControllerDTO(
                estudianteService.createEstudiante(estudianteRequest));
        return ResponseEntity.ok(estudianteResponse);
    }

    @GetMapping(value = "/{listar}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Estudiante>> detalleEstudiante(
    ){
        List<Estudiante> prestamoSoicitudResponse =
                estudianteService.listAllEstudiante();
        return ResponseEntity.ok(prestamoSoicitudResponse);
    }


}
