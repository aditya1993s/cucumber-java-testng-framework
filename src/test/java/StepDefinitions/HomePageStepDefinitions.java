package StepDefinitions;

import Base.SetUp;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePageStepDefinitions extends SetUp {

    WebDriver driver;
    HomePage homePage;

    public HomePageStepDefinitions(){
        this.driver = getWebDriver();
        homePage = new HomePage(driver);
    }


    @Then("User is navigated to home page")
    public void user_is_navigated_to_home_page(){
        homePage.landingPageCheck();
    }

    @And("Click on the cart")
    public void clickOnTheCart() {
        homePage.clickOnCartbtn();
    }

    @And("Add {string} to cart")
    public void addToCart(String product) {
        homePage.addProductToCart(product);
    }
}
