package com.revature;

public class Driver {
	public static void main(String args[]) {
		/*
		MyArrayList list = new MyArrayList();
		for(int i=0; i<25; i++) {
			list.add(i);
		}
		for(int i=0; i<25; i++) {
			System.out.println(list.get(i));
		}
		*/
		
		MyArrayListGeneric<Integer> list = new MyArrayListGeneric<Integer>();
		for(int i=0; i<26; i++) {
			list.add(i);
		}
		for(int i=0; i<26; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("");
		
		MyArrayListGeneric<String> list2 = new MyArrayListGeneric<String>();
		for(int i=0; i<26; i++) {
			list2.add(Character.toString((char) i + (int)'a'));
		}
		for(int i=0; i<26; i++) {
			System.out.println(list2.get(i));
		}
	}
}
