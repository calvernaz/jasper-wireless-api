
package com.jasperwireless.api.ws.schema;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EchoPortType", targetNamespace = "http://api.jasperwireless.com/ws/schema")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EchoPortType {


    /**
     * 
     * @param body
     * @return
     *     returns com.jasperwireless.api.ws.schema.EchoResponse
     */
    @WebMethod(operationName = "Echo", action = "http://api.jasperwireless.com/ws/service/echo/Echo")
    @WebResult(name = "EchoResponse", targetNamespace = "http://api.jasperwireless.com/ws/schema", partName = "body")
    public EchoResponse echo(
        @WebParam(name = "EchoRequest", targetNamespace = "http://api.jasperwireless.com/ws/schema", partName = "body")
        EchoRequest body);

}
