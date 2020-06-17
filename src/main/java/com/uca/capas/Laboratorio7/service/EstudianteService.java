package com.uca.capas.Laboratorio7.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.Laboratorio7.domain.Estudiante;

@Service
public interface EstudianteService {
	
	public List<Estudiante> findAll() throws DataAccessException;
	
	public Estudiante findOne(Integer code) throws DataAccessException;
	
	public void save(Estudiante estudiante) throws DataAccessException;
	
	public void delete(Integer codigoEstudiante) throws DataAccessException;
	
	public void update(Estudiante estudiante) throws DataAccessException;
}
