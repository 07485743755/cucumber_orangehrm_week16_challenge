package com.orangehrmlive.demo.cucumber;


import com.cucumber.listener.Reporter;
import com.orangehrmlive.demo.propertyReader.PropertyReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "json:target/RunCuke/cucumber.json"
        },
        tags = "@Smoke,@Sanity,@Regression"
)
public class CukeTest {

    public static void setUp() {

        String reportPath = System.getProperty("user.dir");
        String reportConfigPath = reportPath + "/src/test/java/resources/extentReport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine","Windows 10"+"64 bit");
        Reporter.setSystemInfo("Selenium","3.141.59");
        Reporter.setSystemInfo("Maven","3.5.9");
        Reporter.setSystemInfo("Java version","1.8.0_121");
    }
}