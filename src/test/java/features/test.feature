Feature: Categoria Comics
  como usuario quiero leer chistes de tester para reirme y pasar un buen rato.

  Scenario: Ingresar a la categoria comics desde la pantalla Home

    Given El usuario se encuentra en la pagina Home
    When Hace click sobre el botón the little tester comics
    Then Nos debe redirigir a la pantalla comics