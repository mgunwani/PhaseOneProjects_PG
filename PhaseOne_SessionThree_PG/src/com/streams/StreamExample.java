package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		// Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		// stream.forEach(p -> System.out.println(p));
		
		
		// Stream<Integer> stream = Stream.of( new Integer[] {1,2,3,4,5,6});
		// stream.forEach(p -> System.out.println(p));
		
		
		
		List<Integer> list = new ArrayList<Integer>(); 
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
		
		
	}

}
