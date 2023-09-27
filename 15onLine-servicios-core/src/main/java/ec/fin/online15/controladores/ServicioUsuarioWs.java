package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.seguridad.modelo.entidades.TwebUsuario;
import ec.fin.online15.backend.seguridad.modelo.entidades.TwebUsuarioRol;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioUsuario;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioUsuariosRoles;
import ec.fin.online15.backend.webbanking.modelo.entidades.Canal;
import ec.fin.online15.interfaces.IServicioUsuarioWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioUsuarioWs implements IServicioUsuarioWs {

	@EJB
	private ServicioUsuario servicioUsuario;

	@EJB
	private ServicioUsuariosRoles servicioUsuarioRol;

	public TwebUsuario obtenerUsuarioBase(String sesion, String usuario) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-obtenerUsuarioBase");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.obtenerUsuarioBase(usuario);
	}

	public String errorRespuestaSecreta(String sesion, String usuario, String actualizadoPor) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-errorRespuestaSecreta");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.errorRespuestaSecreta(usuario, actualizadoPor);
	}

	public boolean consultaIpConocida(String sesion, TwebUsuario usuario, String Ip) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-consultaIpConocida");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.consultaIpConocida(usuario, Ip);
	}

	public boolean validaIpAdministrativa(String sesion, String ip) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-validaIpAdministrativa");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.validaIpAdministrativa(ip);
	}

	public List<TwebUsuarioRol> rolesUsuario(String sesion, Long idUsuario) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-rolesUsuario");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuarioRol.rolesUsuario(idUsuario);
	}

	public void registrarConexion(String sesion, TwebUsuario usuario, String ip, String observacion, boolean guardarIp,
			String actualizadoPor, boolean usuarioAdministrador, Canal canal) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-registrarConexion");
		System.out.println("SESION: " + sesion);
		this.servicioUsuario.registrarConexion(sesion, usuario, ip, observacion, guardarIp, actualizadoPor,
				usuarioAdministrador, canal);
	}

	public String envioNotificacion(String sesion, Integer codigoCliente, String telefono, String correo,
			Integer plantilla, List<String> parametros) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-envioNotificacion");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.envioNotificacion(codigoCliente, telefono, correo, plantilla, parametros);
	}

	public TwebUsuario consultaUsuarioPorNumeroIdentificacion(String sesion, String identificacion) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-consultaUsuarioPorNumeroIdentificacion");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.consultaUsuarioPorNumeroIdentificacion(identificacion);
	}

	public String consultaEstadoBatch(String sesion) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-consultaEstadoBatch");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.consultaEstadoBatch();
	}

	public String consultaNombreCliente(String sesion, Integer codigoCliente) {
		System.out.println("Invocacion web service : ServicioUsuarioWs-consultaNombreCliente");
		System.out.println("SESION: " + sesion);
		return this.servicioUsuario.consultaNombreCliente(codigoCliente);
	}

}
