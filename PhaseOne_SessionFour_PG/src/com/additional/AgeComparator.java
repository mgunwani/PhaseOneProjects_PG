package com.additional;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.Age == p2.Age)
			return 0;
		else if (p1.Age > p2.Age)
			return 1;
		else 
			return -1;
	}

	
	
}
