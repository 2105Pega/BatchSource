
package com.kyle.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloSOAPImplService", targetNamespace = "http://soap.kyle.com/", wsdlLocation = "http://localhost:8080/fun/stuff?wsdl")
public class HelloSOAPImplService
    extends Service
{

    private final static URL HELLOSOAPIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOSOAPIMPLSERVICE_EXCEPTION;
    private final static QName HELLOSOAPIMPLSERVICE_QNAME = new QName("http://soap.kyle.com/", "HelloSOAPImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/fun/stuff?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOSOAPIMPLSERVICE_WSDL_LOCATION = url;
        HELLOSOAPIMPLSERVICE_EXCEPTION = e;
    }

    public HelloSOAPImplService() {
        super(__getWsdlLocation(), HELLOSOAPIMPLSERVICE_QNAME);
    }

    public HelloSOAPImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOSOAPIMPLSERVICE_QNAME, features);
    }

    public HelloSOAPImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOSOAPIMPLSERVICE_QNAME);
    }

    public HelloSOAPImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOSOAPIMPLSERVICE_QNAME, features);
    }

    public HelloSOAPImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloSOAPImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloSOAP
     */
    @WebEndpoint(name = "HelloSOAPImplPort")
    public HelloSOAP getHelloSOAPImplPort() {
        return super.getPort(new QName("http://soap.kyle.com/", "HelloSOAPImplPort"), HelloSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloSOAP
     */
    @WebEndpoint(name = "HelloSOAPImplPort")
    public HelloSOAP getHelloSOAPImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.kyle.com/", "HelloSOAPImplPort"), HelloSOAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSOAPIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOSOAPIMPLSERVICE_EXCEPTION;
        }
        return HELLOSOAPIMPLSERVICE_WSDL_LOCATION;
    }

}
