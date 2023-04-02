package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject{

    @FindBy(xpath = "//span[@class=\"title\"]")
    public WebElementFacade spanCheckout;

    @FindBy(xpath = "//input[@id=\"first-name\"]")
    public WebElementFacade inputFirstName;

    @FindBy(xpath = "//input[@id=\"last-name\"]")
    public WebElementFacade inputLastName;

    @FindBy(xpath = "//input[@id=\"postal-code\"]")
    public WebElementFacade inputZipCode;

    @FindBy(xpath = "//input[@id=\"continue\"]")
    public WebElementFacade inputContinue;

    @FindBy(xpath = "//button[@id=\"finish\"]")
    public WebElementFacade btnFinish;

    public void ingresarCredencialesPay(String fisrtname, String lastname, String zipcode){
       inputFirstName.sendKeys(fisrtname);
       inputLastName.sendKeys(lastname);
       inputZipCode.sendKeys(zipcode);
    }

    public void darClickBtnContinue() {
        inputContinue.click();
    }

    public void darClickBtnFinish() {
        btnFinish.click();
    }
}
