package Datadrivenframework;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Correctusername {
	//WebDriver driver;
	@Test
	public void correctusernmae() throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
username.sendKeys("Admin");
Thread.sleep(200);

WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("adminnn");
Thread.sleep(200);

WebElement loginbutton= driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
loginbutton.click();
driver.quit();
}

}