package com.revature.jacob;

public class Driver {
	public static void main(String[] args) {
		
		FunThread f = new FunThread();
		SadClass sc = new SadClass();
		Thread t = new Thread(sc);
		
		
		f.start();
		t.start();
	
	}
}
