package newToursWebApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportMercuryTours {
	
	@FindBy(linkText = "SUPPORT")
	WebElement Support;
	
	public void Support()
	{
	Support.click();
	
	

}}
