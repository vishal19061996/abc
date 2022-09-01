package xPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='0']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[.='+']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[.='3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='0']")).click();
		Thread.sleep(3000);
		
		String ActualResult = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("Addition of two Number:"+ActualResult);
		
		

		
		
		
		
}
}
