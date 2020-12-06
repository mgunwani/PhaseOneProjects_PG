package com.additional;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(101, "King", 23));
		list.add(new Person(102, "Gautam", 27));
		list.add(new Person(103, "John", 21));
		
		Collections.sort(list, new AgeComparator());
		
		for (Person person : list) {
			System.out.println(person);
		}
		
	}

}
