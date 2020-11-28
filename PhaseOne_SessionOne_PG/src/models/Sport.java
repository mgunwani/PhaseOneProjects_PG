package models;

public class Sport extends Marks {
	
	protected float score;
	
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Sports Score : ");
		this.score = scan.nextFloat();
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Sports Score : " + this.score);
	}
	
}