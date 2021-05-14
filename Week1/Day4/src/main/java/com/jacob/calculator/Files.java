package com.jacob.calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Files {
	
	ArrayList<String> data = new ArrayList<String>();
	
	public static void run() {
		try {
			// Write some text
			FileWriter fw = new FileWriter("file.txt");
			fw.write("Some content\n");
			fw.close();
			
			// Write some text in append mode
			fw = new FileWriter("file.txt", true);
			fw.append("Some content");
			fw.close();
			
			// Read raw text
			FileReader fr = new FileReader("file.txt");
			char[] text = new char[1];
			fr.read(text);
			fr.close();
			System.out.println(text);
			
			// Read line-by-line
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			/*String s = br.readLine();
			System.out.println(s);*/
			
			boolean good = true;
			while (good) {
				String s = br.readLine();
				
				if (s == null)
					good = false;
				else
					System.out.println(s);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
