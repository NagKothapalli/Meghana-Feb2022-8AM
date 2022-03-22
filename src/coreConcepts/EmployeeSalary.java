package coreConcepts;

import org.junit.Test;

public class EmployeeSalary
{
	@Test
	public void employeePayRoll()
	{
		for(int i=0;i<10;i++)
		{
			
		}
		//Ram payroll
		int ramGross = employeeGrossSalary(8000,3000);
		int ramNet = employeeNetSalary(ramGross);
		creditSalary(ramNet);		
	}
	
	//*******************************************
	public int employeeGrossSalary(int basic,int hra)  // basic + hra 
	{
		int gSal = basic + hra;
		return gSal;  //output
	}
	
	public int employeeNetSalary(int gross)
	{
		int netSal = gross - 2000;
		return netSal; //output
	}
	
	public void creditSalary(int net)
	{
		System.out.println("Credit the salary in to Employee Account :" + net );
	}
	
	

}
