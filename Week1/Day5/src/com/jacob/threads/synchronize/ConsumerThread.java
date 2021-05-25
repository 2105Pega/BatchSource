package com.jacob.threads.synchronize;

public class ConsumerThread implements Runnable {
	
	private DataService _dataService;
	
	public ConsumerThread(DataService dataService) {
		_dataService = dataService;
	}
	
	public void run() {
		for (int i = 0; i < 10; ++i) {
			if (_dataService.getSize() > 0)
				System.out.println(_dataService.getString());
			else --i;
		}
		
		String s = (true) ? "One value" : "Another value"; 
	}
}
