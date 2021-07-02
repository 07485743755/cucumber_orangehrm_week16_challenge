package com.orangehrmlive.demo.cucumber;

import com.cucumber.listener.Reporter;
import com.orangehrmlive.demo.basePage.BasePage;
import com.orangehrmlive.demo.propertyReader.PropertyReader;
import com.orangehrmlive.demo.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends BasePage {

    @Before

    public void openBrowser(){

        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Nidhi Lathiya");
    }

    @After

    public void tearDown(Scenario scenario){

        String screenshotPath= Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));

        try {
            Reporter.addScreenCaptureFromPath(screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        closeBrowser();
    }
}
