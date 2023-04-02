package com.saucedemo.main.steps;

import com.saucedemo.main.pages.CartPage;
import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
public class TestHomeSteps {
    @Page
    HomePage homePage;

    @Page
    CartPage cartPage;

    public void validarHome(String value){
        MatcherAssert.assertThat("si se esta en home",value.contains(homePage.spanHome.getText()));
    }


    public void agregarProductos(String producto) {
        switch (producto){
            case "Sauce Labs Backpack":
                homePage.addBackpackButton.click();
                break;
            case "Sauce Labs Bike Light":
                homePage.addBikeLightButton.click();
                break;
            case "Sauce Labs Bolt T-Shirt":
                homePage.addTShirtButton.click();
                break;
        }
    }

    public void darClickBtnCarro() {
        GeneralUtil.explicitWait(2000);
        homePage.clickBtnCarro();
    }

    public void validarCompra(String value) {
        MatcherAssert.assertThat("si se esta en carro",value.contains(cartPage.spanCart.getText()));
    }

    public void validarProductoCarrito(String producto) {
        String productoEsperado = "";
        String productoCarrito = "";
        switch (producto){
            case "Sauce Labs Backpack":
                productoEsperado = "Sauce Labs Backpack";
                productoCarrito = cartPage.validarProductoEnCarrito(producto);
                break;
            case "Sauce Labs Bike Light":
                productoEsperado = "Sauce Labs Bike Light";
                productoCarrito = cartPage.validarProductoEnCarrito(producto);
                break;
            case "Bolt T-Shirt":
                productoEsperado = "Sauce Labs Bolt T-Shirt";
                productoCarrito = cartPage.validarProductoEnCarrito(producto);
                break;
        }
        GeneralUtil.explicitWait(1000);
        MatcherAssert.assertThat("si se esta en carro",productoEsperado.contains(productoCarrito));
        cartPage.clickContinueShopping();
    }
}
