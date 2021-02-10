package tasks;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.Crear.CODIGO_USUARIO;
import static userinterface.OrangeInicioSesionUserInterface.BTN_INICIAR_SESION;
import static userinterface.OrangeInicioSesionUserInterface.TXT_CONTRASENIA;
import static userinterface.OrangeInicioSesionUserInterface.TXT_USUARIO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.Usuarios;

@AllArgsConstructor
@Getter
public class IniciarSesionUsuarioRegistrado implements Task {

  private String nombreUsuario;

  public static IniciarSesionUsuarioRegistrado enOrange(String nombreUsuario) {
    return Tasks.instrumented(IniciarSesionUsuarioRegistrado.class, nombreUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(TXT_USUARIO),
        Enter.theValue(Usuarios.valueOf(nombreUsuario).getUsuario()
            .concat(theActorInTheSpotlight().recall(CODIGO_USUARIO))).into(TXT_USUARIO),
        Click.on(TXT_CONTRASENIA),
        Enter.theValue(Usuarios.valueOf(nombreUsuario).getClave()).into(TXT_CONTRASENIA),
        Click.on(BTN_INICIAR_SESION));
  }
}
