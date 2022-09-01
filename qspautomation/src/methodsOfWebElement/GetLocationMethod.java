package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		Thread.sleep(2000);

		WebElement loginButton = driver.findElement(By.name("login"));
		Point point = loginButton.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		
		System.out.println("The Placement of login Botton as Fallows ");
		System.out.println("X axis distance : "+xaxis);
		System.out.println("Y axis distance : "+yaxis);


}
	}
