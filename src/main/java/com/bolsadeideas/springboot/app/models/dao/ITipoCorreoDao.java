package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.TipoCorreo;

public interface ITipoCorreoDao extends CrudRepository<TipoCorreo, Long>{

}
