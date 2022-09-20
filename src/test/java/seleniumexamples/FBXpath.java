package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.name("firstname")).sendKeys("Hemi");
		driver.findElement(By.name("lastname")).sendKeys("Hvt");
		driver.findElement(By.name("reg_email__")).sendKeys("hemiboss_ycc@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hemiboss_ycc@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("AqwEr@231");
		
		//driver.findElement(By.name("birthday_day")).sendKeys("12");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		//select.selectByVisibleText("12");
		select.selectByIndex(11);
		
		driver.findElement(By.name("birthday_month")).sendKeys("Mar");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		Thread.sleep(1000);
		//driver.findElement(By.id("u_0_3_Rn")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		
		//driver.findElement(By.name("websubmit")).click();

		
		
		
	}
}