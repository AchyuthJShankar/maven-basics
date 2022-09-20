package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		

		//driver.findElement(By.name("firstname")).sendKeys("Hemi");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hemi");
		//driver.findElement(By.name("lastname")).sendKeys("Hvt");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hvt");
		driver.findElement(By.name("reg_email__")).sendKeys("hemi_ycc@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hemi_ycc@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("AqwEr@231");
		
		//driver.findElement(By.name("birthday_day")).sendKeys("12");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		//select.selectByVisibleText("12");
		select.selectByIndex(11);
		
		driver.findElement(By.name("birthday_month")).sendKeys("Mar");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		driver.findElement(By.xpath("a[contains(@id,'Male']")).click();
		
		//driver.findElement(By.name("websubmit")).click();

		
		
		
	}

}