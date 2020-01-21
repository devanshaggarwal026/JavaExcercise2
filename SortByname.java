package co.robomq.BookAssignment;

import java.util.Comparator;

public class SortByname implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		String v1 = o1.getName();
		String v2 = o2.getName();
		
		int v = v1.compareTo(v2);
		return v;
	}
	
	
}
