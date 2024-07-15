package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends PageBase{
   public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedText;

   @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

   public boolean verifyAccountCreatedText(){
       return accountCreatedText.isDisplayed();
   }

   public void clickContinueButton(){
       continueButton.click();
   }
}
