package com.lamejorcocina.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamejorcocina.entitybeans.Mesa;

/**
 * @author Germán Jair Gómez F 
 * Data Access Object Mesa
 */

public interface DAOMesa extends JpaRepository<Mesa,String>{
	
}
