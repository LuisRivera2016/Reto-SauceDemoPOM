package com.saucedemo.main.steps;

import com.saucedemo.main.pages.CartPage;
import com.saucedemo.main.pages.CheckoutPage;
import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
public class TestCarSteps {
    @Page
    CartPage cartPage;
    @Page
    CheckoutPage checkoutPage;

    @Page
    HomePage homePage;

    public void validarCart(String value){
        homePage.clickBtnCarro();
        MatcherAssert.assertThat("si se esta en home",value.contains(cartPage.spanCart.getText()));
    }


    public void removerPrimerProducto() {
        GeneralUtil.explicitWait(2000);
        cartPage.darClickBtnRemove();
    }

    public void darClickBtnCheckout() {
        GeneralUtil.explicitWait(2000);
        cartPage.darClickBtnCheckout();
    }

    public void validarCheckout(String value) {
        GeneralUtil.explicitWait(2000);
        MatcherAssert.assertThat("si se esta en checkout",value.contains(checkoutPage.spanCheckout.getText()));
    }
}
