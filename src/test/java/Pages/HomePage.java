package Pages;

import Base.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends SetUp {

    WebDriver driver;

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartBtn;

    @FindBy(className = "app_logo")
    WebElement appLogo;

    @FindBy(xpath = "//a/div[@class='inventory_item_name ']")
    List<WebElement>  allProducts;

    @FindBy(xpath = "//div[@class='pricebar']/button")
    List<WebElement>  allProductsAddToCartBtn;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void landingPageCheck(){
        Assert.assertTrue(appLogo.isDisplayed());
    }

    public void addProductToCart(String product){
        for(int i=0;i<allProducts.size()-1;i++){
            if(allProducts.get(i).getText().equalsIgnoreCase(product)){
                allProductsAddToCartBtn.get(i).click();
            }

        }
    }

    public void clickOnCartbtn(){
        shoppingCartBtn.click();
    }
}
