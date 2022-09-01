package ajtPompageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	private WebElement phones;
	private WebElement samsung_galaxy_s6;
	private WebElement signup_btn;


	public Homepage(WebDriver driver)
	{


		phones=driver.findElement(By.xpath("//a[@id='itemc'])[1]"));
		samsung_galaxy_s6=driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
		signup_btn=driver.findElement(By.xpath("//a[@id='signin2']")); 	
	}

	public void clickonphones()
	{
		phones.click();
	}
	public void clickonphonessamsunggalaxys6()
	{
		samsung_galaxy_s6.click();	
	}

	public void clickonphonessignuplink()
	{
		signup_btn.click();

	}




}
