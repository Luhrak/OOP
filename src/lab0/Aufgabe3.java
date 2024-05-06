package lab0;

public class Aufgabe3 {
	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5 };

		int a = 0;
		for (int i = 0; i < numbers.length; i++) {
			a = a + numbers[i];
		}
		float durch = (a / numbers.length);

		System.out.println("Der Durchschnitt beträgt " + durch);

	}
}
