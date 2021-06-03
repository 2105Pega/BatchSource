package com.kyle.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.*;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloSOAP {
	@WebMethod public String sayHello(String name);
}
