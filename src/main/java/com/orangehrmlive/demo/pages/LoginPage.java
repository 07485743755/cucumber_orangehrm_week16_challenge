package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log= LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanelLink;

    public void enterUserName(String userName){
         log.info("Send text "+userName+" to field "+userNameField.toString());
        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password){
        log.info("Send text to "+password+" to field "+passwordField.toString());
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        log.info("Clicking on : "+loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getTextFromLoginPanelLink(){
        log.info("Getting Text from : "+loginPanelLink.toString());
        return getTextFromElement(loginPanelLink);
    }
}
