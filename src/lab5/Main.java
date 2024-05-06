package lab5;

public class Main {

	public static void main(String[] args) {

		
		// -- Aufgabe 2
		
		
		ConfigManager manager = ConfigManager.getInstance();

		int zahl = 5;
		int zahl2;

		manager.setValue(zahl);
		zahl2 = manager.getValue();

		System.out.println(zahl2 == zahl);
		
		
		
		// -- Aufgabe 3
		
		Runner r1 = new Runner("Tom");
		Runner r2 = new Runner("Mike"); 
		
		Thread thread = new Thread(r1); 
		thread.start();
		thread = new Thread(r2);
		thread.start();

	}

}
