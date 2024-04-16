package testngattributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {

	WebDriver driver;
	@Test
	public void openchromebrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Thread.sleep(200);
	}
	@Test
	public void openyoutube()
	{
		driver.get("http://www.youtube.com");
	}
}
