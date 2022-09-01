package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhonePeLoginpage {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://phonepe.force.com/login?locale=us");
			
			// to login
			driver.findElement(By.id("username")).sendKeys("9923397316");
			driver.findElement(By.id("password")).sendKeys("1111");
			Thread.sleep(3000);
			driver.findElement(By.id("Login")).click();

	}

}
