package tasks;

import static userinterface.OrangePaginaInicialUserInterface.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

@AllArgsConstructor
@Getter
public class Actualizar implements Task {

  private String rol;

  public static Actualizar usuario(String rol) {
    return Tasks.instrumented(Actualizar.class, rol);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(LBL_EDITAR));
    actor.attemptsTo(Click.on(LST_ROLES));
    actor.attemptsTo(SelectFromOptions.byValue("main")
                .from(LST_ROLES));
    actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());

  }
}
