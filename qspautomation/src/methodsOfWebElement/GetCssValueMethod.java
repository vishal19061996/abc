package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		Thread.sleep(2000);

		WebElement loginButton = driver.findElement(By.name("login"));
		String cssvalue = loginButton.getCssValue("Position");
		System.out.println(cssvalue);
	}

}
