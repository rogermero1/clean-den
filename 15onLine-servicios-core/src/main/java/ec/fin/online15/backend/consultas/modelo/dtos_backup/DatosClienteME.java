package ec.fin.online15.backend.consultas.modelo.dtos_backup;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosClienteME implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "identificacion es obligatorio")
	private String identificacion;
	// private String codigoCliente;
	private Boolean consultarDatosAdicionales;

	public DatosClienteME(String identificacion) {
		this.identificacion = identificacion;
	}

}
