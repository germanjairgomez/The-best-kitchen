package com.lamejorcocina.implservices;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.lamejorcocina.dao.DAOCocinero;
import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.services.ServiceCocinero;
import com.lamejorcocina.spring.SpringConfiguration;

/**
 * @author Germán Jair Gómez F 
 * Implementación de servicios para Cocinero
 */

@Service
public class ImplServiceCocinero implements ServiceCocinero{
	
	@Override
	public boolean registrar(Integer idCocinero, String nombre, String apellido1, String apellido2) {
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCocinero cocineroService = contexto.getBean(DAOCocinero.class);
		//Creación del objeto
		Cocinero cocinero = new Cocinero();
		cocinero.setIdCocinero(idCocinero);
		cocinero.setNombre(nombre);
		cocinero.setApellido1(apellido1);
		cocinero.setApellido2(apellido2);
		try {
			//Persistencia
			cocineroService.save(cocinero);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Override
	public List<Cocinero> consultar(){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCocinero cocineroService = contexto.getBean(DAOCocinero.class);
		//Consulta
		List<Cocinero> cocineros = cocineroService.findAll();
		return cocineros;
	}
	
	@Override
	public Cocinero consultar(Integer idCocinero){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCocinero cocineroService = contexto.getBean(DAOCocinero.class);
		//Consulta
		List<Cocinero> cocineros = cocineroService.findAll();
		//Filtrado por ID
		Cocinero cocineroPorID = null;
		for (Cocinero cocinero : cocineros) {
			if(cocinero.getIdCocinero().equals(idCocinero)) {
				cocineroPorID = cocinero;
			}
		}
		return cocineroPorID;
	}
	
	
	
}