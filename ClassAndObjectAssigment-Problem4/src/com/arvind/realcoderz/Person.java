package com.arvind.realcoderz;

public class Person{
	
	private String firstName;
	private String lastName;

	public Person() {
		System.out.println("Person.Person()");
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
}