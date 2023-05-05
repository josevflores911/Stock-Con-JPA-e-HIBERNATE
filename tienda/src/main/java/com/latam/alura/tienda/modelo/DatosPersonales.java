package com.latam.alura.tienda.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DatosPersonales implements Serializable {
	
	private String nombre;
	private String cedula;

	public DatosPersonales() {
	}
	
	public DatosPersonales(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
