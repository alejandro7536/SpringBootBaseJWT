package com.bolsadeideas.springboot.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entety.Menu;

public interface IMenuDao extends CrudRepository<Menu, Long>{
	
}
