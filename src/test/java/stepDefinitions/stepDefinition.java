package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pageObject.*;

import java.io.IOException;
import java.util.Properties;

public class stepDefinition {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    SinupLoginPage sinupLoginPage = new SinupLoginPage(DriverFactory.getDriver());
    SinupPage sinupPage = new SinupPage(DriverFactory.getDriver());
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage(DriverFactory.getDriver());
    AccountDeletedPage accountDeletedPage = new AccountDeletedPage(DriverFactory.getDriver());
    ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());
    TestCasePage testCasePage = new TestCasePage(DriverFactory.getDriver());
    AllProductsPage allProductsPage = new AllProductsPage(DriverFactory.getDriver());
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(DriverFactory.getDriver());
    SearchProductPage searchProductPage = new SearchProductPage(DriverFactory.getDriver());
    CartPage cartPage = new CartPage(DriverFactory.getDriver());
    CheckoutPage checkoutPage = new CheckoutPage(DriverFactory.getDriver());

    String name = DriverFactory.randomeString();
    String email = DriverFactory.randomeString()+"@example.com";
    String quantity;

    @Given("Navigate to app url")
    public void navigate_to_url() {
        // Browser is launched and opens the app in setUp method
    }

    @When("User click on {string} button")
    public void user_click_button(String button) {
        switch (button){
            case "Signup Login":homePage.clickSignupLoginLink();break;
            case "Home":contactUsPage.clickHomeButton();break;
            case "Signup":sinupLoginPage.clickSignupButton();break;
            case "Create Account":sinupPage.clickCreateAccountButton();break;
            case "Continue":accountCreatedPage.clickContinueButton();break;
            case "Delete Account":homePage.clickDeleteAccountLink();break;
            case "login":sinupLoginPage.clickLoginButton();break;
            case "logout": homePage.clickLogoutLink();break;
            case "Products":homePage.clickProductsLink();break;
            case "Test Cases":homePage.clickTestCasesLink();break;
            case "Contact Us":homePage.clickContactUsLink();break;
            case "Submit":contactUsPage.clickSubmitButton();break;
            case "accept alert":DriverFactory.getDriver().switchTo().alert().accept();break;
            case "Continue Shopping":allProductsPage.clickContinueShoppingButton();break;
            case "View Cart":allProductsPage.clickViewCartLink();break;
            case "cart":homePage.clickCartLink();break;
            case "Add to cart": productDetailsPage.clickAddToCartButton();break;
            case "proceed to checkout button": cartPage.clickProceedToCheckoutButton();break;
            case "register and login": cartPage.clickRegisterAndLoginLink();break;

            default :Assert.fail();
        }
    }

    @Then("Verify {string} is visible")
    public void verify_text_is_visible(String text) {
        switch (text){
            case "New User Signup!":Assert.assertTrue(sinupLoginPage.verifyNewUserSignupTextIsVisible());break;
            case "home page":Assert.assertTrue(homePage.verifyingHomePage());break;
            case "ENTER ACCOUNT INFORMATION":Assert.assertTrue(sinupPage.varifyEnterAccountInformationText());break;
            case "ACCOUNT CREATED!":Assert.assertTrue(accountCreatedPage.verifyAccountCreatedText());break;
            case "Logged in as username":Assert.assertTrue(homePage.verifyLoginAsUsernameTextVisible());break;
            case "ACCOUNT DELETED!":Assert.assertTrue(accountDeletedPage.varifyAccountDeletedText()); accountDeletedPage.clickContinueButton();break;
            case "Login to your account":Assert.assertTrue(sinupLoginPage.verifyLoginToYourAccountVisible());break;
            case "Your email or password is incorrect!": sinupLoginPage.verifyErrorMessageIsVisible();break;
            case "ALL PRODUCTS":Assert.assertTrue(allProductsPage.isAllProductsHeaderVisible());break;
            case "products list":Assert.assertTrue(allProductsPage.isProductsListVisible());break;
            case "product detail page":Assert.assertTrue(productDetailsPage.isProductInformationVisible());break;
            case "test cases page":Assert.assertTrue(testCasePage.isTestCasesHeaderVisible());break;
            case "GET IN TOUCH":Assert.assertTrue(contactUsPage.verifyGetInTouchTextIsVisible());break;
            case "Success! Your details have been submitted successfully":Assert.assertTrue(contactUsPage.isSuccessMessageVisible());break;
            case "SEARCHED PRODUCTS": Assert.assertTrue(searchProductPage.isFeatureItemsVisible());break;
            case "All the products related to search":Assert.assertTrue(!(searchProductPage.isProductsVisible()));break;
            case "SUBSCRIPTION":Assert.assertTrue(homePage.subscriptionText.isDisplayed());break;
            case "You have been successfully subscribed!":Assert.assertTrue(homePage.verifySuccessfullySubscribedAlertMessageIsVisible());break;
            case "cart page": Assert.assertTrue(cartPage.isCartPageVisible());break;

            default : Assert.fail();
        }
    }

    @When("User enter name and email address")
    public void enter_name_and_email() {
        sinupLoginPage.enterSignupName(name);
        sinupLoginPage.enterSignupEmail(email);
    }

    @Then("Fill details: Title {string}, Password {string}, Date of birth {string}, {string}, {string}")
    public void fill_account_details(String title, String password, String day, String month, String year ) {
        if(title.equals("Mr")){
            sinupPage.selectTitleMr();
        }else if (title.equals("Mrs")){
            sinupPage.selectTitleMrs();
        }
        sinupPage.enterPassword(password);
        sinupPage.selectDay(day);
        sinupPage.selectMonth(month);
        sinupPage.selectYear(year);
    }

    @Then("Select checkbox {string}")
    public void select_checkbox(String text) {
        if (text.equals("Sign up for our newsletter!")){
        sinupPage.selectNewsletter();
        }if(text.equals("Receive special offers from our partners!")){
            sinupPage.selectOffers();
        }
    }

    @Then("Fill details: First name {string}, Last name {string}, Company {string}, Address {string}, Address2 {string}, Country {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
    public void fill_personal_details(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        sinupPage.enterFirstName(firstName);
        sinupPage.enterLastName(lastName);
        sinupPage.enterCompany(company);
        sinupPage.enterAddress1(address);
        sinupPage.enterAddress2(address2);
        sinupPage.selectCountry(country);
        sinupPage.enterState(state);
        sinupPage.enterCity(city);
        sinupPage.enterZipcode(zipcode);
        sinupPage.enterMobileNumber(mobileNumber);
    }

    @Then("Verify that 'ACCOUNT DELETED!' is visible and click continue button")
    public void verify_account_deleted_is_visible() {
        Assert.assertTrue(accountDeletedPage.varifyAccountDeletedText());
        accountDeletedPage.clickContinueButton();
    }

    @When("user enters name and already registered email address")
    public void user_enters_name_and_already_registered_email_address() throws IOException {
        sinupLoginPage.enterSignupEmail(DriverFactory.getProperties().getProperty("email"));
        sinupLoginPage.enterSignupName(DriverFactory.randomeString());
    }
    @Then("verifies that the error {string} is visible")
    public void user_verifies_that_the_error_is_visible(String text){
        Assert.assertTrue(sinupLoginPage.verifyEmailAddressAlreadyExistText(text));
    }

    @When("User enter the correct email address and password")
    public void user_enter_the_correct_email_address_and_password() throws IOException {
        Properties config = DriverFactory.getProperties();
        sinupLoginPage.enterEmail(config.getProperty("email"));
        sinupLoginPage.enterPassword(config.getProperty("password"));
    }


    @When("User enter the incorrect email address and password")
    public void user_enter_the_incorrect_email_address_and_password(){
        sinupLoginPage.enterEmail(DriverFactory.randomeString()+"@example.com");
        sinupLoginPage.enterPassword(DriverFactory.randomAlphaNumeric());
    }

    @Then("user verifies that 'GET IN TOUCH' is visible")
    public void user_verify_that_get_in_touch_is_visible(){
        Assert.assertTrue(contactUsPage.verifyGetInTouchTextIsVisible());
    }
    @When("user enters name, email, subject, and message")
    public void user_enters_name_email_subject_and_message(){
        contactUsPage.enterName(DriverFactory.randomeString());
        contactUsPage.enterEmail(DriverFactory.randomAlphaNumeric()+"@example.com");
        contactUsPage.enterSubject(DriverFactory.randomeString());
        contactUsPage.enterMessage(DriverFactory.randomeString());
    }

    @When("user uploads a file")
    public void user_upload_a_file(){
        String filePath = System.getProperty("user.dir")+"/testData/DummyFile.pdf";
        contactUsPage.uploadFile(filePath);
    }


    @Then("user verifies the success message 'Success! Your details have been submitted successfully.' is visible")
    public void user_verifies_the_success_message_Success_Your_details_have_been_submitted_successfully_is_visible(){
        Assert.assertTrue(contactUsPage.isSuccessMessageVisible());
    }

    @When("user clicks on {string} of the first product")
    public void userClicksOnViewProductOfTheFirstProduct(String link) {
        if(link.equals("View Product")){allProductsPage.clickFirstProductViewButton();}
    }


    @Then("user verifies that product details are visible: product name, category, price, availability, condition, brand")
    public void userVerifiesThatProductDetailsAreVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        if( productDetailsPage.isProductNameVisible()&&
                productDetailsPage.isProductAvailabilityVisible()&&
                productDetailsPage.isProductCategoryVisible()&&
                productDetailsPage.isProductPriceVisible()&&
                productDetailsPage.isProductConditionVisible()&&
                productDetailsPage.isProductBrandVisible()){
            Assert.assertTrue(true);
        }
    }
    @When("user enters product name {string} in search input and clicks the search button")
    public void userEntersProductNameInSearchInputAndClicksTheSearchButton(String product) {
        allProductsPage.enterSearchProduct(product);
        allProductsPage.clickSearchButton();
    }

    @When("User scrolls down to the footer")
    public void userScrollsDownToTheFooter(){
        DriverFactory.getJavascriptExecutor().executeScript("arguments[0].scrollIntoView();",homePage.footer);
    }


    @When("user enters email address in input and clicks the arrow button")
    public void userEnterEmailAddressInInputAndClicksTheArrowButton(){
        homePage.enterSubscriptionEmailField(DriverFactory.randomAlphaNumeric()+"@example.com");
        homePage.clickSubscriptionArrowButton();
    }


    @When("user clicks on the 'cart' button")
    public void userClicksOnTheCartButton(){
        homePage.clickCartLink();
    }

    @When("User hovers over {string} and click add to cart")
    public void userHoversOverFirstProductAndClicksAddToCart(String product) {
        switch (product){
            case "first product":allProductsPage.hoverFistProductArea();allProductsPage.clickFirstProductOverlayAddToCartButton();break;
            case "second product": allProductsPage.hoverSecondProductArea();allProductsPage.clickSecondProductOverlayAddToCartButton();break;
        }
    }

    @Then("Verifies both products are added to Cart")
    public void VerifiesBothProductsAreAddedToCart() {
       Assert.assertTrue(cartPage.isFirstItemVisible()&&cartPage.isSecondItemVisible());
    }

    @Then("Verifies their prices, quantity and total price")
    public void VerifiesTheirPricesQuantityAndTotalPrice() {

       int firstProductPrice = Integer.parseInt(cartPage.getFirstProductPrice().replaceAll("[^0-9]", ""));
       int fistProductQuantity = Integer.parseInt(cartPage.getFirstProductQuantity());
       int firstProductTotal = Integer.parseInt(cartPage.getFirstProductTotal().replaceAll("[^0-9]", ""));
       int secondProductPrice = Integer.parseInt(cartPage.getSecondProductPrice().replaceAll("[^0-9]", ""));
       int secondProductQuantity = Integer.parseInt(cartPage.getSecondProductQuantity());
       int secondProductTotal = Integer.parseInt(cartPage.getSecondProductTotal().replaceAll("[^0-9]", ""));

       Assert.assertTrue((firstProductPrice*fistProductQuantity==firstProductTotal)&&(secondProductPrice*secondProductQuantity==secondProductTotal));
    }

    @When("User increase quantity to {string}")
    public void userIncreaseQuantityTo(String quantity) {
        productDetailsPage.changeQuantity(quantity);
        this.quantity = quantity;
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(quantity, cartPage.getQuantity());
    }

    @Then("User review the Order")
    public void userReviewTheOrder() {
        checkoutPage.checkTotalOfEachProduct();
        checkoutPage.checkGrandTotal();
    }
}
