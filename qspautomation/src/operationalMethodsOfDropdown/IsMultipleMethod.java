package operationalMethodsOfDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/Desktop/HTML%20AUTOMATION/singleselectdropdown.html");
		Thread.sleep(2000);
		
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		boolean status = sel.isMultiple();
		
		System.out.println(status);

}
}
