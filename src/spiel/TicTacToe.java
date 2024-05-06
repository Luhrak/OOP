package spiel;

import java.util.Random;

public class TicTacToe implements Brettspiel {
	static char EMPTY = '.';
	private int x, y;

	private char[][] feld;

	public TicTacToe(int x, int y) {
		this.x = x;
		this.y = y;
		feld = new char[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				feld[i][j] = EMPTY;
			}
		}
	}

	@Override
	public int getHoehe() {
		return y;
	}

	@Override
	public int getBreite() {
		return x;
	}

	@Override
	public boolean istEnde() {
		int zahlFreierFelder = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (feld[i][j] == EMPTY) {
					zahlFreierFelder++;
				}
			}
		}
		return zahlFreierFelder == 0;
	}

	@Override
	public char getFeld(int x, int y) {
		return feld[x][y];
	}

@Override
public void waehle(int x, int y) {
Random zufall = new Random();

if (feld[x][y] == EMPTY) {
feld[x][y] = 'X';
if (!istEnde()) {
boolean posGefunden = false;
do {
int compx = zufall.nextInt(this.x);
int compy = zufall.nextInt(this.x);
if (feld[compx][compy] == EMPTY) {
feld[compx][compy] = 'O';
posGefunden = true;
}
} while (!posGefunden);
}
}
}

	@Override
	public boolean istGewonnen() {
// das wird hier als Challenge offengelassen
		return false;
	}
}