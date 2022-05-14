package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("book1", "author!!");
		library[1] = new Book("book2", "author!!");
		library[2] = new Book("book3", "author!!");
		library[3] = new Book("book4", "author!!");
		library[4] = new Book("book5", "author!!");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
