package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConfigurarInicial {

    @Before
    public void configurarActor() {
        setTheStage(new OnlineCast());
        theActorCalled("Wilson");
    }

    @Dado("que el actor desea abrir la pagina de {string}")
    public void abrirUrl(String nombrePagina){
        theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina.toUpperCase()));
    }

}
