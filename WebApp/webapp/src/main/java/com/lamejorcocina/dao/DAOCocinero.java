package com.lamejorcocina.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamejorcocina.entitybeans.Cocinero;

/**
 * @author Germán Jair Gómez F 
 * Data Access Object Cocinero
 */

public interface DAOCocinero extends JpaRepository<Cocinero,String>{
	
}
