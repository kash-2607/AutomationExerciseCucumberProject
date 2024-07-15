package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = {"./features/RegisterUser.feature"},
//        features = {"./features/LoginUser.feature"},
//        features={"./features/ContactUsForm.feature"},
//        features = ("./features/TestCasePage.feature"),
        features = ("./features/TestingProductsSearchAndDetails.feature"),
//        features = ("./features/ProductSearch.feature"),
//        features = ("./features/VerifySubscription.feature"),
//        features = ("./features/TestingAddToCart.feature"),
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true
)

public class TestRunner {
}
