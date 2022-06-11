package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	//ClassName   objName  = new Constructor();
	@Test
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");  // name = ram
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//ClassName   objName  = new Constructor();
		ChromeDriver driver = new ChromeDriver();  //it will open an empty chrome browser
		driver.get("https://gmail.com");
	}

}
