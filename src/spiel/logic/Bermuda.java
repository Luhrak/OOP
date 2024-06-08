package spiel.logic;

public class Bermuda extends Spielfeld implements Brettspiel {

	Flotte flotte;

	public Bermuda(int anzahl, int b, int h) {
		super(b, h);

		flotte = new Flotte(anzahl, this.b, this.h);

		
		// CHEAT show where ships are
//		for (int i = 0; i<flotte.Schiffe.length; i++) {	
//			this.set(flotte.Schiffe[i].getX(), flotte.Schiffe[i].getY(), '+');
//		}
	}

	@Override
	public int getHoehe() {
		return super.h;
	}

	@Override
	public int getBreite() {
		return this.b;
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

		if (x < 0 || x >= this.b || y < 0 || y >= this.h) {

			System.err.println("Input out of bounds.");

		} else {

			this.set(x, y, flotte.Peilsender(x, y));
			
			
			// CHEAT show ship hits 
//			for (Schiff i : flotte.Schiffe) {
//				System.out.println(i.istGefunden());
//			}
			
		}

	}

}
