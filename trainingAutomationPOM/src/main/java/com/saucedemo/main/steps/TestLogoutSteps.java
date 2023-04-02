package com.saucedemo.main.steps;

import com.saucedemo.main.pages.CheckoutPage;
import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestLoginPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
public class TestLogoutSteps {
    @Page
    TestLoginPage testLoginPage;

    @Page
    HomePage homePage;

    @Page
    CheckoutPage checkoutPage;
    public void validarPagina(String value) {
        MatcherAssert.assertThat("se completo la compra",value.contains(checkoutPage.spanCheckout.getText()));
    }



    public void darClickBtnMenu() {
        GeneralUtil.explicitWait(1000);
        homePage.clickBtnMenu();
    }

    public void darClickBtnLogout() {
        GeneralUtil.explicitWait(1000);
        homePage.clickBtnLogout();
    }

    public void validarLogin(String value) {
        MatcherAssert.assertThat("se cerro sesion",value.contains(testLoginPage.msgButton.getAttribute("value")));
    }
}
