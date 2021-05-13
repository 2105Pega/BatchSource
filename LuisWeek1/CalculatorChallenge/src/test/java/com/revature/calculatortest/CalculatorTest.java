package com.revature.calculatortest;
import org.junit.jupiter.api.*;

import com.revature.calculator.*;

public class CalculatorTest {
	
	@Test
	public void sumTest() {
		Assertions.assertEquals(5, Calculator.calculate("2 + 3"));	
	}
	@Test
	public void subtractTest() {
		Assertions.assertEquals(3, Calculator.calculate("6 - 3"));
	}
	@Test
	public void multiplyTest() {
		Assertions.assertEquals(5, Calculator.calculate("5 * 1"));
	}
	@Test
	public void divideTest() {
		Assertions.assertEquals(4, Calculator.calculate("16/4 "));
	}
	@Test
	public void moduloTest() {
		Assertions.assertEquals(3, Calculator.calculate("7%4"));
	}
}
