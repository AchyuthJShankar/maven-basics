package alertWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopNG {
  @Test(priority=0)
  public void simpleAlert() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("alertButton")).click();
		Alert pop=driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		System.out.println(pop.getText());
		pop.accept();
  }
  @Test(priority=1)
  public void confirmation() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert pop1=driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		System.out.println(pop1.getText());
		pop1.accept();
		//pop1.dismiss();
		System.out.println(pop1.getText());

  }
  @Test(priority=2)
  public void promptPop() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert pop2=driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		System.out.println(pop2.getText());
		pop2.sendKeys("Acchu");
		pop2.accept();
		//pop1.dismiss();
  }
}
