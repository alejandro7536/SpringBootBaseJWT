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
public class TipoTelefono implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "tipo_telefono_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Length(max = 50)
	private String tipo_telefono_nombre;
	
	@NotEmpty
	@Length(max = 200)
	private String tipo_telefono_descripcion;
	
	@NotEmpty
	private int tipo_telefono_num_caracter;

	public TipoTelefono() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo_telefono_nombre() {
		return tipo_telefono_nombre;
	}

	public void setTipo_telefono_nombre(String tipo_telefono_nombre) {
		this.tipo_telefono_nombre = tipo_telefono_nombre;
	}

	public String getTipo_telefono_descripcion() {
		return tipo_telefono_descripcion;
	}

	public void setTipo_telefono_descripcion(String tipo_telefono_descripcion) {
		this.tipo_telefono_descripcion = tipo_telefono_descripcion;
	}

	public int getTipo_telefono_num_caracter() {
		return tipo_telefono_num_caracter;
	}

	public void setTipo_telefono_num_caracter(int tipo_telefono_num_caracter) {
		this.tipo_telefono_num_caracter = tipo_telefono_num_caracter;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
