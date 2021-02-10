package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeInicioSesionUserInterface {

    public static final Target TXT_USUARIO = Target.the("Ingresar Nombre Usuario").located(By.id("txtUsername"));
    public static final Target TXT_CONTRASENIA = Target.the("Ingresar Contraseña Usuario").located(By.id("txtPassword"));
    public static final Target BTN_INICIAR_SESION = Target.the("Boton Iniciar Sesion").located(By.id("btnLogin"));
    public static final Target TXT_MENSAJE_ERROR = Target.the("Mensaje de error").located(By.xpath("//*[@id=\"toast-container\"]/div/div"));

}
