package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		Thread.sleep(2000);

		WebElement src = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.contextClick(src).build().perform();

		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) 
		{
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}


}
