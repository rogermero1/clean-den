package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.seguridad.modelo.entidades.TwebRol;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioRol;
import ec.fin.online15.interfaces.IServicioRolWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioRolWs implements IServicioRolWs {

	@EJB
	private ServicioRol servicioRol;

	public List<TwebRol> listaRolesVigentes(String sesion) {
		System.out.println("Invocacion web service : ServicioRolWs-listaRolesVigentes");
		System.out.println("SESION: " + sesion);
		return servicioRol.listaRolesVigentes();
	}

	public TwebRol buscarPorId(String sesion, Long id) {
		System.out.println("Invocacion web service : ServicioRolWs-buscarPorId");
		System.out.println("SESION: " + sesion);
		return servicioRol.buscarPorId(id);
	}

}
