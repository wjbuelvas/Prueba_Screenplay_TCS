package tasks;

import static userinterface.OrangePaginaInicialUserInterface.LBL_CERRAR_SESION;
import static userinterface.OrangePaginaInicialUserInterface.LBL_EDITAR;
import static userinterface.OrangePaginaInicialUserInterface.LBL_OPCIONES_SESION;
import static userinterface.OrangePaginaInicialUserInterface.LST_ROLES;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

@AllArgsConstructor
@Getter
public class CerrarSesion implements Task {

  private String usuario;

  public static CerrarSesion enOrange(String usuario) {
    return Tasks.instrumented(CerrarSesion.class, usuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(LBL_OPCIONES_SESION));
    actor.attemptsTo(Click.on(LBL_CERRAR_SESION));
    actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());

  }
}
