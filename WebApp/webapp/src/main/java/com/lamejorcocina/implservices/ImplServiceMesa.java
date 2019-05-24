package com.lamejorcocina.implservices;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.lamejorcocina.dao.DAOMesa;
import com.lamejorcocina.entitybeans.Mesa;
import com.lamejorcocina.services.ServiceMesa;
import com.lamejorcocina.spring.SpringConfiguration;

/**
 * @author Germán Jair Gómez F 
 * Implementación de servicios para Mesa
 */

@Service
public class ImplServiceMesa implements ServiceMesa{
	
	@Override
	public boolean registrar(Integer numMaxComensales, String ubicacion) {
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOMesa mesaService = contexto.getBean(DAOMesa.class);
		//Creación del objeto
		Mesa mesa = new Mesa();
		mesa.setNumMaxComensales(numMaxComensales);
		mesa.setUbicacion(ubicacion);
		try {
			//Persistencia
			mesaService.save(mesa);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Override
	public List<Mesa> consultar(){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOMesa mesaService = contexto.getBean(DAOMesa.class);
		//Consulta
		List<Mesa> mesas = mesaService.findAll();
		return mesas;
	}
	
	@Override
	public Mesa consultar(Integer idMesa){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOMesa mesaService = contexto.getBean(DAOMesa.class);
		//Consulta
		List<Mesa> mesas = mesaService.findAll();
		//Filtrado por ID
		Mesa mesaPorID = null;
		for (Mesa mesa : mesas) {
			if(mesa.getIdMesa().equals(idMesa)) {
				mesaPorID = mesa;
			}
		}
		return mesaPorID;
	}
	
	
	
}