package lab6;

public class Main {

	public static void main(String[] args) {

		ConfigManager name = new ConfigManager.getInstance(); 
		
		
		int zahl = 5;
		int zahl2;
		
		ConfigManager.setValue(zahl);
		zahl2 = ConfigManager.getValue();

	}

}
