package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.Baseclass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends Baseclass{
	
	/*@Given("open the chrome browser")
	public void open_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	@Given("Load the application as {string}")
	public void load_the_application_as (String url) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get(url);
	   }*/
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("username")).sendKeys(username);
	}
	@Given("Enter password as {string}")
	public void enter_password_as(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("Home page should be displayed.")
	public void home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  String title= driver.getTitle();
	  	
	  if(title.equals("Leaftaps - TestLeaf Automation Platform"))
	  {
		  System.out.println("Title is displayed");
	  }else
	  {
		  System.out.println("Title is not displayed");
	  }
}
	  
	/*@But("Error message page should be displayed.")
	public void error_message_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Error message is displayed");
	}*/
}

