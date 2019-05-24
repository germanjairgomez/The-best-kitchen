package com.lamejorcocina.entitybeans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Germán Jair Gómez F 
 * EntityBean DetalleFactura
 */

@Entity(name="detalle_factura")
public class DetalleFactura {
	
	/*Atributos*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detalle_factura;

	@ManyToOne
	@JoinColumn(name="id_factura")
	private Factura factura;

	@ManyToOne
	@JoinColumn(name="id_cocinero")
	private Cocinero cocinero;

	private String plato;

	private String importe;

	/*Constructor*/
	
	public DetalleFactura(Integer idDetalleFactura, Factura factura, Cocinero cocinero, String plato, String importe) {
		super();
		this.id_detalle_factura = idDetalleFactura;
		this.factura = factura;
		this.cocinero = cocinero;
		this.plato = plato;
		this.importe = importe;
	}

	public DetalleFactura() {
		super();
	}

	/*Metodos*/
	
	public Integer getIdDetalleFactura() {
		return id_detalle_factura;
	}

	public void setIdDetalleFactura(Integer idDetalleFactura) {
		this.id_detalle_factura = idDetalleFactura;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Cocinero getCocinero() {
		return cocinero;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public String getImporte() {
		return importe;
	}

	public void setImporte(String importe) {
		this.importe = importe;
	}
	
}