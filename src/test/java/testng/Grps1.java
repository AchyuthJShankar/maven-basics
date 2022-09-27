package testng;

import org.testng.annotations.Test;

public class Grps1 {
	 @Test(groups= {"Regression"}, priority=1)
	  public void login() {
		  System.out.println("LOGIN");
	  }
	  
	  @Test (groups="Smoke", priority=0)
	  public void reg() {
		  System.out.println("REG");
	  }
	  
	  @Test(groups= {"Regression","Smoke"}, dependsOnMethods="login")
	  public void sendMail() {
		  System.out.println("SEND");
	  }
	}
