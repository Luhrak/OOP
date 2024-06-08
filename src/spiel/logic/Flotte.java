package spiel.logic;

import java.util.HashSet;
import java.util.Set;

public class Flotte {

	public Schiff[] Schiffe;
	private int xMax;
	private int yMax;

	public Flotte(int anzahl, int xMax, int yMax) {

		Schiffe = new Schiff[anzahl];
		this.xMax = xMax;
		this.yMax = yMax;

		Set<Integer> posi = new HashSet<Integer>();

		int x = 1;
		int y = 1;
		int before = 0;
		int after = 0;

		for (int i = 0; i < anzahl; i++) {

			do {

				x = ((int) (Math.random() * xMax));
				y = ((int) (Math.random() * yMax));

				before = posi.size();
				posi.add(x * 100 + y);
				after = posi.size();

			} while (before == after);

			Schiffe[i] = new Schiff(x, y);
		}

		// CHEAT show ships at beginning 
//		for (int i = 0; i < 4; i++) {
//			System.out.println(SchiffAtToString(i));
//		}
	}

	public char Peilsender(int x, int y) {

		// Bei direktem hit soll 1 returned werden
		if (scanCoord(x, y) != -1) {
			this.Schiffe[scanCoord(x,y)].setGefunden();
			return 'X';
		}

		// Ansonsten scane in alle 8 Himmelsrichtungen
		// Incrementiere alle direkt um 1 weil an mittelposition ist ja nichts 
		int counter = 0;
		int xUp = x+1;
		int xDown = x-1;
		int yUp = y-1;
		int yDown = y+1;

		// bool damit verdeckte Schiffe nicht mitberechnet werden
		boolean n = false, o = false, s = false, w = false, no = false, so = false, sw = false, nw = false;

		for (int j = 0; j < this.xMax || j < this.yMax; j++) {

			// Grade Richtungen

			if (!n && scanCoord(x, yUp) != -1) { 
				counter++;
				n = true;
				// hitPrint(x,yUp);
			}

			if (!o && scanCoord(xUp, y) != -1) {
				counter++;
				o = true;
				// hitPrint(xUp,y);
			}

			if (!s && scanCoord(x, yDown) != -1) {
				counter++;
				s = true;
				// hitPrint(x,yDown);
			}

			if (!w && scanCoord(xDown, y) != -1) {
				counter++;
				w = true;
				// hitPrint(xDown,y);
			}

			// Diagonale Richtungen

			if (!no && scanCoord(xUp, yUp) != -1) {
				counter++;
				no = true;
				// hitPrint(xUp,yUp);
			}

			if (!so && scanCoord(xUp, yDown) != -1) {
				counter++;
				so = true;
				// hitPrint(xUp,yDown);
			}

			if (!sw && scanCoord(xDown, yDown) != -1) {
				counter++;
				sw = true;
				// hitPrint(xDown,yDown);
			}

			if (!nw && scanCoord(xDown, yUp) != -1) {
				counter++;
				nw = true;
				// hitPrint(xDown,yUp);
			}

			// up is north, down is south, so y is reverse here 
			xUp++;
			yUp--;
			xDown--;
			yDown++;
		}

		char c = Integer.toString(counter).charAt(0);
		return c;

	}

	private void hitPrint(int x, int y) {
		System.out.println("hit @ " + (char)('a'+x) + "/" + (y+1));
		
	}

	private boolean isInBounds(int x, int y) {

		if (x >= 0 && y >= 0 && x < this.xMax && y < this.yMax) {
			return true;
		}
		return false;
	}

	private int scanCoord(int x, int y) {
		// Returns found ship index if coord contains a ship (and is in bounds) else 0

		for (int i = 0; i < this.Schiffe.length; i++) {

			if (isInBounds(x, y)) {

				if (this.Schiffe[i].getX() == x && this.Schiffe[i].getY() == y) {

					// this.Schiffe[i].setGefunden();
					return i;
				}
			}
		}
		return -1;
	}

	public boolean istGewonnen() {

		for (int i = 0; i < Schiffe.length; i++) {

			if (!this.Schiffe[i].istGefunden()) {
				return false;
			}
		}
		return true;
	}

	public String SchiffAtToString(int i) {

		char x = (char) (Schiffe[i].getX() + 'A');
		char y = (char) (Schiffe[i].getY() + '1');

		return "(" + x + "/" + y + ")";
//		int x = (int) (s.charAt(0) - 'A');
//		int y = (int) (s.charAt(1) - '1');
	}
}
