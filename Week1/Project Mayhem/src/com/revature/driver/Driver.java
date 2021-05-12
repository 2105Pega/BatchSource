package com.revature.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.revature.beans.Person;

public class Driver
{	
	Integer myInteger = 10;
	Integer myInteger2 = 10;
	
	public static void main (String args[]) throws IOException, ClassNotFoundException 
	{
		int[] arr = new int[5];
		
		File file = new File("test.txt");
		
		if(!file.exists())
			file.createNewFile();
		
		/* Reads object from file
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ois.close();
		fis.close();
		*/
		
		/* Writes object to a file
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.close();
		fos.close();
		*/
		
	}
}