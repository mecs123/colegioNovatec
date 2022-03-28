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
public class ProfesorResponse {
    private Long id;
    public String nombre;
    public int edad;
    public String jornda;
}
