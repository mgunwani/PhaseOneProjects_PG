package models;

public class Marks extends Information {
	
	protected float objectiveMarks;
	protected float subjectiveMarks;
	
	void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks : ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter Your Subjective Marks : ");
		this.subjectiveMarks = scan.nextFloat();
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks : " + this.objectiveMarks);
		System.out.println("Sobjective Marks : " + this.subjectiveMarks);
	}
	
}
