package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject{

    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade spanHome;

    @FindBy(xpath = "//select[@data-test='product_sort_container']")
    public WebElementFacade selectProductSortContaine;

    @FindBy(xpath = "//span[@class='active_option']")
    public WebElementFacade orderSelected;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElementFacade addBackpackButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")
    public WebElementFacade addBikeLightButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    public WebElementFacade addTShirtButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    public WebElementFacade addFleeceJacketButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-onesie\"]")
    public WebElementFacade addOnesieButton;

    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    public WebElementFacade shoppingCartLink;

    @FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
    public WebElementFacade menuButton;

    @FindBy(xpath = "//a[@id=\"logout_sidebar_link\"]")
    public WebElementFacade logoutButton;


    public void clickProductOrder(){
        selectProductSortContaine.click();
    }

    public void orderProductBy(String product){
        WebElement order = getDriver().findElement(By.xpath("//option[contains(text(),'" + product + "')]"));
        waitFor(order).waitUntilClickable();
        order.click();
    }

    public String obtenerPrecioProducto(String numeroProduct){
        WebElement order = getDriver().findElement(By.xpath("//div[@class='inventory_list']//div["+ numeroProduct + "]//div[2]//div[2]//div[1]"));
        waitFor(order).isVisible();
        return order.getText();
    }

    public String obtenerTextoOrder(){
        waitFor(orderSelected).isVisible();
        return orderSelected.getText();
    }


    public void clickBtnCarro() {
        shoppingCartLink.click();
    }

    public void clickBtnMenu() {
        menuButton.click();
    }

    public void clickBtnLogout() {
        logoutButton.click();
    }

}
