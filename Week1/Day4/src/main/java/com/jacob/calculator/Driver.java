package com.jacob.calculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		//CollectionsStuff.run();
		//Exceptions.run();
		//Strings.run();
		Files.run();
		Serialization.run();
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(1, 2));
	}
	
	public static void throwException() throws Exception {
		throw new Exception("Bad");
	}
}
