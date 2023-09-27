package ec.fin.online15.backend.ldap.modelo.servicios;

import java.io.FileInputStream;
//import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPException;

public class LdapConexion {

	private static int ldapVersion;
	private static Properties ldapProps = new Properties();
	private static String SERVIDOR_LDAP;
	private static String USUARIO_ADMIN_LDAP;
	private static String PUERTO_LDAP;
	private static String PASSWORD_ADMIN_LDAP;
	// private static String IP_LDAP;

	static {
		try {
			String lPropiedades = System.getProperty("urLdapProps");
			System.out.println("Archivo properties LDAP " + lPropiedades);

			ldapProps.load(new FileInputStream(lPropiedades));

			SERVIDOR_LDAP = "SERVIDOR_LDAP";
			USUARIO_ADMIN_LDAP = "USUARIO_ADMIN_LDAP";
			PUERTO_LDAP = "PUERTO_LDAP";
			PASSWORD_ADMIN_LDAP = "PASSWORD_ADMIN_LDAP";
			ldapVersion = LDAPConnection.LDAP_V3;
			// IP_LDAP = System.getProperty("ipLDAP");
			verficacionPropiedades();
		} catch (Exception e) {
			System.err.print("ERROR AL OBTENER EL BUNDLE DE LDAP");
			e.printStackTrace();
		}

	}

	private LdapConexion() {

	}

	static void verficacionPropiedades() {
		System.out.println("Usuario Admin: " + ldapProps.getProperty(USUARIO_ADMIN_LDAP));
		System.out.println("puerto: " + ldapProps.getProperty(PUERTO_LDAP));
		System.out.println("Vesion: " + ldapVersion);
		System.out.println("HOST: " + ldapProps.getProperty(SERVIDOR_LDAP));
		// System.out.println("HOST: " + IP_LDAP);
	}

	static LDAPConnection conexionManager() throws UnsupportedEncodingException, LDAPException {
		LDAPConnection lc = null;

		System.out.println("Inicio Conexion de administrador");
		lc = new LDAPConnection();
		lc.connect(ldapProps.getProperty(SERVIDOR_LDAP), // IP_LDAP,
				Integer.parseInt(ldapProps.getProperty(PUERTO_LDAP)));
		lc.bind(ldapVersion, ldapProps.getProperty(USUARIO_ADMIN_LDAP),
				ldapProps.getProperty(PASSWORD_ADMIN_LDAP).getBytes("UTF8"));
		System.out.println("Conexion Exitosa");
		return lc;

	}

	static LDAPConnection conexionUser(String strUser, String strPassword)
			throws LDAPException, UnsupportedEncodingException {
		String login = LdapServicios.formatoUsuarioLdap(strUser);
		LDAPConnection lc = null;
		System.out.println("Inicio Conexion de Usuario");
		lc = new LDAPConnection();
		lc.connect(ldapProps.getProperty(SERVIDOR_LDAP), // IP_LDAP,
				Integer.parseInt(ldapProps.getProperty(PUERTO_LDAP)));
		lc.bind(ldapVersion, login, strPassword.getBytes("UTF8"));
		System.out.println("Conexion de Usuario Exitoso");
		return lc;
	}

	static void cerrarConLDAP(LDAPConnection lc) throws LDAPException {
		lc.disconnect();
		System.out.println("Cierre de Conexion");
	}

}