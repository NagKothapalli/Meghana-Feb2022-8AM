package coreConcepts;

import org.junit.Test;

public class ConditionalStatements {
	int a = 22;
	int b = 25; // Hard coded value
	// if(expression -> boolean : true / false ) { task }

	@Test
	public void compareNumbers_1() {
		if (a == b) // Decision
		{
			System.out.println("Both A and B are equal");
		}
	}

	// Customer //Test - Unit Testing
	@Test
	public void compareNumbers_2_Test()	{
		compareNumbers_2(44, 68);
		compareNumbers_2(44, 44);
		compareNumbers_2(464, 68);
		compareNumbers_2(68, 68);
	}

	// Dev code
	public void compareNumbers_2(int a, int b){
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (a == b) // Decision
		{ // true
			System.out.println("Both A and B are equal");
		} else { // false
			System.out.println("Both A and B are not equal");
		}
	}

	// Write a program to read two numbers and perform addition if equal ,
	// subtraction if a > b , multiplication if a < b
	@Test
	public void multipleDecisions_Test() //TDD : Test Driven Development
	{
		multipleDecisions(22,22); // 33.33333
		multipleDecisions(252,22); // 33.33333
		multipleDecisions(12,22); //33.3333
	}
	public void multipleDecisions(int x, int y) {
		System.out.println("X value :" + x);
		System.out.println("Y value :" + y);
		if (x == y) { // true
			int sum = x + y;
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(x > y) { //true
			int diff = x-y;
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(x < y) {
			int prod = x*y;
			System.out.println("Product of two numbers :"+prod);
		}
	}
	
	// Write a program to read two numbers and perform the below task if both are above 10
	//Task : perform addition if equal ,subtraction if a > b , multiplication if a < b
	@Test
	public void logicalOperators_Test()
	{
		logicalOperators(5,6);
		logicalOperators(55,7);
		logicalOperators(5,75);
		logicalOperators(5,5);
		logicalOperators(55,55);
		logicalOperators(55,17);
		logicalOperators(25,67);
		
	}
	public void logicalOperators(int x,int y)
	{
		System.out.println("X value :" + x);
		System.out.println("Y value :" + y);
		//    T           T  ->   T
		if((x > 10) && (y > 10))  // Logical Operators
		{
			//Nested if condition
			if (x == y) { // == , > , < : Relational Operators
				int sum = x + y; // = : Assignment Operator
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(x > y) { //true
				int diff = x-y;  // + - * : Arithmetic Operators
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(x < y) {
				int prod = x*y;
				System.out.println("Product of two numbers :"+prod);
			}
		}
		else
		{
			System.out.println("Both X and Y or any one of them might be below 10");
		}
	}
	
	//Write  a program to read a number as input and find that number is even or odd . 
	 //  N , D    N / D -> Q       N % D -> R    N % 2 -> R : if R == 0 that number is even 	
	//Find sum of first 10 numbers
	//Print all even numbers in the given range [1 -  50 ] 
	//Print all odd numbers in the given range [1 -  50 ] 
	
	
	
	
	
	
	
}
