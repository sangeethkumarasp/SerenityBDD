package pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FbImple extends Utility {

	
	FacebookLogin fblogin;

	@Step
	public void openapplication()
	{
		fblogin.open();
		
	}



	
	public void enterusername(String text)
	{
		WebElement er=fblogin.firstname;
		er.sendKeys(text);
	}
	
	public void enterlastname(String lastnam)
	{
		WebElement surnamee=fblogin.lastname;
		surnamee.sendKeys(lastnam);
	}
	
	
	public void enteremailaddress(String emailaddr)
	{
		WebElement emailaddres=fblogin.emailaddress;
		emailaddres.sendKeys(emailaddr);
	}
	
	
	public void reenteremailaddress(String reemailaddr)
	{
		WebElement emailaddres=fblogin.reenteremailaddress;
		emailaddres.sendKeys(reemailaddr);
	}
	
	
	public void enterpassword(String passwrd)
	{
		WebElement password=fblogin.newpassword;
		password.sendKeys(passwrd);
	}
	
	
	
	public void selectradiobutton(String radiooption)
	{
	List<WebElement>le=fblogin.genderradiobutton;
	
	
	for(WebElement ab:le)
	{
		if(ab.getText().equalsIgnoreCase(radiooption))
{
	ab.click();
}


	}
	}
	
	
	
	public void selectdayvalue(String day)
	{
		
		Select optionSelect = new Select(fblogin.daydropdown);

		List<WebElement>dayvalue=optionSelect.getOptions();
		
		optionSelect.selectByVisibleText(day);	
		
	}
	
	
	public void selectmonthvalue(String month)
	{
		
		Select Selectmonth = new Select(fblogin.MonthDropdown);

		List<WebElement>monthvalue=Selectmonth.getOptions();
		
		Selectmonth.selectByVisibleText(month);	
		
	}
	
	
	public void selectyearvalue(String year)
	{
		
		Select Selectyear = new Select(fblogin.YearDropdown);

		List<WebElement>yearvalue=Selectyear.getOptions();
		
		Selectyear.selectByVisibleText(year);	
		
	}
	
	public void signupclick()
	{
		
		WebElement er=fblogin.Signup;
		er.click();
		
	}
	
	
	
	
	public void fbusername(String text)
	{
		Utility.userinput( text,fblogin.loginemail);
	}
	
	public void fbpassword(String text)
	{
		Utility.userinput( text,fblogin.loginpassword);
	}
	
	public void loginclick() throws InterruptedException
	{
		WebElement er=fblogin.loginbutton;
		
		
		er.click();
		Thread.sleep(3000);
	}
	
	public String loginalert()
	{
		
		String a=Utility.gettext(fblogin.fbLoginalert);
		return a;
	}
	
	public WebElement webele()
	{
		WebElement we=fblogin.otptriggermsg;
		return we;
	}
	

	
		
	
	
	
}
