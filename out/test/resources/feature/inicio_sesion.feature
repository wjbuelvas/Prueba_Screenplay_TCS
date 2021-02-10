#language: es
#wbuelvas@qvision.us

Característica:  Yo como usuario de Orange HRM
  deseo realizar el login en la
  para agregar, filtrar y actualizar usuarios

  Antecedentes: Abrir url específica
    Dado que el actor desea abrir la pagina de 'Orange'

  Escenario: Iniciar sesion en la pagina de Orange con usuario registardo
    Cuando wilson inicia sesion en la pagina de Orange
    Entonces puede visualizar el modulo de bienvenida

  Escenario: Iniciar sesion en la pagina de Orange con usuario no registardo
    Cuando carlos intenta iniciar sesion en la pagina de Orange con datos incorrectos
    Entonces No puede iniciar sesión y muestra el siguiente mensaje 'Invalid Credentials'