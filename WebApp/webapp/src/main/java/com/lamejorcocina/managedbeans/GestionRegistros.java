package com.lamejorcocina.managedbeans;

import java.io.IOException;
import java.text.ParseException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.lamejorcocina.spring.App;


/**
 * @author Germán Jair Gómez F 
 * Implementación de funciones para los registros e inserciones del portal web
 */

@ManagedBean(name = "gestionRegistros")
@ViewScoped
public class GestionRegistros {
	
	private App app = new App();


	private int idPersona;
	private String resultado;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String observaciones = null;
	private String tipoRegistro;
	private String ubicacion;
	private int numMaxComensales;

	public static void main(String[] args) throws ParseException {
	}

	public String registrar(String tipoRegistro) throws IOException {
		boolean registroExitoso = false;
		switch (tipoRegistro) {
		case "camarero":
				registroExitoso = app.registrarCamarero(idPersona, nombre, primerApellido, segundoApellido);
			break;
		case "cliente":
				registroExitoso = app.registrarCliente(idPersona, nombre, primerApellido, segundoApellido, observaciones);
			break;
		case "cocinero":
				registroExitoso = app.registrarCocinero(idPersona, nombre, primerApellido, segundoApellido);
			break;
		case "mesa":
			registroExitoso = app.registrarMesa(numMaxComensales, ubicacion);
			break;
		default:
			FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
		}
		if(registroExitoso == true) {
			resultado = "Registro exitoso";
			return resultado;
		}else {
			resultado = "Registro Fallido";
			return resultado;
		}
	}
	
	public String getValidarResultado(){
		return "index?faces-redirect=true";
	}
	
		

	public int getidPersona() {
		return idPersona;
	}

	public void setidPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumMaxComensales() {
		return numMaxComensales;
	}

	public void setNumMaxComensales(int numMaxComensales) {
		this.numMaxComensales = numMaxComensales;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}


	

}