package seleniumexamples;

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
		Thread.sleep(1000);
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE'"));
		Alert hdfcalert=driver.switchTo().alert();
		String actualResult=hdfcalert.getText();
		Thread.sleep(1000);
		hdfcalert.accept();
		driver.switchTo().defaultContent();
		System.out.println(actualResult);
		
	}

}
