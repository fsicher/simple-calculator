package simple.calculator;

public class Calculator {

	/**
	 * Calculates the sum of a and b.
	 * 
	 * @param a
	 * @param b
	 * @return sum
	 */
	public static double add(double a, double b) {
		return a + b;
	}

	/**
	 * Calculates the difference of a and b.
	 * 
	 * @param a
	 * @param b
	 * @return difference
	 */
	public static double sub(double a, double b) {
		return a - b;
	}

	/**
	 * Calculates the product of a and b.
	 * 
	 * @param a
	 * @param b
	 * @return product
	 */
	public static double mul(double a, double b) {
		return a * b;
	}

	/**
	 * Calculates the quotient of a and b.
	 * 
	 * @param a
	 * @param b
	 * @return quotient
	 */
	public static double div(double a, double b) {

		/* b mustn't be zero */
		if (b != 0) {
			return a / b;
		} else {
			throw new IllegalArgumentException("divisor mustn't be zero");
		}
	}

}
