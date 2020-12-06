package com.exceptions;

// Working with throw keyword:

public class ExceptionDemoFour {
	
	
	static void validate(int age) throws AgeException {
		
		if(age < 18) {
//			throw new ArithmeticException("Not Valid to vote..");
			throw new AgeException();
		} else {
			System.out.println("You are valid to vote..");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			validate(3);
		} catch (ArithmeticException | AgeException ex) {
			System.out.println(ex);
		} 
		System.out.println("Rest of the Code here..");
		
	}

}
