package com.lamejorcocina.services;

import java.util.List;
import java.util.Map;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.DetalleFactura;
import com.lamejorcocina.entitybeans.Factura;

/**
 * @author Germán Jair Gómez F 
 * Servicios para Reportes
 */

public interface ServiceReportes {
	
	public Map<Integer, List> consultaQuery1(List<Factura> facturas, List<DetalleFactura> detalleFacturas, List<Camarero> camareros);
	
	public Map<Integer, List> consultaQuery2(List<Factura> facturas, List<DetalleFactura> detalleFacturas, List<Cliente> cliente);
	
}
