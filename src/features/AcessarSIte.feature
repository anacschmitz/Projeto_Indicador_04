#language: pt

Funcionalidade: Acessar Google e pesquisar empresa

  Contexto:
  Dado que o usuário instanciou o chrome-driver

  @Acessar_Google_e_pesquisar
  Cenário: Acessar Google
  Dado que o usuário digitou o endereço do Google no navegador
  E que o usuário digitou Softplan
  Quando clicar em Enter
  Então deve aparecer a lista de pesquisa com o site da empresa Softplan
    E quando o usuário clicar no site da empresa Softplan
    E o usuário for direcionado para o site da empresa Softplan
    Então o site exibito deve conrresponder ao site da empresa Softplan
