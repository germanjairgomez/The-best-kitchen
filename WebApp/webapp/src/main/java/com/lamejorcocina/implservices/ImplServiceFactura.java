package com.lamejorcocina.implservices;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.lamejorcocina.dao.DAOFactura;
import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.entitybeans.Factura;
import com.lamejorcocina.entitybeans.Mesa;
import com.lamejorcocina.services.ServiceFactura;
import com.lamejorcocina.spring.SpringConfiguration;

/**
 * @author Germán Jair Gómez F 
 * Implementación de servicios para Factura
 */

@Service
public class ImplServiceFactura implements ServiceFactura{
	
	@Override
	public boolean registrar(Cliente cliente, Camarero camarero, Mesa mesa, Timestamp fechaFactura, Cocinero cocinero, String plato, String importe) {
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOFactura facturaService = contexto.getBean(DAOFactura.class);
		//Creación del objeto
		Factura factura = new Factura();
		factura.setCliente(cliente);
		factura.setCamarero(camarero);
		factura.setMesa(mesa);
		factura.setFechaFactura(fechaFactura);
		try {
			//Persistencia
			facturaService.save(factura);
			//Registro de DetalleFactura
			ImplServiceDetalleFactura serviceDetalleFactura = new ImplServiceDetalleFactura();
			serviceDetalleFactura.registrar(factura, cocinero, plato, importe);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Override
	public Timestamp formatearFecha(String strFechaFactura) throws ParseException {
		//Formateo de fecha String a Timestamp
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date parsedTimeStamp = dateFormat.parse(strFechaFactura);
		Timestamp fechaFactura = new Timestamp(parsedTimeStamp.getTime());
		return fechaFactura;
	}
	
	@Override
	public List<Factura> consultar(){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOFactura facturaService = contexto.getBean(DAOFactura.class);
		//Consulta
		List<Factura> factura = facturaService.findAll();
		return factura;
	}
}