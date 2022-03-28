package com.colegio.colegio.controller;


import com.colegio.colegio.mappers.MappersProfesorDTO;
import com.colegio.colegio.mappers.request.ProfesorRequest;
import com.colegio.colegio.mappers.response.ProfesorResponse;
import com.colegio.colegio.model.Profesor;
import com.colegio.colegio.service.ProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profesor")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfesorCotroller {

    private ProfesorService profesorService;

    public ProfesorCotroller(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProfesorResponse> createEncuesta(
            @RequestBody ProfesorRequest profesorRequest){
        ProfesorResponse profesorResponse =
        MappersProfesorDTO.mappControllerDTO(
                profesorService.createProfesor(profesorRequest));
        return ResponseEntity.ok(profesorResponse);
    }


    @GetMapping(value = "/{listar}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Profesor>> detalleEstudiante(
    ){
        List<Profesor> profesorResponse =
                profesorService.listAllProfesor();
        return ResponseEntity.ok(profesorResponse);
    }


}
