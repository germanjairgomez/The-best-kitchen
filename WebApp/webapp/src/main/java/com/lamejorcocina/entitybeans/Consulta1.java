package com.lamejorcocina.entitybeans;

/**
 * @author Germán Jair Gómez F 
 * Bean Consulta1
 */

public class Consulta1 {

	private Integer idCamarero;	
	private String nombre;	
	private String apellido1;	
	private String apellido2;
	private Integer mes;
	private String totalFacturado;
	
	public Consulta1() {
	}

	public Consulta1(Integer idCamarero,String nombre, String apellido1, String apellido2, Integer mes, String totalFacturado) {
		super();
		this.idCamarero = idCamarero;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.mes = mes;
		this.totalFacturado = totalFacturado;
	}
	
	public Integer getIdCamarero() {
		return idCamarero;
	}

	public void setIdCamarero(Integer idCamarero) {
		this.idCamarero = idCamarero;
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
	
	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public String getTotalFacturado() {
		return totalFacturado;
	}
	public void setTotalFacturado(String totalFacturado) {
		this.totalFacturado = totalFacturado;
	}
	
	
}
