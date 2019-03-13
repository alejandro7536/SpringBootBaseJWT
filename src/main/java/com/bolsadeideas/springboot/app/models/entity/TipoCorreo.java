package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class TipoCorreo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "tipo_correo_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Length(max = 50)
	private String tipo_correo_nombre;
	
	@NotEmpty
	@Length(max = 200)
	private String tipo_correo_descripcion;

	public TipoCorreo() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo_correo_nombre() {
		return tipo_correo_nombre;
	}

	public void setTipo_correo_nombre(String tipo_correo_nombre) {
		this.tipo_correo_nombre = tipo_correo_nombre;
	}

	public String getTipo_correo_descripcion() {
		return tipo_correo_descripcion;
	}

	public void setTipo_correo_descripcion(String tipo_correo_descripcion) {
		this.tipo_correo_descripcion = tipo_correo_descripcion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
