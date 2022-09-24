package stepdefinations;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import org.testng.asserts.SoftAssert;
public class Temp {
	public static WebDriver driver = null;

	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    String actual = null, expected =null;
	    expected="PIM";
	    actual=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
	    SoftAssert soft=new SoftAssert();
	    soft.assertEquals(actual, expected);
	    System.out.println("After Assertion");
	  
	}
	@Then("user logout")
	public void user_logout() {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']/i")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	

}
