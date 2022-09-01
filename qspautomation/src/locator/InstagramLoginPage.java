package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(3000);
			
			// to login
			driver.findElement(By.name("username")).sendKeys("vishal_0719");
			driver.findElement(By.name("password")).sendKeys("12345678");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class*='L3NKy ']")).click();

	}

}
