package com.lamejorcocina.spring;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lamejorcocina.entitybeans.Camarero;
import com.lamejorcocina.entitybeans.Cliente;
import com.lamejorcocina.entitybeans.Cocinero;
import com.lamejorcocina.entitybeans.DetalleFactura;
import com.lamejorcocina.entitybeans.Factura;
import com.lamejorcocina.entitybeans.Mesa;
import com.lamejorcocina.implservices.ImplServiceCamarero;
import com.lamejorcocina.implservices.ImplServiceCliente;
import com.lamejorcocina.implservices.ImplServiceCocinero;
import com.lamejorcocina.implservices.ImplServiceDetalleFactura;
import com.lamejorcocina.implservices.ImplServiceFactura;
import com.lamejorcocina.implservices.ImplServiceMesa;
import com.lamejorcocina.implservices.ImplServiceReportes;

/**
 * @author Germán Jair Gómez F 
 * Clase de integración con los ManagedBeans
 */

@SpringBootApplication
public class App {

	public static void main(String[] args) throws Exception {
	}
	
	public boolean registrarCamarero(Integer idCamarero, String nombre, String apellido1, String apellido2) {
		ImplServiceCamarero serviceCamarero = new ImplServiceCamarero();
		Boolean registroExitoso = serviceCamarero.registrar(idCamarero, nombre, apellido1, apellido2);
		if(registroExitoso != null) {
			return true;
		}
		return false;	
	}
	
	public boolean registrarCliente(Integer idCamarero, String nombre, String apellido1, String apellido2, String observaciones) {
		ImplServiceCliente serviceCliente = new ImplServiceCliente();
		Boolean registroExitoso = serviceCliente.registrar(idCamarero, nombre, apellido1, apellido2, observaciones);
		if(registroExitoso != null) {
			return true;
		}
		return false;	
	}
	
	public boolean registrarCocinero(Integer idCamarero, String nombre, String apellido1, String apellido2) {
		ImplServiceCocinero serviceCocinero = new ImplServiceCocinero();
		Boolean registroExitoso = serviceCocinero.registrar(idCamarero, nombre, apellido1, apellido2);
		if(registroExitoso != null) {
			return true;
		}
		return false;	
	}
	
	public boolean registrarMesa(int numMaxConesales, String ubicacion) {
		ImplServiceMesa serviceMesa = new ImplServiceMesa();
		Boolean registroExitoso = serviceMesa.registrar(numMaxConesales, ubicacion);
		if(registroExitoso != null) {
			return true;
		}
		return false;	
	}
	
	public Camarero consultarCamarero(Integer idCamarero) {
		ImplServiceCamarero serviceCamarero = new ImplServiceCamarero();
		Camarero camarero = serviceCamarero.consultar(idCamarero);
		return camarero;
	}
	
	public List<Camarero> consultarCamareros() {
		ImplServiceCamarero serviceCamarero = new ImplServiceCamarero();
		List<Camarero> camareros = serviceCamarero.consultar();
		return camareros;
	}
	
	public Cliente consultarCliente(Integer idCliente) {
		ImplServiceCliente serviceCliente = new ImplServiceCliente();
		Cliente cliente = serviceCliente.consultar(idCliente);
		return cliente;
	}
	
	public List<Cliente> consultarClientes() {
		ImplServiceCliente serviceCliente = new ImplServiceCliente();
		List<Cliente> clientes = serviceCliente.consultar();
		return clientes;
	}
	
	public Cocinero consultarCocinero(Integer idCocinero) {
		ImplServiceCocinero serviceCocinero = new ImplServiceCocinero();
		Cocinero cocinero = serviceCocinero.consultar(idCocinero);
		return cocinero;
	}
	
	public List<Cocinero> consultarCocineros() {
		ImplServiceCocinero serviceCocinero = new ImplServiceCocinero();
		List<Cocinero> cocineros = serviceCocinero.consultar();
		return cocineros;
	}
	
	public Mesa consultarMesa(Integer idMesa) {
		ImplServiceMesa serviceMesa = new ImplServiceMesa();
		Mesa mesa = serviceMesa.consultar(idMesa);
		return mesa;
	}
	
	public List<Mesa> consultarMesas() {
		ImplServiceMesa serviceMesa = new ImplServiceMesa();
		List<Mesa> mesas = serviceMesa.consultar();
		return mesas;
	}
	
	public boolean registrarFactura(Cliente cliente, Camarero camarero, Mesa mesa, Timestamp fechaFactura, Cocinero cocinero, String plato, String importe) {
		ImplServiceFactura serviceFactura = new ImplServiceFactura();
		Boolean registroExitoso = serviceFactura.registrar(cliente, camarero, mesa, fechaFactura, cocinero, plato, importe);
		if(registroExitoso != null) {
			return true;
		}
		return false;
	}
	
	public List<Factura> consultarFacturas(){
		ImplServiceFactura serviceFactura = new ImplServiceFactura();
		List<Factura> facturas = serviceFactura.consultar();
		return facturas;
	}
	
	public List<DetalleFactura> consultarDetalleFacturas(){
		ImplServiceDetalleFactura serviceDetalleFactura = new ImplServiceDetalleFactura();
		List<DetalleFactura> detalleFacturas = serviceDetalleFactura.consultar();
		return detalleFacturas;
	}
	
	public Map<Integer, List> consultarQuery1(List<Factura> facturas, List<DetalleFactura> detalleFacturas, List<Camarero> camareros) {
		ImplServiceReportes serviceReporte = new ImplServiceReportes();
		return serviceReporte.consultaQuery1(facturas, detalleFacturas, camareros);
	}
	
	public Map<Integer, List> consultarQuery2(List<Factura> facturas, List<DetalleFactura> detalleFacturas, List<Cliente> clientes) {
		ImplServiceReportes serviceReporte = new ImplServiceReportes();
		return serviceReporte.consultaQuery2(facturas, detalleFacturas, clientes);
	}
	
	public Timestamp formatearFecha(String fecha) throws ParseException {
		ImplServiceFactura serviceFactura = new ImplServiceFactura();
		Timestamp fechaFormateada = serviceFactura.formatearFecha(fecha);
		return fechaFormateada;
	}
	
	
}
