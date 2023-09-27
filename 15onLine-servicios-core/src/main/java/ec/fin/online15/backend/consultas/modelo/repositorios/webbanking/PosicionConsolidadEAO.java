package ec.fin.online15.backend.consultas.modelo.repositorios.webbanking;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ec.fin.online15.backend.consultas.modelo.entidades.webbanking.PosicionConsolidadaAhorro;
import ec.fin.online15.backend.librerias.repositorios.EAOSeed;

@SuppressWarnings("rawtypes")
@Stateless
@LocalBean
public class PosicionConsolidadEAO extends EAOSeed {

	public List<PosicionConsolidadaAhorro> posicionConsolidadaAhorro(Integer codigoCliente) {
		// TODO Auto-generated method stub
		return null;
	}
 
	//CLASE YA NO UTILIZADA MIENTRAS LA API SE CONSUMA DE DENARIUS- 

}
