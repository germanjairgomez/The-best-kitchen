package com.lamejorcocina.services;

import java.util.List;

import com.lamejorcocina.entitybeans.Camarero;

/**
 * @author Germán Jair Gómez F 
 * Servicios para Camarero
 */

public interface ServiceCamarero {
	
	public boolean registrar(Integer idCamarero, String nombre, String apellido1, String apellido2);

	public List<Camarero> consultar();
	
	public Camarero consultar(Integer idCamarero);
	
}
