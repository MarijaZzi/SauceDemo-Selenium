package Tests;

import Base.BaseTest;
import Pages.AddToCartPage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestAddToCart extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LoginPage(driver);
        loginPage.addUsername("standard_user");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        addToCartPage = new AddToCartPage(driver);
    }

    @Test
    public void addToCart(){
        addToCartPage.addToCartBackpack();
        addToCartPage.addToCartBike();
        addToCartPage.addToCartJacket();
        addToCartPage.addToCartOnesie();
        addToCartPage.addToCartTShirt();
        addToCartPage.addToCartRedTShirt();
        Assert.assertTrue(addToCartPage.getRemoveBackpackButton().isDisplayed());
        Assert.assertTrue(addToCartPage.getRemoveBikeButton().isDisplayed());
        Assert.assertTrue(addToCartPage.getRemoveJacketButton().isDisplayed());
        Assert.assertTrue(addToCartPage.getRemoveOnesieButton().isDisplayed());
        Assert.assertTrue(addToCartPage.getRemoveTShirtButton().isDisplayed());
        Assert.assertTrue(addToCartPage.getRemoveRedTShirtButton().isDisplayed());

    }



}
