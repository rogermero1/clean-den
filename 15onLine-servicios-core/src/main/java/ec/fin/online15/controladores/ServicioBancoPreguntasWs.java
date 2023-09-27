package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.librerias.excepciones.ExcepcionAplicacion;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebBancoPregunta;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioBancoPreguntas;
import ec.fin.online15.interfaces.IServicioBancoPreguntasWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioBancoPreguntasWs implements IServicioBancoPreguntasWs {

	@EJB
	private ServicioBancoPreguntas servicioBancoPreguntas;

	public List<TwebBancoPregunta> listadoBancoPreguntas(String sesion) {
		System.out.println("Invocacion web service : ServicioBancoPreguntasWs-listadoBancoPreguntas");
		System.out.println("SESION: " + sesion);
		return this.servicioBancoPreguntas.listadoBancoPreguntas();
	}

	public void crearPregunta(String sesion, TwebBancoPregunta bancoPregunta) {
		System.out.println("Invocacion web service : ServicioBancoPreguntasWs-crearPregunta");
		System.out.println("SESION: " + sesion);
		try {
			this.servicioBancoPreguntas.crear(bancoPregunta);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public void actualizarPregunta(String sesion, TwebBancoPregunta bancoPregunta) {
		System.out.println("Invocacion web service : ServicioBancoPreguntasWs-actualizarPregunta");
		System.out.println("SESION: " + sesion);
		try {
			this.servicioBancoPreguntas.actualizar(bancoPregunta);
		} catch (ExcepcionAplicacion e) {
			e.printStackTrace();
		}
	}

	public List<TwebBancoPregunta> listaPreguntasRegistro(String sesion) {
		System.out.println("Invocacion web service : ServicioBancoPreguntasWs-listaPreguntasRegistro");
		System.out.println("SESION: " + sesion);
		return this.servicioBancoPreguntas.listaPreguntasRegistro();
	}

}
