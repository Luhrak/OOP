package spiel;

public class Bermuda implements Brettspiel {

	private int breite; 
	private int hoehe; 
	
	Bermuda(int x, int y) {
		this.breite = x; 
		this.hoehe = y;
	}
	
	@Override
	public int getHoehe() {
		return hoehe;
	}

	@Override
	public int getBreite() {
		return breite;
	}

	@Override
	public boolean istEnde() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean istGewonnen() {
		// TODO Auto-generated method stub
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
