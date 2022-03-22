package coreConcepts;

import org.junit.Test;

public class UnitTestFrameWork {

	@Test
	public void addition() // normal student
	{
		int sum = 10 + 20;// int+int=int / int+string | string+int | string+string = string
		System.out.println("Sum of two numbers :" + sum); // syso CTRL+SPACE
	}

	@Test
	public void subtraction() {
		int diff = 30 - 20;
		System.out.println("Difference of two numbers :" + diff);
	}

	@Test
	public void multiplication() {
		int prod = 30 * 20; // int
		System.out.println("Product of two numbers :" + prod);
	}

	@Test
	public void division() {
		int div = 30 / 20;
		System.out.println("Division of two numbers :" + div);
	}

	@Test
	public void division_R() {
		int rem = 30 % 20;
		System.out.println("Reminder of two numbers :" + rem);
	}

}
