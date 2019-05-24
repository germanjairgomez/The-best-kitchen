package com.lamejorcocina.managedbeans;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.DetalleFactura;
import com.lamejorcocina.entitybeans.Factura;
import com.lamejorcocina.spring.App;


/**
 * @author Germán Jair Gómez F 
 * Implementación de funciones las ejecuciones de los Querys solicitados
 */


@ManagedBean(name = "gestionConsultaQuerys")
@ViewScoped
public class GestionConsultaQuerys {
	
	private App app = new App();


	public static void main(String[] args) throws ParseException {
	}

	public Map<Integer, List> consultarQuery1() throws Exception{
		List<Factura> facturas = app.consultarFacturas();
		List<DetalleFactura> detalleFacturas = app.consultarDetalleFacturas();
		List<Camarero> camareros = app.consultarCamareros();
		
		Map<Integer, List> objetosMap = app.consultarQuery1(facturas, detalleFacturas, camareros);
		return objetosMap;
	}
	
	public Map<Integer, List> consultarQuery2() throws Exception{
		List<Factura> facturas = app.consultarFacturas();
		List<DetalleFactura> detalleFacturas = app.consultarDetalleFacturas();
		List<Cliente> clientes = app.consultarClientes();
		
		Map<Integer, List> objetosMap = app.consultarQuery2(facturas, detalleFacturas, clientes);
		return objetosMap;
	}

}