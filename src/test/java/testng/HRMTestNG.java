package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HRMTestNG {
  @Test
  public void login() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button")).click();
  }
  @Test
  public void forgotPwd() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//String a=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button")).click(); //presses "cancel"
		//String b=driver.getTitle();
		String url = driver.getCurrentUrl();
		//Assert.assertEquals(a,b,"actual result and expected results are not matching");
		//Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","actual result and expected results are not matching");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("After assertion");
  }
  @Test
  public void leaveApp() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//li[3]")).click();
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-09-28");
		driver.findElement(By.xpath("//textarea")).sendKeys("Family Function");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test
  public void employeeSearch() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//li[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).sendKeys("Paul Collings");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
  }
}
