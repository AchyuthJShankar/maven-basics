package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\shankach\\Downloads\\WebTable.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();
		

	}

}
