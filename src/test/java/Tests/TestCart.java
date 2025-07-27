package Tests;

import Base.BaseTest;
import Pages.AddToCartPage;
import Pages.CartPage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCart extends BaseTest {


    @BeforeMethod
    public void pageSetUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LoginPage(driver);
        loginPage.addUsername("standard_user");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        addToCartPage = new AddToCartPage(driver);
        addToCartPage.addToCartBackpack();
        addToCartPage.addToCartBike();
        addToCartPage.addToCartJacket();
        addToCartPage.addToCartOnesie();
        addToCartPage.addToCartTShirt();
        addToCartPage.addToCartRedTShirt();
        addToCartPage.openTheCart();
        cartPage = new CartPage(driver);


    }

    @Test
    public void cartTestContinueOption(){
        addToCartPage.openTheCart();
        cartPage.continueShopping();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }

    @Test
    public void cartTestSuccessfulCheckoutOption() {
        addToCartPage.openTheCart();
        cartPage.checkoutOption();
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());

        cartPage.addFirstName("CustomerFirstName");
        cartPage.addLastName("CustomerLastName");
        cartPage.addZipPostalCode("A123456");
        cartPage.continueToTheCheckoutButton();
        cartPage.clickOnFinishButton();
        String expectedURL = "https://www.saucedemo.com/checkout-complete.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(cartPage.getBackHomeButton().isDisplayed());

    }
    @Test
    public void checkoutWithoutAnyProductsInTheCart() {
        addToCartPage.removeBackpackFromTheCart();
        addToCartPage.removeBikeFromTheCart();
        addToCartPage.removeJacketFromTheCart();
        addToCartPage.removeTShirtFromTheCart();
        addToCartPage.removeOnesieFromTheCart();
        addToCartPage.removeRedTShirtFromTheCart();
        cartPage.checkoutOption();
        cartPage.addFirstName("CustomerFirstName");
        cartPage.addLastName("CustomerLastName");
        cartPage.addZipPostalCode("A123456");
        cartPage.continueToTheCheckoutButton();
        cartPage.clickOnFinishButton();

        String expectedURL = "https://www.saucedemo.com/cart.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertFalse(Boolean.parseBoolean(actualURL), expectedURL);
        Assert.assertTrue(cartPage.getBackHomeButton().isDisplayed());

    }


}