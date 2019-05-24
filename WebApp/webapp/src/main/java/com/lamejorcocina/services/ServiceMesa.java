package com.lamejorcocina.services;

import java.util.List;

import com.lamejorcocina.entitybeans.Mesa;

/**
 * @author Germán Jair Gómez F 
 * Servicios para Mesa
 */

public interface ServiceMesa {
	
	public boolean registrar(Integer numMaxComensales, String ubicacion);
	
	public List<Mesa> consultar();
	
	public Mesa consultar(Integer idMesa);
	
}
