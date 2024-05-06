package lab0;

public class Aufgabe1u2 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;

		System.out.println(a + b);

		boolean grade = 0 == (a + b) % 2;

		if (grade) {
			System.out.println("Das Ergebnis ist grade.");
		} else {
			System.out.println("Das Ergebnis ist NICHT grade.");
		}
		
		// Challenge 
		System.out.println("Multipliziert ist das Ergebnis " + multiply(a, b) + ".");

	}

	private static int multiply(int a, int b) {
		int ergebnis = a * b;
		return ergebnis;
	}

}
