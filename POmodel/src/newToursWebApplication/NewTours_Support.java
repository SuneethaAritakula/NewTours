package newToursWebApplication;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_Support extends BaseTest
{
	@Test
	
	public void Support() {
		
  SupportMercuryTours WMTSupport = PageFactory.initElements(driver, SupportMercuryTours.class);
  WMTSupport.Support();
  driver.navigate().back();
  
  
			
		
		
	}

}
