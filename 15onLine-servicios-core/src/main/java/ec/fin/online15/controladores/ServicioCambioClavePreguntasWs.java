package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.seguridad.modelo.entidades.TwebUsuario;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebIpsAutorizadas;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebRespuestasUsuarios;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioCambioClavePreguntas;
import ec.fin.online15.interfaces.IServicioCambioClavePreguntasWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioCambioClavePreguntasWs implements IServicioCambioClavePreguntasWs {

	@EJB
	private ServicioCambioClavePreguntas servicioCambioClavePreguntas;

	public List<TwebRespuestasUsuarios> respuestasVigentesUsuarios(String sesion, TwebUsuario usuario) {
		System.out.println("Invocacion web service : ServicioCambioClavePreguntas-respuestasVigentesUsuarios");
		System.out.println("SESION: " + sesion);
		return this.servicioCambioClavePreguntas.respuestasVigentesUsuarios(usuario);
	}

	public Integer actualizarRespuestasUsuario(String sesion, List<TwebRespuestasUsuarios> respuestasUsuario) {
		System.out.println("Invocacion web service : ServicioCambioClavePreguntas-actualizarRespuestasUsuario");
		System.out.println("SESION: " + sesion);
		return this.servicioCambioClavePreguntas.actualizarRespuestasUsuario(respuestasUsuario);
	}

	public boolean compruebaClaveUsuario(String sesion, String usuario, String clave) {
		System.out.println("Invocacion web service : ServicioCambioClavePreguntas-compruebaClaveUsuario");
		System.out.println("SESION: " + sesion);
		return this.servicioCambioClavePreguntas.compruebaClaveUsuario(usuario, clave);
	}

	public Integer cambioClave(String sesion, TwebUsuario usuario, String claveNueva) {
		System.out.println("Invocacion web service : ServicioCambioClavePreguntas-cambioClave");
		System.out.println("SESION: " + sesion);
		return this.servicioCambioClavePreguntas.cambioClave(usuario, claveNueva);
	}

	public Integer cambioTelefonoCorreo(String sesion, TwebUsuario usuario) {
		System.out.println("Invocacion web service : ServicioCambioClavePreguntas-cambioTelefonoCorreo");
		System.out.println("SESION: " + sesion);
		return this.servicioCambioClavePreguntas.cambioTelefonoCorreo(usuario);
	}

	public List<TwebIpsAutorizadas> ipsVigenteUsuario(String sesion, TwebUsuario usuario) {
		System.out.println("Invocacion web service : ServicioCambioClavePreguntas-ipsVigenteUsuario");
		System.out.println("SESION: " + sesion);
		return this.servicioCambioClavePreguntas.ipsVigenteUsuario(usuario);
	}

	public Integer actualizarIpsVigentes(String sesion, List<TwebIpsAutorizadas> listaIps) {
		System.out.println("Invocacion web service : ServicioCambioClavePreguntas-actualizarIpsVigentes");
		System.out.println("SESION: " + sesion);
		return this.servicioCambioClavePreguntas.actualizarIpsVigentes(listaIps);
	}

}
