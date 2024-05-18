package spiel;

public class ownTestMain {

	public static void main(String[] args) {
		final int ANZAHL = 5;
		final int X = 9;
		final int Y = 7;
		Flotte flotte = new Flotte(ANZAHL, X, Y);

		// Nimm 100 Flotten "Messpunkte" auf
		for (int i = 0; i < 100; i++) {
			System.out.println("Test #" + i);
			flotte = new Flotte(ANZAHL, X, Y);
			
			// Vergleiche jegliche kombination mitenander
			// Diese Methode ist die schnellste und vermeidet dabei selbst kollision
			for (int schiffId = 0; schiffId < ANZAHL; schiffId++) {
				for (int schiffVgl = schiffId + 1; schiffVgl < ANZAHL; schiffVgl++) {
					Schiff s1 = flotte.Schiffe[schiffId];
					Schiff s2 = flotte.Schiffe[schiffVgl];
					if (s1.equals(s2)) {
						System.out.println("FAIL " + s1.printCoord() + s2.printCoord());
						System.out.println(s1.hashCode() + " : " + s2.hashCode());
						System.exit(0);
					}
				}
			}
		}
		System.out.println("Passed.");
		
		/*
		 *    A B C D E F G H I
		 * 1  X              
		 * 2                 
		 * 3            X    
		 * 4              X  
		 * 5              X  
		 * 6                 
		 * 7      X          
		 
		 * = Treffer
		 ~ = Scanned
		 X = Schiff
		 + = Ursprung d. Scans
 
		 * A B C D E F G H I
		 * 1 X       ~   ~  
		 * 2           ~ ~ ~
		 * 3           * + ~
		 * 4           ~ * ~
		 * 5         ~   X  
		 * 6       ~        
		 * 7     *          
		 */
		
		
		Schiff newSchiffe[] = {
				new Schiff(1, 0),
				new Schiff(3, 6),
				new Schiff(6, 2),
				new Schiff(7, 3),
				new Schiff(7, 4)
		};
		
		flotte.Schiffe = newSchiffe;

		System.out.println(flotte.Peilsender(7, 3));
		
		return;
		
	}
}
