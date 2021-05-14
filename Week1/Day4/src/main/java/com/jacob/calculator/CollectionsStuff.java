package com.jacob.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionsStuff {
	
	public static void run() {
		int[] a = {1, 2, 3};
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.length; ++i) {
			b.add(a[i]);
		}

		HashMap<String, Integer> c = new HashMap<String, Integer>();
		c.put("Some Name", 5);
		c.get("Some Name");
		c.put("Some Name", 6);
		Set<String> keys = c.keySet();
		
		Iterator<Integer> it = b.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
