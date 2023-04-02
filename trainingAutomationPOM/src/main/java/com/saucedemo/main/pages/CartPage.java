package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
public class CartPage extends PageObject {
    @FindBy(xpath = "//span[@class=\"title\"]")
    public WebElementFacade spanCart;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    public WebElement continueShoppingbtn;

    @FindBy(xpath = "//button[@id=\"remove-sauce-labs-backpack\"]")
    public WebElementFacade removeSauceLabsBackpackButton;

    @FindBy(xpath = "//button[@id=\"checkout\"]")
    public WebElementFacade checkoutButton;

    public void darClickBtnRemove(){
        removeSauceLabsBackpackButton.click();
    }

    public void darClickBtnCheckout() {
        checkoutButton.click();
    }

    public String validarProductoEnCarrito(String nameProduct){
        WebElement producto = getDriver().findElement(By.xpath("//div[contains(text(),'" + nameProduct + "')]"));
        waitFor(producto).isVisible();
        return producto.getText();
    }

    public void clickContinueShopping(){
        continueShoppingbtn.click();
    }
}
