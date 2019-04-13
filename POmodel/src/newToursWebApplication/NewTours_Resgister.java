package newToursWebApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//test runner class

public class NewTours_Resgister extends BaseTest {
	
	@Test
	
	public void Register() throws IOException {
	RegisterMercuryTours RMT = PageFactory.initElements(driver, RegisterMercuryTours.class);
		
		RMT.Register();
		
		FileInputStream File = new FileInputStream("./src/com/TestData/Test Data.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(File);
		XSSFSheet sheet = workBook.getSheet("Sheet2");
			
		int rowscount = sheet.getLastRowNum();
			
		for(int i = 0; i<=rowscount; i++) 
		{
			Row r = sheet.getRow(i);
		    double d = r.getCell(2).getNumericCellValue();
			long x= (long)d;
			String phonenumber1 =Long.toString(x);
			
			Row r1 = sheet.getRow(4);
			r1.getCell(7).getNumericCellValue();
			 long y=(long)d;
			 String postalcode1 = Long.toString(y);
			 
			 
			 
		RMT.newuserregistration(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue(),phonenumber1, r.getCell(3).getStringCellValue(),r.getCell(4).getStringCellValue(), r.getCell(5).getStringCellValue(),r.getCell(6).getStringCellValue(),postalcode1,r.getCell(8).getStringCellValue());
		
		//RMT.phonenumber(phonenumber1);
							
		driver.navigate().refresh();
		//driver.navigate().back();

		FileOutputStream file = new FileOutputStream("./src/com/TestResult.xlsx");
		workBook.write(file);
				
			}
			
		
		FileInputStream File1 = new FileInputStream("./src/com/TestData/Test Data.xlsx");
		XSSFWorkbook workBook1 = new XSSFWorkbook(File1);
		XSSFSheet sheet1 = workBook1.getSheet("Sheet2");
			
		int rowscount1 = sheet1.getLastRowNum();
			
		for(int k = 0; k<=rowscount1; k++) 
		{
			Row r = sheet1.getRow(k);
			
		RMT.settingupanaccount(r.getCell(9).getStringCellValue(),r.getCell(10).getStringCellValue(),r.getCell(11).getStringCellValue());	
		
	System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().back();


		FileOutputStream file1 = new FileOutputStream("./src/com/TestResult.xlsx");
		workBook1.write(file1);	
				
		}}}
				

	


