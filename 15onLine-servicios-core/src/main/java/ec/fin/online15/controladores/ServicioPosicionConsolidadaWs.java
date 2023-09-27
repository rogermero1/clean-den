package ec.fin.online15.controladores;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.CuotasPrestamo;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.DetalleCuotaPrestamo;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaAhorro;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaInversion;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaPrestamo;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaSeguro;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.ProductosPreAprobados;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.SaldosBloqueados;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.SaldosReserva;
import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.UltimosMovimientosAhorro;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebMovimientos;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioConsultaPosicionConsolidada;
import ec.fin.online15.interfaces.IServicioPosicionConsolidadaWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioPosicionConsolidadaWs implements IServicioPosicionConsolidadaWs {

	@EJB
	private ServicioConsultaPosicionConsolidada servicioPosicionConsolidada;

	@Override
	public List<PosicionConsolidadaAhorro> consultaPosicionConsolidadaAhorro(String sesion, Integer codigoCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PosicionConsolidadaPrestamo> consultaPosicionConsolidadaPrestamo(String sesion, Integer codigoCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PosicionConsolidadaInversion> consultaPosicionConsolidadaInversion(String sesion,
			Integer codigoCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PosicionConsolidadaSeguro> consultaPosicionConsolidadaSeguro(String sesion, Integer codigoCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UltimosMovimientosAhorro> consultaPosicionUltimosMovimientosAhorro(String sesion, String numeroCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuotasPrestamo> consultaPosicionConsolidadaCuotasPrestamo(String sesion, Long numeroPrestamo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuotasPrestamo> consultaPosicionConsolidadaCuotasGracia(String sesion, Long numeroPrestamo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DetalleCuotaPrestamo> consultaPosicionConsolidadaDetalleCuotasPrestamo(String sesion,
			Integer numeroCuota, Long numeroPrestamo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SaldosBloqueados> consultaPosicionConsolidadaSaldosBloqueados(String sesion, String numeroCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SaldosReserva> consultaPosicionConsolidadaSaldosReserva(String sesion, String numeroCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UltimosMovimientosAhorro> consultaHistoricoAhorro(String sesion, String numeroCuenta, Date fechaDesde,
			Date fechaHasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TwebMovimientos> listadoMovimientos(String sesion, Long idUsuario, Integer codigoTransaccion,
			String fechaDesde, String fechaHasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nombreFinanciera(String sesion, Integer idTipoFinanciera, Integer codigoFinanciera) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nombreServicio(String sesion, Integer codigoTipoServicio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductosPreAprobados productosPreaprobados(String sesion, Integer codigoCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
