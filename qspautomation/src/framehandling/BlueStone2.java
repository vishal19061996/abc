package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.id("confirmBtn")).click();
	Thread.sleep(10000);
	

	driver.switchTo().frame("chat-widget");
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();

	
}
}

