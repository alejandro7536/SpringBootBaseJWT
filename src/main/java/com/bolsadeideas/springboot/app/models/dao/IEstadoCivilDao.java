package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.EstadoCivil;

public interface IEstadoCivilDao extends CrudRepository<EstadoCivil, Long>{

}
