package spiel;

import java.util.Arrays;

public class Spielfeld {

	protected int b; 
	protected int h; 
	final static char empty = ' ';
	private char[][] Grid;

	public Spielfeld(int b, int h) {
		
		this.b = b; 
		this.h= h; 

		Grid = new char[b][h];

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
