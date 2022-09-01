package autoit;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			// to login
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[contains(@class,'oxd-main-menu-item active')]")).click();
			driver.findElement(By.xpath("//a[.='Add Employee']")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			
			
			//WebElement fileUploadButton = driver.findElement(By.id("photofile"));
			//Actions act = new Actions(driver);
			//act.doubleClick(fileUploadButton).perform();
			
			
			
			
			
			

	}

}
