
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

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
@WebServiceClient(name = "FastighetService", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", wsdlLocation = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6/fastighet-1.6.1.wsdl")
public class FastighetService
    extends Service
{

    private final static URL FASTIGHETSERVICE_WSDL_LOCATION;
    private final static WebServiceException FASTIGHETSERVICE_EXCEPTION;
    private final static QName FASTIGHETSERVICE_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", "FastighetService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6/fastighet-1.6.1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FASTIGHETSERVICE_WSDL_LOCATION = url;
        FASTIGHETSERVICE_EXCEPTION = e;
    }

    public FastighetService() {
        super(__getWsdlLocation(), FASTIGHETSERVICE_QNAME);
    }

    public FastighetService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FASTIGHETSERVICE_QNAME, features);
    }

    public FastighetService(URL wsdlLocation) {
        super(wsdlLocation, FASTIGHETSERVICE_QNAME);
    }

    public FastighetService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FASTIGHETSERVICE_QNAME, features);
    }

    public FastighetService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FastighetService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FastighetPortType
     */
    @WebEndpoint(name = "FastighetSoapBinding")
    public FastighetPortType getFastighetSoapBinding() {
        return super.getPort(new QName("http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", "FastighetSoapBinding"), FastighetPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FastighetPortType
     */
    @WebEndpoint(name = "FastighetSoapBinding")
    public FastighetPortType getFastighetSoapBinding(WebServiceFeature... features) {
        return super.getPort(new QName("http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", "FastighetSoapBinding"), FastighetPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FASTIGHETSERVICE_EXCEPTION!= null) {
            throw FASTIGHETSERVICE_EXCEPTION;
        }
        return FASTIGHETSERVICE_WSDL_LOCATION;
    }

}
