package com.bolsadeideas.springboot.di.app.controllers.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("miServicioComplejo")

public class MiServicioComplejo  implements IServicio{
	
	
	@Override
	public String operacion() {
		
		
		return "ejecutando un proceso  muy importante complicado...";
	}

	

}
