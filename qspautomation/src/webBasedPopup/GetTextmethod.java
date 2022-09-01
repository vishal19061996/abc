package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextmethod
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.get("file:///C:/Users/Ravi/Desktop/HTML%20AUTOMATION/confirmation.html");
	
	driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
	Thread.sleep(2000);
	
	Alert alert = driver.switchTo().alert();
	
	alert.accept();
	alert.getText();
	
	
	


}
}
