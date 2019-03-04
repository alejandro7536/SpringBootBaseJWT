package com.bolsadeideas.springboot.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entety.Role;

public interface IRoleDao extends CrudRepository<Role, Long>{

	
}
