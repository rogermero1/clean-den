package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.librerias.excepciones.ExcepcionAplicacion;
import ec.fin.online15.backend.seguridad.modelo.entidades.TwebOpcionRol;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioOpcionRol;
import ec.fin.online15.interfaces.IServicioOpcionRolWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioOpcionRolWs implements IServicioOpcionRolWs {

	@EJB
	private ServicioOpcionRol servicioOpcionRol;

	public List<TwebOpcionRol> listaOpcionesRolesVigentes(String sesion) {
		System.out.println("Invocacion web service : ServicioOpcionRolWs-listaOpcionesRolesVigentes");
		System.out.println("SESION: " + sesion);
		return servicioOpcionRol.listaOpcionesRolesVigentes();
	}

	public void crearOpcionRol(String sesion, TwebOpcionRol opcionRol) {
		System.out.println("Invocacion web service : ServicioOpcionRolWs-crearOpcionRol");
		System.out.println("SESION: " + sesion);
		try {
			servicioOpcionRol.crear(opcionRol);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public void actualizarOpcionRol(String sesion, TwebOpcionRol opcionRol) {
		System.out.println("Invocacion web service : ServicioOpcionRolWs-actualizarOpcionRol");
		System.out.println("SESION: " + sesion);
		try {
			servicioOpcionRol.actualizar(opcionRol);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public List<TwebOpcionRol> listaOpcionesRolesPorRol(String sesion, Long idRol) {
		System.out.println("Invocacion web service : ServicioOpcionRolWs-listaOpcionesRolesPorRol");
		System.out.println("SESION: " + sesion);
		return servicioOpcionRol.listaOpcionesRolesPorRol(idRol);
	}

}
