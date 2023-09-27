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
public class Credito implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idOperacion;
	private String numeroOperacion;
	private Integer numeroTramite;
	private Integer codigoOficial;
	private Integer codigoOficina;

	private Integer codigoEstado;
	private String estado;

	private String codigoProducto;
	private String producto;

	private String codigoTipoCredito;
	private String tipoCredito;
	private Integer idTipoCredito;

	private String codigoSegmento;
	private String segmento;

	private String codigoSector;
	private String sector;

	private String codigoActividadEconomica;
	private String actividadEconomica;

	private String codigoProvinciaDestino;
	private String provinciaDestino;

	private String codigoCantonDestino;
	private String cantonDestino;

	private String codigoCiudadDestino;
	private String ciudadDestino;

	private String codigoParroquiaDestino;
	private String parroquiaDestino;

	private String codigoTipoCuota;
	private String tipoCuota;

	private String codigoTipoPlazo;
	private String tipoPlazo;

	private Integer plazo;

	private Integer numeroCuotas;
	// private Integer cuotasPagadas;

	private Integer periodoCapital;
	private Integer periodoInteres;

	private String fechaApertura;
	private String fechaLiquidacion;
	private String fechaVencimiento;

	private Double tasa;
	// private Double tea;

	private Double montoAprobado;
	private Double montoDesembolsado;
	private Double saldoCapital;

	private Double valorCuota;

	private String numeroCuenta;

	private Boolean renovacion;
	private String fechaVencimientoProximaCuota;
	private Integer diaPago;
	private Integer diasMora;
	private Integer diasXDividendo;
	private Double valorEncaje;
	private Double intereses;
	private Double interesesMora;
	private Double montoVencido;
	private Double saldoOperacion;

	// private Double monto;
	// private Double valor;

}
