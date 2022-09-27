package testng;

import org.testng.annotations.Test;

public class Priority1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("LOGIN");
  }
  
  @Test (priority=0)
  public void reg() {
	  System.out.println("REG");
  }
  
  @Test(priority=2)
  public void sendMail() {
	  System.out.println("SEND");
  }
}
