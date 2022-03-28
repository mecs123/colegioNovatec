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
public class ProfesorRequest {

    public String nombre;
    public int edad;
    public String jornda;

}
