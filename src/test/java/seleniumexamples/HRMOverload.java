package seleniumexamples;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HRMOverload {
	WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		HRMOverload obj=new HRMOverload();
		obj.login();
		//comment one search if you are using other, so that clash of text won't happen
		//obj.search("Admin"); 
		obj.search("Admin","Paul Collings");
	}
	
	void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//li[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
	
	void search(String userName){
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	void search (String userName, String empName) {
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}


}
