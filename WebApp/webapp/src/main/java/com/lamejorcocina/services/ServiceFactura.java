package com.lamejorcocina.services;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.List;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.entitybeans.Factura;
import com.lamejorcocina.entitybeans.Mesa;

/**
 * @author Germán Jair Gómez F 
 * Servicios para Factura
 */

public interface ServiceFactura {
	
	public boolean registrar(Cliente cliente, Camarero camarero, Mesa mesa, Timestamp fechaFactura, Cocinero cocinero, String plato, String importe);
	
	public Timestamp formatearFecha(String strFechaFactura) throws ParseException;
	
	public List<Factura> consultar();
	
}
