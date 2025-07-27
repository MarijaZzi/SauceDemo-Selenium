package Base;

import Pages.AddToCartPage;
import Pages.CartPage;
import Pages.CustomerCheckoutInformation;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public LoginPage loginPage;
    public AddToCartPage addToCartPage;
    public CartPage cartPage;
    public CustomerCheckoutInformation customerCheckoutInformation;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();

    }
}
