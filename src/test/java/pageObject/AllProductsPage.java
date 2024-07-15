package pageObject;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class AllProductsPage extends PageBase{
    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text()='All Products']")
    WebElement allProductsHeader;

    @FindBy(xpath = "//div[@class='features_items']")
    WebElement productsList;

    @FindBy(xpath = "//div[@class='features_items']/div[2]//div[@class='choose']//a")
    WebElement firstProductViewButton;

    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProductBox;

    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4'][1]//div[@class='productinfo text-center']")
    WebElement firstProductHoverArea;

    @FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4'][2]//div[@class='productinfo text-center']")
    WebElement secondProductHoverArea;

    @FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4'][1]//div[@class='overlay-content']/a")
    WebElement firstProductOverlayAddToCartButton;

    @FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4'][2]//div[@class='overlay-content']/a")
    WebElement secondProductOverlayAddToCartButton;

    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartLink;
    // Methods
    public boolean isAllProductsHeaderVisible() {
        return allProductsHeader.isDisplayed();
    }

    public boolean isProductsListVisible() {
        return productsList.isDisplayed();
    }

    public void clickFirstProductViewButton() {
        firstProductViewButton.click();
    }

    public void enterSearchProduct(String productName){ searchProductBox.sendKeys(productName); }

    public void clickSearchButton(){searchButton.click();}

    public void hoverFistProductArea(){Actions action = new Actions(driver);action.moveToElement(firstProductHoverArea).perform();}

    public void clickFirstProductOverlayAddToCartButton(){firstProductOverlayAddToCartButton.click();}

    public void clickContinueShoppingButton(){continueShoppingButton.click();}

    public void hoverSecondProductArea(){Actions action = new Actions(driver);action.moveToElement(secondProductHoverArea).perform();}

    public void clickSecondProductOverlayAddToCartButton(){secondProductOverlayAddToCartButton.click();}

    public void clickViewCartLink(){viewCartLink.click();}
}
