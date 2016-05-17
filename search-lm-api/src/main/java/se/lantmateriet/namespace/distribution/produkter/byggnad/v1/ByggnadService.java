
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

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
@WebServiceClient(name = "ByggnadService", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1", wsdlLocation = "http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1/byggnad-1.3.wsdl")
public class ByggnadService
    extends Service
{

    private final static URL BYGGNADSERVICE_WSDL_LOCATION;
    private final static WebServiceException BYGGNADSERVICE_EXCEPTION;
    private final static QName BYGGNADSERVICE_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1", "ByggnadService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1/byggnad-1.3.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BYGGNADSERVICE_WSDL_LOCATION = url;
        BYGGNADSERVICE_EXCEPTION = e;
    }

    public ByggnadService() {
        super(__getWsdlLocation(), BYGGNADSERVICE_QNAME);
    }

    public ByggnadService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BYGGNADSERVICE_QNAME, features);
    }

    public ByggnadService(URL wsdlLocation) {
        super(wsdlLocation, BYGGNADSERVICE_QNAME);
    }

    public ByggnadService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BYGGNADSERVICE_QNAME, features);
    }

    public ByggnadService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ByggnadService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ByggnadPortType
     */
    @WebEndpoint(name = "ByggnadSoapBinding")
    public ByggnadPortType getByggnadSoapBinding() {
        return super.getPort(new QName("http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1", "ByggnadSoapBinding"), ByggnadPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ByggnadPortType
     */
    @WebEndpoint(name = "ByggnadSoapBinding")
    public ByggnadPortType getByggnadSoapBinding(WebServiceFeature... features) {
        return super.getPort(new QName("http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1", "ByggnadSoapBinding"), ByggnadPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BYGGNADSERVICE_EXCEPTION!= null) {
            throw BYGGNADSERVICE_EXCEPTION;
        }
        return BYGGNADSERVICE_WSDL_LOCATION;
    }

}
