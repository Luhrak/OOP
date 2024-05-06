package lab2;

public class Rechteck extends Form {

	int breit; 
	int hoch;
	
	@Override 
	public void zeiche() {
		System.out.println(formName + " hat eine Höhe von " + hoch + " und eine Breite von " + breit);
		super.zeiche(); //ruft die ursprüngle methode aus der parent class auf 
	}
	
	public Rechteck(String n, int b, int h) {
		super(n);
		int breit = b;
		int hoch = h;
	}
	
	
}
