package testng;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testsuite {

	WebDriver driver;
	@BeforeSuite
	public void openbrowser() throws InterruptedException
	{
	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Drivers\\IEDriverServer.exe");
	driver= new InternetExplorerDriver();
	Thread.sleep(200);
	}
	
	@Test
	public void openchrome()
	{
		driver.get("www.google.com");
	}
	
	@Test
	public void openyahoo()
	{
		driver.get("www.bing.com");
	}
	@AfterSuite
	public void close()
	{
	//driver.quit();	
	}
	
	
}

