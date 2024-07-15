package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends PageBase{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//tbody/tr") List<WebElement> totalItems;
    @FindBy(xpath = "//td[@class='cart_quantity']/button")
    List<WebElement> quantities;

    @FindBy(xpath = "//td[@class='cart_price']/p")
    List<WebElement> prices;

    @FindBy(xpath = "//td/p[@class='cart_total_price']")
    List<WebElement> totals;

    @FindBy(xpath = "//tbody/tr[last()]/td[last()]/p") WebElement grandTotal;

    @FindBy(xpath = "//textarea[@name='message']") WebElement description;

    @FindBy(xpath = "//a[normalize-space()='Place Order']") WebElement placeOrder;

    public boolean checkTotalOfEachProduct(){
        boolean check = false;
        for (int i =0; i<=(totalItems.size()-2); i++){
            int price = Integer.parseInt(prices.get(i).getText().replaceAll("[^0-9]", ""));
            int quantity = Integer.parseInt(quantities.get(i).getText());
            int expectedTotal = price*quantity;

            if (expectedTotal==Integer.parseInt(totals.get(i).getText().replaceAll("[^0-9]", ""))){
                check = true;
            }
        }
        return check;
    }

    public boolean checkGrandTotal(){
        int total = 0;
        boolean check = false;
        for(int i = 0; i<=(totalItems.size()-2); i++){
            total = total + Integer.parseInt(totals.get(i).getText().replaceAll("[^0-9]", ""));
        }
        if(total == Integer.parseInt(grandTotal.getText().replaceAll("[^0-9]", ""))){
            check = true;
        }
        return check;
    }

    public void enterDescription(String input){
        description.sendKeys(input);
    }
    public void clickPlaceOrder(){
        placeOrder.click();
    }


}
