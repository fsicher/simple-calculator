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

	/**
	 * Checks if the given number is a prim number.
	 * 
	 * @param number
	 * @return
	 */
	public static boolean primNumber(long number) {

		for (long i = 2; i <= (long) Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Calculates factorial for the given number. The allowed number range is: 0
	 * <= n <= 19
	 * 
	 * @param n
	 * @return factorial
	 */
	public static int factorial(int n) {

		if (n >= 0 && n < 19) {

			if (n == 0 || n == 1) {
				return 1;
			} else {
				int fact = 1;

				for (int i = 1; i <= n; i++) {
					fact *= i;
				}

				return fact;
			}

		} else {
			throw new IllegalArgumentException("Allowed Range: 0 <= n <= 19");
		}
	}

}
