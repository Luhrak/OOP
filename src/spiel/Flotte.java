package spiel;

import java.util.HashSet;
import java.util.Set;

public class Flotte {

	public Schiff[] Schiffe;
	

	public Flotte(int anzahl) { // import spielfeld höche & breite 
		
		Schiffe = new Schiff[anzahl];
		Set<Integer> posi = new HashSet<Integer>();
		
		int x = 1; 
		int y = 1; 
		int before = 0;
		int after = 0;
		
		for (int i = 0; i < anzahl; i++) {
			
			do { 
				
				// switch out 9 and 7 to be variables from Bermuda class 
				x = ((int) (Math.random() * 9)); 
				y = ((int) (Math.random() * 7)); 
				
				before = posi.size(); 
				posi.add(x*100 + y);
				after = posi.size(); 
				
			} while (before > after); 
			
			Schiffe[i] = new Schiff (x,y);
		}
		
	}


	public int Peilsender(int x, int y) {

		int counter = 0; 
		
		for (int i = 0; i < this.Schiffe.length; i++) {
			
			if (this.Schiffe[i].x == x) {
				counter++; 
			}
			
			if (this.Schiffe[i].y == y) {
				counter++; 
			}
			
		}
		
		return counter; 
	
		// schaue ob jeder richtung ein schiff ist (hat selbes x oder y value oder
		// [diagonal]
		// Zähle alle Schiffe die gefunden wurden
		// return anzahl der gefundenen schiffe

	}

}
