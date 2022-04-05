package coreConcepts;

import org.junit.Test;

public class MyArrays
{
	int stdNum = 22;
	//DataType[]   name = {values};
	
	@Test
	public void fixedArray_integer()
	{    //                  0   1 2  3 4 5 6  7 8  9  10  11  ->12
		int[]  stdNumbers = {22,44,52,2,4,8,12,6,16,34,67,78};  //declaration , assignment
		int len  = stdNumbers.length;  //size or length
		int val = stdNumbers[1];  //reading
		System.out.println("value at 1 :"+ val);
		stdNumbers[1] = 88; //writing
		System.out.println("value at 1 after :"+ stdNumbers[1]);
		for(int i=0;i<12;i++)  // i=0...11 12
		{
			val = stdNumbers[i];
			System.out.println("value :" + val); //22,44,52,
		}
	}
	@Test
	public void dynamicArray_integer()
	{
		int[]  stdNumbers = new int[40]; //it will reserve 40 memory locations		
		int val = stdNumbers[0]; //1st locker  //reading
		System.out.println("1st mem location :" + val);
		val = stdNumbers[1]; //2nd locker
		System.out.println("2nd mem location :" + val);
		for(int i=2;i<stdNumbers.length;i++)
		{
			val = stdNumbers[i]; //i = 0 1 2 3 4 5 - index values
			System.out.println("Locker number :" + i + "  - Values :" + val);
		}
		stdNumbers[0] = 20;
		stdNumbers[1] = 30;
		stdNumbers[2] = 40; //Writing
		for(int i=0;i<stdNumbers.length;i++) // i = 0 1 2 3 4 5 6 7
		{
			stdNumbers[i] = 20+i; //write
			val = stdNumbers[i]; //read
			System.out.println("Locker number after :" + i + "  - Values :" + val);
		}
		
		
	}
	@Test
	public void fixedArray_string()
	{    //                  0   1 2  3 4 5 6  7 8  9  10  11  ->12
		//int[]  stdNumbers = {22,44,52,2,4,8,12,6,16,34,67,78};  //declaration , assignment
		String[] stdNames = {"Ram","Ravi","Raj","Rani"};
		int len  = stdNames.length;  //size or length
		String val = stdNames[1];  //reading
		System.out.println("value at 1 :"+ val);
		stdNames[1] = "Ramu"; //writing
		System.out.println("value at 1 after :"+ stdNames[1]);
		for(int i=0;i<12;i++)  // i=0...11 12
		{
			val = stdNames[i];
			System.out.println("value :" + val); 
		}
	}
	

}
