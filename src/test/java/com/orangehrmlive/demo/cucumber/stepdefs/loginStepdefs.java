package com.orangehrmlive.demo.cucumber.stepdefs;

import com.orangehrmlive.demo.pages.DashBoard;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class loginStepdefs {
    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @When("^I enter user name \"([^\"]*)\" in user name field and password \"([^\"]*)\" in password field$")
    public void iEnterUserNameInUserNameFieldAndPasswordInPasswordField(String userName, String password)  {
        new LoginPage().enterUserName(userName);
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @Then("^I should successfully logged in and navigate to dashboard page successfully with text \"([^\"]*)\"$")
    public void iShouldSuccessfullyLoggedInAndNavigateToDashboardPageSuccessfullyWithText(String expectedText) throws InterruptedException {

        Thread.sleep(1000);
       Assert.assertTrue(new DashBoard().getWelComeText().contains(expectedText));
    }


}
