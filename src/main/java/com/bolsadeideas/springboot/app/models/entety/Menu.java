package com.bolsadeideas.springboot.app.models.entety;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "menu")
public class Menu implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_id")
	private Long id ;
	
	private String menu_nombre;
	
	private String menu_url;
	
	private String menu_icono;
	
	private boolean menu_configurable;
	
	private boolean menu_es_asignable;
	
	@JsonIgnore
	@ManyToMany(fetch =FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "menus")
	private List<Role> roles = new ArrayList<>();

	public Menu() {
	
	}

	
	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMenu_nombre() {
		return menu_nombre;
	}

	public void setMenu_nombre(String menu_nombre) {
		this.menu_nombre = menu_nombre;
	}

	public String getMenu_url() {
		return menu_url;
	}

	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}

	public String getMenu_icono() {
		return menu_icono;
	}

	public void setMenu_icono(String menu_icono) {
		this.menu_icono = menu_icono;
	}

	public boolean isMenu_configurable() {
		return menu_configurable;
	}

	public void setMenu_configurable(boolean menu_configurable) {
		this.menu_configurable = menu_configurable;
	}

	public boolean isMenu_es_asignable() {
		return menu_es_asignable;
	}

	public void setMenu_es_asignable(boolean menu_es_asignable) {
		this.menu_es_asignable = menu_es_asignable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
