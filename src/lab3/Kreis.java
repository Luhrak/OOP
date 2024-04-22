package lab3;

public class Kreis extends Form {

	int radius;
	
	@Override 
	public void zeiche() {
	System.out.println(formName + " hat einen Radius von " + radius);
	}

	public Kreis(String n, int r) {
		super(n); 
		radius = r;
	}
}
