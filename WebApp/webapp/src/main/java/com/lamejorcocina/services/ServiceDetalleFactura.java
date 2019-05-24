package com.lamejorcocina.services;

import java.util.List;

import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.entitybeans.DetalleFactura;
import com.lamejorcocina.entitybeans.Factura;

/**
 * @author Germán Jair Gómez F 
 * Servicios para Detalle Factura
 */

public interface ServiceDetalleFactura {
	
	public boolean registrar(Factura factura, Cocinero cocinero, String plato, String importe);
	
	List<DetalleFactura> consultar();
	
}
