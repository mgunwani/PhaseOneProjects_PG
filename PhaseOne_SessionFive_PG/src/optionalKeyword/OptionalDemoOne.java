package optionalKeyword;

import java.util.Optional;

public class OptionalDemoOne {
	
	public static void main(String[] args) {
		
		/**
		 * Optional is introduced in Java 8.
		 * Optional helps us to deal with NullPointerException in Java.
		 */
		
		// String[] names = new String[5];
		// System.out.println(names[3]);
		// String modifiedName = names[3].toUpperCase();
		// System.out.println(modifiedName);
		
		/*
			String[] names = new String[5];
			names[3] = "King Kochhar";
			Optional<String> checkNullValues = Optional.ofNullable(names[3]);
			if(checkNullValues.isPresent()) {
				String modifiedName = names[3].toUpperCase();
				System.out.println(modifiedName);
			} else {
				System.out.println("Value is not present or null..");
			} 
		 */
		
		/*
			 String[] names = new String[5];
			 names[3] = "King Kochhar";
			Optional<String> checkNullValues = Optional.ofNullable(names[3]);
			checkNullValues.ifPresent(System.out::println);
		 */
		
		String name = "Gunwani";
		String modifiedName = Optional.ofNullable(name).orElseGet(() -> "Bhawna");
		System.out.println(modifiedName);
		
		
		
		
		
		
		
		
		
		
	}

}
