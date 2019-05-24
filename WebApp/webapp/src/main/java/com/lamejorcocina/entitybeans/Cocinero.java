package com.lamejorcocina.entitybeans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Germán Jair Gómez F 
 * EntityBean Cocinero
 */

@Entity
public class Cocinero {

	/*Atributos*/

	@Id
	private Integer id_cocinero;

	private String nombre;

	private String apellido1;

	private String apellido2;

	/*Constructor*/
	
	public Cocinero(Integer idCocinero, String nombre, String apellido1, String apellido2) {
		super();
		this.id_cocinero = idCocinero;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public Cocinero() {
		super();
	}
	
	/*Metodos*/
	
	public Integer getIdCocinero() {
		return id_cocinero;
	}

	public void setIdCocinero(Integer idCocinero) {
		this.id_cocinero = idCocinero;
	}
	
		public String getNombre() {
		return nombre;
	}

		public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
}