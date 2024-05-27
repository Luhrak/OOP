package lab6_4;

import java.util.Scanner;

public class divide_execpt {

	public static void main(String[] args) {

		int num1, num2;

		num1 = getUserInt();
		num2 = getUserInt();

		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.err.println("You cant divide by zero.");
		}

	}

	private static int getUserInt() {
		Scanner in = new Scanner(System.in);

		while (!in.hasNextInt()) {
			System.err.println("Has to be a natural number.");
			in.next();
		}
		int input = in.nextInt();

		return input;
	}

}
