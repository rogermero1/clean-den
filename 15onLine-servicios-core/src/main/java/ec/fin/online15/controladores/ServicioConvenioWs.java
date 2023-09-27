package ec.fin.online15.controladores;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.clientes.InformacionCliente;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebConvenios;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioConvenio;
import ec.fin.online15.interfaces.IServicioConvenioWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioConvenioWs implements IServicioConvenioWs {

	@EJB
	private ServicioConvenio servicioConvenio;

	public TwebConvenios consultaConvenioWebCliente(String sesion, String cedula, String convenioWeb) {
		System.out.println("Invocacion web service : ServicioConvenioWs-consultaConvenioWebCliente");
		System.out.println("SESION: " + sesion);
		return servicioConvenio.consultaConvenioWebCliente(cedula, convenioWeb);
	}

	public InformacionCliente consultaCliente(String sesion, String cedula) {
		System.out.println("Invocacion web service : ServicioConvenioWs-consultaCliente");
		System.out.println("SESION: " + sesion);
		return this.servicioConvenio.consultaCliente(cedula);
	}

	public String registrarConvenio(String sesion, TwebConvenios convenio) {
		System.out.println("Invocacion web service : ServicioConvenioWs-registrarConvenio");
		System.out.println("SESION: " + sesion);
		return this.servicioConvenio.registrarConvenio(convenio);
	}

	public List<TwebConvenios> listaConveniosVigentes(String sesion) {
		System.out.println("Invocacion web service : ServicioConvenioWs-listaConveniosVigentes");
		System.out.println("SESION: " + sesion);
		return this.servicioConvenio.listaConveniosVigentes();
	}

	public void actualizarConvenio(String sesion, TwebConvenios convenio) {
		System.out.println("Invocacion web service : ServicioConvenioWs-actualizarConvenio");
		System.out.println("SESION: " + sesion);
		this.servicioConvenio.actualizarConvenio(convenio);
	}

	public TwebConvenios validaDatosCliente(String sesion, String cedula, String correo, String celular) {
		System.out.println("Invocacion web service : ServicioConvenioWs-validaDatosCliente");
		System.out.println("SESION: " + sesion);
		return this.servicioConvenio.validaDatosCliente(cedula, correo, celular);
	}

	public TwebConvenios validaIdentidadCliente(String sesion, String ip, String cedula, String cuenta,
			Integer anioNacimiento, Date fechaUltimaTransaccion, Boolean tieneCredito, Boolean tieneInversion,
			Boolean recibeTransferencia, List<Integer> listaPreguntasSegundaValidacion, Integer intentosParaBloquear) {
		System.out.println("Invocacion web service : ServicioConvenioWs-validaIdentidadCliente");
		System.out.println("SESION: " + sesion);
		return this.servicioConvenio.validaIdentidadCliente(ip, cedula, cuenta, anioNacimiento, fechaUltimaTransaccion,
				tieneCredito, tieneInversion, recibeTransferencia, listaPreguntasSegundaValidacion,
				intentosParaBloquear);
	}

}
