package spiel;

public class Koordinate {

	private int x; 
	private int y; 
	
	public Koordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Koordinate k2) {
		
		if (this.x == k2.x && this.y == k2.y) {
			return true;			
		} else { 
			return false;
		}
		
	}
	
	// Setter soll nicht verwendet werden 
	
	public int getX() {
		return this.x; 
	}
	public int getY() {
		return this.y; 
	}
	
}
