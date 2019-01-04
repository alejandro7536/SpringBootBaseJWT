package com.bolsadeideas.springboot.app.models.dao;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeideas.springboot.app.models.entety.Cliente;

public interface IClienteDao extends PagingAndSortingRepository< Cliente, Long >{
	//Repositorio es igual al DAO se usa hereda de la clase CrudRepository para usar los metodos de CRUD necesarios
	
	@Query("select c from Cliente c left join fetch c.facturas f where c.id=?1 ")
	public Cliente fetchByIdWithFacturas(Long id); 
	
	

}
