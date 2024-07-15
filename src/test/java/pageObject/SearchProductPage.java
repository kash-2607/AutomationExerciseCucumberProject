package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchProductPage extends PageBase{
    public SearchProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='features_items']")
    WebElement featureItem;

    @FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4']")
    List<WebElement>products;

    public boolean isFeatureItemsVisible(){
        return featureItem.isDisplayed();
    }
    public boolean isProductsVisible(){
        return products.isEmpty();
    }

}
