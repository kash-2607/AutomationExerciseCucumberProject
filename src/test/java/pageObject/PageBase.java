package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    WebDriver driver;
    PageBase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
