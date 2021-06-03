package com.jacob.soap;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.jacob.soap.HelloService")
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}
}
