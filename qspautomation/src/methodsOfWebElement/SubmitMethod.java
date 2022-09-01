package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("vishal");
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class*='L3NKy ']")).submit();
		
}
}
