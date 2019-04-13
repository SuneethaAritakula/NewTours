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
String expected_url = "http://www.newtours.demoaut.com/mercurysignon.php";
System.out.println("The expected title is: "+expected_url);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

String actual_url = driver.getCurrentUrl();
System.out.println("The actual url is: "+actual_url);

if((actual_url.contains(expected_url)))
	
{
	System.out.println("Signon link is working - Pass");
}
		
else
	{
	System.out.println("Signon link is not working - Fail");	
	}


System.out.println();
driver.navigate().back();


WMTHomepage.Register();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.Support();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();


WMTHomepage.Contact();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();


FileInputStream file = new FileInputStream(".\\src\\com\\TestData\\Test Data.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("Sheet1");
int rowscount = sheet.getLastRowNum();

for (int i= 0; i<rowscount; i++)

{
	Row r = sheet.getRow(rowscount);
	WMTHomepage.login(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
	
		driver.navigate().refresh();
		driver.navigate().back();


FileOutputStream file1 = new FileOutputStream("./src/com/TestResult/Test output.xlsx");
workbook.write(file1);
}




WMTHomepage.Destinations();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
FileOutputStream file1 = new FileOutputStream("./src/com/TestResult/Test output.xlsx");
workbook.write(file1);
driver.navigate().back();

WMTHomepage.Vacations();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
FileOutputStream file2 = new FileOutputStream("./src/com/TestResult/Test output.xlsx");
workbook.write(file2);
driver.navigate().back();

WMTHomepage.RegisterHere();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
FileOutputStream file3 = new FileOutputStream("./src/com/TestResult/Test output.xlsx");
workbook.write(file3);
driver.navigate().back();

WMTHomepage.Links();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.Home();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.Flights();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.Hotels();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.CarRentals();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.Cruises();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.Destinations1();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

WMTHomepage.Vacations1();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();

/*WMTHomepage.Images();
List<WebElement>allImages = driver.findElements(By.tagName("img"));
for(WebElement imageFromList:allImages){
    String ImageUrl=imageFromList.getAttribute("src");
*/








}




}
