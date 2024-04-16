package testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testsuite {

	WebDriver driver;
	@BeforeSuite	
public void launchbrowser() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	Thread.sleep(200);
	
}

@Test
public void openchrome() throws InterruptedException

{
	driver.get("https://www.google.com");
	Thread.sleep(200);
}

@Test
public void openyahoo()
{
	driver.get("https://www.yahoo.com");
}

@AfterSuite
public void closebrowser()

{
		driver.quit();
}
}
