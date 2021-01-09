package demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class CalculatorTests {

	Calculator calculate = new Calculator();
	
	@Test
	public void AdditionTest() {
		// System.out.println("Starting Test : " + new Object() {}.getClass().getEnclosingMethod());
		assertEquals(300, calculate.addition(100, 200));
		// System.out.println("Ending Test : " + new Object() {}.getClass().getEnclosingMethod());
	}
	
	
	@Test
	public void SubtractionTest() {
		// System.out.println("Starting Test : " + new Object() {}.getClass().getEnclosingMethod());
		assertEquals(-100, calculate.subtract(100, 200));
		// System.out.println("Ending Test : " + new Object() {}.getClass().getEnclosingMethod());
	}

}
