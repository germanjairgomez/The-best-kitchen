package com.lamejorcocina.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lamejorcocina.entitybeans.Factura;

/**
 * @author Germán Jair Gómez F 
 * Data Access Object Factura
 * @param <E>
 */

public interface DAOFactura<E> extends JpaRepository<Factura,String>{
	@Query("SELECT c.nombre, c.apellido1, c.apellido2 "
			+ "FROM Factura f , Camarero c")
	List<E> consultaQuery();
}
