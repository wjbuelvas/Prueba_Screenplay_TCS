package questions;

import static userinterface.OrangeInicioSesionUserInterface.TXT_MENSAJE_ERROR;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ComprobarMensajeError  implements Question<String> {

  public static ComprobarMensajeError enOrange() {
    return new ComprobarMensajeError();
  }

  @Override
  public String answeredBy(Actor actor) {
    return Text.of(TXT_MENSAJE_ERROR)
        .viewedBy(actor).asString();
  }
}
