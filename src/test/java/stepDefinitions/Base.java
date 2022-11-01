package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends Selectors {

    public WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "/home/flora/Desktop/chromedriver");
        driver = new ChromeDriver();
        return driver;
        //driver.manage().window().maximize();
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public WebElement findElements(By locator) {
        return driver.findElement(locator);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void type(String inputTex, By locator) {
        driver.findElement(locator).sendKeys(inputTex);
    }

    private void click() {
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void visit(String url) {
        driver.get(url);
    }


}

