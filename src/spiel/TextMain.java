package spiel;

import java.util.Scanner;

public class TextMain {

	public static void main(String[] args) {
		Brettspiel spiel = new Bermuda(9, 7);
		
		// TESTING 
		Flotte test = new Flotte(4, 9, 7);
		System.out.println(test.Peilsender(1, 1)); 
		// TESTING 
		
		Scanner input = new Scanner(System.in);
		zeigeSpielfeld(spiel);

		do {

			// ------ Spielereingabe ------
			System.out.println("Koordinate eingeben zwischen A1 und " + (char) ('A' + spiel.getBreite())
					+ (char) ('1' + spiel.getHoehe()));
			String s = input.nextLine();
			int x = (int) (s.charAt(0) - 'A');
			int y = (int) (s.charAt(1) - '1');
			spiel.waehle(x, y);
			zeigeSpielfeld(spiel);
		} while (!spiel.istEnde());

		if (spiel.istGewonnen()) {
			System.out.println("Herzlichen Glückwunsch!");
		}
	}

	private static void zeigeSpielfeld(Brettspiel spiel) {
		System.out.print(" ");
		for (int x = 0; x < spiel.getBreite(); x++) {
			System.out.print(" " + (char) ('A' + x));
		}
		System.out.println();
		for (int y = 0; y < spiel.getHoehe(); y++) {
			System.out.print(" " + (y + 1) + " ");
			for (int x = 0; x < spiel.getBreite(); x++) {
				System.out.print(" " + spiel.getFeld(x, y));
			}
			System.out.println();
			
		}

	}
}