package com.orangehrmlive.demo.cucumber.stepdefs;

import com.orangehrmlive.demo.pages.DashBoard;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LogOutStepdefs {
   /* @Then("^I am on dash board page$")
    public void iAmOnDashBoardPage() {
    }*/

    @Then("^I am on dash board page with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iAmOnDashBoardPageWithUserNameAndPassword(String userName,String password) {

        LoginPage loginPage=new LoginPage();
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }

    @When("^I click on welcome admin link$")
    public void iClickOnWelcomeAdminLink() throws InterruptedException {
        Thread.sleep(1000);
        new DashBoard().clickOnWelComeLink();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new DashBoard().clickOnLogoutButton();
    }

    @Then("^I should logged out successfully and navigate to main page with text\"([^\"]*)\"$")
    public void iShouldLoggedOutSuccessfullyAndNavigateToMainPageWithText(String expectedLoginPanelText)  {

        Assert.assertEquals(expectedLoginPanelText,new LoginPage().getTextFromLoginPanelLink());
    }

}
