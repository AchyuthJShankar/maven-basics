package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertBank {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		Alert HdfcAlert=driver.switchTo().alert();
		String msg=HdfcAlert.getText();
		System.out.println(msg);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		HdfcAlert.accept();
		//HdfcAlert.dismiss();
		driver.switchTo().defaultContent();// This method will take back to main window mean comes out of the login frame.
	
		
	}

}