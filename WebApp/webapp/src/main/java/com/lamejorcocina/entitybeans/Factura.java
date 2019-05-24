package com.lamejorcocina.entitybeans;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Germán Jair Gómez F 
 * EntityBean Factura
 */

@Entity
public class Factura {
	
	/*Atributos*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_factura;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="id_camarero")
	private Camarero camarero;
	
	@ManyToOne
	@JoinColumn(name="id_mesa")
	private Mesa mesa;
	
	private Timestamp fecha_factura;

	/*Constructor*/
	
	public Factura(Integer idFactura, Cliente cliente, Camarero camarero , Mesa mesa, Timestamp fechaFactura) {
		super();
		this.id_factura = idFactura;
		this.cliente = cliente;
		this.mesa = mesa;
		this.camarero = camarero;
		this.fecha_factura = fechaFactura;
	}

	public Factura() {
		super();
	}

	/*Metodos*/

	public Integer getIdFactura() {
		return id_factura;
	}

	public void setIdFactura(Integer idFactura) {
		this.id_factura = idFactura;
	}	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Camarero getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Integer getId_factura() {
		return id_factura;
	}

	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}

	public Timestamp getFechaFactura() {
		return fecha_factura;
	}

	public void setFechaFactura(Timestamp fechaFactura) {
		this.fecha_factura = fechaFactura;
	}
	
}