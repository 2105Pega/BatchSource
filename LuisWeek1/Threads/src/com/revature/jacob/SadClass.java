package com.revature.jacob;

public class SadClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i<100; i++) {
			System.out.println("I am the sad class");
		}
	}

}
