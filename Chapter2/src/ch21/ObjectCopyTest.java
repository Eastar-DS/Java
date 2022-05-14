package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("book1", "author!!");
		library[1] = new Book("book2", "author!!");
		library[2] = new Book("book3", "author!!");
		library[3] = new Book("book4", "author!!");
		library[4] = new Book("book5", "author!!");
		
//		æË¿∫∫πªÁ
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		±Ì¿∫∫πªÁ
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
