package com.colegio.colegio.repository;

import com.colegio.colegio.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
