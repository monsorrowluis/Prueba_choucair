Feature: Login
  Scenario Outline: Login exitoso
    Given Abro el navegador
    When Doy click en el boton login
    And Confirmo que estoy en la pagina de login
    Then Me logueo con mi usuario: "<usuario>" y clave: "<clave>"

    #Then ME logueo de forma exitosa
    Examples:
      | usuario | clave |
      |Lucho |12345|