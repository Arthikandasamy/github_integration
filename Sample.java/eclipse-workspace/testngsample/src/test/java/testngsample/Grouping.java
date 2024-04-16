package testngattributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grouping {
	WebDriver driver;
	@Test(groups= {"openbrowser"})
	public void testcase1()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	@Test
	public void testcase2()
	{
		driver.get("http://www.youtube.com");
				
	}
	@Test
	public void testcase3()
	{
		driver.quit();
	}

}
