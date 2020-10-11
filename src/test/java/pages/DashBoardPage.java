package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends PageObject {

    @FindBy(xpath="//a[contains(text(), 'Welcome')]")
    WebElementFacade loginConfirmation;
    public String confirmLogin(){
        return loginConfirmation.getText();
    }
}
