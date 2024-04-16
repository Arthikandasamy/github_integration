package Datadrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BothIncorrect {
	//WebDriver driver;
	@Test
	public void BothIncorrectdetails()
	{
			
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	WebElement username= driver.findElement(By.name("username"));
	username.sendKeys("Adminnn");

	WebElement password= driver.findElement(By.name("password"));
	password.sendKeys("adminnn");

	WebElement loginbutton= driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
	loginbutton.click();
	driver.quit();
	}
}

