package com.inheritance.pill;

import com.inheritance.bill.Author;
import com.inheritance.bill.Book;

public class TestBook {

	public static void main(String[] args) {
		System.out.println("welcome to java world");
		System.out.println("**************");
		Author a1 =new Author("Suraj","suraj123@gmail.com");
		System.out.println(a1);
		System.out.println("**************");
		Book b1=new Book("121b-212a","new world",a1,240.0,3);
		System.out.println("\n");
		System.out.println(b1);
		System.out.println("**************");
		
	}
}
