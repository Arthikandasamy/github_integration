package testngsample;

import org.testng.annotations.Test;

public class SkipTestcases {

	@Test(priority=1, enabled=false)
	public void firststcase()
	{
		System.out.println("This is first method");
	}
	@Test(priority=0,enabled=true)
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
