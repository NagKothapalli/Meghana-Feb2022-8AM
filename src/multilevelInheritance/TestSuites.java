package multilevelInheritance;

import org.junit.Test;
//               A    extends     B   extends C  : A inherits C also     
//             child              parent 
public class TestSuites extends TestCases
{
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TS- child"); }
	 */
	@Test
	public void smokeSuite()
	{
		System.out.println("TestSuite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("TestSuite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		deleteAnEmail();
		forwardAnEmail();
	}

}
