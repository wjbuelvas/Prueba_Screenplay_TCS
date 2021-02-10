#language: es
#wbuelvas@qvision.us

Característica:  Yo como usuario de Orange HRM
  deseo realizar la gestión de usuarios
  para agregar, filtrar y actualizar usuarios

  Antecedentes: Abrir url específica
    Dado que el actor desea abrir la pagina de 'Orange'

  Escenario: Realizar el registro de un usuario en Orange HRM xxx
    Cuando wilson inicia sesion en la pagina de Orange
    Y agrega un usuario con nombre empleado 'Fiona Grace', nombre de usuario Wbuelvas, contrasenia 12345678 y confirmacion Contrasenia 12345678
    Entonces el usuario 'wbuelvas' es registrado exitosamente

  Escenario: Realizar busqueda de un usuario registardo en Orange HRM
    Cuando wilson inicia sesion en la pagina de Orange
    Y agrega un usuario con nombre empleado 'Fiona Grace', nombre de usuario Wbuelvas, contrasenia 12345678 y confirmacion Contrasenia 12345678
    Y realizo el filtro del usuario wbuelvas previamente creado
    Entonces el usuario 'wbuelvas' es encontrado exitosamente

  Escenario: Realizar el inicio de sesión con un usuario registardo previamente en Orange HRM
    Cuando wilson inicia sesion en la pagina de Orange
    Y agrega un usuario con nombre empleado 'Fiona Grace', nombre de usuario Wbuelvas, contrasenia 12345678 y confirmacion Contrasenia 12345678
    Y el usuario agregado wbuelvas inicia sesion en la pagina de Orange HRM
    Entonces puede visualizar el modulo de bienvenida

  Escenario: Agregar Rol a usuario registardo en Orange HRM
    Cuando wilson inicia sesion en la pagina de Orange
    Y agrega un usuario con nombre empleado 'Fiona Grace', nombre de usuario Wbuelvas, contrasenia 12345678 y confirmacion Contrasenia 12345678
    Y realizo el filtro del usuario wbuelvas previamente creado
    Y agrego el rol de main al usuario previamente registrado
   # Entonces el usuario 'wbuelvas' es encontrado exitosamente


