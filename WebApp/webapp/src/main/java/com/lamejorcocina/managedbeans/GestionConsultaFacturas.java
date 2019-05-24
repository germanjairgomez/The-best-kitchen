package com.lamejorcocina.managedbeans;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.DetalleFactura;
import com.lamejorcocina.entitybeans.Factura;
import com.lamejorcocina.spring.App;

/**
 * @author Germán Jair Gómez F 
 * Implementación de funciones para las consultas de las facturas del portal web
 */

@ManagedBean(name = "gestionConsultaFacturas")
@ViewScoped
public class GestionConsultaFacturas {
	
	private App app = new App();


	public static void main(String[] args) throws ParseException {
	}

	public Map<Integer, List> consultarFacturas() throws Exception{
		Map<Integer, List> objetos = new TreeMap<Integer,List>();
		List<DetalleFactura> detalleFacturas = app.consultarDetalleFacturas();
		for (DetalleFactura detalleFactura : detalleFacturas) {
			List<String> informacion = new ArrayList<>();
			informacion.add(detalleFactura.getFactura().getId_factura().toString());
			informacion.add(detalleFactura.getFactura().getCliente().getNombre());
			informacion.add(detalleFactura.getFactura().getCamarero().getNombre());
			informacion.add(detalleFactura.getFactura().getMesa().getUbicacion());
			informacion.add(detalleFactura.getFactura().getFechaFactura().toString());
			informacion.add(detalleFactura.getCocinero().getNombre());
			informacion.add(detalleFactura.getPlato());
			informacion.add(detalleFactura.getImporte());
			objetos.put(detalleFactura.getIdDetalleFactura(), informacion);
		}		
		return objetos;
	}

}