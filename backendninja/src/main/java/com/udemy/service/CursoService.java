package com.udemy.service;

import java.util.List;
import com.udemy.entity.*;


public interface CursoService {
	
	public abstract List<Curso> listAllcursos();
	public abstract Curso addCurso(Curso curso);
	public abstract int removeCurso(int id);
	public abstract Curso updateCurso(Curso curso);

	
}
