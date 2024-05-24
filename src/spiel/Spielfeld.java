package spiel;

import java.util.Arrays;

public class Spielfeld {

	protected int breite; 
	protected int hoehe; 
	static char empty = '+';
	private char[][] Grid;

	public Spielfeld(int breite, int hoehe) {

		Grid = new char[breite][hoehe];

		for (char[] row : Grid) {
			Arrays.fill(row, empty);
		}

	}

	public void set(int x, int y, char update) {

		this.Grid[x][y] = update;
	}

	public char get(int x, int y) {

		return this.Grid[x][y];
	}

}
