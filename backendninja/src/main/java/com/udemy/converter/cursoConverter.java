package com.udemy.converter;

import org.springframework.stereotype.Component;

import com.udemy.entity.Curso;
import com.udemy.model.CursoModel;

@Component("cursoConverter")
public class cursoConverter {
	
	
	//transsforma de una entiti a un model
	
	public CursoModel entityTomodel(Curso curso) {
		CursoModel cursoModel = new CursoModel();
		cursoModel.setNombre(curso.getNombre());
		cursoModel.setDescripcion(curso.getDescripcion());
		cursoModel.setPrecio(curso.getPrecio());
		cursoModel.setHoras(curso.getHoras());
		return cursoModel;
	}
	
	
	
	//transforma de un model a una entity

	//public Curso modelToentity (CursoModel cursoModel) {}

	
}
