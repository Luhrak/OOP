package lab5;

public class Runner implements Runnable {

	int ziel = 100;
	String name;

	public Runner(String name) {
		this.name = name;
	}

	@Override
	public void run() { // run is wie main für threads :)

		for (int m = 0; m <= ziel; m += 10) {

			System.out.println(name + " ist " + m + " Meter weit.");

		}

	}

}
