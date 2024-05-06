package lab2;

public class Main {

	public static void main(String[] args) {

		Hund Max = new Hund(2, true);
		Tier.machLaut(); 

		
		/////////////////////
		
		
		Form[] formSammlung = new Form[3];
		
		formSammlung[0] = new Kreis("K1", 5);
		formSammlung[1] = new Kreis("K2", 2);
		formSammlung[2] = new Rechteck("R1", 3, 6);
		
		for(int i = 0; i < formSammlung.length; i++) {
			formSammlung[i].zeiche();
		}
		
	}

}
