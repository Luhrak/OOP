package spiel;

public class Flotte {

	Schiff[] Schiffe = new Schiff[4];

	public Flotte() {

		for (int i = 0; i < this.Schiffe.length; i++) {

			this.Schiffe[i] = new Schiff((int) Math.random() * 9 + 1, (int) Math.random() * 7 + 1);
		}
	}

	public int Peilsender(int x, int y) {

		// für schiff (bekommt positionen x,y
		// schaue ob oben/unten/links/rechts/diagonal jede richtung schiff ist
		// für jeder der richtungen die positiv ausschlägt erhöhe um 1
		// return anzahl der gefundenen schiffe

		return 0;
	}

}
