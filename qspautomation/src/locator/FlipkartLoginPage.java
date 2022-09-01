package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://affiliate.flipkart.com/login");
			
			// to login
			driver.findElement(By.id("inputEmail")).sendKeys("vishalgharat49@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("inputPassword")).sendKeys("9923397316");
			Thread.sleep(3000);
			driver.findElement(By.id("submitLogin")).click();

	}

}
