package com.revature.myarraylist;

public class MyArrayList{
	private Object[] o;
	private int currentIndex;
	
	public MyArrayList() {
		o = new Object[5];
		currentIndex = 0;
	}
	
	public Object get(int index) {
		try {
			return o[index];
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e);
			return o[0];
		}
	}
	
	public void add(Object value) {
		if(currentIndex == o.length) {
			Object[] newO = new Object[o.length *2];
			for (int i = 0; i < o.length; i++) {
				newO[i] = o[i];
			}
			o = newO;
		}
		o[currentIndex] = value;
		currentIndex++;		
	}
	
}
