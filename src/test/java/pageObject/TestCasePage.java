package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends PageBase {
   public TestCasePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//b[normalize-space()='Test Cases']")
    WebElement testCasesHeader;

   public boolean isTestCasesHeaderVisible(){
       return testCasesHeader.isDisplayed();
   }

}
