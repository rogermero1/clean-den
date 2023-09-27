package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.ListadoOpciones;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebPerfilTransaccional;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioPerfilTransaccional;
import ec.fin.online15.interfaces.IServicioPerfilTransaccionalWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioPerfilTransaccionalWs implements IServicioPerfilTransaccionalWs {

	@EJB
	private ServicioPerfilTransaccional servicioPerfilTransaccional;

	public List<TwebPerfilTransaccional> listaPerfilTransaccionalCliente(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioPerfilTransaccionalWs-listaPerfilTransaccionalCliente");
		System.out.println("SESION: " + sesion);
		return servicioPerfilTransaccional.listaPerfilCliente(codigoCliente);
	}

	public void actualizaPerfilTransaccionalCliente(String sesion, TwebPerfilTransaccional perfilCliente) {
		System.out
				.println("Invocacion web service : ServicioPerfilTransaccionalWs-actualizaPerfilTransaccionalCliente");
		System.out.println("SESION: " + sesion);
		servicioPerfilTransaccional.actualizaPerfilCliente(perfilCliente);
	}

	public List<TwebPerfilTransaccional> consultaPerfilCanalTransaccionalCliente(String sesion, Integer codigoCliente,
			Integer idCanalElectronico) {
		System.out.println(
				"Invocacion web service : ServicioPerfilTransaccionalWs-consultaPerfilCanalTransaccionalCliente");
		System.out.println("SESION: " + sesion);
		return servicioPerfilTransaccional.consultaPerfilCanalTransaccionalCliente(codigoCliente, idCanalElectronico);
	}

	public List<TwebPerfilTransaccional> consultaCuposTransaccionalInicial(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioPerfilTransaccionalWs-consultaCuposTransaccionalInicial");
		System.out.println("SESION: " + sesion);
		return servicioPerfilTransaccional.consultaCuposTransaccionalInicial(codigoCliente);
	}

	public List<ListadoOpciones> consultaListaCanalesElectronicos(String sesion) {
		System.out.println("Invocacion web service : ServicioPerfilTransaccionalWs-consultaListaCanalesElectronicos");
		System.out.println("SESION: " + sesion);
		return servicioPerfilTransaccional.listaCanalesElectronicos();
	}

	public List<TwebPerfilTransaccional> consultaPerfilTransaccionesAcumuladas(String sesion, Integer codigoCliente,
			Integer idTipoCanal) {
		System.out.println(
				"Invocacion web service : ServicioPerfilTransaccionalWs-consultaPerfilTransaccionesAcumuladas");
		System.out.println("SESION: " + sesion);
		return servicioPerfilTransaccional.consultaPerfilTransaccionesAcumuladas(codigoCliente, idTipoCanal);
	}

}
