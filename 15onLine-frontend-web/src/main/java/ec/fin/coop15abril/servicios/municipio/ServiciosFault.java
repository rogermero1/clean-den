
package ec.fin.coop15abril.servicios.municipio;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Error", targetNamespace = "http://municipio.servicios.coop15abril.fin.ec/")
public class ServiciosFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Error faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ServiciosFault(String message, Error faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ServiciosFault(String message, Error faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ec.fin.coop15abril.servicios.municipio.Error
     */
    public Error getFaultInfo() {
        return faultInfo;
    }

}
