package com.chimene.calculator;

import java.util.ArrayList;

public class Calculator {

	public Calculator() {
		
	}
	
	public int calculate(String s) {
		int index = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<String> ops = new ArrayList<String>();

		for(int i=0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				nums.add(Integer.parseInt(s.substring(index, i)));
				System.out.println(nums.get(nums.size()-1));
				ops.add(s.substring(i,i+1));
				System.out.println(ops.get(ops.size()-1));
				index = i + 1;
			}
		}
		
		nums.add(Integer.parseInt(s.substring(index)));
		
		for(int i=0; i < ops.size(); i++) {
			if(ops.get(i).equals("*")) {
				nums.set(i, nums.get(i).intValue() * nums.get(i+1).intValue());
				nums.remove(i+1);
				ops.remove(i);
			}
			else if(ops.get(i).equals("/")) {
				nums.set(i, nums.get(i).intValue() / nums.get(i+1).intValue());
				nums.remove(i+1);
				ops.remove(i);
			}
			else if(ops.get(i).equals("%")) {
				nums.set(i, nums.get(i).intValue() % nums.get(i+1).intValue());
				nums.remove(i+1);
				ops.remove(i);
			}
		}
		
		for(int i=0; i< ops.size(); i++) {
			if(ops.get(i).equals("+")) {
				nums.set(i, nums.get(i).intValue() + nums.get(i+1).intValue());
				nums.remove(i+1);
				ops.remove(i);
			}
			else {
				nums.set(i, nums.get(i).intValue() - nums.get(i+1).intValue());
				nums.remove(i+1);
				ops.remove(i);
			}
		}
		
		return nums.get(0);
	}
}
