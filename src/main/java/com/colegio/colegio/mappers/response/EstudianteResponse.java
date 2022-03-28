package com.colegio.colegio.mappers.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  Estudiante
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EstudianteResponse {

    public String nombre;
    public String sexo;
    public int edad;
    public double nota;
    public int cantidadAsignatura;
}
