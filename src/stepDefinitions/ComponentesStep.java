package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utilitaria.Componentes;

public class ComponentesStep {
    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializarHtml();
    }


    @Quando("o usuário preencher o Nome, Sobrenome, Sexo com o Ana Carolina, Schmitz da Silva, Feminino e clicar no botão <cadastrar>")
    public void o_usuário_preencher_o_Nome_Sobrenome_Sexo_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_e_clicar_no_botão_cadastrar() {
        componentes.testarCampoNome();
        componentes.validarCampoNome();

        componentes.testarCampoSobrenome();
        componentes.validarCampoSobrenome();

        componentes.testarGenero();
        componentes.validarGenero();

        componentes.testarBotaoCadastrar();
    }

    @Então("o Ana Carolina, Schmitz da Silva, Feminino deverá aparecer no forumulário final")
    public void o_Ana_Carolina_Schmitz_da_Silva_Feminino_deverá_aparecer_no_forumulário_final() {
        componentes.testarDadosObrigatorios();
    }

    @Quando("o usuário preencher o Nome, Sobrenome, Sexo, Comida Favorita com o Ana Carolina, Schmitz da Silva, Feminino, Vegetariano e clicar no botão <cadastrar>")
    public void o_usuário_preencher_o_Nome_Sobrenome_Sexo_Comida_Favorita_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_Vegetariano_e_clicar_no_botão_cadastrar() {
        o_usuário_preencher_o_Nome_Sobrenome_Sexo_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_e_clicar_no_botão_cadastrar();
        componentes.testarComidaFavorita();
        componentes.validarComidaFavorita();

        componentes.testarBotaoCadastrar();
    }
    @Então("o Ana Carolina, Schmitz da Silva, Feminino, Vegetariano deverá aparecer no forumulário final")
    public void o_Ana_Carolina_Schmitz_da_Silva_Feminino_Vegetariano_deverá_aparecer_no_forumulário_final() {
        o_Ana_Carolina_Schmitz_da_Silva_Feminino_deverá_aparecer_no_forumulário_final();
        componentes.validarCadastroComida();
    }

    @Quando("o usuário preencher o Nome, Sobrenome, Sexo, Escolaridade com o Ana Carolina, Schmitz da Silva, Feminino, Superior e clicar no botão <cadastrar>")
    public void o_usuário_preencher_o_Nome_Sobrenome_Sexo_Escolaridade_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_Superior_e_clicar_no_botão_cadastrar() {
        o_usuário_preencher_o_Nome_Sobrenome_Sexo_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_e_clicar_no_botão_cadastrar();
        componentes.testarEscolaridade();
        componentes.testarBotaoCadastrar();
    }
    @Então("o Ana Carolina, Schmitz da Silva, Feminino, Superior deverá aparecer no forumulário final")
    public void o_Ana_Carolina_Schmitz_da_Silva_Feminino_Superior_deverá_aparecer_no_forumulário_final(){
        o_Ana_Carolina_Schmitz_da_Silva_Feminino_deverá_aparecer_no_forumulário_final();
        componentes.validarCadastroEscolaridade();
    }

    @Quando("o usuário preencher o Nome, Sobrenome, Sexo, Esporte com o Ana Carolina, Schmitz da Silva, Feminino, Futebol e clicar no botão <cadastrar>")
    public void o_usuário_preencher_o_Nome_Sobrenome_Sexo_Esporte_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_Futebol_e_clicar_no_botão_cadastrar() {
        o_usuário_preencher_o_Nome_Sobrenome_Sexo_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_e_clicar_no_botão_cadastrar();
        componentes.testarEsporte();
        componentes.testarBotaoCadastrar();
    }
    @Então("o Ana Carolina, Schmitz da Silva, Feminino, Futebol deverá aparecer no forumulário final")
    public void o_Ana_Carolina_Schmitz_da_Silva_Feminino_Futebol_deverá_aparecer_no_forumulário_final(){
        o_Ana_Carolina_Schmitz_da_Silva_Feminino_deverá_aparecer_no_forumulário_final();
        componentes.validarCadastroEsportes();
    }

    @Quando("o usuário preencher o Nome, Sobrenome, Sexo, Sugestões com o Ana Carolina, Schmitz da Silva, Feminino, Inserir musculação como opção de esporte e clicar no botão <cadastrar>")
    public void o_usuário_preencher_o_Nome_Sobrenome_Sexo_Sugestões_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_Inserir_musculação_como_opção_de_esporte_e_clicar_no_botão_cadastrar() {
        o_usuário_preencher_o_Nome_Sobrenome_Sexo_com_o_Ana_Carolina_Schmitz_da_Silva_Feminino_e_clicar_no_botão_cadastrar();
        componentes.testarSugestao();
        componentes.validarSugestao();
        componentes.testarBotaoCadastrar();
    }
    @Então("o Ana Carolina, Schmitz da Silva, Feminino, Inserir musculação como opção de esporte deverá aparecer no forumulário final")
    public void o_Ana_Carolina_Schmitz_da_Silva_Feminino_Inserir_musculação_como_opção_de_esporte_deverá_aparecer_no_forumulário_final() {
        o_Ana_Carolina_Schmitz_da_Silva_Feminino_deverá_aparecer_no_forumulário_final();
        componentes.validarCadastroSugestoes();
    }

}
