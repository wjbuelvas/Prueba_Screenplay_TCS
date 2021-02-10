package stepdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.hamcrest.Matchers;
import questions.ComprobarInicioSesion;
import questions.ComprobarMensajeError;
import tasks.CerrarSesion;
import tasks.IniciarSesion;
import tasks.IniciarSesionUsuarioRegistrado;


public class OrangeInicioSesion {

  @Cuando("{word} inicia sesion en la pagina de Orange")
  public void iniciarSesionOrange(String nombreUsuario) {
    theActorInTheSpotlight().attemptsTo(IniciarSesion.enOrange(nombreUsuario.toUpperCase()));
  }

  @Cuando("{word} intenta iniciar sesion en la pagina de Orange con datos incorrectos")
  public void iniciarSesionIncorrectoOrange(String nombreUsuario) {
    theActorInTheSpotlight().attemptsTo(IniciarSesion.enOrange(nombreUsuario.toUpperCase()));
  }

  @Cuando("el usuario agregado {word} inicia sesion en la pagina de Orange HRM")
  public void iniciarSesionUsarioRegistradoOrange(String nombreUsuario) {
    theActorInTheSpotlight().attemptsTo(CerrarSesion.enOrange(nombreUsuario.toUpperCase()));
    theActorInTheSpotlight().attemptsTo(IniciarSesionUsuarioRegistrado.enOrange(nombreUsuario.toUpperCase()));
  }

  @Entonces("puede visualizar el modulo de bienvenida")
  public void validarInicioSesion() {
    theActorInTheSpotlight().should(seeThat(ComprobarInicioSesion.enOrange()));
  }

  @Entonces("No puede iniciar sesión y muestra el siguiente mensaje {string}")
  public void validarInicioSesionIncorrecto(String mensajeError) {
    theActorInTheSpotlight()
        .should(seeThat(ComprobarMensajeError.enOrange(), Matchers.containsString(mensajeError)));
  }

}
