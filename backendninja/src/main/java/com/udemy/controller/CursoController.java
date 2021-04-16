package com.udemy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.entity.Curso;
import com.udemy.service.CursoService;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	
	private static final Log LOG = LogFactory.getLog(CursoController.class);
	
	
	@Autowired
	@Qualifier("cursoServiceImpl")
	private CursoService cursoService;
	
	
	@GetMapping("listarcursos")
	public ModelAndView listarCursos() {
		LOG.info("CALL: " + " listarCursos()");
		ModelAndView mav = new ModelAndView("cursos");
		mav.addObject("curso", new Curso());
		mav.addObject("cursos", cursoService.listAllcursos());
		
		return mav;
		
	}
	
	
	@PostMapping("/addcurso")
	public String addCurso(@ModelAttribute("curso") Curso curso) {
		LOG.info("CALL: " + " addCurso()" + "--Param:" + curso.toString());
		cursoService.addCurso(curso);
		return "redirect:/cursos/listarcursos";
	}

}
