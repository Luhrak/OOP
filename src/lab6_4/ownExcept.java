package lab6_4;

import java.util.Scanner;

public class ownExcept {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean runs = true;
		String input;

		while (runs) {

			try {
				input = in.nextLine();

				if (input.equals("error")) {
					throw new InvalidInputException("error");
				} else {
					System.out.println("ok");
				}

			} catch (InvalidInputException err) {
				System.out.println("error!");
			}
		}

	}

}
