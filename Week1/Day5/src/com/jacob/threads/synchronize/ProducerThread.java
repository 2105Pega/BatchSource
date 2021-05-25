package com.jacob.threads.synchronize;

public class ProducerThread implements Runnable {

	private DataService _dataService;
	
	public ProducerThread(DataService dataService) {
		_dataService = dataService;
	}
	
	public void run() {
		for (int i = 0; i < 10; ++i) {
			String s;
			if (i % 2 == 0)
				s = "I was even " + i;
			else s = "I was odd " + i;
			
			_dataService.addString(s);
		}
	}
}
