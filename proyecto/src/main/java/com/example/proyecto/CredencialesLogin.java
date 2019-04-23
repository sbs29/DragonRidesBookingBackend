package com.example.proyecto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CredencialesLogin {

	@Id
	private Long id;

	@Column
	private String nombre;

	@Column
	private String contraseña;

	public CredencialesLogin() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "CredencialesLogin [id=" + id + ", nombre=" + nombre + ", contraseña=" + contraseña + "]";
	}

}
