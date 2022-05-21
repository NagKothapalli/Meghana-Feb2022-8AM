package coreConcepts;

import org.junit.Test;

public class GmailAutomation 
{
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
	//************Reusable Components******************
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//lauch
		//ererewrerew
		//fgdghgh/
		//hgfhgj
		//fgfdgdg
		//fhghjhgjhg
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	public void compose()
	{
		System.out.println("RC : Compose An Email");
	}
	public void send()
	{
		System.out.println("RC : Send An Email");
	}
	public void open()
	{
		System.out.println("RC : Open An Email");
	}
	public void reply()
	{
		System.out.println("RC : Reply An Email");
	}
	public void forward()
	{
		System.out.println("RC : Forward An Email");
	}
	public void delete()
	{
		System.out.println("RC : Delete An Email");
	}

}
