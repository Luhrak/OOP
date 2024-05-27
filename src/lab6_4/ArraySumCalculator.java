package lab6_4;

public class ArraySumCalculator {

	public static void main(String[] args) {
		ArraySumCalculator calculator = new ArraySumCalculator();
		int[] numbers = { 1, 2, 3, 4, 5 }; // Erwartete Summe ist 15
		int result = calculator.sumArray(numbers);
		System.out.println("Die Summe des Arrays ist: " + result);
	}

	public int sumArray(int[] Zahlen) {
		int sum = 0;
		for (int i = 0; i < Zahlen.length; i++) {
			sum += Zahlen[i];
		}
		return sum;
	}

}