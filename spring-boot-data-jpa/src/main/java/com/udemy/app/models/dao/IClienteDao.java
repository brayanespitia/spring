package com.udemy.app.models.dao;




import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.udemy.app.models.entity.Cliente;


@Repository
public interface IClienteDao  extends PagingAndSortingRepository<Cliente, Long>{
	
	


}
