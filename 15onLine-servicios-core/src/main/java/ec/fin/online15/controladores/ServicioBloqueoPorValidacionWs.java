package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.seguridad.modelo.entidades.TwebBloqueoPorValidacion;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioBloqueoPorValidacion;
import ec.fin.online15.interfaces.IServicioBloqueoPorValidacionWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioBloqueoPorValidacionWs implements IServicioBloqueoPorValidacionWs {

	@EJB
	private ServicioBloqueoPorValidacion servicioBloqueoPorValidacion;

	public List<TwebBloqueoPorValidacion> listaBloqueosVigentes(String sesion) {
		System.out.println("Invocacion web service : ServicioBloqueoPorValidacionWs-listaBloqueosVigentes");
		System.out.println("SESION: " + sesion);
		return servicioBloqueoPorValidacion.listaBloqueosVigentes();
	}

	public TwebBloqueoPorValidacion bloqueoActual(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioBloqueoPorValidacionWs-bloqueoActual");
		System.out.println("SESION: " + sesion);
		return servicioBloqueoPorValidacion.bloqueoActual(codigoCliente);
	}

	public Integer actualizacionBloqueo(String sesion, TwebBloqueoPorValidacion bloqueo) {
		System.out.println("Invocacion web service : ServicioBloqueoPorValidacionWs-actualizacionBloqueo");
		System.out.println("SESION: " + sesion);
		return servicioBloqueoPorValidacion.actualizacionBloqueo(bloqueo);
	}

}
