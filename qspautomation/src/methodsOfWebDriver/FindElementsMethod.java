package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);

		driver.findElement(By.name("q")).sendKeys("mobile");

		List<WebElement> WebElementSuggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(4000);

		for(int i=0;i<WebElementSuggestion.size();i++)
		{
			WebElement sugg = WebElementSuggestion.get(i);
			String textOfSugg = sugg.getText();
			Thread.sleep(2000);
			System.out.println(textOfSugg);
		}
		
	//	for(WebElement sugg:WebElementSuggestion)
		//{
	//		String textOfWebelement = sugg.getText();
	//		System.out.println(textOfWebelement);
	//	}




	}
}
