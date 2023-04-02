package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestHomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestHomeDefinitions {

    @Steps
    TestHomeSteps testHomeSteps;


    @Given("que el usuario este en la pagina de compras {string}")
    public void queElUsuarioAgregeElPrimerProducto(String value) {
        testHomeSteps.validarHome(value);
    }

    @When("selecciono el producto {string} de la lista")
    public void seleccionoElProductoDeLaLista(String producto) {
        testHomeSteps.agregarProductos(producto);
    }

    @When("dar click en el boton del carro")
    public void darClickEnElBotonDelCarro(){
        testHomeSteps.darClickBtnCarro();
    }

    @Then("veo que el producto {string} fue agregado al carrito de compra")
    public void veoQueElProductoFueAgregadoAlCarritoDeCompra(String producto) {
       testHomeSteps.validarProductoCarrito(producto);
    }


}
