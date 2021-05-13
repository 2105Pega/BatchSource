package com.revature.collections.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import com.revature.collections.mycollections.MyCollection;

public class Driver {

	public static void main(String[] args) {

		MyCollection<String> mc = new MyCollection<String>("My", "name", "is", "Marcus", "!!!!");
		printMc(mc);
		mc.add("XD");
		printMc(mc);

		// example3();
	}

	private static void printMc(MyCollection mc) {
		for (int i = 0; i < mc.size(); i++) {
			System.out.println(mc.get(i));
		}
	}

	public static void example1() {
		// arrays need their size to be predefined
		int[] a = new int[50];

		// collections are meant to be like arrays but more flexible
		Vector<Integer> b = new Vector<Integer>();
		// <> is for type params. these are called generics.
		// need to be pased a reference type (hence int's wrapper)
		// the generic tells the collection what it will be holding

		// the collection interface is broken into 3 more specific interfaces:
		//// list: most similar to an array
		//// queue: its like a list but emphasises order of elements
		//// set: a list for holding data that doesn't have duplicates

		// maps are similar to collections but manage their contents

		// the collection interface extends the iterable interface
		// iterable classes work in tandem with the iterator classes

		// iterators are objects that aid in referencing elements
		// of a group of data (that implements iterable)

		// you can usually get an iterator by asking for it
		Iterator iB = b.iterator();

		// itterator is an interface for objects that impliment
		// their own way of parsing their group of data
	}

	// exceptions
	// exceptions can be thrown
	// exceptions can be caught but if they aren't they go up the call stack
	// if an exception isn't caught in the main function your program will stop
	// exceptions implement a throwable interface that describes this bubbling up
	// behavior
	// also in order to not run into compiler errors, methods that you want to throw
	// things
	// need to declare that they throw that thing.
	public static void example2() throws Exception {

		// to catch a throwable objects in a try catch block
		try {
			throw new Exception();
		} catch (NullPointerException e) {

		} catch (Exception e) {
			System.out.println("Exception: " + e);
			throw e;
		}
	}
	// you can catch multiple types of exceptions though they will be parsed in
	// order
	// so if a superclass is caught before a subclass the subclass case will never
	// run.

	// you can also implement your own exceptions by creating subclasses of existing
	// exception classes

	public static void example3() {
		// Strings
		// Strings are immutable
		// strings try to save space by living in the string pool
		// new string literals are checked against the strings in the string pool
		// so that if there are duplicates you just use a duplicate reference instead

		// you can force a new string by using the String constructor.
		String s = new String("g");
		String s2 = new String("g");
		System.out.println(s == s2); // false
		System.out.println(s.equals(s2)); // true
		String s3 = "g";
		System.out.println(s3 == s); // false
		System.out.println(s3.equals(s)); // true
		String s4 = "g";
		System.out.println(s3 == s4); // true
		System.out.println(s3.equals(s4)); // true
		String s5 = new String("g");
		System.out.println(s3 == s5); // false
		System.out.println(s3.equals(s5)); // true

		// StringBuilder (and the thread-safe alternative StringBuffer) are
		// used to mutibly manage String values

	}

	public static void example4() {
		// Testing
		// unit-testing is the process of breaking your program down
		// into units and then testing those units.
		// usually the units are on the order of methods

		// what do these tests look like then??
		// tests input some data and then check that the output matches expected outputs

		// JUnit is a popular unit testing api that we will be using
		// JUnit makes exstencive use of annotations to flag methods as test methods
		// it will then run all of those test methods when you ask it to

		// you need to add junit as one of maven's dependencies

		// junit also has methods (that usually start with assert)
		// that are used to actually evaluate weather or not the test was passed

		// there are some other usefull annotations to help with managing test code

		// you run your tests from the run as tab where you will be able to run junit
		// tests

	}
}
