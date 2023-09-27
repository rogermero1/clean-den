package ec.fin.online15.interfaces;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaAhorro;

@Remote
@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
public interface IServicioPosicionConsolidadaWs {

	@WebMethod(operationName = "consultaPosicionConsolidadaAhorro")
	@WebResult(name = "resultadoConsultaPosicionConsolidadAhorro")
	public List<PosicionConsolidadaAhorro> consultaPosicionConsolidadaAhorro(
			@WebParam(name = "sesion") String sesion,
			@WebParam(name = "codigoCliente") Integer codigoCliente);	
	
}
