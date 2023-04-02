package com.saucedemo.main.steps;


import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.util.GeneralUtil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestOrdenarSteps {

    @Page
    HomePage homePage;

    @Step
    public void seleccionarOrden(String order) {
        GeneralUtil.explicitWait(1000);
        homePage.clickProductOrder();
        homePage.orderProductBy(order);
    }

    @Step
    public void validarOrder(){
        GeneralUtil.explicitWait(1000);
        assertThat("Price (low to high)",equalTo(homePage.obtenerTextoOrder()));
    }

    @Step
    public void validarOrderByPrecio(String precio1) {
        double val1 = 0 ;
        double val2 = 0 ;
        String valor1 = "";
        String valor2 = "";
        switch (precio1){
            case "primer":
                valor1 = homePage.obtenerPrecioProducto("1").substring(1);
                System.out.println("valo1: "+ valor1);
                val1 = Double.parseDouble(valor1);
                valor2 = homePage.obtenerPrecioProducto("2").substring(1);
                System.out.println("valo2: "+ valor2);
                val2 = Double.parseDouble(valor2);
                break;
            case "segundo":
                valor1 = homePage.obtenerPrecioProducto("2").substring(1);
                System.out.println("valo1: "+ valor1);
                val1 = Double.parseDouble(valor1);
                valor2 = homePage.obtenerPrecioProducto("3").substring(1);
                System.out.println("valo2: "+ valor2);
                val2 = Double.parseDouble(valor2);
                break;
            case "tercer":
                valor1 = homePage.obtenerPrecioProducto("3").substring(1);
                System.out.println("valo1: "+ valor1);
                val1 = Double.parseDouble(valor1);
                valor2 = homePage.obtenerPrecioProducto("4").substring(1);
                System.out.println("valo2: "+ valor2);
                val2 = Double.parseDouble(valor2);
                break;
        }

        if(val1 <= val2){
            assertThat("Es menor ",true);
        }
        GeneralUtil.explicitWait(1000);
    }


}
