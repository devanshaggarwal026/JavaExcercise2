package co.robomq.BookAssignment;

import java.util.Comparator;

public class SortByquantity implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int v1 = o1.getQuantity();
		int v2 = o2.getQuantity();
		
		int val = v1-v2;
		return val;
	}
	
}
