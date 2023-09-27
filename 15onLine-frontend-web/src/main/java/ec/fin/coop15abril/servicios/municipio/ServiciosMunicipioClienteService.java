
package ec.fin.coop15abril.servicios.municipio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiciosMunicipioClienteService", targetNamespace = "http://municipio.servicios.coop15abril.fin.ec/", wsdlLocation = "http://200.100.1.47:8001/Servicios/Municipio/Cliente?wsdl")
public class ServiciosMunicipioClienteService
    extends Service
{

    private final static URL SERVICIOSMUNICIPIOCLIENTESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOSMUNICIPIOCLIENTESERVICE_EXCEPTION;
    private final static QName SERVICIOSMUNICIPIOCLIENTESERVICE_QNAME = new QName("http://municipio.servicios.coop15abril.fin.ec/", "ServiciosMunicipioClienteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://200.100.1.47:8001/Servicios/Municipio/Cliente?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOSMUNICIPIOCLIENTESERVICE_WSDL_LOCATION = url;
        SERVICIOSMUNICIPIOCLIENTESERVICE_EXCEPTION = e;
    }

    public ServiciosMunicipioClienteService() {
        super(__getWsdlLocation(), SERVICIOSMUNICIPIOCLIENTESERVICE_QNAME);
    }

    public ServiciosMunicipioClienteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOSMUNICIPIOCLIENTESERVICE_QNAME, features);
    }

    public ServiciosMunicipioClienteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOSMUNICIPIOCLIENTESERVICE_QNAME);
    }

    public ServiciosMunicipioClienteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOSMUNICIPIOCLIENTESERVICE_QNAME, features);
    }

    public ServiciosMunicipioClienteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiciosMunicipioClienteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiciosMunicipioCliente
     */
    @WebEndpoint(name = "ServiciosMunicipioClientePort")
    public ServiciosMunicipioCliente getServiciosMunicipioClientePort() {
        return super.getPort(new QName("http://municipio.servicios.coop15abril.fin.ec/", "ServiciosMunicipioClientePort"), ServiciosMunicipioCliente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiciosMunicipioCliente
     */
    @WebEndpoint(name = "ServiciosMunicipioClientePort")
    public ServiciosMunicipioCliente getServiciosMunicipioClientePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://municipio.servicios.coop15abril.fin.ec/", "ServiciosMunicipioClientePort"), ServiciosMunicipioCliente.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOSMUNICIPIOCLIENTESERVICE_EXCEPTION!= null) {
            throw SERVICIOSMUNICIPIOCLIENTESERVICE_EXCEPTION;
        }
        return SERVICIOSMUNICIPIOCLIENTESERVICE_WSDL_LOCATION;
    }

}
