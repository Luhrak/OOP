package spiel;

public class Bermuda extends Spielfeld implements Brettspiel {

	Bermuda(int breite, int hoehe) {
		super(breite, hoehe);
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

		
		
		return false;
	}

	@Override
	public char getFeld(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void waehle(int x, int y) {
		// TODO Auto-generated method stub

	}

}
