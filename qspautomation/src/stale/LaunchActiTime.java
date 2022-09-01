package stale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://desktop-4i3mu0f/login.do");
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.name("username"));
		driver.navigate().refresh();
		username.sendKeys("admin");  //  username holds the old adresss
	}

}
