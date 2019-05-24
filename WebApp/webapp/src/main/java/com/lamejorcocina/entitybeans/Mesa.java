package com.lamejorcocina.entitybeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Germán Jair Gómez F 
 * EntityBean Mesa
 */

@Entity
public class Mesa {
	
	/*Atributos*/

	@Id
	@Column(name = "id_mesa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_mesa;

	private Integer num_max_comensales;

	private String ubicacion;

	/*Constructor*/
	
	public Mesa(Integer idMesa, Integer numMaxComensales, String ubicacion) {
		super();
		this.id_mesa = idMesa;
		this.num_max_comensales = numMaxComensales;
		this.ubicacion = ubicacion;
	}

	public Mesa() {
		super();
	}

	/*Metodos*/

	public Integer getIdMesa() {
		return id_mesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.id_mesa = idMesa;
	}

	public Integer getNumMaxComensales() {
		return num_max_comensales;
	}

	public void setNumMaxComensales(Integer numMaxComensales) {
		this.num_max_comensales = numMaxComensales;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}