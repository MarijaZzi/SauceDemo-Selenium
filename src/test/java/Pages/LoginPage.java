package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;
    public WebElement username;
    public WebElement password;
    public WebElement loginButton;
    public WebElement errorButton;
    public WebElement burgerMenu;
    public WebElement logoutButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorButton() {
        return driver.findElement(By.className("error-button"));
    }

    public WebElement getBurgerMenu() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }

    //---------------------
    public void addUsername(String username){
        getUsername().clear();
        getUsername().sendKeys(username);

    }

    public void addPassword(String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public void submitInfo(){
        getLoginButton().click();
    }
    public void clickOnTheBurgerMenu(){
        getBurgerMenu().click();
    }

    public void clickOnTheLogoutButton(){
        getLogoutButton().click();
    }

}
