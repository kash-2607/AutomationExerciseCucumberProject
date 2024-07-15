package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;

    @FindBy(xpath="//input[@placeholder='Name']")
    WebElement nameField;

    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement emailField;

    @FindBy(xpath="//input[@placeholder='Subject']")
    WebElement subjectField;

    @FindBy(id = "message")
    WebElement messageField;

    @FindBy(name = "upload_file")
    WebElement uploadFileInput;

    @FindBy(name = "submit")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessage;

    @FindBy(xpath="//span[normalize-space()='Home']")
    WebElement homeButton;

    // Methods to interact with the elements

    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterSubject(String subject) {
        subjectField.sendKeys(subject);
    }

    public void enterMessage(String message) {
        messageField.sendKeys(message);
    }

    public void uploadFile(String filePath) {
        uploadFileInput.sendKeys(filePath);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isSuccessMessageVisible() {
        return successMessage.isDisplayed();
    }

    public void clickHomeButton() {
        homeButton.click();
    }

    public boolean isHomePageVisible() {
        return driver.getTitle().equals("Automation Exercise");
    }

    public boolean verifyGetInTouchTextIsVisible(){
        return getInTouchText.isDisplayed();
    }

}
