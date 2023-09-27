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
public class Inversion implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroOperacion;
	private String tipoCaptacion;
	private String tipoPagoInteres;
	private Double monto;
	private Double montoAcruar;
	private Double montoBloqueado;
	private Double montoPignoracion;
	private String codigoEstado;
	private String estado;
	private Integer codigoOficial;
	private String oficialCaptador;
	private String oficialPrincipal;
	private Integer codigoOficina;
	private Double tasa;
	private Double tasaAnterior;
	private Integer plazo;
	private Integer diasTranscurrido;
	private String origenRecursos;
	private String endosado;
	private Boolean custodia;
	private Boolean impreso;
	private Double impuesto;
	private Double interes;
	private Double interesActual;
	private Double interesPorRecibir;
	private Double interesRecibido;
	private Double interesRetenido;
	private Double interesTotal;
	private Double margen;
	private Boolean tasaReajustable;
	private Boolean renovacion;
	private Double porcentajePignoracion;
	private String fechaValor;
	private String fechaRecibo;
	private String fechaVencimiento;
	private String fechaCancelacion;
	private String fechaEfectivizacion;
	private String fechaNegociacion;
	private String fechaProximoInteres;

}
