package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Aufgabe 1 Test 
		
		GenericBox<Rechteck> rechteckBox = new GenericBox(2);

		rechteckBox.add(new Rechteck("eins"));
		rechteckBox.add(new Rechteck("zwei"));

		System.out.println(rechteckBox.getItem(0));
		System.out.println(rechteckBox.getItem(1));

		GenericBox<Kreis> kreisBox = new GenericBox(1);

		kreisBox.add(new Kreis("kleiner Kreis"));
		System.out.println(kreisBox.getItem(0));
		
		
		
		// Aufgabe 2
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		System.out.println("Vor dem Vertauschen: " + names);
		swap(names, 0, 2);
		System.out.println("Nach dem Vertauschen: " + names);
		
	}

	private static <T> void swap(List<T> list, int i, int j) {
		
		T remb_i = list.get(i); 
		T remb_j = list.get(j); 
		
		list.set(j, remb_i); // could also work with list.get(j)
		list.set(i, remb_j);
		
		
	}

}
