package lab1;

public class Book {

	String title;
	String author;
	boolean isRead;
	int ISBN;
	
	
//	public class Roman {
//
//		String lang;
//		int pageCount;
//	}
//	
//	
//	public class Comicbook {
//	
//		String artstyle;
//		int imgCount;
//	}

	
	
	public void displayDetails() {
		System.out.println("Der Titel ist " + title);
		System.out.println("von " + author);
		System.out.println("Gelesen? " + isRead);
		System.out.println();
	}
	
}
