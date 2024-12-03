package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    //  SIGN UP

    public static final Target BTN_SIGN_UP = Target.the("Boton para hacer el registro")
            .located(By.id("signin2"));

    public static final Target REGISTER_MODAL = Target.the("Modal de registro")
            .located(By.id("signInModalLabel"));

    public static final Target INP_USERNAME = Target.the("Nombre de usuario")
            .located(By.id("sign-username"));

    public static final Target INP_PASSWORD = Target.the("Contraseña")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTRAR = Target.the("Boton Registrar")
            .located(By.xpath("//button[text()='Sign up']"));

    //  LOG IN

    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .located(By.id("login2"));

    // LOGIN
    public static final Target INP_LOGIN_USERNAME = Target.the("Campo de nombre de usuario para login")
            .located(By.id("loginusername"));

    public static final Target INP_LOGIN_PASSWORD = Target.the("Campo de contraseña para login")
            .located(By.id("loginpassword"));

    public static final Target BTN_CONFIRM_LOGIN = Target.the("Botón para confirmar login")
            .located(By.xpath("//button[text()='Log in']"));

    // CARRITO
    public static final Target PRODUCT_LINK = Target.the("Link del producto a seleccionar")
            .located(By.xpath("//a[text()='Samsung galaxy s6']")); // Actualiza según el producto.

    public static final Target BTN_ADD_TO_CART = Target.the("Botón para agregar al carrito")
            .located(By.xpath("//a[text()='Add to cart']"));

}
