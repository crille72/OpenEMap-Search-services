
package se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdressPortType", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdressPortType {


    /**
     * 
     * @param findRegisterenhetRequest
     * @return
     *     returns se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1.RegisterenhetsreferensResponseType
     */
    @WebMethod(operationName = "FindRegisterenhet")
    @WebResult(name = "RegisterenhetsreferensResponse", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", partName = "RegisterenhetsreferensResponse")
    public RegisterenhetsreferensResponseType findRegisterenhet(
        @WebParam(name = "FindRegisterenhetRequest", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", partName = "FindRegisterenhetRequest")
        FindRegisterenhetRequestType findRegisterenhetRequest);

}
