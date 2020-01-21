package co.robomq.BookAssignment;
import java.util.Comparator;


public class SortByid implements Comparator<Book> {
	
		public int compare(Book b1 , Book b2) {
			int val1 = b1.getId();
			int val2 = b2.getId();
		
		
		int v = val1 - val2;
		return v;
		
		}
}
