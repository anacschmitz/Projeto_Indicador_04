#language: pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

  @validar_dados_usuario
  Esquema do Cenário: Validar dados
    Quando o usuário preencher o <campo> com o <elemento> e clicar no botão <cadastrar>
    Então o <elemento> deverá aparecer no forumulário final
    Exemplos:
      | campo                                  | elemento                                                                           |
      | Nome, Sobrenome, Sexo                  | Ana Carolina, Schmitz da Silva, Feminino                                           |
      | Nome, Sobrenome, Sexo, Comida Favorita | Ana Carolina, Schmitz da Silva, Feminino, Vegetariano                              |
      | Nome, Sobrenome, Sexo, Escolaridade    | Ana Carolina, Schmitz da Silva, Feminino, Superior                                 |
      | Nome, Sobrenome, Sexo, Esporte         | Ana Carolina, Schmitz da Silva, Feminino, Futebol                                  |
      | Nome, Sobrenome, Sexo, Sugestões       | Ana Carolina, Schmitz da Silva, Feminino, Inserir musculação como opção de esporte |

