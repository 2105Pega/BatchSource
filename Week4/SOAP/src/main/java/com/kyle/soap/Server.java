package com.kyle.soap;

import jakarta.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/fun/stuff", new HelloSOAPImpl());
	}
}
