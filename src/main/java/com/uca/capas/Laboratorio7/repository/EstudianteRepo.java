package com.uca.capas.Laboratorio7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.capas.Laboratorio7.domain.Estudiante;

@Repository
public interface EstudianteRepo extends JpaRepository<Estudiante, Integer> {

}
