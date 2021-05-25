package com.jacob.calculator;

import java.io.IOException;

public class Exceptions {

	public static void run() {
		
		try {
			throw new Exception();
		} catch (IOException e) {
			
		} catch (NullPointerException e) {
			
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			//throw e;
		} finally {
			// This code will always run, even if
			// the program crashes
		}
	}
}
