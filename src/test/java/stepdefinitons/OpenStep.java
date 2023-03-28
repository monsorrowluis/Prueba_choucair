package stepdefinitons;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.stage;

public class OpenStep {
    @Managed(driver = "chrome")
    public WebDriver hisBrowser;
    private Actor actor = Actor.named("actor");
   @Given("Abro el navegador")
    public void openBroser(){
       actor.can(BrowseTheWeb.with(this.hisBrowser));
       actor.wasAbleTo(Open.relativeUrl("https://www.demoblaze.com/index.html"));
    }
}
