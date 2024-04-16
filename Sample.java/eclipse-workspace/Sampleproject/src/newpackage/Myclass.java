package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
WebDriver driver= new ChromeDriver();
driver.get("www.google.com");
		System.out.println("Hello");	}

}
 