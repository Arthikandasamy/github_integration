package Datadrivenframework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Correctpassword {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		try {
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			// Wait until the element is present and visible
			  WebElement userelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@name='username']")));
		      userelement.sendKeys("Adminn");
		      
		      
		      WebElement password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@name='password']")));
		      password.sendKeys("admin123");
		      
		}catch(NoSuchElementException e) {
			System.out.println("Exception message:" +e.getMessage());
			
		}finally {
			
			driver.quit();
		}
	}}
	
	//@Test
	
	//{


//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//WebElement username= driver.findElement(By.xpath("//div/input[@name='username']"));
//username.sendKeys("Adminnnn");

//WebElement password= driver.findElement(By.xpath("//div/input[@name='password']"));
//password.sendKeys("admin123");

//WebElement loginbutton= driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
//loginbutton.click();
//driver.quit();

//}
