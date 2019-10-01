package com.smoothstack.LMS.entity;

public class Book {

	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
		
	public Book(String bookName, String bookAuthor, String bookPublisher)
	{
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String publisher) {
		this.bookPublisher = publisher;
	}
	 @Override
	    public String toString() {
	        return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor
	                + ", bookPublisher=" + bookPublisher + "]";
	 }
}
