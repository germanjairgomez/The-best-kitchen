package com.lamejorcocina.implservices;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.lamejorcocina.dao.DAOCamarero;
import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.services.ServiceCamarero;
import com.lamejorcocina.spring.SpringConfiguration;

/**
 * @author Germán Jair Gómez F 
 * Implementación de servicios para Camarero
 */

@Service
public class ImplServiceCamarero implements ServiceCamarero{
	
	@Override
	public boolean registrar(Integer idCamarero, String nombre, String apellido1, String apellido2) {
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCamarero camareroService = contexto.getBean(DAOCamarero.class);
		//Creación del objeto
		Camarero camarero = new Camarero();
		camarero.setIdCamarero(idCamarero);
		camarero.setNombre(nombre);
		camarero.setApellido1(apellido1);
		camarero.setApellido2(apellido2);
		try {
			//Persistencia
			camareroService.save(camarero);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Override
	public List<Camarero> consultar(){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCamarero camareroService = contexto.getBean(DAOCamarero.class);
		//Consulta
		List<Camarero> camareros = camareroService.findAll();
		return camareros;
	}
	
	@Override
	public Camarero consultar(Integer idCamarero){
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCamarero camareroService = contexto.getBean(DAOCamarero.class);
		//Consulta
		List<Camarero> camareros = camareroService.findAll();
		//Filtrado por ID
		Camarero camareroPorID = null;
		for (Camarero camarero : camareros) {
			if(camarero.getIdCamarero().equals(idCamarero)) {
				camareroPorID = camarero;
			}
		}
		return camareroPorID;
	}
	
}