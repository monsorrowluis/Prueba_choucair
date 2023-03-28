package net.serenitybdd.demos.todos.screenplay.tasks.Login;

import net.serenitybdd.demos.todos.screenplay.interactions.SendKeysInteraction;
import net.serenitybdd.demos.todos.screenplay.user_interface.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LoginTask implements Task {
    private String user;
    private String pass;

    public LoginTask(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static LoginTask loginTask(String user, String pass){
        return Tasks.instrumented(LoginTask.class,user,pass);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        new SendKeysInteraction().sendKeys(actor,user, LoginUI.INPUT_USER);
        new SendKeysInteraction().sendKeys(actor,pass, LoginUI.INPUT_PASS);
        actor.attemptsTo(Click.on(LoginUI.BTN_LOGIN));
    }
}
