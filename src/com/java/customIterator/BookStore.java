package com.java.customIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookStore implements Iterable<Book> {
	
	List<Book> bookList = new ArrayList<Book>();
	int currIndex = 0;
	
	public void addBook(Book book){
		bookList.add(book);
	}

	@Override
	public Iterator<Book> iterator() {
	
		
		// TODO Auto-generated method stub
		return new Iterator<Book>() {

			@Override
			public boolean hasNext() {
				return (bookList.size() > currIndex);
			}

			@Override
			public Book next() {
				return bookList.get(currIndex++);
			}
		};
	}
	
	
	public static void main(String args[]){
		
		BookStore bs = new BookStore();
		bs.addBook(new Book("1", "math"));
		bs.addBook(new Book("2", "phy"));
		bs.addBook(new Book("3", "chem"));
		bs.addBook(new Book("4", "biology"));
		
//		for (Book book : bs) {
//			System.out.println(book.toString());
//		}
		
		Iterator<Book> it = bs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		
	}

}
