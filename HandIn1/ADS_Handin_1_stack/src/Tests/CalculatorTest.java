package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Before
	public void create() {
	}

	@After
	public void destroy() {
	}

	// Test if the calculation is added to the list as intended.
	@Test
	public void addNumbersToList() {
		Calculator calculator = new Calculator("30 23 * 12 * 230203");
		System.out.println("AddNumbersToList:");
		calculator.printListOfNumbers();
		assertTrue(calculator.lengthOfNumberList() == 6);
	}

	// Test for subtraction.
	@Test
	public void substractionTest() {
		Calculator calculator = new Calculator("20 10 -");
		System.out.println("SubstractionTest: " + calculator.doOperation());
		assertTrue(calculator.doOperation() == 10);
	}

	// Test for multiplication
	@Test
	public void multiplicationTest() {
		Calculator calculator = new Calculator("30 23 * 12 *");
		System.out.println("MultiplicationTest: " + calculator.doOperation());
		assertTrue(calculator.doOperation() == 8280);

	}

	// Test for addition
	@Test
	public void additionTest() {
		Calculator calculator = new Calculator("30 23 + 12 + 23 +");
		System.out.println("AdditionTest: " + calculator.doOperation());
		assertTrue(calculator.doOperation() == 88);
	}

	// Test for division
	@Test
	public void divisionTest() {
		Calculator calculator = new Calculator("12 5 /");
		calculator.doOperation();
		System.out.println("DivisionTest: " + calculator.doOperation());
		assertTrue(calculator.doOperation() == 2.4);

	}

	// Test for too many numbers.
	@Test
	public void tooManyNumbersTest() {
		Calculator calculator = new Calculator("30 23 * 12 * 23 2321");
		System.out.println("TooManyNumbersTest: " + calculator.doOperation());
		assertTrue(calculator.doOperation() == 8280);

	}

	// Tests the behavior of letters
	// @Test
	public void invalidInputTest() {
		Calculator calculator = new Calculator("30 23 * A");
		System.out.println("InvalidInputTest: " + calculator.doOperation());
		assertTrue(calculator.doOperation() == 690);
	}
}
