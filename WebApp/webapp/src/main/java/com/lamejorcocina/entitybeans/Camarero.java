package com.lamejorcocina.entitybeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Germán Jair Gómez F 
 * EntityBean Camarero
 */

@Entity
public class Camarero {
	
	/*Atributos*/

	@Id
	@Column(name = "id_camarero")
	private Integer id_camarero;

	private String nombre;

	private String apellido1;

	private String apellido2;

	/*Constructor*/
	
	public Camarero(Integer idCamarero, String nombre, String apellido1, String apellido2) {
		super();
		this.id_camarero = idCamarero;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public Camarero() {
		super();
	}

	/*Metodos*/
	
	public Integer getIdCamarero() {
		return id_camarero;
	}

	public void setIdCamarero(Integer idCamarero) {
		this.id_camarero = idCamarero;
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