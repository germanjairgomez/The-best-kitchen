package com.lamejorcocina.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamejorcocina.entitybeans.Camarero;

/**
 * @author Germán Jair Gómez F 
 * Data Access Object Camarero
 */

public interface DAOCamarero extends JpaRepository<Camarero,String>{
	
}
