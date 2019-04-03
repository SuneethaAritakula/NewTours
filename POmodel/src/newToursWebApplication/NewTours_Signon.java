package newToursWebApplication;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_Signon extends BaseTest{
	
	@Test
	
	public void Signon() throws IOException{
	SignonMercuryTours WTMSignOn = PageFactory.initElements(driver, SignonMercuryTours.class);
	
	
	WTMSignOn.Signon();

	
	FileInputStream file = new FileInputStream("./src/com/TestData/Test Data.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rowscount = sheet.getLastRowNum();

	for (int i= 0; i<=rowscount; i++)

	{
		Row r = sheet.getRow(i);
		
		WTMSignOn.login(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
		
		driver.navigate().refresh();
		driver.navigate().back();
	}}}
	
		
		
		/*for (int k= 0; k<cellcount; k++)
		{
			Cell c = r.getCell(k);
			String data = c.getStringCellValue();
			System.out.println(data);
		
		
		WTMSignOn.login(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
		driver.navigate().back();
		driver.navigate().refresh();
		}
	}
	}}*/

		
	





