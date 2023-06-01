package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utilitaria.Componentes;

public class AcessarSiteStep {
    Componentes componentes = new Componentes();

    @Dado("que o usuário instanciou o chrome-driver")
    public void que_o_usuário_instanciou_o_chrome_driver() {
        componentes.inicializar();
    }

    @Dado("que o usuário digitou o endereço do Google no navegador")
    public void que_o_usuário_digitou_o_endereço_do_Google_no_navegador() {
        componentes.acessarGoogle();
    }

    @Dado("que o usuário digitou Softplan")
    public void que_o_usuário_digitou_Softplan() {
        componentes.pesquisarNoGoogle();
    }

    @Quando("clicar em Enter")
    public void clicar_em_Enter() {
        componentes.clicarEnter();
    }

    @Então("deve aparecer a lista de pesquisa com o site da empresa Softplan")
    public void deve_aparecer_a_lista_de_pesquisa_com_o_site_da_empresa_Softplan() {
        componentes.resultadoPesquisa();
    }

    @Então("quando o usuário clicar no site da empresa Softplan")
    public void quando_o_usuário_clicar_no_site_da_empresa_Softplan() {
        componentes.clicarResultado();
    }

    @Então("o usuário for direcionado para o site da empresa Softplan")
    public void o_usuário_for_direcionado_para_o_site_da_empresa_Softplan() {
        componentes.validaResultado();
    }

    @Então("o site exibito deve conrresponder ao site da empresa Softplan")
    public void o_site_exibito_deve_conrresponder_ao_site_da_empresa_Softplan() {
        componentes.conferirSite();
    }


}
