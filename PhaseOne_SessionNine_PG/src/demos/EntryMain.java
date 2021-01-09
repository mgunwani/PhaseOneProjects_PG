package demos;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EntryMain {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(CalculatorTests.class);
		System.out.println("Total Number of Tests : " + result.getRunCount());
		System.out.println("Total Number of Tests Failed : " + result.getFailureCount());
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
