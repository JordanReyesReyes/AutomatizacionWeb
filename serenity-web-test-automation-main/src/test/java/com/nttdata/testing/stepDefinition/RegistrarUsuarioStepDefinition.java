package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Tasks.AddToCart;
import com.nttdata.testing.Tasks.LoginUser;
import com.nttdata.testing.Tasks.NavigateTo;
import com.nttdata.testing.Tasks.RegistrarUsuario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStepDefinition {
    @Given("el {actor} esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @And("selecciona el boton de registro")
    public void seleccionaElBotonDeRegistro() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_SIGN_UP));
    }

    @And("ingresa un nombre de usuario {string} y contrasenia {string}")
    public void ingresaUnNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(HomePage.INP_USERNAME));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(HomePage.INP_PASSWORD));
    }

    @When("selecciona el boton registrar")
    public void seleccionaElBotonRegistrar() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_REGISTRAR));
    }

    @Then("se realiza el registro de manera exitosa")
    public void seRealizaElRegistroDeManeraExitosa() {
        System.out.println("exitoso");
    }

    @When("se registra con un nombre de usuario {string} y contrasenia {string}")
    public void seRegistraConUnNombreDeUsuarioYContrasenia(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.withData(usuario, password));
    }

    @When("el {actor} inicia sesion con nombre de usuario {string} y contrasenia {string}")
    public void elUsuarioIniciaSesion(Actor actor, String username, String password) {
        actor.attemptsTo(LoginUser.withCredentials(username, password));
    }

    @And("el {actor} selecciona un producto y lo agrega al carrito")
    public void seleccionaUnProductoYLoAgregaAlCarrito(Actor actor) {
        actor.attemptsTo(AddToCart.theProduct());
    }

    @Then("el producto es agregado exitosamente al carrito")
    public void elProductoEsAgregadoExitosamenteAlCarrito() {
        System.out.println("El producto ha sido agregado exitosamente al carrito.");

    }

    //Sign up successful.

}
