package com.jacob.soap;

import jakarta.xml.ws.Endpoint;

public class Server {
	
	public static void main(String...strings) {
		Endpoint.publish("http://localhost:8000/fun/stuff", new HelloServiceImpl());
	}
}
