package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//Task
	@Test
	public void printDocument()
	{
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");
		System.out.println("Print Document");  //.............
	}
	
	//for(int iterator = 1; condition ; step size ) {  Task   }
	@Test
	public void applyColorToSteps()
	{
		for(int i=1;i<=50;i=i+1) //1<50 2<50 3<50 .....49<50  50<50->false
		{//condition ->true
			System.out.println("Apply White Color to Step :" + i);
		}
	}
	@Test
	public void applyGreenColorToAlternateSteps()
	{
		for(int i=1;i<=50;i=i+2) //1<50 3<50 5<50 .....49<50  50<50->false
		{//condition ->true
			System.out.println("Apply Green Color to Step :" + i);
		}
	}
	@Test
	public void applyRedColorToAlternateSteps()
	{
		for(int i=2;i<=50;i=i+2) //2<50 3<50 5<50 .....49<50  50<50->false
		{//condition ->true
			System.out.println("Apply Red Color to Step :" + i);
		}
	}

}
