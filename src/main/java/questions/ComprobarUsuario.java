package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.OrangePaginaInicialUserInterface.LBL_PRIMER_USUARIO;

public class ComprobarUsuario implements Question<String> {


    public static ComprobarUsuario creado() {
        return new ComprobarUsuario();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LBL_PRIMER_USUARIO.resolveFor(actor).getText();
    }
}
