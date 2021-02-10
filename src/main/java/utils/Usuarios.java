package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Usuarios {

    WILSON("Admin", "admin123"),
    CARLOS("AdminD", "admin123A"),
    WBUELVAS("wbuelvas", "12345678");

    private final String usuario;
    private final String clave;
}
