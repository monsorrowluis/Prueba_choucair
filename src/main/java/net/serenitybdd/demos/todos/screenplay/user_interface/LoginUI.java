package net.serenitybdd.demos.todos.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static Target TITLE_LOGIN = Target.the("Titulo login").locatedBy("#logInModalLabel");
    public static Target INPUT_USER = Target.the("Caja de usuario").locatedBy("#loginusername");
    public static Target INPUT_PASS = Target.the("Caja de clave").locatedBy("#loginpassword");
    public static Target BTN_LOGIN = Target.the("Boton Login").locatedBy("//button[contains(text(),\"Log in\")]");
    public static Target BTN_CLOSE = Target.the("Boton Close").locatedBy("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
}
