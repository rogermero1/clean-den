package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaAhorro;
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


	

}
