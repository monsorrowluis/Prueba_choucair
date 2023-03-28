package net.serenitybdd.demos.todos.screenplay.questions;

import net.serenitybdd.demos.todos.screenplay.user_interface.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.TITLE_LOGIN.resolveFor(actor).getText().equals("Log in");
    }
}
