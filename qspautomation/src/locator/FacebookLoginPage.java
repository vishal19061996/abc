package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/");
			
			// to login
			driver.findElement(By.id("email")).sendKeys("9923397316");
			driver.findElement(By.id("pass")).sendKeys("9923397316");
			Thread.sleep(3000);
			driver.findElement(By.id("loginbutton")).click();

	}

}
