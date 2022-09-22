package com.inheritance.bill;

public class Author {
	private String name;
	private String email;
	
	public Author(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;  
	}

	@Override
	public String toString() {
		return "Author \n name=" + name + ",\n email=" + email + " ";
	}

}

