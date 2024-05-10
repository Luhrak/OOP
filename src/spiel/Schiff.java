package spiel;

public class Schiff extends Koordinate {

	private boolean entdeckt = false; 
	
	public Schiff(int x, int y) {
		super(x, y);
	}

	public void setGefunden() {
		this.entdeckt = true; 
	}
	
	public boolean istGefunden() {
		return this.entdeckt; 
	}
	
}
