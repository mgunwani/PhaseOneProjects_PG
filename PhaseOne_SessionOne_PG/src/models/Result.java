package models;

public class Result extends Sport {
	
	private float totalMarks;
	private float averageMarks;
	
	public void calculate() {
		this.totalMarks = this.objectiveMarks + this.subjectiveMarks + this.score;
		this.averageMarks = this.totalMarks/3;
		System.out.println("Total Marks : " + this.totalMarks);
		System.out.println("Average Marks : " + this.averageMarks);
	}
	
}