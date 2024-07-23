#Language: pt

@EfetuarCompra
Feature: Efetuar compra

  @EfetuarLogin
  Scenario Outline: Efetuar login com uma conta ja existente com informacoes validas
    Given que o usuario tenha acessado o site da riachuelo atraves da "<url>"
    When  o usuario clicar no icone Entre ou cadastre-se
    Then  o sistema apresenta um poup-up com os botoes entrar e criar conta
    When o usuario clicar no botão entrar
    Then  o sistema apresenta uma nova tela com os campos CPF e senha
    When o usuario selecionar o arquivo de massa "efetuarlogin"
    And inserir as informacoes <cenario>
    Then o sistema valida as informacoes
    And direciona o usuario para a pagina home

    Examples:
      | url                  | cenario        |
      | www.riachuelo.com.br | USUARIO_VALIDO |
