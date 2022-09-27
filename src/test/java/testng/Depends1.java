package testng;

import org.testng.annotations.Test;

public class Depends1 {
	  @Test(dependsOnMethods= {"reg"})
	  public void login() {
		  System.out.println("LOGIN");
	  }
	  
	  @Test ()
	  public void reg() {
		  System.out.println("REG");
	  }
	  
	  @Test(dependsOnMethods= {"login"})
	  public void sendMail() {
		  System.out.println("SEND");
	  }
	}
