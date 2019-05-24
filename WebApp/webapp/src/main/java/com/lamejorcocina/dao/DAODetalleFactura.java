package com.lamejorcocina.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamejorcocina.entitybeans.DetalleFactura;

/**
 * @author Germán Jair Gómez F 
 * Data Access Object Detalle Factura
 */

public interface DAODetalleFactura extends JpaRepository<DetalleFactura,String>{
	
}
