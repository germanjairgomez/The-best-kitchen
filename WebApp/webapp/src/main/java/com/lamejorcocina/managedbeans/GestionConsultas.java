package com.lamejorcocina.managedbeans;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.entitybeans.Mesa;
import com.lamejorcocina.spring.App;

/**
 * @author Germán Jair Gómez F 
 * Implementación de funciones para las consultas del portal web
 */

@ManagedBean(name = "gestionConsultas")
@ViewScoped
public class GestionConsultas {
	
	private App app = new App();


	private int idPersona;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String observaciones = null;
	private String tipoRegistro;
	private String ubicacion;
	private int numMaxComensales;

	public static void main(String[] args) throws ParseException {
	}

	public  Map<Integer, List> consultar(String tipoRegistro) throws Exception {
		Map<Integer, List> objetos = new TreeMap<Integer,List>();
		switch (tipoRegistro) {
		case "camarero":
			List<Camarero> camareros = app.consultarCamareros();
			for (Camarero camarero : camareros) {
				List<String> informacion = new ArrayList<>();
				informacion.add(camarero.getIdCamarero().toString());
				informacion.add(camarero.getNombre());
				informacion.add(camarero.getApellido1());
				informacion.add(camarero.getApellido2());
				objetos.put(camarero.getIdCamarero(), informacion);
			}
			break;
		case "cliente":
			List<Cliente> clientes = app.consultarClientes();
			for (Cliente cliente : clientes) {
				List<String> informacion = new ArrayList<>();
				informacion.add(cliente.getIdCliente().toString());
				informacion.add(cliente.getNombre());
				informacion.add(cliente.getApellido1());
				informacion.add(cliente.getApellido2());
				informacion.add(cliente.getObservaciones());
				objetos.put(cliente.getIdCliente(), informacion);
			}
			break;
		case "cocinero":
			List<Cocinero> cocineros = app.consultarCocineros();
			for (Cocinero cocinero : cocineros) {
				List<String> informacion = new ArrayList<>();
				informacion.add(cocinero.getIdCocinero().toString());
				informacion.add(cocinero.getNombre());
				informacion.add(cocinero.getApellido1());
				informacion.add(cocinero.getApellido2());
				objetos.put(cocinero.getIdCocinero(), informacion);
			}
			break;
		case "mesa":
			List<Mesa> mesas = app.consultarMesas();
			for (Mesa mesa: mesas) {
				List<String> informacion = new ArrayList<>();
				informacion.add(mesa.getIdMesa().toString());
				informacion.add(mesa.getNumMaxComensales().toString());
				informacion.add(mesa.getUbicacion());
				objetos.put(mesa.getIdMesa(), informacion);
			}
			break;
		default:
			FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
		}
		return objetos;
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


	

}