package testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Para_Bank {

	public static void main (String[] args) throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(400);
		driver.findElement(By.name("username")).sendKeys("admin");
		
	
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.className("button")).click();
		
		
	driver.quit();
	}
}
