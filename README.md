Online Practice Store Testing Framework(SAUCE DEMO)

This project is an automated UI testing framework for an Online Practice Store, built using Selenium WebDriver with the Page Object Model (POM) design pattern. 
The framework is structured to enhance maintainability, readability, and scalability.

Project Structure
src
└── test
    └── java
            ├── base
            │   └── BaseTest
            │
            ├── pages
            │   └── AddToCartPage
            │   └── CartPage
            │   └── CustomerCheckoutInformation
            │   └── LoginPage
            │
            └── tests
                └── TestAddToCart
                └── TestCart
                └── TestCheckoutCustomerData
                └── TestLogin


File Descriptions

base Package
  BaseTest 
   Abstract class for common test setup. It sets up the WebDriver and initializes the browser.

 pages Package
  AddToCartPage
   Page object for actions related to adding products to the cart and removing them from the cart.

  CartPage
   Handles verification of products in the shopping cart, update quantities, remove items, etc.

  CustomerCheckoutInformation
   Manages entering customer data during the checkout flow.

  LoginPage
   Encapsulates login functionality: input credentials, submit form, validate errors/success.
   
 tests Package
  TestAddToCart
   Tests for adding products to the cart.

  TestCart
   Tests for validating cart contents and checking out with and without any products in the cart.

  TestCheckoutCustomerData
   Verifies the customer information step in the checkout process (name, address, etc.).

  TestLogin
   Tests for successful and failed login scenarios.

 Prerequisites
  Java 8+ 
  Maven 
  Selenium WebDriver
  TestNG (or JUnit)
  EdgeDriver or other browser driver
  IDE (e.g., IntelliJ IDEA or Eclipse)

Installation
Clone the repository
git clone https://github.com/MarijaZzi/SauceDemo-Selenium.git

Navigate to the project directory

Install dependencies

Base Package
BaseTest: Manages test setup with @BeforeClass

Pages Package (Page Objects)
Each page class contains:
Web element locators
Page-specific methods
Return types for page transitions 

Tests Package
Tests use TestNG annotations and assertions

Example Tests:
 Valid Login
  Invalid Login
  Add to Cart
  Checkout Process
 Valid/Invalid Checkout Data
 
Running the Tests
Run specific test classes from your IDE.

Future Enhancements
Integrate with CI (GitHub Actions, Jenkins)
Add data-driven testing (Excel/CSV/JSON)
Cross-browser testing

License
This is an open-source project intended for learning and practice only.




