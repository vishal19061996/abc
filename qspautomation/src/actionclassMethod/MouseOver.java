package actionclassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			// to login
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
		// Admin---> User Managment--->Users
			
			Actions act = new Actions(driver);
			
			WebElement admin = driver.findElement(By.xpath("//a[.='Admin']"));
			WebElement usermg = driver.findElement(By.xpath("//a[.='User Management']"));
			WebElement user = driver.findElement(By.xpath("//a[.='Users']"));
			
			act.moveToElement(admin).build().perform();  //mouseoverto admin tab
			act.moveToElement(usermg).build().perform();  //mouseover to usermg tab
			act.moveToElement(user).click().build().perform(); //mouseover to users and click the options
			
			
			

	}

}
