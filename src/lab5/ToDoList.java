package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {

		ArrayList<String> todo = new ArrayList<String>();
		todo.add("Example Task 1");
		todo.add("Example Task 2");
		printTodo(todo);

		boolean appRunning = true;
		while (appRunning) {

			boolean choosing = true;
			while (choosing) {

				choosing = true;
				System.out.println("Press [1] to add an item, [2] to remove an item, [3] to quit");

				switch (getInput()) {
				case "1":
					System.out.println("Type out your todo.");
					todo.add(getInput());
					choosing = false;
					break;
				case "2":
					System.out.println("Type the position number of the item you want to delete");
					boolean typingNumber = true;

					while (typingNumber) {
						String input = getInput();

						if (isNumeric(input)) {
							typingNumber = false;
							todo.remove(Integer.parseInt(input) - 1);

						}

					}
					break;

				case "3":
					appRunning = false;
					choosing = false;
					break;

				default:
					System.err.println("Invalid input");
				}

				if (appRunning) {
					printTodo(todo);
				}

			}
		}

	}

	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static void printTodo(ArrayList<String> todo) {

		System.out.println();
		for (int i = 0; i < todo.size(); i++)
			System.out.println(i + 1 + ". " + todo.get(i));

		System.out.println();
	}

	private static String getInput() {

		Scanner in = new Scanner(System.in);

		return in.next().strip();
	}
}