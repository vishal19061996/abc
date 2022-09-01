package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://desktop-4i3mu0f/login.do");
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataAct.xlsx", "invalidcreds");
		for(int i=1; i<=rc; i++)
		{
		String username = flib.readExceldata("./data/TestDataAct.xlsx", "invalidcreds", i, 0);
		String password = flib.readExceldata("./data/TestDataAct.xlsx", "invalidcreds", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).clear();
		
		}
		
		driver.close();
	}

}
