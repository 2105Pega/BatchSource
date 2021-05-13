package com.chimene.structures;

import java.util.Arrays;

public class ArrayList<E> {
	private Object[] list;
	private static final int DEFAULT_LEN = 10;
	private int size;
	private int capacity;
	
	public ArrayList() {
		list = new Object[DEFAULT_LEN];
		size = 0;
		capacity = DEFAULT_LEN;
	}
	
	public ArrayList(int length) {
		list = new Object[length];
		size = 0;
		capacity = length;
	}
	
	public E get(int index) {
		return (E) list[index];
	}
	
	public void add(E element) {
		if(size == capacity) {
			list = Arrays.copyOf(list, capacity + DEFAULT_LEN);
		}
		list[size] = element;
		size++;
		capacity = list.length;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[");
		for(int i = 0; i < size - 1; i++) {
			result.append(list[i].toString() + ",");
		}
		result.append(list[size-1].toString() + "]");
		return result.toString();
	}
	
}
