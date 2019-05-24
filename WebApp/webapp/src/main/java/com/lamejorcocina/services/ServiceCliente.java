package com.lamejorcocina.services;

import java.util.List;

import com.lamejorcocina.entitybeans.Cliente;

/**
 * @author Germán Jair Gómez F 
 * Servicios para Cliente
 */

public interface ServiceCliente {
	
	public boolean registrar(Integer idCliente, String nombre, String apellido1, String apellido2, String observaciones);

	public List<Cliente> consultar();
	
	public Cliente consultar(Integer idCliente);
	
}
