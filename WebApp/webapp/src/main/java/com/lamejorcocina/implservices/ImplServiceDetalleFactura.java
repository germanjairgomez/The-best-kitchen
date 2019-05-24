package com.lamejorcocina.implservices;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.lamejorcocina.dao.DAODetalleFactura;
import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.entitybeans.DetalleFactura;
import com.lamejorcocina.entitybeans.Factura;
import com.lamejorcocina.services.ServiceDetalleFactura;
import com.lamejorcocina.spring.SpringConfiguration;

/**
 * @author Germán Jair Gómez F 
 * Implementación de servicios para Detalle Factura
 */

@Service
public class ImplServiceDetalleFactura implements ServiceDetalleFactura{
	
	@Override
	public boolean registrar(Factura factura, Cocinero cocinero, String plato, String importe) {
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAODetalleFactura detalleFacturaService = contexto.getBean(DAODetalleFactura.class);
		//Creación del objeto
		DetalleFactura detalleFactura = new DetalleFactura();
		detalleFactura.setFactura(factura);
		detalleFactura.setCocinero(cocinero);
		detalleFactura.setPlato(plato);
		detalleFactura.setImporte(importe);
		try {
			//Persistencia
			detalleFacturaService.save(detalleFactura);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Override
	public List<DetalleFactura> consultar(){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAODetalleFactura detalleFacturaService = contexto.getBean(DAODetalleFactura.class);
		//Consulta
		List<DetalleFactura> detalleFactura = detalleFacturaService.findAll();
		return detalleFactura;
	}
	
}