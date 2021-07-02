package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends Utility {

    private static final Logger log= LogManager.getLogger(DashBoard.class.getName());

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeTextLink;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logoutBtn;

    public String getWelComeText(){
        log.info("Getting text from : "+ welcomeTextLink.toString());
        return getTextFromElement(welcomeTextLink);
    }

    public void clickOnWelComeLink(){
        log.info("Clicking on : "+welcomeTextLink.toString());
       mouseHoverToElementAndClick(welcomeTextLink);
    }

    public void clickOnLogoutButton(){
        log.info("Clicking on : "+logoutBtn.toString());
        clickOnElement(logoutBtn);
    }

}
