package com.revature.doucette.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTester {

	@Test
	public void testCalculateAdd() {
		Assertions.assertEquals(16, Calculator.calculate("5+11"));// +

	}
	
	@Test
	public void testCalculateSub() {
		Assertions.assertEquals(0, Calculator.calculate("1-1"));// -
	}
	
	@Test
	public void testCalculateMul() {
		Assertions.assertEquals(10, Calculator.calculate("2*5"));// *
	}
	
	@Test
	public void testCalculateDiv() {
		Assertions.assertEquals(10, Calculator.calculate("100/10"));// /
		Assertions.assertThrows(ArithmeticException.class, () -> {
			Calculator.calculate("99/0");
		}); // /0
	}

	@Test
	public void testCalculateMod() {
		Assertions.assertEquals(5, Calculator.calculate("105%10"));// %
	}

}
