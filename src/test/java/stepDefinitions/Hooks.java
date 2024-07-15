package stepDefinitions;

import factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.util.Properties;

public class Hooks
{
    WebDriver driver;
    Properties config;
    JavascriptExecutor javascriptExecutor;
    @Before
    public void setup() throws IOException {
        driver = DriverFactory.initializeBrowser();
        config = DriverFactory.getProperties();
        driver.get(config.getProperty("appURL"));
//        javascriptExecutor = DriverFactory.getJavascriptExecutor();
    }
//    @After
//    public void tearDown(){
//        driver.quit();
//
//    }
}
