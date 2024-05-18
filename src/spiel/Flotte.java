package spiel;

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

	}

	public int Peilsender(int x, int y) {

		int counter = 0;
		boolean hit = false;

		// Bei direktem hit soll 1 returned werden
		if (scanCoord(x, y)) {
			counter++;
			hit = true;
		}

		if (!hit) {

			int xUp = x;
			int xDown = x;
			int yUp = y;
			int yDown = y;
			boolean n = false, o = false, s = false, w = false, no = false, so = false, sw = false, nw = false;

			for (int j = 0; j < this.xMax || j < this.yMax; j++) {

				// Grade Richtungen

				if (!n && scanRichtung(x, yUp)) {
					counter++;
					n = true;
				}

				if (!o && scanRichtung(xUp, y)) {
					counter++;
					o = true;
				}

				if (!s && scanRichtung(x, yDown)) {
					counter++;
					s = true;
				}

				if (!w && scanRichtung(xDown, y)) {
					counter++;
					w = true;
				}

				// Diagonale Richtungen

				if (!no && scanRichtung(xUp, yUp)) {
					counter++;
					no = true;
				}

				if (!so && scanRichtung(xUp, yDown)) {
					counter++;
					so = true;
				}

				if (!sw && scanRichtung(xDown, yDown)) {
					counter++;
					sw = true;
				}

				if (!nw && scanRichtung(xDown, yUp)) {
					counter++;
					nw = true;
				}

				xUp++;
				yUp++;
				xDown--;
				yDown--;
			}

		}

		return counter;

		// schaue ob jeder richtung ein schiff ist (hat selbes x oder y value oder
		// [diagonal]
		// Zähle alle Schiffe die gefunden wurden
		// return anzahl der gefundenen schiffe

	}

	private boolean scanRichtung(int x, int y) {

		if (isInBounds(x, y)) {

			// ist shiff an xy
			if (scanCoord(x, y)) {
				return true;
			}
		}
		return false;
	}

	private boolean isInBounds(int x, int y) {

		if (x > 0 && y > 0 && x < this.xMax && y < this.yMax) {
			return true;
		}
		return false;
	}

	private boolean scanCoord(int x, int y) {

		for (int i = 0; i < this.Schiffe.length; i++) {
			if (this.Schiffe[i].getX() == x & this.Schiffe[i].getY() == y) {

				this.Schiffe[i].setGefunden();
				return true;
			}
		}
		return false;
	}

	public boolean istGewonnen() {

		for (int i = 0; i < Schiffe.length; i++) {

			if (!this.Schiffe[i].istGefunden()) {
				return false;
			}
		}
		return true;
	}

	public String get(int i) {

		return "(" + Schiffe[i].getX() + "/" + Schiffe[i].getY() + ")";
	}
}
