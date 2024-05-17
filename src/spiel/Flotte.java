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

			} while (before > after);

			Schiffe[i] = new Schiff(x, y);
		}

	}

	public int Peilsender(int x, int y) {

		int counter = 0;
		boolean hit = false;

		if (scanCoord(x, y)) {
			counter++;
			hit = true;
		}

		if (!hit) {

			for (Schiff schiff : this.Schiffe) {

				if (schiff.getX() == x) {
					counter++;
				}

				if (schiff.getY() == y) {
					counter++;
				}
			}

			int xUp = x;
			int xDown = x;
			int yUp = y;
			int yDown = y;

			for (int j = 0; j < this.xMax || j < this.yMax; j++) {

				counter += scanRichtung(xDown, yDown);
				
				counter += scanRichtung(xUp, yDown);
				
				counter += scanRichtung(xDown, yUp);
				
				counter += scanRichtung(xUp, yUp);
				
				
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

	private int scanRichtung(int x, int y) {

		if (isInBounds(x, y)) {

			// ist shiff an xy
			if (scanCoord(x, y)) {
				return 1;
			}
		}
		return 0;
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
