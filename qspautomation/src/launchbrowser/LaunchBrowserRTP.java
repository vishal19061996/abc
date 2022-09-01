package launchbrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		// took the user input
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the browser name, chrome or firefox");
		String browserValue=sc.nextLine();
		
		// browserValue variable contains the name of the name of the browser which is supposed to be opened
		
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver(); // open chrome browser
			driver.manage().window().maximize(); // maximize the browser
			driver.get("https://www.google.com"); //launch te web application
			Thread.sleep(5000);// wait for 5 sec
			
	}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver(); // open the firefox browser
			driver.manage().window().maximize(); // maximize the browser
			driver.get("https://www.google.com");//launch the web application
			Thread.sleep(5000);// wait for 5 sec
			
	}
		else
		{
			System.out.println("type valid input");
		}
}
}
