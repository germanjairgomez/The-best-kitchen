package com.lamejorcocina.managedbeans;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.entitybeans.Mesa;
import com.lamejorcocina.spring.App;


/**
 * @author Germán Jair Gómez F 
 * Implementación de funciones para el manejo de las facturas del portal web
 */


@ManagedBean(name = "gestionRegistroFactura")
@ViewScoped
public class GestionRegistroFactura {
	
	private App app = new App();


	private int idCliente;
	private String resultado;
	private int idCamarero;
	private int idCocinero;
	private int idMesa;
	private Date fechaFactura;
	private String plato;
	private String importe;
	private List<String> nombres = new ArrayList<>();
	

	public static void main(String[] args) throws ParseException {
	}

	public List<String> consultarObjetosIDs(String tipoConsulta) throws Exception{
		GestionConsultas consulta = new GestionConsultas();
		Map<Integer, List> objetosMap = consulta.consultar(tipoConsulta);
		List<String> objetosIDs = new ArrayList<>();
		for (Integer key : objetosMap.keySet()) {
			objetosIDs.add(key.toString());
		}
		return objetosIDs;
	}
	
	public String registrar() throws ParseException {
		Cliente cliente = app.consultarCliente(idCliente);
		Camarero camarero = app.consultarCamarero(idCamarero);
		Cocinero cocinero = app.consultarCocinero(idCocinero);
		Mesa mesa = app.consultarMesa(idMesa);
		
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
		String strFechaFactura = dateFormat.format(fechaFactura);
		Timestamp fecha = app.formatearFecha(strFechaFactura);
		
		
		boolean registroExitoso = false;
		
		registroExitoso = app.registrarFactura(cliente, camarero, mesa, fecha, cocinero, plato, importe);
		if(registroExitoso == true) {
			resultado = "Registro exitoso";
			return resultado;
		}else {
			resultado = "Registro Fallido";
			return resultado;
		}
	}

	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public int getIdCamarero() {
		return idCamarero;
	}


	public void setIdCamarero(int idCamarero) {
		this.idCamarero = idCamarero;
	}


	public int getIdCocinero() {
		return idCocinero;
	}


	public void setIdCocinero(int idCocinero) {
		this.idCocinero = idCocinero;
	}


	public int getIdMesa() {
		return idMesa;
	}


	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public String getImporte() {
		return importe;
	}

	public void setImporte(String importe) {
		this.importe = importe;
	}

	public List<String> getNombres() {
		return nombres;
	}

	public void setNombres(List<String> nombres) {
		this.nombres = nombres;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	
}