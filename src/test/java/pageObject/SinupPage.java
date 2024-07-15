package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SinupPage extends PageBase{
   public SinupPage(WebDriver driver) {
        super(driver);
   }

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement titleMr;

    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement titleMrs;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//select[@id='days']")
    WebElement dayDropdown;

    @FindBy(xpath = "//select[@id='months']")
    WebElement monthDropdown;

    @FindBy(xpath = "//select[@id='years']")
    WebElement yearDropdown;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterCheckbox;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement offersCheckbox;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@id='company']")
    WebElement companyField;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1Field;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2Field;

    @FindBy(xpath = "//select[@id='country']")
    WebElement countryDropdown;

    @FindBy(xpath = "//input[@id='state']")
    WebElement stateField;

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;

    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcodeField;

    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumberField;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccountButton;

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;

    // Actions on the elements

    public void selectTitleMr() {
        titleMr.click();
    }

    public void selectTitleMrs() {
        titleMrs.click();
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void selectDay(String day) {
        dayDropdown.sendKeys(day);
    }

    public void selectMonth(String month) {
        monthDropdown.sendKeys(month);
    }

    public void selectYear(String year) {
        yearDropdown.sendKeys(year);
    }

    public void selectNewsletter() {
        Actions action = new Actions(driver);
        action.click(newsletterCheckbox).perform();
    }

    public void selectOffers() {
        offersCheckbox.click();
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterCompany(String company) {
        companyField.sendKeys(company);
    }

    public void enterAddress1(String address1) {
        address1Field.sendKeys(address1);
    }

    public void enterAddress2(String address2) {
        address2Field.sendKeys(address2);
    }

    public void selectCountry(String country) {
        countryDropdown.sendKeys(country);
    }

    public void enterState(String state) {
        stateField.sendKeys(state);
    }

    public void enterCity(String city) {
        cityField.sendKeys(city);
    }

    public void enterZipcode(String zipcode) {
        zipcodeField.sendKeys(zipcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        mobileNumberField.sendKeys(mobileNumber);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public boolean varifyEnterAccountInformationText(){
        return enterAccountInformationText.isDisplayed();
    }

}
