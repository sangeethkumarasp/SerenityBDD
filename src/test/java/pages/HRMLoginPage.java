package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HRMLoginPage extends PageObject {

        @FindBy(xpath="//input[@id='txtUsername']")
        WebElementFacade userName;
        public void enterUserName(String name){
                userName.sendKeys(name);
        }

        @FindBy(xpath="//input[@id='txtPassword']")
        WebElementFacade loginPassword;
        public void enterPassword(String password){
                loginPassword.sendKeys(password);
        }

        @FindBy(xpath="//input[@id='btnLogin']")
        WebElementFacade loginButton;
        public void clickLoginBtn(){
                loginButton.click();
        }

        @FindBy(xpath="//span[contains(text(), 'Invalid credentials')]")
        WebElementFacade spanMessage;
        public String loginErrorInvalidCredentials(){
            return spanMessage.getText();
        }

        @FindBy(xpath="//span[contains(text(), 'Username cannot be empty')]")
        WebElementFacade blankUsername;
        public String loginErrorBlankUsername(){
                return blankUsername.getText();
        }

        @FindBy(xpath="//span[contains(text(), 'Password cannot be empty')]")
        WebElementFacade blankPassword;
        public String loginErrorBlankPassword(){
                return blankPassword.getText();
        }
}


