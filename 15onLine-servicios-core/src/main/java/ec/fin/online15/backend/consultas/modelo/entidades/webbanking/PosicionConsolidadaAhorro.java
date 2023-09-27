package ec.fin.online15.backend.consultas.modelo.entidades.webbanking;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PosicionConsolidadaAhorro implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codigoAplicacion;
	private Integer codigoSubAplicacion;
	private String numeroCuenta;
	private Integer codigoMoneda;
	private String descripcionMoneda;
	private String abreviaturaMoneda;
	private Double saldoTotalLinea;
	private Double saldoReservaLinea;
	private Double saldoDisponible;
	private Double saldoBloqueado;
	private String nombreCuenta;
	private String claseCuenta;


}
