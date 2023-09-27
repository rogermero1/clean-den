package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.librerias.excepciones.ExcepcionAplicacion;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebParametrosSolicitud;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioParametrosSolicitud;
import ec.fin.online15.interfaces.IServicioParametrosSolicitudWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioParametrosSolicitudWs implements IServicioParametrosSolicitudWs {

	@EJB
	private ServicioParametrosSolicitud servicioParametrosSolicitud;

	public List<TwebParametrosSolicitud> listaParametrosVigentes(String sesion) {
		System.out.println("Invocacion web service : ServicioParametrosSolicitud-listaParametrosVigentes");
		System.out.println("SESION: " + sesion);
		return this.servicioParametrosSolicitud.listaParametrosVigentes();
	}

	public void crearParametro(String sesion, TwebParametrosSolicitud parametro) {
		System.out.println("Invocacion web service : ServicioParametrosSolicitud-crearParametro");
		System.out.println("SESION: " + sesion);
		try {
			this.servicioParametrosSolicitud.crear(parametro);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public void actualizarParametro(String sesion, TwebParametrosSolicitud parametro) {
		System.out.println("Invocacion web service : ServicioParametrosSolicitud-actualizarParametro");
		System.out.println("SESION: " + sesion);
		try {
			this.servicioParametrosSolicitud.actualizar(parametro);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public TwebParametrosSolicitud buscaParametro(String sesion, String relacionDependencia, String preaprobado,
			Double monto) {
		System.out.println("Invocacion web service : ServicioParametrosSolicitud-buscaParametro");
		System.out.println("SESION: " + sesion);
		return this.servicioParametrosSolicitud.buscaParametro(relacionDependencia, preaprobado, monto);
	}

}
