package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginWithStandardUser() {
        loginPage.addUsername("standard_user");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        loginPage.clickOnTheBurgerMenu();
        loginPage.clickOnTheLogoutButton();
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
        loginPage.getLoginButton().isDisplayed();

    }

    @Test
    public void loginWithProblemUser() throws InterruptedException {
        loginPage.addUsername("problem_user");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        loginPage.clickOnTheBurgerMenu();
        Thread.sleep(5000);
        loginPage.clickOnTheLogoutButton();
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
        loginPage.getLoginButton().isDisplayed();
    }

    @Test
    public void loginWithPerformanceGlitchUser() throws InterruptedException {
        loginPage.addUsername("performance_glitch_user");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        loginPage.clickOnTheBurgerMenu();
        Thread.sleep(5000);
        loginPage.clickOnTheLogoutButton();
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
        loginPage.getLoginButton().isDisplayed();
    }

    @Test
    public void loginWithErrorUser() throws InterruptedException {
        loginPage.addUsername("error_user");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        loginPage.clickOnTheBurgerMenu();
        Thread.sleep(5000);
        loginPage.clickOnTheLogoutButton();
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
        loginPage.getLoginButton().isDisplayed();
    }
    @Test
    public void loginWithVisualUser() throws InterruptedException {
        loginPage.addUsername("visual_user");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        loginPage.clickOnTheBurgerMenu();
        Thread.sleep(5000);
        loginPage.clickOnTheLogoutButton();
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
        loginPage.getLoginButton().isDisplayed();
    }


        @Test
    public void userCannotLoginWithInvalidUsername(){
        loginPage.addUsername("username1");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        Assert.assertTrue(loginPage.getErrorButton().isDisplayed());
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        Assert.assertTrue(loginPage.getUsername().isDisplayed());
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

    }
    @Test
    public void userCannotLoginWithInvalidPassword(){
        loginPage.addUsername("standard_user");
        loginPage.addPassword("password1");
        loginPage.submitInfo();
        Assert.assertTrue(loginPage.getErrorButton().isDisplayed());
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        Assert.assertTrue(loginPage.getUsername().isDisplayed());
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);


    }
    @Test
    public void userCannotLoginWithInvalidUsernameAndPassword(){
        loginPage.addUsername("username1");
        loginPage.addPassword("password1");
        loginPage.submitInfo();
        Assert.assertTrue(loginPage.getErrorButton().isDisplayed());
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        Assert.assertTrue(loginPage.getUsername().isDisplayed());
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);


    }
    @Test
    public void userCannotLoginWithBlankUsername(){
        loginPage.addUsername("");
        loginPage.addPassword("secret_sauce");
        loginPage.submitInfo();
        Assert.assertTrue(loginPage.getErrorButton().isDisplayed());
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        Assert.assertTrue(loginPage.getUsername().isDisplayed());
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);



    }

    @Test
    public void userCannotLoginWithBlankPassword(){
        loginPage.addUsername("standard_user");
        loginPage.addPassword("");
        loginPage.submitInfo();
        Assert.assertTrue(loginPage.getErrorButton().isDisplayed());
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        Assert.assertTrue(loginPage.getUsername().isDisplayed());
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);



    }
    @Test
    public void userCannotLoginWithBothBlankUsernameAndPassword(){
        loginPage.addUsername("");
        loginPage.addPassword("");
        loginPage.submitInfo();
        Assert.assertTrue(loginPage.getErrorButton().isDisplayed());
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        Assert.assertTrue(loginPage.getUsername().isDisplayed());
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);



    }





}
