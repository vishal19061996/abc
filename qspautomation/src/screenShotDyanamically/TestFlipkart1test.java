package screenShotDyanamically;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Listeners(CustomListner.class)

public class TestFlipkart1test extends BaseTest{

	@Test
	public void TestFlipkart1() 
	{
		Assert.fail();
	}
	
	@Test
	public void TestFlipkart2() 
	{
		Assert.fail();
	}
	
	@Test
	public void TestFlipkart3() 
	{
		Assert.fail();
	}
	
	@Test
	public void TestFlipkart4() 
	{
		Assert.fail();
	}
	
	@Test
	public void TestFlipkart5() 
	{
		Assert.fail();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}
