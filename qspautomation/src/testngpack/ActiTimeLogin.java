package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLogin {

	WebDriver driver;
	@Parameters({"browser","username","password"})
	@Test
	public void actitimeLogin(String browserValue,String validusername,String validpassword) 
	{
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("http://desktop-4i3mu0f/login.do");
			driver.findElement(By.name("username")).sendKeys(validusername);
			driver.findElement(By.name("pwd")).sendKeys(validpassword);
			driver.findElement(By.id("loginButton")).click();
			driver.close();
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("http://desktop-bh9ro97/login.do");
			driver.findElement(By.name("username")).sendKeys(validusername);
			driver.findElement(By.name("pwd")).sendKeys(validpassword);
			driver.findElement(By.id("loginButton")).click();
			driver.close();
		
		}

	}
}