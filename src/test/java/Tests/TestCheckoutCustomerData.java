package Tests;

import Base.BaseTest;
import Pages.AddToCartPage;
import Pages.CartPage;
import Pages.CustomerCheckoutInformation;
import Pages.LoginPage;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCheckoutCustomerData extends BaseTest {

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
        customerCheckoutInformation = new CustomerCheckoutInformation(driver);

    }
    @Test
    public void checkoutWithAllCustomerData() {
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
    public void checkoutWithBlankFirstName() {
        addToCartPage.openTheCart();
        cartPage.checkoutOption();
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());

        cartPage.addFirstName("");
        cartPage.addLastName("CustomerLastName");
        cartPage.addZipPostalCode("A123456");
        cartPage.continueToTheCheckoutButton();
        Assert.assertTrue(customerCheckoutInformation.getErrorCheckoutMessage().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());

    }

    @Test
    public void checkoutWithBlankLastName() {
        addToCartPage.openTheCart();
        cartPage.checkoutOption();
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());

        cartPage.addFirstName("CustomerFirstName");
        cartPage.addLastName("");
        cartPage.addZipPostalCode("A123456");
        cartPage.continueToTheCheckoutButton();
        Assert.assertTrue(customerCheckoutInformation.getErrorCheckoutMessage().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
    }
    @Test
    public void checkoutWithBlankZipCode() {
        addToCartPage.openTheCart();
        cartPage.checkoutOption();
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());

        cartPage.addFirstName("CustomerFirstName");
        cartPage.addLastName("CustomerLastName");
        cartPage.addZipPostalCode("");
        cartPage.continueToTheCheckoutButton();
        Assert.assertTrue(customerCheckoutInformation.getErrorCheckoutMessage().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
    }
    @Test
    public void checkoutWithBlankData() {
        addToCartPage.openTheCart();
        cartPage.checkoutOption();
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());

        cartPage.addFirstName("");
        cartPage.addLastName("");
        cartPage.addZipPostalCode("");
        cartPage.continueToTheCheckoutButton();
        Assert.assertTrue(customerCheckoutInformation.getErrorCheckoutMessage().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(cartPage.getContinueButton().isDisplayed());
        Assert.assertTrue(cartPage.getCancelButton().isDisplayed());
    }




    }
