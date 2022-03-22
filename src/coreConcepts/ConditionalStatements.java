package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	int a = 22;
	int b = 25; //Hard coded value
	//if(expression -> boolean : true / false ) {  task  }
	@Test
	public void compareNumbers_1()
	{
		if(a==b) //Decision
		{
			System.out.println("Both A and B are equal");
		}
	}
	
	@Test
	public void compareNumbers_2_Test() //Customer  //Test - Unit Testing
	{
		compareNumbers_2(44,68);
		compareNumbers_2(44,44);
		compareNumbers_2(464,68);
		compareNumbers_2(68,68);
	}
	public void compareNumbers_2(int a,int b)  //Dev code
	{
		System.out.println("A value :"+a);
		System.out.println("B value :"+b);
		if(a==b) //Decision
		{ //true
			System.out.println("Both A and B are equal");
		}
		else
		{ //false
			System.out.println("Both A and B are not equal");
		}
	}

}
