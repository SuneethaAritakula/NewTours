package newToursWebApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_HomePage extends BaseTest {
	
@Test

public void homepage() throws IOException {
WelcomeMercuryTours WMTHomepage = PageFactory.initElements(driver, WelcomeMercuryTours.class);

WMTHomepage.Signon();
driver.navigate().back();


WMTHomepage.Register();
driver.navigate().back();

WMTHomepage.Support();
driver.navigate().back();


WMTHomepage.Contact();
driver.navigate().back();


FileInputStream file = new FileInputStream("./src/com/TestData/Test Data.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("Sheet1");
int rowscount = sheet.getLastRowNum();

for (int i= 0; i<=rowscount; i++)

{
	Row r = sheet.getRow(rowscount);
	WMTHomepage.login(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
	
		driver.navigate().refresh();
		driver.navigate().back();


FileOutputStream file1 = new FileOutputStream("./src/com/TestResult.xlsx");
workbook.write(file1);
}




WMTHomepage.Destinations();
driver.navigate().back();

WMTHomepage.Vacations();
driver.navigate().back();

WMTHomepage.RegisterHere();
driver.navigate().back();

WMTHomepage.Links();
driver.navigate().back();

WMTHomepage.Home();
driver.navigate().back();

WMTHomepage.Flights();
driver.navigate().back();

WMTHomepage.Hotels();
driver.navigate().back();

WMTHomepage.CarRentals();
driver.navigate().back();

WMTHomepage.Cruises();
driver.navigate().back();

WMTHomepage.Destinations1();
driver.navigate().back();

WMTHomepage.Vacations1();
driver.navigate().back();

/*WMTHomepage.Images();
List<WebElement>allImages = driver.findElements(By.tagName("img"));
for(WebElement imageFromList:allImages){
    String ImageUrl=imageFromList.getAttribute("src");
*/








}




}
