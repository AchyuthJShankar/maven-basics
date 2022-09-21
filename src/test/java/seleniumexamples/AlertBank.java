package seleniumexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.asserts.SoftAssert;



public class AlertBank {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		Alert HdfcAlert=driver.switchTo().alert();
		String actualResult=HdfcAlert.getText();
		Thread.sleep(1000);
		HdfcAlert.accept();
		//HdfcAlert.dismiss();
		driver.switchTo().defaultContent();// This method will take back to main window mean comes out of the login frame.
		System.out.println(actualResult);
		String expectedResult="Customer ID  cannot be left blank.1";
		// Assert.assertEquals(actualResult,expectedResult);
		Assert.assertEquals(actualResult,expectedResult,"actual result and expected results are not matching");
		// SoftAssert softAssert = new SoftAssert();
		//softAssert.assertEquals(actualResult, expectedResult);
		//System.out.println("After assertion");
		
	}

}