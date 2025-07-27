package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
    public WebDriver driver;
    public WebElement addBackpackToCartButton;
    public WebElement addToCartBikeButton;
    public WebElement addToCartTShirtButton;
    public WebElement addToCartJacketButton;
    public WebElement addToCartOnesieButton;
    public WebElement addToCartRedTShirtButton;
    public WebElement removeBackpackButton;
    public WebElement removeBikeButton;
    public WebElement removeTShirtButton;
    public WebElement removeJacketButton;
    public WebElement removeOnesieButton;
    public WebElement removeRedTShirtButton;
    public WebElement cartButton;



    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddBackpackToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getAddToCartBikeButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public WebElement getAddToCartTShirtButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getAddToCartJacketButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    public WebElement getAddToCartOnesieButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

    public WebElement getAddToCartRedTShirtButton() {
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getRemoveBackpackButton() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getRemoveBikeButton() {
        return driver.findElement(By.id("remove-sauce-labs-bike-light"));
    }

    public WebElement getRemoveTShirtButton() {
        return driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getRemoveJacketButton() {
        return driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
    }

    public WebElement getRemoveOnesieButton() {
        return driver.findElement(By.id("remove-sauce-labs-onesie"));
    }

    public WebElement getRemoveRedTShirtButton() {
        return driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getCartButton() {
        return driver.findElement(By.className("shopping_cart_link"));
    }
    //-----------------------------

    public void addToCartBackpack(){
        getAddBackpackToCartButton().click();
    }
    public void addToCartBike(){
        getAddToCartBikeButton().click();
    }

    public void addToCartTShirt(){
        getAddToCartTShirtButton().click();
    }

    public void addToCartJacket(){
        getAddToCartJacketButton().click();
    }

    public void addToCartOnesie(){
        getAddToCartOnesieButton().click();
    }
    public void addToCartRedTShirt(){
        getAddToCartRedTShirtButton().click();
    }
    //------------------
    public void removeBackpackFromTheCart(){
        getRemoveBackpackButton().click();
    }
    public void removeBikeFromTheCart(){
        getRemoveBikeButton().click();
    }
    public void removeTShirtFromTheCart(){
        getRemoveTShirtButton().click();
    }
    public void removeJacketFromTheCart(){
        getRemoveJacketButton().click();
    }
    public void removeOnesieFromTheCart(){
        getRemoveOnesieButton().click();
    }
    public void removeRedTShirtFromTheCart(){
        getRemoveRedTShirtButton().click();
    }
    public void openTheCart(){
        getCartButton().click();
    }
}
