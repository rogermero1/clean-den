package ec.fin.online15.backend.webbanking.modelo.servicios;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.fin.online15.backend.consultas.modelo.repositorios.webbanking.PosicionConsolidadEAO;

@Stateless
public class ServicioConsultaPosicionConsolidada  {

	@EJB
	private PosicionConsolidadEAO posicionConsolidadaEAO;


}
