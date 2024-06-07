package spiel;

import java.util.Arrays;

public class Spielfeld {

	protected int b; 
	protected int h; 
	final static char empty = ' ';
	private char[][] Grid;

	public Spielfeld(int b, int h) {
		
		this.b = b; 
		this.h = h; 

		// bei char array muss h und b vertauscht sein also: 
		Grid = new char[h][b];

		for (char[] row : Grid) {
			Arrays.fill(row, empty);
		}

	}

	public void set(int x, int y, char update) {

		this.Grid[y][x] = update;
	}

	public char get(int x, int y) {

		return this.Grid[y][x];
	}

}
