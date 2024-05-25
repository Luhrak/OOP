package spiel;

public class Bermuda extends Spielfeld implements Brettspiel {

	Flotte flotte;

	Bermuda(int anzahl, int breite, int hoehe) {
		super(breite, hoehe);

		flotte = new Flotte(anzahl, this.breite, this.hoehe);

	}

	@Override
	public int getHoehe() {
		return super.hoehe;
	}

	@Override
	public int getBreite() {
		return this.breite;
	}

	@Override
	public boolean istEnde() {
		return istGewonnen();
	}

	@Override
	public boolean istGewonnen() {
		return flotte.istGewonnen();
	}

	@Override
	public char getFeld(int x, int y) {
		return super.get(x, y);
	}

	@Override
	public void waehle(int x, int y) {
		
		if (x < 0 || x >= this.breite || y < 0 || y >= this.hoehe) {
			
			System.err.println("Input out of bounds.");
			
		} else { 
			
			this.set(x, y, flotte.Peilsender(x, y));
			
		}

	}

}
