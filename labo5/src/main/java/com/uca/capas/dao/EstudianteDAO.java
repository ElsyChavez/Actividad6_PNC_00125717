package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Estudiante;

public interface EstudianteDAO {
	
	public List<Estudiante> findAll() throws DataAccessException;
	
	public Estudiante findOne(Integer code) throws DataAccessException;
	
	//Cosas agregadas por labo 6
	public void save(Estudiante estudiante) throws DataAccessException;
	
	public void delete(Integer codigoEstudiante) throws DataAccessException;

}
