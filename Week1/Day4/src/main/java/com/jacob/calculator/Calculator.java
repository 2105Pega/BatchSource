package com.jacob.calculator;

import java.io.Serializable;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
	
	static Logger log;
	
	public Calculator() {
		if (log == null) {
			log = LogManager.getLogger(Calculator.class);
		}
	}
	
	public int add(int a, int b) {
		log.error("Added " + a + " and " + b + " to get " + (a + b));
		return a + b;
	}

	
}
