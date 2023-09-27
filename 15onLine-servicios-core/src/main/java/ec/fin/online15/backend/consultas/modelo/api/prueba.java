package ec.fin.online15.backend.consultas.modelo.api;


import java.util.List;

import org.json.JSONObject;

import com.google.gson.Gson;
//import ec.fin.online15.backend.consultas.modelo.dtos.*;
import fin.coop15abril.librerias.dtosdenarius.DatosClienteMS;
import fin.coop15abril.librerias.dtosdenarius.pojos.CuentaAhorro;
import fin.coop15abril.librerias.dtosdenarius.pojos.Credito;


public class prueba {
    public static void main(String[] args) {
    	 DenariusApiClientService service = new DenariusApiClientService();
         Gson gson = new Gson();
         
         try {
        	 String identificacion = "1302794001"; 
             JSONObject response = service.consultarAPI(identificacion);

             RespuestaGeneralDTO respuestaDTO = gson.fromJson(response.toString(), RespuestaGeneralDTO.class);

             System.out.println("Código: " + respuestaDTO.getCodigo());
             System.out.println("Mensaje: " + respuestaDTO.getMensaje());
            // System.out.println("DataJson: " + respuestaDTO.getDataJson());
                          
          // Deserializar dataJson a DatosClienteMS
             DatosClienteMS datosCliente = gson.fromJson(respuestaDTO.getDataJson(), DatosClienteMS.class);
             if (respuestaDTO.getDataJson() != null) {              
                 System.out.println("ID Cliente: " + datosCliente.getIdCliente());
                 System.out.println("Nombre: " + datosCliente.getNombres() + " " + datosCliente.getApellidos());
                 System.out.println("Residencia Fiscal: " + datosCliente.getResidenciaFiscal());
                 
             }
                         
             List<CuentaAhorro> cuentas = datosCliente.getCuentasAhorro();
             if (cuentas != null) {
                 for (CuentaAhorro cuenta : cuentas) {
                     System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta());
                     System.out.println("Saldo: " + cuenta.getSaldoDisponible());
                     System.out.println("Maneja Libreta:"+cuenta.getManejaLibreta());
                 }
             }
             
             List<Credito> listaCreditos = datosCliente.getCreditos();
             if (listaCreditos != null) {
                 for (Credito credito : listaCreditos) {
                     System.out.println("Número de Crédito: " + credito.getIdOperacion());
                     System.out.println("Monto: " + credito.getMontoAprobado());                     
                     System.out.println("Interés: " + credito.getCodigoProducto());
                    
                 }
             }
             
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
