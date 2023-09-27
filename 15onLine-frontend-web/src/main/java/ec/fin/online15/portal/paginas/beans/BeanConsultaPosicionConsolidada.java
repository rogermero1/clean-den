package ec.fin.online15.portal.paginas.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
//import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.fin.online15.aplicacion.paginas.BeanConfiguracionesGenerales;
import ec.fin.online15.aplicacion.paginas.BeanServicioUsuario;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaAhorro; 
import fin.coop15abril.librerias.dtosdenarius.*;
import fin.coop15abril.librerias.dtosdenarius.pojos.*;
import ec.fin.online15.integracion.beans.BeanServiciosMantenimientoParametrosGenerales;
import ec.fin.online15.integracion.beans.BeanServiciosPosicionConsolidada;
import ec.fin.online15.librerias.paginas.beans.BaseManagedBean;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Named("posicionConsolidadaMB")
@SessionScoped
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeanConsultaPosicionConsolidada extends BaseManagedBean {

	private static final long serialVersionUID = 1L;
	private Integer codigoCliente;
	private List<CuentaAhorro> posicionConsolidadaAhorro;
	
	
	private boolean mostrarMensajeSeguridad;

	

	@Inject
	private BeanConfiguracionesGenerales configuracionesGenerales;

	@Inject
	private BeanServicioUsuario servicioUsuario;

	@Inject
	private BeanServiciosPosicionConsolidada servicioPosicionConsolidada;

	@Inject
	private BeanServiciosMantenimientoParametrosGenerales servicioMantenimientoParametroGeneral;

	@PostConstruct
	private void init() {
		this.mostrarMensajeSeguridad = true;
		//this.inicializar();
		
	}

	


}
