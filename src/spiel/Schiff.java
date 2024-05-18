package spiel;

public class Schiff extends Koordinate {

	private boolean entdeckt;

	public Schiff(int x, int y) {
		super(x, y);
		entdeckt = false;
	}

	public void setGefunden() {
		this.entdeckt = true;
	}

	public boolean istGefunden() {
		return this.entdeckt;
	}

	public String printCoord() {
		return "(" + this.getX() + "/" + this.getY() + ")";
	}
}
