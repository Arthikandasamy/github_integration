package Datadrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bothcorrect {
	//WebDriver driver;
	@Test
	public void Bothcorrectdetails()
	{
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

WebElement username= driver.findElement(By.name("username"));
username.sendKeys("Admin");

WebElement password= driver.findElement(By.name("password"));
password.sendKeys("admin123");

WebElement loginbutton= driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
loginbutton.click();
driver.quit();
}
}
