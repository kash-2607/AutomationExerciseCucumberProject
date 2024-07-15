package factory;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class DriverFactory {
    static WebDriver driver;
    static Properties config;

    public static Properties getProperties() throws IOException {
        FileReader file = new FileReader("./src/test/resources/config.properties");
        config = new Properties();
        config.load(file);
        return config;
    }


    public static WebDriver initializeBrowser() throws IOException {
        if(getProperties().getProperty("execution_env").equalsIgnoreCase("global")){
            DesiredCapabilities capabilities = new DesiredCapabilities();

            //os
            switch (getProperties().getProperty("os")){
                case "windows": capabilities.setPlatform(Platform.WIN11);break;
                case "mac": capabilities.setPlatform(Platform.MAC);break;
                case "linux": capabilities.setPlatform(Platform.LINUX);break;
                default: System.out.println("Invalid OS");
                         driver = null;
            }
            //browser
            switch (getProperties().getProperty("browser")){
                case "chrome": driver = new ChromeDriver();break;
                case "edge": driver = new EdgeDriver();break;
                case "firefox": driver = new FirefoxDriver();break;
                default: System.out.println("Invalid browser");
            }
            driver = new RemoteWebDriver(new URL(getProperties().getProperty("appURL")),capabilities);
        } else if (getProperties().getProperty("execution_env").equalsIgnoreCase("local")) {
            //browser
            switch (getProperties().getProperty("browser")){
                case "chrome": driver = new ChromeDriver();break;
                case "edge": driver = new EdgeDriver();break;
                case "firefox": driver = new FirefoxDriver();break;
                default: System.out.println("Invalid browser");
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public static JavascriptExecutor getJavascriptExecutor(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        return javascriptExecutor;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static String randomeString() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }

    public static String randomNumber() {
        String generatedString = RandomStringUtils.randomNumeric(5);
        return generatedString;
    }

    public static String randomAlphaNumeric() {
        String str = RandomStringUtils.randomAlphabetic(5);
        String num = RandomStringUtils.randomNumeric(5);
        return str + num;
    }
}
