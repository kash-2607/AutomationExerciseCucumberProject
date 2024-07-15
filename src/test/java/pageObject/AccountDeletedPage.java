package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends PageBase{
    public AccountDeletedPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeletedText;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    public boolean varifyAccountDeletedText(){
        return accountDeletedText.isDisplayed();
    }
    public void clickContinueButton(){
        continueButton.click();
    }
}
