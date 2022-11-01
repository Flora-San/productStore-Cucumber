package stepDefinitions;

import org.openqa.selenium.By;

public class Selectors {


    //static String
    //pop up values


    //home page
    By demoBlazeLogo = By.id("nava");
    By home = By.linkText("index.html");
    By laptopLabel = By.linkText("Laptops");

    // detail product sony
    By laptopSony = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By addCartSony = By.linkText("addToCart(8)");

    // detail product dell
    By laptopDell = By.linkText("prod.html?idp_=12");
    By addCartDell = By.linkText("addToCart(12)");

    // cart page
    By cartPage = By.id("cartur");
    By deleteLabel = By.linkText("deleteItem('d0abdecf-b0c7-96b7-af23-e741267e61a4')");
    By totalPrice = By.id("totalp");
    By placeOrder = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");

    //pop up data
    By orderPopUp = By.id("orderModalLabel");
    By totalAmount = By.id("totalm");
    By nameCustomer = By.id("name");
    By countryCustomer = By.id("country");
    By cityCustomer = By.id("city");
    By creditCard = By.id("card");
    By monthValue = By.id("month");
    By yearValue = By.id("year");
    By purchaseButton = By.linkText("purchaseOrder()");

    By idOrder = By.xpath("/html/body/div[10]/p");
    By buttonOk = By.xpath("/html/body/div[10]/div[7]/div/button");
    int amount = 790;
}
