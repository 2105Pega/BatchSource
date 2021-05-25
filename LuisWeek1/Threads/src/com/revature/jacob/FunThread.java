package com.revature.jacob;

public class FunThread extends Thread {
	public void run() {
		for (int i = 0; i<100; i++) {
			System.out.println("The fun thread is running");
		}
	}
}
