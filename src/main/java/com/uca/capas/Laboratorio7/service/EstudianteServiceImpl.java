package com.uca.capas.Laboratorio7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.Laboratorio7.domain.Estudiante;
import com.uca.capas.Laboratorio7.repository.EstudianteRepo;

@Service
public class EstudianteServiceImpl  implements EstudianteService{

	@Autowired
	EstudianteRepo estudianteRepo;
	
	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		return estudianteRepo.findAll();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		return estudianteRepo.getOne(code);
	}

	@Override
	public void save(Estudiante estudiante) throws DataAccessException {
		estudianteRepo.save(estudiante);		
	}

	@Override
	public void delete(Integer codigoEstudiante) throws DataAccessException {
		estudianteRepo.deleteById(codigoEstudiante);
	}
	
	@Override
	public void update(Estudiante estudiante) throws DataAccessException {
		estudianteRepo.save(estudiante);
	}

}
