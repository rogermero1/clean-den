package ec.fin.online15.controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

import ec.fin.online15.backend.consultas.modelo.entidades.clientes.PreguntaSecreta;
import ec.fin.online15.backend.seguridad.modelo.entidades.TwebUsuario;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioRegistroUsuario;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioRol;
import ec.fin.online15.backend.seguridad.modelo.servicios.ServicioUsuariosRoles;
import ec.fin.online15.backend.webbanking.modelo.entidades.TwebRespuestasUsuarios;
import ec.fin.online15.backend.webbanking.modelo.servicios.ServicioRespuestasUsuarios;
import ec.fin.online15.interfaces.IServicioRegistroUsuarioWs;

@WebService(targetNamespace = "http://servicios.coop15abril.fin.ec")
@HandlerChain(file = "Interceptor.xml")
@Stateless
public class ServicioRegistroUsuarioWs implements IServicioRegistroUsuarioWs {

	@EJB
	private ServicioRegistroUsuario servicioRegistroUsuario;

	@EJB
	private ServicioUsuariosRoles servicioUsuarioRol;

	@EJB
	private ServicioRol servicioRol;

	@EJB
	private ServicioRespuestasUsuarios servicioRespuestasUsuarios;

	public Integer compruebaExistenciaUsuario(String sesion, String usuario) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-compruebaExistenciaUsuario");
		System.out.println("SESION: " + sesion);
		return servicioRegistroUsuario.compruebaExistenciaUsuario(usuario);
	}

	public String envioOtp(String sesion, Integer codigoCliente, String telefono, String correo, String otpsIguales,
			String observacion) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-envioOtp");
		System.out.println("SESION: " + sesion);
		return servicioRegistroUsuario.envioOtp(codigoCliente, telefono, correo, otpsIguales, observacion);
	}

	public Integer confirmacionOtp(String sesion, Integer codigoCliente, String otpCorreo, String otpCelular) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-confirmacionOtp");
		System.out.println("SESION: " + sesion);
		return servicioRegistroUsuario.confirmacionOtp(codigoCliente, otpCorreo, otpCelular);
	}

	public PreguntaSecreta consultaPreguntaSecreta(String sesion, String nombreUsuario) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-consultaPreguntaSecreta");
		System.out.println("SESION: " + sesion);
		return servicioRegistroUsuario.consultaPreguntaSecreta(nombreUsuario);
	}

	public int modificaClaveUsuario(String sesion, Integer codigoCliente, String usuario, String clave,
			String bloqueado, String actualizadoPor) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-actualiza clave");
		System.out.println("SESION: " + sesion);
		return servicioRegistroUsuario.actualizaClave(codigoCliente, usuario, clave, bloqueado, actualizadoPor);
	}

	public Integer registrarUsuario(String sesion, TwebUsuario usuario, List<TwebRespuestasUsuarios> respuestasUsuario,
			String nombreCliente, String clave, Long rol, String ip) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-registrarUsuario");
		System.out.println("SESION: " + sesion);
		return this.servicioRegistroUsuario.creacionUsuario(usuario, respuestasUsuario, nombreCliente, clave, rol, ip);
	}

	public Integer actualizacionUsuario(String sesion, TwebUsuario usuario) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-actualizacionUsuario");
		System.out.println("SESION: " + sesion);
		return this.servicioRegistroUsuario.actualizacionUsuario(usuario);
	}

	// MAYER
	public Integer compruebaExistenciaCelular(String sesion, Integer codigoCliente, String celular, String usuario) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-compruebaExistenciaCelular");
		System.out.println("SESION: " + sesion);
		return servicioRegistroUsuario.compruebaExistenciaCelular(codigoCliente, celular, usuario);
	}

	// MAYER
	public Integer compruebaExistenciaCorreo(String sesion, Integer codigoCliente, String correo, String usuario) {
		System.out.println("Invocacion web service : ServicioRegistroUsuarioWs-compruebaExistenciaCorreo");
		System.out.println("SESION: " + sesion);
		return servicioRegistroUsuario.compruebaExistenciaCorreo(codigoCliente, correo, usuario);
	}

}
