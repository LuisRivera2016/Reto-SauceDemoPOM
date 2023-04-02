package com.saucedemo.main.definitions;


import com.saucedemo.main.steps.TestCarSteps;
import com.saucedemo.main.steps.TestHomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class TestCartDefinitions {

    @Steps
    TestCarSteps testCarSteps;


    @Given("que el usuario este en la pagina de carro {string}")
    public void queElUsuarioAgregeElPrimerProducto(String value) {
        testCarSteps.validarCart(value);
    }
    @When("el usuario remueva el primer articulo")
    public void elUsuarioAgregeLosDemasProductos() {
        testCarSteps.removerPrimerProducto();
    }
    @When("dar click en el boton de checkout")
    public void darClickEnElBotonDelCarro() {
        testCarSteps.darClickBtnCheckout();
    }

    @Then("validamos que estemos en la pagina de checkout {string}")
    public void validamosQueEstemosEnLaPaginaDelCarro(String value) {
        testCarSteps.validarCheckout(value);
    }

}
