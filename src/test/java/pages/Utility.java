package pages;

import org.openqa.selenium.WebElement;

public class Utility {
	
	
	public static void userinput(String inputtext,WebElement aw)
	{
		aw.sendKeys(inputtext);
	}
	
	public static String gettext(WebElement we)
	{
		String b=we.getText();
		return b;
		
	}

	public static void clickfunction(WebElement we)
	{
		we.click();

	}

}
