package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				String filePath="C:\\Achyuth";
				String fileName="fbcred.xlsx";
				String sheetName="Sheet1";
				String mailid = null, pwd = null;
				File file = new File(filePath+"\\"+fileName);
				FileInputStream ipStream=new FileInputStream(file);
				@SuppressWarnings("resource")
				Workbook workBook = new XSSFWorkbook(ipStream);
				Sheet sheet = workBook.getSheet(sheetName);
				int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
				System.out.println("Row count " +rowCount);
				for (int i = 0; i < rowCount+1; i++) {
			        Row row = sheet.getRow(i);
			        for (int j = 0; j < row.getLastCellNum(); j++) {
			            System.out.println(row.getCell(j).getStringCellValue()+"|| ");
			            if (i==0) {
			            	mailid = row.getCell(j).getStringCellValue();
			            	System.out.println("mail is "+mailid);
			            }
			            else {
			            	pwd = row.getCell(j).getStringCellValue();
			            	System.out.println("pwd is "+pwd);
			            }
			            
			        }
			        System.out.println();
			    }
				FB(mailid, pwd);
			}
	static void FB(String mail, String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("email")).sendKeys(mail);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button")).click();
	}


		}
