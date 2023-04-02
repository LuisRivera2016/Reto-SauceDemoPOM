Feature: Automatizacion SauceDemo
  @Login
  Scenario: Iniciar sesion en Sauce Demo
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "Products"


  @OrdenarProductos
    Scenario: Ordenar por precio de menor a mayor
    Given validamos que estemos en la pagina principal "Products"
    When selecciono "Price (low to high)" en el menu de ordenamiento
    Then veo los productos ordenados por precio de menor a mayor
    And el precio del primer producto es menor o igual al precio del segundo producto
    And el precio del segundo producto es menor o igual al precio del tercer producto
    And el precio del tercer producto es menor o igual al precio del cuarto producto


  @AgregarCompras
  Scenario Outline: Agregar un producto al carrito de compras
    Given que el usuario este en la pagina de compras "Products"
    When selecciono el producto "<producto>" de la lista
    And dar click en el boton del carro
    Then veo que el producto "<producto>" fue agregado al carrito de compra

    Examples:
      |producto|
      |Sauce Labs Backpack|
      |Sauce Labs Bike Light|
      |Sauce Labs Bolt T-Shirt|
#
  @RemoverCheckout
  Scenario: Remover un articulo del carro e ir a checkout
    Given que el usuario este en la pagina de carro "Your Cart"
    When el usuario remueva el primer articulo
    And dar click en el boton de checkout
    Then validamos que estemos en la pagina de checkout "Checkout: Your Information"
#
  @IngresarInformacionCompra
  Scenario: Ingresar informacion de pago y continuar
    Given que el usuario este en la pagina de informacion de checkout "Checkout: Your Information"
    When el usuario ingrese sus datos de compra
    And dar click en el boton de continue
    Then validamos que estemos en la pagina de overview "Checkout: Overview"
    And dar click en el boton de finish
#
  @Logout
  Scenario: Salir de la aplicacion saucedemo
    Given que el usuario este en en la pagina "Checkout: Complete!"
    When el usuario da click a la barra lateral
    And dar click en el boton de logout
    Then validamos que estemos en la pagina de login "Login"


