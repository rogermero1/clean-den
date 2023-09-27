package ec.fin.online15.backend.consultas.modelo.dtos_backup;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuentaAhorro implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idCuenta;
	private Integer idCliente;
	private Integer idClientePrincipal;
	private Integer idSucursal;
	private String nombreSucursal;
	private String tipoCuenta;
	private String numeroCuenta;
	private String nombreCuenta;
	private String nombreOficial;
	private String codigoSubProducto;
	private String descripcionSubProducto;
	private String nombreProducto;
	private String nombreMoneda;
	private String estado;
	private String descripcionEstado;
	private String fechaApertura;
	private String bloqueo;
	private String descripcionBloqueo;
	private String tipoBloqueo;
	private String descripcionTipoBloqueo;
	private Double saldoAGirar;
	private Double saldoContable;
	private Double saldoDisponible;
	private Double montoBloqueado;
	private Double porEfectivizar;
	private Double porEfectivizarHoy;
	private Double valorRetenido;
	private Double valorSuspenso;
	private String manejaLibreta;
	private String tipoAhorroProgramado;
	private Boolean permiteRetiros;
	private Boolean restringida;
	private Boolean principal;
	private Boolean vinculada;
	private Boolean visible;

}
