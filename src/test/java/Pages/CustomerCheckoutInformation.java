package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerCheckoutInformation {

    public WebDriver driver;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement zipCode;
    public WebElement errorCheckoutMessage;


    public CustomerCheckoutInformation(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipCode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getErrorCheckoutMessage() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3"));
    }

    //--------------------------
    public void addFirstName(String customerName){
        getFirstName().clear();
        getFirstName().sendKeys(customerName);
    }
    public void addLastName(String customerLastName){
        getLastName().clear();
        getLastName().sendKeys(customerLastName);
    }
    public void addZipCode(String postalCode){
        getZipCode().clear();
        getZipCode().sendKeys(postalCode);
    }


}
