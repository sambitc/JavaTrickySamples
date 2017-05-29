package com.java.customIterator;

public class Book {
	String id;
	String bookName;
	
	

	public Book(String id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + "]";
	}

	
}
