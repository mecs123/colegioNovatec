package com.colegio.colegio.mappers.request;


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
public class EstudianteRequest {

    public String nombre;
    public String sexo;
    public int edad;
    public double nota;
    public int cantidadAsignatura;
}
