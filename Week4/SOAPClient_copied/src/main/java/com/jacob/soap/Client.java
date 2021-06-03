package com.jacob.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.Service;

public class Client {
	
	public static void main(String...strings) {
		try {
			// The URL for your WSDL
			URL url = new URL("http://localhost:8000/fun/stuff?wsdl");
			
			// Your ServiceName, found by visiting your service's address
			QName qname = new QName("http://soap.jacob.com/", "HelloServiceImplService");
			
			Service service = Service.create(url, qname);
			HelloService hello = service.getPort(HelloService.class);
			
			System.out.println(hello.sayHello("Jacobo"));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
