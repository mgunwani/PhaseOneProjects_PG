package com.additional;

public class Person {
	
	int Id;
	String Name;
	int Age;
	
	public Person(int Id, String Name, int Age) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Age = Age;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Name=" + Name + ", Age=" + Age + "]";
	}
	
	

}
