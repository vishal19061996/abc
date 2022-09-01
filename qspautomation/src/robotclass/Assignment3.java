package robotclass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.flipkart.com/");
	    
		driver.findElement(By.xpath("//button[.='✕']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Blue, 64 GB)']")).click();
		Thread.sleep(2000);
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId:windowIds )
		{
			driver.switchTo().window(windowId);
		}
		
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='128 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_3dsJAO'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();

	}

}
