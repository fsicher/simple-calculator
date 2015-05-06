package test.simple.calculator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import simple.calculator.Calculator;

public class TestSimpleCalculator {

	@Test
	public void testAdd() {

		int a = 10;
		int b = 20;
		int sum = a + b;

		assertTrue(sum == Calculator.add(a, b));
	}

	@Test
	public void testSub() {

		int a = 10;
		int b = 20;
		int dif = a - b;

		assertTrue(dif == Calculator.sub(a, b));
	}

	@Test
	public void testMul() {

		int a = 10;
		int b = 20;
		int prod = a * b;

		assertTrue(prod == Calculator.mul(a, b));
	}

	@Test
	public void testDiv() {

		int a = 10;
		int b = 20;
		double quo = (double) a / b;

		assertTrue(quo == Calculator.div(a, b));
	}

	@Test
	public void testPrimNumber() {

		List<Integer> l = Arrays.asList(3, 5, 7, 11, 17, 19, 37);

		for (int i : l) {
			assertTrue(Calculator.primNumber(i));
		}

		assertFalse(Calculator.primNumber(25));
	}

	@Test
	public void testFactorial() {

		assertTrue(Calculator.factorial(0) == 1);
		assertTrue(Calculator.factorial(1) == 1);
		assertTrue(Calculator.factorial(3) == 6);
		assertTrue(Calculator.factorial(5) == 120);

	}

}
