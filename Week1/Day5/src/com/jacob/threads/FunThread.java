package com.jacob.threads;

public class FunThread extends Thread {
	
	public FunThread() { }
	
	public FunThread(Runnable r) {
		super(r);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("This is the fun thread!");
		}
	}
}
