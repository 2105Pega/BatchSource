package com.jacob.threads.synchronize;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataService {

	LinkedList<String> strings;
	
	public DataService() {
		strings = new LinkedList<String>();
	}
	
	public void addString(String s) {
		strings.addFirst(s);
	}
	
	public String getString() {
		String s = strings.getLast();
		strings.removeLast();
		return s;
	}
	
	public synchronized int getSize() {
		return strings.size();
	}
}
