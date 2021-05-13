package com.revature.collections.mycollections;

import java.lang.reflect.Array;

public class MyCollection<T>{
	// Constants
	public static final int EMPTY_COLLECTION_CAPACITY = 5;
	
	// member data
	private T myData[];
	private int currentSize;
	private int currentCapacity;
	
	// constructors
	public MyCollection() {
		currentCapacity = EMPTY_COLLECTION_CAPACITY;
		myData = (T[]) new Object[currentCapacity];
		currentSize = 0;
	}
	public MyCollection(Class<T> c) {
		currentCapacity = EMPTY_COLLECTION_CAPACITY;
		myData = (T[]) Array.newInstance(c,currentCapacity);
		currentSize = 0;
		
	}
	public MyCollection(T ...ts) {
		myData = ts;
		currentSize = ts.length;
		currentCapacity = currentSize;
	}
	
	// methods
	public T get(int index) {
		return myData[index];
	}
	public void add(T item) {
		if (currentSize == currentCapacity) {
			T[] placeholder = myData;
			currentCapacity = currentCapacity*2;
			myData = (T[]) new Object[currentCapacity];
			
			for(int i = 0; i<currentSize;i++)
			{
				myData[i] = placeholder[i];
			}
		}
		myData[currentSize] = item;
		currentSize++;	
	}
	public void add(Class<T> c, T item) {
		if (currentSize == currentCapacity) {
			T[] placeholder = myData;
			currentCapacity = currentCapacity*2;
			myData = (T[]) Array.newInstance(c, currentCapacity);
			
			for(int i = 0; i<currentSize;i++)
			{
				myData[i] = placeholder[i];
			}
		}
		myData[currentSize] = item;
		currentSize++;	
	}
	public int size() {
		return currentSize;
	}
}
