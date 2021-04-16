package com.udemy.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.controller.CursoController;
import com.udemy.entity.Curso;
import com.udemy.repository.Curso_Jpa_Repository;
import com.udemy.service.CursoService;


@Service("cursoServiceImpl")
public class CursoServiceImpl implements CursoService {
	
	private static final Log LOG = LogFactory.getLog(CursoServiceImpl.class);
	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private Curso_Jpa_Repository cursoJpaRepository;

	@Override
	public List<Curso> listAllcursos() {
		LOG.info("call:" +"listAllcursosr()");
		return cursoJpaRepository.findAll();
	
	}

	@Override
	public Curso addCurso(Curso curso) {
		LOG.info("call:" +"addCurso()");
		return cursoJpaRepository.save(curso);
	
	}

	@Override
	public int removeCurso(int id) {
		 cursoJpaRepository.deleteById(id);
		 return 0 ;
	}

	@Override
	public Curso updateCurso(Curso curso) {
		 return cursoJpaRepository.save(curso);
		
	}

}
