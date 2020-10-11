package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashBoardPage;
import pages.HRMLoginPage;

public class HRMLoginSteps {

    HRMLoginPage hrmLoginPage;
    DashBoardPage dashBoardPage;

    @Given("^I am on HRMLogin page$")
    public void navigateToHomePage(){
        hrmLoginPage.open();
    }

    @Given("^I enter (.*) username and (.*) password$")
    public void enterUsernamePassword(String userName, String passWord){
        if(userName.equalsIgnoreCase("blank")){
            hrmLoginPage.enterPassword(passWord);
        }else if(passWord.equalsIgnoreCase("blank")) {
            hrmLoginPage.enterUserName(userName);
        }else if(!(userName.equalsIgnoreCase("blank") && passWord.equalsIgnoreCase("blank"))){
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
        Assert.assertTrue("Login is not successful", dashBoardPage.confirmLogin().contains("Welcome"));
    }

    @Then("^Login is unsuccessfull because of (InvalidCredentials|BlankUsername|BlankPassword)$")
    public void validateLoginForInvalidCredentials(String reason){
        if(reason.contentEquals("InvalidCredentials")) {
            Assert.assertTrue("Login is unsuccessful due to invalid credentials", hrmLoginPage.loginErrorInvalidCredentials().contains("Invalid credentials"));
        }else if(reason.contentEquals("BlankUsername")){
            Assert.assertTrue("Login is unsuccessful due to blank username", hrmLoginPage.loginErrorBlankUsername().contains("Username cannot be empty"));
        }else {
            Assert.assertTrue("Login is unsuccessful due to blank password", hrmLoginPage.loginErrorBlankPassword().contains("Password cannot be empty"));
        }
    }
}
