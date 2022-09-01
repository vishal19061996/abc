package ajitPomTeatLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ajtPompageLayer.Homepage;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://demoblaze.com/index.html#"); 
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		Homepage home=new Homepage(driver);

		home.clickonphones();
		home.clickonphonessamsunggalaxys6();

	}



}
