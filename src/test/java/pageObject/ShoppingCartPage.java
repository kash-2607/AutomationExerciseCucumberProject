package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//tr[@id='product-1']") WebElement firstItem;
    @FindBy(xpath = "//tr[@id='product-2']") WebElement secondItem;
    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_price']/p") WebElement firstProductPrice;
    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_quantity']/button") WebElement firstProductQuantity;
    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_total']/p")WebElement firstProductTotal;
    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_price']/p") WebElement secondProductPrice;
    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_quantity']/button") WebElement secondProductQuantity;
    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_total']/p")WebElement secondProductTotal;


    public boolean isFirstItemVisible(){return firstItem.isDisplayed();}

    public boolean isSecondItemVisible(){return secondItem.isDisplayed();}

    public String getFirstProductPrice(){return firstProductPrice.getText();}

    public String getFirstProductQuantity(){return firstProductQuantity.getText();}

    public String getFirstProductTotal(){return firstProductTotal.getText();}

    public String getSecondProductPrice(){return secondProductPrice.getText();}

    public String getSecondProductQuantity(){return secondProductQuantity.getText();}

    public String getSecondProductTotal(){return secondProductTotal.getText();}

}
