package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.instagram.com/accounts/login/");
			
			
			// to login
			driver.findElement(By.name("username")).sendKeys("vishal_0719");
			driver.findElement(By.name("password")).sendKeys("12345678");
			
			driver.findElement(By.cssSelector("button[class*='L3NKy ']")).click();

	}

}
