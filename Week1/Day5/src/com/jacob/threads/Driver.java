package com.jacob.threads;

import com.jacob.threads.synchronize.ConsumerThread;
import com.jacob.threads.synchronize.DataService;
import com.jacob.threads.synchronize.ProducerThread;

public class Driver {
	public static void main(String[] args) {
		/*FunThread f = new FunThread();
		
		SadClass sc = new SadClass();
		FunThread t = new FunThread(sc);
		
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f.start();*/
		
		DataService ds = new DataService();
		ConsumerThread ct = new ConsumerThread(ds);
		ProducerThread pt = new ProducerThread(ds);
		
		Thread t1 = new Thread(ct);
		Thread t2 = new Thread(pt);
		
		t2.start();
		t1.start();
	}
}
