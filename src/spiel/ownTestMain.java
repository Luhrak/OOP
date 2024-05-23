package spiel;

public class ownTestMain {

	public static void main(String[] args) {
		final int ANZAHL = 10;
		final int X = 9;
		final int Y = 7;
		Flotte flotte = new Flotte(ANZAHL, X, Y);

		for (int i = 0; i < ANZAHL; i++) {
			System.out.println(flotte.SchiffAtToString(i));
		}

		System.out.println(flotte.Peilsender(1, 1));

		Spielfeld feld = new Spielfeld(9, 7);
		feld.set(2, 3, 'X');

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 7; j++) {

				System.out.print(feld.get(i, j));
			}
			System.out.println();
		}

	}

}
