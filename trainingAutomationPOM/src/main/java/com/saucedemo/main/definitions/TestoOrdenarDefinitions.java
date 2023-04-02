package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestOrdenarSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestoOrdenarDefinitions {

    @Steps
    TestOrdenarSteps testOrdenarSteps;

    @When("selecciono {string} en el menu de ordenamiento")
    public void seleccionoEnElMenuDeOrdenamiento(String string) {
        testOrdenarSteps.seleccionarOrden(string);
    }
    @Then("veo los productos ordenados por precio de menor a mayor")
    public void veoLosProductosOrdenadosPorPrecioDeMenorAMayor() {
        testOrdenarSteps.validarOrder();
    }
    @Then("el precio del primer producto es menor o igual al precio del segundo producto")
    public void elPrecioDelPrimerProductoEsMenorOIgualAlPrecioDelSegundoProducto() {
        testOrdenarSteps.validarOrderByPrecio("primer");
    }
    @Then("el precio del segundo producto es menor o igual al precio del tercer producto")
    public void elPrecioDelSegundoProductoEsMenorOIgualAlPrecioDelTercerProducto() {
        testOrdenarSteps.validarOrderByPrecio("segundo");
    }
    @Then("el precio del tercer producto es menor o igual al precio del cuarto producto")
    public void elPrecioDelTercerProductoEsMenorOIgualAlPrecioDelCuartoProducto() {
        testOrdenarSteps.validarOrderByPrecio("tercer");
    }


}
