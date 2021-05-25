package com.jacob.calculator;

public class Strings {
	public static void run() {
		// These all make new objects in the heap with new addresses
		// NOT a string literal
		String s = new String("Some text"); // 0x1
		String ss = new String("Some text"); // 0x2
		String sss = new String("Some text"); // 0x3
		
		// All same addresses thanks to String Pool
		// This is a string literal
		String s2 = "More text"; // 0x4
		String s3 = "More text"; // 0x4
		String s4 = "More text"; // 0x4
		
		// Basic StringBuilder usage
		StringBuilder sb = new StringBuilder();
		sb.append("Hi! StringBuilder here.");
		System.out.println(sb.toString());
	}
}
