package com.lamejorcocina.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamejorcocina.entitybeans.Cliente;

/**
 * @author Germán Jair Gómez F 
 * Data Access Object Cliente
 */

public interface DAOCliente extends JpaRepository<Cliente,String>{
	
}
