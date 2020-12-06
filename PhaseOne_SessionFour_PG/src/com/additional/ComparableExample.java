package com.additional;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "King", 23));
		list.add(new Employee(102, "Gautam", 27));
		list.add(new Employee(103, "John", 21));
		
		Collections.sort(list);
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}
	
	

}
