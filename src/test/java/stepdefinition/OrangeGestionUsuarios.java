package stepdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static tasks.Crear.CODIGO_USUARIO;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.ComprobarUsuario;
import tasks.Actualizar;
import tasks.Crear;
import tasks.Filtrar;

public class OrangeGestionUsuarios {

  @Cuando("agrega un usuario {string}")
  public void crearUsuarioe(String nombreUsuario) {
    theActorInTheSpotlight().attemptsTo(Crear.usuario(nombreUsuario));
  }

  @Cuando("realizo el filtro del usuario {word} previamente creado")
  public void filtrarUsuario(String nombreUsuario) {
    theActorInTheSpotlight().attemptsTo(
        Filtrar.usuario(nombreUsuario.concat(theActorInTheSpotlight().recall(CODIGO_USUARIO))));
  }

  @Cuando("agrego el rol de {word} al usuario previamente registrado")
  public void editarUsuario(String rol) {
    theActorInTheSpotlight().attemptsTo(Actualizar.usuario(rol));
  }


  @Cuando("agrega un usuario con nombre empleado {string}, nombre de usuario {word}, contrasenia {word} y confirmacion Contrasenia {word}")
  public void crearUsuario(String nombreEmpleado, String nombreUsuario, String contrasenia,
      String confirmacionContrasenia) {
    theActorInTheSpotlight().attemptsTo(
        Crear.usuarios(nombreEmpleado, nombreUsuario, contrasenia, confirmacionContrasenia));
  }

  @Cuando("agrega un usuario con {string}, {word}, {word} y {word}")
  public void crearUsuarios(String nombreEmpleado, String nombreUsuario, String contrasenia,
      String confirmacionContrasenia) {
    theActorInTheSpotlight().attemptsTo(
        Crear.usuarios(nombreEmpleado, nombreUsuario, contrasenia, confirmacionContrasenia));
  }

  @Entonces("el usuario {string} es registrado/encontrado exitosamente")
  public void validarUsuarioCreado(String nombreUsuario) {
    theActorInTheSpotlight().should(seeThat(ComprobarUsuario.creado(), equalToIgnoringCase(
        nombreUsuario.concat(theActorInTheSpotlight().recall(CODIGO_USUARIO)))));
  }
}
