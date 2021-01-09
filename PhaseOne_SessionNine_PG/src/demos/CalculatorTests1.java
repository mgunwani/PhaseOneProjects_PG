package demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;



public class CalculatorTests1 {
	
	Calculator calculate = new Calculator();

	@Test
	public void MultiplicationTest() {
		// System.out.println("Starting Test : " + new Object() {}.getClass().getEnclosingMethod());
		assertEquals(20000, calculate.multiply(100, 200));
		// System.out.println("Ending Test : " + new Object() {}.getClass().getEnclosingMethod());
	}
	
	@Test
	public void DivisionTest() {
		// System.out.println("Starting Test : " + new Object() {}.getClass().getEnclosingMethod());
		assertEquals(5, calculate.division(1000, 200));
		// System.out.println("Ending Test : " + new Object() {}.getClass().getEnclosingMethod());
	}

}
