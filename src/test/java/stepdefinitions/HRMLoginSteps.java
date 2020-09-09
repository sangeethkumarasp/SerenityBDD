package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HRMLoginPage;

public class HRMLoginSteps {

    HRMLoginPage hrmLoginPage;

    @Given("^I am on HRMLogin page$")
    public void navigateToHomePage(){
        hrmLoginPage.open();
    }

    @Given("^I enter (.*) username and (.*) password$")
    public void enterUsernamePassword(String userName, String passWord){
        if(userName.equalsIgnoreCase("empty")){
            hrmLoginPage.enterPassword(passWord);
        }else if(passWord.equalsIgnoreCase("empty")) {
            hrmLoginPage.enterUserName(userName);
        }else if(!(userName.equalsIgnoreCase("empty") && passWord.equalsIgnoreCase("empty"))){
            hrmLoginPage.enterUserName(userName);
            hrmLoginPage.enterPassword(passWord);
        }
    }

    @When("^I click on login button$")
    public void clickLoginButton(){
        hrmLoginPage.clickLoginBtn();
    }

    @Then("^Login should be successfull$")
    public void validateLogin(){
        Assert.assertTrue("Login is not successful", hrmLoginPage.confirmLogin().contains("Welcome"));
    }

    @Then("^Login should be unsuccessfull$")
    public void validateLogin1(){
        Assert.assertTrue("Login is unsuccessful due to invalid credentials", hrmLoginPage.loginError().contains("Invalid credentials"));
    }
}
