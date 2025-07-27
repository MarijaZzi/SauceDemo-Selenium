package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    public WebDriver driver;
    public WebElement continueShoppingButton;
    public WebElement checkoutButton;
    public WebElement cancelButton;
    public WebElement continueButton;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement zipPostalCode;
    public WebElement finishButton;
    public WebElement backHomeButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getContinueShoppingButton() {
        return driver.findElement(By.id("continue-shopping"));
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipPostalCode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }

    public WebElement getBackHomeButton() {
        return driver.findElement(By.id("back-to-products"));
    }

    //-------------------
    public void continueShopping(){
        getContinueShoppingButton().click();
    }
    public void checkoutOption(){
        getCheckoutButton().click();
    }

    public void addFirstName(String customerName){
        getFirstName().clear();
        getFirstName().sendKeys(customerName);
    }
    public void addLastName(String customerLastName){
        getLastName().clear();
        getLastName().sendKeys(customerLastName);
    }
    public void addZipPostalCode(String postalCode){
        getZipPostalCode().clear();
        getZipPostalCode().sendKeys(postalCode);
    }
    public void clickOnFinishButton(){
        getFinishButton().click();
    }
    public void clickOnBackHomeButton(){
        getBackHomeButton().click();
    }
    public void continueToTheCheckoutButton(){
        getContinueButton().click();
    }


}
