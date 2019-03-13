package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String authority;
	
	private String rol_descripcion;
	
	private boolean rol_estado;
	
	@ManyToMany(fetch= FetchType.EAGER
			, cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="asignacion_rol_menu",
				joinColumns= {@JoinColumn(name="rol_id")},
				inverseJoinColumns= {@JoinColumn(name = "menu_id")})
	private List<Menu> menus = new ArrayList<>();
	
	
	public String getRol_descripcion() {
		return rol_descripcion;
	}

	public void setRol_descripcion(String rol_descripcion) {
		this.rol_descripcion = rol_descripcion;
	}

	public boolean isRol_estado() {
		return rol_estado;
	}

	public void setRol_estado(boolean rol_estado) {
		this.rol_estado = rol_estado;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
