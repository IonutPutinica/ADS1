package calculator;

import stack.*;

public class Calculator implements ICalculator {

	private StackADT<Double> stack;
	private String[] list;
	private String calString = "";

	public Calculator(String calString) {
		this.calString = calString;
		this.stack = new MyStack<Double>();
		this.list = new String[this.lengthOfTheArray()];
		this.addCaluclationToList();

	}

	// adds the calculation string to the array.
	private void addCaluclationToList() {

		list = calString.split(" ");

	}

	// method for determine the nessary length of the array.
	private int lengthOfTheArray() {

		int tempInt = (calString.length() - calString.replace(" ", "").length());
		return tempInt;

	}

	// returns the length of the numberlist.
	public int lengthOfNumberList() {
		return list.length;
	}

	// prints the list of numbers.
	public void printListOfNumbers() {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	// Method for doing the calculation.
	public double doOperation() {
		double tempOne;
		double tempTwo;
		double result = 0;
		int inc = 0;
		try {
			while (inc <= this.lengthOfTheArray()) {
				String myString = list[inc];
				if (myString.matches("-?\\d+")) {
					stack.push(Double.parseDouble(list[inc]));
					inc++;
				} else {
					switch (myString) {
					case "*":
						tempOne = stack.pop();
						tempTwo = stack.pop();
						result = tempOne * tempTwo;
						stack.push(result);
						break;
					case "+":
						tempOne = stack.pop();
						tempTwo = stack.pop();
						result = tempOne + tempTwo;
						stack.push(result);
						break;
					case "-":
						tempOne = stack.pop();
						tempTwo = stack.pop();
						result = tempTwo - tempOne;
						stack.push(result);
						break;
					case "/":
						tempOne = stack.pop();
						tempTwo = stack.pop();
						result = tempTwo / tempOne;
						stack.push(result);
						inc++;
						break;
						
					}
					inc++;
				}
			}

	} catch (IllegalArgumentException e) {
		e.printStackTrace();
	}
		return result;

	}
}