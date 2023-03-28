package net.serenitybdd.demos.todos.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;

public class SendKeysInteraction {
    public void sendKeys(Actor actor, String text, Target locator){
        actor.attemptsTo(SendKeys.of(text).into(locator));
    }
}
