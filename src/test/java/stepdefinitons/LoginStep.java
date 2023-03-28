package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.demos.todos.screenplay.questions.LoginQuestion;
import net.serenitybdd.demos.todos.screenplay.tasks.Login.LoginTask;
import net.serenitybdd.demos.todos.screenplay.user_interface.HomePageUI;
import net.serenitybdd.demos.todos.screenplay.user_interface.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

public class LoginStep {
    public WebDriver hisBrowser;
    private Actor actor = Actor.named("Actor");
    @When("Doy click en el boton login")
    public void clickOnLogin(){
        actor.can(BrowseTheWeb.with(this.hisBrowser));
        actor.attemptsTo(Click.on(HomePageUI.BUTTO_LOGIN));
    }
    @And("Confirmo que estoy en la pagina de login")
    public  void answerQuestion(){
        actor.should(GivenWhenThen.seeThat(new LoginQuestion()));
    }
    @Then("Me logueo con mi usuario: {string} y clave: {string}")
    public void login(String user,String clave){
        actor.attemptsTo(LoginTask.loginTask(user,clave));
    }
}
