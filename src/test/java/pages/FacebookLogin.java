package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.pages.PageObject;


public class FacebookLogin extends PageObject {
	
//	public void firstname(String Text)
//	{
//	$(By.xpath("//input[@name='firstname']")).type(Text);
//	}
	
	
	@FindBy(xpath=("//input[@name='firstname']"))
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//div[contains(text(),'Mobile number or email address')]/following-sibling::input")
    WebElement emailaddress;
	
	@FindBy(xpath="//div[contains(text(),'New password')]/following-sibling::input")
	WebElement newpassword;
	
	@FindBy(xpath="//div[contains(text(),'Re-enter email address')]/following-sibling::input")
	WebElement reenteremailaddress;
	
	@FindBy(xpath="//label[contains(text(),'Male')]")
	WebElement maleradiobutton;
	
	@FindBy(xpath="//input[@name='sex']/following-sibling::label")
	List<WebElement> genderradiobutton;
	

	@FindBy(xpath="//select[@id='day']")
	WebElement daydropdown;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement MonthDropdown;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement YearDropdown;
	
	
	@FindBy(xpath="//button[@name='websubmit']")
	WebElement Signup;
	
	@FindBy(xpath="//div[@role='alert']")
	public WebElement fbLoginalert;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement loginemail;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement loginpassword;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	WebElement loginbutton;
	
	@FindBy(xpath="//div/h2[@class='uiHeaderTitle' and text()='Enter the code from your email']")
	WebElement otptriggermsg;
	
//	public FacebookLogin()
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
//	//public void enterusername(String username)
//	{
//	//	firstname.sendKeys(username);
//	}
//	public void enterlastname(String lastname)
//	{
//		lastname.sendKeys(lastname);
//	}
	
//	public void enteremailaddress(String emailid)
//	{
//		emailaddress.sendKeys(emailid);
//	}
	
	
	
	
}
