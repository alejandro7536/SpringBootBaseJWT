package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class EstadoCivil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "estado_civil_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String estado_civil_nombre;
	
	@NotEmpty
	private String estado_civil_descripcion;
	
	@NotEmpty
	private boolean estado_civil_estado;

	public EstadoCivil() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado_civil_nombre() {
		return estado_civil_nombre;
	}

	public void setEstado_civil_nombre(String estado_civil_nombre) {
		this.estado_civil_nombre = estado_civil_nombre;
	}

	public String getEstado_civil_descripcion() {
		return estado_civil_descripcion;
	}

	public void setEstado_civil_descripcion(String estado_civil_descripcion) {
		this.estado_civil_descripcion = estado_civil_descripcion;
	}

	public boolean isEstado_civil_estado() {
		return estado_civil_estado;
	}

	public void setEstado_civil_estado(boolean estado_civil_estado) {
		this.estado_civil_estado = estado_civil_estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
