package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.PRODUCT_LINK),
                Click.on(HomePage.BTN_ADD_TO_CART)
        );
    }

    public static Performable theProduct() {
        return new AddToCart();
    }
}
