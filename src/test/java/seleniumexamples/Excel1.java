package seleniumexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\Achyuth";
		String fileName="fbcred.xlsx";
		String sheetName="Sheet1";
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
	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	        }
	        System.out.println();
	    } 	  
	}


}
