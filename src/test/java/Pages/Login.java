package Pages;

import Base.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login extends SetUp {

    WebDriver driver;

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginPageValidation(){
        Assert.assertTrue(loginBtn.isDisplayed());
    }

    public void loginToTheApp(String user, String pass){
        userName.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();
    }

}
