package ec.fin.online15.backend.webbanking.modelo.servicios;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

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
import ec.fin.online15.backend.consultas.modelo.repositorios.webbanking.PosicionConsolidadEAO;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebMovimientos;

@Stateless
public class ServicioConsultaPosicionConsolidada  {

	@EJB
	private PosicionConsolidadEAO posicionConsolidadaEAO;

	

}
