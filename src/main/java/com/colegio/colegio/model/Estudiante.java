package com.colegio.colegio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 *  Estudiante
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "nombre", nullable = false)
    public String nombre;
    @JsonProperty("Sexo")
    public String sexo;
    public int edad;
    public double nota;
    public int cantidadAsignatura;
}
