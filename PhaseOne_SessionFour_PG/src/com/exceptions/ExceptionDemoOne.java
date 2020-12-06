package com.exceptions;


class ArithmeticTest {
	
	public void division(int num1, int num2) {
		try {
			int result = num1/num2;
			System.out.println("Result : " + result);
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
	}
	
}

public class ExceptionDemoOne {
	
	public static void main(String[] args) {
	
		ArithmeticTest obj = new ArithmeticTest();
		obj.division(100, 0);
		
	}

}
