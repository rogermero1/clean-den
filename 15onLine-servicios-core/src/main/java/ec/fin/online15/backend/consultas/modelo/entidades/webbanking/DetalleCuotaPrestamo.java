package ec.fin.online15.backend.consultas.modelo.entidades.webbanking;

import java.io.Serializable;

public class DetalleCuotaPrestamo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoSaldo;
	private Double valorSaldo;
	private Double saldo;

	public DetalleCuotaPrestamo() {
	}

	public DetalleCuotaPrestamo(String tipoSaldo, Double valorSaldo,
			Double saldo) {
		super();
		this.tipoSaldo = tipoSaldo;
		this.valorSaldo = valorSaldo;
		this.saldo = saldo;
	}

	public String getTipoSaldo() {
		return tipoSaldo;
	}

	public void setTipoSaldo(String tipoSaldo) {
		this.tipoSaldo = tipoSaldo;
	}

	public Double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(Double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
