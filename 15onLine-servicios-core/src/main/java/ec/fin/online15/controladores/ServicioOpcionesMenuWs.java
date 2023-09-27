package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.librerias.excepciones.ExcepcionAplicacion;
import ec.fin.online15.backend.seguridad.modelo.entidades.TwebOpcion;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioMantenimientoOpcion;
import ec.fin.online15.interfaces.IServicioOpcionesMenuWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioOpcionesMenuWs implements IServicioOpcionesMenuWs {

	@EJB
	private ServicioMantenimientoOpcion servicioMantenimientoOpcion;

	public List<TwebOpcion> listaOpcionesVigentes(String sesion) {
		System.out.println("Invocacion web service : ServicioOpcionesMenuWs-listaOpcionesViegentes");
		System.out.println("SESION: " + sesion);
		return servicioMantenimientoOpcion.listaOpcionesViegentes();
	}

	public void crearOpcion(String sesion, TwebOpcion opcion) {
		System.out.println("Invocacion web service : ServicioOpcionesMenuWs-crearOpcion");
		System.out.println("SESION: " + sesion);
		try {
			servicioMantenimientoOpcion.crear(opcion);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public void actualizarOpcion(String sesion, TwebOpcion opcion) {
		System.out.println("Invocacion web service : ServicioOpcionesMenuWs-actualizarOpcion");
		System.out.println("SESION: " + sesion);
		try {
			servicioMantenimientoOpcion.actualizar(opcion);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public TwebOpcion buscarPorId(String sesion, Long id) {
		System.out.println("Invocacion web service : ServicioOpcionesMenuWs-buscarPorId");
		System.out.println("SESION: " + sesion);
		return servicioMantenimientoOpcion.buscarPorId(id);
	}
}
