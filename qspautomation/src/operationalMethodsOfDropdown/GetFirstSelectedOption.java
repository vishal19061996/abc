package operationalMethodsOfDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/Desktop/HTML%20AUTOMATION/multiselectdropdown.html");
		Thread.sleep(2000);
		
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		
		
		for(int i=2;i<=6;i++)
		{
			sel.selectByIndex(i);
			
			
		}
		WebElement op = sel.getFirstSelectedOption();
		String textOfFirstSelectedop = op.getText();
		System.out.println(textOfFirstSelectedop);
		
	

}
}
