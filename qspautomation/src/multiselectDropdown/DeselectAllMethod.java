package multiselectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAllMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/Desktop/HTML%20AUTOMATION/multiselectdropdown.html");
		Thread.sleep(2000);
		
		WebElement multiselect = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselect);
		
		for (int i = 1; i <= 5; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		sel.deselectAll();
		
	

}
}
