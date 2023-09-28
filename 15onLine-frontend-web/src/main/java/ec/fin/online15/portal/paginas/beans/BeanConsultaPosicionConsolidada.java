package ec.fin.online15.portal.paginas.beans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
//import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
//import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import ec.fin.online15.aplicacion.generales.NombresConstantesMemoria;
import ec.fin.online15.aplicacion.paginas.BeanConfiguracionesGenerales;
import ec.fin.online15.aplicacion.paginas.BeanServicioUsuario;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.CuotasPrestamo;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaAhorro; //LAQ UE MA
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaInversion;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaPrestamo;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaSeguro;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.ProductosPreAprobados;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.SaldosBloqueados;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.SaldosReserva;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.UltimosMovimientosAhorro;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebMovimientos;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebParametrosGenerales;
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
	private List<PosicionConsolidadaAhorro> posicionConsolidadaAhorro;
	private List<PosicionConsolidadaPrestamo> posicionConsolidadaPrestamo;
	private List<PosicionConsolidadaInversion> posicionConsolidadaInversion;
	private List<PosicionConsolidadaSeguro> posicionConsolidadaSeguro;
	private List<UltimosMovimientosAhorro> listadoUltimosMovimientos;
	private List<CuotasPrestamo> listadoCuotasPrestamo;
	private List<CuotasPrestamo> listadoCuotasGracia;
	private List<SaldosBloqueados> listaSaldosBloqueados;
	private List<SaldosReserva> listaSaldosReserva;
	private List<TwebMovimientos> listadoMovimientosWeb;

	private String detalleMovimientoAhorro;

	private PosicionConsolidadaAhorro cuentaSeleccionada;
	private PosicionConsolidadaPrestamo prestamoSeleccionado;

	private ProductosPreAprobados productosPreAprobados;
	private boolean preaprobado;

	private boolean muestraCuentas;
	private boolean muestraPrestamos;
	private boolean muestraSeguros;
	private boolean muestraInversiones;

	private boolean mostrarMensajeSeguridad;

	private Date fechaDesde;
	private Date fechaHasta;
	private Integer codigoTipoTransaccion;
	private SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");

	private boolean transferenciaLocal = false;
	private boolean transferenciaOtroBanco = false;
	private boolean pagoTarjeta = false;
	private boolean pagoPrestamo = false;
	private boolean pagoServicio = false;
	private String sesion = "";
	private Long idUsuario;

	private TwebParametrosGenerales parametroGeneral;
	private Integer mesesHistoricoAhorros;
	private Date fechaMinHistorico;

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
		
	}

	

	

	





	


}
