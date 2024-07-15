package pageObject;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='item active']//h1[1]")
    WebElement verifyHomePage;

    @FindBy(xpath = "//a[text()=' Home']")
    WebElement homeLink;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupLoginLink;

    @FindBy(xpath = "//a[text()=' Contact us']")
    WebElement contactUsLink;

    @FindBy(xpath = "//a[text()=' Test Cases']")
    WebElement testCasesLink;

    @FindBy(xpath = "//a[text()=' Products']")
    WebElement productsLink;

    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement cartLink;

    @FindBy(xpath = "//a[text()=' API Testing']")
    WebElement apiTestingLink;

    @FindBy(xpath = "//a[text()=' Video Tutorials']")
    WebElement videoTutorialsLink;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li//a/b")
    WebElement loginAsUsernameText;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccountLink;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutLink;

    @FindBy(xpath = "//footer[@id='footer']")
    public WebElement footer;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscriptionText;


    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmailField;

    @FindBy(xpath = "//button[@id='subscribe']")
    WebElement subscriptionArrowButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement successfullySubscribedAlertMessage;


    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickSignupLoginLink() {
        signupLoginLink.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickTestCasesLink() {
        testCasesLink.click();
    }

    public void clickProductsLink() {
        productsLink.click();
    }

    public void clickCartLink() {
        cartLink.click();
    }

    public void clickApiTestingLink() {
        apiTestingLink.click();
    }

    public void clickVideoTutorialsLink() {
        videoTutorialsLink.click();
    }
    public boolean verifyingHomePage(){
        return verifyHomePage.isDisplayed();
    }
    public boolean verifyLoginAsUsernameTextVisible(){
       return loginAsUsernameText.isDisplayed();
    }

    public void clickDeleteAccountLink(){
        deleteAccountLink.click();
    }
    public void clickLogoutLink(){
        logoutLink.click();
    }

    public void enterSubscriptionEmailField(String email){
        subscriptionEmailField.sendKeys(email);
    }

    public void clickSubscriptionArrowButton(){
        subscriptionArrowButton.click();
    }

    public boolean verifySuccessfullySubscribedAlertMessageIsVisible(){
        return successfullySubscribedAlertMessage.isDisplayed();
    }

}
