package com.udemy.component;

import org.apache.commons.logging.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.udemy.repository.Curso_Jpa_Repository;

@Component("exampleComponent")
public class ExampleComponent {
	
	private static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	
	@Autowired
	@Qualifier("cursoJpaRepository")
	
	private Curso_Jpa_Repository cursoJpaRepository;
	
	public void sayHello (){

		
		LOG.info("Hola desde ejemplo componente");
	}

}
