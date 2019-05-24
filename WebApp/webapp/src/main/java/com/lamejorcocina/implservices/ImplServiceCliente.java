package com.lamejorcocina.implservices;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.lamejorcocina.dao.DAOCliente;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.services.ServiceCliente;
import com.lamejorcocina.spring.SpringConfiguration;

/**
 * @author Germán Jair Gómez F 
 * Implementación de servicios para Cliente
 */

@Service
public class ImplServiceCliente implements ServiceCliente{
	
	@Override
	public boolean registrar(Integer idCliente, String nombre, String apellido1, String apellido2, String observaciones) {
		//Inicialización del contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCliente clienteService = contexto.getBean(DAOCliente.class);
		//Creación del objeto
		Cliente cliente = new Cliente();
		cliente.setIdCliente(idCliente);
		cliente.setNombre(nombre);
		cliente.setApellido1(apellido1);
		cliente.setApellido2(apellido2);
		cliente.setObservaciones(observaciones);
		try {
			//Persistencia
			clienteService.save(cliente);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
	@Override
	public List<Cliente> consultar(){
		//Inicialización contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCliente clienteService = contexto.getBean(DAOCliente.class);
		//Consulta
		List<Cliente> clientes = clienteService.findAll();
		return clientes;
	}
	
	//Función para consultar clientes individuales
	@Override
	public Cliente consultar(Integer idCliente){
		//Inicialización contexto
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		DAOCliente clienteService = contexto.getBean(DAOCliente.class);
		//Consulta
		List<Cliente> clientes = clienteService.findAll();
		Cliente clientePorID = null;
		for (Cliente cliente : clientes) {
			if(cliente.getIdCliente().equals(idCliente)) {
				clientePorID = cliente;
			}
		}
		return clientePorID;
	}
	
	
	
}