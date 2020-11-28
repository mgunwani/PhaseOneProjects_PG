package models;

import java.util.Scanner;

public class Information {
	
	Scanner scan = new Scanner(System.in);
	private String name;
	private int age;
	
	void acceptDetails() {
		System.out.print("Enter Your Name : ");
		this.name = scan.nextLine();
		System.out.print("Enter Your Age : ");
		this.age = scan.nextInt();
	}
	
	void displayDetails() {
		System.out.println("Student Name : " + this.name);
		System.out.println("Student Age : " + this.age);
	}
	
}