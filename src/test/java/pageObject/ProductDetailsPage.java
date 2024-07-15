package pageObject;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    // Web Elements
    @FindBy(xpath = "//div[@class='product-information']")
    WebElement productInformation;

    @FindBy(xpath = "//div[@class='product-information']//h2")
    WebElement productName;

    @FindBy(xpath = "//p[contains(text(),'Category')]")
    WebElement productCategory;

    @FindBy(xpath = "//span[contains(text(),'Rs.')]")
    WebElement productPrice;

    @FindBy(xpath = "//b[normalize-space()='Availability:']")
    WebElement productAvailability;

    @FindBy(xpath = "//b[normalize-space()='Condition:']")
    WebElement productCondition;

    @FindBy(xpath = "//b[normalize-space()='Brand:']")
    WebElement productBrand;

    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantity;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;

    // Methods
    public boolean isProductInformationVisible() {
        return productInformation.isDisplayed();
    }

    public String getProductName() {
        return productName.getText();
    }

    public boolean isProductNameVisible() {
        return productName.isDisplayed();
    }

    public String getProductCategory() {
        return productCategory.getText();
    }

    public boolean isProductCategoryVisible() {
        return productCategory.isDisplayed();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public boolean isProductPriceVisible() {
        return productPrice.isDisplayed();
    }

    public String getProductAvailability() {
        return productAvailability.getText();
    }

    public boolean isProductAvailabilityVisible() {
        return productAvailability.isDisplayed();
    }

    public String getProductCondition() {
        return productCondition.getText();
    }

    public boolean isProductConditionVisible() {
        return productCondition.isDisplayed();
    }

    public String getProductBrand() {
        return productBrand.getText();
    }

    public boolean isProductBrandVisible() {
        return productBrand.isDisplayed();
    }

    public void changeQuantity(String q) {
        quantity.clear();
        quantity.sendKeys(q);
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

}
