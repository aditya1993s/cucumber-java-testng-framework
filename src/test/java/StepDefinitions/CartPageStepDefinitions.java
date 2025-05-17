package StepDefinitions;

import Base.SetUp;
import Pages.CartPage;
import gherkin.lexer.Ca;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class CartPageStepDefinitions extends SetUp {
    WebDriver driver;
    CartPage cartPage;

    public CartPageStepDefinitions(){
        this.driver = getWebDriver();
        cartPage = new CartPage(driver);
    }



    @Then("User lands on cart page")
    public void user_is_on_login_page(){
        cartPage.cartPageValidation();
    }

    @And("Click on checkout")
    public void clickOnCheckout() {
        cartPage.cliclOnCheckOut();
    }
}
