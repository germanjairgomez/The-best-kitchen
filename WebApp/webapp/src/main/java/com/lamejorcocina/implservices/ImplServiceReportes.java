package com.lamejorcocina.implservices;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.Consulta1;
import com.lamejorcocina.entitybeans.Consulta2;
import com.lamejorcocina.entitybeans.DetalleFactura;
import com.lamejorcocina.entitybeans.Factura;
import com.lamejorcocina.services.ServiceReportes;

/**
 * @author Germán Jair Gómez F Implementación de servicios para Reportes
 * @param <E>
 */

@Service
public class ImplServiceReportes implements ServiceReportes {

	@Override
	public Map<Integer, List> consultaQuery1(List<Factura> facturas, List<DetalleFactura> detalleFacturas, List<Camarero> camareros) {
		List<Consulta1> listaConsulta = new ArrayList<>();
		int[] mes = {1,2,3,4,5,6,7,8,9,10,11,12};
		// recorre cada camarero buscando sus ventas
		for (Camarero camarero : camareros) {
			Consulta1 consulta = new Consulta1();
			consulta.setIdCamarero(camarero.getIdCamarero());
			consulta.setNombre(camarero.getNombre());
			consulta.setApellido1(camarero.getApellido1());
			consulta.setApellido2(camarero.getApellido2());
			// recorre cada factura buscando su importe
			for (Factura factura : facturas) {
				// valida si el camarero vendio en esta factura
				if (factura.getCamarero().getIdCamarero().equals(camarero.getIdCamarero())) {
					// recorre todos los detalles de las facturas para sacar el importe
					for (DetalleFactura detalleFactura : detalleFacturas) {
						// valida si el detalle de la factura pertenece a esta factura
						if (detalleFactura.getFactura().getId_factura().equals(factura.getId_factura())) {														
							// valida si ya estaba sumando el importe anteriormente
							if (consulta.getTotalFacturado() != null) {
								// actualiza el valor del importe
								int valorAnterior = Integer.parseInt(consulta.getTotalFacturado());
								int nuevoValor = valorAnterior + Integer.parseInt(detalleFactura.getImporte());
								consulta.setTotalFacturado(String.valueOf(nuevoValor));
							} else {
								// agrega el primer importe del camarero
								consulta.setTotalFacturado(detalleFactura.getImporte());
								//Se extrae el mes
								Calendar calendario = Calendar.getInstance();
								calendario.setTime(new Date(factura.getFechaFactura().getTime()));
								consulta.setMes(calendario.get(Calendar.MONTH));
							}
						}
					}
				} 
			}
			listaConsulta.add(consulta);
		}
		// Se imprime la información
		System.out.println("IMPORTES");
		Map<Integer, List> objetos = new TreeMap<Integer,List>();
		for (Consulta1 consulta : listaConsulta) {
			System.out.println(consulta.getNombre() + " " + consulta.getApellido1() + " " + consulta.getApellido2() + " " + consulta.getTotalFacturado() + " " + consulta.getMes());
			List<String> informacion = new ArrayList<>();
			informacion.add(consulta.getIdCamarero().toString());
			informacion.add(consulta.getNombre());
			informacion.add(consulta.getApellido1());
			informacion.add(consulta.getApellido2());
			if(consulta.getTotalFacturado()!=null) {
				informacion.add(consulta.getTotalFacturado());
			}else {
				informacion.add("");
			}
			if(consulta.getMes()!=null) {
				informacion.add(consulta.getMes().toString());
			}else {
				informacion.add("");
			}			
			objetos.put(consulta.getIdCamarero(), informacion);
		}
		return objetos;
	}	
	
	
	public Map<Integer, List> consultaQuery2(List<Factura> facturas, List<DetalleFactura> detalleFacturas, List<Cliente> clientes) {
		List<Consulta2> listaConsulta = new ArrayList<>();
		int[] mes = {1,2,3,4,5,6,7,8,9,10,11,12};
		// recorre cada cliente buscando sus ventas
		for (Cliente cliente : clientes) {
			Consulta2 consulta = new Consulta2();
			consulta.setIdCliente(cliente.getIdCliente());
			consulta.setNombre(cliente.getNombre());
			consulta.setApellido1(cliente.getApellido1());
			consulta.setApellido2(cliente.getApellido2());
			// recorre cada factura buscando su importe
			for (Factura factura : facturas) {
				// valida si el cliente compro en esta factura
				if (factura.getCliente().getIdCliente().equals(cliente.getIdCliente())) {
					// recorre todos los detalles de las facturas para sacar el importe
					for (DetalleFactura detalleFactura : detalleFacturas) {
						// valida si el detalle de la factura pertenece a esta factura
						if (detalleFactura.getFactura().getId_factura().equals(factura.getId_factura())) {														
							// valida si ya estaba sumando el importe anteriormente
							if (consulta.getTotalFacturado() != null) {
								// actualiza el valor del importe
								int valorAnterior = Integer.parseInt(consulta.getTotalFacturado());
								int nuevoValor = valorAnterior + Integer.parseInt(detalleFactura.getImporte());
								consulta.setTotalFacturado(String.valueOf(nuevoValor));
							} else {
								// agrega el primer importe del cliente
								consulta.setTotalFacturado(detalleFactura.getImporte());
							}
						}
					}
				} 
			}
			listaConsulta.add(consulta);
		}
		// Se imprime la información
		System.out.println("IMPORTES");
		Map<Integer, List> objetos = new TreeMap<Integer,List>();
		for (Consulta2 consulta : listaConsulta) {
			if(consulta.getTotalFacturado() != null && Integer.parseInt(consulta.getTotalFacturado()) > 100000) {
				System.out.println(consulta.getNombre() + " " + consulta.getApellido1() + " " + consulta.getApellido2() + " " + consulta.getTotalFacturado());
				List<String> informacion = new ArrayList<>();
				informacion.add(consulta.getIdCliente().toString());
				informacion.add(consulta.getNombre());
				informacion.add(consulta.getApellido1());
				informacion.add(consulta.getApellido2());
				if(consulta.getTotalFacturado() !=null) {
					informacion.add(consulta.getTotalFacturado());
				}else {
					informacion.add("");
				}				
				objetos.put(consulta.getIdCliente(), informacion);
			}			
		}
		return objetos;
	}
}