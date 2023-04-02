package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestLogoutSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class TestLogoutDefinitions {

    @Steps
    TestLogoutSteps testLogoutSteps;
    @Given("que el usuario este en en la pagina {string}")
    public void queElUsuarioEsteEnEnLaPagina(String string) {
        testLogoutSteps.validarPagina(string);
    }
    @When("el usuario da click a la barra lateral")
    public void elUsuarioDaClickALaBarraLateral() {
        testLogoutSteps.darClickBtnMenu();
    }
    @When("dar click en el boton de logout")
    public void darClickEnElBotonDeLogout() {
        testLogoutSteps.darClickBtnLogout();
    }
    @Then("validamos que estemos en la pagina de login {string}")
    public void validamosQueEstemosEnLaPaginaDeLogin(String string) {
        testLogoutSteps.validarLogin(string);
    }
}
