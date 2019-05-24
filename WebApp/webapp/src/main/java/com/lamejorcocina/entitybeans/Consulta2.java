package com.lamejorcocina.entitybeans;

/**
 * @author Germán Jair Gómez F 
 * Bean Consulta2
 */

public class Consulta2 {

	private Integer idCliente;	
	private String nombre;	
	private String apellido1;	
	private String apellido2;
	private String observaciones;
	private String totalFacturado;
	
	public Consulta2() {
	}

	public Consulta2(Integer idCliente,String nombre, String apellido1, String apellido2, String observaciones, String totalFacturado) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.observaciones = observaciones;
		this.totalFacturado = totalFacturado;
	}
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTotalFacturado() {
		return totalFacturado;
	}
	public void setTotalFacturado(String totalFacturado) {
		this.totalFacturado = totalFacturado;
	}
	
	
}
