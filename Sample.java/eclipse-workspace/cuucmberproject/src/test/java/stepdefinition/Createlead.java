package stepdefinition;

import org.openqa.selenium.By;

import common.Baseclass;
import io.cucumber.java.en.When;

public class Createlead extends Baseclass {
	
	@When("click on CRMSFA link")
	public void click_on_CRMSFA_link()
	{
		
		driver.findElement(By.linkText("CRM")).click();
		
	}

}
