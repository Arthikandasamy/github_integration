package common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("http://leaftaps.com/opentaps/");

}
	@AfterMethod
	public void postcondition()
	{
		System.out.println("Close browser");
		
	}
	
}

