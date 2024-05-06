package spiel;

public class Flotte {

	Schiff[] Schiffe = new Schiff[4];

	public Flotte() {

		for (int i = 0; i < this.Schiffe.length; i++) {

			// 9 & 7 sollten Variablen sein von Bermuda aka Spielfeld size 
			this.Schiffe[i] = new Schiff((int)(Math.random() * 9), (int)(Math.random() * 7));
		}
	} 

	public int Peilsender(int x, int y) {

		// für schiff an posi. x y  
		// schaue ob jeder richtung ein schiff ist (hat selbes x oder y value oder [diagonal] 
		// Zähle alle Schiffe die gefunden wurden 
		// return anzahl der gefundenen schiffe

		return 0;
	}

}
