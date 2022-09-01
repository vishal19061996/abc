package xPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Core i5'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='HP'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Operating System'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Windows 10'])[3]")).click();
		Thread.sleep(3000);
		
		String PriceofHPLaptop = driver.findElement(By.xpath("//div[.='HP 14s Core i5 10th Gen - (8 GB/512 GB SSD/Windows 10 Home) 14s- ER0503TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
        System.out.println("PriceofHPLaptop:"+PriceofHPLaptop);


}
}
