package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void actiTimeLogin() 
  {
	  Reporter.log("Login successful",true);
  }
  
  @Test(dependsOnMethods = "actiTimeLogin")
  public void actiTimeCreateUser() 
  {
	  Reporter.log("Create User",true);
  }
  
  @Test(dependsOnMethods = "actiTimeCreateUser")
  public void actiTimeLogout() 
  {
	  Reporter.log(" Login successful",true);
  }
}
