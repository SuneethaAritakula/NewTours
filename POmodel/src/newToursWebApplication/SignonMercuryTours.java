package newToursWebApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignonMercuryTours{
	
	@FindBy(partialLinkText = "SIGN-ON")
	WebElement Signon;
	
	public void Signon()
	
	{
	Signon.click();
	}
	
	    @FindBy(name="userName")
		WebElement UserName;
		
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(name="login")
		WebElement Submit;
			
		public void login(String userName1, String pwd1) {
		UserName.clear();
		UserName.sendKeys(userName1);
		Password.clear();
		Password.sendKeys(pwd1);
		Submit.click();
		}
}




			

				
		
			


