package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
 
  @BeforeSuite
  public void openbrowser() {
	  WebDriverManager.chromedriver().setup();
  }
  @Test
  public void f() {
  }
  @AfterSuite
  public void afterSuite() {
  }

}
