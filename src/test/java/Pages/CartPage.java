package Pages;

import Base.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends SetUp {
    WebDriver driver;

    @FindBy(xpath = "//span[text()='Your Cart']")
    WebElement cartPageHeader;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void cartPageValidation(){
        Assert.assertEquals(cartPageHeader.getText(), "Your Cart");
    }

    public void cliclOnCheckOut(){
        checkoutBtn.click();
    }
}
