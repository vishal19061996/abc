package keyWordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		//read the browser value
		String browservalue = flib.readPropertyFile(PROP_PATH, "browser");

		// read the url
		String url = flib.readPropertyFile(PROP_PATH, "url");

		if(browservalue.equalsIgnoreCase("Chrome"))
		{

			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}  

	}
	// close all browser
	public void closeBrowser()
	{
		driver.quit();
	}



}
