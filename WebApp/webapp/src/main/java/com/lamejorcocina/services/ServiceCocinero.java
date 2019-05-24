package com.lamejorcocina.services;

import java.util.List;

import com.lamejorcocina.entitybeans.Cocinero;

/**
 * @author Germán Jair Gómez F 
 * Servicios para Cocinero
 */

public interface ServiceCocinero {
	
	public boolean registrar(Integer idCocinero, String nombre, String apellido1, String apellido2);
	
	public List<Cocinero> consultar();
	
	public Cocinero consultar(Integer idCocinero);
	
}
