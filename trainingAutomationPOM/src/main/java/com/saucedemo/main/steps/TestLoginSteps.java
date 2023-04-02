package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestLoginPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class TestLoginSteps {


    @Page
    TestLoginPage testLoginPage;

    @Page
    HomePage homePage;
    public void openWeb(){
        testLoginPage.open();

    }


    public void ingresarCredenciales(String username, String password) {
        testLoginPage.ingresarCredencialesLogin(username, password);
        GeneralUtil.explicitWait(1000);
    }

    public void darClickBtnLogin() {
        testLoginPage.clickBtnLogin();
        GeneralUtil.explicitWait(1000);
    }

    public void validarLogin(String value) {
        GeneralUtil.explicitWait(2000);
        MatcherAssert.assertThat("se realizo correctamente el login",value.contains(homePage.spanHome.getText()));
    }
}
