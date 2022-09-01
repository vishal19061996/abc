package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled = false)
  public void method1()
  {
	  Reporter.log("actiTime valid",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("actiTime create user",true);
  }
  
  @Test
  public void method3()
  {
	  Reporter.log("actiTime create reports",true);
  }
}
