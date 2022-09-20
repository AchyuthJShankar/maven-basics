package seleniumexamples;
//OPENS Chrome and google.com, and types "Selenium" in google search box

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/"); // allows to use back button
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//sendKeys - predefined for typing
		driver.findElement(By.name("q")).sendKeys("Selenium"); //q - name for searchbox given by google
		
		Thread.sleep(500);
		driver.findElement(By.name("btnK")).click();

	}

}
