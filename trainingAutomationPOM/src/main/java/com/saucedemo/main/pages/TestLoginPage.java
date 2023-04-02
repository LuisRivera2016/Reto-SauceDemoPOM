package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class TestLoginPage extends PageObject {

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElementFacade inputUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElementFacade btnLogin;

    @FindBy(xpath = "//h3[@data-test='error']/text()")
    public WebElementFacade msgError;

    @FindBy(xpath = "//input[@id=\"login-button\"]")
    public WebElementFacade msgButton;

    public void ingresarCredencialesLogin(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);

    }

    public void clickBtnLogin() {
        btnLogin.click();
    }
}
