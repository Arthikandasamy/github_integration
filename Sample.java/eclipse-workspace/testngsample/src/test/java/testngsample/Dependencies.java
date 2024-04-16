package testngattributes;

import org.testng.annotations.Test;

public class Dependencies {

	@Test(priority=1)
	public void firstestcase()
	{
		System.out.println("This is first method");
	}
	@Test(dependsOnMethods="firstestcase")	
	public void secondtestcase()
	{
		System.out.println("This is second method");
	}
	@Test
	public void thirdtestcase()
	{
		System.out.println("This is third method");
	}
}
