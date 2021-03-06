
package com.ws;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StudentImplService", targetNamespace = "http://ws.com/", wsdlLocation = "http://127.0.0.1:8889/studentws?wsdl")
public class StudentImplService
    extends Service
{

    private final static URL STUDENTIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTIMPLSERVICE_EXCEPTION;
    private final static QName STUDENTIMPLSERVICE_QNAME = new QName("http://ws.com/", "StudentImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8889/studentws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTIMPLSERVICE_WSDL_LOCATION = url;
        STUDENTIMPLSERVICE_EXCEPTION = e;
    }

    public StudentImplService() {
        super(__getWsdlLocation(), STUDENTIMPLSERVICE_QNAME);
    }

    public StudentImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTIMPLSERVICE_QNAME, features);
    }

    public StudentImplService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTIMPLSERVICE_QNAME);
    }

    public StudentImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTIMPLSERVICE_QNAME, features);
    }

    public StudentImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentImpl
     */
    @WebEndpoint(name = "StudentImplPort")
    public StudentImpl getStudentImplPort() {
        return super.getPort(new QName("http://ws.com/", "StudentImplPort"), StudentImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentImpl
     */
    @WebEndpoint(name = "StudentImplPort")
    public StudentImpl getStudentImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.com/", "StudentImplPort"), StudentImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTIMPLSERVICE_EXCEPTION!= null) {
            throw STUDENTIMPLSERVICE_EXCEPTION;
        }
        return STUDENTIMPLSERVICE_WSDL_LOCATION;
    }

}
