package com.lamejorcocina.managedbeans;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 * @author Germán Jair Gómez F 
 * Implementación de funciones para el portal web
 */

@ManagedBean(name = "gestionPortal")
@RequestScoped
public class GestionPortal{	

	private String tipoRegistro;
	    
    public static void main(String[] args) throws ParseException {
    }
    
    public List<String> gestionarModulos() {
    	List<String> modulos = new ArrayList<>();
    	modulos.add("camarero");
        modulos.add("cliente");
        modulos.add("cocinero");
        modulos.add("mesa");
        return modulos;
    }    
    public List<String> gestionarModulosReportes() {
    	List<String> modulos = new ArrayList<>();
    	modulos.add("consulta1");
        modulos.add("consulta2");
        return modulos;
    }	
    
    //Si no es un tipo de persona valido, redirecciona al index
  	public String validarTipoRegistro() throws IOException {
  		System.out.println("////////////////////////////VALIDA///////////////////////"+tipoRegistro);
  	    if (!(tipoRegistro.equals("camarero") || tipoRegistro.equals("cliente") || tipoRegistro.equals("cocinero"))) {
  	    	 FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
  	    }
  	    return null;
  	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public void getValidarResultado() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
	}
  	
}