package ec.fin.online15.backend.consultas.modelo.entidades.clientes;

import java.io.Serializable;

public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codigoCliente;
	private String numeroIdentificacion;
	private String nombres;

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

}
