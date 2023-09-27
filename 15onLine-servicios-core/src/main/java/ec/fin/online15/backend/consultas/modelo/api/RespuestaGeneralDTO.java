package ec.fin.online15.backend.consultas.modelo.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaGeneralDTO {
	 private String codigo;
	 private String mensaje;
	 private String dataJson;
}
