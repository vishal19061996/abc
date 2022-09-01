package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "FUNCTIONAL")
  public void ft1() 
  {
	  Reporter.log("Functional Tset Case 1",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it1() 
  {
	  Reporter.log("Integration Tset Case 1",true);
  }
  
  @Test(groups = "SMOKE")
  public void st1() 
  {
	  Reporter.log("Smoke Tset Case 1",true);
  }
  //---------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft2() 
  {
	  Reporter.log("Functional Tset Case 2",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it2() 
  {
	  Reporter.log("Integration Tset Case 2",true);
  }
  
  @Test(groups = "SMOKE")
  public void st2() 
  {
	  Reporter.log("Smoke Tset Case 2",true);
  }
  //----------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft3() 
  {
	  Reporter.log("Functional Tset Case 3",true);
  }
  @Test(groups = "INTEGRATION")
  public void it3() 
  {
	  Reporter.log("Integration Tset Case 3",true);
  }
  @Test(groups = "SMOKE")
  public void st3() 
  {
	  Reporter.log("Smoke Tset Case 3",true);
  }
  //---------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft4() 
  {
	  Reporter.log("Functional Tset Case 4",true);
  }
  @Test(groups = "INTEGRATION")
  public void it4() 
  {
	  Reporter.log("Integration Tset Case 4",true);
  }
  
  @Test(groups = "SMOKE")
  public void st4() 
  {
	  Reporter.log("Smoke Tset Case 4",true);
  }
  //--------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft5() 
  {
	  Reporter.log("Functional Tset Case 5",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it5() 
  {
	  Reporter.log("Integration Tset Case 5",true);
  }
  
  @Test(groups = "SMOKE")
  public void st5() 
  {
	  Reporter.log("Smoke Tset Case 5",true);
  }
  //-------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft6() 
  {
	  Reporter.log("Functional Tset Case 6",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it6() 
  {
	  Reporter.log("Integration Tset Case 6",true);
  }
  
  @Test(groups = "SMOKE")
  public void st6() 
  {
	  Reporter.log("Smoke Tset Case 6",true);
  }
}


