package testngpack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

public class demo {
  @Test
  public void a() 
  {
	  Reporter.log("msg",true);
  }
  
  
}
