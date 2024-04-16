package testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {

	//To give user input via testNG file this parameterization is used.
	WebDriver driver;
	public void openchromebrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	
	public void openbing()
	{
		driver.get("http://www.bing.com");
	}
}
