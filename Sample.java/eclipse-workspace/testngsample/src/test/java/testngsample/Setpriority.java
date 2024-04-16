package testngsample;

import org.testng.annotations.Test;

public class Setpriority {
	@Test(priority=1)
	public void firststcase()
	{
		System.out.println("This is first method");
	}
	@Test(priority=0)
	public void secondtestcase()
	{
		System.out.println("This is second method");
	}
	@Test(priority=2)
	public void thirdtestcase()
	{
		System.out.println("This is third method");
	}

}
