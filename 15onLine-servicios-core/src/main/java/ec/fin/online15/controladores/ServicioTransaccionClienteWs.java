package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.ConsolidadoPagoServicio;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.DatosPagoServicio;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.DatosPrestamo;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.ListadoOpciones;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.ParametroMontoPermitido;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.RubroFacilito;
import ec.fin.online15.backend.procedimientosalmacenados.modelo.entidades.AbonoPagoPrestamo;
import ec.fin.online15.backend.procedimientosalmacenados.modelo.entidades.AutorizaTransaccion;
import ec.fin.online15.backend.procedimientosalmacenados.modelo.entidades.PagoServicio;
import ec.fin.online15.backend.procedimientosalmacenados.modelo.entidades.TransferenciaLocal;
import ec.fin.online15.backend.procedimientosalmacenados.modelo.entidades.TransferenciaOtroBanco;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebMovimientos;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioTransaccionCliente;
import ec.fin.online15.interfaces.IServicioTransaccionClienteWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioTransaccionClienteWs implements IServicioTransaccionClienteWs {

	@EJB
	private ServicioTransaccionCliente servicioTransaccionCliente;

	public TransferenciaLocal transferenciaLocalCliente(String sesion, TransferenciaLocal transferencia) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-transferenciaLocalCliente");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.tranferenciaLocal(transferencia);
	}

	public TransferenciaOtroBanco transferenciaOtroBancoCliente(String sesion,
			TransferenciaOtroBanco transferenciaOtroBanco) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-transferenciaOtroBancoCliente");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.transferenciaOtroBancoCliente(transferenciaOtroBanco);
	}

	public AbonoPagoPrestamo abonoPagoPrestamoCliente(String sesion, AbonoPagoPrestamo abonoPagoPrestamo) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-abonoPagoPrestamoCliente");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.abonoPagoPrestamoCliente(abonoPagoPrestamo);
	}

	public ParametroMontoPermitido parametroMontosTransaccion(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-parametroMontosTransaccion");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.parametroMontosTransaccion(codigoCliente);
	}

	public List<ListadoOpciones> listaCuentasCliente(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listaCuentasCliente");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listaCuentasCliente(codigoCliente);
	}

	public Double saldoCuentaAhorro(String sesion, Long numeroCuenta) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-saldoCuentaAhorro");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.saldoCuentaAhorro(numeroCuenta);
	}

	public String nombreCuentaAhorro(String sesion, Long numeroCuenta) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-nombreCuentaAhorro");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.nombreCuentaAhorro(numeroCuenta);
	}

	public void registraMovimiento(String sesion, TwebMovimientos movimiento) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-registraMovimiento");
		System.out.println("SESION: " + sesion);
		servicioTransaccionCliente.registraMovimiento(movimiento);
	}

	public AutorizaTransaccion consultaAutorizacionTransaccion(String sesion, AutorizaTransaccion autorizaTransaccion) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-consultaAutorizacionTransaccion");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.consultaAutorizacionTransaccion(autorizaTransaccion);
	}

	public List<ListadoOpciones> listadoEntidadesFinancieras(String sesion) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listadoEntidadesFinancieras");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listadoEntidadesFinancieras();
	}

	public List<ListadoOpciones> listadoTipoCuenta(String sesion) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listadoTipoCuenta");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listadoTipoCuenta();
	}

	public ParametroMontoPermitido parametroMontosTransaccionCliente(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-parametroMontosTransaccionCliente");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.parametroMontosTransaccionCliente(codigoCliente);
	}

	public Double consultaComision(String sesion, Integer tipoComision) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-consultaComision");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.consultaComision(tipoComision);
	}

	public List<DatosPrestamo> consultaDatosPrestamo(String sesion, Long numeroPrestamo) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-consultaDatosPrestamo");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.consultaDatosPrestamo(numeroPrestamo);
	}

	public List<ListadoOpciones> listaPrestamoCLiente(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listaPrestamoCLiente");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listaPrestamoCLiente(codigoCliente);
	}

	public List<ListadoOpciones> listaEmpresasPagoServicio(String sesion) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listaEmpresasPagoServicio");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listaEmpresasPagoServicio();
	}

	public List<ListadoOpciones> listaServiciosEmpresa(String sesion, Integer codigoEmpresa) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listaServiciosEmpresa");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listaServiciosEmpresa(codigoEmpresa);
	}

	public PagoServicio pagoServicioWeb(String sesion, PagoServicio pagoServicio) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-pagoServicioWeb");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.pagoServicio(pagoServicio);
	}

	public List<DatosPagoServicio> consultaPagoServicio(String sesion, String numeroIdentificacion,
			Integer codigoTipoServicio, String numeroServicio) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-consultaPagoServicio");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.consultaPagoServicio(numeroIdentificacion, codigoTipoServicio,
				numeroServicio);
	}

	public ConsolidadoPagoServicio consultaConsolidadoServicio(String sesion, String numeroIdentificacion,
			Integer codigoTipoServicio, String numeroServicio) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-consultaConsolidadoServicio");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.consultaConsolidadoServicio(numeroIdentificacion, codigoTipoServicio,
				numeroServicio);
	}

	public List<RubroFacilito> listadoRecargasFacilito(String sesion) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listadoRecargasFacilito");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listadoRecargasFacilito();
	}

	public List<ListadoOpciones> listadoGruposFacilito(String sesion) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listadoGruposFacilito");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listadoGruposFacilito();
	}

	public List<ListadoOpciones> listadoGruposRecaudacionFacilito(String sesion) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listadoGruposRecaudacionFacilito");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listadoGruposRecaudacionFacilito();
	}

	public List<RubroFacilito> listadoRubrosPorGrupoFacilito(String sesion, String grupo) {
		System.out.println("Invocacion web service : ServicioTransaccionClienteWs-listadoRubrosPorGrupoFacilito");
		System.out.println("SESION: " + sesion);
		return servicioTransaccionCliente.listadoRubrosPorGrupoFacilito(grupo);
	}

}
