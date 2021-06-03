package com.kyle.soap;

public class Client {

	public static void main(String[] args) {
		HelloSOAPImplService implServ = new HelloSOAPImplService();
		System.out.println( implServ.getHelloSOAPImplPort().sayHello("jacobo") );
	}
}
