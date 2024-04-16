import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelementlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
Thread.sleep(300);

driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
Alert alert1= driver.switchTo().alert();
System.out.println(alert1.getText());
alert1.accept();

driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
Alert alert2= driver.switchTo().alert();
System.out.println(alert2.getText());
alert2.dismiss();


driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
Alert alert3= driver.switchTo().alert();
System.out.println(alert3.getText());
alert3.sendKeys("Automation step by step");
alert3.accept();

//driver.close();
//driver.quit();
}

}
