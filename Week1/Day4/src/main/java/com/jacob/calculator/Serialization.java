package com.jacob.calculator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {

	static ArrayList<String> al = new ArrayList<String>();
	
	public static void run() {
		al.add("Hey");
		al.add("Hi");
		al.add("Hello");
		
		try {
			// Write an object
			FileOutputStream fos = new FileOutputStream("object.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			
			// Read an object
			FileInputStream fis = new FileInputStream("object.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> al2 = (ArrayList<String>) ois.readObject();
			System.out.println(al2.size());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
