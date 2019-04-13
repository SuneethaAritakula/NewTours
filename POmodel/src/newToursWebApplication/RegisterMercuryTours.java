package newToursWebApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//object repository class

public class RegisterMercuryTours {
	
	@FindBy(partialLinkText = "REGISTER")
	WebElement Register;

	public void Register()

	{
	Register.click();

	}
	
@FindBy (name = "firstName")
WebElement  FirstName;

@FindBy(name = "lastName")
WebElement lastName;

@FindBy(name = "phone")
WebElement phone;

////*[@id="userName"]
@FindBy(xpath = "//*[@id='userName']")
WebElement Email;

@FindBy(name = "address1")
WebElement Addressline1;

@FindBy(name = "city")
WebElement city;

@FindBy(name = "state")
WebElement StateProvince;

@FindBy(name = "postalCode")
WebElement Postalcode;

@FindBy(name="country")
WebElement Country;


public void newuserregistration(String firstName, String lastname, String phonenumber, String email, String addressline1, String state,String City, String postalcode, String country) 
{
FirstName.sendKeys(firstName);
lastName.sendKeys(lastname);
phone.sendKeys(phonenumber);
Email.sendKeys(email);
Addressline1.sendKeys(addressline1);
city.sendKeys(City);
StateProvince.sendKeys(state);
Postalcode.sendKeys(postalcode);
Country.sendKeys(country);
}

//public void phonenumber (String phonenumber)
//double d = r.getCell(2).getNumericCellValue();
 //long x= (long)d;
 //String phonenumber =Long.toString(x)
//Phone.sendKeys(phonenumber);
/*public void Country(String country1) 
{
	//Select contryseletion = new Select
	//countryselection.selectByVisibleText("INDIA");
	Country1.sendKeys(country1);
}*/
//FindBy(name = "country")
//WebElement Country;

//public void Country1()

//{
	//Select countryselection = new Select(Country1);
	//countryselection.selectByVisibleText("INDIA");
	
	//Country.sendKeys("INDIA");
//}


@FindBy(id = "email")
WebElement UserName;

@FindBy(name = "password")
WebElement password;

@FindBy(name = "confirmPassword")
WebElement confirmpassword;

@FindBy(name = "register")
WebElement Submit;

public void settingupanaccount(String username, String Password, String Confirmpassword)

{
	UserName.clear();
UserName.sendKeys(username);
password.clear();
password.sendKeys(Password);
confirmpassword.clear();
confirmpassword.sendKeys(Confirmpassword);
Submit.click();
System.out.println();

}


}
