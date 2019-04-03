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
		
	for(int i = 0; i<rowscount; i++) 
	{
		Row r = sheet.getRow(i);
	
	RMT.newuserregistration(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue(), r.getCell(2).getStringCellValue(), r.getCell(3).getStringCellValue(),r.getCell(4).getStringCellValue(),r.getCell(5).getStringCellValue(),r.getCell(6).getStringCellValue(),r.getCell(7).getStringCellValue(),r.getCell(8).getStringCellValue(),r.getCell(9).getStringCellValue(),r.getCell(10).getStringCellValue(),r.getCell(11).getStringCellValue());
	driver.navigate().refresh();
	driver.navigate().back();


	FileOutputStream file1 = new FileOutputStream("./src/com/TestResult.xlsx");
	workBook.write(file1);
			
		}
			
			
			
			
		}}
			
		
		
		
		
		
	


