package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.seguridad.modelo.entidades.TwebTiposTransaccion;
import ec.fin.online15.backend.seguridad.modelo.entidades.TwebUsuario;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebOperacionesFrecuentes;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioOperacionesFrecuentes;
import ec.fin.online15.interfaces.IServicioOperacionesFrecuentesWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioOperacionesFrecuentesWs implements IServicioOperacionesFrecuentesWs {

	@EJB
	private ServicioOperacionesFrecuentes servicioOperacionesFrecuentes;

	public List<TwebOperacionesFrecuentes> operacionesFrecuentesPorUsuario(String sesion, TwebUsuario usuario,
			Integer tipoTransaccion) {
		System.out.println("Invocacion web service : ServicioOperacionesFrecuentesWs-operacionesFrecuentesPorUsuario");
		System.out.println("SESION: " + sesion);
		return this.servicioOperacionesFrecuentes.operacionesFrecuentesPorUsuario(usuario, tipoTransaccion);
	}

	public List<TwebTiposTransaccion> tiposTransaccion(String sesion) {
		System.out.println("Invocacion web service : ServicioOperacionesFrecuentesWs-tiposTransaccion");
		System.out.println("SESION: " + sesion);
		return this.servicioOperacionesFrecuentes.tiposTransaccion();
	}

	public Integer guardarOperacion(String sesion, TwebOperacionesFrecuentes operacionFrecuente) {
		System.out.println("Invocacion web service : ServicioOperacionesFrecuentesWs-guardarOperacion");
		System.out.println("SESION: " + sesion);
		return this.servicioOperacionesFrecuentes.guardarOperacion(operacionFrecuente);
	}

	public Integer actualizarOperacion(String sesion, TwebOperacionesFrecuentes operacionFrecuente) {
		System.out.println("Invocacion web service : ServicioOperacionesFrecuentesWs-actualizarOperacion");
		System.out.println("SESION: " + sesion);
		return this.servicioOperacionesFrecuentes.actualizarOperacion(operacionFrecuente);
	}
}
