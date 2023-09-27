package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.seguridad.modelo.entidades.TwebOpcion;
import ec.fin.online15.backend.seguridad.modelo.entidades.TwebUsuario;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioAutorizacion;
import ec.fin.online15.interfaces.IServicioAutorizacionWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioAutorizacionWs implements IServicioAutorizacionWs {

	@EJB
	private ServicioAutorizacion servicioAutorizacion;

	public List<TwebOpcion> listaOpcionesMenuPadre(String sesion, String usuario, String orientacion) {
		System.out.println("Invocacion web service : ServicioAutorizacionWs-listaOpcionesMenuPadre");
		System.out.println("SESION: " + sesion);
		return servicioAutorizacion.listaOpcionesMenuPadre(usuario, orientacion);
	}

	public List<TwebOpcion> listaOpcionesHijas(String sesion, Long idOpcion, String usuario, String orientacion) {
		System.out.println("Invocacion web service : ServicioAutorizacionWs-listaOpcionesHijas");
		System.out.println("SESION: " + sesion);
		return servicioAutorizacion.listaOpcionesHijas(idOpcion, usuario, orientacion);
	}

	public TwebUsuario buscarUsuarioAplicacionBase(String sesion, String usuario) {
		System.out.println("Invocacion web service : ServicioAutorizacionWs-buscarUsuarioAplicacionBase");
		System.out.println("SESION: " + sesion);
		return servicioAutorizacion.buscarUsuarioAplicacionBase(usuario);
	}

}
