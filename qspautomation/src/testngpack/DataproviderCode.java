package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataproviderCode {
	WebDriver driver;

	@Test(dataProvider = "dataprovider1")
	public void testActiTimeValidLogin(String invalidusername ,String invalidpassword) throws InterruptedException 
	{
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);


	}
	@BeforeMethod
	public void setUp() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-4i3mu0f/login.do");
		Thread.sleep(4000);


	}

	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}


	@DataProvider
	public Object[][] dataprovider1()
	{
		Object[][]data=new Object[5][2];
		
		data[0][0]="admin";
		data[0][1]="manager12";
		
		data[1][0]="manager";
		data[1][1]="manager12";
		
		data[2][0]="admin123";
		data[2][1]="manager12";
		
		data[3][0]="admin#11";
		data[3][1]="manager1223";
		
		data[4][0]="admin@44";
		data[4][1]="manager12";
				
		return data;

	}
}
