package newToursWebApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//object repository class

public class RegisterMercuryTours {
	
	@FindBy(linkText = "REGISTER")
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
WebElement Phone;


////*[@id="userName"]
@FindBy(xpath = "//*[@id='userName']")
WebElement Email;

@FindBy(name = "address1")
WebElement Addressline1;

@FindBy(name = "city")
WebElement city;

@FindBy(name = "state")
WebElement StateProvince;

@FindBy(name = "postalcode")
WebElement Postalcode;

@FindBy(name = "country")
WebElement Country;

@FindBy(id = "email")
WebElement UserName;

@FindBy(name = "password")
WebElement password;

@FindBy(name = "confirmpassword")
WebElement confirmpassword;



public void newuserregistration(String firstName, String lastname, String phone, String email, String addressline1, String state,String City, String postalcode, String country, String username, String Password, String Confirmpassword) {
FirstName.sendKeys(firstName);
lastName.sendKeys(lastname);
Phone.sendKeys(phone);
Email.sendKeys(email);
Addressline1.sendKeys(addressline1);
city.sendKeys(City);
StateProvince.sendKeys(state);
Postalcode.sendKeys(postalcode);
Country.sendKeys(country);
UserName.sendKeys(username);
password.sendKeys(Password);
confirmpassword.sendKeys(Confirmpassword);

}}
