package ec.fin.online15.backend.consultas.modelo.dtos_backup;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosClienteMS implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idCliente;
	private String tipoIdentificacion;
	private String identificacion;
	private String nombre1;
	private String nombre2;
	private String nombres;
	private String apellido1;
	private String apellido2;
	private String apellidos;
	private String nombreCompleto;
	private String identificacionConyuge;
	private String nombreConyuge;
	private String estadoCivil;
	private String celular;
	private String correo;
	private String telefonoAdicional;
	private String fechaNacimiento;
	private String nivelEducacion;
	private String tipoVivienda;
	private String genero;
	private String idActividadEconomica;
	private String ciudad;
	private String direccion;
	private Integer idAgencia;
	private String nombreAgencia;
	private Boolean pep;
	private Boolean residenciaFiscal;

	private Boolean vinculado;
	private Boolean funcionario;
	private Boolean socio;
	private Boolean extranjero;
	private Boolean potencial;
	private Integer codigoOficial;
	private String nombreOficial;

	private List<CuentaAhorro> cuentasAhorro;
	private List<Credito> creditos;
	private List<Inversion> inversiones;

}
