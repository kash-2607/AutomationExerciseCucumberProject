package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//td[@class='cart_quantity']/button")
    WebElement quantity ;

    public String getQuantity(){
        return quantity.getText();
    }
}
