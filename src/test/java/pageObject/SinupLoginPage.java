package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SinupLoginPage extends PageBase{
   public SinupLoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//a[@href='/login']")
    WebElement signupLoginLink;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement newUserSignupText;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement signupNameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signupEmailField;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signupButton;

    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginToYourAccountText;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement invalidEmailAndPasswordErrorMessage;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAddressAlreadyExistText;

    // Actions on the elements
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickSignupLoginLink() {
        signupLoginLink.click();
    }

    public boolean verifyNewUserSignupTextIsVisible() {
       return newUserSignupText.isDisplayed();
    }

    public void enterSignupName(String name) {
        signupNameField.sendKeys(name);
    }

    public void enterSignupEmail(String email) {
        signupEmailField.sendKeys(email);
    }

    public void clickSignupButton() {
        signupButton.click();
    }

    public boolean verifyLoginToYourAccountVisible(){
        return loginToYourAccountText.isDisplayed();
    }

    public boolean verifyErrorMessageIsVisible(){
        return invalidEmailAndPasswordErrorMessage.isDisplayed();
    }

    public boolean verifyEmailAddressAlreadyExistText(String text){
        if(emailAddressAlreadyExistText.isDisplayed()&& emailAddressAlreadyExistText.getText().equals(text)){
            return true;
        }else return false;
    }
}
