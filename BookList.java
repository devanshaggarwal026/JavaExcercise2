package co.robomq.BookAssignment;

import java.util.ArrayList;
import java.util.*;
public class BookList {
	
	public static void main(String args[]) {
		
	ArrayList<Book> a = new ArrayList<Book>();
	
	a.add(new Book(108 , 2 , "d" , "g" , "aggarwal"));
	a.add(new Book(101 , 6 , "p" , "x" , "sharma"));
	a.add(new Book(109 , 26 , "y" , "f" , "rai"));
	a.add(new Book(104 , 1, "a" , "a" , "kumawat"));
	a.add(new Book(102 , 7 , "s" , "b" , "jain"));
	
	System.out.println("Iterating over the list");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value by which you want to sort 1. id   2. quantity 3. name 4.author 5.publisher");
	
	int val = sc.nextInt();
	
	
	if (val==1){
	SortByid s = new SortByid();
	a.sort(s);
	System.out.println(a);
	}
	
	else if (val == 2) {
	SortByquantity s1 = new SortByquantity();
	a.sort(s1);
	System.out.println(a);
	}
	
	else if (val == 3) {
	SortByname s2 = new SortByname();
	a.sort(s2);
	System.out.println(a);
	}
	
	else if (val == 4) {
	SortByauthor s3 = new SortByauthor();
	a.sort(s3);
	System.out.println(a);
	}
	
	else {
	SortBypublisher s4 = new SortBypublisher();
	a.sort(s4);
	System.out.println(a);
	}
	
	}
}