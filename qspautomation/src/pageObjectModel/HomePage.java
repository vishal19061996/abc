package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// declaration
	@FindBy(name = "usersSelector.selectedUser") private WebElement enterTimeTrackDropdown;
	@FindBy(xpath  = "//a[.='Create new tasks']") private WebElement creatNewTaskLink;
	@FindBy(id  = "SubmitTTButton") private WebElement saButtonveLeaveTime;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logOutLink;
	
	
	// initilization
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilization

	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}
	
	public WebElement getCreatNewTaskLink() {
		return creatNewTaskLink;
	}
	public WebElement getSaButtonveLeaveTime() {
		return saButtonveLeaveTime;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	//operational method
	public void logoutActitime() 
	{
		logOutLink.click();
	}
	

}
