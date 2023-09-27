package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.TiposCertificacion;
import ec.fin.online15.backend.procedimientosalmacenados.modelo.entidades.Certificacion;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioCertificacion;
import ec.fin.online15.interfaces.IServicioCertificacionWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioCertificacionWs implements IServicioCertificacionWs {

	@EJB
	private ServicioCertificacion servicio;

	public List<TiposCertificacion> listaCertificaciones(String sesion) {
		System.out.println("Invocacion web service : ServicioCertificacionWs-listaCertificaciones");
		System.out.println("SESION: " + sesion);
		return servicio.listaCertificaciones();
	}

	public Certificacion solicitarCertificacion(String sesion, Certificacion certificacion) {
		System.out.println("Invocacion web service : ServicioCertificacionWs-solicitarCertificacion");
		System.out.println("SESION: " + sesion);
		return servicio.solicitarCertificacion(certificacion);
	}

}
