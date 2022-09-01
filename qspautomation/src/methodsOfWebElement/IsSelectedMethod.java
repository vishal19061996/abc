package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/Desktop/HTML%20AUTOMATION/checkbox.html");
		Thread.sleep(2000);
		
		WebElement AutomationCheckBox = driver.findElement(By.id("automation"));
		AutomationCheckBox.click();
		boolean status = AutomationCheckBox.isSelected();
		System.out.println(status);
		

}
	}
