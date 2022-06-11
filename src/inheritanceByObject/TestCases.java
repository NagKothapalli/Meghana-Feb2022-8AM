package inheritanceByObject;

import org.junit.Test;
//             child A             parent B
public class TestCases //extends ReusableComponents   //A
{  //one parent - one child is called simple inheritance
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TC- father"); }
	 */
	ReusableComponents  rc = new ReusableComponents();
	//ChromeDriver driver = new ChromeDriver(); -> opens chrome browser
	//driver.get("https://gmail.com");
	@Test
	public void composeAndSendAnEmail()  // QA-1
	{
		//launch , login , compose , send , logout , close
		System.out.println("TestCase :ComposeAndSendAnEmail ");
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();		
	}
	
	@Test
	public void replyToAnEmail()  //QA-2
	
	{
		//launch , login , inbox , open , reply , logout , close
		System.out.println("TestCase :ReplyToAnEmail ");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	
	@Test
	public void deleteAnEmail()  //QA-3
	{
		//launch , login , inbox , open , reply , logout , close
		System.out.println("TestCase :DeleteAnEmail ");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail()  //QA-4
	{
		//launch , login , inbox , open , reply , logout , close
		System.out.println("TestCase :ForwardAnEmail ");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

}
