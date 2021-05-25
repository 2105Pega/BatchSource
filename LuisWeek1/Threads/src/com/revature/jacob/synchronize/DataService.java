package com.revature.jacob.synchronize;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataService {
	
	
	LinkedList<String> strings;
	
	public DataService() {
		strings = new LinkedList<String>();
	}
	public synchronized void addString(String s) {
		strings.addFirst(s);
	}
	
	public synchronized String getString() {
		String s = strings.getLast();
		strings.removeLast();
		return s;
	}
	
	
}
