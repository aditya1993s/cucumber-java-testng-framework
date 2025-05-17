package StepDefinitions;

import Base.Constants;
import Base.SetUp;
import Pages.HomePage;
import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class LoginStepDefinitions extends SetUp {
    WebDriver driver;
    Login login;

    public LoginStepDefinitions(){
         this.driver = getWebDriver();
         login = new Login(driver);
    }


    @Given("User is on login page")
    public void user_is_on_login_page(){
        login.loginPageValidation();
    }

    @When("User logs in to the application with username {string} and password {string}")
    public void userLogsInToTheApplicationWithUsernameAndPassword(String arg0, String arg1) {
        login = new Login(driver);
        login.loginToTheApp(arg0, arg1);
    }


    @And("Close the browser")
    public void close_the_browser(){
        driver.close();
    }


}
