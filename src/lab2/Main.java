package lab2;
public class Main {

	public static void main(String[] args) {
		
		
		Book b1 = new Book();
		// Book.Roman r1 = b1.new Roman();
		b1.title = "Warrior Cats";
		b1.author = "Errin Hunter";
		b1.isRead = true;
		b1.ISBN = 1;
		// b1.r1.lang = "deutsch";
		// b1.r1.pageCount = 100;
		b1.displayDetails();
		
		Book b2 = new Book();
		b2.title = "Selbstbild";
		b2.author = "Carol Dweck";
		b2.isRead = true;
		b2.ISBN = 2;
		
		Book b3 = new Book();
		b3.title = "Harry Potter";
		b3.author = "JK Rolling";
		b3.isRead = false;
		b3.ISBN = 3;
		
		
		}
		

	
}
