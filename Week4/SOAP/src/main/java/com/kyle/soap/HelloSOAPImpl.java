package com.kyle.soap;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.kyle.soap.HelloSOAP")
public class HelloSOAPImpl implements HelloSOAP {

	public String sayHello(String name) {
		return "Hello World JAX-WS " + name; 
	}

}
