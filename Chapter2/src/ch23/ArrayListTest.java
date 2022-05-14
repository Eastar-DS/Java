package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

//		ArrayList<Book> library = new ArrayList<Book>();
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("book1", "author!!!"));
		library.add(new Book("book2", "author!!!"));
		library.add(new Book("book3", "author!!!"));
		library.add(new Book("book4", "author!!!"));
		
		for(int i=0; i<library.size();i++) {
			library.get(i).showInfo();
		}
	}

}
