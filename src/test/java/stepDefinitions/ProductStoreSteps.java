package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class ProductStoreSteps extends Base {
    public WebDriver driver;

    public ProductStoreSteps(WebDriver driver) {
        super(driver);
    }

   /* @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/flora/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
    }

    */

    @Given("Customer searching a device")
    public void Customer_searching_a_device() {
        System.setProperty("webdriver.chrome.driver", "/home/flora/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        if (isDisplayed(demoBlazeLogo)) {
            System.out.println("opening web page");
            System.out.println("navigate through categories click laptops");
            driver.findElement(laptopLabel).click();
        } else {
            System.out.println("demo blaze web page is not working");
        }
    }

    @And("adding a product to the cart")
    public void adding_a_product_to_the_cart() throws InterruptedException {
        driver.findElement(laptopSony).click();
        Thread.sleep(2000);
        driver.findElement(addCartSony).click();
    }

    @Then("accept pop up confirmation.")
    public void accept_pop_up_confirmation() throws InterruptedException {
        System.out.println("accept pop up confirmation");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        /*if (driver.findElement(By.name("popup")).isDisplayed()) {
            System.out.println("pop up is displayed");
            driver.findElement(By.name("confirmar")).click();
            System.out.println("accept confirmation");
        }*/
    }

    @Given("Customer searching a new device")
    public void Customer_searching_a_new_device() throws InterruptedException {
        System.out.println("searching new device");
        driver.findElement(home).click();
        Thread.sleep(2000);
        if (isDisplayed(demoBlazeLogo)) {
            System.out.println("navigate through categories click laptops");
            driver.findElement(laptopLabel).click();
        }
    }

    @And("adding the new product to the cart")
    public void adding_the_new_product_to_the_cart() throws InterruptedException {
        driver.findElement(laptopDell).click();
        Thread.sleep(2000);
        driver.findElement(addCartDell).click();
    }

    @Then("accept pop up new confirmation")
    public void accept_pop_up_new_confirmation() throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

    @Given("customer delete the new device from the cart")
    public void customer_delete_the_new_device_from_the_cart() throws InterruptedException {
        System.out.println("customer click in cart, and  check the products added");
        driver.findElement(cartPage).click();
        Thread.sleep(2000);
        driver.findElement(deleteLabel).click();
    }

    @And("click on place order")
    public void click_on_place_order() throws InterruptedException {
        System.out.println("customer click to place order");
        driver.findElement(placeOrder).click();
        Thread.sleep(2000);
    }

    @Then("fill in all web form fields")
    public void fillInAllWebFormFields() {
        System.out.println("complete the fields required for the order");
        driver.findElement(nameCustomer).sendKeys();
        driver.findElement(countryCustomer).sendKeys();
        driver.findElement(cityCustomer).sendKeys();
        driver.findElement(creditCard).sendKeys();
        driver.findElement(monthValue).sendKeys();
        driver.findElement(yearValue).sendKeys();
        System.out.println("all the fields are completed for the order");
        driver.findElement(purchaseButton).click();
        System.out.println("click ok purchase button");
    }

    @Given("Capture and log purchase Id and Amount")
    public void captureAndLogPurchaseIdAndAmount() {
        System.out.println("capture log and id and amount");
        getText(idOrder);
    }

    @And("Assert purchase amount equals expected")
    public void assertPurchaseAmountEqualsExpected() {
        assertEquals(amount, 790);
        System.out.println("assert amount expected is equal " + amount);
    }

    @Then("Click on Ok")
    public void clickOnOk() {
        System.out.println(" click ok ");
        driver.findElement(buttonOk).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
