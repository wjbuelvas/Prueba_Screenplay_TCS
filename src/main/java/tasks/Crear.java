package tasks;

import static userinterface.OrangePaginaInicialUserInterface.BTN_SAVE;
import static userinterface.OrangePaginaInicialUserInterface.LBL_ADD;
import static userinterface.OrangePaginaInicialUserInterface.LBL_ADMIN;
import static userinterface.OrangePaginaInicialUserInterface.LBL_PRIMER_USUARIO;
import static userinterface.OrangePaginaInicialUserInterface.LBL_USERS;
import static userinterface.OrangePaginaInicialUserInterface.LBL_USERS_MANAGMENT;
import static userinterface.OrangePaginaInicialUserInterface.TXT_CONFIRM_PASSWORD;
import static userinterface.OrangePaginaInicialUserInterface.TXT_EMPLOYEE_VALUE;
import static userinterface.OrangePaginaInicialUserInterface.TXT_PASSWORD;
import static userinterface.OrangePaginaInicialUserInterface.TXT_USER_NAME;

import java.util.Random;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

@AllArgsConstructor
public class Crear implements Task {

  private final String nombreEmpleado;
  private final String nombreUsuario;
  private final String contrasenia;
  private final String confirmacionContrasenia;
  public static final String CODIGO_USUARIO = null;

  public static Crear usuario(String nombreUsuario) {
    return Tasks.instrumented(Crear.class, nombreUsuario);
  }

  public static Crear usuarios(String nombreEmpleado, String nombreUsuario, String contrasenia,
      String confirmacionContrasenia) {
    return Tasks.instrumented(Crear.class, nombreEmpleado, nombreUsuario, contrasenia,
        confirmacionContrasenia);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String codigoUsuario = String.valueOf(new Random().nextInt(99999));
    actor.remember(CODIGO_USUARIO, codigoUsuario);
    actor.attemptsTo(Click.on(LBL_ADMIN),
        Click.on(LBL_USERS_MANAGMENT),
        Click.on(LBL_USERS));
    LBL_PRIMER_USUARIO.resolveFor(actor).waitUntilVisible();
    actor.attemptsTo(Click.on(LBL_ADD),
        Click.on(TXT_EMPLOYEE_VALUE),
        Enter.theValue(nombreEmpleado).into(TXT_EMPLOYEE_VALUE).thenHit(Keys.TAB),
        Enter.theValue(nombreUsuario + codigoUsuario).into(TXT_USER_NAME),
        Click.on(TXT_PASSWORD),
        Enter.theValue(contrasenia).into(TXT_PASSWORD).thenHit(Keys.TAB),
        Click.on(TXT_CONFIRM_PASSWORD),
        Enter.theValue(confirmacionContrasenia).into(TXT_CONFIRM_PASSWORD).thenHit(Keys.TAB),
        Click.on(BTN_SAVE));
    actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
  }
}
