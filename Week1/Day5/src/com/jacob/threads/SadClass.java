package com.jacob.threads;

public class SadClass implements Runnable {

	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("And I am the sad class.");
		}
	}
}
