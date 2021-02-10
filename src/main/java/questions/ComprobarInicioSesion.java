package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.OrangePaginaInicialUserInterface.LBL_ORANGE;

public class ComprobarInicioSesion implements Question<Boolean> {

    public static ComprobarInicioSesion enOrange() {
        return new ComprobarInicioSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_ORANGE.resolveFor(actor).isVisible();
    }
}
