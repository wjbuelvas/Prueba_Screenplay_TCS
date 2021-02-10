package tasks;
import static userinterface.OrangePaginaInicialUserInterface.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

@AllArgsConstructor
@Getter
public class Filtrar implements Task {

  private  String filtro;

  public static Filtrar usuario(String filtro) {
    return Tasks.instrumented(Filtrar.class, filtro);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(LBL_FILTRO),
        Click.on(LBL_USERNAME),
        Enter.theValue(filtro).into(LBL_USERNAME).thenHit(Keys.TAB),
        Click.on(BTN_BUSCAR));
    actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
  }
}
