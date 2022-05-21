package multilevelInheritance;

import org.junit.Test;
//             child A             parent B
public class TestCases extends ReusableComponents   //A
{  //one parent - one child is called simple inheritance
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TC- father"); }
	 */
	@Test
	public void composeAndSendAnEmail()  // QA-1
	{
		//launch , login , compose , send , logout , close
		System.out.println("TestCase :ComposeAndSendAnEmail ");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void replyToAnEmail()  //QA-2
	
	{
		//launch , login , inbox , open , reply , logout , close
		System.out.println("TestCase :ReplyToAnEmail ");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void deleteAnEmail()  //QA-3
	{
		//launch , login , inbox , open , reply , logout , close
		System.out.println("TestCase :DeleteAnEmail ");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void forwardAnEmail()  //QA-4
	{
		//launch , login , inbox , open , reply , logout , close
		System.out.println("TestCase :ForwardAnEmail ");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}

}
