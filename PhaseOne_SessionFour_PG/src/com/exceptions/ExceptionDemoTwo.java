package com.exceptions;

// Working with Multiple Catch Blocks

class Arithmetic {
	
	int array[] = {10,20,30,40};
	int num1 = 100;
	int num2 = 10;
	
	public void calculate() {
		
		try {
			System.out.println(num1/num2);
			System.out.println("4th element of array : " + array[3]);
			System.out.println("5th element of array : " + array[4]);
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Array Exception : " + ex);
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception" + ex);
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		}
	}
}


public class ExceptionDemoTwo {
	
	public static void main(String[] args) {
		
		Arithmetic obj = new Arithmetic();
		obj.calculate();
		
	}

}
